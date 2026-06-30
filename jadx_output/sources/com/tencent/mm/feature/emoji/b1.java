package com.tencent.mm.feature.emoji;

@j95.b(dependencies = {com.tencent.mm.feature.emoji.g1.class})
/* loaded from: classes12.dex */
public final class b1 extends i95.w implements com.tencent.mm.feature.emoji.api.d6 {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.app.v5.a(context) != com.tencent.mm.app.v5.f53852i) {
            com.tencent.mm.smiley.g.b();
        }
        if (com.tencent.mm.app.v5.a(context) == com.tencent.mm.app.v5.f53851h) {
            u85.i iVar = u85.i.f425707a;
            pm0.v.L("StickerFileManager_cleanFile", true, u85.h.f425706d);
        }
    }
}
