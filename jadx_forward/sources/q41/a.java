package q41;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f441558a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f441559b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f441560c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f441561d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f441562e;

    public a(int i17, java.lang.String str, java.lang.String str2, boolean z17, boolean z18) {
        this.f441558a = i17;
        this.f441559b = str;
        this.f441560c = str2;
        this.f441561d = z17;
        this.f441562e = z18;
    }

    /* renamed from: equals */
    public boolean m159502xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q41.a)) {
            return false;
        }
        q41.a aVar = (q41.a) obj;
        return this.f441558a == aVar.f441558a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441559b, aVar.f441559b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f441560c, aVar.f441560c) && this.f441561d == aVar.f441561d && this.f441562e == aVar.f441562e;
    }

    /* renamed from: hashCode */
    public int m159503x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f441558a) * 31;
        java.lang.String str = this.f441559b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f441560c;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f441561d)) * 31) + java.lang.Boolean.hashCode(this.f441562e);
    }

    /* renamed from: toString */
    public java.lang.String m159504x9616526c() {
        return "OpenImKefuToolbarItemInfo(type=" + this.f441558a + ", name=" + this.f441559b + ", url=" + this.f441560c + ", isTransparent=" + this.f441561d + ", isModal=" + this.f441562e + ')';
    }
}
