package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421;

/* loaded from: classes7.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 f159173d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var) {
        this.f159173d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1047x20a6f421.l2 l2Var = this.f159173d;
        if (l2Var.f159317e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RemoteDebugView", "showDebugView mContentView is null");
            return;
        }
        if (!l2Var.c()) {
            l2Var.setBackgroundColor(l2Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            return;
        }
        l2Var.setVisibility(0);
        if (l2Var.f159317e.indexOfChild(l2Var) == -1) {
            l2Var.f159317e.addView(l2Var);
        }
        l2Var.f159317e.bringChildToFront(l2Var);
        l2Var.setBackgroundColor(l2Var.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
    }
}
