package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.RTCStatsReport */
/* loaded from: classes.dex */
public class C29844x2c0879b2 {

    /* renamed from: stats */
    private final java.util.Map<java.lang.String, org.p3371xd0ce3e8d.C29842x18c856de> f75863x68ac49f;

    /* renamed from: timestampUs */
    private final long f75864x55a34654;

    public C29844x2c0879b2(long j17, java.util.Map<java.lang.String, org.p3371xd0ce3e8d.C29842x18c856de> map) {
        this.f75864x55a34654 = j17;
        this.f75863x68ac49f = map;
    }

    /* renamed from: create */
    private static org.p3371xd0ce3e8d.C29844x2c0879b2 m156221xaf65a0fc(long j17, java.util.Map map) {
        return new org.p3371xd0ce3e8d.C29844x2c0879b2(j17, map);
    }

    /* renamed from: getStatsMap */
    public java.util.Map<java.lang.String, org.p3371xd0ce3e8d.C29842x18c856de> m156222xca726db3() {
        return this.f75863x68ac49f;
    }

    /* renamed from: getTimestampUs */
    public double m156223x2f798d1e() {
        return this.f75864x55a34654;
    }

    /* renamed from: toString */
    public java.lang.String m156224x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{ timestampUs: ");
        sb6.append(this.f75864x55a34654);
        sb6.append(", stats: [\n");
        boolean z17 = true;
        for (org.p3371xd0ce3e8d.C29842x18c856de c29842x18c856de : this.f75863x68ac49f.values()) {
            if (!z17) {
                sb6.append(",\n");
            }
            sb6.append(c29842x18c856de);
            z17 = false;
        }
        sb6.append(" ] }");
        return sb6.toString();
    }
}
