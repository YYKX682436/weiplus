package org.p3343x72743996.p3344x2e06d1;

/* renamed from: org.chromium.base.PowerMonitorForQ */
/* loaded from: classes12.dex */
public final class C29333xba27fefd {
    private C29333xba27fefd() {
    }

    /* renamed from: addThermalStatusListener */
    public static void m152604xeb19ec1c(android.os.PowerManager powerManager) {
        powerManager.addThermalStatusListener(new android.os.PowerManager.OnThermalStatusChangedListener() { // from class: org.chromium.base.PowerMonitorForQ.1
            @Override // android.os.PowerManager.OnThermalStatusChangedListener
            public void onThermalStatusChanged(int i17) {
                org.p3343x72743996.p3344x2e06d1.C29334x1ec78ab0.get().mo152603xfa5388a(i17);
            }
        });
    }
}
