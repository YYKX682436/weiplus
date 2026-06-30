package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public final class t2 extends i95.w implements com.tencent.mm.feature.emoji.api.n6 {
    public com.tencent.mm.protobuf.g Ai(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (!(iEmojiInfo instanceof com.tencent.mm.storage.emotion.EmojiInfo)) {
            return null;
        }
        r45.ri0 ri0Var = new r45.ri0();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo;
        java.util.ArrayList arrayList = n22.m.f334295a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(ri0Var.f384886d) || ri0Var.f384886d.equals(emojiInfo.field_md5)) {
            java.lang.String c17 = n22.m.c(emojiInfo.field_md5, ri0Var.f384886d);
            ri0Var.f384886d = c17;
            ri0Var.f384886d = n22.m.c(c17, "");
            ri0Var.f384887e = n22.m.c(emojiInfo.field_cdnUrl, ri0Var.f384887e);
            ri0Var.f384888f = n22.m.c(emojiInfo.field_thumbUrl, ri0Var.f384888f);
            ri0Var.f384889g = n22.m.c(emojiInfo.field_designerID, ri0Var.f384889g);
            ri0Var.f384890h = n22.m.c(emojiInfo.field_encrypturl, ri0Var.f384890h);
            ri0Var.f384891i = n22.m.c(emojiInfo.field_aeskey, ri0Var.f384891i);
            ri0Var.f384892m = n22.m.c(emojiInfo.field_groupId, ri0Var.f384892m);
            ri0Var.f384893n = n22.m.c(emojiInfo.field_externUrl, ri0Var.f384893n);
            ri0Var.f384894o = n22.m.c(emojiInfo.field_externMd5, ri0Var.f384894o);
            ri0Var.f384895p = n22.m.c(emojiInfo.field_activityid, ri0Var.f384895p);
            ri0Var.f384896q = n22.m.c(emojiInfo.field_attachedText, ri0Var.f384896q);
            ri0Var.f384897r = n22.m.c(emojiInfo.field_attachTextColor, ri0Var.f384897r);
            ri0Var.f384898s = n22.m.c(emojiInfo.field_lensId, ri0Var.f384898s);
            ri0Var.f384900u = n22.m.c(emojiInfo.field_linkId, ri0Var.f384900u);
            ri0Var.f384899t = n22.m.c(emojiInfo.field_attr, ri0Var.f384899t);
            ri0Var.A = n22.m.c(emojiInfo.I2, ri0Var.A);
        }
        byte[] D = pm0.v.D(ri0Var);
        if (D != null) {
            return new com.tencent.mm.protobuf.g(D, 0, D.length);
        }
        return null;
    }

    public com.tencent.mm.api.IEmojiInfo Bi(java.lang.String md52, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(md52, "md5");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo.field_md5 = md52;
        if (gVar != null) {
            r45.ri0 ri0Var = new r45.ri0();
            byte[] bArr = gVar.f192156a;
            if (bArr != null) {
                try {
                    ri0Var.parseFrom(bArr);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            n22.m.a(ri0Var, emojiInfo);
        }
        return emojiInfo;
    }

    public com.tencent.mm.api.IEmojiInfo Di(r45.ri0 protoEmojiInfo) {
        kotlin.jvm.internal.o.g(protoEmojiInfo, "protoEmojiInfo");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo.field_md5 = protoEmojiInfo.f384886d;
        n22.m.a(protoEmojiInfo, emojiInfo);
        return emojiInfo;
    }

    public void wi(java.lang.String md52, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        kotlin.jvm.internal.o.g(md52, "md5");
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().o(md52, 65, iEmojiInfo != null ? iEmojiInfo.getType() : 0, iEmojiInfo != null ? iEmojiInfo.getSize() : 0);
    }
}
