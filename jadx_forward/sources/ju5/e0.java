package ju5;

/* loaded from: classes15.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f383618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f383619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju5.j0 f383620f;

    public e0(ju5.j0 j0Var, int i17, java.lang.CharSequence charSequence) {
        this.f383620f = j0Var;
        this.f383618d = i17;
        this.f383619e = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        du5.d dVar = this.f383620f.f383636c.f383645i;
        if (dVar != null) {
            java.lang.CharSequence charSequence = this.f383619e;
            dVar.c(this.f383618d, charSequence == null ? "unknown error" : charSequence.toString());
        }
    }
}
