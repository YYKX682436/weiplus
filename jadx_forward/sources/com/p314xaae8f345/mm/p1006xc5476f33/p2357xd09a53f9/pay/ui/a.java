package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7 f260274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.d f260275e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.d dVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5585x857171c7 c5585x857171c7) {
        this.f260275e = dVar;
        this.f260274d = c5585x857171c7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback");
        am.cf cfVar = this.f260274d.f135908h;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.d dVar = this.f260275e;
        if (cfVar != null && cfVar.f87882a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is true");
            dVar.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.c cVar = dVar.f260287c;
            if (cVar != null) {
                cVar.R0(cfVar.f87882a, cfVar.f87883b, cfVar.f87884c);
                return;
            }
            return;
        }
        if (cfVar == null || cfVar.f87882a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result == null");
            return;
        }
        dVar.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.c cVar2 = dVar.f260287c;
        if (cVar2 != null) {
            cVar2.R0(cfVar.f87882a, cfVar.f87883b, cfVar.f87884c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RegenFingerPrintRsaKey", "GenFingerPrintRsaKeyEvent callback, result.isSuccess is false");
    }
}
