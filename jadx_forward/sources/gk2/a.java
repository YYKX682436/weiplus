package gk2;

/* loaded from: classes5.dex */
public final class a extends p012xc85e97e9.p093xedfae76a.h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf5.f f354001b;

    public a(pf5.f fVar) {
        this.f354001b = fVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.h1, p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        if (!mm2.e.class.isAssignableFrom(modelClass)) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = super.a(modelClass);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "create(...)");
            return a17;
        }
        try {
            java.lang.reflect.Constructor constructor = modelClass.getConstructor(gk2.e.class);
            pf5.f fVar = this.f354001b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.context.LiveBuContext");
            p012xc85e97e9.p093xedfae76a.c1 c1Var = (p012xc85e97e9.p093xedfae76a.c1) constructor.newInstance(fVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1Var);
            return c1Var;
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e18);
        } catch (java.lang.NoSuchMethodException e19) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e19);
        } catch (java.lang.reflect.InvocationTargetException e27) {
            throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e27);
        }
    }
}
