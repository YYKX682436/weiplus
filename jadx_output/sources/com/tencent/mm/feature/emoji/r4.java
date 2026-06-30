package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public final class r4 extends i95.w implements com.tencent.mm.feature.emoji.api.t6 {
    public r45.ri0 Ai(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        kotlin.jvm.internal.o.g(iEmojiInfo, "iEmojiInfo");
        r45.ri0 ri0Var = new r45.ri0();
        ri0Var.f384886d = n22.m.c(iEmojiInfo.getMd5(), ri0Var.f384886d);
        ri0Var.f384887e = n22.m.c(iEmojiInfo.l0(), ri0Var.f384887e);
        ri0Var.f384888f = n22.m.c(iEmojiInfo.l(), ri0Var.f384888f);
        ri0Var.f384889g = n22.m.c(iEmojiInfo.X0(), ri0Var.f384889g);
        ri0Var.f384890h = n22.m.c(iEmojiInfo.J1(), ri0Var.f384890h);
        ri0Var.f384891i = n22.m.c(iEmojiInfo.getAesKey(), ri0Var.f384891i);
        ri0Var.f384892m = n22.m.c(iEmojiInfo.getGroupId(), ri0Var.f384892m);
        ri0Var.f384893n = n22.m.c(iEmojiInfo.Z(), ri0Var.f384893n);
        ri0Var.f384894o = n22.m.c(iEmojiInfo.g1(), ri0Var.f384894o);
        ri0Var.f384895p = n22.m.c(iEmojiInfo.S0(), ri0Var.f384895p);
        ri0Var.f384896q = n22.m.c(iEmojiInfo.S0(), ri0Var.f384896q);
        ri0Var.f384897r = n22.m.c(iEmojiInfo.k0(), ri0Var.f384897r);
        ri0Var.f384898s = n22.m.c(iEmojiInfo.H1(), ri0Var.f384898s);
        ri0Var.f384900u = n22.m.c(iEmojiInfo.N1(), ri0Var.f384900u);
        ri0Var.f384899t = n22.m.c(iEmojiInfo.r0(), ri0Var.f384899t);
        ri0Var.A = n22.m.c(iEmojiInfo.G1(), ri0Var.A);
        return ri0Var;
    }

    public com.tencent.mm.api.IEmojiInfo Bi(java.lang.String md52, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(md52, "md5");
        r45.ri0 ri0Var = new r45.ri0();
        if (gVar != null) {
            try {
                ri0Var.parseFrom(gVar.g());
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        if (!kotlin.jvm.internal.o.b(ri0Var.f384886d, md52)) {
            com.tencent.mm.storage.emotion.EmojiInfo y17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().y(md52);
            if (y17 != null) {
                return y17;
            }
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            emojiInfo.field_md5 = md52;
            return emojiInfo;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo2.field_md5 = n22.m.c(ri0Var.f384886d, emojiInfo2.field_md5);
        emojiInfo2.field_cdnUrl = n22.m.c(ri0Var.f384887e, emojiInfo2.field_cdnUrl);
        emojiInfo2.field_thumbUrl = n22.m.c(ri0Var.f384888f, emojiInfo2.field_thumbUrl);
        emojiInfo2.field_designerID = n22.m.c(ri0Var.f384889g, emojiInfo2.field_designerID);
        emojiInfo2.field_encrypturl = n22.m.c(ri0Var.f384890h, emojiInfo2.field_encrypturl);
        emojiInfo2.field_aeskey = n22.m.c(ri0Var.f384891i, emojiInfo2.field_aeskey);
        emojiInfo2.field_groupId = n22.m.c(ri0Var.f384892m, emojiInfo2.field_groupId);
        emojiInfo2.field_externUrl = n22.m.c(ri0Var.f384893n, emojiInfo2.field_externUrl);
        emojiInfo2.field_externMd5 = n22.m.c(ri0Var.f384894o, emojiInfo2.field_externMd5);
        emojiInfo2.field_activityid = n22.m.c(ri0Var.f384895p, emojiInfo2.field_activityid);
        emojiInfo2.field_attachedText = n22.m.c(ri0Var.f384896q, emojiInfo2.field_attachedText);
        emojiInfo2.field_attachTextColor = n22.m.c(ri0Var.f384897r, emojiInfo2.field_attachTextColor);
        emojiInfo2.field_lensId = n22.m.c(ri0Var.f384898s, emojiInfo2.field_lensId);
        emojiInfo2.field_linkId = n22.m.c(ri0Var.f384900u, emojiInfo2.field_linkId);
        emojiInfo2.field_meanings = n22.b.a(ri0Var);
        emojiInfo2.field_attr = n22.m.c(ri0Var.f384899t, emojiInfo2.field_attr);
        java.util.LinkedList linkedList = ri0Var.f384903x;
        if (linkedList != null && (!linkedList.isEmpty())) {
            emojiInfo2.field_custom_meaning = (java.lang.String) linkedList.get(0);
        }
        emojiInfo2.I2 = n22.m.c(ri0Var.A, emojiInfo2.I2);
        return emojiInfo2;
    }

    public boolean Di() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_ip_merge_enable_android, false) || (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonIPMerge()) == 1);
    }

    public void Ni(com.tencent.mm.api.IEmojiInfo iEmojiInfo, yz5.l callback) {
        kotlin.jvm.internal.o.g(iEmojiInfo, "iEmojiInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (iEmojiInfo instanceof com.tencent.mm.storage.emotion.EmojiInfo) {
            zq.h.f474972a.e((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo, new com.tencent.mm.feature.emoji.q4(callback));
        } else {
            callback.invoke(java.lang.Boolean.FALSE);
        }
    }

    public java.lang.String Ri(java.lang.String md52) {
        kotlin.jvm.internal.o.g(md52, "md5");
        java.lang.String str = rr.s.f399149a.a() + "emoticonExternalThumb/";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        return str + md52 + "_local_pic.thumb";
    }

    public java.lang.String Ui(java.lang.String md52, java.lang.String url) {
        kotlin.jvm.internal.o.g(md52, "md5");
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String str = rr.s.f399149a.a() + "emoticonExternalThumb/";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.u(str);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(md52);
        sb6.append('_');
        byte[] bytes = url.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("_pic.thumb");
        return sb6.toString();
    }

    public com.tencent.mm.api.IEmojiInfo wi(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        kotlin.jvm.internal.o.g(iEmojiInfo, "iEmojiInfo");
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(iEmojiInfo.getMd5());
        if (u17 == null) {
            if (iEmojiInfo instanceof com.tencent.mm.storage.emotion.EmojiInfo) {
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo;
                emojiInfo.field_temp = 1;
                emojiInfo.field_catalog = 65;
                java.lang.String N0 = emojiInfo.N0();
                if (com.tencent.mm.vfs.w6.j(N0)) {
                    emojiInfo.field_type = com.tencent.mm.sdk.platformtools.y1.c(N0) ? 2 : 1;
                    emojiInfo.field_size = (int) com.tencent.mm.vfs.w6.k(N0);
                }
                com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
            }
            return iEmojiInfo;
        }
        if (kotlin.jvm.internal.o.b(u17.getMd5(), iEmojiInfo.getMd5())) {
            u17.field_cdnUrl = n22.m.c(iEmojiInfo.l0(), u17.field_cdnUrl);
            u17.field_thumbUrl = n22.m.c(iEmojiInfo.l(), u17.field_thumbUrl);
            u17.field_designerID = n22.m.c(iEmojiInfo.X0(), u17.field_designerID);
            u17.field_encrypturl = n22.m.c(iEmojiInfo.J1(), u17.field_encrypturl);
            u17.field_aeskey = n22.m.c(iEmojiInfo.getAesKey(), u17.field_aeskey);
            u17.field_groupId = n22.m.c(iEmojiInfo.getGroupId(), u17.field_groupId);
            u17.field_externUrl = n22.m.c(iEmojiInfo.Z(), u17.field_externUrl);
            u17.field_externMd5 = n22.m.c(iEmojiInfo.g1(), u17.field_externMd5);
            u17.field_activityid = n22.m.c(iEmojiInfo.S0(), u17.field_activityid);
            u17.field_attachedText = n22.m.c(iEmojiInfo.q0(), u17.field_attachedText);
            u17.field_attachTextColor = n22.m.c(iEmojiInfo.k0(), u17.field_attachTextColor);
            u17.field_lensId = n22.m.c(iEmojiInfo.H1(), u17.field_lensId);
            u17.field_linkId = n22.m.c(iEmojiInfo.N1(), u17.field_linkId);
            u17.field_meanings = n22.m.c(iEmojiInfo.C0(), u17.field_meanings);
            u17.field_attr = n22.m.c(iEmojiInfo.r0(), u17.field_attr);
            u17.field_custom_meaning = n22.m.c(iEmojiInfo.A(), u17.field_custom_meaning);
            u17.I2 = n22.m.c(iEmojiInfo.G1(), u17.I2);
        }
        com.tencent.mm.storage.n5.f().c().G2(u17);
        return u17;
    }
}
