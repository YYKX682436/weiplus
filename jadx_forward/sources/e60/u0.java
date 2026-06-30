package e60;

/* loaded from: classes11.dex */
public final class u0 implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final int f331273d;

    /* renamed from: e, reason: collision with root package name */
    public final int f331274e;

    /* renamed from: f, reason: collision with root package name */
    public final int f331275f;

    /* renamed from: g, reason: collision with root package name */
    public final int f331276g;

    public u0(int i17, int i18, int i19, int i27) {
        this.f331273d = i17;
        this.f331274e = i18;
        this.f331275f = i19;
        this.f331276g = i27;
    }

    /* renamed from: equals */
    public boolean m127054xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e60.u0)) {
            return false;
        }
        e60.u0 u0Var = (e60.u0) obj;
        return this.f331273d == u0Var.f331273d && this.f331274e == u0Var.f331274e && this.f331275f == u0Var.f331275f && this.f331276g == u0Var.f331276g;
    }

    /* renamed from: hashCode */
    public int m127055x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f331273d) * 31) + java.lang.Integer.hashCode(this.f331274e)) * 31) + java.lang.Integer.hashCode(this.f331275f)) * 31) + java.lang.Integer.hashCode(this.f331276g);
    }

    /* renamed from: toString */
    public java.lang.String m127056x9616526c() {
        return "GalleryEnterRect(left=" + this.f331273d + ", top=" + this.f331274e + ", width=" + this.f331275f + ", height=" + this.f331276g + ')';
    }
}
