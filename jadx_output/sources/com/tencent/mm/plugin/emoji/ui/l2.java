package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes12.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment f98083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.emoji.ui.EmojiMineListFragment emojiMineListFragment) {
        super(0);
        this.f98083d = emojiMineListFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context requireContext = this.f98083d.requireContext();
        kotlin.jvm.internal.o.f(requireContext, "requireContext(...)");
        return new m22.f(new m22.j(requireContext, 24, 7));
    }
}
