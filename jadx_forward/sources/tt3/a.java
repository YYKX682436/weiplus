package tt3;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f503561a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f503562b;

    /* renamed from: c, reason: collision with root package name */
    public int f503563c;

    /* renamed from: d, reason: collision with root package name */
    public int f503564d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f503565e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f503566f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f503567g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f503568h;

    /* renamed from: i, reason: collision with root package name */
    public int f503569i;

    public a(int i17, boolean z17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? 2 : i17;
        z17 = (i27 & 2) != 0 ? true : z17;
        i18 = (i27 & 4) != 0 ? 0 : i18;
        i19 = (i27 & 8) != 0 ? 0 : i19;
        this.f503561a = i17;
        this.f503562b = z17;
        this.f503563c = i18;
        this.f503564d = i19;
        this.f503568h = true;
        this.f503569i = 10;
    }

    /* renamed from: equals */
    public boolean m167042xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt3.a)) {
            return false;
        }
        tt3.a aVar = (tt3.a) obj;
        return this.f503561a == aVar.f503561a && this.f503562b == aVar.f503562b && this.f503563c == aVar.f503563c && this.f503564d == aVar.f503564d;
    }

    /* renamed from: hashCode */
    public int m167043x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f503561a) * 31) + java.lang.Boolean.hashCode(this.f503562b)) * 31) + java.lang.Integer.hashCode(this.f503563c)) * 31) + java.lang.Integer.hashCode(this.f503564d);
    }

    /* renamed from: toString */
    public java.lang.String m167044x9616526c() {
        return "StoryBasicConfig(repeatMD5=" + this.f503561a + ", showMusicIcon=" + this.f503562b + ", albumThumbHeight=" + this.f503563c + ", albumThumbWidth=" + this.f503564d + ')';
    }
}
