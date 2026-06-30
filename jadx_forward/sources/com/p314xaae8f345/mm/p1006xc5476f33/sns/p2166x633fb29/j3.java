package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class j3 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3 f245855d;

    public j3(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l3 l3Var) {
        this.f245855d = l3Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCdnAuthInfo", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0128, code lost:
    
        if (r0.h().size() >= 10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x012a, code lost:
    
        r0.h().removeFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0139, code lost:
    
        if (r0.h().size() >= 10) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x013b, code lost:
    
        r0.h().addLast(new android.util.Pair(r2, java.lang.Long.toString(java.lang.System.currentTimeMillis())));
        r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("SnsMMKV");
        r0 = r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x015b, code lost:
    
        if (r0 != null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x015e, code lost:
    
        r10 = new java.lang.StringBuilder("");
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0168, code lost:
    
        if (r8 >= r0.size()) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0170, code lost:
    
        if (r8 != (r0.size() - 1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0172, code lost:
    
        r10.append(((java.lang.String) ((android.util.Pair) r0.get(r8)).first).trim());
        r10.append(" ");
        r10.append(((java.lang.String) ((android.util.Pair) r0.get(r8)).second).trim());
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01c0, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0198, code lost:
    
        r10.append(((java.lang.String) ((android.util.Pair) r0.get(r8)).first).trim());
        r10.append(" ");
        r10.append(((java.lang.String) ((android.util.Pair) r0.get(r8)).second).trim());
        r10.append(" ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c3, code lost:
    
        r8 = r10.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01c7, code lost:
    
        r2.D("SnsMMKVUploadUrl", r8);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("insertRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
        r0 = r31.f323315q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01cf, code lost:
    
        if (r0 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d3, code lost:
    
        if (r0.f17972xec1029d2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d5, code lost:
    
        r0 = new r45.rl();
        r0.mo11468x92b714fd(r31.f323315q.f17972xec1029d2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01ed, code lost:
    
        r26 = r0;
        r27.f245855d.L(r31.f69524x419c440e, 1, r31.f69560x7b284d5e, 1, "upload_" + r11.f245924o, r31.f69526x419c9c3d, r26);
        r0 = new java.lang.StringBuilder("uploadsns cdndone pass: ");
        r6 = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload");
        r0.append(r6 - r11.f245927r);
        r0.append(" ");
        r0.append(r31.f69526x419c9c3d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneSnsUpload", r0.toString());
        r11.f245923n.mo815x76e0bfae(0, 0, "doScene", r11);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x024d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01e3, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneSnsUpload", r0, "parse cdn info error", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ec, code lost:
    
        r0 = null;
     */
    @Override // dn.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int r4(java.lang.String r28, int r29, dn.g r30, dn.h r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.j3.r4(java.lang.String, int, dn.g, dn.h, boolean):int");
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("decodePrepareResponse", "com.tencent.mm.plugin.sns.model.NetSceneSnsUpload$1");
        return null;
    }
}
