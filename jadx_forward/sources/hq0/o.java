package hq0;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f364569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364570f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(hq0.b0 b0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        super(1);
        this.f364568d = b0Var;
        this.f364569e = h0Var;
        this.f364570f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        android.view.MotionEvent ev6 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (((je3.i) i95.n0.c(je3.i.class)).W7() && ev6.getAction() == 1) {
            cl0.g gVar = new cl0.g();
            ie3.i iVar = (ie3.i) i95.n0.c(ie3.i.class);
            hq0.b0 b0Var = this.f364568d;
            if (iVar != null) {
                str = ((he3.e) iVar).bj(b0Var.f364503x.f375167a);
            } else {
                str = "";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f364569e;
            gVar.o("w", ((com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) h0Var.f391656d).getWidth());
            gVar.o("h", ((com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) h0Var.f391656d).getHeight());
            gVar.h("mb_biz_version", b0Var.f364503x.f375167a + ':' + str);
            je3.i iVar2 = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String instanceName = b0Var.f364503x.f375167a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceName, "instanceName");
            java.lang.String s07 = r26.n0.s0(instanceName, "-", instanceName);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16451x1796f446 enumC16451x1796f446 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16451x1796f446.f37506xe5cc01ce;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e enumC16450xc9b86c3e = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16450xc9b86c3e.f37502xca3ba391;
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86 enumC16449xa1a30c86 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16449xa1a30c86.f37496xda774887;
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            java.lang.String t17 = r26.i0.t(gVar2, ",", ";", false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iVar2);
            je3.i.m180102if(iVar2, s07, 0, currentTimeMillis, "", enumC16451x1796f446, enumC16450xc9b86c3e, enumC16449xa1a30c86, 0, 0, t17, this.f364570f, 386, null);
        }
        return jz5.f0.f384359a;
    }
}
