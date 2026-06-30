package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public class q0 extends i95.w implements com.tencent.mm.feature.emoji.api.z5 {
    public java.lang.String Ai(android.content.Context context, java.lang.String str) {
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).I(context, str);
    }

    public java.lang.String Bi(java.lang.String str) {
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(str);
    }

    public com.tencent.mm.api.IEmojiInfo Di(java.lang.String str) {
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str);
    }

    public com.tencent.mm.api.IEmojiInfo Ni(java.lang.String str) {
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str);
    }

    public boolean Ri() {
        return ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi() == null;
    }

    public void Ui(s15.l lVar) {
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        if (com.tencent.mm.storage.n5.f().c().u1(lVar.getMd5()) != null) {
            return;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo.field_md5 = lVar.getMd5();
        emojiInfo.field_type = lVar.s();
        emojiInfo.field_width = lVar.t();
        emojiInfo.field_height = lVar.r();
        emojiInfo.field_activityid = lVar.j();
        emojiInfo.field_designerID = lVar.n();
        emojiInfo.field_cdnUrl = lVar.l();
        emojiInfo.field_encrypturl = lVar.o();
        emojiInfo.field_aeskey = lVar.getAesKey();
        emojiInfo.field_externUrl = lVar.getExternUrl();
        emojiInfo.field_externMd5 = lVar.getExternMd5();
        emojiInfo.field_tpurl = lVar.q();
        emojiInfo.field_tpauthkey = lVar.k();
        emojiInfo.field_thumbUrl = lVar.p();
        emojiInfo.field_attachedText = lVar.getAttachedText();
        emojiInfo.field_attachTextColor = lVar.getAttachedTextColor();
        emojiInfo.field_lensId = lVar.getLensId();
        emojiInfo.field_temp = 1;
        emojiInfo.field_state = 8;
        emojiInfo.field_catalog = 65;
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
    }

    public void Vi(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).m((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
    }

    public byte[] wi(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).E((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo);
    }
}
