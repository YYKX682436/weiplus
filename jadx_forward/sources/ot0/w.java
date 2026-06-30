package ot0;

/* loaded from: classes9.dex */
public final class w implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f430333b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430334c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f430335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f430336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f430338g;

    public w(java.lang.String str, android.content.Context context, java.lang.String str2, int i17, int i18, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        this.f430332a = str;
        this.f430333b = context;
        this.f430334c = str2;
        this.f430335d = i17;
        this.f430336e = i18;
        this.f430337f = str3;
        this.f430338g = c12559xbdae8559;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (!bool.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppMsgBizClickHandler", "update bizInfo fail, skip launch wxa");
            return;
        }
        qk.o b17 = r01.z.b(this.f430332a);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(b17 == null);
        objArr[1] = b17 == null ? "null" : b17.f66730x28d45f97;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "try to launchWxa, bizInfo == null?: %b, appId: %s", objArr);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Vi(this.f430333b, this.f430334c, null, this.f430335d, this.f430336e, this.f430337f, this.f430338g, b17 != null ? b17.f66730x28d45f97 : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 1, 1L, false);
    }
}
