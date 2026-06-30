package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes.dex */
public class o0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f272805d;

    public o0(java.util.List list) {
        this.f272805d = list;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        java.util.Iterator it = this.f272805d.iterator();
        while (it.hasNext()) {
            contextMenu.add(0, 0, 0, (java.lang.String) it.next());
        }
    }
}
