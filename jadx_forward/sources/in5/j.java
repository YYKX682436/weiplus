package in5;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final in5.c f374603a;

    /* renamed from: b, reason: collision with root package name */
    public long f374604b;

    /* renamed from: c, reason: collision with root package name */
    public long f374605c;

    /* renamed from: d, reason: collision with root package name */
    public long f374606d;

    /* renamed from: e, reason: collision with root package name */
    public int f374607e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f374608f;

    public j(in5.c associatedObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(associatedObject, "associatedObject");
        this.f374603a = associatedObject;
        this.f374604b = -1L;
        this.f374605c = -1L;
        this.f374606d = -1L;
        this.f374607e = -1;
    }

    /* renamed from: equals */
    public boolean m136785xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof in5.j) {
            return this == obj || this.f374603a.mo2128x1ed62e84() == ((in5.j) obj).f374603a.mo2128x1ed62e84();
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m136786x8cdac1b() {
        return (int) this.f374603a.mo2128x1ed62e84();
    }

    /* renamed from: toString */
    public java.lang.String m136787x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
        sb6.append("adapterPosition = " + this.f374607e);
        sb6.append("\n");
        sb6.append("exposeTime = " + this.f374606d);
        sb6.append("\n");
        sb6.append("startTime = " + this.f374604b);
        sb6.append("\n");
        sb6.append("endTime = " + this.f374605c);
        sb6.append("\n");
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
