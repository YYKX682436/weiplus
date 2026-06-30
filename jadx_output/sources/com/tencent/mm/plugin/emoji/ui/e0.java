package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f97939d;

    public e0(com.tencent.mm.plugin.emoji.ui.EmojiCustomUI emojiCustomUI, java.util.ArrayList arrayList) {
        this.f97939d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList = this.f97939d;
            if (i17 >= arrayList.size()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiCustomUI", "delete md5List md5:%s", arrayList.get(i17));
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1((java.lang.String) arrayList.get(i17));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10613, arrayList.get(i17), u17.field_groupId, u17.field_designerID, u17.field_activityid);
            i17++;
        }
    }
}
