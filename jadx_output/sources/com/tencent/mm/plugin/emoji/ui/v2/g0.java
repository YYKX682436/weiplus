package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes11.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.AnonymousClass2 f98361d;

    public g0(com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.AnonymousClass2 anonymousClass2) {
        this.f98361d = anonymousClass2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.AnonymousClass2 anonymousClass2 = this.f98361d;
        try {
            if (com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.this.f98324m != null) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.emoji.model.o.a().f97589e)) {
                    com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.this.f98324m.setText(com.tencent.mm.plugin.emoji.model.o.a().f97589e);
                } else if (com.tencent.mm.plugin.emoji.model.o.a().f97588d) {
                    com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.this.f98324m.setText(com.tencent.mm.R.string.byx);
                } else {
                    com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.this.f98324m.setText(com.tencent.mm.R.string.byw);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2TabView", e17, "event update error", new java.lang.Object[0]);
        }
    }
}
