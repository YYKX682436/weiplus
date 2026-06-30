package df5;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final ua5.f f313763a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f313764b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f313765c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f313766d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f313767e;

    /* renamed from: f, reason: collision with root package name */
    public final android.os.Handler f313768f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Runnable f313769g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f313770h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.SpannableStringBuilder f313771i;

    /* renamed from: j, reason: collision with root package name */
    public android.text.SpannableStringBuilder f313772j;

    /* renamed from: k, reason: collision with root package name */
    public int f313773k;

    /* renamed from: l, reason: collision with root package name */
    public int f313774l;

    public v(ua5.f animator, yz5.a baseCharsProvider, yz5.a durationMsProvider, yz5.a globalRemainingProvider, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseCharsProvider, "baseCharsProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(durationMsProvider, "durationMsProvider");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(globalRemainingProvider, "globalRemainingProvider");
        this.f313763a = animator;
        this.f313764b = baseCharsProvider;
        this.f313765c = durationMsProvider;
        this.f313766d = globalRemainingProvider;
        this.f313767e = aVar;
        this.f313768f = new android.os.Handler(android.os.Looper.getMainLooper());
    }

    public final void a() {
        int intValue = ((java.lang.Number) this.f313764b.mo152xb9724478()).intValue();
        if (intValue < 1) {
            intValue = 1;
        }
        long j17 = (((java.lang.Number) this.f313765c.mo152xb9724478()).intValue() >= 1 ? r2 : 1) / intValue;
        if (j17 < 1) {
            j17 = 1;
        }
        df5.u uVar = new df5.u(this);
        this.f313769g = uVar;
        this.f313768f.postDelayed(uVar, j17);
    }
}
