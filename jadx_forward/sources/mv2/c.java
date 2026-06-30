package mv2;

/* loaded from: classes10.dex */
public final class c implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.d f413081d;

    public c(mv2.d dVar) {
        this.f413081d = dVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    @Override // dn.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int r4(java.lang.String r10, int r11, dn.g r12, dn.h r13, boolean r14) {
        /*
            r9 = this;
            mv2.d r14 = r9.f413081d
            java.lang.String r0 = r14.f413086d
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r10
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            r1[r3] = r4
            if (r13 == 0) goto L19
            java.lang.String r3 = r13.m125799x9616526c()
            if (r3 != 0) goto L1b
        L19:
            java.lang.String r3 = "null"
        L1b:
            r4 = 2
            r1[r4] = r3
            java.lang.String r3 = "on cdn callback mediaId = %s, startRet = %d, sceneResult %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3, r1)
            r0 = 0
            if (r11 == 0) goto L45
            java.lang.String r12 = r14.f413086d
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r10 = new java.lang.Object[]{r13, r10}
            java.lang.String r13 = "start failed : %d, media id is :%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r12, r13, r10)
            r10 = -21005(0xffffffffffffadf3, float:NaN)
            if (r11 == r10) goto L44
            yz5.q r10 = r14.f413085c
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.String r12 = "startRet"
            r10.mo147xb9724478(r11, r12, r0)
        L44:
            return r2
        L45:
            r3 = 0
            if (r12 == 0) goto L57
            long r5 = r12.f69500x8ab84c59
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 <= 0) goto L57
            long r11 = r12.f69496x83ec3dd
            r1 = 100
            long r7 = (long) r1
            long r11 = r11 * r7
            long r11 = r11 / r5
            goto L58
        L57:
            r11 = r3
        L58:
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 >= 0) goto L5e
            r11 = r3
            goto L65
        L5e:
            r5 = 100
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 <= 0) goto L65
            r11 = r5
        L65:
            int r1 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r1 == 0) goto L80
            long r3 = r14.f413087e
            long r3 = r11 - r3
            int r1 = r14.f413088f
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L80
            r14.f413087e = r11
            yz5.l r1 = r14.f413084b
            int r11 = (int) r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r1.mo146xb9724478(r11)
        L80:
            boolean r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r10)
            if (r10 != 0) goto Lb6
            if (r13 == 0) goto Lb6
            java.lang.String r10 = r14.f413086d
            int r11 = r13.f69553xb5f54fe9
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.String r12 = r13.f69522xf9dbbe9c
            java.lang.String r1 = r13.f69524x419c440e
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r1}
            java.lang.String r12 = "retCode %d, fileId %s, url %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r12, r11)
            int r10 = r13.f69553xb5f54fe9
            if (r10 == 0) goto Lac
            yz5.q r10 = r14.f413085c
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.String r12 = "uploadRet"
            r10.mo147xb9724478(r11, r12, r0)
            return r2
        Lac:
            yz5.q r10 = r14.f413085c
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.lang.String r12 = "success"
            r10.mo147xb9724478(r11, r12, r13)
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: mv2.c.r4(java.lang.String, int, dn.g, dn.h, boolean):int");
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
