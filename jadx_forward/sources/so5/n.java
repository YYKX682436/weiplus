package so5;

/* loaded from: classes14.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public int f492419a;

    /* renamed from: b, reason: collision with root package name */
    public int f492420b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f492421c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f492422d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f492423e;

    public n(int i17, int i18, boolean z17, boolean z18, boolean z19) {
        this.f492419a = i17;
        this.f492420b = i18;
        this.f492421c = z17;
        this.f492422d = z18;
        this.f492423e = z19;
    }

    /* renamed from: equals */
    public boolean m165010xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so5.n)) {
            return false;
        }
        so5.n nVar = (so5.n) obj;
        return this.f492419a == nVar.f492419a && this.f492420b == nVar.f492420b && this.f492421c == nVar.f492421c && this.f492422d == nVar.f492422d && this.f492423e == nVar.f492423e;
    }

    /* renamed from: hashCode */
    public int m165011x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f492419a) * 31) + java.lang.Integer.hashCode(this.f492420b)) * 31) + java.lang.Boolean.hashCode(this.f492421c)) * 31) + java.lang.Boolean.hashCode(this.f492422d)) * 31) + java.lang.Boolean.hashCode(this.f492423e);
    }

    /* renamed from: toString */
    public java.lang.String m165012x9616526c() {
        return "CodecErrorInfo(avcErrorNum=" + this.f492419a + ", hevcErrorNum=" + this.f492420b + ", nowInRenderState=" + this.f492421c + ", needReset=" + this.f492422d + ", needRecreate=" + this.f492423e + ')';
    }
}
