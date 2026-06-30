package ck1;

/* loaded from: classes4.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vf7 f42381a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.vf7 f42382b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.kv5 f42383c;

    public t0(r45.vf7 hostAppInfo, r45.vf7 vf7Var, r45.kv5 usageInfo) {
        kotlin.jvm.internal.o.g(hostAppInfo, "hostAppInfo");
        kotlin.jvm.internal.o.g(usageInfo, "usageInfo");
        this.f42381a = hostAppInfo;
        this.f42382b = vf7Var;
        this.f42383c = usageInfo;
    }

    public final java.lang.String a(r45.vf7 vf7Var) {
        return "WxaUseUserInfoItem(appid=" + vf7Var.f388193d + ", nick_name=" + vf7Var.f388194e + ", icon_url=" + vf7Var.f388195f + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck1.t0)) {
            return false;
        }
        ck1.t0 t0Var = (ck1.t0) obj;
        return kotlin.jvm.internal.o.b(this.f42381a, t0Var.f42381a) && kotlin.jvm.internal.o.b(this.f42382b, t0Var.f42382b) && kotlin.jvm.internal.o.b(this.f42383c, t0Var.f42383c);
    }

    public int hashCode() {
        int hashCode = this.f42381a.hashCode() * 31;
        r45.vf7 vf7Var = this.f42382b;
        return ((hashCode + (vf7Var == null ? 0 : vf7Var.hashCode())) * 31) + this.f42383c.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("UserInfoUsageInfoItem(hostAppInfo=");
        sb6.append(a(this.f42381a));
        sb6.append(", hostPluginInfo=");
        r45.vf7 vf7Var = this.f42382b;
        if (vf7Var == null || (str = a(vf7Var)) == null) {
            str = "null";
        }
        sb6.append(str);
        sb6.append(", usageInfo=");
        sb6.append(this.f42383c.toJSON());
        sb6.append(')');
        return sb6.toString();
    }
}
