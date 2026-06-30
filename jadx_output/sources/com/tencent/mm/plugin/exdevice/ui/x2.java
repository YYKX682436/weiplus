package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public final class x2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI f99719d;

    public x2(com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI) {
        this.f99719d = exdeviceFollowsUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI = this.f99719d;
        java.lang.String string = exdeviceFollowsUI.getString(com.tencent.mm.R.string.f490573yv);
        com.tencent.mm.plugin.exdevice.ui.ExdeviceFollowsUI exdeviceFollowsUI2 = this.f99719d;
        exdeviceFollowsUI.f99279i = db5.e1.R(exdeviceFollowsUI, string, exdeviceFollowsUI2.getString(com.tencent.mm.R.string.ggc), true, true, new com.tencent.mm.plugin.exdevice.ui.w2(exdeviceFollowsUI2));
        exdeviceFollowsUI2.f99276f = new p32.n(null);
        gm0.j1.d().g(exdeviceFollowsUI2.f99276f);
        return true;
    }
}
