package bu2;

/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.q2 f24549a;

    public m(com.tencent.mm.plugin.finder.feed.q2 q2Var) {
        this.f24549a = q2Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bu2.m) && kotlin.jvm.internal.o.b(this.f24549a, ((bu2.m) obj).f24549a);
    }

    public int hashCode() {
        com.tencent.mm.plugin.finder.feed.q2 q2Var = this.f24549a;
        if (q2Var == null) {
            return 0;
        }
        return q2Var.hashCode();
    }

    public java.lang.String toString() {
        return "GlobalExtra(wording=" + this.f24549a + ')';
    }
}
