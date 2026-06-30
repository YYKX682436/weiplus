package xh2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f536073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536074b;

    /* renamed from: c, reason: collision with root package name */
    public final float f536075c;

    public d(java.util.LinkedList dataList, int i17, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f536073a = dataList;
        this.f536074b = i17;
        this.f536075c = f17;
    }

    /* renamed from: equals */
    public boolean m175542xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.d)) {
            return false;
        }
        xh2.d dVar = (xh2.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f536073a, dVar.f536073a) && this.f536074b == dVar.f536074b && java.lang.Float.compare(this.f536075c, dVar.f536075c) == 0;
    }

    /* renamed from: hashCode */
    public int m175543x8cdac1b() {
        return (((this.f536073a.hashCode() * 31) + java.lang.Integer.hashCode(this.f536074b)) * 31) + java.lang.Float.hashCode(this.f536075c);
    }

    /* renamed from: toString */
    public java.lang.String m175544x9616526c() {
        return "FinderLiveMicSeiData(dataList=" + this.f536073a + ", mode=" + this.f536074b + ", anchorVideoRate=" + this.f536075c + ')';
    }
}
