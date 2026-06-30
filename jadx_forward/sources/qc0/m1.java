package qc0;

/* loaded from: classes7.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public int f442943a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442944b;

    /* renamed from: c, reason: collision with root package name */
    public final int f442945c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f442946d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Bundle f442947e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 f442948f;

    /* renamed from: g, reason: collision with root package name */
    public final int f442949g;

    public m1(int i17, int i18, int i19, java.util.List list, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, int i27) {
        this.f442943a = i17;
        this.f442944b = i18;
        this.f442945c = i19;
        this.f442946d = list;
        this.f442947e = bundle;
        this.f442948f = c16994x3ba8255;
        this.f442949g = i27;
    }

    public final qc0.l1 a() {
        java.util.List list = this.f442946d;
        if (list != null) {
            return (qc0.l1) kz5.n0.Z(list);
        }
        return null;
    }

    /* renamed from: equals */
    public boolean m159784xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc0.m1)) {
            return false;
        }
        qc0.m1 m1Var = (qc0.m1) obj;
        return this.f442943a == m1Var.f442943a && this.f442944b == m1Var.f442944b && this.f442945c == m1Var.f442945c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442946d, m1Var.f442946d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442947e, m1Var.f442947e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f442948f, m1Var.f442948f) && this.f442949g == m1Var.f442949g;
    }

    /* renamed from: hashCode */
    public int m159785x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f442943a) * 31) + java.lang.Integer.hashCode(this.f442944b)) * 31) + java.lang.Integer.hashCode(this.f442945c)) * 31;
        java.util.List list = this.f442946d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        android.os.Bundle bundle = this.f442947e;
        int hashCode3 = (hashCode2 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255 = this.f442948f;
        return ((hashCode3 + (c16994x3ba8255 != null ? c16994x3ba8255.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f442949g);
    }

    /* renamed from: toString */
    public java.lang.String m159786x9616526c() {
        return "MediaOptResult(requestCode=" + this.f442943a + ", resultCode=" + this.f442944b + ", optCode=" + this.f442945c + ", mediaList=" + this.f442946d + ", extraData=" + this.f442947e + ", reportInfo=" + this.f442948f + ", source=" + this.f442949g + ')';
    }

    public /* synthetic */ m1(int i17, int i18, int i19, java.util.List list, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, (i28 & 4) != 0 ? -1 : i19, (i28 & 8) != 0 ? null : list, (i28 & 16) != 0 ? null : bundle, (i28 & 32) != 0 ? null : c16994x3ba8255, (i28 & 64) != 0 ? -1 : i27);
    }
}
