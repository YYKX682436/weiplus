package dk5;

/* loaded from: classes9.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f316157a = true;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f316158b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f316159c = null;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 f316160d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f316161e = 0;

    /* renamed from: equals */
    public boolean m124711xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk5.f6)) {
            return false;
        }
        dk5.f6 f6Var = (dk5.f6) obj;
        return this.f316157a == f6Var.f316157a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f316158b, f6Var.f316158b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f316159c, f6Var.f316159c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f316160d, f6Var.f316160d) && this.f316161e == f6Var.f316161e;
    }

    /* renamed from: hashCode */
    public int m124712x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f316157a) * 31;
        java.lang.String str = this.f316158b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f316159c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1767x491bc7bd.C16075xd72ab138 c16075xd72ab138 = this.f316160d;
        return ((hashCode3 + (c16075xd72ab138 != null ? c16075xd72ab138.m64925x8cdac1b() : 0)) * 31) + java.lang.Integer.hashCode(this.f316161e);
    }

    /* renamed from: toString */
    public java.lang.String m124713x9616526c() {
        return "SendWXMediaMessageExtInfo(ifSetTodo=" + this.f316157a + ", platformSignature=" + this.f316158b + ", gameShareMsgId=" + this.f316159c + ", liteAppBizDataInfo=" + this.f316160d + ", isModified=" + this.f316161e + ')';
    }
}
