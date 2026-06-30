package se3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 f488446a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1848x727d4bff.p1849x373aa5.C16462x4c72b377 frameSetView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetView, "frameSetView");
        this.f488446a = frameSetView;
    }

    /* renamed from: equals */
    public boolean m164355xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se3.c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488446a, ((se3.c) obj).f488446a);
    }

    /* renamed from: hashCode */
    public int m164356x8cdac1b() {
        return this.f488446a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164357x9616526c() {
        return "InitEvent(frameSetView=" + this.f488446a + ')';
    }
}
