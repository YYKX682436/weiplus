package ro5;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f479714a;

    /* renamed from: b, reason: collision with root package name */
    public final int f479715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f479716c;

    /* renamed from: d, reason: collision with root package name */
    public final int f479717d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f479718e;

    public e(int i17, int i18, int i19, int i27, boolean z17) {
        this.f479714a = i17;
        this.f479715b = i18;
        this.f479716c = i19;
        this.f479717d = i27;
        this.f479718e = z17;
    }

    /* renamed from: equals */
    public boolean m162808xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro5.e)) {
            return false;
        }
        ro5.e eVar = (ro5.e) obj;
        return this.f479714a == eVar.f479714a && this.f479715b == eVar.f479715b && this.f479716c == eVar.f479716c && this.f479717d == eVar.f479717d && this.f479718e == eVar.f479718e;
    }

    /* renamed from: hashCode */
    public int m162809x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f479714a) * 31) + java.lang.Integer.hashCode(this.f479715b)) * 31) + java.lang.Integer.hashCode(this.f479716c)) * 31) + java.lang.Integer.hashCode(this.f479717d)) * 31) + java.lang.Boolean.hashCode(this.f479718e);
    }

    /* renamed from: toString */
    public java.lang.String m162810x9616526c() {
        return "MemberInfo(memberId=" + this.f479714a + ", width=" + this.f479715b + ", height=" + this.f479716c + ", rotate=" + this.f479717d + ", isLandscapeMode=" + this.f479718e + ')';
    }
}
