package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public class r0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f283970d;

    public r0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.t0 t0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var) {
        this.f283970d = f0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i29));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 f0Var = this.f283970d;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(f0Var.f279945e) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(f0Var.f279945e)) {
            contextMenu.add(0, 1, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1o));
        }
        contextMenu.add(0, 2, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fgq));
        contextMenu.add(0, 3, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p));
    }
}
