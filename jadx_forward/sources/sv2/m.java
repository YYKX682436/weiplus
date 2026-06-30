package sv2;

/* loaded from: classes10.dex */
public final class m extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494864h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494865i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f494866m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f494867n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f494868o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f494869p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494864h = draftItem;
        this.f494865i = "LogPost.FinderDraftMediaProcessStage";
        this.f494866m = draftItem.t0();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f494869p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.FinderDraftMediaProcessStage$draftModifyListener$1
            {
                this.f39173x3fe91575 = -881666027;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 c5463x73bc5a05) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 event = c5463x73bc5a05;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                sv2.m mVar = sv2.m.this;
                am.za zaVar = event.f135802g;
                if (!(zaVar != null && zaVar.f90082a == mVar.f494864h.f66236x88be67a1)) {
                    return false;
                }
                java.lang.String str = mVar.f494865i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canceled ");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = mVar.f494864h;
                sb6.append(x80Var.f66236x88be67a1);
                sb6.append(", ");
                sb6.append(x80Var.f66238x2327e25f);
                sb6.append(", modifyType:");
                sb6.append(zaVar != null ? java.lang.Integer.valueOf(zaVar.f90083b) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                mVar.f494868o = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f0Var = mVar.f494867n;
                if (f0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.b(f0Var, null, 1, null);
                }
                return true;
            }
        };
    }

    @Override // pv2.g
    public int a() {
        return 2;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f494866m.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 20L, 1L);
            }
        }
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nextStage, "nextStage");
        boolean m59314x4d5c4d55 = this.f494866m.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 20L, 1L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0344, code lost:
    
        if ((r3 == null || r3.length() == 0) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0905, code lost:
    
        if (r2 == null) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0907, code lost:
    
        r0 = java.lang.Integer.valueOf(r2.f442896a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x090f, code lost:
    
        r1.append(r0);
        r1.append(' ');
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0917, code lost:
    
        if (r2 == null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0919, code lost:
    
        r0 = java.lang.Integer.valueOf(r2.f442897b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0921, code lost:
    
        r1.append(r0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r11, r1.toString());
        r7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.H(r7, "andr_Video_Compress_Fail", r14.f494866m, 0, null, 12, null);
        ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).nj("error", r37, false, r4, r10);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.H(r7, "andr_Video_Compress_Fail", r14.f494866m, 0, null, 12, null);
        r0 = new sv2.c(r12, 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0920, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x090e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x09ab  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x062c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x03ce  */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object] */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 2921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.m.j():pv2.g");
    }

    public final java.lang.String k() {
        java.lang.String a17;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(this.f494866m.m59264x7efe73ec());
        return (mb4Var == null || (a17 = hc2.l0.a(mb4Var)) == null) ? "" : a17;
    }

    public final jz5.l l(long j17, int i17, java.lang.String str, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d, r45.mb4 mb4Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 c19791x8d6e6bf1, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494865i, "remuxComposition outputPath:" + str);
        r45.h70 h70Var = (r45.h70) mb4Var.m75936x14adae67(21);
        if (h70Var == null) {
            h70Var = new r45.h70();
        }
        r45.h70 h70Var2 = h70Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        f0Var2.f391649d = -1;
        r45.i70 i70Var = h70Var2.f457435i;
        if (i70Var == null) {
            i70Var = new r45.i70();
        }
        r45.i70 i70Var2 = i70Var;
        i70Var2.f458308d = str;
        i95.m c17 = i95.n0.c(bg0.v.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        i70Var2.f458325x = bg0.v.Tg((bg0.v) c17, false, 0L, 2, null);
        java.lang.Object obj = new java.lang.Object();
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n nVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.n();
        r45.dd4 dd4Var = (r45.dd4) mb4Var.m75936x14adae67(14);
        nVar.f257215a = dd4Var != null ? dd4Var.m75939xb282bd08(7) : 0;
        nVar.f257216b = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.t2()) {
            uv2.e eVar = uv2.e.f512909a;
            long j18 = uv2.e.f512911c;
            if (j18 > 0) {
                c11120x15dce88d.C = (int) ((((float) j18) / 1048576.0f) * 0.38f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494865i, "ABA finder video maxVideoSize:" + c11120x15dce88d.C);
            }
            nVar.i(true, c11120x15dce88d);
        }
        nVar.f257226l = new sv2.i(new p3321xbce91901.jvm.p3324x21ffc6bd.e0(), this, i17, i18);
        this.f494867n = nVar;
        float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0.a(nVar, h70Var2, false, new sv2.j(this, f0Var2, i17, c19791x8d6e6bf1, j17, str, i70Var2, c11120x15dce88d, h70Var2, obj, c0Var), 2, null);
        synchronized (obj) {
            if (c0Var.f391645d) {
                f0Var = f0Var2;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494865i, "wait " + i17);
                try {
                    obj.wait();
                } catch (java.lang.InterruptedException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f494865i, "wait interrupted");
                }
                java.lang.String str2 = this.f494865i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify ");
                sb6.append(i17);
                sb6.append(", ");
                f0Var = f0Var2;
                sb6.append(f0Var.f391649d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            }
        }
        return new jz5.l(java.lang.Integer.valueOf(f0Var.f391649d), java.lang.Float.valueOf(a17));
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l m(long r29, com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r31, r45.mb4 r32, java.lang.String r33, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 r34, boolean r35, int r36, int r37, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6996x71e99596 r38) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.m.m(long, com.tencent.mm.modelcontrol.VideoTransPara, r45.mb4, java.lang.String, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, boolean, int, int, com.tencent.mm.autogen.mmdata.rpt.VideoCompositionPerformanceStruct):jz5.l");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0368  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d r23, r45.mb4 r24, java.lang.String r25, r45.mb4 r26, int r27, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19791x8d6e6bf1 r28, float r29, float r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.m.n(com.tencent.mm.modelcontrol.VideoTransPara, r45.mb4, java.lang.String, r45.mb4, int, com.tencent.mm.protocal.protobuf.FinderMediaReportObject, float, float, boolean):void");
    }

    public final void o(float f17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int i17 = (int) (45 * f17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494864h;
        sb6.append(x80Var.f66236x88be67a1);
        sb6.append(" updateProgress  ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494865i, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494866m;
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i17) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i17));
            cu2.o.f303963a.b(x80Var);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f();
        long j17 = x80Var.f66236x88be67a1;
        am.ga gaVar = c5442xd807898f.f135783g;
        gaVar.f88282a = j17;
        gaVar.f88283b = c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4);
        c5442xd807898f.e();
    }
}
