package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class e5 implements com.tencent.mm.ui.widget.dialog.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72629a;

    public e5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, android.view.View view) {
        this.f72629a = view;
    }

    @Override // com.tencent.mm.ui.widget.dialog.d1
    public void onShow() {
        this.f72629a.findViewById(com.tencent.mm.R.id.htn).sendAccessibilityEvent(128);
    }
}
