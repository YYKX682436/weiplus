package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI f98370d;

    public k0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI) {
        this.f98370d = emojiStoreV2UI;
    }

    @Override // java.lang.Runnable
    public void run() {
        tg0.p1 p1Var = (tg0.p1) i95.n0.c(tg0.p1.class);
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI emojiStoreV2UI = this.f98370d;
        boolean wi6 = ((sg0.e2) p1Var).wi(emojiStoreV2UI.f98339o, 384);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).wi(a17, emojiStoreV2UI.f98339o, false, 384);
        a17.putExtra("ftsneedkeyboard", !wi6);
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiStoreV2UI", "reportEntranceScene = %s", java.lang.Integer.valueOf(emojiStoreV2UI.f98339o));
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsInitToSearch", true);
        a17.putExtra("ftsNeedShowCamera", false);
        j45.l.y(emojiStoreV2UI.getContext(), a17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13054, java.lang.Integer.valueOf(emojiStoreV2UI.f98335h == 0 ? 0 : 1), 0, "");
    }
}
