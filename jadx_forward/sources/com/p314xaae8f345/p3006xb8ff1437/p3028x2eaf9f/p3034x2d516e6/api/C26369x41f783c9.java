package com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api;

/* renamed from: com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadParam */
/* loaded from: classes16.dex */
public class C26369x41f783c9 {

    /* renamed from: FILE_NAME */
    private static final java.lang.String f52725x59634b6e = "TPDownloadParam";

    /* renamed from: dlType */
    private int f52726xb0be8be2;

    /* renamed from: urlList */
    private java.util.ArrayList<java.lang.String> f52728xf5d79aad = new java.util.ArrayList<>();

    /* renamed from: extInfoMap */
    private java.util.Map<java.lang.String, java.lang.Object> f52727xca42f86d = new java.util.HashMap();

    public C26369x41f783c9(java.util.ArrayList<java.lang.String> arrayList, int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f52726xb0be8be2 = i17;
        m102327xa71623eb(arrayList);
        m102326xe6a7fe6f(map);
    }

    /* renamed from: getExtraFormatNodesJsonInfo */
    private java.lang.String m102306x414b1416(java.util.ArrayList<java.util.Map<java.lang.String, java.lang.Object>> arrayList) {
        if (arrayList == null) {
            return "[]";
        }
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("[");
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                java.util.Map<java.lang.String, java.lang.Object> map = arrayList.get(i17);
                if (i17 == arrayList.size() - 1) {
                    stringBuffer.append(java.lang.String.format("{\"dl_param_name\":\"%s\", \"dl_param_bitrate\":%s}", map.get("dl_param_name"), map.get("dl_param_bitrate")));
                } else {
                    stringBuffer.append(java.lang.String.format("{\"dl_param_name\":\"%s\", \"dl_param_bitrate\":%s}, ", map.get("dl_param_name"), map.get("dl_param_bitrate")));
                }
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52725x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getExtraJsonInfo failed, error:" + th6.toString());
            return "[]";
        }
    }

    /* renamed from: getUrlHostNodesJsonInfo */
    private java.lang.String m102307xf761d586(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList == null) {
            return "[]";
        }
        try {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append("[");
            for (int i17 = 0; i17 < arrayList.size(); i17++) {
                java.lang.String str = arrayList.get(i17);
                if (i17 == arrayList.size() - 1) {
                    stringBuffer.append(java.lang.String.format("\"%s\"", str));
                } else {
                    stringBuffer.append(java.lang.String.format("\"%s\", ", str));
                }
            }
            stringBuffer.append("]");
            return stringBuffer.toString();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52725x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getArrayListStr failed, error:" + th6.toString());
            return "[]";
        }
    }

    /* renamed from: getCdnUrls */
    public java.lang.String m102308x63b13a7b() {
        if (this.f52728xf5d79aad == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        boolean booleanValue = (map == null || !map.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52759x378eb97b)) ? false : ((java.lang.Boolean) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52759x378eb97b)).booleanValue();
        for (int i17 = 0; i17 < this.f52728xf5d79aad.size(); i17++) {
            stringBuffer.append(this.f52728xf5d79aad.get(i17));
            if (booleanValue) {
                if (this.f52728xf5d79aad.get(i17).indexOf("?") > 0) {
                    stringBuffer.append("&cost=low");
                } else {
                    stringBuffer.append("?cost=low");
                }
            }
            stringBuffer.append(";");
        }
        if (stringBuffer.length() > 0) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: getClipCount */
    public int m102309x9e54c0e9() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        if (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52783x868d3dd1)) {
            return 1;
        }
        return ((java.lang.Integer) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52783x868d3dd1)).intValue();
    }

    /* renamed from: getClipNo */
    public int m102310x142a3c27() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        if (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52784x1a93201f)) {
            return 1;
        }
        return ((java.lang.Integer) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52784x1a93201f)).intValue();
    }

    /* renamed from: getDlType */
    public int m102311x15d5aed8() {
        return this.f52726xb0be8be2;
    }

    /* renamed from: getExtInfo */
    public java.lang.Object m102312xefeda639(java.lang.String str) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    /* renamed from: getExtInfoMap */
    public java.util.Map<java.lang.String, java.lang.Object> m102313xb883b063() {
        return this.f52727xca42f86d;
    }

    /* renamed from: getExtraJsonInfo */
    public java.lang.String m102314x6eb8b630() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        if (map != null && !map.isEmpty()) {
            try {
                java.util.HashMap hashMap = new java.util.HashMap();
                for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.f52727xca42f86d.entrySet()) {
                    if (!entry.getKey().equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52771x7441748) && !entry.getKey().equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52776xb59e15b2) && !entry.getKey().equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52785xa65cc3e4) && !entry.getKey().equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52759x378eb97b)) {
                        hashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return new org.json.JSONObject(hashMap).toString();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.p3039x6a710b1.C26381xbeb6a61a.e(f52725x59634b6e, 0, com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.InterfaceC26358x35916b7.f52704x6397a326, "getExtraJsonInfo failed, error:" + th6.toString());
            }
        }
        return "";
    }

    /* renamed from: getFormat */
    public java.lang.String m102315x19771aed() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        return (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52754x658c5437)) ? "" : (java.lang.String) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52754x658c5437);
    }

    /* renamed from: getKeyid */
    public java.lang.String m102316x74b13604() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        return (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52788xb6eede69)) ? "" : (java.lang.String) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52788xb6eede69);
    }

    /* renamed from: getOfflinePlayExtraInfo */
    public java.util.Map<java.lang.String, java.lang.String> m102317xb7d69b5d() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        if (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52776xb59e15b2)) {
            return null;
        }
        return (java.util.Map) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52776xb59e15b2);
    }

    /* renamed from: getPlayDefinition */
    public java.lang.String m102318xe3a9f89d() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        return (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52785xa65cc3e4)) ? "" : (java.lang.String) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52785xa65cc3e4);
    }

    /* renamed from: getSavaPath */
    public java.lang.String m102319x1672b4() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        return (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52794x4f3ececd)) ? "" : (java.lang.String) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52794x4f3ececd);
    }

    /* renamed from: getTotalDurationMS */
    public long m102320x195b8668() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        if (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52764x7230f71d)) {
            return 0L;
        }
        return ((java.lang.Long) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52764x7230f71d)).longValue();
    }

    /* renamed from: getUrlList */
    public java.util.ArrayList<java.lang.String> m102321x33a4d677() {
        return this.f52728xf5d79aad;
    }

    /* renamed from: getVid */
    public java.lang.String m102322xb58878db() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        return (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52800x2d2fad97)) ? "" : (java.lang.String) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52800x2d2fad97);
    }

    /* renamed from: isAdaptive */
    public boolean m102323x82df7dc0() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        return map != null && !map.isEmpty() && this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52746x85511d89) && ((java.lang.Integer) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52746x85511d89)).intValue() > 0;
    }

    /* renamed from: isOffline */
    public boolean m102324x81235559() {
        java.util.Map<java.lang.String, java.lang.Object> map = this.f52727xca42f86d;
        if (map == null || map.isEmpty() || !this.f52727xca42f86d.containsKey(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52771x7441748)) {
            return false;
        }
        return ((java.lang.Boolean) this.f52727xca42f86d.get(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3034x2d516e6.api.C26371x1ed959cb.f52771x7441748)).booleanValue();
    }

    /* renamed from: setDlType */
    public void m102325x90ae2e4(int i17) {
        this.f52726xb0be8be2 = i17;
    }

    /* renamed from: setExtInfoMap */
    public void m102326xe6a7fe6f(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map != null) {
            this.f52727xca42f86d = map;
        } else {
            this.f52727xca42f86d.clear();
        }
    }

    /* renamed from: setUrlList */
    public void m102327xa71623eb(java.util.ArrayList<java.lang.String> arrayList) {
        if (arrayList != null) {
            this.f52728xf5d79aad = arrayList;
        } else {
            this.f52728xf5d79aad.clear();
        }
    }
}
