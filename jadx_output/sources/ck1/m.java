package ck1;

/* loaded from: classes4.dex */
public final class m extends ck1.o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f42348a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String nickName) {
        super(null);
        kotlin.jvm.internal.o.g(nickName, "nickName");
        this.f42348a = nickName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ck1.m) && kotlin.jvm.internal.o.b(this.f42348a, ((ck1.m) obj).f42348a);
    }

    public int hashCode() {
        return this.f42348a.hashCode();
    }

    public java.lang.String toString() {
        return "PluginTitle(nickName=" + this.f42348a + ')';
    }
}
