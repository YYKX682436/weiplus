package to1;

/* loaded from: classes15.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to1.r f502462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f502464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(to1.r rVar, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f502462d = rVar;
        this.f502463e = str;
        this.f502464f = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        return r11;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r14 = this;
            java.lang.String r0 = ", e="
            java.lang.String r1 = ", name="
            java.lang.String r2 = "uri="
            java.lang.String r3 = r14.f502464f
            to1.r r4 = r14.f502462d
            java.lang.String r5 = "WxDocumentFile"
            r6 = 0
            r7 = r6
        Lf:
            int r8 = r7 + 1
            r9 = 0
            r10 = 3
            if (r7 >= r10) goto L8e
            android.content.Context r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            android.net.Uri r11 = r4.f502469a     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            java.lang.String r12 = r14.f502463e     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            android.net.Uri r11 = android.provider.DocumentsContract.createDocument(r7, r11, r12, r3)     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            if (r11 == 0) goto L46
            java.lang.String r12 = r11.getPath()     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            if (r12 == 0) goto L46
            int r13 = r12.length()     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            if (r13 <= r10) goto L46
            java.lang.String r10 = ")"
            boolean r10 = r26.i0.n(r12, r10, r6)     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            if (r10 == 0) goto L46
            android.provider.DocumentsContract.deleteDocument(r7, r11)     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            java.lang.String r7 = "create invalid file %s"
            java.lang.Object[] r10 = new java.lang.Object[]{r11}     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7, r10)     // Catch: java.lang.Exception -> L48 java.io.FileNotFoundException -> L67
            goto L8e
        L46:
            r9 = r11
            goto L8e
        L48:
            r7 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            android.net.Uri r10 = r4.f502469a
            r9.append(r10)
            r9.append(r1)
            r9.append(r3)
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7)
            goto L85
        L67:
            r7 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r2)
            android.net.Uri r10 = r4.f502469a
            r9.append(r10)
            r9.append(r1)
            r9.append(r3)
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r5, r7)
        L85:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r9 = 1
            r7.sleep(r9)
            r7 = r8
            goto Lf
        L8e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: to1.p.mo152xb9724478():java.lang.Object");
    }
}
