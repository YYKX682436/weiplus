package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class q4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f67643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f67644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f67645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(java.lang.String[] strArr, java.lang.Throwable th6, java.util.Map map) {
        super(1);
        this.f67643d = strArr;
        this.f67644e = th6;
        this.f67645f = map;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dr0.u0 reportStage = (dr0.u0) obj;
        kotlin.jvm.internal.o.g(reportStage, "$this$reportStage");
        java.lang.String[] strArr = this.f67643d;
        reportStage.f242558a = kz5.z.n0(strArr, e06.p.m(1, strArr.length));
        reportStage.f242559b = this.f67644e;
        java.util.Map map = this.f67645f;
        if (map != null) {
            reportStage.f242560c = map;
        }
        return jz5.f0.f302826a;
    }
}
