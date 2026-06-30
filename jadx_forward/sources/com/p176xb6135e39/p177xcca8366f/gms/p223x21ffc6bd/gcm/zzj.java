package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm;

/* loaded from: classes13.dex */
final class zzj extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzg {

    /* renamed from: zzdi */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzh f6271x394bc5 = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzh();

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.gcm.zzg
    public final void zzd(java.lang.Throwable th6, java.lang.Throwable th7) {
        if (th7 == th6) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th7);
        }
        if (th7 == null) {
            throw new java.lang.NullPointerException("The suppressed exception cannot be null.");
        }
        this.f6271x394bc5.zzd(th6, true).add(th7);
    }
}
