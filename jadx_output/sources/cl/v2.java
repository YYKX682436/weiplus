package cl;

/* loaded from: classes7.dex */
public class v2 extends cl.u2 implements java.lang.Runnable {

    /* renamed from: h, reason: collision with root package name */
    public final long f42803h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f42804i;

    /* renamed from: m, reason: collision with root package name */
    public final com.eclipsesource.mmv8.V8Array f42805m;

    public v2(cl.w2 w2Var, cl.q0 q0Var, int i17, com.eclipsesource.mmv8.V8Function v8Function, com.eclipsesource.mmv8.V8Array v8Array, boolean z17, long j17) {
        super(w2Var, q0Var, i17, v8Function);
        this.f42803h = j17;
        this.f42804i = z17;
        this.f42805m = v8Array;
    }

    @Override // cl.u2
    public void b() {
        this.f42777g.f42814c.remove(this.f42776f);
        this.f42775e.release();
        this.f42805m.release();
    }

    public void e() {
        cl.a aVar = (cl.a) this.f42774d.f42724b;
        aVar.c();
        aVar.f42569b.l(this, this.f42803h, false);
    }

    public void run() {
        if (d()) {
            c(this.f42805m);
            if (d()) {
                if (this.f42804i) {
                    e();
                } else {
                    b();
                }
            }
        }
    }
}
