package r36;

/* loaded from: classes16.dex */
public class v extends m36.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r36.g0 f450996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r36.y f450997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r36.y yVar, java.lang.String str, java.lang.Object[] objArr, r36.g0 g0Var) {
        super(str, objArr);
        this.f450997f = yVar;
        this.f450996e = g0Var;
    }

    @Override // m36.b
    public void a() {
        r36.g0 g0Var = this.f450996e;
        r36.y yVar = this.f450997f;
        try {
            yVar.f451003f.f451005e.b(g0Var);
        } catch (java.io.IOException e17) {
            t36.k.f496994a.l(4, "Http2Connection.Listener failure for " + yVar.f451003f.f451007g, e17);
            try {
                g0Var.c(r36.b.PROTOCOL_ERROR);
            } catch (java.io.IOException unused) {
            }
        }
    }
}
