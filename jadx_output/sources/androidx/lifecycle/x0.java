package androidx.lifecycle;

/* loaded from: classes13.dex */
public final class x0 extends androidx.lifecycle.g1 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Class[] f11660f = {android.app.Application.class, androidx.lifecycle.v0.class};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Class[] f11661g = {androidx.lifecycle.v0.class};

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Application f11662a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.f1 f11663b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f11664c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.o f11665d;

    /* renamed from: e, reason: collision with root package name */
    public final o4.b f11666e;

    public x0(android.app.Application application, o4.g gVar, android.os.Bundle bundle) {
        androidx.lifecycle.f1 f1Var;
        this.f11666e = gVar.getSavedStateRegistry();
        this.f11665d = gVar.mo133getLifecycle();
        this.f11664c = bundle;
        this.f11662a = application;
        if (application != null) {
            if (androidx.lifecycle.e1.f11621c == null) {
                androidx.lifecycle.e1.f11621c = new androidx.lifecycle.e1(application);
            }
            f1Var = androidx.lifecycle.e1.f11621c;
        } else {
            if (androidx.lifecycle.h1.f11630a == null) {
                androidx.lifecycle.h1.f11630a = new androidx.lifecycle.h1();
            }
            f1Var = androidx.lifecycle.h1.f11630a;
        }
        this.f11663b = f1Var;
    }

    @Override // androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(canonicalName, cls);
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.g1
    public androidx.lifecycle.c1 b(java.lang.String str, java.lang.Class cls) {
        androidx.lifecycle.v0 v0Var;
        boolean isAssignableFrom = androidx.lifecycle.a.class.isAssignableFrom(cls);
        java.lang.reflect.Constructor<?> constructor = null;
        android.app.Application application = this.f11662a;
        if (!isAssignableFrom || application == null) {
            java.lang.Class[] clsArr = f11661g;
            for (java.lang.reflect.Constructor<?> constructor2 : cls.getConstructors()) {
                if (java.util.Arrays.equals(clsArr, constructor2.getParameterTypes())) {
                    constructor = constructor2;
                    break;
                }
            }
        } else {
            java.lang.Class[] clsArr2 = f11660f;
            for (java.lang.reflect.Constructor<?> constructor22 : cls.getConstructors()) {
                if (java.util.Arrays.equals(clsArr2, constructor22.getParameterTypes())) {
                    constructor = constructor22;
                    break;
                }
            }
        }
        if (constructor == null) {
            return this.f11663b.a(cls);
        }
        o4.b bVar = this.f11666e;
        android.os.Bundle a17 = bVar.a(str);
        java.lang.Class[] clsArr3 = androidx.lifecycle.v0.f11655e;
        android.os.Bundle bundle = this.f11664c;
        if (a17 == null && bundle == null) {
            v0Var = new androidx.lifecycle.v0();
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            if (bundle != null) {
                for (java.lang.String str2 : bundle.keySet()) {
                    hashMap.put(str2, bundle.get(str2));
                }
            }
            if (a17 == null) {
                v0Var = new androidx.lifecycle.v0(hashMap);
            } else {
                java.util.ArrayList parcelableArrayList = a17.getParcelableArrayList("keys");
                java.util.ArrayList parcelableArrayList2 = a17.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new java.lang.IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i17 = 0; i17 < parcelableArrayList.size(); i17++) {
                    hashMap.put((java.lang.String) parcelableArrayList.get(i17), parcelableArrayList2.get(i17));
                }
                v0Var = new androidx.lifecycle.v0(hashMap);
            }
        }
        androidx.lifecycle.SavedStateHandleController savedStateHandleController = new androidx.lifecycle.SavedStateHandleController(str, v0Var);
        if (savedStateHandleController.f11590e) {
            throw new java.lang.IllegalStateException("Already attached to lifecycleOwner");
        }
        savedStateHandleController.f11590e = true;
        androidx.lifecycle.o oVar = this.f11665d;
        oVar.a(savedStateHandleController);
        androidx.lifecycle.v0 v0Var2 = savedStateHandleController.f11591f;
        bVar.b(savedStateHandleController.f11589d, v0Var2.f11659d);
        androidx.lifecycle.SavedStateHandleController.a(bVar, oVar);
        try {
            androidx.lifecycle.c1 c1Var = (!isAssignableFrom || application == null) ? (androidx.lifecycle.c1) constructor.newInstance(v0Var2) : (androidx.lifecycle.c1) constructor.newInstance(application, v0Var2);
            c1Var.setTagIfAbsent("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
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
