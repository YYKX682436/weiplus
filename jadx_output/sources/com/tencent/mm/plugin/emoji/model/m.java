package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes12.dex */
public final class m implements com.tencent.mm.plugin.emoji.model.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f97577a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f97578b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f97579c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f97580d;

    public m(java.lang.String ipSetKey) {
        kotlin.jvm.internal.o.g(ipSetKey, "ipSetKey");
        this.f97577a = ipSetKey;
        this.f97578b = "MicroMsg.EmojiMineIPListDataSource";
        this.f97579c = new java.util.LinkedList();
        this.f97580d = new java.util.LinkedList();
        reset();
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public java.util.List c() {
        return this.f97579c;
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public void d() {
        java.util.LinkedList linkedList = this.f97580d;
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) obj;
            com.tencent.mars.xlog.Log.i(this.f97578b, "updateSort: " + emojiGroupInfo.field_packName + ' ' + i17);
            emojiGroupInfo.field_idx = i17;
            i17 = i18;
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().P1(linkedList);
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public java.util.LinkedList e() {
        return this.f97580d;
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public void onMove(int i17, int i18) {
        java.util.LinkedList linkedList = this.f97579c;
        java.lang.Object obj = linkedList.get(i17);
        m22.k kVar = obj instanceof m22.k ? (m22.k) obj : null;
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = kVar != null ? kVar.f323054a : null;
        java.lang.Object obj2 = linkedList.get(i18);
        m22.k kVar2 = obj2 instanceof m22.k ? (m22.k) obj2 : null;
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo2 = kVar2 != null ? kVar2.f323054a : null;
        java.util.LinkedList linkedList2 = this.f97580d;
        int c07 = kz5.n0.c0(linkedList2, emojiGroupInfo);
        int c08 = kz5.n0.c0(linkedList2, emojiGroupInfo2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMove: ");
        sb6.append(emojiGroupInfo != null ? emojiGroupInfo.field_packName : null);
        sb6.append(" -> ");
        sb6.append(emojiGroupInfo2 != null ? emojiGroupInfo2.field_packName : null);
        sb6.append("; originList:");
        sb6.append(c07);
        sb6.append(" -> ");
        sb6.append(c08);
        com.tencent.mars.xlog.Log.i(this.f97578b, sb6.toString());
        if (c07 >= 0 && c07 < linkedList2.size()) {
            if (c08 >= 0 && c08 < linkedList2.size()) {
                java.lang.Object remove = linkedList2.remove(c07);
                kotlin.jvm.internal.o.f(remove, "removeAt(...)");
                linkedList2.add(c08, (com.tencent.mm.storage.emotion.EmojiGroupInfo) remove);
            }
        }
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public void reset() {
        java.util.LinkedList linkedList = this.f97579c;
        linkedList.clear();
        java.util.LinkedList<com.tencent.mm.storage.emotion.EmojiGroupInfo> linkedList2 = this.f97580d;
        linkedList2.clear();
        linkedList2.addAll(gr.t.g().d());
        for (com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo : linkedList2) {
            if (kotlin.jvm.internal.o.b(emojiGroupInfo.field_ipKey, this.f97577a)) {
                linkedList.add(new m22.k(emojiGroupInfo));
            }
        }
    }
}
