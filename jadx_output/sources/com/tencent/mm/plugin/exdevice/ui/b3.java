package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes.dex */
public class b3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI f99409d;

    public b3(com.tencent.mm.plugin.exdevice.ui.ExdeviceLikeUI exdeviceLikeUI) {
        this.f99409d = exdeviceLikeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        this.f99409d.finish();
        return false;
    }
}
