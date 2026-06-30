package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes7.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7 f280050d;

    public c7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.f7 f7Var) {
        this.f280050d = f7Var;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00c6: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:30:0x00c6 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r10 = this;
            java.lang.String r0 = "mQQMailRedirectUrl: %s download url:%s, md5:%s"
            com.tencent.mm.ui.chatting.f7 r1 = r10.f280050d
            java.lang.String r2 = "MicroMsg.ChattingQQMailFooterHandler"
            r3 = 0
            r4 = 0
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.lang.String r6 = r1.f282032l     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.net.URLConnection r5 = r5.openConnection()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L8f
            r5.setInstanceFollowRedirects(r3)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r5.connect()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            java.lang.String r4 = "Location"
            java.lang.String r4 = r5.getHeaderField(r4)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r1.f282033m = r4     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            java.io.InputStream r4 = r5.getInputStream()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            java.lang.String r6 = "Content-Length"
            r7 = -1
            int r6 = r5.getHeaderFieldInt(r6, r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            if (r6 > 0) goto L39
            java.lang.String r6 = "error content-length"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r6)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r4.close()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            goto L6a
        L39:
            byte[] r6 = new byte[r6]     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r4.read(r6)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r4.close()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            android.content.Context r4 = r1.f282022b     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            java.lang.String r7 = "rsa_public_key_forwx.pem"
            java.security.PublicKey r4 = kk.q.a(r4, r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            byte[] r6 = android.util.Base64.decode(r6, r3)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            java.lang.String r7 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r7 = javax.crypto.Cipher.getInstance(r7)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r8 = 2
            r7.init(r8, r4)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            byte[] r4 = r7.doFinal(r6)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r6.<init>(r4)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r1.f282034n = r6     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            com.tencent.mm.ui.chatting.a7 r4 = new com.tencent.mm.ui.chatting.a7     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            r4.<init>(r10)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r4)     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> Lc5
        L6a:
            java.io.InputStream r3 = r5.getInputStream()     // Catch: java.lang.Exception -> L72
            r3.close()     // Catch: java.lang.Exception -> L72
            goto L7a
        L72:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3)
        L7a:
            r5.disconnect()
            java.lang.String r3 = r1.f282032l
            java.lang.String r4 = r1.f282033m
            java.lang.String r1 = r1.f282034n
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0, r1)
            goto Lc4
        L8b:
            r4 = move-exception
            goto L93
        L8d:
            r3 = move-exception
            goto Lc7
        L8f:
            r5 = move-exception
            r9 = r5
            r5 = r4
            r4 = r9
        L93:
            java.lang.String r6 = ""
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lc5
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r4, r6, r3)     // Catch: java.lang.Throwable -> Lc5
            com.tencent.mm.ui.chatting.b7 r3 = new com.tencent.mm.ui.chatting.b7     // Catch: java.lang.Throwable -> Lc5
            r3.<init>(r10)     // Catch: java.lang.Throwable -> Lc5
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(r3)     // Catch: java.lang.Throwable -> Lc5
            if (r5 == 0) goto Lc4
            java.io.InputStream r3 = r5.getInputStream()     // Catch: java.lang.Exception -> Lac
            r3.close()     // Catch: java.lang.Exception -> Lac
            goto Lb4
        Lac:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3)
        Lb4:
            r5.disconnect()
            java.lang.String r3 = r1.f282032l
            java.lang.String r4 = r1.f282033m
            java.lang.String r1 = r1.f282034n
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r4, r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0, r1)
        Lc4:
            return
        Lc5:
            r3 = move-exception
            r4 = r5
        Lc7:
            if (r4 == 0) goto Le9
            java.io.InputStream r5 = r4.getInputStream()     // Catch: java.lang.Exception -> Ld1
            r5.close()     // Catch: java.lang.Exception -> Ld1
            goto Ld9
        Ld1:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r5)
        Ld9:
            r4.disconnect()
            java.lang.String r4 = r1.f282032l
            java.lang.String r5 = r1.f282033m
            java.lang.String r1 = r1.f282034n
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5, r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0, r1)
        Le9:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.c7.run():void");
    }
}
