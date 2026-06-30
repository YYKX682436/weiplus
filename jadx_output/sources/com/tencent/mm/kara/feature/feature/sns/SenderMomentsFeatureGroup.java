package com.tencent.mm.kara.feature.feature.sns;

/* loaded from: classes4.dex */
public class SenderMomentsFeatureGroup extends pl0.e {

    @fl0.a
    public int count;

    @fl0.a
    public int countICommented;

    @fl0.a
    public int countILiked;

    @fl0.a
    public float proportionICommented;

    @fl0.a
    public float proportionILiked;
    private java.lang.String sender;

    public SenderMomentsFeatureGroup(java.lang.String str) {
        this.sender = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
    
        if (r1.moveToFirst() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        r2 = new com.tencent.mm.plugin.sns.storage.SnsInfo();
        r2.convertFrom(r1);
        r10.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        if (r1.moveToNext() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005f, code lost:
    
        r1.close();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsInfoListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    @Override // pl0.e, fl0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void build() {
        /*
            r14 = this;
            super.build()
            java.lang.String r0 = r14.sender
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            sl0.s1 r0 = sl0.s1.f409219e
            java.lang.String r3 = r14.sender
            int r0 = com.tencent.mm.plugin.sns.model.s5.f164676d
            java.lang.String r0 = "getSnsInfoListByUserName"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.tencent.mm.plugin.sns.storage.f2 r1 = com.tencent.mm.plugin.sns.model.l4.Fj()
            r4 = -1
            java.lang.String r6 = ""
            r11 = 0
            r1.getClass()
            java.lang.String r12 = "getCursorByUserNameNotBuff"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r13)
            r2 = 0
            r7 = 0
            r8 = 0
            r5 = r11
            android.database.Cursor r1 = r1.K1(r2, r3, r4, r5, r6, r7, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r13)
            int r2 = r1.getCount()
            if (r2 != 0) goto L48
            r1.close()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
            goto L65
        L48:
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L5f
        L4e:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r2.<init>()
            r2.convertFrom(r1)
            r10.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L4e
        L5f:
            r1.close()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r9)
        L65:
            java.lang.String r0 = c01.z1.r()
            int r1 = r10.size()
            r14.count = r1
            java.util.Iterator r1 = r10.iterator()
            r2 = r11
        L74:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La0
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r3
            if (r3 != 0) goto L83
            goto L74
        L83:
            com.tencent.mm.protocal.protobuf.SnsObject r3 = com.tencent.mm.plugin.sns.model.s5.e(r3)
            java.util.LinkedList<r45.e86> r4 = r3.CommentUserList
            if (r4 == 0) goto L93
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L93
            int r11 = r11 + 1
        L93:
            java.util.LinkedList<r45.e86> r3 = r3.LikeUserList
            if (r3 == 0) goto L74
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L74
            int r2 = r2 + 1
            goto L74
        La0:
            r14.countICommented = r11
            r14.countILiked = r2
            int r0 = r14.count
            if (r0 <= 0) goto Lb1
            float r1 = (float) r11
            float r0 = (float) r0
            float r1 = r1 / r0
            r14.proportionICommented = r1
            float r1 = (float) r2
            float r1 = r1 / r0
            r14.proportionILiked = r1
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.kara.feature.feature.sns.SenderMomentsFeatureGroup.build():void");
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return "sender_itsMoments";
    }
}
