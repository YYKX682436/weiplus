package aq2;

/* loaded from: classes2.dex */
public final class g extends bz2.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f94666g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f94667h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f94668i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.a initTask, p3325xe03a0797.p3326xc267989b.r2 r2Var, p012xc85e97e9.p093xedfae76a.y yVar, java.lang.String themeId) {
        super(initTask, r2Var, yVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initTask, "initTask");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        this.f94666g = themeId;
        this.f94667h = "LiveThemeStreamFutureTask";
        this.f94668i = jz5.h.b(new aq2.f(this));
    }

    @Override // ay1.l
    public by1.d a() {
        return new aq2.e(this.f94666g, (java.lang.String) ((jz5.n) this.f94668i).mo141623x754a37bb());
    }

    @Override // ay1.l
    public java.lang.Object c() {
        return (java.lang.String) ((jz5.n) this.f94668i).mo141623x754a37bb();
    }

    @Override // ay1.l
    public java.lang.String f() {
        return this.f94667h;
    }
}
