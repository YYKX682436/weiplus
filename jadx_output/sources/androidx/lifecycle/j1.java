package androidx.lifecycle;

/* loaded from: classes13.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.f1 f11632a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.l1 f11633b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j1(androidx.lifecycle.m1 r3) {
        /*
            r2 = this;
            androidx.lifecycle.l1 r0 = r3.getViewModel()
            boolean r1 = r3 instanceof androidx.lifecycle.k
            if (r1 == 0) goto Lf
            androidx.lifecycle.k r3 = (androidx.lifecycle.k) r3
            androidx.lifecycle.f1 r3 = r3.getDefaultViewModelProviderFactory()
            goto L1c
        Lf:
            androidx.lifecycle.h1 r3 = androidx.lifecycle.h1.f11630a
            if (r3 != 0) goto L1a
            androidx.lifecycle.h1 r3 = new androidx.lifecycle.h1
            r3.<init>()
            androidx.lifecycle.h1.f11630a = r3
        L1a:
            androidx.lifecycle.h1 r3 = androidx.lifecycle.h1.f11630a
        L1c:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.j1.<init>(androidx.lifecycle.m1):void");
    }

    public androidx.lifecycle.c1 a(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls);
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public androidx.lifecycle.c1 b(java.lang.String str, java.lang.Class cls) {
        boolean z17;
        androidx.lifecycle.l1 l1Var = this.f11633b;
        androidx.lifecycle.c1 c1Var = (androidx.lifecycle.c1) l1Var.f11636a.get(str);
        boolean isInstance = cls.isInstance(c1Var);
        androidx.lifecycle.f1 f1Var = this.f11632a;
        if (!isInstance) {
            androidx.lifecycle.c1 b17 = f1Var instanceof androidx.lifecycle.g1 ? ((androidx.lifecycle.g1) f1Var).b(str, cls) : f1Var.a(cls);
            androidx.lifecycle.c1 c1Var2 = (androidx.lifecycle.c1) l1Var.f11636a.put(str, b17);
            if (c1Var2 != null) {
                c1Var2.onCleared();
            }
            return b17;
        }
        if (f1Var instanceof androidx.lifecycle.i1) {
            androidx.lifecycle.x0 x0Var = (androidx.lifecycle.x0) ((androidx.lifecycle.i1) f1Var);
            o4.b bVar = x0Var.f11666e;
            androidx.lifecycle.SavedStateHandleController savedStateHandleController = (androidx.lifecycle.SavedStateHandleController) c1Var.getTag("androidx.lifecycle.savedstate.vm.tag");
            if (savedStateHandleController != null && !(z17 = savedStateHandleController.f11590e)) {
                if (z17) {
                    throw new java.lang.IllegalStateException("Already attached to lifecycleOwner");
                }
                savedStateHandleController.f11590e = true;
                androidx.lifecycle.o oVar = x0Var.f11665d;
                oVar.a(savedStateHandleController);
                bVar.b(savedStateHandleController.f11589d, savedStateHandleController.f11591f.f11659d);
                androidx.lifecycle.SavedStateHandleController.a(bVar, oVar);
            }
        }
        return c1Var;
    }

    public j1(androidx.lifecycle.m1 m1Var, androidx.lifecycle.f1 f1Var) {
        this(m1Var.getViewModel(), f1Var);
    }

    public j1(androidx.lifecycle.l1 l1Var, androidx.lifecycle.f1 f1Var) {
        this.f11632a = f1Var;
        this.f11633b = l1Var;
    }
}
