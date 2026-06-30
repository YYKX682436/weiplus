package tn0;

/* loaded from: classes3.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.v0 f502185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tn0.j1 f502186e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(go0.v0 v0Var, tn0.j1 j1Var) {
        super(3);
        this.f502185d = v0Var;
        this.f502186e = j1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        int intValue3 = ((java.lang.Number) obj3).intValue();
        rs0.h hVar = this.f502185d.f355418l;
        android.opengl.EGLContext eGLContext = hVar != null ? hVar.f480827c : null;
        if (eGLContext != null) {
            tn0.w0 w0Var = this.f502186e.f502231a;
            w0Var.s0(eGLContext, intValue, intValue2, intValue3, 0L, w0Var.f502291e);
        }
        return jz5.f0.f384359a;
    }
}
