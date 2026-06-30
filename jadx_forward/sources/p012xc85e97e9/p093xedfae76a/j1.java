package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.f1 f93165a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.l1 f93166b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j1(p012xc85e97e9.p093xedfae76a.m1 r3) {
        /*
            r2 = this;
            androidx.lifecycle.l1 r0 = r3.getViewModel()
            boolean r1 = r3 instanceof p012xc85e97e9.p093xedfae76a.k
            if (r1 == 0) goto Lf
            androidx.lifecycle.k r3 = (p012xc85e97e9.p093xedfae76a.k) r3
            androidx.lifecycle.f1 r3 = r3.mo2508xff1f76e0()
            goto L1c
        Lf:
            androidx.lifecycle.h1 r3 = p012xc85e97e9.p093xedfae76a.h1.f93163a
            if (r3 != 0) goto L1a
            androidx.lifecycle.h1 r3 = new androidx.lifecycle.h1
            r3.<init>()
            p012xc85e97e9.p093xedfae76a.h1.f93163a = r3
        L1a:
            androidx.lifecycle.h1 r3 = p012xc85e97e9.p093xedfae76a.h1.f93163a
        L1c:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p093xedfae76a.j1.<init>(androidx.lifecycle.m1):void");
    }

    public p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class cls) {
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName), cls);
        }
        throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p012xc85e97e9.p093xedfae76a.c1 b(java.lang.String str, java.lang.Class cls) {
        boolean z17;
        p012xc85e97e9.p093xedfae76a.l1 l1Var = this.f93166b;
        p012xc85e97e9.p093xedfae76a.c1 c1Var = (p012xc85e97e9.p093xedfae76a.c1) l1Var.f93169a.get(str);
        boolean isInstance = cls.isInstance(c1Var);
        p012xc85e97e9.p093xedfae76a.f1 f1Var = this.f93165a;
        if (!isInstance) {
            p012xc85e97e9.p093xedfae76a.c1 b17 = f1Var instanceof p012xc85e97e9.p093xedfae76a.g1 ? ((p012xc85e97e9.p093xedfae76a.g1) f1Var).b(str, cls) : f1Var.a(cls);
            p012xc85e97e9.p093xedfae76a.c1 c1Var2 = (p012xc85e97e9.p093xedfae76a.c1) l1Var.f93169a.put(str, b17);
            if (c1Var2 != null) {
                c1Var2.mo528x82b764cd();
            }
            return b17;
        }
        if (f1Var instanceof p012xc85e97e9.p093xedfae76a.i1) {
            p012xc85e97e9.p093xedfae76a.x0 x0Var = (p012xc85e97e9.p093xedfae76a.x0) ((p012xc85e97e9.p093xedfae76a.i1) f1Var);
            o4.b bVar = x0Var.f93199e;
            p012xc85e97e9.p093xedfae76a.C1122xd7858a6e c1122xd7858a6e = (p012xc85e97e9.p093xedfae76a.C1122xd7858a6e) c1Var.m7791xb5887064("androidx.lifecycle.savedstate.vm.tag");
            if (c1122xd7858a6e != null && !(z17 = c1122xd7858a6e.f93123e)) {
                if (z17) {
                    throw new java.lang.IllegalStateException("Already attached to lifecycleOwner");
                }
                c1122xd7858a6e.f93123e = true;
                p012xc85e97e9.p093xedfae76a.o oVar = x0Var.f93198d;
                oVar.a(c1122xd7858a6e);
                bVar.b(c1122xd7858a6e.f93122d, c1122xd7858a6e.f93124f.f93192d);
                p012xc85e97e9.p093xedfae76a.C1122xd7858a6e.a(bVar, oVar);
            }
        }
        return c1Var;
    }

    public j1(p012xc85e97e9.p093xedfae76a.m1 m1Var, p012xc85e97e9.p093xedfae76a.f1 f1Var) {
        this(m1Var.getViewModel(), f1Var);
    }

    public j1(p012xc85e97e9.p093xedfae76a.l1 l1Var, p012xc85e97e9.p093xedfae76a.f1 f1Var) {
        this.f93165a = f1Var;
        this.f93166b = l1Var;
    }
}
