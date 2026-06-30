package lg2;

/* loaded from: classes10.dex */
public abstract class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f400089d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f400090e;

    /* renamed from: f, reason: collision with root package name */
    public final int f400091f;

    /* renamed from: g, reason: collision with root package name */
    public final int f400092g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f400093h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f400094i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f400095m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f400096n;

    /* renamed from: o, reason: collision with root package name */
    public android.animation.AnimatorSet f400097o;

    public a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f400089d = context;
        this.f400090e = "Finder." + r();
        qg2.d dVar = qg2.d.f444326a;
        this.f400091f = dVar.g();
        this.f400092g = dVar.f();
    }

    public void j(jg2.b builder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builder, "builder");
        android.graphics.Rect q17 = q();
        android.graphics.Rect s17 = s();
        float width = (s17.width() * 1.0f) / q17.width();
        float height = (s17.height() * 1.0f) / q17.height();
        float centerX = s17.centerX() - q17.centerX();
        float centerY = s17.centerY() - q17.centerY();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400090e, "setTransitionAnimator sourceRect: " + q17 + "  targetRect: " + s17 + " scaleRatioX: " + width + "  scaleRatioY: " + height + "  translationX: " + centerX + "  translationY: " + centerY + ' ');
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f400096n, "scaleX", 1.0f, width);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat, "ofFloat(...)");
        builder.a(ofFloat);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f400096n, "scaleY", 1.0f, height);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat2, "ofFloat(...)");
        builder.a(ofFloat2);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(this.f400096n, "translationX", 0.0f, centerX);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat3, "ofFloat(...)");
        builder.a(ofFloat3);
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(this.f400096n, "translationY", 0.0f, centerY);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ofFloat4, "ofFloat(...)");
        builder.a(ofFloat4);
    }

    public abstract void k();

    public void l() {
        this.f400093h = n();
        this.f400094i = m();
        java.lang.String str = "targetRect = " + s();
        java.lang.String str2 = this.f400090e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "sourceRect = " + q());
        this.f400096n = o();
        k();
    }

    public abstract android.graphics.Rect m();

    public abstract android.graphics.Rect n();

    public abstract android.view.View o();

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f400090e, "onAnimationEnd");
        yz5.a aVar = this.f400095m;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        this.f400095m = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    public abstract void p();

    public android.graphics.Rect q() {
        android.graphics.Rect rect = this.f400094i;
        if (rect != null) {
            return rect;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sourceRect");
        throw null;
    }

    public abstract java.lang.String r();

    public android.graphics.Rect s() {
        android.graphics.Rect rect = this.f400093h;
        if (rect != null) {
            return rect;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("targetRect");
        throw null;
    }

    public long t() {
        return 240L;
    }

    public void u(yz5.a onAnimationEndCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        this.f400095m = onAnimationEndCallback;
        jg2.b bVar = new jg2.b();
        j(bVar);
        java.util.ArrayList animatorList = bVar.f381180a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animatorList, "animatorList");
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(t());
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet.playTogether(animatorList);
        this.f400097o = animatorSet;
        animatorSet.addListener(this);
        animatorSet.start();
    }
}
