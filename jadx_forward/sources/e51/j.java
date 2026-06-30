package e51;

/* loaded from: classes11.dex */
public class j implements e51.l {
    public float A;
    public java.lang.Float B;
    public java.lang.Float C;
    public long D;
    public float E;
    public float F;
    public long G;
    public e51.i H;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Random f331113a;

    /* renamed from: b, reason: collision with root package name */
    public e51.f f331114b;

    /* renamed from: c, reason: collision with root package name */
    public e51.k f331115c;

    /* renamed from: d, reason: collision with root package name */
    public g51.a f331116d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d f331117e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Queue f331118f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f331119g;

    /* renamed from: h, reason: collision with root package name */
    public android.animation.ValueAnimator f331120h;

    /* renamed from: i, reason: collision with root package name */
    public long f331121i;

    /* renamed from: j, reason: collision with root package name */
    public int f331122j;

    /* renamed from: k, reason: collision with root package name */
    public long f331123k;

    /* renamed from: l, reason: collision with root package name */
    public float f331124l;

    /* renamed from: m, reason: collision with root package name */
    public float f331125m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.animation.Interpolator f331126n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f331127o;

    /* renamed from: p, reason: collision with root package name */
    public float f331128p;

    /* renamed from: q, reason: collision with root package name */
    public float f331129q;

    /* renamed from: r, reason: collision with root package name */
    public float f331130r;

    /* renamed from: s, reason: collision with root package name */
    public float f331131s;

    /* renamed from: t, reason: collision with root package name */
    public float f331132t;

    /* renamed from: u, reason: collision with root package name */
    public float f331133u;

    /* renamed from: v, reason: collision with root package name */
    public float f331134v;

    /* renamed from: w, reason: collision with root package name */
    public float f331135w;

    /* renamed from: x, reason: collision with root package name */
    public int f331136x;

    /* renamed from: y, reason: collision with root package name */
    public int f331137y;

    /* renamed from: z, reason: collision with root package name */
    public float f331138z;

    public j(android.content.Context context, e51.f fVar, e51.k kVar, g51.a aVar) {
        com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d a17 = com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d.a(context);
        this.f331113a = new java.util.Random();
        this.f331118f = new java.util.LinkedList();
        this.f331119g = new java.util.ArrayList(300);
        this.G = 0L;
        this.H = null;
        c(fVar, kVar, aVar, a17);
    }

    public final void a(int i17, long j17) {
        for (int i18 = 0; i18 < i17; i18++) {
            f51.b bVar = (f51.b) ((java.util.LinkedList) this.f331118f).poll();
            java.util.Random random = this.f331113a;
            if (bVar == null) {
                bVar = this.f331114b.a(random);
            }
            e51.k kVar = this.f331115c;
            bVar.i();
            bVar.f341133d = j17;
            float nextFloat = random.nextFloat();
            bVar.f341134e = kVar.f331139a + ((kVar.f331141c - r5) * nextFloat);
            float nextFloat2 = random.nextFloat();
            bVar.f341135f = kVar.f331140b + ((kVar.f331142d - r5) * nextFloat2);
            bVar.f341136g = b(this.f331128p, this.f331129q, random);
            bVar.f341137h = b(this.f331130r, this.f331131s, random);
            bVar.f341138i = b(this.f331132t, this.f331133u, random);
            bVar.f341139j = b(this.f331134v, this.f331135w, random);
            java.lang.Float f17 = null;
            bVar.f341140k = null;
            bVar.f341141l = null;
            bVar.f341144o = b(this.f331136x, this.f331137y, random);
            bVar.f341145p = b(0.0f, 0.0f, random);
            bVar.f341146q = b(this.f331138z, this.A, random);
            java.lang.Float f18 = this.B;
            if (f18 != null) {
                f17 = java.lang.Float.valueOf(b(f18.floatValue(), this.C.floatValue(), random));
            }
            bVar.f341147r = f17;
            bVar.f341149t = this.D;
            bVar.f341150u = this.f331126n;
            bVar.f341151v = b(this.E, this.F, random);
            bVar.h(this.f331127o);
            ((java.util.ArrayList) this.f331119g).add(bVar);
        }
    }

    public final float b(float f17, float f18, java.util.Random random) {
        return f17 + (f18 * ((random.nextFloat() * 2.0f) - 1.0f));
    }

