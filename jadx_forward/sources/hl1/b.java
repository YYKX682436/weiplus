package hl1;

/* loaded from: classes7.dex */
public class b implements hl1.h {

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f363614b;

    /* renamed from: c, reason: collision with root package name */
    public int f363615c;

    /* renamed from: d, reason: collision with root package name */
    public int f363616d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f363614b = runtime;
        this.f363615c = i17;
    }

    @Override // hl1.h
    public void a() {
        this.f363615c = android.graphics.Color.argb(0, android.graphics.Color.red(this.f363615c), android.graphics.Color.green(this.f363615c), android.graphics.Color.blue(this.f363615c));
        this.f363616d = 0;
    }

    @Override // hl1.h
    public void b(int i17) {
        this.f363615c = i17;
    }

    @Override // hl1.h
    public void c() {
    }

    @Override // hl1.h
    public android.animation.ValueAnimator d(int i17, int i18, long j17) {
        if (i17 == i18) {
            return null;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.setDuration(j17);
        android.view.View g17 = g();
        ofInt.addUpdateListener(new hl1.a(this, i17, i18, j17, (android.view.View) (g17 != null ? g17.getParent() : null)));
        ofInt.start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenBackgroundCommonRenderer", "animator[" + ofInt + ']');
        return ofInt;
    }

    @Override // hl1.h
    public int e() {
        return android.graphics.Color.alpha(this.f363615c);
    }

    @Override // hl1.h
    public void f(android.graphics.Canvas canvas, android.view.View view) {
        int i17 = this.f363616d;
        int i18 = this.f363615c;
        if (canvas != null) {
            android.graphics.drawable.ColorDrawable colorDrawable = new android.graphics.drawable.ColorDrawable(android.graphics.Color.argb(i17, android.graphics.Color.red(i18), android.graphics.Color.green(i18), android.graphics.Color.blue(i18)));
            colorDrawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            colorDrawable.draw(canvas);
        }
    }

    @Override // hl1.h
    public android.view.View g() {
        return this.f363614b.f156343s;
    }

    @Override // hl1.h
    public int h() {
        return this.f363616d;
    }

    public void i(int i17, int i18, long j17, android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // hl1.h
    /* renamed from: reset */
    public void mo133701x6761d4f() {
        this.f363616d = 0;
    }

    @Override // hl1.h
    /* renamed from: type */
    public hl1.g mo133702x368f3a() {
        return hl1.g.f363628e;
    }
}
