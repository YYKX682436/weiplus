package gm2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.drawable.BitmapDrawable f354957a;

    /* renamed from: b, reason: collision with root package name */
    public final int f354958b;

    /* renamed from: c, reason: collision with root package name */
    public int f354959c;

    public l(android.graphics.drawable.BitmapDrawable bitmapDrawable, int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        bitmapDrawable = (i19 & 1) != 0 ? null : bitmapDrawable;
        i17 = (i19 & 2) != 0 ? 0 : i17;
        i18 = (i19 & 4) != 0 ? 0 : i18;
        this.f354957a = bitmapDrawable;
        this.f354958b = i17;
        this.f354959c = i18;
    }

    /* renamed from: equals */
    public boolean m131828xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm2.l)) {
            return false;
        }
        gm2.l lVar = (gm2.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f354957a, lVar.f354957a) && this.f354958b == lVar.f354958b && this.f354959c == lVar.f354959c;
    }

    /* renamed from: hashCode */
    public int m131829x8cdac1b() {
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f354957a;
        return ((((bitmapDrawable == null ? 0 : bitmapDrawable.hashCode()) * 31) + java.lang.Integer.hashCode(this.f354958b)) * 31) + java.lang.Integer.hashCode(this.f354959c);
    }

    /* renamed from: toString */
    public java.lang.String m131830x9616526c() {
        return "ImageSpanParams(bitmapDrawable=" + this.f354957a + ", leftMargin=" + this.f354958b + ", rightMargin=" + this.f354959c + ')';
    }
}
