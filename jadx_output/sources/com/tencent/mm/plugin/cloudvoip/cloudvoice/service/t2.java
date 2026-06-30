package com.tencent.mm.plugin.cloudvoip.cloudvoice.service;

/* loaded from: classes14.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f96097a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f96098b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f96099c = -1;

    public boolean a() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f96097a)) {
            if ((android.os.SystemClock.elapsedRealtime() - (this.f96099c + 3600)) / 1000 < this.f96098b) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        return "OpenVoiceSessionKey{sessionKey='" + this.f96097a + "', expireTicks=" + this.f96098b + ", initTicks=" + this.f96099c + '}';
    }
}
