package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes10.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 f198270d;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 c14330xf9b5e578) {
        this.f198270d = c14330xf9b5e578;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578 c14330xf9b5e578 = this.f198270d;
        android.os.Vibrator vibrator = c14330xf9b5e578.M;
        if (vibrator != null) {
            try {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(android.os.VibrationEffect.createOneShot(10L, 255));
                } else {
                    vibrator.vibrate(10L);
                }
            } catch (java.lang.SecurityException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c14330xf9b5e578.f197527v, "Vibrate permission denied: " + e17.getMessage());
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c14330xf9b5e578.f197527v, "Vibrate failed: " + e18.getMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14330xf9b5e578.A(c14330xf9b5e578, false);
        c14330xf9b5e578.G.postDelayed(this, 200L);
    }
}
