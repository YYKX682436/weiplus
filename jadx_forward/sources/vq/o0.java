package vq;

/* loaded from: classes5.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520736d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520736d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520736d;
        dp.a.m125854x26a183b((android.content.Context) emojiDebugUI, (java.lang.CharSequence) "done", 0).show();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emojiDebugUI.d, "dump new system emoji , done!");
        return jz5.f0.f384359a;
    }
}
