package ck1;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vf7 f123914a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.vf7 f123915b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.kv5 f123916c;

    public t0(r45.vf7 hostAppInfo, r45.vf7 vf7Var, r45.kv5 usageInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hostAppInfo, "hostAppInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usageInfo, "usageInfo");
        this.f123914a = hostAppInfo;
        this.f123915b = vf7Var;
        this.f123916c = usageInfo;
    }

    public final java.lang.String a(r45.vf7 vf7Var) {
        return "WxaUseUserInfoItem(appid=" + vf7Var.f469726d + ", nick_name=" + vf7Var.f469727e + ", icon_url=" + vf7Var.f469728f + ')';
    }

    /* renamed from: equals */
    public boolean m15002xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck1.t0)) {
            return false;
        }
        ck1.t0 t0Var = (ck1.t0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123914a, t0Var.f123914a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123915b, t0Var.f123915b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f123916c, t0Var.f123916c);
    }

    /* renamed from: hashCode */
    public int m15003x8cdac1b() {
        int hashCode = this.f123914a.hashCode() * 31;
        r45.vf7 vf7Var = this.f123915b;
        return ((hashCode + (vf7Var == null ? 0 : vf7Var.hashCode())) * 31) + this.f123916c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m15004x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UserInfoUsageInfoItem(hostAppInfo=");
        sb6.append(a(this.f123914a));
        sb6.append(", hostPluginInfo=");
        r45.vf7 vf7Var = this.f123915b;
        if (vf7Var == null || (str = a(vf7Var)) == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append(", usageInfo=");
        sb6.append(this.f123916c.mo12245xcc313de3());
        sb6.append(')');
        return sb6.toString();
    }
}
