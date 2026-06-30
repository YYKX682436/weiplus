package um5;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 f510668a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 f510669b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2825x7e128009.C22963xba2dd2fa f510670c;

    public b0(com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 fromLayout, com.p314xaae8f345.mm.p2825x7e128009.C22964x8b2a0b18 toLayout, com.p314xaae8f345.mm.p2825x7e128009.C22963xba2dd2fa animate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromLayout, "fromLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toLayout, "toLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animate, "animate");
        this.f510668a = fromLayout;
        this.f510669b = toLayout;
        this.f510670c = animate;
    }

    /* renamed from: equals */
    public boolean m168259xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof um5.b0)) {
            return false;
        }
        um5.b0 b0Var = (um5.b0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510668a, b0Var.f510668a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510669b, b0Var.f510669b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510670c, b0Var.f510670c);
    }

    /* renamed from: hashCode */
    public int m168260x8cdac1b() {
        return (((this.f510668a.hashCode() * 31) + this.f510669b.hashCode()) * 31) + this.f510670c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m168261x9616526c() {
        return "TextureLayoutAnimation(fromLayout=" + this.f510668a + ", toLayout=" + this.f510669b + ", animate=" + this.f510670c + ')';
    }
}
