package rp0;

/* loaded from: classes7.dex */
public final class e implements qp0.b {

    /* renamed from: a, reason: collision with root package name */
    public final qp0.a f479874a;

    /* renamed from: b, reason: collision with root package name */
    public final long f479875b;

    /* renamed from: c, reason: collision with root package name */
    public final double f479876c;

    /* renamed from: d, reason: collision with root package name */
    public final int f479877d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f479878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f479879f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f479880g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f479881h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f479882i;

    /* renamed from: j, reason: collision with root package name */
    public int f479883j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Runnable f479884k;

    public e(qp0.a delegate, long j17, double d17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i18 & 2) != 0 ? com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d : j17;
        d17 = (i18 & 4) != 0 ? 0.0d : d17;
        i17 = (i18 & 8) != 0 ? 5 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f479874a = delegate;
        this.f479875b = j17;
        this.f479876c = d17;
        this.f479877d = i17;
        this.f479878e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        this.f479879f = true;
        this.f479881h = new rp0.c(this);
    }

    public final void b(boolean z17) {
        mc3.f fVar = (mc3.f) this.f479874a;
        java.util.Set set = fVar.f407163i;
        if (z17) {
            java.util.Iterator it = ((java.util.HashSet) set).iterator();
            while (it.hasNext()) {
                ((jc3.l0) it.next()).i1();
            }
        } else {
            java.util.Iterator it6 = ((java.util.HashSet) set).iterator();
            while (it6.hasNext()) {
                ((jc3.l0) it6.next()).mo252xac79a11b();
            }
        }
        fVar.mo147148x5cd39ffa();
        this.f479882i = null;
    }

    public final void c(boolean z17, long j17) {
        long e17 = s26.a.e(j17);
        if (0 == e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "try destroy, destroy right now");
            b(z17);
            return;
        }
        if (this.f479882i != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "try destroy, but already post destroy task");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "try destroy, cacheTime: " + ((java.lang.Object) s26.a.h(j17)) + ", isPreload: " + z17);
        rp0.b bVar = new rp0.b(this, z17);
        this.f479882i = bVar;
        this.f479878e.mo50297x7c4d7ca2(bVar, e17);
    }

    public void d() {
        jz5.f0 f0Var;
        if (this.f479880g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "try pause, but waiting for pause now");
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "post delay pause task");
            rp0.a aVar = new rp0.a(this);
            this.f479880g = aVar;
            this.f479878e.mo50297x7c4d7ca2(aVar, this.f479875b);
        }
    }

    public void e(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "try resume, isTemp: " + z17);
        boolean z18 = this.f479879f;
        java.lang.Runnable runnable = this.f479881h;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f479878e;
        if (z18) {
            qp0.a aVar = this.f479874a;
            if (((mc3.f) aVar).f407161g) {
                aVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "try resume, is foreground, resume");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "post resume task");
                java.lang.Runnable runnable2 = this.f479880g;
                if (runnable2 != null) {
                    n3Var.mo50300x3fa464aa(runnable2);
                }
                n3Var.mo50293x3498a0(runnable);
                return;
            }
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "try resume, is not foreground, try pause");
            d();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "try resume, temp resume");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "post resume task");
        java.lang.Runnable runnable3 = this.f479880g;
        if (runnable3 != null) {
            n3Var.mo50300x3fa464aa(runnable3);
        }
        n3Var.mo50293x3498a0(runnable);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAutoLifecycleExt", "post delay pause task");
        rp0.a aVar2 = new rp0.a(this);
        this.f479880g = aVar2;
        n3Var.mo50297x7c4d7ca2(aVar2, this.f479875b);
    }
}
