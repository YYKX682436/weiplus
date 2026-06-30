package qs5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f447956a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f447957b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f447958c;

    public c(int i17, java.lang.String title, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 4) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f447956a = i17;
        this.f447957b = title;
        this.f447958c = z17;
    }

    /* renamed from: equals */
    public boolean m160839xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs5.c)) {
            return false;
        }
        qs5.c cVar = (qs5.c) obj;
        return this.f447956a == cVar.f447956a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f447957b, cVar.f447957b) && this.f447958c == cVar.f447958c;
    }

    /* renamed from: hashCode */
    public int m160840x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f447956a) * 31) + this.f447957b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f447958c);
    }

    /* renamed from: toString */
    public java.lang.String m160841x9616526c() {
        return "EffectInfo(beautyId=" + this.f447956a + ", title=" + this.f447957b + ", isBothSides=" + this.f447958c + ')';
    }
}
