package lr;

/* loaded from: classes15.dex */
public final class q extends lr.y {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lr.u f402108b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(lr.u uVar, lr.z zVar) {
        super(zVar);
        this.f402108b = uVar;
    }

    @Override // ir.d0
    public void b(ir.k0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String c17 = data.p().c();
        lr.u uVar = this.f402108b;
        if (c17 != null) {
            lr.z zVar = uVar.f402120g;
            zVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zVar.f402151e, "smiley_log setCustomType ".concat(c17));
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "custom")) {
                zVar.f402154h = true;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, "smiley")) {
                zVar.f402155i = true;
            }
        }
        this.f402145a.E(data.b());
        uVar.i();
    }
}
