package cl;

/* loaded from: classes7.dex */
public abstract class u2 {

    /* renamed from: d, reason: collision with root package name */
    public final cl.q0 f42774d;

    /* renamed from: e, reason: collision with root package name */
    public final com.eclipsesource.mmv8.V8Function f42775e;

    /* renamed from: f, reason: collision with root package name */
    public final int f42776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.w2 f42777g;

    public u2(cl.w2 w2Var, cl.q0 q0Var, int i17, com.eclipsesource.mmv8.V8Function v8Function) {
        this.f42777g = w2Var;
        this.f42774d = q0Var;
        this.f42775e = v8Function;
        this.f42776f = i17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        b();
    }

    abstract void b();

    public void c(com.eclipsesource.mmv8.V8Array v8Array) {
        com.eclipsesource.mmv8.V8Function v8Function = this.f42775e;
        if (v8Function.isReleased()) {
            return;
        }
        cl.q0 q0Var = this.f42774d;
        if (q0Var.f().isReleased()) {
            return;
        }
        v8Function.call(q0Var.f().getGlobalObject(), v8Array);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return (this.f42775e.isReleased() || this.f42774d.f().isReleased()) ? false : true;
    }
}
