package com.p314xaae8f345.mm.p2633x99f0578a.ui;

/* renamed from: com.tencent.mm.transvoice.ui.SoundWaveView */
/* loaded from: classes14.dex */
public class C21330xc127fb4d extends android.view.View {
    public double A;
    public final java.lang.Runnable B;
    public int C;
    public final ca5.h D;

    /* renamed from: d, reason: collision with root package name */
    public ca5.k f277960d;

    /* renamed from: e, reason: collision with root package name */
    public ca5.i f277961e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f277962f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f277963g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f277964h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f277965i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f277966m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.animation.Interpolator f277967n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Paint f277968o;

    /* renamed from: p, reason: collision with root package name */
    public int f277969p;

    /* renamed from: q, reason: collision with root package name */
    public int f277970q;

    /* renamed from: r, reason: collision with root package name */
    public int f277971r;

    /* renamed from: s, reason: collision with root package name */
    public int f277972s;

    /* renamed from: t, reason: collision with root package name */
    public int f277973t;

    /* renamed from: u, reason: collision with root package name */
    public int f277974u;

    /* renamed from: v, reason: collision with root package name */
    public int f277975v;

    /* renamed from: w, reason: collision with root package name */
    public int f277976w;

    /* renamed from: x, reason: collision with root package name */
    public int f277977x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f277978y;

    /* renamed from: z, reason: collision with root package name */
    public int f277979z;

    public C21330xc127fb4d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: getActiveBundleIndex */
    private int m78269xc77039d4() {
        int i17 = this.C;
        ca5.h hVar = this.D;
        if (-1 == i17) {
            int nextInt = new java.util.Random().nextInt((hVar.f121623b - hVar.f121622a) + 1) + hVar.f121622a;
            this.C = nextInt;
            return nextInt;
        }
        int nextInt2 = new java.util.Random().nextInt(3);
        if (1 == nextInt2) {
            int i18 = this.C - 1;
            if (!c(i18)) {
                return i18;
            }
            int i19 = this.C + 1;
            if (!c(i19)) {
                return i19;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "getActiveBundleIndex, keep! %s %s", java.lang.Integer.valueOf(this.C), hVar);
            return this.C;
        }
        if (2 != nextInt2) {
            return this.C;
        }
        int i27 = this.C + 1;
        if (!c(i27)) {
            return i27;
        }
        int i28 = this.C - 1;
        if (!c(i28)) {
            return i28;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "getActiveBundleIndex, keep! %s %s", java.lang.Integer.valueOf(this.C), hVar);
        return this.C;
    }

    /* renamed from: getBundleCount */
    private int m78270xc9af7877() {
        float[] fArr = ca5.j.f121628a;
        return ca5.k.MINI == this.f277960d ? 2 : 5;
    }

    /* renamed from: getVolumeItemCount */
    private int m78271x1ec6418c() {
        int m78270xc9af7877 = m78270xc9af7877();
        float[] fArr = ca5.j.f121628a;
        return m78270xc9af7877 * 5;
    }

