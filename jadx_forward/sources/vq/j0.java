package vq;

/* loaded from: classes10.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520704d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = u85.i.f507243d + "preview/";
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(str);
        com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI = this.f520704d;
        if (j17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.io.File externalCacheDir = emojiDebugUI.getExternalCacheDir();
            sb6.append(externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null);
            sb6.append("/preview.zip");
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.mm.vfs.w6.T(str, sb7);
            dp.a.m125854x26a183b((android.content.Context) emojiDebugUI, (java.lang.CharSequence) sb7, 1).show();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(sb7);
        } else {
            dp.a.m125854x26a183b((android.content.Context) emojiDebugUI, (java.lang.CharSequence) "no file", 1).show();
        }
        return jz5.f0.f384359a;
    }
}
