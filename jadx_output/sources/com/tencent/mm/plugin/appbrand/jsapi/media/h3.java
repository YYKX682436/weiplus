package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class h3 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81832d;

    public h3(com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var, android.content.Context context) {
        this.f81832d = context;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.content.Context context = this.f81832d;
        contextMenu.add(0, 1, 0, context.getString(com.tencent.mm.R.string.f490407u4));
        contextMenu.add(0, 2, 1, context.getString(com.tencent.mm.R.string.f490415uc));
    }
}
