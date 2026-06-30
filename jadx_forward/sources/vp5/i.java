package vp5;

/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f520649a;

    /* renamed from: b, reason: collision with root package name */
    public final long f520650b;

    /* renamed from: c, reason: collision with root package name */
    public final long f520651c;

    /* renamed from: d, reason: collision with root package name */
    public final long f520652d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f520653e;

    public i(java.lang.String appid, long j17, long j18, long j19, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appid, "appid");
        this.f520649a = appid;
        this.f520650b = j17;
        this.f520651c = j18;
        this.f520652d = j19;
        this.f520653e = z17;
    }

    /* renamed from: equals */
    public boolean m172467xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.i)) {
            return false;
        }
        vp5.i iVar = (vp5.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520649a, iVar.f520649a) && this.f520650b == iVar.f520650b && this.f520651c == iVar.f520651c && this.f520652d == iVar.f520652d && this.f520653e == iVar.f520653e;
    }

    /* renamed from: hashCode */
    public int m172468x8cdac1b() {
        return (((((((this.f520649a.hashCode() * 31) + java.lang.Long.hashCode(this.f520650b)) * 31) + java.lang.Long.hashCode(this.f520651c)) * 31) + java.lang.Long.hashCode(this.f520652d)) * 31) + java.lang.Boolean.hashCode(this.f520653e);
    }

    /* renamed from: toString */
    public java.lang.String m172469x9616526c() {
        return "RuntimeReadyData(appid=" + this.f520649a + ", appVersion=" + this.f520650b + ", appState=" + this.f520651c + ", uvLoopPtr=" + this.f520652d + ", forceHavePermission=" + this.f520653e + ")";
    }
}
