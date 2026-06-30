package r35;

/* loaded from: classes15.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f450685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r35.m0 f450686e;

    public k0(r35.m0 m0Var, q11.b bVar) {
        this.f450686e = m0Var;
        this.f450685d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r35.m0 m0Var = this.f450686e;
        m0Var.f450720h = currentTimeMillis;
        r35.q3 q3Var = m0Var.f450716d;
        if (q3Var != null) {
            q3Var.mo58428x42fe6352();
            m0Var.f450716d = null;
        }
        if (r35.y.f450859a.a(m0Var.f450717e) && this.f450685d.f441065b == 2) {
            r35.x xVar = r35.x.f450853a;
            xVar.d(m0Var.f450718f, true, m0Var.f450720h - m0Var.f450719g);
            xVar.c(m0Var.f450718f, true);
        }
    }
}
