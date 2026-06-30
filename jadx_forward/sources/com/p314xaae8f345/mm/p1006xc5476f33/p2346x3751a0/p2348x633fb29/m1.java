package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public int f258277a;

    /* renamed from: b, reason: collision with root package name */
    public long f258278b;

    /* renamed from: c, reason: collision with root package name */
    public int f258279c;

    /* renamed from: d, reason: collision with root package name */
    public int f258280d;

    public boolean a(java.lang.String str) {
        this.f258280d = 0;
        try {
            java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "voipinvitemsg", null);
            if (d17 == null) {
                return false;
            }
            if (d17.get(".voipinvitemsg.roomid") != null) {
                this.f258277a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".voipinvitemsg.roomid"), 0);
            }
            if (d17.get(".voipinvitemsg.key") != null) {
                this.f258278b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".voipinvitemsg.key"), 0L);
            }
            if (d17.get(".voipinvitemsg.status") != null) {
                this.f258279c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".voipinvitemsg.status"), 0);
            }
            if (d17.get(".voipinvitemsg.invitetype") == null) {
                return true;
            }
            this.f258280d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".voipinvitemsg.invitetype"), 0);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.VoipExtension", e17, "", new java.lang.Object[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VoipExtension", "parse voip message error: %s", e17.getMessage());
            return false;
        }
    }
}
