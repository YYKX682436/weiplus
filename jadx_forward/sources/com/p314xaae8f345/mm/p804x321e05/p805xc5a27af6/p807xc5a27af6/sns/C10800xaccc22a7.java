package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns;

/* renamed from: com.tencent.mm.kara.feature.feature.sns.SenderMomentsFeatureGroup */
/* loaded from: classes4.dex */
public class C10800xaccc22a7 extends pl0.e {

    /* renamed from: count */
    @fl0.a
    public int f29600x5a7510f;

    /* renamed from: countICommented */
    @fl0.a
    public int f29601x3e23cb44;

    /* renamed from: countILiked */
    @fl0.a
    public int f29602x5f9622b3;

    /* renamed from: proportionICommented */
    @fl0.a
    public float f29603x8803cd0f;

    /* renamed from: proportionILiked */
    @fl0.a
    public float f29604x67bcc1fe;

    /* renamed from: sender */
    private java.lang.String f29605xca001a35;

    public C10800xaccc22a7(java.lang.String str) {
        this.f29605xca001a35 = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004c, code lost:
    
        if (r1.moveToFirst() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004e, code lost:
    
        r2 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
        r2.mo9015xbf5d97fd(r1);
        r10.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        if (r1.moveToNext() != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005f, code lost:
    
        r1.close();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsInfoListByUserName", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
     */
    @Override // pl0.e, fl0.b
    /* renamed from: build */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo46315x59bc66e() {
        /*
            r14 = this;
            super.mo46315x59bc66e()
            java.lang.String r0 = r14.f29605xca001a35
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            sl0.s1 r0 = sl0.s1.f490752e
            java.lang.String r3 = r14.f29605xca001a35
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f246209d
            java.lang.String r0 = "getSnsInfoListByUserName"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r9)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.tencent.mm.plugin.sns.storage.f2 r1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj()
            r4 = -1
            java.lang.String r6 = ""
            r11 = 0
            r1.getClass()
            java.lang.String r12 = "getCursorByUserNameNotBuff"
            java.lang.String r13 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r12, r13)
            r2 = 0
            r7 = 0
            r8 = 0
            r5 = r11
            android.database.Cursor r1 = r1.K1(r2, r3, r4, r5, r6, r7, r8)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r12, r13)
            int r2 = r1.getCount()
            if (r2 != 0) goto L48
            r1.close()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r9)
            goto L65
        L48:
            boolean r2 = r1.moveToFirst()
            if (r2 == 0) goto L5f
        L4e:
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = new com.tencent.mm.plugin.sns.storage.SnsInfo
            r2.<init>()
            r2.mo9015xbf5d97fd(r1)
            r10.add(r2)
            boolean r2 = r1.moveToNext()
            if (r2 != 0) goto L4e
        L5f:
            r1.close()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r9)
        L65:
            java.lang.String r0 = c01.z1.r()
            int r1 = r10.size()
            r14.f29600x5a7510f = r1
            java.util.Iterator r1 = r10.iterator()
            r2 = r11
        L74:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La0
            java.lang.Object r3 = r1.next()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) r3
            if (r3 != 0) goto L83
            goto L74
        L83:
            com.tencent.mm.protocal.protobuf.SnsObject r3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.e(r3)
            java.util.LinkedList<r45.e86> r4 = r3.f38963x20c46e68
            if (r4 == 0) goto L93
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L93
            int r11 = r11 + 1
        L93:
            java.util.LinkedList<r45.e86> r3 = r3.f38984xe83113e0
            if (r3 == 0) goto L74
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L74
            int r2 = r2 + 1
            goto L74
        La0:
            r14.f29601x3e23cb44 = r11
            r14.f29602x5f9622b3 = r2
            int r0 = r14.f29600x5a7510f
            if (r0 <= 0) goto Lb1
            float r1 = (float) r11
            float r0 = (float) r0
            float r1 = r1 / r0
            r14.f29603x8803cd0f = r1
            float r1 = (float) r2
            float r1 = r1 / r0
            r14.f29604x67bcc1fe = r1
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.sns.C10800xaccc22a7.mo46315x59bc66e():void");
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return "sender_itsMoments";
    }
}
