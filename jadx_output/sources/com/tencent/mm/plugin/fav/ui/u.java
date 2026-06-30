package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes.dex */
public final class u extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.dvc).view(com.tencent.mm.R.id.f484316du4).desc(com.tencent.mm.R.string.c9b);
        root(com.tencent.mm.R.id.dvt).view(com.tencent.mm.R.id.f484316du4).desc(com.tencent.mm.R.string.c9c);
        view(com.tencent.mm.R.id.dwv, com.tencent.mm.R.id.dwv).disable();
    }
}
