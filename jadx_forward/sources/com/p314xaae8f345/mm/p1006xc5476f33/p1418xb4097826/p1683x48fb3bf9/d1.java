package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9;

/* loaded from: classes8.dex */
public class d1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 f218393d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var) {
        this.f218393d = n1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public void mo889xb349b3ab() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1 n1Var = this.f218393d;
        n1Var.b(5, null);
        if (n1Var.f218434e == null || n1Var.f().mo63365x1e89676e() == null) {
            return;
        }
        try {
            n1Var.f218430a.clear();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) n1Var.f218436g).n();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.n1.a(n1Var, n1Var.f218434e.f367729c);
            n1Var.f218434e.b();
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickHelper", "cancel capture failed");
        }
    }
}
