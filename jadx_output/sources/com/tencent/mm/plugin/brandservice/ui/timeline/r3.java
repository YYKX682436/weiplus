package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes9.dex */
public final class r3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI f94502d;

    public r3(com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineSettingUI bizTimeLineSettingUI) {
        this.f94502d = bizTimeLineSettingUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f94502d.finish();
        return true;
    }
}
