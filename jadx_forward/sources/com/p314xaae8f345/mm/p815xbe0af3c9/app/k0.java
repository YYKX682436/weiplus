package com.p314xaae8f345.mm.p815xbe0af3c9.app;

/* loaded from: classes12.dex */
public class k0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 f150037a;

    public k0(com.p314xaae8f345.mm.p815xbe0af3c9.app.C10820x69adf850 c10820x69adf850) {
        this.f150037a = c10820x69adf850;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275193s.f275219a;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long[] jArr = (long[]) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "splash %s, %s, %s", java.lang.Long.valueOf(jArr[0]), java.lang.Long.valueOf(jArr[1]), java.lang.Long.valueOf(jArr[2]));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(jArr[0], jArr[1], jArr[2], false);
        }
        java.util.ArrayList arrayList2 = com.p314xaae8f345.mm.p2617xca9a2a67.j.f275193s.f275220b;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("processName", this.f150037a.f150020b);
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "splash message %s", str);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.i("NewSplash", str, hashMap);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeChatSplashStartup", "report splash info %s %s", java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(arrayList2.size()));
        return null;
    }
}
