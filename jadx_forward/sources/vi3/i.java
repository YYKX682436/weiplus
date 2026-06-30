package vi3;

/* loaded from: classes12.dex */
public class i implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi3.f f519129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c01.y8 f519130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vi3.k f519131f;

    public i(vi3.k kVar, vi3.f fVar, c01.y8 y8Var) {
        this.f519131f = kVar;
        this.f519129d = fVar;
        this.f519130e = y8Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (i17 == -21005) {
            return 0;
        }
        vi3.f fVar = this.f519129d;
        vi3.k kVar = this.f519131f;
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback startRet failed. clientid:%s, startRet:%d", str, java.lang.Integer.valueOf(i17));
            kVar.a();
            kVar.b(fVar.f519106a);
            vi3.b.b(0L, 0L, 0L, 0L, 1, kVar.f519136b, fVar.f519106a);
            return 0;
        }
        if (hVar != null) {
            int i18 = hVar.f69553xb5f54fe9;
            if (i18 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback failed. sceneResult.retCode[%d], arg[%s], info[%s], clientid[%s], filemd5[%s]", java.lang.Integer.valueOf(i18), hVar.f69503x4b6e3d91, hVar.f69564xd94f6271, str, hVar.f69526x419c9c3d);
                kVar.b(fVar.f519106a);
                kVar.a();
                vi3.b.b(0L, 0L, 0L, 0L, 1, kVar.f519136b, fVar.f519106a);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeServer", "msgSynchronize cdn callback success. clientid[%s], filemd5[%s], isHitCacheUpload[%d]", str, hVar.f69526x419c9c3d, java.lang.Integer.valueOf(hVar.f69501xb9d727af));
                com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
                if (!com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75993xb1150ac3(hVar.f69502xf11df5f5.getBytes(), c19764x527bffc1, fVar.f519107b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgSynchronizeServer", "msgSynchronize MMProtocalJni rsaPublicEncryptPemkey failed!");
                    return -1;
                }
                java.lang.String l17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(c19764x527bffc1.f38861x6ac9171);
                java.lang.String str2 = hVar.f69522xf9dbbe9c;
                int i19 = (int) hVar.f69523x17c343e7;
                fVar.getClass();
                fVar.f519113h = new java.lang.String(str2);
                fVar.f519114i = new java.lang.String(l17);
                fVar.f519115j = i19;
                if (gm0.j1.b().t()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeServer", "sendAppMsg immediately.");
                    kVar.c(fVar, false);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgSynchronizeServer", "wait getOnlineInfoExtDeviceOnlineListener to sendAppMsg.");
                    c01.d9.b().a(this.f519130e);
                    kVar.f519138d = true;
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
