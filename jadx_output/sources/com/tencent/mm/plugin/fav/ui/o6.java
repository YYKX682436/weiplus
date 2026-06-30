package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class o6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101320d;

    public o6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI) {
        this.f101320d = favTagEditUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f101320d.finish();
    }
}
