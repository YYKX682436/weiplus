package w32;

/* loaded from: classes13.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f524220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f524221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f524222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u32.w0 f524224h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w32.n f524225i;

    public m(w32.n nVar, long j17, int i17, int i18, java.lang.String str, u32.w0 w0Var) {
        this.f524225i = nVar;
        this.f524220d = j17;
        this.f524221e = i17;
        this.f524222f = i18;
        this.f524223g = str;
        this.f524224h = w0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((w32.a) this.f524225i.f524226e).c(this.f524220d, this.f524221e, this.f524222f, this.f524223g, this.f524224h);
    }

    /* renamed from: toString */
    public java.lang.String m173180x9616526c() {
        return super.toString() + "|onTaskEnd";
    }
}
