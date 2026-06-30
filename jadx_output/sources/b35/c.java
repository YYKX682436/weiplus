package b35;

/* loaded from: classes5.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidUseUnicodeEmoji"), 0);
        com.tencent.mm.autogen.events.EmojiUnicodeConfUpdateEvent emojiUnicodeConfUpdateEvent = new com.tencent.mm.autogen.events.EmojiUnicodeConfUpdateEvent();
        emojiUnicodeConfUpdateEvent.f54104g.getClass();
        emojiUnicodeConfUpdateEvent.e();
        return false;
    }
}
