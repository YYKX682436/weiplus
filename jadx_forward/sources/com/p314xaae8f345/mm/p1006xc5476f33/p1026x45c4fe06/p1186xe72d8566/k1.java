package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/screenshot/AppBrandScreenshotInfo;", "kotlin.jvm.PlatformType", "passedInfo", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/screenshot/AppBrandScreenshotInfo;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k1<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.k1 f170037d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.k1();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.C12570xcc3b76da c12570xcc3b76da = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.C12570xcc3b76da) obj;
        if (c12570xcc3b76da == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotTaken, passedInfo is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotTaken, hasWindowFocus:true passedInfo: " + c12570xcc3b76da);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0.f169997e.b(c12570xcc3b76da)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotTaken, insert passedInfo fail");
    }
}
