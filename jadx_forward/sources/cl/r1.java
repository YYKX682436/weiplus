package cl;

/* loaded from: classes7.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f124284a;

    public r1() {
        this("");
    }

    public abstract void a();

    public cl.r1 b(cl.q0 q0Var) {
        java.lang.String str = this.f124284a;
        if (android.text.TextUtils.isEmpty(str)) {
            c(q0Var, q0Var.f().mo16386x31ca9f38());
        } else {
            com.p159x477cd522.p160x333422.C1477x4679881 mo16400x4b75a221 = q0Var.f().mo16400x4b75a221();
            q0Var.f().add(str, mo16400x4b75a221);
            c(q0Var, mo16400x4b75a221);
            mo16400x4b75a221.mo15825x41012807();
        }
        return this;
    }

    public abstract void c(cl.q0 q0Var, com.p159x477cd522.p160x333422.C1477x4679881 c1477x4679881);

    public r1(java.lang.String str) {
        this.f124284a = str;
    }
}
