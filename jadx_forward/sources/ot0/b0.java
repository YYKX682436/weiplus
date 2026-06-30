package ot0;

/* loaded from: classes4.dex */
public final class b0 implements r01.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f429935b;

    public b0(java.lang.String str, km5.b bVar) {
        this.f429934a = str;
        this.f429935b = bVar;
    }

    @Override // r01.c
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "flush bizInfo callback, username: %s, success: %b, isUpdatingBizInfo: %b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(ot0.f0.f430006b));
        boolean z18 = ot0.f0.f430006b;
        km5.b bVar = this.f429935b;
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgBizClickHandler", "callback when request interrupted by user");
            bVar.a(new ot0.p0(2, "flush bizInfo fail"));
            return;
        }
        boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f429934a) || !z17) {
            bVar.a(new ot0.p0(2, "flush bizInfo fail"));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1908L, 13, 1L, false);
            bVar.c(java.lang.Boolean.TRUE);
        }
    }
}
