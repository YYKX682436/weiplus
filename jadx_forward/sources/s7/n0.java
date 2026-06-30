package s7;

/* loaded from: classes16.dex */
public abstract class n0 extends s7.y1 implements s7.w1 {

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f485262h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Boolean f485263i;

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.Matrix f485264j;

    /* renamed from: k, reason: collision with root package name */
    public s7.o0 f485265k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f485266l;

    @Override // s7.w1
    public java.util.List c() {
        return this.f485262h;
    }

    @Override // s7.w1
    public void h(s7.a2 a2Var) {
        if (a2Var instanceof s7.h1) {
            this.f485262h.add(a2Var);
            return;
        }
        throw new s7.g3("Gradient elements cannot contain " + a2Var + " elements.");
    }
}
