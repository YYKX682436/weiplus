package i06;

/* loaded from: classes15.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.k1 f368132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i06.f1 f368133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(i06.k1 k1Var, i06.f1 f1Var) {
        super(0);
        this.f368132d = k1Var;
        this.f368133e = f1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String h17;
        i06.k1 k1Var = this.f368132d;
        if (k1Var.f368213e.isAnonymousClass()) {
            return null;
        }
        n16.b v17 = k1Var.v();
        if (v17.f415691c) {
            this.f368133e.getClass();
            java.lang.Class cls = k1Var.f368213e;
            java.lang.String simpleName = cls.getSimpleName();
            java.lang.reflect.Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                h17 = r26.n0.m0(simpleName, enclosingMethod.getName() + '$', simpleName);
            } else {
                java.lang.reflect.Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    h17 = r26.n0.m0(simpleName, enclosingConstructor.getName() + '$', simpleName);
                } else {
                    h17 = r26.n0.n0(simpleName, '$', null, 2, null);
                }
            }
        } else {
            h17 = v17.j().h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
        }
        return h17;
    }
}
