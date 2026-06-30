package oa5;

/* loaded from: classes8.dex */
public class g extends oa5.b {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ref.WeakReference f425400g;

    /* renamed from: h, reason: collision with root package name */
    public long f425401h;

    /* renamed from: l, reason: collision with root package name */
    public android.view.animation.Interpolator f425405l;

    /* renamed from: i, reason: collision with root package name */
    public boolean f425402i = false;

    /* renamed from: j, reason: collision with root package name */
    public long f425403j = 0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f425404k = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f425406m = false;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.Animator.AnimatorListener f425407n = null;

    /* renamed from: o, reason: collision with root package name */
    public final oa5.d f425408o = new oa5.d(this);

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f425409p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Runnable f425410q = new oa5.c(this);

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f425411r = new java.util.HashMap();

    public g(android.view.View view) {
        this.f425400g = new java.lang.ref.WeakReference(view);
    }

    @Override // oa5.b
    public oa5.b a(float f17) {
        q(512, f17);
        return this;
    }

    @Override // oa5.b
    public void c() {
        java.util.HashMap hashMap = this.f425411r;
        if (hashMap.size() > 0) {
            java.util.Iterator it = ((java.util.HashMap) hashMap.clone()).keySet().iterator();
            while (it.hasNext()) {
                ((android.animation.Animator) it.next()).cancel();
            }
        }
        this.f425409p.clear();
        android.view.View view = (android.view.View) this.f425400g.get();
        if (view != null) {
            view.removeCallbacks(this.f425410q);
        }
    }

    @Override // oa5.b
    public oa5.b d(float f17) {
        q(16, f17);
        return this;
    }

    @Override // oa5.b
    public oa5.b e(float f17) {
        q(4, f17);
        return this;
    }

    @Override // oa5.b
    public oa5.b f(float f17) {
        q(8, f17);
        return this;
    }

