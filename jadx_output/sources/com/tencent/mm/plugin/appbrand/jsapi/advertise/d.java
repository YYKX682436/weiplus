package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f78730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78731e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f78732f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yz5.q qVar, java.lang.String str, java.lang.String str2) {
        super(1);
        this.f78730d = qVar;
        this.f78731e = str;
        this.f78732f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(reason, "reason");
        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] navigate executed but failed, reason: ".concat(reason));
        this.f78730d.invoke(mq0.a.f330519n, kz5.c1.k(new jz5.l("impl", this.f78731e), new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, reason), new jz5.l("strategy", this.f78732f)), "fail: ".concat(reason));
        return jz5.f0.f302826a;
    }
}
