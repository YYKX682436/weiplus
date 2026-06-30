package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc;

/* loaded from: classes7.dex */
public abstract class l {
    public static final void a(java.lang.String appId, android.os.Parcelable data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            throw new java.lang.IllegalStateException("Main process env is required for notify call".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.f170732h.a().N(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.ipc.k(appId, data));
    }
}
