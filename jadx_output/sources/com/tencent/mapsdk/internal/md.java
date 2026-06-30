package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class md implements com.tencent.map.tools.net.processor.RequestProcessor, com.tencent.map.tools.net.processor.ResponseProcessor {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f50412b = "NetFlow";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f50413c = false;

    /* renamed from: a, reason: collision with root package name */
    protected com.tencent.mapsdk.shell.events.NetFlowEventModel f50414a;

    /* renamed from: d, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.String> f50415d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f50416e;

    public md() {
        this.f50415d = new java.util.HashMap<>();
        this.f50416e = false;
    }

    private boolean a(java.lang.String str) {
        android.net.Uri parse;
        java.lang.String scheme;
        if (android.text.TextUtils.isEmpty(str) || (parse = android.net.Uri.parse(str)) == null || (scheme = parse.getScheme()) == null || !scheme.startsWith("http")) {
            return false;
        }
        java.lang.String str2 = parse.getHost() + parse.getPath();
        if (!this.f50415d.containsKey(str2)) {
            java.util.Iterator<java.lang.String> it = this.f50415d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String next = it.next();
                if (str2.contains(next)) {
                    this.f50414a.bizType = this.f50415d.get(next);
                    this.f50416e = true;
                    break;
                }
            }
        } else {
            this.f50414a.bizType = this.f50415d.get(str2);
            this.f50416e = true;
        }
        return this.f50416e;
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public void onRequest(com.tencent.map.tools.net.NetRequest netRequest) {
        android.net.Uri parse;
        java.lang.String scheme;
        com.tencent.mapsdk.shell.events.NetFlowEventModel netFlowEventModel = new com.tencent.mapsdk.shell.events.NetFlowEventModel();
        this.f50414a = netFlowEventModel;
        netFlowEventModel.url = netRequest.url;
        netFlowEventModel.uploadFlow = r1.getBytes().length;
        if (netRequest.postData != null) {
            this.f50414a.uploadFlow += r0.length;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : netRequest.mapHeaders.entrySet()) {
            this.f50414a.uploadFlow += entry.getKey().getBytes().length + entry.getValue().getBytes().length;
        }
        com.tencent.mapsdk.shell.events.NetFlowEventModel netFlowEventModel2 = this.f50414a;
        netFlowEventModel2.uploadFlow = netFlowEventModel2.uploadFlow / 1000.0d;
        netFlowEventModel2.uploadFlow = java.lang.Math.round(r1 * 1000.0d) / 1000.0d;
        this.f50414a.uploadTime = java.lang.System.currentTimeMillis();
        java.lang.String str = netRequest.url;
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str) && (parse = android.net.Uri.parse(str)) != null && (scheme = parse.getScheme()) != null && scheme.startsWith("http")) {
            java.lang.String str2 = parse.getHost() + parse.getPath();
            if (!this.f50415d.containsKey(str2)) {
                java.util.Iterator<java.lang.String> it = this.f50415d.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String next = it.next();
                    if (str2.contains(next)) {
                        this.f50414a.bizType = this.f50415d.get(next);
                        this.f50416e = true;
                        break;
                    }
                }
            } else {
                this.f50414a.bizType = this.f50415d.get(str2);
                this.f50416e = true;
            }
            z17 = this.f50416e;
        }
        if (z17) {
            return;
        }
        this.f50414a.bizType = "";
    }

    public void onResponse(com.tencent.map.tools.net.NetResponse netResponse) {
        if (netResponse.available()) {
            com.tencent.mapsdk.shell.events.NetFlowEventModel netFlowEventModel = this.f50414a;
            netFlowEventModel.errorCode = netResponse.statusCode;
            if (netResponse.errorCode != 0) {
                if (netResponse.errorData != null) {
                    netFlowEventModel.downloadFlow = r6.length;
                } else {
                    netFlowEventModel.downloadFlow = -1.0d;
                }
            } else {
                if (netResponse.data != null) {
                    netFlowEventModel.downloadFlow = r6.length;
                } else {
                    netFlowEventModel.downloadFlow = -1.0d;
                }
            }
            netFlowEventModel.downloadFlow = netFlowEventModel.downloadFlow / 1000.0d;
            netFlowEventModel.downloadFlow = java.lang.Math.round(r1 * 1000.0d) / 1000.0d;
        } else {
            this.f50414a.errorCode = -100;
        }
        this.f50414a.downloadTime = java.lang.System.currentTimeMillis();
    }

    public md(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        this.f50415d = hashMap2;
        this.f50416e = false;
        hashMap2.putAll(hashMap);
    }
}
