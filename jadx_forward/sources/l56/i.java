package l56;

/* loaded from: classes13.dex */
public class i implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f398225d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f398226e;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        n56.c.b(str, "Token can't be null");
        n56.c.b(str2, "Secret can't be null");
        this.f398225d = str;
        this.f398226e = str2;
    }

    /* renamed from: equals */
    public boolean m145174xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l56.i.class == obj.getClass()) {
            l56.i iVar = (l56.i) obj;
            if (this.f398225d.equals(iVar.f398225d) && this.f398226e.equals(iVar.f398226e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m145175x8cdac1b() {
        return (this.f398225d.hashCode() * 31) + this.f398226e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m145176x9616526c() {
        return java.lang.String.format("Token[%s , %s]", this.f398225d, this.f398226e);
    }
}
