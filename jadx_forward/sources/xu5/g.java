package xu5;

/* loaded from: classes12.dex */
public class g implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f538840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f538841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538842c;

    public g(xu5.o oVar, java.lang.Runnable runnable, java.lang.Object obj) {
        this.f538842c = oVar;
        this.f538840a = runnable;
        this.f538841b = obj;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f531387o;
        boolean z17 = false;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            if (nVar.f538858g == this.f538842c) {
                android.os.Message message = nVar.f538856e;
                if (message.getCallback() == this.f538840a && message.obj == this.f538841b) {
                    z17 = true;
                }
            }
            if (z17) {
                nVar.b();
            }
        }
        return z17;
    }
}