    public final void a() {
        int m78270xc9af7877 = m78270xc9af7877();
        int i17 = m78270xc9af7877 / 2;
        int i18 = i17 - 1;
        if (i18 < 0) {
            i18 = 0;
        }
        int i19 = i17 + 1;
        if (i19 >= m78270xc9af7877) {
            i19 = m78270xc9af7877 - 1;
        }
        ca5.h hVar = this.D;
        hVar.f121622a = i18;
        hVar.f121623b = i19;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "initBaseBundleGroupInfo: %s", hVar.m14576x9616526c());
    }

    public final void b() {
        this.f277964h.clear();
        int m78271x1ec6418c = m78271x1ec6418c();
        for (int i17 = 0; i17 < m78271x1ec6418c; i17++) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            float[] fArr = ca5.j.f121628a;
            animatorSet.setStartDelay(100 * i17);
            animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
            ca5.f fVar = new ca5.f(this, i17);
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(this.f277972s, this.f277974u);
            long j17 = 500;
            ofInt.setDuration(j17);
            ofInt.addUpdateListener(fVar);
            android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(this.f277974u, this.f277972s);
            ofInt2.setDuration(j17);
            ofInt2.addUpdateListener(fVar);
            int i18 = this.f277972s;
            android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(i18, i18);
            ofInt3.setDuration(1000);
            ofInt3.addUpdateListener(fVar);
            animatorSet.addListener(new ca5.g(this, i17));
            animatorSet.playSequentially(ofInt, ofInt2, ofInt3);
            this.f277964h.add(animatorSet);
        }
    }

    public final boolean c(int i17) {
        ca5.h hVar = this.D;
        return !(i17 >= hVar.f121622a && i17 <= hVar.f121623b);
    }

    public void d() {
        java.util.Iterator it = ((java.util.ArrayList) this.f277965i).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.List list = (java.util.List) it.next();
            for (int i17 = 0; i17 < list.size(); i17++) {
                list.set(i17, java.lang.Float.valueOf(this.f277972s));
            }
        }
        java.util.Iterator it6 = ((java.util.ArrayList) this.f277966m).iterator();
        while (it6.hasNext()) {
            java.util.List list2 = (java.util.List) it6.next();
            for (int i18 = 0; i18 < list2.size(); i18++) {
                list2.set(i18, java.lang.Float.valueOf(this.f277972s));
            }
        }
        this.f277961e = ca5.i.WAITING;
        this.C = -1;
        f();
        java.util.Iterator it7 = this.f277964h.iterator();
        while (it7.hasNext()) {
            ((android.animation.AnimatorSet) it7.next()).end();
        }
        java.util.Iterator it8 = this.f277964h.iterator();
        while (it8.hasNext()) {
            ((android.animation.AnimatorSet) it8.next()).start();
        }
    }

    public final void e() {
        int m78270xc9af7877 = m78270xc9af7877();
        for (int i17 = 0; i17 < m78270xc9af7877; i17++) {
            this.f277962f.set(i17, java.lang.Integer.valueOf(this.f277972s));
        }
    }

    public final void f() {
        int m78271x1ec6418c = m78271x1ec6418c();
        for (int i17 = 0; i17 < m78271x1ec6418c; i17++) {
            this.f277963g.set(i17, java.lang.Integer.valueOf(this.f277972s));
        }
    }

    public final void g(float f17, java.util.List list) {
        float[] fArr = ca5.j.f121628a;
        for (int i17 = 0; i17 < 5; i17++) {
            float[] fArr2 = ca5.j.f121628a;
            int i18 = 2 - i17;
            float pow = (float) (f17 * java.lang.Math.pow(0.8f, java.lang.Math.abs(i18)));
            if (2 == java.lang.Math.abs(i18)) {
                postDelayed(new ca5.d(this, list, i17, pow), 320L);
            } else if (1 == java.lang.Math.abs(i18)) {
                postDelayed(new ca5.e(this, list, i17, pow), 160L);
            } else if (java.lang.Math.abs(i18) == 0) {
                list.set(i17, java.lang.Float.valueOf(pow));
            }
        }
    }

    public void h(ca5.k kVar) {
        this.f277960d = kVar;
        e();
        f();
        a();
        b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "update style %s", this.f277960d);
        requestLayout();
        d();
    }

    public void i(int i17) {
        float f17 = i17 / 100.0f;
        double d17 = f17;
        double d18 = this.A;
        java.lang.Runnable runnable = this.B;
        ca5.i iVar = ca5.i.JUDGING;
        ca5.i iVar2 = ca5.i.REACTING;
        if (d17 > d18) {
            if (iVar == this.f277961e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "cancel judging!!!");
                this.f277961e = iVar2;
                removeCallbacks(runnable);
            }
            if (ca5.i.WAITING == this.f277961e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "active reacting!!!");
                this.f277961e = iVar2;
                java.util.Iterator it = this.f277964h.iterator();
                while (it.hasNext()) {
                    ((android.animation.AnimatorSet) it.next()).end();
                }
            }
        } else if (iVar2 == this.f277961e) {
            this.f277961e = iVar;
            postDelayed(runnable, 300);
        }
        ca5.i iVar3 = this.f277961e;
        if (iVar2 == iVar3 || iVar == iVar3) {
            e();
            int interpolation = (int) (this.f277967n.getInterpolation(f17) * this.f277973t);
            int m78269xc77039d4 = m78269xc77039d4();
            this.f277962f.set(m78269xc77039d4, java.lang.Integer.valueOf(interpolation));
            int nextInt = new java.util.Random().nextInt(2);
            ca5.h hVar = this.D;
            int i18 = hVar.f121622a;
            float[] fArr = ca5.j.f121628a;
            if (i18 == m78269xc77039d4) {
                float f18 = interpolation;
                this.f277962f.set(hVar.f121623b, java.lang.Integer.valueOf((int) (fArr[nextInt] * f18)));
                int i19 = hVar.f121623b;
                if (i19 - 1 != hVar.f121622a) {
                    this.f277962f.set(i19 - 1, java.lang.Integer.valueOf((int) (f18 * fArr[1 - nextInt])));
                }
            } else if (hVar.f121623b == m78269xc77039d4) {
                float f19 = interpolation;
                this.f277962f.set(i18, java.lang.Integer.valueOf((int) (fArr[nextInt] * f19)));
                int i27 = hVar.f121622a + 1;
                if (i27 != hVar.f121623b) {
                    this.f277962f.set(i27, java.lang.Integer.valueOf((int) (f19 * fArr[1 - nextInt])));
                }
            } else {
                float f27 = interpolation;
                this.f277962f.set(i18, java.lang.Integer.valueOf((int) (fArr[nextInt] * f27)));
                this.f277962f.set(hVar.f121623b, java.lang.Integer.valueOf((int) (f27 * fArr[nextInt])));
            }
            int m78270xc9af7877 = m78270xc9af7877();
            int nextInt2 = new java.util.Random().nextInt(2);
            java.util.List list = this.f277966m;
            float[] fArr2 = ca5.j.f121629b;
            int i28 = 0;
            if (m78270xc9af7877 == 5) {
                int i29 = m78270xc9af7877 / 2;
                while (i28 < m78270xc9af7877) {
                    if (c(i28)) {
                        this.f277962f.set(i28, java.lang.Integer.valueOf((int) (interpolation * fArr2[nextInt2])));
                        nextInt2 = 1 - nextInt2;
                    }
                    int i37 = i29 - i28;
                    if (2 == java.lang.Math.abs(i37)) {
                        postDelayed(new ca5.b(this, i28), 320L);
                    } else if (1 == java.lang.Math.abs(i37)) {
                        postDelayed(new ca5.c(this, i28), 160L);
                    } else if (java.lang.Math.abs(i37) == 0) {
                        g(((java.lang.Integer) this.f277962f.get(i28)).intValue(), (java.util.List) ((java.util.ArrayList) list).get(i28));
                    }
                    i28++;
                }
            } else {
                while (i28 < m78270xc9af7877) {
                    if (c(i28)) {
                        this.f277962f.set(i28, java.lang.Integer.valueOf((int) (interpolation * fArr2[nextInt2])));
                        nextInt2 = 1 - nextInt2;
                    }
                    g(((java.lang.Integer) this.f277962f.get(i28)).intValue(), (java.util.List) ((java.util.ArrayList) list).get(i28));
                    i28++;
                }
            }
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.util.List list;
        super.onDraw(canvas);
        ca5.i iVar = ca5.i.REACTING;
        ca5.i iVar2 = this.f277961e;
        int i17 = 0;
        if (iVar == iVar2 || ca5.i.JUDGING == iVar2) {
            int m78270xc9af7877 = m78270xc9af7877();
            for (int i18 = 0; i18 < m78270xc9af7877; i18++) {
                ((java.lang.Integer) this.f277962f.get(i18)).intValue();
                float[] fArr = ca5.j.f121628a;
                int i19 = 0;
                while (true) {
                    list = this.f277965i;
                    if (i19 >= 5) {
                        break;
                    }
                    float floatValue = ((java.lang.Float) ((java.util.List) ((java.util.ArrayList) this.f277966m).get(i18)).get(i19)).floatValue();
                    java.util.ArrayList arrayList = (java.util.ArrayList) list;
                    float floatValue2 = ((java.lang.Float) ((java.util.List) arrayList.get(i18)).get(i19)).floatValue();
                    ((java.util.List) arrayList.get(i18)).set(i19, java.lang.Float.valueOf(floatValue2 + ((floatValue - floatValue2) / 6.0f)));
                    i19++;
                }
                int i27 = (this.f277975v * i18) + (this.f277970q * i18);
                for (int i28 = 0; i28 < 5; i28++) {
                    int i29 = (this.f277969p * i28) + (this.f277970q * i28) + i27;
                    float floatValue3 = ((java.lang.Float) ((java.util.List) ((java.util.ArrayList) list).get(i18)).get(i28)).floatValue();
                    float f17 = this.f277972s;
                    if (floatValue3 < f17) {
                        floatValue3 = f17;
                    }
                    float f18 = this.f277973t;
                    if (floatValue3 > f18) {
                        floatValue3 = f18;
                    }
                    float f19 = (this.f277977x - floatValue3) / 2.0f;
                    float f27 = i29;
                    float f28 = this.f277969p + i29;
                    float f29 = this.f277971r;
                    canvas.drawRoundRect(f27, f19, f28, f19 + floatValue3, f29, f29, this.f277968o);
                }
            }
        } else if (ca5.i.WAITING == iVar2) {
            int m78271x1ec6418c = m78271x1ec6418c();
            while (i17 < m78271x1ec6418c) {
                int i37 = i17 + 1;
                int i38 = (this.f277976w - (this.f277969p * i37)) - (this.f277970q * i17);
                int intValue = (this.f277977x - ((java.lang.Integer) this.f277963g.get(i17)).intValue()) / 2;
                int i39 = this.f277969p + i38;
                float intValue2 = ((java.lang.Integer) this.f277963g.get(i17)).intValue() + intValue;
                int i47 = this.f277971r;
                canvas.drawRoundRect(i38, intValue, i39, intValue2, i47, i47, this.f277968o);
                i17 = i37;
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (ca5.k.MINI == this.f277960d) {
            this.f277976w = com.p314xaae8f345.mm.ui.zk.a(getContext(), ca5.j.f121632e);
        } else if (this.f277978y) {
            this.f277976w = com.p314xaae8f345.mm.ui.zk.a(getContext(), this.f277979z);
        } else {
            this.f277976w = com.p314xaae8f345.mm.ui.zk.a(getContext(), ca5.j.f121631d);
        }
        setMeasuredDimension(this.f277976w, this.f277977x);
    }

    /* renamed from: setStyle */
    public void m78272x53b6de6f(ca5.k kVar) {
        this.f277960d = kVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "set style %s", kVar);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            d();
        }
    }

    /* renamed from: setVolumeChange */
    public void m78273x167b38ec(double d17) {
        this.A = d17;
    }

    /* renamed from: setWaveColor */
    public void m78274xb63fd1a8(int i17) {
        android.graphics.Paint paint = this.f277968o;
        if (paint != null) {
            paint.setColor(i17);
            invalidate();
        }
    }

    public C21330xc127fb4d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        ca5.k kVar = ca5.k.NORMAL;
        this.f277960d = kVar;
        this.f277961e = ca5.i.WAITING;
        this.f277965i = new java.util.ArrayList();
        this.f277966m = new java.util.ArrayList();
        int i18 = 0;
        this.f277978y = false;
        this.A = 0.05d;
        this.B = new ca5.a(this);
        this.C = -1;
        this.D = new ca5.h(this, null);
        float[] fArr = ca5.j.f121628a;
        int parseColor = android.graphics.Color.parseColor("#000000");
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hi0.a.f363016a, 0, 0);
            int i19 = obtainStyledAttributes.getInt(1, 0);
            if (i19 == 0) {
                this.f277960d = kVar;
            } else if (i19 == 1) {
                this.f277960d = ca5.k.MINI;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NewTrans2Txt.SoundWaveView", "style err! %s", java.lang.Integer.valueOf(i19));
            }
            int color = obtainStyledAttributes.getColor(0, android.graphics.Color.parseColor("#000000"));
            obtainStyledAttributes.recycle();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "init style %s", this.f277960d);
            parseColor = color;
        }
        this.f277969p = com.p314xaae8f345.mm.ui.zk.a(getContext(), 2);
        this.f277970q = com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        this.f277971r = com.p314xaae8f345.mm.ui.zk.a(getContext(), 1);
        this.f277972s = com.p314xaae8f345.mm.ui.zk.a(getContext(), 4);
        this.f277973t = com.p314xaae8f345.mm.ui.zk.a(getContext(), 34);
        this.f277974u = com.p314xaae8f345.mm.ui.zk.a(getContext(), 10);
        this.f277975v = com.p314xaae8f345.mm.ui.zk.a(getContext(), ca5.j.f121630c);
        this.f277976w = com.p314xaae8f345.mm.ui.zk.a(getContext(), ca5.j.f121631d);
        this.f277977x = com.p314xaae8f345.mm.ui.zk.a(getContext(), 34);
        this.f277962f = new java.util.ArrayList();
        int i27 = 0;
        while (true) {
            float[] fArr2 = ca5.j.f121628a;
            if (i27 >= 5) {
                break;
            }
            this.f277962f.add(java.lang.Integer.valueOf(this.f277972s));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i28 = 0;
            while (true) {
                float[] fArr3 = ca5.j.f121628a;
                if (i28 < 5) {
                    arrayList.add(java.lang.Float.valueOf(this.f277972s));
                    arrayList2.add(java.lang.Float.valueOf(this.f277972s));
                    i28++;
                }
            }
            this.f277965i.add(arrayList);
            this.f277966m.add(arrayList2);
            i27++;
        }
        this.f277963g = new java.util.ArrayList();
        while (true) {
            float[] fArr4 = ca5.j.f121628a;
            if (i18 < 25) {
                this.f277963g.add(java.lang.Integer.valueOf(this.f277972s));
                i18++;
            } else {
                e();
                f();
                this.f277964h = new java.util.ArrayList(25);
                this.f277967n = p3.a.b(0.0f, 0.5f, 0.2f, 1.0f);
                a();
                b();
                android.graphics.Paint paint = new android.graphics.Paint(1);
                this.f277968o = paint;
                paint.setColor(parseColor);
                this.f277968o.setAlpha(128);
                return;
            }
        }
    }
}
