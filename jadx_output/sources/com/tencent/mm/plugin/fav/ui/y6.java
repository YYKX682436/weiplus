package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes5.dex */
public class y6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTipsUI f101623d;

    public y6(com.tencent.mm.plugin.fav.ui.FavTipsUI favTipsUI) {
        this.f101623d = favTipsUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f101623d.finish();
    }
}
