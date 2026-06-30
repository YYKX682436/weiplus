package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class d4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f265916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f265917f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265918g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265919h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265920i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265921m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 f265922n;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 activityC19396xdd9ccea5, java.lang.String str, java.util.Map map, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f265922n = activityC19396xdd9ccea5;
        this.f265915d = str;
        this.f265916e = map;
        this.f265917f = i17;
        this.f265918g = str2;
        this.f265919h = str3;
        this.f265920i = str4;
        this.f265921m = str5;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19396xdd9ccea5 activityC19396xdd9ccea5 = this.f265922n;
        activityC19396xdd9ccea5.F4.mo81005xdc5215a6().n(this.f265915d, new java.util.LinkedList());
        activityC19396xdd9ccea5.F4.mo81005xdc5215a6().d();
        activityC19396xdd9ccea5.U7();
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            str = java.net.URLEncoder.encode(new org.json.JSONObject(this.f265916e).toString(), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
        } catch (java.io.UnsupportedEncodingException unused) {
            str = "";
        }
        hashMap.put("parentSearchID", java.lang.String.format("%d:%s:%s:%s:%s", java.lang.Integer.valueOf(this.f265917f), this.f265918g, this.f265919h, this.f265920i, str));
        java.lang.String str2 = this.f265921m;
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap.put("mixerCommonContext", str2);
        }
        nw4.n nVar = activityC19396xdd9ccea5.f265377p0;
        java.lang.String str3 = this.f265915d;
        nVar.d0(str3, str3, new org.json.JSONArray(), 0, hashMap);
    }
}
