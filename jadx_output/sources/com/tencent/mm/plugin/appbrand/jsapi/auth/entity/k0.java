package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes.dex */
public final class k0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f79511d;

    public k0(android.view.View view) {
        this.f79511d = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.view.View view2 = this.f79511d;
        contextMenu.add(0, 1, 0, view2.getContext().getResources().getString(com.tencent.mm.R.string.f490621d50));
        contextMenu.add(0, 0, 0, view2.getContext().getResources().getString(com.tencent.mm.R.string.a08));
    }
}
