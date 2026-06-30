package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes12.dex */
public final class n implements com.tencent.mm.plugin.emoji.model.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f97581a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f97582b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f97583c = new java.util.LinkedList();

    public n(boolean z17) {
        this.f97581a = z17;
        reset();
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public java.util.List c() {
        return this.f97582b;
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public void d() {
        java.util.LinkedList linkedList = this.f97583c;
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) obj;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMineListDataSource", "updateSort: " + emojiGroupInfo.field_packName + ' ' + i17);
            emojiGroupInfo.field_idx = i17;
            i17 = i18;
        }
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().b().P1(linkedList);
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public java.util.LinkedList e() {
        return this.f97583c;
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public void onMove(int i17, int i18) {
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo;
        java.util.LinkedList linkedList = this.f97582b;
        java.lang.Object obj = linkedList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        m22.i iVar = (m22.i) obj;
        java.util.LinkedList<com.tencent.mm.storage.emotion.EmojiGroupInfo> linkedList2 = new java.util.LinkedList();
        if (iVar instanceof m22.k) {
            emojiGroupInfo = ((m22.k) iVar).f323054a;
        } else {
            if (!(iVar instanceof m22.l)) {
                return;
            }
            java.util.LinkedList linkedList3 = ((m22.l) iVar).f323056b;
            linkedList2.addAll(linkedList3);
            linkedList2.removeFirst();
            java.lang.Object obj2 = linkedList3.get(0);
            kotlin.jvm.internal.o.d(obj2);
            emojiGroupInfo = (com.tencent.mm.storage.emotion.EmojiGroupInfo) obj2;
        }
        m22.i iVar2 = (m22.i) kz5.n0.a0(linkedList, i18);
        com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo2 = iVar2 instanceof m22.k ? ((m22.k) iVar2).f323054a : iVar2 instanceof m22.l ? (com.tencent.mm.storage.emotion.EmojiGroupInfo) ((m22.l) iVar2).f323056b.get(0) : null;
        java.util.LinkedList linkedList4 = this.f97583c;
        int indexOf = emojiGroupInfo2 != null ? linkedList4.indexOf(emojiGroupInfo2) : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMove: index:");
        sb6.append(i17);
        sb6.append(" -> ");
        sb6.append(i18);
        sb6.append(" (toOriginIndex:");
        sb6.append(indexOf);
        sb6.append("), from:");
        sb6.append(emojiGroupInfo.field_packName);
        sb6.append(" toAfter:");
        sb6.append(emojiGroupInfo2 != null ? emojiGroupInfo2.field_packName : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMineListDataSource", sb6.toString());
        linkedList4.remove(emojiGroupInfo);
        linkedList4.add(indexOf, emojiGroupInfo);
        for (com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo3 : linkedList2) {
            int indexOf2 = linkedList4.indexOf(emojiGroupInfo3);
            if (indexOf2 <= indexOf) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMineListDataSource", "onMove: other group: " + indexOf2 + " -> " + indexOf + ", " + emojiGroupInfo3.field_packName);
                linkedList4.remove(emojiGroupInfo3);
                linkedList4.add(indexOf, emojiGroupInfo3);
            }
        }
    }

    @Override // com.tencent.mm.plugin.emoji.model.e0
    public void reset() {
        java.util.LinkedList linkedList = this.f97582b;
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.f97583c;
        linkedList2.clear();
        linkedList2.addAll(gr.t.g().d());
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMineListDataSource", "beforeSort: " + ((com.tencent.mm.storage.emotion.EmojiGroupInfo) it.next()).field_packName);
        }
        if (!this.f97581a) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            java.util.Iterator it6 = linkedList2.iterator();
            while (it6.hasNext()) {
                arrayList.add(new m22.k((com.tencent.mm.storage.emotion.EmojiGroupInfo) it6.next()));
            }
            linkedList.addAll(arrayList);
            return;
        }
        for (gr.p pVar : gr.p.f274673c.a(linkedList2)) {
            if (!pVar.f274675b.isEmpty()) {
                com.tencent.mm.storage.emotion.EmojiIPSetInfo emojiIPSetInfo = pVar.f274674a;
                java.util.LinkedList linkedList3 = pVar.f274675b;
                if (emojiIPSetInfo == null) {
                    java.lang.Object obj = linkedList3.get(0);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    linkedList.add(new m22.k((com.tencent.mm.storage.emotion.EmojiGroupInfo) obj));
                } else {
                    m22.l lVar = new m22.l(emojiIPSetInfo);
                    lVar.f323056b.addAll(linkedList3);
                    linkedList.add(lVar);
                }
            }
        }
    }
}
