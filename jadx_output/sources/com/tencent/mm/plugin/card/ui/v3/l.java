package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes.dex */
public final class l extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.layout.f488321q3).view(com.tencent.mm.R.id.bv8).desc(com.tencent.mm.R.id.bv6);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488323q5);
        root.view(com.tencent.mm.R.id.bvw).desc(com.tencent.mm.plugin.card.ui.v3.k.f95338d).type(viewType);
        root.disable(com.tencent.mm.R.id.bvq);
    }
}
