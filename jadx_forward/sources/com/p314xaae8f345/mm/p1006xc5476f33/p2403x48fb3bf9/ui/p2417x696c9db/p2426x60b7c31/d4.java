package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class d4 implements h45.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266583b;

    public d4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266583b = c1Var;
        this.f266582a = y2Var;
    }

    @Override // h45.r
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "secureTunnel callback fail");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_desc", str);
        this.f266583b.i5(this.f266582a, "secureTunnel:fail", hashMap);
    }

    @Override // h45.r
    /* renamed from: onSuccess */
    public void mo74492xe05b4124(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "secureTunnel callback success");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("respbuf", str);
        this.f266583b.i5(this.f266582a, "secureTunnel:ok", hashMap);
    }
}
