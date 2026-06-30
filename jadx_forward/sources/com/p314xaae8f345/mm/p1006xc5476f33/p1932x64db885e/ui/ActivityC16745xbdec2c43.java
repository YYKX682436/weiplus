package com.p314xaae8f345.mm.p1006xc5476f33.p1932x64db885e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/nfc_open/ui/InnerNfcDispatchLogicUI;", "Lcom/tencent/mm/plugin/nfc_open/ui/TransparentUI;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.nfc_open.ui.InnerNfcDispatchLogicUI */
/* loaded from: classes14.dex */
public final class ActivityC16745xbdec2c43 extends com.p314xaae8f345.mm.p1006xc5476f33.p1932x64db885e.ui.ActivityC16748xf3198b46 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1932x64db885e.ui.ActivityC16748xf3198b46, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Nfc.InnerNfcDispatchLogicUI", "onCreate, intent is null");
            finish();
            return;
        }
        java.util.Queue queue = bo3.e.f104557a;
        java.util.Iterator it = ((java.util.PriorityQueue) bo3.e.f104557a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            bo3.c cVar = (bo3.c) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Nfc.NfcDispatchLogic", "doDispatch, dispatch to processor: " + cVar.mo10961xfb82e301());
            if (cVar.a(this, intent)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Nfc.NfcDispatchLogic", "doDispatch, processor: " + cVar.mo10961xfb82e301() + " processed");
                break;
            }
        }
        finish();
    }
}
