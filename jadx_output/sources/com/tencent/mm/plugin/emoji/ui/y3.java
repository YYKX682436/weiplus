package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes9.dex */
public final class y3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView f98565a;

    public y3(com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView emoticonCustomCreateResultView) {
        this.f98565a = emoticonCustomCreateResultView;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.ye yeVar = (r45.ye) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonCustomCreateResultView", "batch download emojiInfo: " + i17 + ", " + i18);
        com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateResultView emoticonCustomCreateResultView = this.f98565a;
        if (i17 == 0 && i18 == 0) {
            r45.ri0 ri0Var = (yeVar == null || (linkedList = yeVar.f391008g) == null) ? null : (r45.ri0) linkedList.getFirst();
            if (ri0Var == null) {
                db5.e1.s(emoticonCustomCreateResultView.getContext(), "", emoticonCustomCreateResultView.getString(com.tencent.mm.R.string.mfv));
                emoticonCustomCreateResultView.finish();
            } else {
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                emoticonCustomCreateResultView.f97867o = emojiInfo;
                emojiInfo.field_md5 = ri0Var.f384886d;
                n22.m.a(ri0Var, emojiInfo);
                com.tencent.mm.emoji.view.AbsEmojiView absEmojiView = emoticonCustomCreateResultView.f97864i;
                if (absEmojiView == null) {
                    kotlin.jvm.internal.o.o("emojiView");
                    throw null;
                }
                absEmojiView.setEmojiInfo(emoticonCustomCreateResultView.f97867o);
            }
        } else {
            db5.e1.s(emoticonCustomCreateResultView.getContext(), "", emoticonCustomCreateResultView.getString(com.tencent.mm.R.string.mfv));
            emoticonCustomCreateResultView.finish();
        }
        return jz5.f0.f302826a;
    }
}
