package ot0;

/* loaded from: classes4.dex */
public final class z implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f430353b;

    public z(java.lang.String str, km5.b bVar) {
        this.f430352a = str;
        this.f430353b = bVar;
    }

    @Override // c01.o8
    public final void a(java.lang.String retUsername, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(retUsername, "retUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "flush contact callback, username: %s, success: %b, isUpdatingBizInfo: %b", retUsername, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(ot0.f0.f430006b));
        boolean z18 = ot0.f0.f430006b;
        km5.b bVar = this.f430353b;
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "callback when request interrupted by user");
            bVar.a(new ot0.p0(1, "flush contact fail"));
            return;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = this.f430352a;
        if (str == null) {
            str = "";
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, retUsername) || !z17) {
            bVar.a(new ot0.p0(1, "flush contact fail"));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 11, 1L, false);
            bVar.c(java.lang.Boolean.TRUE);
        }
    }
}
