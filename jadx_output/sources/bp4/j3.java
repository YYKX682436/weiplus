package bp4;

/* loaded from: classes10.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.o3 f23205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23206e;

    public j3(bp4.o3 o3Var, java.lang.String str) {
        this.f23205d = o3Var;
        this.f23206e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bp4.o3 o3Var = this.f23205d;
        o3Var.f23314h = db5.e1.Q(o3Var.f23313g, "", this.f23206e, true, false, null);
    }
}
