package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a;

/* loaded from: classes7.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p f157830a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.p();

    public final int a(java.lang.String appId) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        long longValue = new kk.v(((v81.e) i95.n0.c(v81.e.class)).Z3(appId)).longValue();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getBoolean("hadTransferToEncryptMMKV#" + longValue + '#' + appId, false)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("keyHadFinishTransferToEncryptMMKV#");
            sb6.append(longValue);
            sb6.append('#');
            sb6.append(appId);
            i17 = L.getBoolean(sb6.toString(), false) ? 5 : 4;
        } else {
            android.content.SharedPreferences d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.d();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.q qVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.s.f157845e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            i17 = qVar.b(d17, longValue, appId) ? 2 : (!qVar.c(d17, longValue, appId) || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.t.f157854a.a()) ? 1 : 3;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandKVStorageScheme", "getStorageScheme:" + i17);
        return i17;
    }
}
