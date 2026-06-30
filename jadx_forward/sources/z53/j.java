package z53;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f551784a;

    /* renamed from: b, reason: collision with root package name */
    public final long f551785b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f551786c;

    /* renamed from: d, reason: collision with root package name */
    public final int f551787d;

    /* renamed from: e, reason: collision with root package name */
    public final long f551788e;

    public j(java.lang.String str, long j17, java.lang.String str2, int i17, long j18) {
        this.f551784a = str;
        this.f551785b = j17;
        this.f551786c = str2;
        this.f551787d = i17;
        this.f551788e = j18;
    }

    /* renamed from: equals */
    public boolean m178419xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z53.j)) {
            return false;
        }
        z53.j jVar = (z53.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f551784a, jVar.f551784a) && this.f551785b == jVar.f551785b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f551786c, jVar.f551786c) && this.f551787d == jVar.f551787d && this.f551788e == jVar.f551788e;
    }

    /* renamed from: hashCode */
    public int m178420x8cdac1b() {
        java.lang.String str = this.f551784a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + java.lang.Long.hashCode(this.f551785b)) * 31;
        java.lang.String str2 = this.f551786c;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f551787d)) * 31) + java.lang.Long.hashCode(this.f551788e);
    }

    /* renamed from: toString */
    public java.lang.String m178421x9616526c() {
        return "GameLifeConversationInfo(talker=" + this.f551784a + ", msgId=" + this.f551785b + ", externInfo=" + this.f551786c + ", msgType=" + this.f551787d + ", updateTime=" + this.f551788e + ')';
    }
}
