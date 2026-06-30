package com.tencent.mm.plugin.emoji.sync;

/* loaded from: classes12.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.sync.b f97615d;

    public a(com.tencent.mm.plugin.emoji.sync.b bVar) {
        this.f97615d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiGroupInfo> d17 = gr.t.g().d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_group_sync_min_count, 20);
        for (com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo : d17) {
            if (emojiGroupInfo.field_sync != 2 && !com.tencent.mm.sdk.platformtools.t8.D0(emojiGroupInfo.field_productID, java.lang.String.valueOf(17))) {
                java.lang.Object bVar = com.tencent.mm.sdk.platformtools.t8.D0(emojiGroupInfo.field_productID, java.lang.String.valueOf(17)) ? new b22.b("com.tencent.xin.emoticon.tusiji") : new b22.a(emojiGroupInfo.field_productID);
                if (emojiGroupInfo.field_idx < Ni) {
                    arrayList2.add(bVar);
                } else {
                    arrayList.add(bVar);
                }
            }
        }
        com.tencent.mm.plugin.emoji.sync.b bVar2 = this.f97615d;
        bVar2.f97616a.e();
        bVar2.f97616a.a(arrayList2);
        bVar2.f97616a.b(arrayList);
        com.tencent.mm.plugin.emoji.sync.k kVar = bVar2.f97616a;
        if (kVar.f97632c) {
            return;
        }
        kVar.f();
    }
}
