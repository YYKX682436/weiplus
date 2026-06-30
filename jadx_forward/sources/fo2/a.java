package fo2;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f346426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ db5.g4 f346427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fo2.e f346428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, db5.g4 g4Var, fo2.e eVar) {
        super(1);
        this.f346426d = k0Var;
        this.f346427e = g4Var;
        this.f346428f = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        if (fVar.b()) {
            r45.xr0 xr0Var = (r45.xr0) fVar.f152151d;
            if (xr0Var.f471888h == 2 && xr0Var.f471889i != 1) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f346426d;
                if (k0Var.i()) {
                    this.f346427e.l(20009, this.f346428f.f515691a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573457m44), com.p314xaae8f345.mm.R.raw.f81311x8a0b4ea5, false);
                    k0Var.j();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
