package rh5;

/* loaded from: classes3.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22448xb8f34d53 f477358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 f477359e;

    public h(com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22448xb8f34d53 c22448xb8f34d53, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
        this.f477358d = c22448xb8f34d53;
        this.f477359e = c5974x1d8a7409;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2717x62f6fe4.p2718x2e06d1.p2719x5faa95b.C22448xb8f34d53 c22448xb8f34d53 = this.f477358d;
        int i17 = c22448xb8f34d53.f290667e;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409 = this.f477359e;
        am.ct ctVar = c5974x1d8a7409.f136272g;
        if (i17 == ctVar.f87933a) {
            if (!ctVar.f87935c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MediaGallery.DefaultTranslateDataComponent", "event data has no result");
                eg3.h hVar = c22448xb8f34d53.f290666d;
                if (hVar != null) {
                    ((eg3.f) hVar).f334192a.S();
                    return;
                }
                return;
            }
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(ctVar.f87936d);
            am.ct ctVar2 = c5974x1d8a7409.f136272g;
            if (!j17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MediaGallery.DefaultTranslateDataComponent", "trans result path " + ctVar2.f87936d + " not exist!");
                eg3.h hVar2 = c22448xb8f34d53.f290666d;
                if (hVar2 != null) {
                    ((eg3.f) hVar2).f334192a.S();
                    return;
                }
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.DefaultTranslateDataComponent", "trans success! curScanSourcePath:" + c22448xb8f34d53.f290668f + " resultPath " + ctVar2.f87936d + " , ");
            java.util.Map map = c22448xb8f34d53.f290669g;
            java.lang.String str = c22448xb8f34d53.f290668f;
            java.lang.String resultPath = ctVar2.f87936d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultPath, "resultPath");
            ((java.util.HashMap) map).put(str, resultPath);
            eg3.h hVar3 = c22448xb8f34d53.f290666d;
            if (hVar3 != null) {
                java.lang.String resultPath2 = ctVar2.f87936d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resultPath2, "resultPath");
                ((eg3.f) hVar3).a(resultPath2);
            }
        }
    }
}
