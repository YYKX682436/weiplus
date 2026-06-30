package com.tencent.mm.feature.emoji;

@j95.b
/* loaded from: classes12.dex */
public class h2 extends i95.w implements com.tencent.mm.feature.emoji.api.j6 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Boolean f66303d;

    public boolean Ai() {
        if (this.f66303d == null) {
            this.f66303d = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoji_msg_not_show_soft_bank, true));
        }
        return this.f66303d.booleanValue();
    }

    public java.lang.String Bi() {
        return n22.m.g();
    }

    public boolean Di(long j17) {
        int ordinal;
        java.util.ArrayList arrayList = n22.m.f334295a;
        com.tencent.mm.storage.emotion.EmojiInfo p17 = com.tencent.mm.storage.n5.f().c().p1(j17);
        return p17 != null && p17.m1() == qk.x6.STATUS_UPLOAD_FAIL && ((ordinal = p17.y1().ordinal()) == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 6);
    }

    public void wi(java.lang.String str, org.json.JSONObject jSONObject, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo;
        java.util.ArrayList arrayList = n22.m.f334295a;
        try {
            if (com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_md5) || emojiInfo.field_md5.equals(jSONObject.getString("md5"))) {
                emojiInfo.field_md5 = n22.m.c(jSONObject.optString("md5", ""), emojiInfo.field_md5);
                emojiInfo.field_cdnUrl = n22.m.c(jSONObject.optString("productUrl", ""), emojiInfo.field_cdnUrl);
                emojiInfo.field_thumbUrl = n22.m.c(jSONObject.optString("thumb", ""), emojiInfo.field_thumbUrl);
                emojiInfo.field_encrypturl = n22.m.c(jSONObject.optString("encryptUrl", ""), emojiInfo.field_encrypturl);
                emojiInfo.field_aeskey = n22.m.c(jSONObject.optString("aesKey", ""), emojiInfo.field_aeskey);
                emojiInfo.field_groupId = n22.m.c(jSONObject.optString("productID", ""), emojiInfo.field_groupId);
                emojiInfo.E2 = n22.m.c(jSONObject.optString("productName", ""), emojiInfo.E2);
                l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
                emojiInfo.field_catalog = 65;
                if (lj.f.f(emojiInfo.field_cdnUrl) && lj.f.f(emojiInfo.field_aeskey)) {
                    emojiInfo.field_cdnUrl = emojiInfo.field_encrypturl;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, e17, "convertEmojiInfo", new java.lang.Object[0]);
        }
    }
}
