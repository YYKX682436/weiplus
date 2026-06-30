package se3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 f488443a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 frameSetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetView, "frameSetView");
        this.f488443a = frameSetView;
    }

    /* renamed from: equals */
    public boolean m164349xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se3.a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488443a, ((se3.a) obj).f488443a);
    }

    /* renamed from: hashCode */
    public int m164350x8cdac1b() {
        return this.f488443a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164351x9616526c() {
        return "BindEvent(frameSetView=" + this.f488443a + ')';
    }
}
