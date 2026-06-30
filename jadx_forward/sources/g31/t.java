package g31;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349650a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f349651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349652c;

    public t(java.lang.String bizUsername, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        this.f349650a = bizUsername;
        this.f349651b = z17;
        this.f349652c = i17;
    }

    /* renamed from: equals */
    public boolean m130790xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g31.t)) {
            return false;
        }
        g31.t tVar = (g31.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349650a, tVar.f349650a) && this.f349651b == tVar.f349651b && this.f349652c == tVar.f349652c;
    }

    /* renamed from: hashCode */
    public int m130791x8cdac1b() {
        return (((this.f349650a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f349651b)) * 31) + java.lang.Integer.hashCode(this.f349652c);
    }

    /* renamed from: toString */
    public java.lang.String m130792x9616526c() {
        return "NotifySwitchInfo(bizUsername=" + this.f349650a + ", isOpened=" + this.f349651b + ", importantNotifyNum=" + this.f349652c + ')';
    }
}
