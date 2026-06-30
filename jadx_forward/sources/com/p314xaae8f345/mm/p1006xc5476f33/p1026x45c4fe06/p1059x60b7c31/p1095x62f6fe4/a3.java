package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes10.dex */
public class a3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f163223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f163224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f163225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f163226g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d3 f163227h;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d3 d3Var, java.util.List list, boolean z17, boolean z18, boolean z19) {
        this.f163227h = d3Var;
        this.f163223d = list;
        this.f163224e = z17;
        this.f163225f = z18;
        this.f163226g = z19;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r11.f163223d
            int r2 = r1.size()
            r0.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le5
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(r2)
            java.lang.String r4 = "MicroMsg.JsApiChooseImage"
            com.tencent.mm.plugin.appbrand.jsapi.media.d3 r5 = r11.f163227h
            r6 = 1
            boolean r7 = r11.f163224e
            if (r3 != 0) goto L79
            boolean r3 = r11.f163225f
            if (r3 == 0) goto L5d
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.c(r2)
            if (r3 == 0) goto L82
            boolean r8 = r3.equals(r2)
            if (r8 != 0) goto L82
            j62.e r7 = j62.e.g()
            com.tencent.mm.repairer.config.webview.RepairerConfigMPKeepUserCommentInExifInfo r8 = new com.tencent.mm.repairer.config.webview.RepairerConfigMPKeepUserCommentInExifInfo
            r8.<init>()
            int r7 = r7.c(r8)
            if (r7 != r6) goto L4e
            java.lang.String r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Y(r2)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.L0(r7, r3)
        L4e:
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r7 = r5.f163300o
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L5b
            com.p314xaae8f345.mm.vfs.w6.h(r2)
        L5b:
            r7 = r6
            goto L83
        L5d:
            boolean r3 = r11.f163226g
            if (r3 == 0) goto L82
            java.lang.String r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.e(r2, r6)
            boolean r8 = r3.equals(r2)
            if (r8 != 0) goto L82
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r7 = r5.f163300o
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L5b
            com.p314xaae8f345.mm.vfs.w6.h(r2)
            goto L5b
        L79:
            java.lang.String r3 = "path: %s is a GIF file"
            java.lang.Object[] r8 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r3, r8)
        L82:
            r3 = r2
        L83:
            boolean r8 = r2.equals(r3)
            if (r8 == 0) goto L9a
            java.lang.String r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.b(r3)
            boolean r9 = r2.equals(r8)
            if (r9 != 0) goto L9b
            if (r7 == 0) goto L98
            com.p314xaae8f345.mm.vfs.w6.h(r2)
        L98:
            r7 = 0
            goto L9c
        L9a:
            r8 = r3
        L9b:
            r6 = r7
        L9c:
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.p7.a(r8)
            boolean r9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r9 = ".jpg"
            boolean r9 = r8.endsWith(r9)
            if (r9 != 0) goto Lac
            java.lang.String r9 = "jpg"
            goto Lad
        Lac:
            r9 = 0
        Lad:
            java.lang.String r10 = "originalPath:%s, path:%s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r8}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r10, r2)
            com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseImage$ChooseRequest r2 = r5.f163292d
            java.lang.String r2 = r2.f163158d
            com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject r2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.b(r2, r8, r9, r6)
            if (r2 == 0) goto Lda
            if (r7 == 0) goto Ld5
            java.lang.String r4 = "_data=?"
            com.tencent.mm.ui.MMActivity r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d3.e(r5)     // Catch: java.lang.Exception -> Ld5
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Exception -> Ld5
            android.net.Uri r6 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Exception -> Ld5
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> Ld5
            r5.delete(r6, r4, r3)     // Catch: java.lang.Exception -> Ld5
        Ld5:
            r0.add(r2)
            goto Lf
        Lda:
            java.lang.String r2 = "handle chosen list from gallery, get null obj from path: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r8}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r2, r3)
            goto Lf
        Le5:
            com.tencent.mm.plugin.appbrand.jsapi.media.z2 r1 = new com.tencent.mm.plugin.appbrand.jsapi.media.z2
            r1.<init>(r11, r0)
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a3.run():void");
    }
}
