package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ep implements com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq f193976a;

    public ep(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar) {
        this.f193976a = dqVar;
    }

    public boolean c(android.view.View view, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n state, dk2.g comboData, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comboData, "comboData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "batchCallback on " + state + ", clickCnt:" + i17 + ", diffCnt is " + i18 + ", comboId is " + comboData.f315000b + ", needCheckBalance:" + z17 + ", networkEnable:" + this.f193976a.V + " isFromPatchSend: " + z18);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.cp.f193716a[state.ordinal()] == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar = this.f193976a;
            if (dqVar.X) {
                qo0.b bVar = qo0.b.f446877e2;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("PARAM_FINDER_LIVE_MEMBER_LIST_AUTOREFRESH_VALUE", dqVar.Y);
                dqVar.f193854p.mo46557x60d69242(bVar, bundle);
            }
            this.f193976a.C1();
            return true;
        }
        java.lang.String str = this.f193976a.f193858r;
        dk2.u7 u7Var = dk2.u7.f315714a;
        u7Var.h(str, false);
        ce2.i e17 = u7Var.e(str);
        if (str == null || e17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq dqVar2 = this.f193976a;
            dqVar2.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.up(null, dqVar2));
            this.f193976a.F1();
            return false;
        }
        if (!z17 || z18) {
            int i19 = z18 ? i18 : 1;
            int P0 = ((int) e17.P0()) * i19;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.t tVar = this.f193976a.N;
            boolean z19 = tVar != null ? tVar.f197224m : true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "batchCallback quota batchCount: " + i19 + ", totalPrice: " + P0 + "  curBalance: " + ((mm2.c1) this.f193976a.P0(mm2.c1.class)).f410413s3 + "isCurrentSingleClickEnable: " + z19);
            if (z19) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.D1(this.f193976a, str, i18, comboData, false, z18, 8, null);
            }
        } else {
            int P02 = (int) e17.P0();
            long j17 = ((mm2.c1) this.f193976a.P0(mm2.c1.class)).f410413s3;
            if (j17 < 0 && P02 > 0) {
                i18 -= (int) java.lang.Math.ceil(((-j17) * 1.0d) / P02);
            }
            if (!this.f193976a.x1(P02, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "batchCallback quota disable, safeDiffCnt - 1");
                i18--;
            }
            int i27 = i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveGiftSendPlugin", "batchCallback price = " + P02 + ", realTimeBalance = " + j17 + ", safeDiffCnt = " + i27);
            if (i27 > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dq.D1(this.f193976a, str, i27, comboData, false, false, 24, null);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0149, code lost:
    
        if ((r9 != null ? r9.longValue() : 0) >= r33) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x056f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(android.view.View r29, int r30, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n r31, dk2.g r32, int r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 1423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep.d(android.view.View, int, com.tencent.mm.plugin.finder.live.util.n, dk2.g, int, boolean):boolean");
    }
}
