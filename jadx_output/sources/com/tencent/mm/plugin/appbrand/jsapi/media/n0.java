package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class n0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.t0 f81946d;

    public n0(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        this.f81946d = t0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var = this.f81946d;
        contextMenu.add(0, 1, 0, t0Var.f82060a.getContext().getString(com.tencent.mm.R.string.f490407u4));
        contextMenu.add(0, 2, 1, t0Var.f82060a.getContext().getString(com.tencent.mm.R.string.f490415uc));
    }
}
