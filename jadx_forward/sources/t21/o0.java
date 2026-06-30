package t21;

/* loaded from: classes12.dex */
public class o0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.r0 f496380d;

    public o0(t21.r0 r0Var) {
        this.f496380d = r0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        int i18;
        t21.r0 r0Var = this.f496380d;
        if (i17 == -21006) {
            r0Var.J();
            java.lang.String str2 = r0Var.f496444o;
            return 0;
        }
        if (i17 != 0) {
            t21.d3.G(r0Var.f496438f);
            r0Var.f496436d.mo815x76e0bfae(3, i17, "", r0Var);
            return 0;
        }
        r0Var.f496442m = t21.d3.h(r0Var.f496438f);
        t21.v2 v2Var = r0Var.f496442m;
        if (v2Var == null || v2Var.f496544i == 113) {
            int i19 = v2Var == null ? -1 : v2Var.f496544i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "%s upload video info is null or has paused, status:%d", r0Var.J(), java.lang.Integer.valueOf(i19));
            r0Var.I();
            r0Var.f496436d.mo815x76e0bfae(3, i17, "upload video info is null or has paused, status" + i19, r0Var);
            return 0;
        }
        if (gVar != null) {
            long j17 = gVar.f69496x83ec3dd;
            if (j17 == r0Var.f496446q) {
                return 0;
            }
            if (v2Var.f496540e > j17 && !r0Var.f496440h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneDownloadVideo", "%s cdnEndProc error oldpos:%d newpos:%d", r0Var.J(), java.lang.Integer.valueOf(r0Var.f496442m.f496540e), java.lang.Long.valueOf(gVar.f69496x83ec3dd));
                t21.d3.G(r0Var.f496438f);
                r0Var.f496436d.mo815x76e0bfae(3, i17, "", r0Var);
                return 0;
            }
            v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            t21.v2 v2Var2 = r0Var.f496442m;
            long j18 = v2Var2.f496540e;
            long j19 = gVar.f69496x83ec3dd;
            if (j18 < j19) {
                v2Var2.f496540e = (int) j19;
                i18 = 1040;
            } else {
                i18 = 1024;
            }
            v2Var2.U = i18;
            t21.d3.Q(v2Var2);
            r0Var.J();
            java.lang.String str3 = r0Var.f496444o;
            return 0;
        }
        if (hVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "%s cdntra sceneResult.retCode:%d useTime:%d ", r0Var.J(), java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - r0Var.f496452w));
            dn.o oVar = r0Var.f496443n;
            r0Var.getClass();
            if (oVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneDownloadVideo", "it had not task info or scene Result, don't report.");
            } else if (oVar.f69613x450d8f25 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "it download short video, don't report.");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneDownloadVideo", "%s sceneResult.field_recvedBytes %d, time [%d, %d]", r0Var.J(), java.lang.Long.valueOf(hVar.f69548xe026fea1), java.lang.Long.valueOf(hVar.f69559x1bb3b54a), java.lang.Long.valueOf(hVar.f69520x14c61803));
                t21.o2.Di().r(null, hVar, oVar, true);
            }
            if (hVar.f69553xb5f54fe9 != 0) {
                t21.d3.G(r0Var.f496438f);
                if (r0Var.f496440h) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 13L, 1L, false);
                }
                if (r0Var.f496441i) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 252L, 1L, false);
                }
                r0Var.f496436d.mo815x76e0bfae(3, hVar.f69553xb5f54fe9, "", r0Var);
            } else {
                if (r0Var.f496440h) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 12L, 1L, false);
                }
                if (r0Var.f496441i) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(354L, 137L, 1L, false);
                }
                r0Var.H((int) hVar.f69523x17c343e7);
            }
            t21.b.a(r0Var.f496442m, 1);
            r0Var.f496443n = null;
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
