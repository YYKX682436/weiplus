package r36;

/* loaded from: classes16.dex */
public class o extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f450978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x36.k f450979f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f450980g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r36.z f450981h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r36.z zVar, java.lang.String str, java.lang.Object[] objArr, int i17, x36.k kVar, int i18, boolean z17) {
        super(str, objArr);
        this.f450981h = zVar;
        this.f450978e = i17;
        this.f450979f = kVar;
        this.f450980g = i18;
    }

    @Override // m36.b
    public void a() {
        try {
            r36.l0 l0Var = this.f450981h.f451013p;
            x36.k kVar = this.f450979f;
            int i17 = this.f450980g;
            ((r36.k0) l0Var).getClass();
            kVar.mo174960x35e57f(i17);
            this.f450981h.A.k(this.f450978e, r36.b.CANCEL);
            synchronized (this.f450981h) {
                this.f450981h.C.remove(java.lang.Integer.valueOf(this.f450978e));
            }
        } catch (java.io.IOException unused) {
        }
    }
}
