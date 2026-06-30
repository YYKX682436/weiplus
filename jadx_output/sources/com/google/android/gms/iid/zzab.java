package com.google.android.gms.iid;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzab extends com.google.android.gms.iid.zzz<android.os.Bundle> {
    public zzab(int i17, int i18, android.os.Bundle bundle) {
        super(i17, 1, bundle);
    }

    @Override // com.google.android.gms.iid.zzz
    public final void zzh(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = bundle.getBundle(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (bundle2 == null) {
            bundle2 = android.os.Bundle.EMPTY;
        }
        if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this).length() + 16 + java.lang.String.valueOf(bundle2).length());
        }
        this.zzcl.setResult(bundle2);
    }

    @Override // com.google.android.gms.iid.zzz
    public final boolean zzu() {
        return false;
    }
}
