package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f177630a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f177631b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f177632c = -1;

    public boolean a() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f177630a)) {
            if ((android.os.SystemClock.elapsedRealtime() - (this.f177632c + 3600)) / 1000 < this.f177631b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m54551x9616526c() {
        return "OpenVoiceSessionKey{sessionKey='" + this.f177630a + "', expireTicks=" + this.f177631b + ", initTicks=" + this.f177632c + '}';
    }
}
