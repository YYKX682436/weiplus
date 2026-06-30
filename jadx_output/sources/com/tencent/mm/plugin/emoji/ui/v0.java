package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes5.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f98222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI f98223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f98224f;

    public v0(boolean z17, com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI emojiDesignerPackInfoUI, java.util.List list) {
        this.f98222d = z17;
        this.f98223e = emojiDesignerPackInfoUI;
        this.f98224f = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f98222d;
        com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI emojiDesignerPackInfoUI = this.f98223e;
        if (z17) {
            i12.e eVar = emojiDesignerPackInfoUI.f97754q;
            if (eVar == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            eVar.f287213n.clear();
            eVar.notifyDataSetChanged();
        }
        java.util.List list = this.f98224f;
        if (list != null) {
            i12.e eVar2 = emojiDesignerPackInfoUI.f97754q;
            if (eVar2 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            kotlin.jvm.internal.o.g(list, "list");
            java.util.LinkedList linkedList = eVar2.f287213n;
            int size = linkedList.size();
            linkedList.addAll(list);
            eVar2.notifyItemRangeInserted(size, list.size());
        }
    }
}
