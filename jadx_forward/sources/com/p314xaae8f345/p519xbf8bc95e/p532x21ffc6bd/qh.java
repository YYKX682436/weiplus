package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class qh {

    /* renamed from: d, reason: collision with root package name */
    private static final int f132463d = 256;

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f132464e = "custom-layer";

    /* renamed from: f, reason: collision with root package name */
    private static final java.lang.String f132465f = "layer-infos";

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re f132466a;

    /* renamed from: c, reason: collision with root package name */
    public int f132468c;

    /* renamed from: g, reason: collision with root package name */
    private android.content.Context f132469g;

    /* renamed from: h, reason: collision with root package name */
    private android.content.SharedPreferences f132470h;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi> f132467b = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private java.util.Set<com.tencent.mapsdk.internal.qh.a> f132471i = new java.util.HashSet();

    /* renamed from: com.tencent.mapsdk.internal.qh$1, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass1 extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26094xf8f651ae {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi f132472a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi qiVar) {
            super(256, 256);
            this.f132472a = qiVar;
        }

        @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.AbstractC26094xf8f651ae
        /* renamed from: getTileUrl */
        public final java.net.URL mo36931xef6e0fab(int i17, int i18, int i19) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi qiVar = this.f132472a;
            if (i19 <= qiVar.f132481c && i19 >= qiVar.f132482d) {
                try {
                    return new java.net.URL(this.f132472a.a(i17, i18, i19));
                } catch (java.net.MalformedURLException unused) {
                }
            }
            return null;
        }
    }

    /* loaded from: classes13.dex */
    public class a implements com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347 {

        /* renamed from: b, reason: collision with root package name */
        private static final java.lang.String f132474b = "id";

        /* renamed from: c, reason: collision with root package name */
        private static final java.lang.String f132475c = "version";

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f132477d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f132478e;

        private a() {
        }

        /* renamed from: equals */
        public boolean m36932xb2c87fbf(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.mapsdk.internal.qh.a)) {
                return false;
            }
            com.tencent.mapsdk.internal.qh.a aVar = (com.tencent.mapsdk.internal.qh.a) obj;
            java.lang.String str = this.f132477d;
            if (str == null ? aVar.f132477d != null : !str.equals(aVar.f132477d)) {
                return false;
            }
            java.lang.String str2 = this.f132478e;
            java.lang.String str3 = aVar.f132478e;
            return str2 != null ? str2.equals(str3) : str3 == null;
        }

        /* renamed from: hashCode */
        public int m36933x8cdac1b() {
            java.lang.String str = this.f132477d;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            java.lang.String str2 = this.f132478e;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4319x8b98a347
        /* renamed from: parse */
        public void mo35867x6581ab3(org.json.JSONObject jSONObject) {
            if (jSONObject != null) {
                this.f132477d = jSONObject.optString("id");
                this.f132478e = jSONObject.optString(f132475c);
            }
        }

        @Override // com.p314xaae8f345.map.p511x696c9db.p512x31ece8.InterfaceC4318xb6f102f4
        /* renamed from: toJson */
        public org.json.JSONObject mo35868xcc31ba03() {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("id", this.f132477d);
                jSONObject.put(f132475c, this.f132478e);
            } catch (org.json.JSONException unused) {
            }
            return jSONObject;
        }

        public /* synthetic */ a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh qhVar, byte b17) {
            this();
        }
    }

    public qh(android.content.Context context, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar, com.tencent.mapsdk.internal.bn.b bVar) {
        this.f132469g = context;
        this.f132466a = reVar;
        this.f132468c = reVar.f132688h.K;
        this.f132470h = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(context, "custom-layer." + bVar.c());
        b();
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.InterfaceC26018xf8628040 a(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26019xdcd7d63e c26019xdcd7d63e) {
        int i17;
        if (this.f132466a == null) {
            return null;
        }
        c26019xdcd7d63e.m99413x3b4d0a16();
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, this.f132468c);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar = this.f132466a;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c();
        java.lang.String str = "custom_layer_" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(c26019xdcd7d63e.m99413x3b4d0a16());
        c26089x9c7ff29c.m99994xb2cd9a68(str);
        c26089x9c7ff29c.m100011xf97d9342(true);
        c26089x9c7ff29c.m100009x62943937(0);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi a17 = a(c26019xdcd7d63e.m99413x3b4d0a16());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "cache_dir", (java.lang.Object) str, this.f132468c);
        if (a17 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "version", (java.lang.Object) a17.f132480b, this.f132468c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "minZoom", java.lang.Integer.valueOf(a17.f132482d), this.f132468c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "maxZoom", java.lang.Integer.valueOf(a17.f132481c), this.f132468c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "layerId", (java.lang.Object) a17.f132479a, this.f132468c);
            c26089x9c7ff29c.m100012xe5462ebf(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh.AnonymousClass1(a17));
            c26089x9c7ff29c.m100014x290dc9a6(a17.f132480b);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qz a18 = reVar.a(c26089x9c7ff29c);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi a19 = a(c26019xdcd7d63e.m99413x3b4d0a16());
        if (a18 == null || a19 == null) {
            return null;
        }
        if (a19.f132483e) {
            a18.a(true);
            a19.f132483e = false;
        }
        int i18 = a19.f132482d;
        int i19 = a19.f132481c;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.re reVar2 = a18.f132666q;
        if (reVar2 != null && (i17 = a18.f132665p) >= 0) {
            reVar2.a(i17, i18, i19);
        }
        a18.a(a19.f132482d, a19.f132481c);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hg hgVar = this.f132466a.f132688h.f130533c;
        if (hgVar != null) {
            hgVar.c().f131301a++;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.d(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, this.f132468c);
        return new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.at(a18);
    }

    private void b() {
        android.content.SharedPreferences sharedPreferences = this.f132470h;
        if (sharedPreferences != null) {
            java.lang.String string = sharedPreferences.getString(f132465f, null);
            if (android.text.TextUtils.isEmpty(string)) {
                return;
            }
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    try {
                        this.f132471i.add((com.tencent.mapsdk.internal.qh.a) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35882x450f6f3b(jSONArray.getJSONObject(i17), com.tencent.mapsdk.internal.qh.a.class, this));
                    } catch (org.json.JSONException unused) {
                    }
                }
            } catch (org.json.JSONException unused2) {
            }
        }
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c b(com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26019xdcd7d63e c26019xdcd7d63e) {
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c c26089x9c7ff29c = new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26089x9c7ff29c();
        java.lang.String str = "custom_layer_" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.li.a(c26019xdcd7d63e.m99413x3b4d0a16());
        c26089x9c7ff29c.m99994xb2cd9a68(str);
        c26089x9c7ff29c.m100011xf97d9342(true);
        c26089x9c7ff29c.m100009x62943937(0);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi a17 = a(c26019xdcd7d63e.m99413x3b4d0a16());
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "cache_dir", (java.lang.Object) str, this.f132468c);
        if (a17 != null) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "version", (java.lang.Object) a17.f132480b, this.f132468c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "minZoom", java.lang.Integer.valueOf(a17.f132482d), this.f132468c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "maxZoom", java.lang.Integer.valueOf(a17.f132481c), this.f132468c);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131733a, "layerId", (java.lang.Object) a17.f132479a, this.f132468c);
            c26089x9c7ff29c.m100012xe5462ebf(new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qh.AnonymousClass1(a17));
            c26089x9c7ff29c.m100014x290dc9a6(a17.f132480b);
        }
        return c26089x9c7ff29c;
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi qiVar : this.f132467b) {
            if (qiVar != null && str.equals(qiVar.f132479a)) {
                return qiVar;
            }
        }
        return null;
    }

    public final void a() {
        boolean z17;
        boolean z18;
        byte b17 = 0;
        if (this.f132471i.isEmpty() && !this.f132467b.isEmpty()) {
            z17 = false;
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi qiVar : this.f132467b) {
                com.tencent.mapsdk.internal.qh.a aVar = new com.tencent.mapsdk.internal.qh.a(this, b17);
                aVar.f132477d = qiVar.f132479a;
                aVar.f132478e = qiVar.f132480b;
                this.f132471i.add(aVar);
                z17 = true;
            }
        } else {
            z17 = false;
            for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qi qiVar2 : this.f132467b) {
                java.util.Iterator<com.tencent.mapsdk.internal.qh.a> it = this.f132471i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z18 = false;
                        break;
                    }
                    com.tencent.mapsdk.internal.qh.a next = it.next();
                    if (next.f132477d.equals(qiVar2.f132479a)) {
                        if (!next.f132478e.equalsIgnoreCase(qiVar2.f132480b)) {
                            qiVar2.f132483e = true;
                            next.f132478e = qiVar2.f132480b;
                        }
                        z18 = true;
                    }
                }
                if (!z18) {
                    com.tencent.mapsdk.internal.qh.a aVar2 = new com.tencent.mapsdk.internal.qh.a(this, b17);
                    aVar2.f132477d = qiVar2.f132479a;
                    aVar2.f132478e = qiVar2.f132480b;
                    this.f132471i.add(aVar2);
                    z17 = true;
                }
            }
        }
        if (z17) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ku.a(this.f132470h).a(f132465f, com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35870x946a6641(this.f132471i));
        }
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.qg qgVar) {
        if (qgVar == null || !qgVar.f132461a) {
            return;
        }
        this.f132467b.clear();
        this.f132467b.addAll(qgVar.f132462b);
        a();
    }
}
