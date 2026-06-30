package uc0;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f507814a;

    /* renamed from: b, reason: collision with root package name */
    public final int f507815b;

    /* renamed from: c, reason: collision with root package name */
    public final int f507816c;

    /* renamed from: d, reason: collision with root package name */
    public final uc0.p f507817d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f507818e = "";

    /* renamed from: f, reason: collision with root package name */
    public int f507819f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f507820g = -1;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f507821h;

    /* renamed from: i, reason: collision with root package name */
    public int f507822i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Button f507823j;

    /* renamed from: k, reason: collision with root package name */
    public uc0.s f507824k;

    /* renamed from: l, reason: collision with root package name */
    public uc0.m f507825l;

    public v(java.lang.String str, int i17, int i18, uc0.p pVar) {
        this.f507814a = str;
        this.f507815b = i17;
        this.f507816c = i18;
        this.f507817d = pVar;
    }

    /* renamed from: equals */
    public boolean m167819xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0.v)) {
            return false;
        }
        uc0.v vVar = (uc0.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f507814a, vVar.f507814a) && this.f507815b == vVar.f507815b && this.f507816c == vVar.f507816c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f507817d, vVar.f507817d);
    }

    /* renamed from: hashCode */
    public int m167820x8cdac1b() {
        java.lang.String str = this.f507814a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f507815b)) * 31) + java.lang.Integer.hashCode(this.f507816c)) * 31;
        uc0.p pVar = this.f507817d;
        return hashCode + (pVar != null ? pVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m167821x9616526c() {
        return "SelectTextData(originalContent=" + this.f507814a + ", currentLength=" + this.f507815b + ", maxLength=" + this.f507816c + ", callback=" + this.f507817d + ')';
    }
}
