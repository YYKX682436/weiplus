package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266017f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONArray f266018g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f266019h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f266020i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f266021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f266022n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.r0 f266023o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 f266024p;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74, int i17, java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, boolean z17, int i18, java.lang.Boolean bool, boolean z18, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.r0 r0Var) {
        this.f266024p = abstractActivityC19367xd1ae8c74;
        this.f266015d = i17;
        this.f266016e = str;
        this.f266017f = str2;
        this.f266018g = jSONArray;
        this.f266019h = z17;
        this.f266020i = i18;
        this.f266021m = bool;
        this.f266022n = z18;
        this.f266023o = r0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashMap hashMap = new java.util.HashMap();
        int i17 = this.f266015d;
        if (i17 == 0) {
            hashMap.put("query", this.f266016e);
            hashMap.put("custom", this.f266017f);
            hashMap.put("tagList", this.f266018g);
            hashMap.put("isFromVoice", java.lang.Boolean.valueOf(this.f266019h));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = this.f266024p;
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.Integer.valueOf(abstractActivityC19367xd1ae8c74.Y3));
        hashMap.put("isCancelButtonClick", java.lang.Integer.valueOf(i17));
        hashMap.put("isInputChange", java.lang.Integer.valueOf(this.f266020i));
        java.lang.Boolean bool = this.f266021m;
        if (bool != null) {
            hashMap.put("isBackToGuidePage", bool);
        }
        if (this.f266022n) {
            abstractActivityC19367xd1ae8c74.o9(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j0(this, hashMap));
            return;
        }
        nw4.n nVar = abstractActivityC19367xd1ae8c74.f265377p0;
        if (nVar != null) {
            nVar.i0("onSearchInputChange", hashMap, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.r0 r0Var = this.f266023o;
        if (r0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.b) r0Var).f265875a;
            activityC19366xa1004627.W4 = false;
            activityC19366xa1004627.qa();
        }
    }
}
