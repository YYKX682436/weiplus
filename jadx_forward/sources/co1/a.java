package co1;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f125279a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f125280b;

    public a(java.util.List list, java.lang.Long l17) {
        this.f125279a = list;
        this.f125280b = l17;
    }

    /* renamed from: equals */
    public boolean m15387xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1.a)) {
            return false;
        }
        co1.a aVar = (co1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125279a, aVar.f125279a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125280b, aVar.f125280b);
    }

    /* renamed from: hashCode */
    public int m15388x8cdac1b() {
        java.util.List list = this.f125279a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.Long l17 = this.f125280b;
        return hashCode + (l17 != null ? l17.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m15389x9616526c() {
        return "LastSplitPatMsg(lastPatMsgs=" + this.f125279a + ", lastSvrId=" + this.f125280b + ')';
    }
}
