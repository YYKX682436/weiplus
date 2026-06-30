package com.tencent.mm.plugin.emoji.ui.v2;

/* loaded from: classes15.dex */
public class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f98390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v2.s0 f98391e;

    public p0(com.tencent.mm.plugin.emoji.ui.v2.s0 s0Var, com.tencent.mm.plugin.emoji.ui.v2.PaddingImageView paddingImageView, int i17) {
        this.f98391e = s0Var;
        this.f98390d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.emoji.ui.v2.s0 s0Var;
        r45.ri0 item;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/emoji/ui/v2/PreViewListGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.emoji.ui.v2.q0 q0Var = this.f98391e.f98403n;
        if (q0Var != null) {
            com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2SingleProductUI emojiStoreV2SingleProductUI = ((com.tencent.mm.plugin.emoji.ui.v2.a0) q0Var).f98350a;
            if (emojiStoreV2SingleProductUI.f98295u != null && (s0Var = emojiStoreV2SingleProductUI.f98297w) != null && (item = s0Var.getItem(this.f98390d)) != null) {
                try {
                    com.tencent.mm.storage.emotion.EmojiInfo i17 = n22.m.i(item);
                    n22.f fVar = n22.f.f334290a;
                    androidx.appcompat.app.AppCompatActivity context = emojiStoreV2SingleProductUI.getContext();
                    int i18 = emojiStoreV2SingleProductUI.f98293s;
                    long j17 = emojiStoreV2SingleProductUI.f98294t;
                    kotlin.jvm.internal.o.g(context, "context");
                    n22.f.d(fVar, context, i17, false, null, null, "", i18, j17, 29, 5, 0L, null, null, null, null, 28672, null);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12787, java.lang.Integer.valueOf(emojiStoreV2SingleProductUI.f98293s), 0, item.f384886d, java.lang.Long.valueOf(emojiStoreV2SingleProductUI.f98294t), item.f384889g, item.f384892m, 29);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2SingleProductUI", e17, "single product click error", new java.lang.Object[0]);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/emoji/ui/v2/PreViewListGridAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
