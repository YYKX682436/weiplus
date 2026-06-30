package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class r2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s2 f164421c;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.s2 s2Var) {
        this.f164419a = lVar;
        this.f164420b = i17;
        this.f164421c = s2Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.q2
    public void a(java.lang.String str, boolean z17) {
        if (str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, url is illegal");
            this.f164419a.a(this.f164420b, this.f164421c.o("fail:url is illegal"));
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.f(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, " + str + " is not image");
            com.p314xaae8f345.mm.vfs.w6.h(str);
            this.f164419a.a(this.f164420b, this.f164421c.o("fail:url is illegal"));
            return;
        }
        android.content.Context mo50352x76847179 = this.f164419a.mo50352x76847179();
        if (mo50352x76847179 instanceof android.app.Activity) {
            ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q2(this.f164421c, (android.app.Activity) mo50352x76847179, str, this.f164419a, this.f164420b));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiAddImageToFavorites", "invoke, activity is null");
            this.f164419a.a(this.f164420b, this.f164421c.o("fail:activity is null"));
        }
    }
}
