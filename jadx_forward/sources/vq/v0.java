package vq;

/* loaded from: classes9.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520762d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = com.p314xaae8f345.mm.p2614xca6eae71.q0.f274871f;
        java.lang.String str2 = str + "_temp";
        com.p314xaae8f345.mm.vfs.w6.R(str2, com.p314xaae8f345.mm.vfs.w6.N(str, 0, 2097152));
        com.p314xaae8f345.mm.vfs.w6.c(str2, str);
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520762d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(emojiDebugUI.d, "make new emoji not entire finish");
        dp.a.m125854x26a183b((android.content.Context) emojiDebugUI, (java.lang.CharSequence) "done", 0).show();
        return jz5.f0.f384359a;
    }
}
