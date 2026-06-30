package n91;

/* loaded from: classes7.dex */
public class l implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11836x6cc003a1 c11836x6cc003a1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1046xf4b1126e.C11836x6cc003a1) obj;
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.s[] j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().j(c11836x6cc003a1.f159087e, c11836x6cc003a1.f159088f);
        if (j17.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CustomLoadingManager", "invoke: updateMainProcessRecordTask records is null");
            return;
        }
        if (j17.length > 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CustomLoadingManager", "invoke: updateMainProcessRecordTask records length > 1");
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.o) j17[0]).f170639j = c11836x6cc003a1.f159086d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CustomLoadingManager", "update status success. isInFullscreen=" + c11836x6cc003a1.f159086d);
    }
}
