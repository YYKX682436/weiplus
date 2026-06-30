package yb5;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f542275a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f542276b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.z3 f542277c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f542278d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f542279e;

    public q(java.lang.String talkerUserName, java.lang.String str, com.p314xaae8f345.mm.p2621x8fb0427b.z3 talker, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkerUserName, "talkerUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f542275a = talkerUserName;
        this.f542276b = str;
        this.f542277c = talker;
        this.f542278d = z17;
        this.f542279e = z18;
    }

    /* renamed from: equals */
    public boolean m176769xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yb5.q)) {
            return false;
        }
        yb5.q qVar = (yb5.q) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542275a, qVar.f542275a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542276b, qVar.f542276b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f542277c, qVar.f542277c) && this.f542278d == qVar.f542278d && this.f542279e == qVar.f542279e;
    }

    /* renamed from: hashCode */
    public int m176770x8cdac1b() {
        int hashCode = this.f542275a.hashCode() * 31;
        java.lang.String str = this.f542276b;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f542277c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f542278d)) * 31) + java.lang.Boolean.hashCode(this.f542279e);
    }

    /* renamed from: toString */
    public java.lang.String m176771x9616526c() {
        return "ChattingTalkerInfo(talkerUserName=" + this.f542275a + ", talkerNickName=" + this.f542276b + ", talker=" + this.f542277c + ", isGroupChat=" + this.f542278d + ", isAppBrandServiceChat=" + this.f542279e + ')';
    }
}
