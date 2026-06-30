package db5;

/* loaded from: classes9.dex */
public class g5 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c f309880a;

    public g5(com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c gestureDetectorOnGestureListenerC21510x15ed9d8c) {
        this.f309880a = gestureDetectorOnGestureListenerC21510x15ed9d8c;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        db5.m5 m5Var;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c gestureDetectorOnGestureListenerC21510x15ed9d8c = this.f309880a;
        int i17 = gestureDetectorOnGestureListenerC21510x15ed9d8c.B;
        boolean z17 = false;
        if (i17 == 0) {
            db5.o5 o5Var = gestureDetectorOnGestureListenerC21510x15ed9d8c.f279061f;
            if (o5Var != null) {
                gestureDetectorOnGestureListenerC21510x15ed9d8c.f279070r = o5Var.a();
            }
            if (gestureDetectorOnGestureListenerC21510x15ed9d8c.f279070r && gestureDetectorOnGestureListenerC21510x15ed9d8c.f279078z.getVisibility() == 0) {
                gestureDetectorOnGestureListenerC21510x15ed9d8c.scrollTo(0, gestureDetectorOnGestureListenerC21510x15ed9d8c.f279064i);
            }
        } else if (i17 == 1) {
            db5.l5 l5Var = gestureDetectorOnGestureListenerC21510x15ed9d8c.f279063h;
            if (l5Var != null) {
                gestureDetectorOnGestureListenerC21510x15ed9d8c.f279070r = l5Var.J6();
            }
            if (gestureDetectorOnGestureListenerC21510x15ed9d8c.f279070r && gestureDetectorOnGestureListenerC21510x15ed9d8c.A.getVisibility() == 0) {
                gestureDetectorOnGestureListenerC21510x15ed9d8c.scrollTo(0, gestureDetectorOnGestureListenerC21510x15ed9d8c.f279064i);
            }
        } else if (i17 == 2 && (m5Var = gestureDetectorOnGestureListenerC21510x15ed9d8c.f279062g) != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689) m5Var;
            if (c21897x17252689.V.mo142542xf18228b2()) {
                z17 = true;
            } else {
                c21897x17252689.E1 = c21897x17252689.m79870x9b948425();
                c21897x17252689.n();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[onPreTopLoadData] mPreCount:" + c21897x17252689.E1 + " isForceTopLoadDataForPosition:" + c21897x17252689.C1);
                if (c21897x17252689.V != null) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putBoolean("IS_PRELOAD", true);
                    c21897x17252689.V.a(hd5.n.ACTION_TOP, false, bundle);
                }
                c21897x17252689.D1 = null;
                c21897x17252689.C1 = false;
            }
            gestureDetectorOnGestureListenerC21510x15ed9d8c.f279070r = z17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMPullDownView", "updateDelayHandler handleMessage loadDataType[%d] loadDataEnd[%b]", java.lang.Integer.valueOf(gestureDetectorOnGestureListenerC21510x15ed9d8c.B), java.lang.Boolean.valueOf(gestureDetectorOnGestureListenerC21510x15ed9d8c.f279070r));
    }
}
