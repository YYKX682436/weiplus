package sv2;

/* loaded from: classes10.dex */
public final class b0 extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 f494787h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494788i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f494789m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f494790n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f494791o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f494792p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 draftItem) {
        super("draft_" + draftItem.f66236x88be67a1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(draftItem, "draftItem");
        this.f494787h = draftItem;
        this.f494788i = "LogPost.MvDraftMediaProcessStage";
        this.f494789m = draftItem.t0();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f494792p = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05>(a0Var) { // from class: com.tencent.mm.plugin.finder.upload.postlogic.draftstage.MvDraftMediaProcessStage$draftModifyListener$1
            {
                this.f39173x3fe91575 = -881666027;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 c5463x73bc5a05) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5463x73bc5a05 event = c5463x73bc5a05;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                sv2.b0 b0Var = sv2.b0.this;
                am.za zaVar = event.f135802g;
                if (!(zaVar != null && zaVar.f90082a == b0Var.f494787h.f66236x88be67a1)) {
                    return false;
                }
                java.lang.String str = b0Var.f494788i;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canceled ");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = b0Var.f494787h;
                sb6.append(x80Var.f66236x88be67a1);
                sb6.append(", ");
                sb6.append(x80Var.f66238x2327e25f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                b0Var.f494791o = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.f0 f0Var = b0Var.f494790n;
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
        boolean m59314x4d5c4d55 = this.f494789m.m59314x4d5c4d55();
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
        boolean m59314x4d5c4d55 = this.f494789m.m59314x4d5c4d55();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(1718L, 20L, 1L);
        if (m59314x4d5c4d55) {
            if ((1718 == 1718 ? 1719L : 0L) > 0) {
                g0Var.C(1718 == 1718 ? 1719L : 0L, 20L, 1L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0998, code lost:
    
        r14 = r13;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r14.f494788i, "error cannot get mvTrack and mvMedia");
        r0 = new sv2.c(r14.f494787h, 2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r1v105, types: [r45.mb4, com.tencent.mm.protobuf.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [com.tencent.mm.protobuf.e, r45.jf2] */
    /* JADX WARN: Type inference failed for: r1v26, types: [pc0.g2] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.tencent.mm.protocal.protobuf.FinderMedia] */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r7v1, types: [dm.i4, com.tencent.mm.plugin.finder.storage.FinderItem] */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 2541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv2.b0.j():pv2.g");
    }

    public final void k(float f17, int i17, int i18) {
        float f18 = (f17 > 1.0f ? 1.0f : f17) * ((i17 + 1.0f) / i18);
        int i19 = (int) (45 * f18);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = this.f494787h;
        sb6.append(x80Var.f66236x88be67a1);
        sb6.append(" updateProgress ");
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(f18);
        sb6.append(", ");
        sb6.append(i19);
        sb6.append(", index:");
        sb6.append(i17);
        sb6.append(", size:");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f494788i, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f494789m;
        if (c14994x9b99c079.m59277xa8f45ee4().m75939xb282bd08(4) < i19) {
            c14994x9b99c079.m59277xa8f45ee4().set(4, java.lang.Integer.valueOf(i19));
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
