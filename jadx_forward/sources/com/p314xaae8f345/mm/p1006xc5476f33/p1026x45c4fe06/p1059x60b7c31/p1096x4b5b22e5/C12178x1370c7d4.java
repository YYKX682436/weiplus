package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/MiniProgramNavigatorUglyLogic$ProxyTask$handleRequest$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/service/AppBrandUIEnterAnimationCompleteEvent;", "Landroidx/lifecycle/f;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.MiniProgramNavigatorUglyLogic$ProxyTask$handleRequest$1 */
/* loaded from: classes7.dex */
public final class C12178x1370c7d4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b> implements p012xc85e97e9.p093xedfae76a.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.C12177xa68d2e64 f163720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f163721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12178x1370c7d4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1096x4b5b22e5.C12177xa68d2e64 c12177xa68d2e64, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.app.a0 a0Var) {
        super(a0Var);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        this.f163720d = c12177xa68d2e64;
        this.f163721e = c11809xbc286be4;
        m50421x3c6fed6a = c12177xa68d2e64.m50421x3c6fed6a();
        m50421x3c6fed6a.mo273xed6858b4().a(this);
        this.f39173x3fe91575 = 551436157;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
    /* renamed from: callback */
    public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b c12573x6a664d3b) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12573x6a664d3b event = c12573x6a664d3b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("proxy in mm, after start ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4 = this.f163721e;
        sb6.append(c11809xbc286be4.f158811d);
        sb6.append('(');
        sb6.append(c11809xbc286be4.f128810w);
        sb6.append("), appBrandUiName:");
        sb6.append(event.f170135g.f170225a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MiniProgramNavigatorUglyLogic", sb6.toString());
        mo48814x2efc64();
        this.f163720d.m50420x7b736e5c(null);
        return false;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
    /* renamed from: onDestroy */
    public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        mo48814x2efc64();
    }
}
