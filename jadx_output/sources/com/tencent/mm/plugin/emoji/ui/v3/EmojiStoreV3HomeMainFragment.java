package com.tencent.mm.plugin.emoji.ui.v3;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeMainFragment;", "Lcom/tencent/mm/plugin/emoji/ui/v3/EmojiStoreV3HomeBaseFragment;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class EmojiStoreV3HomeMainFragment extends com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment {
    public boolean D;

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.a8f;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment
    public int o0() {
        return 6910;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        j22.a.f297249a = java.lang.System.currentTimeMillis();
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment
    public boolean q0() {
        return true;
    }

    @Override // com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z17) {
        super.setUserVisibleHint(z17);
        if (this.D || !z17) {
            return;
        }
        this.D = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12740, 4, "", "", "", 1, 1);
    }
}
