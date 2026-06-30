package ck1;

/* loaded from: classes4.dex */
public final class n extends ck1.o {

    /* renamed from: a, reason: collision with root package name */
    public final ck1.t0 f42353a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ck1.t0 usageInfoItem) {
        super(null);
        kotlin.jvm.internal.o.g(usageInfoItem, "usageInfoItem");
        this.f42353a = usageInfoItem;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck1.n) && kotlin.jvm.internal.o.b(this.f42353a, ((ck1.n) obj).f42353a);
    }

    public int hashCode() {
        return this.f42353a.hashCode();
    }

    public java.lang.String toString() {
        return "UserInfo(usageInfoItem=" + this.f42353a + ')';
    }
}
