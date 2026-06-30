package vv4;

/* loaded from: classes11.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 f522002d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75) {
        this.f522002d = activityC19216xc2476b75;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75.B;
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75 activityC19216xc2476b75 = this.f522002d;
        if (!activityC19216xc2476b75.A) {
            activityC19216xc2476b75.A = true;
            yz5.p pVar = (yz5.p) ((jz5.n) activityC19216xc2476b75.f263182x).mo141623x754a37bb();
            if (pVar != null) {
                pVar.mo149xb9724478("enter", null);
            }
        }
        yz5.p pVar2 = (yz5.p) ((jz5.n) activityC19216xc2476b75.f263182x).mo141623x754a37bb();
        if (pVar2 != null) {
            pVar2.mo149xb9724478("dismiss", null);
        }
        super/*com.tencent.mm.ui.MMActivity*/.finish();
    }
}
