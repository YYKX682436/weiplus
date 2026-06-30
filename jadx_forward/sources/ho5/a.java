package ho5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f364428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f364429b;

    /* renamed from: c, reason: collision with root package name */
    public final int f364430c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f364431d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f364432e;

    public a(int i17, int i18, int i19, boolean z17, boolean z18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i19 = (i27 & 4) != 0 ? i18 : i19;
        z17 = (i27 & 8) != 0 ? false : z17;
        z18 = (i27 & 16) != 0 ? false : z18;
        this.f364428a = i17;
        this.f364429b = i18;
        this.f364430c = i19;
        this.f364431d = z17;
        this.f364432e = z18;
    }

    /* renamed from: equals */
    public boolean m133845xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho5.a)) {
            return false;
        }
        ho5.a aVar = (ho5.a) obj;
        return this.f364428a == aVar.f364428a && this.f364429b == aVar.f364429b && this.f364430c == aVar.f364430c && this.f364431d == aVar.f364431d && this.f364432e == aVar.f364432e;
    }

    /* renamed from: hashCode */
    public int m133846x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f364428a) * 31) + java.lang.Integer.hashCode(this.f364429b)) * 31) + java.lang.Integer.hashCode(this.f364430c)) * 31) + java.lang.Boolean.hashCode(this.f364431d)) * 31) + java.lang.Boolean.hashCode(this.f364432e);
    }

    /* renamed from: toString */
    public java.lang.String m133847x9616526c() {
        return "MsgContentInfo(type=" + this.f364428a + ", contentResId=" + this.f364429b + ", contentResIdWithoutTime=" + this.f364430c + ", redDot=" + this.f364431d + ", needTime=" + this.f364432e + ')';
    }
}
