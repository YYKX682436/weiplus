package bp4;

/* loaded from: classes10.dex */
public final class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.o3 f104738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104739e;

    public j3(bp4.o3 o3Var, java.lang.String str) {
        this.f104738d = o3Var;
        this.f104739e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bp4.o3 o3Var = this.f104738d;
        o3Var.f104847h = db5.e1.Q(o3Var.f104846g, "", this.f104739e, true, false, null);
    }
}
