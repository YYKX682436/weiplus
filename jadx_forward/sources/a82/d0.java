package a82;

/* loaded from: classes12.dex */
public final class d0 extends a82.b {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f83516g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f83516g = jz5.h.b(a82.c0.f83512d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x029e, code lost:
    
        if (r1 == r3) goto L97;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:71:0x00fe. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(a82.d0 r27, java.lang.String r28, com.p314xaae8f345.mm.p947xba6de98f.n1 r29, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r30) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a82.d0.a7(a82.d0, java.lang.String, com.tencent.mm.modelcdntran.n1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b7(a82.d0 d0Var, int i17, boolean z17, int i18, int i19, int i27) {
        d0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnUploadServicePLC", "report36776 type:" + i17 + ", succ:" + z17 + ", cost:" + i18 + ", beforeSize:" + i19 + ", afterSize:" + i27);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6445xaa186290 c6445xaa186290 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6445xaa186290();
        c6445xaa186290.f137867d = i17;
        c6445xaa186290.f137868e = z17 ? 1 : 2;
        c6445xaa186290.f137869f = i18;
        c6445xaa186290.f137870g = i19;
        c6445xaa186290.f137871h = i27;
        c6445xaa186290.k();
    }

    public static void g7(a82.d0 d0Var, o72.r2 r2Var, r45.gp0 gp0Var, java.lang.String str, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        if ((i17 & 16) != 0) {
            z18 = false;
        }
        d0Var.getClass();
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
        java.lang.String f17 = kk.k.f(str, 0, 256);
        if (f17 == null || f17.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Fav.FavCdnUploadServicePLC", "calcHead256Md5: empty result, path:" + str + ", exists:" + com.p314xaae8f345.mm.vfs.w6.j(str) + ", size:" + com.p314xaae8f345.mm.vfs.w6.k(str));
            f17 = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnUploadServicePLC", "updateDataItemAfterCompress before write: dataId:" + gp0Var.T + ", isThumb:" + z17 + ", compressedPath:" + str + ", newSize:" + k17 + ", newMd5:" + p17 + ", newHead256Md5:" + f17 + ", oldFullsize:" + gp0Var.R + ", oldFullmd5:" + gp0Var.M + ", oldHead256md5:" + gp0Var.P + ", oldThumbFullSize:" + gp0Var.f456951l1 + ", oldThumbMd5:" + gp0Var.Z + ", oldThumbHead256Md5:" + gp0Var.f456978x0);
        if (z17) {
            if (k17 > 0) {
                gp0Var.L0(k17);
            }
            if (!(p17 == null || p17.length() == 0)) {
                gp0Var.N0(p17);
                if (!(f17 == null || f17.length() == 0)) {
                    gp0Var.M0(f17);
                }
            }
        } else {
            if (k17 > 0) {
                gp0Var.q0(k17);
            }
            if (!(p17 == null || p17.length() == 0)) {
                gp0Var.p0(p17);
                if (!(f17 == null || f17.length() == 0)) {
                    gp0Var.r0(f17);
                }
            }
        }
        if (z17) {
            gp0Var.B2 = false;
            gp0Var.C2 = true;
        } else {
            gp0Var.f456987z2 = false;
            gp0Var.A2 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavCdnUploadServicePLC", "updateDataItemAfterCompress after write: dataId:" + gp0Var.T + ", isThumb:" + z17 + ", isVideo:" + z18 + ", dbUpdate:" + ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().lf(r2Var, dm.i4.f66867x2a5c95c7) + ", fullsize:" + gp0Var.R + ", fullmd5:" + gp0Var.M + ", head256md5:" + gp0Var.P + ", thumbFullSize:" + gp0Var.f456951l1 + ", thumbMd5:" + gp0Var.Z + ", thumbHead256Md5:" + gp0Var.f456978x0);
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        e7();
    }

    public final jz5.o c7(o72.e2 e2Var) {
        o72.r2 F = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(e2Var.f67088x958756b0);
        if (F == null) {
            return null;
        }
        if (!(F.f67640x5ab01132 != null)) {
            F = null;
        }
        if (F == null) {
            return null;
        }
        java.lang.String str = e2Var.f67085xf604e54a;
        java.util.LinkedList<r45.gp0> dataList = F.f67640x5ab01132.f452497f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(dataList, "dataList");
        for (r45.gp0 gp0Var : dataList) {
            jz5.o oVar = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, gp0Var.T) ? new jz5.o(F, gp0Var, java.lang.Boolean.FALSE) : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, o72.x1.W(gp0Var.T)) ? new jz5.o(F, gp0Var, java.lang.Boolean.TRUE) : null;
            if (oVar != null) {
                return oVar;
            }
        }
        return null;
    }

    public final v65.h d7() {
        return (v65.h) ((jz5.n) this.f83516g).mo141623x754a37bb();
    }

    public final void e7() {
        v65.i.b(W6(), null, new a82.x(this, null), 1, null);
    }

    public final void f7(o72.e2 e2Var, java.lang.String str) {
        e2Var.f67091x2260084a = str;
        e2Var.f67094xeb1a61d6 = (int) com.p314xaae8f345.mm.vfs.w6.k(str);
        e2Var.f67083xf47749d7 = "";
        e2Var.f67084xf47770e7 = "";
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).fj().A5(e2Var, new java.lang.String[0]);
    }
}
