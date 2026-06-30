package bf4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f101224a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f101225b;

    /* renamed from: c, reason: collision with root package name */
    public final int f101226c;

    /* renamed from: d, reason: collision with root package name */
    public final int f101227d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f101228e;

    public a(int i17, boolean z17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? 2 : i17;
        z17 = (i27 & 2) != 0 ? true : z17;
        i18 = (i27 & 4) != 0 ? 0 : i18;
        i19 = (i27 & 8) != 0 ? 0 : i19;
        this.f101224a = i17;
        this.f101225b = z17;
        this.f101226c = i18;
        this.f101227d = i19;
        this.f101228e = new java.util.HashSet();
    }

    /* renamed from: equals */
    public boolean m10320xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf4.a)) {
            return false;
        }
        bf4.a aVar = (bf4.a) obj;
        return this.f101224a == aVar.f101224a && this.f101225b == aVar.f101225b && this.f101226c == aVar.f101226c && this.f101227d == aVar.f101227d;
    }

    /* renamed from: hashCode */
    public int m10321x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f101224a) * 31) + java.lang.Boolean.hashCode(this.f101225b)) * 31) + java.lang.Integer.hashCode(this.f101226c)) * 31) + java.lang.Integer.hashCode(this.f101227d);
    }

    /* renamed from: toString */
    public java.lang.String m10322x9616526c() {
        return "StoryBasicConfig(repeatMD5=" + this.f101224a + ", showMusicIcon=" + this.f101225b + ", albumThumbHeight=" + this.f101226c + ", albumThumbWidth=" + this.f101227d + ')';
    }
}
