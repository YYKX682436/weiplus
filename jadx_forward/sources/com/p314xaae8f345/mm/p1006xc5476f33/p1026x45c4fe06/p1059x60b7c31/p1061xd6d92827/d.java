package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1061xd6d92827;

/* loaded from: classes7.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f160263d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160264e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f160265f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(yz5.q qVar, java.lang.String str, java.lang.String str2) {
        super(1);
        this.f160263d = qVar;
        this.f160264e = str;
        this.f160265f = str2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String reason = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNavigateToMiniProgram.MB", "[MBAd] navigate executed but failed, reason: ".concat(reason));
        this.f160263d.mo147xb9724478(mq0.a.f412052n, kz5.c1.k(new jz5.l("impl", this.f160264e), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54560xfb23a562, reason), new jz5.l("strategy", this.f160265f)), "fail: ".concat(reason));
        return jz5.f0.f384359a;
    }
}
