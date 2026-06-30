package mv2;

/* loaded from: classes8.dex */
public final class m0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.n0 f413139d;

    public m0(mv2.n0 n0Var) {
        this.f413139d = n0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2;
        mv2.n0 n0Var = this.f413139d;
        java.lang.String str3 = n0Var.f413141g;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        if (hVar == null || (str2 = hVar.m125799x9616526c()) == null) {
            str2 = "null";
        }
        objArr[2] = str2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "on cdn callback mediaId = %s, startRet = %d, sceneResult %s", objArr);
        if (i17 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(n0Var.f413141g, "start failed : %d, media id is :%s", java.lang.Integer.valueOf(i17), str);
            if (i17 != -21005) {
                n0Var.b(fp0.u.f346824g);
            }
            return 0;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n0Var.f413141g, "retCode %d, fileId %s, url %s", java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), hVar.f69522xf9dbbe9c, hVar.f69524x419c440e);
            if (hVar.f69553xb5f54fe9 != 0) {
                n0Var.b(fp0.u.f346824g);
            } else {
                java.lang.String field_fileUrl = hVar.f69524x419c440e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileUrl, "field_fileUrl");
                n0Var.getClass();
                n0Var.f413142h = field_fileUrl;
                java.lang.String field_thumbUrl = hVar.f69560x7b284d5e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_thumbUrl, "field_thumbUrl");
                n0Var.getClass();
                n0Var.f413143i = field_thumbUrl;
                n0Var.f413144m = hVar;
                n0Var.b(fp0.u.f346823f);
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
