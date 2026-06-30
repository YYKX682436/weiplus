package vq;

/* loaded from: classes12.dex */
public final class w0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f520764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f520764d = emojiDebugUI;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gr.a aVar = gr.b.f356194a;
        xq.e eVar = xq.s.f537552e;
        aVar.a("/sdcard/temp/emojiRes/emoji-anim.xml", eVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f520764d.d, "parse anim: " + eVar.f537510c.size());
        return jz5.f0.f384359a;
    }
}
