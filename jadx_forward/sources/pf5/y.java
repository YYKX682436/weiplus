package pf5;

/* loaded from: classes5.dex */
public final class y extends p012xc85e97e9.p093xedfae76a.h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f435480b;

    public y(java.lang.Object obj) {
        this.f435480b = obj;
    }

    @Override // p012xc85e97e9.p093xedfae76a.h1, p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        p012xc85e97e9.p093xedfae76a.c1 c1Var = null;
        if ((pf5.o0.class.isAssignableFrom(modelClass) ? modelClass : null) != null) {
            java.lang.Object obj2 = this.f435480b;
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                java.lang.Object newInstance = modelClass.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                p012xc85e97e9.p093xedfae76a.c1 c1Var2 = (p012xc85e97e9.p093xedfae76a.c1) newInstance;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c1Var2, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentPlugin<P of com.tencent.mm.ui.component.UICProviderImpl.of.<no name provided>.create$lambda$4$lambda$2$lambda$1>");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "<set-?>");
                ((pf5.o0) c1Var2).f435460d = obj2;
                obj = p3321xbce91901.C29043x91b2b43d.m143895xf1229813((p012xc85e97e9.p093xedfae76a.c1) newInstance);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                obj = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
            if (m143898xd4a2fc34 != null) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, m143898xd4a2fc34);
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c1Var = (p012xc85e97e9.p093xedfae76a.c1) obj;
        }
        if (c1Var != null) {
            return c1Var;
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = super.a(modelClass);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "create(...)");
        return a17;
    }
}
