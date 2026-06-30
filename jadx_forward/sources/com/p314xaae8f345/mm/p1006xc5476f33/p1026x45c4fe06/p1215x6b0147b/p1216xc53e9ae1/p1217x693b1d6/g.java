package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6;

/* loaded from: classes15.dex */
public final class g implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l f172415d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar) {
        this.f172415d = lVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnErrorListener
    /* renamed from: onError */
    public final void mo53281xaf8aa769(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, int i18, long j17, long j18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.l lVar = this.f172415d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(lVar.f172422r, "onError, errorType: " + i17 + ", errorCode: " + i18 + ", arg1: " + j17 + ", arg2: " + j18);
        if (1000 == i18) {
            return;
        }
        if (1100 == i17) {
            boolean z17 = false;
            if (11070000 <= i18 && i18 < 11080000) {
                z17 = true;
            }
            if (z17) {
                lVar.G(com.p314xaae8f345.mm.p788xd6f12a1a.C10731x18393f6b.f29002x44229856, i18 - 11070000);
                return;
            }
        }
        lVar.G((-10000) - i17, i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar = lVar.E;
        if (aVar != null) {
            pk1.r rVar = (pk1.r) aVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "onError errType:%d, errCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            rVar.T = true;
            rVar.U = i17;
            rVar.V = i18;
        }
    }
}
