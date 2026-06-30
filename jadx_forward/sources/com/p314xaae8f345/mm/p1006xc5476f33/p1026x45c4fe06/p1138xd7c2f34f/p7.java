package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class p7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166427a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f166428b;

    public p7(java.lang.String remoteProcessName, java.lang.String appId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remoteProcessName, "remoteProcessName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f166427a = remoteProcessName;
        this.f166428b = appId;
    }

    public void b(ne1.j state, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11667xc7e59dd6 c11667xc7e59dd6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify(appId:");
        sb6.append(this.f166428b);
        sb6.append(", process:");
        java.lang.String str4 = this.f166427a;
        sb6.append(str4);
        sb6.append(", state:");
        sb6.append(state);
        sb6.append(", passThroughInfo:");
        sb6.append(str2);
        sb6.append(", stablePassThroughInfo:");
        sb6.append(str3);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.IPCUpdateStateNotifier", sb6.toString());
        com.p314xaae8f345.mm.p794xb0fa9b5e.f.a(str4, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12345xe3f1206c(this.f166428b, i17, str, state, str2, str3, c11667xc7e59dd6), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o7.f166392d, null);
    }
}
