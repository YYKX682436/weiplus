package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 f266781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266783f;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5, nw4.y2 y2Var) {
        this.f266783f = c1Var;
        this.f266781d = c6236xbc6b9a5;
        this.f266782e = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6236xbc6b9a5 c6236xbc6b9a5 = this.f266781d;
        int i17 = c6236xbc6b9a5.f136485h.f88159a;
        nw4.y2 y2Var = this.f266782e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266783f;
        if (i17 == 0) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("buffer", c6236xbc6b9a5.f136485h.f88160b);
            c1Var.i5(y2Var, "handleWCPayWalletBuffer:ok", hashMap);
        } else if (i17 == -2) {
            c1Var.i5(y2Var, "handleWCPayWalletBuffer:null", null);
        } else {
            c1Var.i5(y2Var, "handleWCPayWalletBuffer:fail", null);
        }
    }
}
