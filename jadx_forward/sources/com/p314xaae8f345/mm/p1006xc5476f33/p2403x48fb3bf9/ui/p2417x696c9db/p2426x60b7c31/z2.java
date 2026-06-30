package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class z2 implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f267111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f267112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f267113f;

    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f267113f = c1Var;
        this.f267111d = str;
        this.f267112e = y2Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.Integer num = (java.lang.Integer) obj3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doGetFinderLivePreviewUrl errCode:%s", num);
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            hashMap.put("ret", num);
            hashMap.put("url", str);
            hashMap.put("requestId", this.f267111d);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHandler", "doGetFinderLivePreviewUrl" + e17.getMessage());
        }
        this.f267113f.i5(this.f267112e, "onGetFinderLivePreviewUrl:ok", hashMap);
        return null;
    }
}
