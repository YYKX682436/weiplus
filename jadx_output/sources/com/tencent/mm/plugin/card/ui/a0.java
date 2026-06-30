package com.tencent.mm.plugin.card.ui;

/* loaded from: classes3.dex */
public class a0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public a0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    public void O6(boolean z17) {
        root(com.tencent.mm.R.layout.f488341qn).view(com.tencent.mm.R.id.bax).desc(new com.tencent.mm.plugin.card.ui.x(this)).type(z17 ? com.tencent.mm.accessibility.type.ViewType.Button : com.tencent.mm.accessibility.type.ViewType.TextView).clickAs(com.tencent.mm.R.id.b8x);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.ViewSetter desc = root(com.tencent.mm.R.id.bdo).view(com.tencent.mm.R.id.b8n).desc(new com.tencent.mm.plugin.card.ui.t(this));
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType);
        root(com.tencent.mm.R.id.bdo).view(com.tencent.mm.R.id.b8i).desc(new com.tencent.mm.plugin.card.ui.u(this)).type(viewType);
        root(com.tencent.mm.R.layout.f488351qx).view(com.tencent.mm.R.id.bbw).desc(new com.tencent.mm.plugin.card.ui.v(this));
        root(com.tencent.mm.R.id.bct).view(com.tencent.mm.R.id.bb8).desc(new com.tencent.mm.plugin.card.ui.w(this)).type(viewType);
    }
}
