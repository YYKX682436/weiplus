package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class m4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae f266807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266809f;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5314x8b748bae c5314x8b748bae, nw4.y2 y2Var) {
        this.f266809f = c1Var;
        this.f266807d = c5314x8b748bae;
        this.f266808e = y2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "run ecard jsapi check callback");
        int i17 = this.f266807d.f135630h.f88542a;
        nw4.y2 y2Var = this.f266808e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266809f;
        if (i17 == 0) {
            c1Var.i5(y2Var, "openECard:ok", null);
        } else {
            c1Var.i5(y2Var, "openECard:fail", null);
        }
    }
}
