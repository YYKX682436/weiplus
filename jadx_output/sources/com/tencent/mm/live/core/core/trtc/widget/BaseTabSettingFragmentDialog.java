package com.tencent.mm.live.core.core.trtc.widget;

/* loaded from: classes5.dex */
public abstract class BaseTabSettingFragmentDialog extends com.tencent.mm.live.core.core.trtc.widget.BaseSettingFragmentDialog {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f68566d;

    @Override // com.tencent.mm.live.core.core.trtc.widget.BaseSettingFragmentDialog
    public int getLayoutId() {
        return 0;
    }

    public abstract java.util.List l0();

    public abstract java.util.List m0();

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f68566d = l0();
        m0();
        if (this.f68566d == null) {
            this.f68566d = new java.util.ArrayList();
        }
        throw null;
    }
}
