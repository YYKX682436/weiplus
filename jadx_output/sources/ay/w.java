package ay;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f15192a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f15193b;

    public w(java.lang.String answeringTraceId, java.util.List queryList) {
        kotlin.jvm.internal.o.g(answeringTraceId, "answeringTraceId");
        kotlin.jvm.internal.o.g(queryList, "queryList");
        this.f15192a = answeringTraceId;
        this.f15193b = queryList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay.w)) {
            return false;
        }
        ay.w wVar = (ay.w) obj;
        return kotlin.jvm.internal.o.b(this.f15192a, wVar.f15192a) && kotlin.jvm.internal.o.b(this.f15193b, wVar.f15193b);
    }

    public int hashCode() {
        return (this.f15192a.hashCode() * 31) + this.f15193b.hashCode();
    }

    public java.lang.String toString() {
        return "QueryListUIState(answeringTraceId=" + this.f15192a + ", queryList=" + this.f15193b + ')';
    }
}
