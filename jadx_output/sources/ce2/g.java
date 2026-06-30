package ce2;

/* loaded from: classes3.dex */
public final class g {
    public g(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
    
        if (r6 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(java.lang.String r17, java.util.List r18, r45.pa0 r19) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ce2.g.a(java.lang.String, java.util.List, r45.pa0):float");
    }

    public final ce2.i b(r45.kv1 finderLiveGift) {
        kotlin.jvm.internal.o.g(finderLiveGift, "finderLiveGift");
        ce2.i iVar = new ce2.i();
        iVar.field_rewardProductId = finderLiveGift.getString(0);
        iVar.field_businessType = finderLiveGift.getInteger(1);
        iVar.field_thumbnailFileUrl = finderLiveGift.getString(2);
        java.lang.String string = finderLiveGift.getString(3);
        if (string == null) {
            string = "";
        }
        iVar.field_previewPagUrl = string;
        java.lang.String string2 = finderLiveGift.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        iVar.field_animationPagUrl = string2;
        iVar.field_thumbnailMd5 = finderLiveGift.getString(5);
        iVar.field_previewPagMd5 = finderLiveGift.getString(6);
        iVar.field_animationPagMd5 = finderLiveGift.getString(7);
        iVar.field_giftType = finderLiveGift.getInteger(10);
        iVar.field_flag = finderLiveGift.getInteger(12);
        iVar.field_unlockIntimacyLevel = finderLiveGift.getInteger(11);
        iVar.field_name = finderLiveGift.getString(8);
        iVar.field_price = finderLiveGift.getFloat(9);
        java.lang.String string3 = finderLiveGift.getString(13);
        iVar.field_landscapePagUrl = string3 != null ? string3 : "";
        iVar.field_landscapePagMd5 = finderLiveGift.getString(14);
        com.tencent.mm.protobuf.g byteString = finderLiveGift.getByteString(15);
        iVar.field_customInfo = byteString != null ? byteString.f192156a : null;
        iVar.field_globalUnlockLevel = finderLiveGift.getInteger(16);
        iVar.field_tagColor = finderLiveGift.getString(17);
        iVar.field_tagText = finderLiveGift.getString(18);
        iVar.field_batchConfigLive = (r45.qv1) finderLiveGift.getCustom(23);
        iVar.field_description = finderLiveGift.getString(24);
        iVar.field_jumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) finderLiveGift.getCustom(25);
        iVar.field_needUnlock = finderLiveGift.getBoolean(26) ? 1 : 0;
        iVar.field_disableCombo = finderLiveGift.getBoolean(27);
        r45.zq4 zq4Var = new r45.zq4();
        zq4Var.getList(0).addAll(finderLiveGift.getList(28));
        iVar.field_multiAnimationList = zq4Var;
        r45.xi6 xi6Var = (r45.xi6) finderLiveGift.getCustom(29);
        if (xi6Var == null) {
            xi6Var = new r45.xi6();
        }
        iVar.field_switchSkinInfo = xi6Var;
        r45.na0 na0Var = (r45.na0) finderLiveGift.getCustom(30);
        if (na0Var == null) {
            na0Var = new r45.na0();
        }
        iVar.field_customGiftInfo = na0Var;
        iVar.field_freeGiftSeq = finderLiveGift.getInteger(31);
        iVar.field_foregroundInfo = (r45.l43) finderLiveGift.getCustom(32);
        iVar.field_use_rfx_pag = finderLiveGift.getBoolean(33);
        iVar.field_audienceAiCustomGiftInfo = (r45.mb) finderLiveGift.getCustom(34);
        iVar.field_designerInfo = (r45.wd0) finderLiveGift.getCustom(35);
        return iVar;
    }
}
