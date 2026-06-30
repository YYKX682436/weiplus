package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zzaaz extends com.google.android.gms.internal.measurement.zzaay {
    public zzaaz(int i17) {
        super(i17, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzaay
    public final void zzrg() {
        if (!isImmutable()) {
            for (int i17 = 0; i17 < zzuj(); i17++) {
                java.util.Map.Entry zzah = zzah(i17);
                if (((com.google.android.gms.internal.measurement.zzzo) zzah.getKey()).zztk()) {
                    zzah.setValue(java.util.Collections.unmodifiableList((java.util.List) zzah.getValue()));
                }
            }
            for (java.util.Map.Entry entry : zzuk()) {
                if (((com.google.android.gms.internal.measurement.zzzo) entry.getKey()).zztk()) {
                    entry.setValue(java.util.Collections.unmodifiableList((java.util.List) entry.getValue()));
                }
            }
        }
        super.zzrg();
    }
}
