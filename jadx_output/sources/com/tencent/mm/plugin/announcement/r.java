package com.tencent.mm.plugin.announcement;

/* loaded from: classes.dex */
public final class r extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        view(com.tencent.mm.R.id.gyx, com.tencent.mm.R.id.gyx).desc(com.tencent.mm.plugin.announcement.q.f74704d).disableChildren();
    }
}
