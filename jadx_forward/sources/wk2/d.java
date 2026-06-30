package wk2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f528471a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 f528472b;

    /* renamed from: c, reason: collision with root package name */
    public final in5.c f528473c;

    public d(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 view, in5.c data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f528471a = i17;
        this.f528472b = view;
        this.f528473c = data;
    }

    /* renamed from: equals */
    public boolean m174118xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wk2.d)) {
            return false;
        }
        wk2.d dVar = (wk2.d) obj;
        return this.f528471a == dVar.f528471a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f528472b, dVar.f528472b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f528473c, dVar.f528473c);
    }

    /* renamed from: hashCode */
    public int m174119x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f528471a) * 31) + this.f528472b.hashCode()) * 31) + this.f528473c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m174120x9616526c() {
        return "LivePreviewData(pos=" + this.f528471a + ", view=" + this.f528472b + ", data=" + this.f528473c + ')';
    }
}
