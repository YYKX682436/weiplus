package vq;

/* loaded from: classes.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f520680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI, int i17) {
        super(0);
        this.f520679d = emojiDebugUI;
        this.f520680e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.tencent.mm.emoji.debug.EmojiDebugUI.h = !com.tencent.mm.emoji.debug.EmojiDebugUI.h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f520679d.f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7946xf939df19, "null cannot be cast to non-null type com.tencent.mm.emoji.debug.EmojiDebugUI.DebugAdapter");
        ((vq.g) mo7946xf939df19).m8147xed6e4d18(this.f520680e);
        return jz5.f0.f384359a;
    }
}
