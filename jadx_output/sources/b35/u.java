package b35;

/* loaded from: classes5.dex */
public class u extends com.tencent.mm.sdk.event.n {
    public u() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GetEmojiIsUseUnicodeEvent getEmojiIsUseUnicodeEvent = (com.tencent.mm.autogen.events.GetEmojiIsUseUnicodeEvent) iEvent;
        try {
            if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b() != null) {
                com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("AndroidUseUnicodeEmoji"), 0);
            }
        } catch (java.lang.Exception unused) {
        }
        getEmojiIsUseUnicodeEvent.f54391g.getClass();
        return false;
    }
}
