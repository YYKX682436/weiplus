package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72;

/* loaded from: classes14.dex */
public class j4 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f231198a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f231199b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f231200c = -1;

    public boolean a() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f231198a)) {
            if ((android.os.SystemClock.elapsedRealtime() - (this.f231200c + 3600)) / 1000 < this.f231199b) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m67013x9616526c() {
        return "ILinkSessionKey{sessionKey='" + this.f231198a + "', expireTicks=" + this.f231199b + ", initTicks=" + this.f231200c + '}';
    }
}
