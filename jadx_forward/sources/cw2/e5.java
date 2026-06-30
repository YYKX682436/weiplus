package cw2;

/* loaded from: classes10.dex */
public final class e5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 f305207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f305208e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14, android.os.Bundle bundle) {
        super(1);
        this.f305207d = c15186x26928e14;
        this.f305208e = bundle;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ct0.b capture = (ct0.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(capture, "capture");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14 = this.f305207d;
        hw2.e0 e0Var = c15186x26928e14.D;
        java.lang.String path = capture.f303737a;
        hw2.t tVar = c15186x26928e14.f212163p;
        boolean z17 = tVar.f367096h ? tVar.f367097i : tVar.f367098m;
        e0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        java.util.ArrayList arrayList = e0Var.f367058d;
        arrayList.add(path);
        e0Var.f367059e.add(java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderSubVideoFilePlugin", "current video size:" + arrayList.size() + " add path:" + path + ", " + z17);
        boolean z18 = c15186x26928e14.f212164q.f376764f;
        yt3.r3 r3Var = c15186x26928e14.f212159i;
        boolean z19 = false;
        if (z18) {
            r3Var.f547161f.setTag(com.p314xaae8f345.mm.R.id.e5x, java.lang.Boolean.TRUE);
            nu3.i.c(nu3.i.f421751a, "KEY_SUB_VIDEO_RECORD_SUCCESS_INT", 0, 2, null);
            android.os.Bundle bundle = this.f305208e;
            if (bundle == null || !bundle.getBoolean("PARAM_1_BOOLEAN")) {
                r3Var.m(false);
                r3Var.mo9066x6761d4f();
                at0.n nVar = c15186x26928e14.f212173z;
                if (nVar != null) {
                    nVar.e();
                }
                c15186x26928e14.f212165r.mo9067x901b6914(0);
                c15186x26928e14.f212166s.mo9067x901b6914(0);
                tVar.mo9067x901b6914(4);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderRecordPluginLayout", "sub record finish");
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1371L, 191L, 1L, false);
                ju3.d0.k(c15186x26928e14, ju3.c0.f383424o, null, 2, null);
            }
        } else {
            r3Var.f547161f.setTag(com.p314xaae8f345.mm.R.id.e5x, java.lang.Boolean.FALSE);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5 i5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.f206610a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 211L, 0L, 2, null);
            at0.n nVar2 = c15186x26928e14.f212173z;
            if (nVar2 != null && nVar2.f95131f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 214L, 0L, 2, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 213L, 0L, 2, null);
            }
            if (tVar.f367096h ? tVar.f367097i : tVar.f367098m) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 215L, 0L, 2, null);
            }
            long j17 = capture.f303741e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1371L, 218L, j17, false);
            if (j17 < 5000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 220L, 0L, 2, null);
            } else if (j17 < com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 221L, 0L, 2, null);
            } else if (j17 < 15000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 222L, 0L, 2, null);
            } else if (j17 < 20000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 223L, 0L, 2, null);
            } else if (j17 < 30000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 224L, 0L, 2, null);
            } else if (j17 < 40000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 225L, 0L, 2, null);
            } else if (j17 < 50000) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 226L, 0L, 2, null);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.i5.a(i5Var, 227L, 0L, 2, null);
            }
            ju3.d0.k(c15186x26928e14, ju3.c0.f383424o, null, 2, null);
            nu3.i iVar = nu3.i.f421751a;
            at0.n nVar3 = c15186x26928e14.f212173z;
            iVar.n("KEY_MEDIA_SOURCE_INT", java.lang.Integer.valueOf(nVar3 != null && nVar3.f95131f ? 2 : 1));
            rs0.p pVar = rs0.p.f480843a;
            java.lang.String str = capture.f303737a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = c15186x26928e14.B;
            pVar.a(str, c16993xacc19624 != null ? c16993xacc19624.f237205g : 1, c16993xacc19624 != null ? c16993xacc19624.f237204f : -1);
            java.lang.String str2 = capture.f303737a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = c15186x26928e14.B;
            di3.x.g(str2, c16993xacc196242 != null ? c16993xacc196242.f237205g : 1, c16993xacc196242 != null ? c16993xacc196242.F : -1);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6927x849d3564 c6927x849d3564 = nu3.i.f421754d;
            c6927x849d3564.f142408j = capture.f303741e - capture.f303740d;
            at0.n nVar4 = c15186x26928e14.f212173z;
            if (nVar4 != null && nVar4.f95131f) {
                z19 = true;
            }
            c6927x849d3564.f142409k = z19 ? 2L : 1L;
        }
        return jz5.f0.f384359a;
    }
}
