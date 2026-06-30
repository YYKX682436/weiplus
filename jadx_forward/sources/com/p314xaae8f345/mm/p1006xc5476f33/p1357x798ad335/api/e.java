package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public class e implements com.p314xaae8f345.mm.p794xb0fa9b5e.k0 {
    private e() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.k0
    /* renamed from: invoke */
    public java.lang.Object mo32082xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        java.lang.String str = null;
        if (c10756x2a5d7b2d == null) {
            return null;
        }
        java.lang.String str2 = c10756x2a5d7b2d.f149939d;
        java.lang.String str3 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.api.f.f178438b).get(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5589xbb82aa08 c5589xbb82aa08 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5589xbb82aa08();
            c5589xbb82aa08.f135912g.f88292a = str2;
            c5589xbb82aa08.e();
            str3 = c5589xbb82aa08.f135913h.f88366a;
        }
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadExtension", "getOpenId invoke in main thread");
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m j17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.j(str3, false, false);
            if (j17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j17.f67384x996f3ea)) {
                str = j17.f67384x996f3ea;
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameDownloadExtension", "getOpenId invoke in worker thread");
            str = zo3.p.Ui().d(str3);
        }
        return new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(str);
    }
}
