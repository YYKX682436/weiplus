package com.tencent.mm.plugin.emoji.ui.v3.model;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012 \u0010\u000e\u001a\u001c\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/model/EmojiDesignerSinglePageSource;", "Landroidx/lifecycle/f;", "Lim5/c;", "Lim5/a;", "lifecycle", "", "designerUIN", "Li22/d;", "lastData", "Lkotlin/Function2;", "", "Lr45/ri0;", "", "Ljz5/f0;", "dataCallback", "<init>", "(Lim5/c;ILi22/d;Lyz5/p;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class EmojiDesignerSinglePageSource implements androidx.lifecycle.f {
    public EmojiDesignerSinglePageSource(im5.c lifecycle, int i17, i22.d dVar, yz5.p dataCallback) {
        kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
        kotlin.jvm.internal.o.g(dataCallback, "dataCallback");
        kotlinx.coroutines.z0.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("create: null, ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiDesignerSinglePageSource", sb6.toString());
    }

    public /* synthetic */ EmojiDesignerSinglePageSource(im5.c cVar, int i17, i22.d dVar, yz5.p pVar, int i18, kotlin.jvm.internal.i iVar) {
        this(cVar, i17, (i18 & 4) != 0 ? null : dVar, pVar);
    }
}
