package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h1 f223077d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.j1 j1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h1 h1Var) {
        this.f223077d = h1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.h1 h1Var = this.f223077d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h1Var.f223095a.K2.f222094s)) {
            if (r53.f.n(h1Var.f223095a.K2.f222094s)) {
                contextMenu.add(0, 13, 0, com.p314xaae8f345.mm.R.C30867xcad56011.fom);
            } else {
                contextMenu.add(0, 12, 0, com.p314xaae8f345.mm.R.C30867xcad56011.foo);
            }
        }
        contextMenu.add(0, 11, 0, com.p314xaae8f345.mm.R.C30867xcad56011.fln);
    }
}
