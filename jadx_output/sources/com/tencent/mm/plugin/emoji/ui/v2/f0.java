package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes11.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView f98359d;

    public f0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView emojiStoreV2TabView) {
        this.f98359d = emojiStoreV2TabView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.plugin.emoji.ui.v2.h0 h0Var = this.f98359d.f98326o;
        if (h0Var != null) {
            com.tencent.mm.plugin.emoji.ui.v2.m0 m0Var = (com.tencent.mm.plugin.emoji.ui.v2.m0) h0Var;
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI = m0Var.f98375f;
            if (intValue != emojiStoreV2UI.f98335h) {
                m0Var.f98373d.setCurrentItem(intValue, false);
            }
            emojiStoreV2UI.f98335h = intValue;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/EmojiStoreV2TabView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
