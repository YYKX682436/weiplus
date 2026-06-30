package lc5;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f399550a;

    /* renamed from: b, reason: collision with root package name */
    public final long f399551b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f399552c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f399553d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f399554e;

    public m(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f399550a = j17;
        this.f399551b = j18;
        this.f399552c = str;
        this.f399553d = str2;
        this.f399554e = str3;
    }

    /* renamed from: equals */
    public boolean m145614xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc5.m)) {
            return false;
        }
        lc5.m mVar = (lc5.m) obj;
        return this.f399550a == mVar.f399550a && this.f399551b == mVar.f399551b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399552c, mVar.f399552c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399553d, mVar.f399553d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f399554e, mVar.f399554e);
    }

    /* renamed from: hashCode */
    public int m145615x8cdac1b() {
        int hashCode = ((java.lang.Long.hashCode(this.f399550a) * 31) + java.lang.Long.hashCode(this.f399551b)) * 31;
        java.lang.String str = this.f399552c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f399553d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f399554e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m145616x9616526c() {
        return "MessageInfo(msgId=" + this.f399550a + ", msgSvrId=" + this.f399551b + ", talker=" + this.f399552c + ", chatroomName=" + this.f399553d + ", msgTalker=" + this.f399554e + ')';
    }
}
