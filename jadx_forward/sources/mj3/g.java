package mj3;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f408583a;

    /* renamed from: b, reason: collision with root package name */
    public final int f408584b;

    /* renamed from: c, reason: collision with root package name */
    public final int f408585c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f408586d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f408587e;

    public g(int i17, int i18, int i19, boolean z17, boolean z18) {
        this.f408583a = i17;
        this.f408584b = i18;
        this.f408585c = i19;
        this.f408586d = z17;
        this.f408587e = z18;
    }

    public static mj3.g a(mj3.g gVar, int i17, int i18, int i19, boolean z17, boolean z18, int i27, java.lang.Object obj) {
        if ((i27 & 1) != 0) {
            i17 = gVar.f408583a;
        }
        if ((i27 & 2) != 0) {
            i18 = gVar.f408584b;
        }
        int i28 = i18;
        if ((i27 & 4) != 0) {
            i19 = gVar.f408585c;
        }
        int i29 = i19;
        if ((i27 & 8) != 0) {
            z17 = gVar.f408586d;
        }
        boolean z19 = z17;
        if ((i27 & 16) != 0) {
            z18 = gVar.f408587e;
        }
        gVar.getClass();
        return new mj3.g(i17, i28, i29, z19, z18);
    }

    /* renamed from: equals */
    public boolean m147388xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mj3.g)) {
            return false;
        }
        mj3.g gVar = (mj3.g) obj;
        return this.f408583a == gVar.f408583a && this.f408584b == gVar.f408584b && this.f408585c == gVar.f408585c && this.f408586d == gVar.f408586d && this.f408587e == gVar.f408587e;
    }

    /* renamed from: hashCode */
    public int m147389x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f408583a) * 31) + java.lang.Integer.hashCode(this.f408584b)) * 31) + java.lang.Integer.hashCode(this.f408585c)) * 31) + java.lang.Boolean.hashCode(this.f408586d)) * 31) + java.lang.Boolean.hashCode(this.f408587e);
    }

    /* renamed from: toString */
    public java.lang.String m147390x9616526c() {
        return "RenderInfo(width=" + this.f408583a + ", height=" + this.f408584b + ", rotate=" + this.f408585c + ", mirror=" + this.f408586d + ", centerCrop=" + this.f408587e + ')';
    }

    public /* synthetic */ g(int i17, int i18, int i19, boolean z17, boolean z18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, i19, (i27 & 8) != 0 ? false : z17, (i27 & 16) != 0 ? true : z18);
    }
}
