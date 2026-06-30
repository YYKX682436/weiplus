package w32;

/* loaded from: classes13.dex */
public class n extends u32.l0 {

    /* renamed from: e, reason: collision with root package name */
    public final w32.c f524226e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f524227f = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Runnable f524228g = new w32.l(this);

    public n(w32.c cVar) {
        this.f524226e = null;
        iz5.a.d(null, cVar);
        this.f524226e = cVar;
    }

    @Override // u32.m0
    public void wh(long j17, int i17, int i18, java.lang.String str, u32.w0 w0Var) {
        if (this.f524227f) {
            return;
        }
        gm0.j1.e().d().mo50300x3fa464aa(this.f524228g);
        gm0.j1.e().d().mo50293x3498a0(new w32.m(this, j17, i17, i18, str, w0Var));
    }
}
