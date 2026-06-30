package pw1;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f440209a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440210b;

    /* renamed from: c, reason: collision with root package name */
    public final int f440211c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f440212d;

    /* renamed from: e, reason: collision with root package name */
    public final int f440213e;

    public g(int i17, int i18, int i19, boolean z17, int i27) {
        this.f440209a = i17;
        this.f440210b = i18;
        this.f440211c = i19;
        this.f440212d = z17;
        this.f440213e = i27;
    }

    public static pw1.g a(pw1.g gVar, int i17, int i18, int i19, boolean z17, int i27, int i28, java.lang.Object obj) {
        if ((i28 & 1) != 0) {
            i17 = gVar.f440209a;
        }
        if ((i28 & 2) != 0) {
            i18 = gVar.f440210b;
        }
        int i29 = i18;
        if ((i28 & 4) != 0) {
            i19 = gVar.f440211c;
        }
        int i37 = i19;
        if ((i28 & 8) != 0) {
            z17 = gVar.f440212d;
        }
        boolean z18 = z17;
        if ((i28 & 16) != 0) {
            i27 = gVar.f440213e;
        }
        gVar.getClass();
        return new pw1.g(i17, i29, i37, z18, i27);
    }

    /* renamed from: equals */
    public boolean m159079xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw1.g)) {
            return false;
        }
        pw1.g gVar = (pw1.g) obj;
        return this.f440209a == gVar.f440209a && this.f440210b == gVar.f440210b && this.f440211c == gVar.f440211c && this.f440212d == gVar.f440212d && this.f440213e == gVar.f440213e;
    }

    /* renamed from: hashCode */
    public int m159080x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f440209a) * 31) + java.lang.Integer.hashCode(this.f440210b)) * 31) + java.lang.Integer.hashCode(this.f440211c)) * 31) + java.lang.Boolean.hashCode(this.f440212d)) * 31) + java.lang.Integer.hashCode(this.f440213e);
    }

    /* renamed from: toString */
    public java.lang.String m159081x9616526c() {
        return "RenderInfo(width=" + this.f440209a + ", height=" + this.f440210b + ", rotate=" + this.f440211c + ", mirror=" + this.f440212d + ", scaleType=" + this.f440213e + ')';
    }

    public /* synthetic */ g(int i17, int i18, int i19, boolean z17, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, i19, (i28 & 8) != 0 ? false : z17, (i28 & 16) != 0 ? 0 : i27);
    }
}