    public void c(e51.f fVar, e51.k kVar, g51.a aVar, com.p314xaae8f345.mm.p997x94b162ad.ViewOnLayoutChangeListenerC11317x5d86a76d viewOnLayoutChangeListenerC11317x5d86a76d) {
        this.f331114b = fVar;
        this.f331115c = kVar;
        this.f331116d = aVar;
        this.f331117e = viewOnLayoutChangeListenerC11317x5d86a76d;
        viewOnLayoutChangeListenerC11317x5d86a76d.f153896d = this.f331119g;
        viewOnLayoutChangeListenerC11317x5d86a76d.addOnAttachStateChangeListener(new e51.g(this));
        this.D = -1L;
        this.f331127o = new android.graphics.Rect(0, 0, aVar.mo130912x755bd410(), aVar.mo130911x1c4fb41d());
    }

    public e51.j d() {
        android.animation.ValueAnimator valueAnimator = this.f331120h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f331121i = 0L;
        java.util.Iterator it = ((java.util.ArrayList) this.f331119g).iterator();
        while (it.hasNext()) {
            ((java.util.LinkedList) this.f331118f).add((f51.b) it.next());
            it.remove();
        }
        this.f331116d.c(this.f331117e);
        this.f331117e.f153897e = false;
        a(this.f331122j, 0L);
        return this;
    }

    public e51.j e(float f17) {
        this.B = java.lang.Float.valueOf(f17 / 1000.0f);
        this.C = java.lang.Float.valueOf(0.0f);
        return this;
    }

    public e51.j f(float f17, float f18) {
        this.f331130r = f17 / 1000.0f;
        this.f331131s = f18 / 1000.0f;
        return this;
    }

    public void g() {
        android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofInt(0).setDuration(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
        this.f331120h = duration;
        duration.addUpdateListener(new e51.h(this));
        this.f331120h.start();
    }

    public void h() {
        android.animation.ValueAnimator valueAnimator = this.f331120h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f331116d.b(this.f331117e);
        e51.i iVar = this.H;
        if (iVar != null) {
            zl2.b bVar = (zl2.b) iVar;
            if (bVar.f555195a == null) {
                bVar.f555195a = new java.util.concurrent.ConcurrentLinkedQueue();
            }
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = bVar.f555195a;
            if (concurrentLinkedQueue != null) {
                boolean z17 = concurrentLinkedQueue.size() <= 50 && !concurrentLinkedQueue.contains(this);
                concurrentLinkedQueue.size();
                if (z17) {
                    concurrentLinkedQueue.add(this);
                }
            }
            ((java.util.LinkedList) this.f331118f).clear();
        }
    }

    public final void i(long j17) {
        long j18;
        if (j17 < this.f331123k) {
            long j19 = this.f331121i;
            if (j19 == 0) {
                this.f331121i = j17;
            } else {
                int nextFloat = (int) (this.f331113a.nextFloat() * this.f331124l * ((float) (j17 - j19)));
                if (nextFloat > 0) {
                    this.f331121i = ((float) this.f331121i) + (this.f331125m * nextFloat);
                    a(nextFloat, j17);
                }
            }
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f331119g).iterator();
        while (it.hasNext()) {
            f51.b bVar = (f51.b) it.next();
            if (bVar.f341133d == -1) {
                bVar.f341133d = j17;
            }
            long j27 = j17 - bVar.f341133d;
            boolean z17 = j27 >= 0;
            bVar.B = z17;
            if (z17 && !bVar.C) {
                bVar.f341153x = bVar.b(j27, bVar.f341134e, bVar.f341136g, bVar.f341138i, bVar.f341142m, bVar.f341140k);
                bVar.f341154y = bVar.b(j27, bVar.f341135f, bVar.f341137h, bVar.f341139j, bVar.f341143n, bVar.f341141l);
                bVar.f341155z = bVar.b(j27, bVar.f341144o, bVar.f341145p, bVar.f341146q, bVar.f341148s, bVar.f341147r);
                android.view.animation.Interpolator interpolator = bVar.f341150u;
                if (interpolator != null) {
                    j18 = j27;
                    bVar.A = (int) (interpolator.getInterpolation(((float) j18) / bVar.f341151v) * 255.0f);
                } else {
                    j18 = j27;
                    bVar.A = 255;
                }
                bVar.C = !bVar.D && ((float) j18) >= bVar.f341151v;
                bVar.f341152w = java.lang.Math.min(1.0f, ((float) j18) / bVar.f341151v);
            }
            if (!(!bVar.C)) {
                it.remove();
                ((java.util.LinkedList) this.f331118f).add(bVar);
            }
        }
    }
}
