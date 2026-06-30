package ty2;

/* loaded from: classes9.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.o5 f504606a;

    /* renamed from: b, reason: collision with root package name */
    public final int f504607b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f504608c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f504609d;

    public k(bw5.o5 showBoxItem, int i17, java.lang.Integer num, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showBoxItem, "showBoxItem");
        this.f504606a = showBoxItem;
        this.f504607b = i17;
        this.f504608c = num;
        this.f504609d = view;
    }

    /* renamed from: equals */
    public boolean m167224xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.k)) {
            return false;
        }
        ty2.k kVar = (ty2.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504606a, kVar.f504606a) && this.f504607b == kVar.f504607b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504608c, kVar.f504608c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f504609d, kVar.f504609d);
    }

    /* renamed from: hashCode */
    public int m167225x8cdac1b() {
        int hashCode = ((this.f504606a.hashCode() * 31) + java.lang.Integer.hashCode(this.f504607b)) * 31;
        java.lang.Integer num = this.f504608c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        android.view.View view = this.f504609d;
        return hashCode2 + (view != null ? view.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m167226x9616526c() {
        return "ShowBoxItemView(showBoxItem=" + this.f504606a + ", id=" + this.f504607b + ", itemWidth=" + this.f504608c + ", view=" + this.f504609d + ')';
    }
}
