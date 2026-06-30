package yu;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f547286a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f547287b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f547288c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f547289d;

    public a(boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f547286a = z17;
        this.f547287b = z18;
        this.f547288c = z19;
        this.f547289d = z27;
    }

    /* renamed from: equals */
    public boolean m177645xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu.a)) {
            return false;
        }
        yu.a aVar = (yu.a) obj;
        return this.f547286a == aVar.f547286a && this.f547287b == aVar.f547287b && this.f547288c == aVar.f547288c && this.f547289d == aVar.f547289d;
    }

    /* renamed from: hashCode */
    public int m177646x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f547286a) * 31) + java.lang.Boolean.hashCode(this.f547287b)) * 31) + java.lang.Boolean.hashCode(this.f547288c)) * 31) + java.lang.Boolean.hashCode(this.f547289d);
    }

    /* renamed from: toString */
    public java.lang.String m177647x9616526c() {
        return "FileIconConfig(isDarkMode=" + this.f547286a + ", showSimpleIcon=" + this.f547287b + ", isUnfinished=" + this.f547288c + ", isExpired=" + this.f547289d + ')';
    }
}
