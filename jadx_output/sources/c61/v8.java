package c61;

/* loaded from: classes2.dex */
public final class v8 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f39351a;

    public v8(kotlin.jvm.internal.h0 h0Var) {
        this.f39351a = h0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70616b;
        kotlin.jvm.internal.h0 h0Var = this.f39351a;
        if (i17 == 0 && fVar.f70615a == 0) {
            ot5.g.c("FinderReportFeatureService", "successfully! size=" + ((java.util.LinkedList) h0Var.f310123d).size());
        } else {
            ot5.g.d("FinderReportFeatureService", "fail to report! size=" + ((java.util.LinkedList) h0Var.f310123d).size());
        }
        return jz5.f0.f302826a;
    }
}
