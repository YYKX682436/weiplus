package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class t9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268079e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t9(nw4.k kVar, nw4.y2 y2Var) {
        super(2);
        this.f268078d = kVar;
        this.f268079e = y2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.HashMap hashMap = new java.util.HashMap();
        nw4.y2 y2Var = this.f268079e;
        nw4.k kVar = this.f268078d;
        if (booleanValue) {
            hashMap.put("retCode", 0);
            hashMap.put("msg", "sendPcRemindMsg:ok");
            kVar.f422396d.e(y2Var.f422546c, "sendPcRemindMsg:ok", hashMap);
        } else {
            hashMap.put("retCode", -1);
            hashMap.put("msg", "sendPcRemindMsg:fail");
            kVar.f422396d.e(y2Var.f422546c, "sendPcRemindMsg:fail:", hashMap);
        }
        return jz5.f0.f384359a;
    }
}
