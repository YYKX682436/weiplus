package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes11.dex */
public class q1 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u1 f182315d;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u1 u1Var) {
        this.f182315d = u1Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u1 u1Var = this.f182315d;
        if (u1Var.f182336d.getIntent().getBooleanExtra("key_detail_can_share_to_friend", true)) {
            g4Var.f(2, u1Var.f182336d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccw));
        }
        g4Var.f(0, u1Var.f182336d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572727ca3));
        g4Var.f(1, u1Var.f182336d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ccl));
        g4Var.f(3, u1Var.f182336d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572728ca4));
        g4Var.f(4, u1Var.f182336d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0));
    }
}
