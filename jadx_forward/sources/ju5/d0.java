package ju5;

/* loaded from: classes15.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f383613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f383614e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju5.j0 f383615f;

    public d0(ju5.j0 j0Var, int i17, java.lang.CharSequence charSequence) {
        this.f383615f = j0Var;
        this.f383613d = i17;
        this.f383614e = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        du5.d dVar = this.f383615f.f383636c.f383645i;
        if (dVar != null) {
            dVar.e(this.f383613d, this.f383614e);
        }
    }
}
