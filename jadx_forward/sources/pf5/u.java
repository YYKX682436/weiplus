package pf5;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final pf5.u f435469a = new pf5.u();

    public final pf5.b a(java.lang.Class t17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(t17, "t");
        pf5.z zVar = pf5.z.f435481a;
        java.lang.Object obj = pf5.z.f435483c.get(t17.getName());
        java.lang.Class cls = obj instanceof java.lang.Class ? (java.lang.Class) obj : null;
        if (cls != null) {
            cls.isInterface();
            java.lang.Object newInstance = cls.newInstance();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
            return (pf5.b) newInstance;
        }
        throw new java.lang.RuntimeException(this + " never import any instance.");
    }

    public final pf5.v b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context);
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final pf5.v c(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return pf5.z.f435481a.a(activity);
    }

    public final pf5.v d(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        return pf5.z.f435481a.b(fragment);
    }

    public final pf5.v e(java.lang.Class ownerClazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ownerClazz, "ownerClazz");
        i95.m owner = i95.m.class.isAssignableFrom(ownerClazz) ? i95.n0.c(ownerClazz) : null;
        if (!(owner instanceof p012xc85e97e9.p093xedfae76a.m1)) {
            throw new java.lang.RuntimeException(owner + ": " + ownerClazz + " cannot create ViewModelProvider failed.");
        }
        pf5.z zVar = pf5.z.f435481a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        if (owner instanceof p012xc85e97e9.p093xedfae76a.m1) {
            return new pf5.v((p012xc85e97e9.p093xedfae76a.m1) owner, new pf5.y(owner));
        }
        throw new java.lang.RuntimeException(owner + ": " + ownerClazz + " cannot create ViewModelProvider failed.");
    }
}
