package com.tencent.mm.plugin.component.editor;

/* loaded from: classes.dex */
public final class t1 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.layout.f488412sl);
        root.view(com.tencent.mm.R.id.d88).desc(com.tencent.mm.R.string.f489797bz);
        root.view(com.tencent.mm.R.id.d86).desc(com.tencent.mm.R.string.f489800c2);
        root.view(com.tencent.mm.R.id.d87).desc(com.tencent.mm.R.string.by);
        root.view(com.tencent.mm.R.id.d89).desc(com.tencent.mm.R.string.f489798c0);
        root.view(com.tencent.mm.R.id.d8_).desc(com.tencent.mm.R.string.f489801c3);
        root.view(com.tencent.mm.R.id.d8a).desc(com.tencent.mm.R.string.f489799c1);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.layout.f488412sl);
        root2.view(com.tencent.mm.R.id.pog).desc(com.tencent.mm.R.string.f491082bu4).disableChildren();
        root2.view(com.tencent.mm.R.id.po_).desc(com.tencent.mm.R.string.f491078bu0).disableChildren();
        root2.view(com.tencent.mm.R.id.poe).desc(com.tencent.mm.R.string.f491079bu1).disableChildren();
        root2.view(com.tencent.mm.R.id.pof).desc(com.tencent.mm.R.string.f491080bu2).disableChildren();
        root2.view(com.tencent.mm.R.id.jqt).desc(com.tencent.mm.R.string.f491081bu3).disableChildren();
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.a5n);
        com.tencent.mm.accessibility.base.ViewSetter desc = root3.view(com.tencent.mm.R.id.d68).desc(com.tencent.mm.R.string.f489797bz);
        com.tencent.mm.accessibility.type.ViewType viewType = com.tencent.mm.accessibility.type.ViewType.Button;
        desc.type(viewType).clickAs(com.tencent.mm.R.id.d67).disableChildren();
        root3.view(com.tencent.mm.R.id.f487544oy4).desc(com.tencent.mm.R.string.f489800c2).type(viewType).disableChildren();
        root3.view(com.tencent.mm.R.id.kea).type(viewType).desc(new com.tencent.mm.plugin.component.editor.s1(this));
    }
}
