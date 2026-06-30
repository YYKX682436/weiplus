package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes15.dex */
public final class h implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l f172416d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar) {
        this.f172416d = lVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnStateChangeListener
    /* renamed from: onStateChange */
    public final void mo53282x4799dc42(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar = this.f172416d;
        java.lang.String str = lVar.f172422r;
        if (i18 == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar2 = lVar.E;
            if (aVar2 != null) {
                pk1.r rVar = (pk1.r) aVar2;
                if (rVar.f437042s == 0 && rVar.f437037n > 0) {
                    rVar.f437042s = java.lang.System.currentTimeMillis() - rVar.f437037n;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "onPrepared playerPreparedTime:%d", java.lang.Long.valueOf(rVar.f437042s));
                return;
            }
            return;
        }
        if (i18 == 5) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar3 = lVar.E;
            if (aVar3 != null) {
                pk1.r rVar2 = (pk1.r) aVar3;
                if (rVar2.f437043t == 0 && rVar2.f437038o > 0) {
                    rVar2.f437043t = java.lang.System.currentTimeMillis() - rVar2.f437038o;
                }
                int i19 = rVar2.f437036m + 1;
                rVar2.f437036m = i19;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar2.f437019a, "onStart playCount:%d， firstCallStartPlayer:%d", java.lang.Integer.valueOf(i19), java.lang.Long.valueOf(rVar2.f437043t));
                return;
            }
            return;
        }
        if (i18 == 6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar4 = lVar.E;
            if (aVar4 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(((pk1.r) aVar4).f437019a, "onPause");
                return;
            }
            return;
        }
        if (i18 == 9 && (aVar = lVar.E) != null) {
            pk1.r rVar3 = (pk1.r) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar3.f437019a, "onStop");
            int m37745x9208c81b = ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37745x9208c81b(2);
            rVar3.X = m37745x9208c81b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar3.f437019a, "updateRecentDownloadAverageSpeed recentDownloadAverageSpeed:%d", java.lang.Integer.valueOf(m37745x9208c81b));
        }
    }
}
