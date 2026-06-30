package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class qi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f104396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi(com.tencent.mm.plugin.finder.convert.oj ojVar) {
        super(0);
        this.f104396d = ojVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f104396d;
        ojVar.getClass();
        r45.mo2 mo2Var = new r45.mo2();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String str = (java.lang.String) com.tencent.mm.plugin.finder.storage.t70.He.r();
            if (str == null) {
                str = "";
            }
            if (str.length() > 0) {
                byte[] bytes = str.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                mo2Var.parseFrom(bytes);
            }
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        com.tencent.mars.xlog.Log.i(ojVar.f104186h, "FINDER_TL_CARD_NEED_SKIP_ENTER is " + mo2Var.getInteger(0));
        return java.lang.Boolean.valueOf(mo2Var.getInteger(0) == 1);
    }
}
