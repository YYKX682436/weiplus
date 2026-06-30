package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes5.dex */
public class x6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTipsUI f101599d;

    public x6(com.tencent.mm.plugin.fav.ui.FavTipsUI favTipsUI) {
        this.f101599d = favTipsUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f101599d.finish();
    }
}
