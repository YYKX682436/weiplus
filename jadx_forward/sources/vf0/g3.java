package vf0;

/* loaded from: classes7.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f517703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f517704b;

    public g3(int i17, int i18) {
        this.f517703a = i17;
        this.f517704b = i18;
    }

    /* renamed from: equals */
    public boolean m171748xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.g3)) {
            return false;
        }
        vf0.g3 g3Var = (vf0.g3) obj;
        return this.f517703a == g3Var.f517703a && this.f517704b == g3Var.f517704b;
    }

    /* renamed from: hashCode */
    public int m171749x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f517703a) * 31) + java.lang.Integer.hashCode(this.f517704b);
    }

    /* renamed from: toString */
    public java.lang.String m171750x9616526c() {
        return "VideoSendParam(forwardType=" + this.f517703a + ", source=" + this.f517704b + ')';
    }
}
