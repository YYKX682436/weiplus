package zh1;

/* loaded from: classes8.dex */
public final class k implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f554429d;

    public k(zh1.n nVar) {
        this.f554429d = nVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "onDismiss");
        zh1.u0 u0Var = this.f554429d.f554452n;
        if (u0Var != null) {
            u0Var.a();
        }
        di1.f fVar = (di1.f) this.f554429d.f554449h;
        synchronized (fVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f314174m, "updateSessionId");
            java.lang.String a17 = c01.n2.a("OpenMaterial#" + fVar.f314163b.name());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "buildSessionId(...)");
            fVar.f314173l = a17;
            fVar.f314174m = "MicroMsg.AppBrand.AppBrandOpenMaterialReporter#" + fVar.f314173l;
        }
    }
}
