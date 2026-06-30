package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public final class x0 extends p012xc85e97e9.p093xedfae76a.g1 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Class[] f93193f = {android.app.Application.class, p012xc85e97e9.p093xedfae76a.v0.class};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Class[] f93194g = {p012xc85e97e9.p093xedfae76a.v0.class};

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f93195a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.f1 f93196b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f93197c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.o f93198d;

    /* renamed from: e, reason: collision with root package name */
    public final o4.b f93199e;

    public x0(android.app.Application application, o4.g gVar, android.os.Bundle bundle) {
        p012xc85e97e9.p093xedfae76a.f1 f1Var;
        this.f93199e = gVar.mo2511xdf516e9d();
        this.f93198d = gVar.mo273xed6858b4();
        this.f93197c = bundle;
        this.f93195a = application;
        if (application != null) {
            if (p012xc85e97e9.p093xedfae76a.e1.f93154c == null) {
                p012xc85e97e9.p093xedfae76a.e1.f93154c = new p012xc85e97e9.p093xedfae76a.e1(application);
            }
            f1Var = p012xc85e97e9.p093xedfae76a.e1.f93154c;
        } else {
            if (p012xc85e97e9.p093xedfae76a.h1.f93163a == null) {
                p012xc85e97e9.p093xedfae76a.h1.f93163a = new p012xc85e97e9.p093xedfae76a.h1();
            }
            f1Var = p012xc85e97e9.p093xedfae76a.h1.f93163a;
        }
        this.f93196b = f1Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f1
    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, cls);
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p012xc85e97e9.p093xedfae76a.g1
    public p012xc85e97e9.p093xedfae76a.c1 b(java.lang.String str, java.lang.Class cls) {
        p012xc85e97e9.p093xedfae76a.v0 v0Var;
        boolean isAssignableFrom = p012xc85e97e9.p093xedfae76a.a.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor<?> constructor = null;
        android.app.Application application = this.f93195a;
        if (!isAssignableFrom || application == null) {
            java.lang.Class[] clsArr = f93194g;
            for (java.lang.reflect.Constructor<?> constructor2 : cls.getConstructors()) {
                if (java.util.Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                    constructor = constructor2;
                    break;
                }
            }
        } else {
            java.lang.Class[] clsArr2 = f93193f;
            for (java.lang.reflect.Constructor<?> constructor22 : cls.getConstructors()) {
                if (java.util.Arrays.equals(clsArr2, constructor22.getParameterTypes())) {
                    constructor = constructor22;
                    break;
                }
            }
        }
        if (constructor == null) {
            return this.f93196b.a(cls);
        }
        o4.b bVar = this.f93199e;
        android.os.Bundle a17 = bVar.a(str);
        java.lang.Class[] clsArr3 = p012xc85e97e9.p093xedfae76a.v0.f93188e;
        android.os.Bundle bundle = this.f93197c;
        if (a17 == null && bundle == null) {
            v0Var = new p012xc85e97e9.p093xedfae76a.v0();
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (bundle != null) {
                for (java.lang.String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a17 == null) {
                v0Var = new p012xc85e97e9.p093xedfae76a.v0(hashMap);
            } else {
                java.util.ArrayList parcelableArrayList = a17.getParcelableArrayList("keys");
                java.util.ArrayList parcelableArrayList2 = a17.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new java.lang.IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                    hashMap.put((java.lang.String) parcelableArrayList.get(i17), parcelableArrayList2.get(i17));
                }
                v0Var = new p012xc85e97e9.p093xedfae76a.v0(hashMap);
            }
        }
        p012xc85e97e9.p093xedfae76a.C1122xd7858a6e c1122xd7858a6e = new p012xc85e97e9.p093xedfae76a.C1122xd7858a6e(str, v0Var);
        if (c1122xd7858a6e.f93123e) {
            throw new java.lang.IllegalStateException("Already attached to lifecycleOwner");
        }
        c1122xd7858a6e.f93123e = true;
        p012xc85e97e9.p093xedfae76a.o oVar = this.f93198d;
        oVar.a(c1122xd7858a6e);
        p012xc85e97e9.p093xedfae76a.v0 v0Var2 = c1122xd7858a6e.f93124f;
        bVar.b(c1122xd7858a6e.f93122d, v0Var2.f93192d);
        p012xc85e97e9.p093xedfae76a.C1122xd7858a6e.a(bVar, oVar);
        try {
            p012xc85e97e9.p093xedfae76a.c1 c1Var = (!isAssignableFrom || application == null) ? (p012xc85e97e9.p093xedfae76a.c1) constructor.newInstance(v0Var2) : (p012xc85e97e9.p093xedfae76a.c1) constructor.newInstance(application, v0Var2);
            c1Var.m7792x46b076ae("androidx.lifecycle.savedstate.vm.tag", c1122xd7858a6e);
            return c1Var;
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.RuntimeException("Failed to access " + cls, e17);
        } catch (java.lang.InstantiationException e18) {
            throw new java.lang.RuntimeException("A " + cls + " cannot be instantiated.", e18);
        } catch (java.lang.reflect.InvocationTargetException e19) {
            throw new java.lang.RuntimeException("An exception happened in constructor of " + cls, e19.getCause());
        }
    }
}
