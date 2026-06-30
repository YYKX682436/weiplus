package t21;

/* loaded from: classes12.dex */
public class o1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t21.w0 f496381d;

    public o1(t21.w0 w0Var) {
        this.f496381d = w0Var;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.lang.String, com.tencent.mm.storage.f9] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        ?? r86;
        t21.w0 w0Var = this.f496381d;
        w0Var.N();
        java.lang.String str2 = w0Var.f496575r;
        if (i17 == -21005) {
            java.lang.String str3 = w0Var.f496575r;
            return 0;
        }
        if (i17 != 0) {
            t21.d3.G(w0Var.f496566f);
            w0Var.f496564d.mo815x76e0bfae(3, i17, "", w0Var);
            return 0;
        }
        w0Var.f496571n = t21.d3.h(w0Var.f496566f);
        t21.v2 v2Var = w0Var.f496571n;
        if (v2Var == null || v2Var.f496544i == 105) {
            int i18 = v2Var == null ? -1 : v2Var.f496544i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s info is null or has paused, status:%d", w0Var.N(), java.lang.Integer.valueOf(i18));
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(w0Var.f496575r);
            w0Var.f496564d.mo815x76e0bfae(3, i17, "info is null or has paused, status" + i18, w0Var);
            return 0;
        }
        if (gVar != null) {
            if (v2Var.f496539d > gVar.f69496x83ec3dd) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.NetSceneUploadVideo", "%s cdntra cdnEndProc error oldpos:%d newpos:%d", w0Var.N(), java.lang.Integer.valueOf(w0Var.f496571n.f496539d), java.lang.Long.valueOf(gVar.f69496x83ec3dd));
                return 0;
            }
            v2Var.f496546k = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            t21.v2 v2Var2 = w0Var.f496571n;
            v2Var2.f496539d = (int) gVar.f69496x83ec3dd;
            v2Var2.U = 1032;
            t21.d3.Q(v2Var2);
            return 0;
        }
        if (hVar != null) {
            if (hVar.f69553xb5f54fe9 != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneUploadVideo", "%s cdntra sceneResult.retCode :%d arg[%s] info[%s]", w0Var.N(), java.lang.Integer.valueOf(hVar.f69553xb5f54fe9), hVar.f69503x4b6e3d91, hVar.f69564xd94f6271);
                t21.d3.G(w0Var.f496566f);
                w0Var.f496564d.mo815x76e0bfae(3, hVar.f69553xb5f54fe9, "", w0Var);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s summersafecdn uploadvideo by cdn, videohash isHitCacheUpload: %d, enableHitcheck:%b", w0Var.N(), java.lang.Integer.valueOf(hVar.f69501xb9d727af), java.lang.Boolean.valueOf(w0Var.f496574q));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[2];
                objArr[0] = java.lang.Integer.valueOf((w0Var.f496579v ? 810 : w0Var.f496578u ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j1.f34620x366c91de : 830) + hVar.f69501xb9d727af);
                objArr[1] = java.lang.Integer.valueOf(w0Var.f496571n.f496541f);
                g0Var.d(12696, objArr);
                boolean z18 = hVar.f69536xba6db6f2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s it video was reduced by cdn %b %s", w0Var.N(), java.lang.Boolean.valueOf(z18), w0Var.f496566f);
                if (z18) {
                    r86 = 0;
                    g0Var.mo68477x336bdfd8(106L, 200L, 1L, false);
                } else {
                    java.lang.Object obj = null;
                    g0Var.mo68477x336bdfd8(106L, 205L, 1L, false);
                    if (w0Var.f496580w > 0 && hVar.f69562x366b1958 > 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s send video thumb too big thumb length [%d, %d] ", w0Var.N(), java.lang.Integer.valueOf(w0Var.f496580w), java.lang.Integer.valueOf(hVar.f69562x366b1958));
                        if (w0Var.f496580w * 2 > hVar.f69562x366b1958) {
                            g0Var.mo68477x336bdfd8(106L, 206L, 1L, false);
                        } else {
                            g0Var.mo68477x336bdfd8(106L, 207L, 1L, false);
                        }
                    }
                    int k17 = (int) com.p314xaae8f345.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f104104s, w0Var.f496566f, false));
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s send video too big thumb length [%d, %d] ", w0Var.N(), java.lang.Integer.valueOf(w0Var.f496571n.f496541f), java.lang.Integer.valueOf(k17));
                    if (w0Var.f496571n.f496541f != k17) {
                        g0Var.mo68477x336bdfd8(106L, 208L, 1L, false);
                        r86 = obj;
                    } else {
                        g0Var.mo68477x336bdfd8(106L, 209L, 1L, false);
                        r86 = obj;
                    }
                }
                w0Var.f496571n = t21.d3.h(w0Var.f496566f);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(w0Var.f496571n.g())) {
                    java.lang.String str4 = (((("<msg><videomsg aeskey=\"" + hVar.f69502xf11df5f5 + "\" cdnthumbaeskey=\"" + hVar.f69502xf11df5f5 + "\" cdnvideourl=\"" + hVar.f69522xf9dbbe9c + "\" ") + "cdnthumburl=\"" + hVar.f69522xf9dbbe9c + "\" ") + "length=\"" + hVar.f69523x17c343e7 + "\" ") + "thumbfullmd5=\"" + hVar.f69561x5d844f11 + "\" ") + "cdnthumblength=\"" + hVar.f69562x366b1958 + "\"/>";
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(str4);
                    java.lang.String str5 = w0Var.f496571n.N;
                    sb6.append(str5 != null ? str5 : "");
                    java.lang.String str6 = sb6.toString() + "</msg>";
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "%s cdn callback new build cdnInfo:%s", w0Var.N(), str6);
                    t21.v2 v2Var3 = w0Var.f496571n;
                    v2Var3.f496558w = str6;
                    t21.d3.Q(v2Var3);
                }
                java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(w0Var.f496571n.g(), "msg", r86);
                if (d17 != null) {
                    boolean B = t21.o2.Ui().B(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(r86, bm5.f0.f104104s, w0Var.f496566f, false), (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl"), (java.lang.String) d17.get(".msg.videomsg.$aeskey"));
                    java.lang.Object[] objArr2 = new java.lang.Object[2];
                    objArr2[0] = java.lang.Integer.valueOf((B ? 1 : 2) + 900);
                    objArr2[1] = java.lang.Integer.valueOf(w0Var.f496571n.f496541f);
                    g0Var.d(12696, objArr2);
                }
                if (w0Var.f496571n.f496559x == 4) {
                    t21.w0.H(w0Var, hVar);
                    return 0;
                }
                f65.y0.f341552a.i(w0Var.f496566f, hVar.f69501xb9d727af);
                m11.m1 i19 = m11.m1.i();
                i19.f523674p = w0Var.f496566f;
                i19.f404285q = z18 ? 0 : w0Var.I();
                i19.f404286r = hVar;
                i19.f404287s = new t21.n1(this, hVar);
                i19.f523667i = 4;
                i19.a().a();
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return null;
    }
}
