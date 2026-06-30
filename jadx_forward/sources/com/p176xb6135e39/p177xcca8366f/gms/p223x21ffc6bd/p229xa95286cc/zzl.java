package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc;

/* loaded from: classes13.dex */
final class zzl extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzi {
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzj zzk = new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzj();

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p229xa95286cc.zzi
    public final void zza(java.lang.Throwable th6, java.lang.Throwable th7) {
        if (th7 == th6) {
            throw new java.lang.IllegalArgumentException("Self suppression is not allowed.", th7);
        }
        if (th7 == null) {
            throw new java.lang.NullPointerException("The suppressed exception cannot be null.");
        }
        this.zzk.zza(th6, true).add(th7);
    }
}