    @Override // oa5.b
    public oa5.b g(long j17) {
        if (j17 >= 0) {
            this.f425402i = true;
            this.f425401h = j17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("Animators cannot have negative duration: " + j17);
    }

    @Override // oa5.b
    public oa5.b h(android.view.animation.Interpolator interpolator) {
        this.f425406m = true;
        this.f425405l = interpolator;
        return this;
    }

    @Override // oa5.b
    public oa5.b i(android.animation.Animator.AnimatorListener animatorListener) {
        this.f425407n = animatorListener;
        return this;
    }

    @Override // oa5.b
    public oa5.b j(long j17) {
        if (j17 >= 0) {
            this.f425404k = true;
            this.f425403j = j17;
            return this;
        }
        throw new java.lang.IllegalArgumentException("Animators cannot have negative duration: " + j17);
    }

    @Override // oa5.b
    public void l() {
        android.view.View view = (android.view.View) this.f425400g.get();
        if (view != null) {
            view.removeCallbacks(this.f425410q);
        }
        r();
    }

    @Override // oa5.b
    public oa5.b m(float f17) {
        q(1, f17);
        return this;
    }

    @Override // oa5.b
    public oa5.b n(float f17) {
        q(2, f17);
        return this;
    }

    @Override // oa5.b
    public oa5.b o(java.lang.Runnable runnable) {
        this.f425391d = runnable;
        if (runnable != null && this.f425389b == null) {
            this.f425389b = new java.util.HashMap();
        }
        return this;
    }

    @Override // oa5.b
    public oa5.b p(java.lang.Runnable runnable) {
        this.f425390c = runnable;
        if (runnable != null && this.f425388a == null) {
            this.f425388a = new java.util.HashMap();
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(int r13, float r14) {
        /*
            r12 = this;
            java.lang.ref.WeakReference r0 = r12.f425400g
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            r2 = 1
            if (r1 == 0) goto L62
            if (r13 == r2) goto L5d
            r3 = 2
            if (r13 == r3) goto L58
            r3 = 4
            if (r13 == r3) goto L53
            r3 = 8
            if (r13 == r3) goto L4e
            r3 = 16
            if (r13 == r3) goto L49
            r3 = 32
            if (r13 == r3) goto L44
            r3 = 64
            if (r13 == r3) goto L3f
            r3 = 128(0x80, float:1.8E-43)
            if (r13 == r3) goto L3a
            r3 = 256(0x100, float:3.59E-43)
            if (r13 == r3) goto L35
            r3 = 512(0x200, float:7.17E-43)
            if (r13 == r3) goto L30
            goto L62
        L30:
            float r1 = r1.getAlpha()
            goto L63
        L35:
            float r1 = r1.getY()
            goto L63
        L3a:
            float r1 = r1.getX()
            goto L63
        L3f:
            float r1 = r1.getRotationY()
            goto L63
        L44:
            float r1 = r1.getRotationX()
            goto L63
        L49:
            float r1 = r1.getRotation()
            goto L63
        L4e:
            float r1 = r1.getScaleY()
            goto L63
        L53:
            float r1 = r1.getScaleX()
            goto L63
        L58:
            float r1 = r1.getTranslationY()
            goto L63
        L5d:
            float r1 = r1.getTranslationX()
            goto L63
        L62:
            r1 = 0
        L63:
            float r14 = r14 - r1
            java.util.HashMap r3 = r12.f425411r
            int r4 = r3.size()
            if (r4 <= 0) goto Lbc
            java.util.Set r4 = r3.keySet()
            java.util.Iterator r4 = r4.iterator()
        L74:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb6
            java.lang.Object r5 = r4.next()
            android.animation.Animator r5 = (android.animation.Animator) r5
            java.lang.Object r6 = r3.get(r5)
            oa5.f r6 = (oa5.f) r6
            int r7 = r6.f425398a
            r7 = r7 & r13
            r8 = 0
            if (r7 == 0) goto Laf
            java.util.ArrayList r7 = r6.f425399b
            if (r7 == 0) goto Laf
            int r9 = r7.size()
            r10 = r8
        L95:
            if (r10 >= r9) goto Laf
            java.lang.Object r11 = r7.get(r10)
            oa5.e r11 = (oa5.e) r11
            int r11 = r11.f425395a
            if (r11 != r13) goto Lac
            r7.remove(r10)
            int r7 = r6.f425398a
            int r8 = ~r13
            r7 = r7 & r8
            r6.f425398a = r7
            r8 = r2
            goto Laf
        Lac:
            int r10 = r10 + 1
            goto L95
        Laf:
            if (r8 == 0) goto L74
            int r6 = r6.f425398a
            if (r6 != 0) goto L74
            goto Lb7
        Lb6:
            r5 = 0
        Lb7:
            if (r5 == 0) goto Lbc
            r5.cancel()
        Lbc:
            oa5.e r2 = new oa5.e
            r2.<init>(r13, r1, r14)
            java.util.ArrayList r13 = r12.f425409p
            r13.add(r2)
            java.lang.Object r13 = r0.get()
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto Ld6
            java.lang.Runnable r14 = r12.f425410q
            r13.removeCallbacks(r14)
            r13.post(r14)
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa5.g.q(int, float):void");
    }

    public void r() {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f);
        java.util.ArrayList arrayList = this.f425409p;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayList.clone();
        arrayList.clear();
        int size = arrayList2.size();
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            i17 |= ((oa5.e) arrayList2.get(i18)).f425395a;
        }
        java.lang.Runnable runnable = this.f425390c;
        if (runnable != null) {
            this.f425388a.put(ofFloat, runnable);
            this.f425390c = null;
        }
        java.lang.Runnable runnable2 = this.f425391d;
        if (runnable2 != null) {
            this.f425389b.put(ofFloat, runnable2);
            this.f425391d = null;
        }
        this.f425411r.put(ofFloat, new oa5.f(i17, arrayList2));
        oa5.d dVar = this.f425408o;
        ofFloat.addUpdateListener(dVar);
        ofFloat.addListener(dVar);
        if (this.f425404k) {
            ofFloat.setStartDelay(this.f425403j);
        }
        if (this.f425402i) {
            ofFloat.setDuration(this.f425401h);
        }
        if (this.f425406m) {
            ofFloat.setInterpolator(this.f425405l);
        }
        ofFloat.start();
    }
}
