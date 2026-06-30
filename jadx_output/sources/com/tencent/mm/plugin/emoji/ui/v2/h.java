package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.we3 f98362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment f98363e;

    public h(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment, r45.we3 we3Var) {
        this.f98363e = emojiStoreV2BaseFragment;
        this.f98362d = we3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.cu5 cu5Var;
        r45.we3 we3Var = this.f98362d;
        if (we3Var != null) {
            if (we3Var != null) {
                int i17 = we3Var.f389085e;
            }
            if (we3Var != null && (cu5Var = we3Var.f389084d) != null) {
                cu5Var.computeSize();
            }
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment emojiStoreV2BaseFragment = this.f98363e;
            emojiStoreV2BaseFragment.n0();
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().e().J0(emojiStoreV2BaseFragment.n0(), we3Var);
        }
    }
}
