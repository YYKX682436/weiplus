package if2;

/* loaded from: classes5.dex */
public final class a0 extends p012xc85e97e9.p093xedfae76a.h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pf5.f f372630b;

    public a0(pf5.f fVar) {
        this.f372630b = fVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.h1, p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class modelClass) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modelClass, "modelClass");
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703.class.isAssignableFrom(modelClass)) {
            p012xc85e97e9.p093xedfae76a.c1 a17 = super.a(modelClass);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "create(...)");
            return a17;
        }
        try {
            java.lang.reflect.Constructor constructor = modelClass.getConstructor(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e.class);
            pf5.f fVar = this.f372630b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore");
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
