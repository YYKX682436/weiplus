package oh2;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f426876a;

    /* renamed from: b, reason: collision with root package name */
    public final float f426877b;

    /* renamed from: c, reason: collision with root package name */
    public final float f426878c;

    /* renamed from: d, reason: collision with root package name */
    public final float f426879d;

    /* renamed from: e, reason: collision with root package name */
    public final float f426880e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f426881f;

    /* renamed from: g, reason: collision with root package name */
    public my5.a f426882g;

    /* renamed from: h, reason: collision with root package name */
    public int f426883h;

    /* renamed from: i, reason: collision with root package name */
    public int f426884i;

    /* renamed from: j, reason: collision with root package name */
    public final float f426885j;

    /* renamed from: k, reason: collision with root package name */
    public int f426886k;

    /* renamed from: l, reason: collision with root package name */
    public int f426887l;

    /* renamed from: m, reason: collision with root package name */
    public int f426888m;

    /* renamed from: n, reason: collision with root package name */
    public final int f426889n;

    /* renamed from: o, reason: collision with root package name */
    public float f426890o;

    /* renamed from: p, reason: collision with root package name */
    public float f426891p;

    /* renamed from: q, reason: collision with root package name */
    public float f426892q;

    /* renamed from: r, reason: collision with root package name */
    public final float f426893r;

    /* renamed from: s, reason: collision with root package name */
    public float f426894s;

    /* renamed from: t, reason: collision with root package name */
    public float f426895t;

    /* renamed from: u, reason: collision with root package name */
    public float f426896u;

    /* renamed from: v, reason: collision with root package name */
    public float f426897v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f426898w;

    public d(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        float a17 = i65.a.a(context, 22.0f);
        this.f426876a = a17;
        this.f426877b = i65.a.a(context, 17.0f);
        this.f426878c = i65.a.a(context, 31.0f);
        this.f426879d = i65.a.a(context, 24.0f);
        this.f426880e = i65.a.a(context, 4.0f);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setTextSize(a17);
        paint.setAntiAlias(true);
        this.f426881f = paint;
        this.f426883h = -1;
        this.f426884i = -1;
        this.f426885j = 0.1f;
        this.f426887l = -1;
        this.f426888m = 1;
        this.f426889n = 2;
        this.f426891p = a17;
        this.f426892q = a17;
        this.f426893r = 0.8f;
        this.f426898w = new android.graphics.Rect();
    }

    public void a(my5.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomBaseLyricsDrawer", "bind lyrics size: " + data.b());
        this.f426882g = data;
        h();
    }

    public final android.animation.AnimatorSet b(float f17, boolean z17) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f426890o, f17);
        ofFloat.addUpdateListener(new oh2.a(this));
        ofFloat.setDuration(300L);
        float f18 = this.f426877b;
        float f19 = this.f426876a;
        android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(f18, f19);
        ofFloat2.addUpdateListener(new oh2.b(this));
        android.animation.ValueAnimator ofFloat3 = android.animation.ValueAnimator.ofFloat(f19, f18);
        ofFloat3.addUpdateListener(new oh2.c(this));
        float f27 = this.f426893r;
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(f27, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        if (z17) {
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, android.animation.ValueAnimator.ofFloat(0.0f, f27));
        } else {
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(500L);
        return animatorSet;
    }

    public abstract void c(android.graphics.Canvas canvas, int i17);

    public final int d(my5.c cVar, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<this>");
        java.util.ArrayList mCharacters = cVar.f414393d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mCharacters, "mCharacters");
        int i18 = 0;
        for (java.lang.Object obj : mCharacters) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            long j17 = ((my5.b) obj).f414386a;
            java.util.ArrayList mCharacters2 = cVar.f414393d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mCharacters2, "mCharacters");
            my5.b bVar = (my5.b) kz5.n0.a0(mCharacters2, i19);
            long j18 = i17;
            if (j17 <= j18 && j18 < (bVar != null ? bVar.f414386a : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697)) {
                return i18;
            }
            i18 = i19;
        }
        return -1;
    }

    public abstract java.lang.String e();

    public void f(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        canvas.save();
        canvas.translate(this.f426896u, 0.0f);
        android.graphics.Rect rect = this.f426898w;
        rect.left = 0;
        rect.right = ((int) this.f426894s) + ((int) this.f426897v);
        rect.top = 0;
        rect.bottom = (int) this.f426895t;
        canvas.clipRect(rect);
    }

    public void g(android.graphics.Canvas canvas, int i17, int i18, om2.a0 a0Var) {
        int i19;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        my5.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.f426882g == null) {
            return;
        }
        l(i18, canvas.getHeight());
        f(canvas);
        my5.a aVar = this.f426882g;
        if (aVar != null && (arrayList = aVar.f414385a) != null) {
            i19 = 0;
            for (java.lang.Object obj : arrayList) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                long j17 = ((my5.c) obj).f414391b;
                my5.a aVar2 = this.f426882g;
                long j18 = i17;
                if (j17 <= j18 && j18 < ((aVar2 == null || (arrayList2 = aVar2.f414385a) == null || (cVar = (my5.c) kz5.n0.a0(arrayList2, i27)) == null) ? com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697 : cVar.f414391b)) {
                    break;
                } else {
                    i19 = i27;
                }
            }
        }
        i19 = -1;
        if (i19 >= 0 && this.f426886k != i19) {
            this.f426886k = i19;
            this.f426887l = i19 - 1;
            this.f426888m = (i19 + this.f426889n) - 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e(), "move to index " + this.f426886k + ", previous = " + this.f426887l + ", enter = " + this.f426888m);
            k(this.f426886k);
        }
        c(canvas, i17);
        canvas.restore();
    }

    public abstract void h();

    public final void i(int i17) {
        int i18 = this.f426887l;
        float f17 = this.f426893r;
        if ((i17 != i18 || i18 < 0) && i17 != this.f426886k && i17 != this.f426888m) {
            f17 = 0.0f;
        }
        this.f426881f.setAlpha((int) (f17 * 255));
    }

    public final void j(int i17, int i18) {
        this.f426883h = i17;
        this.f426884i = i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNormalRoomBaseLyricsDrawer", "setTextColors: normal=" + i17 + ", highlight=" + i18);
    }

    public abstract void k(int i17);

    public void l(int i17, float f17) {
        this.f426894s = (i17 - this.f426896u) - this.f426897v;
        this.f426895t = f17;
    }
}
