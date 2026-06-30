package cl;

/* loaded from: classes7.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f42751a;

    public r1() {
        this("");
    }

    public abstract void a();

    public cl.r1 b(cl.q0 q0Var) {
        java.lang.String str = this.f42751a;
        if (android.text.TextUtils.isEmpty(str)) {
            c(q0Var, q0Var.f().getGlobalObject());
        } else {
            com.eclipsesource.mmv8.V8Object newV8Object = q0Var.f().newV8Object();
            q0Var.f().add(str, newV8Object);
            c(q0Var, newV8Object);
            newV8Object.release();
        }
        return this;
    }

    public abstract void c(cl.q0 q0Var, com.eclipsesource.mmv8.V8Object v8Object);

    public r1(java.lang.String str) {
        this.f42751a = str;
    }
}
