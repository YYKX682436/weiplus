package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class b3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f267500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267501e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f267500d = kVar;
        this.f267501e = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nw4.k kVar = this.f267500d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = kVar.f422397e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a59);
        float m81401x1f106092 = c22633x83752a59.m81401x1f106092();
        nw4.g gVar = kVar.f422396d;
        nw4.y2 y2Var = this.f267501e;
        if (m81401x1f106092 <= 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleDeviceInfo", "getStatusBarAndActionBarHeight fail, density=" + m81401x1f106092);
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail invalid density", null);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("statusBarHeight", java.lang.Integer.valueOf(a06.d.b(com.p314xaae8f345.mm.ui.bl.h(kVar.f422393a) / m81401x1f106092)));
            hashMap.put("actionBarHeight", java.lang.Integer.valueOf(a06.d.b(com.p314xaae8f345.mm.ui.bl.a(kVar.f422393a) / m81401x1f106092)));
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        }
        return jz5.f0.f384359a;
    }
}
