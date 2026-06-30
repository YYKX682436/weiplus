package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class md implements com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3, com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4350x369ad131 {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f131945b = "NetFlow";

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f131946c = false;

    /* renamed from: a, reason: collision with root package name */
    protected com.p314xaae8f345.p519xbf8bc95e.p539x6855e30.p540xb307e119.C4428xe87a035a f131947a;

    /* renamed from: d, reason: collision with root package name */
    private java.util.HashMap<java.lang.String, java.lang.String> f131948d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f131949e;

    public md() {
        this.f131948d = new java.util.HashMap<>();
        this.f131949e = false;
    }

    private boolean a(java.lang.String str) {
        android.net.Uri parse;
        java.lang.String scheme;
        if (android.text.TextUtils.isEmpty(str) || (parse = android.net.Uri.parse(str)) == null || (scheme = parse.getScheme()) == null || !scheme.startsWith("http")) {
            return false;
        }
        java.lang.String str2 = parse.getHost() + parse.getPath();
        if (!this.f131948d.containsKey(str2)) {
            java.util.Iterator<java.lang.String> it = this.f131948d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String next = it.next();
                if (str2.contains(next)) {
                    this.f131947a.f17544xfa2ebeed = this.f131948d.get(next);
                    this.f131949e = true;
                    break;
                }
            }
        } else {
            this.f131947a.f17544xfa2ebeed = this.f131948d.get(str2);
            this.f131949e = true;
        }
        return this.f131949e;
    }

    @Override // com.p314xaae8f345.map.p511x696c9db.net.p517xbebf4c92.InterfaceC4349x3c5d2ee3
    /* renamed from: onRequest */
    public void mo36059x90f4f3b0(com.p314xaae8f345.map.p511x696c9db.net.C4329xa3f02252 c4329xa3f02252) {
        android.net.Uri parse;
        java.lang.String scheme;
        com.p314xaae8f345.p519xbf8bc95e.p539x6855e30.p540xb307e119.C4428xe87a035a c4428xe87a035a = new com.p314xaae8f345.p519xbf8bc95e.p539x6855e30.p540xb307e119.C4428xe87a035a();
        this.f131947a = c4428xe87a035a;
        c4428xe87a035a.url = c4329xa3f02252.url;
        c4428xe87a035a.f17549xf17c9acf = r1.getBytes().length;
        if (c4329xa3f02252.f16967x2d17ac6a != null) {
            this.f131947a.f17549xf17c9acf += r0.length;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : c4329xa3f02252.f16966x3656e28a.entrySet()) {
            this.f131947a.f17549xf17c9acf += entry.getKey().getBytes().length + entry.getValue().getBytes().length;
        }
        com.p314xaae8f345.p519xbf8bc95e.p539x6855e30.p540xb307e119.C4428xe87a035a c4428xe87a035a2 = this.f131947a;
        c4428xe87a035a2.f17549xf17c9acf = c4428xe87a035a2.f17549xf17c9acf / 1000.0d;
        c4428xe87a035a2.f17549xf17c9acf = java.lang.Math.round(r1 * 1000.0d) / 1000.0d;
        this.f131947a.f17550xf182ec6e = java.lang.System.currentTimeMillis();
        java.lang.String str = c4329xa3f02252.url;
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str) && (parse = android.net.Uri.parse(str)) != null && (scheme = parse.getScheme()) != null && scheme.startsWith("http")) {
            java.lang.String str2 = parse.getHost() + parse.getPath();
            if (!this.f131948d.containsKey(str2)) {
                java.util.Iterator<java.lang.String> it = this.f131948d.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String next = it.next();
                    if (str2.contains(next)) {
                        this.f131947a.f17544xfa2ebeed = this.f131948d.get(next);
                        this.f131949e = true;
                        break;
                    }
                }
            } else {
                this.f131947a.f17544xfa2ebeed = this.f131948d.get(str2);
                this.f131949e = true;
            }
            z17 = this.f131949e;
        }
        if (z17) {
            return;
        }
        this.f131947a.f17544xfa2ebeed = "";
    }

    /* renamed from: onResponse */
    public void mo36060x90d13740(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        if (c4330xdd3bdcde.mo36017xd4418ac9()) {
            com.p314xaae8f345.p519xbf8bc95e.p539x6855e30.p540xb307e119.C4428xe87a035a c4428xe87a035a = this.f131947a;
            c4428xe87a035a.f17547x139cb015 = c4330xdd3bdcde.f16986xec0a8ff;
            if (c4330xdd3bdcde.f16979x139cb015 != 0) {
                if (c4330xdd3bdcde.f16980x139cf1d2 != null) {
                    c4428xe87a035a.f17545x4214b9d6 = r6.length;
                } else {
                    c4428xe87a035a.f17545x4214b9d6 = -1.0d;
                }
            } else {
                if (c4330xdd3bdcde.f16977x2eefaa != null) {
                    c4428xe87a035a.f17545x4214b9d6 = r6.length;
                } else {
                    c4428xe87a035a.f17545x4214b9d6 = -1.0d;
                }
            }
            c4428xe87a035a.f17545x4214b9d6 = c4428xe87a035a.f17545x4214b9d6 / 1000.0d;
            c4428xe87a035a.f17545x4214b9d6 = java.lang.Math.round(r1 * 1000.0d) / 1000.0d;
        } else {
            this.f131947a.f17547x139cb015 = -100;
        }
        this.f131947a.f17546x421b0b75 = java.lang.System.currentTimeMillis();
    }

    public md(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        java.util.HashMap<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        this.f131948d = hashMap2;
        this.f131949e = false;
        hashMap2.putAll(hashMap);
    }
}
