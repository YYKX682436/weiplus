package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* loaded from: classes8.dex */
public class j1 implements db5.m4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k1 f293379a;

    public j1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l1 l1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k1 k1Var) {
        this.f293379a = k1Var;
    }

    public void a(db5.h4 h4Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k1 k1Var = this.f293379a;
        java.lang.Object tag = k1Var.f293429f.getTag();
        if ((tag instanceof db5.h4) && h4Var.equals((db5.h4) tag)) {
            k1Var.f293429f.setVisibility(0);
            k1Var.f293429f.setImageDrawable(h4Var.getIcon());
        }
    }
}
