package ck1;

/* loaded from: classes4.dex */
public final class l extends ck1.o {

    /* renamed from: a, reason: collision with root package name */
    public final r45.vf7 f42344a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r45.vf7 appInfo) {
        super(null);
        kotlin.jvm.internal.o.g(appInfo, "appInfo");
        this.f42344a = appInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck1.l) && kotlin.jvm.internal.o.b(this.f42344a, ((ck1.l) obj).f42344a);
    }

    public int hashCode() {
        return this.f42344a.hashCode();
    }

    public java.lang.String toString() {
        return "Header(appInfo=" + this.f42344a + ')';
    }
}
