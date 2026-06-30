package nn0;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.x f420165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(nn0.x xVar) {
        super(0);
        this.f420165d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        nn0.x xVar = this.f420165d;
        android.opengl.EGLContext mo149803xe0fe423b = ((nn0.p) xVar.f420117b).mo149803xe0fe423b();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (mo149803xe0fe423b != null) {
            pm0.v.X(new nn0.v(xVar, mo149803xe0fe423b));
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return f0Var2;
        }
        throw new java.lang.RuntimeException("EGL context con not be null");
    }
}
