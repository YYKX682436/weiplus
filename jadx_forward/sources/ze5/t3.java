package ze5;

/* loaded from: classes9.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f553733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v05.b f553734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f553735f;

    public t3(int i17, v05.b bVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f553733d = i17;
        this.f553734e = bVar;
        this.f553735f = f9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v05.a aVar;
        v05.a aVar2;
        v05.a aVar3;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6853x996853e3 c6853x996853e3 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6853x996853e3();
        c6853x996853e3.f141717d = this.f553733d;
        v05.b bVar = this.f553734e;
        c6853x996853e3.f141718e = (bVar == null || (aVar3 = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8)) == null) ? 0L : aVar3.m75942xfb822ef2(aVar3.f449897d + 0);
        java.lang.Long l17 = null;
        java.lang.String r17 = (bVar == null || (aVar2 = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8)) == null) ? null : aVar2.r();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (r17 == null) {
            r17 = "";
        }
        java.util.Locale locale = java.util.Locale.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
        java.lang.String lowerCase = r17.toLowerCase(locale);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        c6853x996853e3.f141719f = c6853x996853e3.b("FileExt", lowerCase, true);
        c6853x996853e3.f141720g = c6853x996853e3.b("ChatName", this.f553735f.Q0(), true);
        if (bVar != null && (aVar = (v05.a) bVar.m75936x14adae67(bVar.f513848e + 8)) != null) {
            l17 = java.lang.Long.valueOf(aVar.t());
        }
        c6853x996853e3.f141721h = c6853x996853e3.b("MsgSvrId", java.lang.String.valueOf(l17), true);
        c6853x996853e3.f141722i = 1L;
        c6853x996853e3.k();
    }
}
