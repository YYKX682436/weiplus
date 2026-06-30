package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes14.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x.n f93017a = new x.n();

    public static java.lang.Class b(java.lang.ClassLoader classLoader, java.lang.String str) {
        x.n nVar = f93017a;
        x.n nVar2 = (x.n) nVar.m174751x4aabfc28(classLoader, null);
        if (nVar2 == null) {
            nVar2 = new x.n();
            nVar.put(classLoader, nVar2);
        }
        java.lang.Class cls = (java.lang.Class) nVar2.m174751x4aabfc28(str, null);
        if (cls != null) {
            return cls;
        }
        java.lang.Class<?> cls2 = java.lang.Class.forName(str, false, classLoader);
        nVar2.put(str, cls2);
        return cls2;
    }

    public static java.lang.Class c(java.lang.ClassLoader classLoader, java.lang.String str) {
        try {
            return b(classLoader, str);
        } catch (java.lang.ClassCastException e17) {
            throw new p012xc85e97e9.p087x9da2e250.app.e0("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e17);
        } catch (java.lang.ClassNotFoundException e18) {
            throw new p012xc85e97e9.p087x9da2e250.app.e0("Unable to instantiate fragment " + str + ": make sure class name exists", e18);
        }
    }

    public abstract p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 a(java.lang.ClassLoader classLoader, java.lang.String str);
}
