package vr3;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f521163a;

    public g(java.util.List list) {
        this.f521163a = list;
    }

    /* renamed from: equals */
    public boolean m172541xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr3.g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521163a, ((vr3.g) obj).f521163a);
    }

    /* renamed from: hashCode */
    public int m172542x8cdac1b() {
        java.util.List list = this.f521163a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172543x9616526c() {
        return "DraftMpData(draftMessageList=" + this.f521163a + ')';
    }
}
