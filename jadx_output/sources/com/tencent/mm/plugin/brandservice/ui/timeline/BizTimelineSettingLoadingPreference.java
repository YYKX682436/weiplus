package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
public class BizTimelineSettingLoadingPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;

    public BizTimelineSettingLoadingPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        super.t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
    }

    public BizTimelineSettingLoadingPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = null;
        this.G = com.tencent.mm.R.layout.f488225mz;
    }
}
