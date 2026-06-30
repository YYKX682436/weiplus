package bt3;

/* loaded from: classes9.dex */
public class p2 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f105901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105902e;

    public p2(bt3.r2 r2Var, r45.gp0 gp0Var, java.lang.String str) {
        this.f105901d = gp0Var;
        this.f105902e = str;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        boolean z18;
        java.lang.String str2 = this.f105902e;
        r45.gp0 gp0Var = this.f105901d;
        if (i17 == 0 && hVar != null && hVar.f69553xb5f54fe9 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl done id:%s, mediaId:%s, path:%s", gp0Var.T, str, str2);
            z18 = true;
        } else {
            z18 = false;
        }
        if (i17 != 0 || (hVar != null && hVar.f69553xb5f54fe9 != 0)) {
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = gp0Var.T;
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = java.lang.Integer.valueOf(i17);
            objArr[4] = java.lang.Integer.valueOf(hVar == null ? 0 : hVar.f69553xb5f54fe9);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl error id:%s, mediaId:%s, path:%s, err:(%d,%d)", objArr);
            z18 = true;
        }
        if (z18) {
            java.lang.String substring = (str == null || !str.endsWith("_tp")) ? str : str.substring(0, str.length() - 3);
            zs3.y D0 = ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).D0(substring);
            if (D0 == null) {
                java.lang.Object[] objArr2 = new java.lang.Object[6];
                objArr2[0] = gp0Var.T;
                objArr2[1] = str;
                objArr2[2] = substring;
                objArr2[3] = str2;
                objArr2[4] = java.lang.Integer.valueOf(i17);
                objArr2[5] = java.lang.Integer.valueOf(hVar == null ? 0 : hVar.f69553xb5f54fe9);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordMsgSendService", "[record] downloadTpUrl error id:%s, mediaId:%s, tempMediaId:%s, path:%s, err:(%d,%d), cdnInfo==null", objArr2);
                return 0;
            }
            D0.f68328x10a0fed7 = 0;
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo11260x413cb2b4(D0);
            ((bt3.k1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).aj()).b();
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
