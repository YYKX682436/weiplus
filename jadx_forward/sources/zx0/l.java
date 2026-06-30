package zx0;

/* loaded from: classes5.dex */
public final class l implements com.p314xaae8f345.p457x3304c6.p461x3a6d265.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f558558a;

    /* renamed from: b, reason: collision with root package name */
    public final float f558559b;

    /* renamed from: c, reason: collision with root package name */
    public float f558560c;

    public l(java.lang.ref.WeakReference weakReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakReference, "weakReference");
        this.f558558a = weakReference;
        this.f558559b = 0.1f;
        this.f558560c = 1.0f;
    }

    public void a(com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.AbstractC4038x66e1e50e abstractC4038x66e1e50e) {
        yx0.b8 b8Var;
        if (abstractC4038x66e1e50e == null || (b8Var = (yx0.b8) this.f558558a.get()) == null) {
            return;
        }
        if (!b8Var.Z()) {
            mx0.e1 e1Var = b8Var.X1;
            if (!(e1Var != null && kz5.z.D0(new mx0.d0[]{mx0.d0.f413435p, mx0.d0.f413436q}).contains(e1Var.f413468b))) {
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.p pVar = abstractC4038x66e1e50e.f129475a;
                int i17 = pVar == null ? -1 : zx0.k.f558557b[pVar.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        return;
                    }
                    com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.C4040x66e962b7 c4040x66e962b7 = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.C4040x66e962b7) abstractC4038x66e1e50e;
                    java.util.Objects.toString(c4040x66e962b7.f129483c);
                    java.util.Objects.toString(c4040x66e962b7.f129476b);
                    if (c4040x66e962b7.f129476b == com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.AbstractC4038x66e1e50e.MJGesturePhase.Ended) {
                        mx0.z zVar = b8Var.f548710d;
                        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e = c4040x66e962b7.f129483c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c3974x289f3e, "getPosition(...)");
                        ((com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar).x0(c3974x289f3e);
                        return;
                    }
                    return;
                }
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.C4039xc7e7c88e c4039xc7e7c88e = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.C4039xc7e7c88e) abstractC4038x66e1e50e;
                java.util.Objects.toString(c4039xc7e7c88e.f129476b);
                com.p314xaae8f345.p457x3304c6.p461x3a6d265.p463xfb865d49.AbstractC4038x66e1e50e.MJGesturePhase mJGesturePhase = c4039xc7e7c88e.f129476b;
                int i18 = mJGesturePhase != null ? zx0.k.f558556a[mJGesturePhase.ordinal()] : -1;
                if (i18 == 1) {
                    this.f558560c = c4039xc7e7c88e.f129482c;
                    return;
                }
                if (i18 == 2 && java.lang.Math.abs(c4039xc7e7c88e.f129482c - this.f558560c) >= this.f558559b) {
                    mx0.z zVar2 = b8Var.f548710d;
                    boolean z17 = c4039xc7e7c88e.f129482c > this.f558560c;
                    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced) zVar2;
                    bs0.j jVar = c10977x8e40eced.f151085q;
                    if (jVar != null) {
                        jVar.mo9383xdd520634();
                    }
                    if (z17) {
                        bs0.j jVar2 = c10977x8e40eced.f151085q;
                        if (jVar2 != null) {
                            jVar2.a();
                        }
                    } else {
                        bs0.j jVar3 = c10977x8e40eced.f151085q;
                        if (jVar3 != null) {
                            jVar3.b();
                        }
                    }
                    this.f558560c = c4039xc7e7c88e.f129482c;
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin-GestureEventCallback", "Ignore gesture event when being isImportPreviewState");
    }
}
