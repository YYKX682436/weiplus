package com.tencent.mm.plugin.card.ui.v3;

/* loaded from: classes.dex */
public final class f1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.layout.f488325q7).view(com.tencent.mm.R.id.bwa).desc(com.tencent.mm.R.id.bwb);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488326q8);
        root.view(com.tencent.mm.R.id.f483732bw4).desc(com.tencent.mm.plugin.card.ui.v3.e1.f95315d).type(viewType);
        root.disable(com.tencent.mm.R.id.bvq);
    }
}
