package tw0;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f503950a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f503951b;

    public b(boolean z17, java.util.LinkedList titleList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleList, "titleList");
        this.f503950a = z17;
        this.f503951b = titleList;
    }

    /* renamed from: equals */
    public boolean m167101xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw0.b)) {
            return false;
        }
        tw0.b bVar = (tw0.b) obj;
        return this.f503950a == bVar.f503950a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f503951b, bVar.f503951b);
    }

    /* renamed from: hashCode */
    public int m167102x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f503950a) * 31) + this.f503951b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m167103x9616526c() {
        return "RecommendResult(showTitle=" + this.f503950a + ", titleList=" + this.f503951b + ')';
    }
}
