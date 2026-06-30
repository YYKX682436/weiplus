package my2;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my2.u f414293d;

    public r(my2.u uVar) {
        this.f414293d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        my2.u uVar = this.f414293d;
        qo0.c.a(uVar.f414297e, qo0.b.f446952u2, null, 2, null);
        mm2.c1 c1Var = (mm2.c1) uVar.f414296d.a(mm2.c1.class);
        c1Var.f410317b6 = null;
        c1Var.f410322c6 = false;
        c1Var.f410327d6 = false;
    }
}
