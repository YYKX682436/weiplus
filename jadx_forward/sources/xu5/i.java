package xu5;

/* loaded from: classes12.dex */
public class i implements xu5.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f538845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f538846b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xu5.o f538847c;

    public i(xu5.o oVar, int i17, java.lang.Object obj) {
        this.f538847c = oVar;
        this.f538845a = i17;
        this.f538846b = obj;
    }

    @Override // xu5.q
    public boolean a(xu5.v vVar) {
        java.lang.Object obj = vVar.f531387o;
        boolean z17 = false;
        if (obj instanceof xu5.n) {
            xu5.n nVar = (xu5.n) obj;
            if (nVar.f538858g == this.f538847c) {
                android.os.Message message = nVar.f538856e;
                if (message.what == this.f538845a && message.obj == this.f538846b) {
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
