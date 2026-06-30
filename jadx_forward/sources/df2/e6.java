package df2;

/* loaded from: classes3.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f311567a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f311568b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f311569c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f311570d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f311571e;

    /* renamed from: f, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f311572f;

    public e6(android.widget.FrameLayout micLinkScaleLayout, android.widget.FrameLayout pagAreaLayout, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b pagView, android.widget.TextView nickNameTv, android.graphics.Rect rect, p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micLinkScaleLayout, "micLinkScaleLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagAreaLayout, "pagAreaLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickNameTv, "nickNameTv");
        this.f311567a = micLinkScaleLayout;
        this.f311568b = pagAreaLayout;
        this.f311569c = pagView;
        this.f311570d = nickNameTv;
        this.f311571e = rect;
        this.f311572f = r2Var;
    }

    /* renamed from: equals */
    public boolean m124191xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.e6)) {
            return false;
        }
        df2.e6 e6Var = (df2.e6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311567a, e6Var.f311567a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311568b, e6Var.f311568b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311569c, e6Var.f311569c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311570d, e6Var.f311570d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311571e, e6Var.f311571e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f311572f, e6Var.f311572f);
    }

    /* renamed from: hashCode */
    public int m124192x8cdac1b() {
        int hashCode = ((((((this.f311567a.hashCode() * 31) + this.f311568b.hashCode()) * 31) + this.f311569c.hashCode()) * 31) + this.f311570d.hashCode()) * 31;
        android.graphics.Rect rect = this.f311571e;
        int hashCode2 = (hashCode + (rect == null ? 0 : rect.hashCode())) * 31;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311572f;
        return hashCode2 + (r2Var != null ? r2Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m124193x9616526c() {
        return "AllWidget(micLinkScaleLayout=" + this.f311567a + ", pagAreaLayout=" + this.f311568b + ", pagView=" + this.f311569c + ", nickNameTv=" + this.f311570d + ", rect=" + this.f311571e + ", executeJob=" + this.f311572f + ')';
    }
}
