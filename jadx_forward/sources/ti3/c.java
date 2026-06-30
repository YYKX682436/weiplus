package ti3;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ti3.c f501112a = new ti3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f501113b = jz5.h.b(ti3.b.f501111d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f501114c = jz5.h.b(ti3.a.f501110d);

    public final g15.b a(java.lang.String msgTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        java.lang.String t17 = b().f274571a.t(msgTalker);
        if (t17 != null) {
            try {
                g15.b bVar = new g15.b();
                bVar.m126728xdc93280d(t17);
                return bVar;
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Conversation.ConversationDraftMMKV", "can not parse from mmkv data for ".concat(msgTalker));
            } catch (java.lang.ClassCastException unused2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Conversation.ConversationDraftMMKV", "can not parse to msg processing info for ".concat(msgTalker));
                return null;
            }
        }
        return null;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.v4 b() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.v4) ((jz5.n) f501114c).mo141623x754a37bb();
    }

    public final void c(java.lang.String msgTalker, java.lang.String modifyFrom) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgTalker, "msgTalker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifyFrom, "modifyFrom");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.v4 b17 = b();
        b17.getClass();
        b17.f274571a.W(msgTalker);
        ((e75.g) ((jz5.n) b().f274572b).mo141623x754a37bb()).mo127123xc2079749(new ti3.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x3.f274613e, msgTalker, null, modifyFrom));
    }

    public final void d(g15.b draftInfo, java.lang.String talker, java.lang.String modifyFrom) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftInfo, "draftInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifyFrom, "modifyFrom");
        boolean z17 = true;
        if (!(draftInfo.k().length() > 0)) {
            g15.d l17 = draftInfo.l();
            if ((l17 != null ? l17.j() : 0L) <= 0 && !draftInfo.o() && !(!draftInfo.n().isEmpty()) && !(!draftInfo.j().isEmpty())) {
                z17 = false;
            }
        }
        if (z17) {
            b().a(talker, draftInfo.m126747x696739c(), false);
            ((e75.g) ((jz5.n) b().f274572b).mo141623x754a37bb()).mo127123xc2079749(new ti3.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x3.f274612d, talker, draftInfo, modifyFrom));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Conversation.ConversationDraftMMKV", "[" + talker + "]'s draft not valid,will do remove");
        c(talker, modifyFrom);
    }
}
