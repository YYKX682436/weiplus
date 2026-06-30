package c61;

/* loaded from: classes8.dex */
public final class vb {

    /* renamed from: a, reason: collision with root package name */
    public final float f120894a;

    /* renamed from: b, reason: collision with root package name */
    public final c61.wb f120895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f120896c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f120897d;

    public vb(float f17, c61.wb iconPos, int i17, java.lang.Integer num) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconPos, "iconPos");
        this.f120894a = f17;
        this.f120895b = iconPos;
        this.f120896c = i17;
        this.f120897d = num;
    }

    /* renamed from: equals */
    public boolean m14413xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c61.vb)) {
            return false;
        }
        c61.vb vbVar = (c61.vb) obj;
        return java.lang.Float.compare(this.f120894a, vbVar.f120894a) == 0 && this.f120895b == vbVar.f120895b && this.f120896c == vbVar.f120896c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f120897d, vbVar.f120897d);
    }

    /* renamed from: hashCode */
    public int m14414x8cdac1b() {
        int hashCode = ((((java.lang.Float.hashCode(this.f120894a) * 31) + this.f120895b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f120896c)) * 31;
        java.lang.Integer num = this.f120897d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m14415x9616526c() {
        return "IconModel(iconSize=" + this.f120894a + ", iconPos=" + this.f120895b + ", gravity=" + this.f120896c + ", iconColor=" + this.f120897d + ')';
    }
}
