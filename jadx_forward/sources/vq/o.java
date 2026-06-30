package vq;

/* loaded from: classes.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f520734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f520735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, int i17, int i18) {
        super(0);
        this.f520733d = emojiDebugUI;
        this.f520734e = i17;
        this.f520735f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dp.a.m125854x26a183b((android.content.Context) this.f520733d, (java.lang.CharSequence) ("errType=" + this.f520734e + ", errCode=" + this.f520735f), 0).show();
        return jz5.f0.f384359a;
    }
}
