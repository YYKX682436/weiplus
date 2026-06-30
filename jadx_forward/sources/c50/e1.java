package c50;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f120130a;

    /* renamed from: b, reason: collision with root package name */
    public final long f120131b;

    /* renamed from: c, reason: collision with root package name */
    public final float f120132c;

    /* renamed from: d, reason: collision with root package name */
    public final int f120133d;

    public e1(int i17, long j17, float f17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i19 & 4) != 0 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) : f17;
        i18 = (i19 & 8) != 0 ? -1 : i18;
        this.f120130a = i17;
        this.f120131b = j17;
        this.f120132c = f17;
        this.f120133d = i18;
    }

    /* renamed from: equals */
    public boolean m14158xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c50.e1)) {
            return false;
        }
        c50.e1 e1Var = (c50.e1) obj;
        return this.f120130a == e1Var.f120130a && this.f120131b == e1Var.f120131b && java.lang.Float.compare(this.f120132c, e1Var.f120132c) == 0 && this.f120133d == e1Var.f120133d;
    }

    /* renamed from: hashCode */
    public int m14159x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f120130a) * 31) + java.lang.Long.hashCode(this.f120131b)) * 31) + java.lang.Float.hashCode(this.f120132c)) * 31) + java.lang.Integer.hashCode(this.f120133d);
    }

    /* renamed from: toString */
    public java.lang.String m14160x9616526c() {
        return "LiveFluentAnimConfig(bgColor=" + this.f120130a + ", duration=" + this.f120131b + ", clipCanvasRadius=" + this.f120132c + ", frameBgColor=" + this.f120133d + ')';
    }
}
