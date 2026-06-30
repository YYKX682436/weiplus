package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67623d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(java.lang.String str) {
        super(1);
        this.f67623d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dr0.u0 reportStage = (dr0.u0) obj;
        kotlin.jvm.internal.o.g(reportStage, "$this$reportStage");
        java.lang.String[] strArr = new java.lang.String[2];
        strArr[0] = this.f67623d;
        strArr[1] = com.tencent.mm.sdk.platformtools.x2.f193077g ? "1" : "0";
        reportStage.f242558a = kz5.c0.i(strArr);
        reportStage.f242559b = new java.lang.Throwable();
        return jz5.f0.f302826a;
    }
}
