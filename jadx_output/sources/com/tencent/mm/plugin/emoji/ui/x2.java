package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes.dex */
public final class x2 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.a3e).view(com.tencent.mm.R.id.t2j).clickAs(com.tencent.mm.R.id.cot);
        root(com.tencent.mm.R.layout.a3e).view(com.tencent.mm.R.id.t2g).clickAs(com.tencent.mm.R.id.t2h);
        root(com.tencent.mm.R.layout.a3e).view(com.tencent.mm.R.id.u_m).type(com.tencent.mm.accessibility.type.ViewType.Button);
    }
}
