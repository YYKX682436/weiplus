package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class q9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r9 f281293d;

    public q9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r9 r9Var) {
        this.f281293d = r9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p9 p9Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p9(this);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.r9 r9Var = this.f281293d;
        if ((r9Var.f280113d.p() instanceof android.view.View) && (((android.view.View) r9Var.f280113d.p()).getParent() instanceof android.view.View)) {
            ((android.view.View) ((android.view.View) r9Var.f280113d.p()).getParent()).setOnDragListener(p9Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.DragDropComponent", "mChattingContext.getListView() null!");
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) r9Var.f280113d.f542241c.a(sb5.s0.class))).f280796e;
        if (c19666xfd6e2f33 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUI.DragDropComponent", "chatFooter null!");
        } else {
            c19666xfd6e2f33.setOnDragListener(p9Var);
            c19666xfd6e2f33.m75486xa811fac0(p9Var);
        }
    }
}
