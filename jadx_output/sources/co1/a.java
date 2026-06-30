package co1;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f43746a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f43747b;

    public a(java.util.List list, java.lang.Long l17) {
        this.f43746a = list;
        this.f43747b = l17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1.a)) {
            return false;
        }
        co1.a aVar = (co1.a) obj;
        return kotlin.jvm.internal.o.b(this.f43746a, aVar.f43746a) && kotlin.jvm.internal.o.b(this.f43747b, aVar.f43747b);
    }

    public int hashCode() {
        java.util.List list = this.f43746a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        java.lang.Long l17 = this.f43747b;
        return hashCode + (l17 != null ? l17.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LastSplitPatMsg(lastPatMsgs=" + this.f43746a + ", lastSvrId=" + this.f43747b + ')';
    }
}
