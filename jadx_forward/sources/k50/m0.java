package k50;

/* loaded from: classes.dex */
public final class m0 extends k50.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final k50.h0 f385774a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(k50.h0 appItem) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appItem, "appItem");
        this.f385774a = appItem;
    }

    /* renamed from: equals */
    public boolean m141983xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k50.m0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f385774a, ((k50.m0) obj).f385774a);
    }

    /* renamed from: hashCode */
    public int m141984x8cdac1b() {
        return this.f385774a.m141979x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m141985x9616526c() {
        return "App(appItem=" + this.f385774a + ')';
    }
}
