package bg2;

/* loaded from: classes2.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f101990a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.animation.AnimationSet f101991b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.animation.AnimationSet f101992c;

    /* renamed from: d, reason: collision with root package name */
    public final long f101993d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f101994e;

    public r4(android.view.View view, android.view.animation.AnimationSet inAnim, android.view.animation.AnimationSet outAnim, long j17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inAnim, "inAnim");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAnim, "outAnim");
        this.f101990a = view;
        this.f101991b = inAnim;
        this.f101992c = outAnim;
        this.f101993d = j17;
        this.f101994e = lVar;
    }

    /* renamed from: equals */
    public boolean m10420xb2c87fbf(java.lang.Object obj) {
        return (obj instanceof bg2.r4) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((bg2.r4) obj).f101990a, this.f101990a);
    }

    /* renamed from: hashCode */
    public int m10421x8cdac1b() {
        return this.f101990a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m10422x9616526c() {
        return "Config(view=" + this.f101990a + ", inAnim=" + this.f101991b + ", outAnim=" + this.f101992c + ", stayDuration=" + this.f101993d + ", afterToastOut=" + this.f101994e + ')';
    }
}
