package uf2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f508695a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f508696b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f508697c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f508698d;

    public a(android.widget.FrameLayout pagAreaLayout, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b pagView, android.graphics.Rect rect, java.lang.String runningPagUrl, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        runningPagUrl = (i17 & 8) != 0 ? "" : runningPagUrl;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagAreaLayout, "pagAreaLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pagView, "pagView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runningPagUrl, "runningPagUrl");
        this.f508695a = pagAreaLayout;
        this.f508696b = pagView;
        this.f508697c = rect;
        this.f508698d = runningPagUrl;
    }

    /* renamed from: equals */
    public boolean m167957xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf2.a)) {
            return false;
        }
        uf2.a aVar = (uf2.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508695a, aVar.f508695a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508696b, aVar.f508696b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508697c, aVar.f508697c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f508698d, aVar.f508698d);
    }

    /* renamed from: hashCode */
    public int m167958x8cdac1b() {
        int hashCode = ((this.f508695a.hashCode() * 31) + this.f508696b.hashCode()) * 31;
        android.graphics.Rect rect = this.f508697c;
        return ((hashCode + (rect == null ? 0 : rect.hashCode())) * 31) + this.f508698d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167959x9616526c() {
        return "AllWidget(pagAreaLayout=" + this.f508695a + ", pagView=" + this.f508696b + ", rect=" + this.f508697c + ", runningPagUrl=" + this.f508698d + ')';
    }
}
