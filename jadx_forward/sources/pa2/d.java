package pa2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f434504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa2.g f434505e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, pa2.g gVar) {
        super(1);
        this.f434504d = u3Var;
        this.f434505e = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.d13 resp = (r45.d13) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        this.f434504d.dismiss();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderTemplateShareHandler", "doUnpublish success");
        pa2.g gVar = this.f434505e;
        gVar.getClass();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5541xf0fa9cb c5541xf0fa9cb = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5541xf0fa9cb();
        java.lang.String B = gVar.B();
        am.ld ldVar = c5541xf0fa9cb.f135865g;
        ldVar.f88774a = B;
        ldVar.f88775b = 1;
        c5541xf0fa9cb.e();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(gVar.f515691a);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.f573551ey4);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.c();
        pm0.v.V(2000L, new pa2.c(gVar));
        return jz5.f0.f384359a;
    }
}
