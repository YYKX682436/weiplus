package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class di implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f285328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f285329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285330e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f285331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f285332g;

    public di(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        this.f285332g = c21908xb66fd105;
        this.f285326a = str;
        this.f285327b = str2;
        this.f285328c = i17;
        this.f285329d = i18;
        this.f285330e = str3;
        this.f285331f = c12559xbdae8559;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemDyeingTemplate", "update bizInfo fail, skip launch wxa");
            return;
        }
        qk.o b17 = r01.z.b(this.f285326a);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(b17 == null);
        objArr[1] = b17 == null ? "null" : b17.f66730x28d45f97;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "try to launchWxa, bizInfo == null?: %b, appId: %s", objArr);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(this.f285332g.f284708s.g(), this.f285327b, null, this.f285328c, this.f285329d, this.f285330e, this.f285331f, b17 == null ? null : b17.f66730x28d45f97);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.c.a(1);
    }
}
