package com.tencent.mm.plugin.appbrand.jsapi.emoji;

/* loaded from: classes13.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.emoji.g f80841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f80842e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.appbrand.jsapi.emoji.g gVar, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(1);
        this.f80841d = gVar;
        this.f80842e = u3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f80842e;
        com.tencent.mm.plugin.appbrand.jsapi.emoji.g gVar = this.f80841d;
        gVar.runOnUiThread(new com.tencent.mm.plugin.appbrand.jsapi.emoji.d(u3Var, (r45.v75) obj, gVar));
        return jz5.f0.f302826a;
    }
}
