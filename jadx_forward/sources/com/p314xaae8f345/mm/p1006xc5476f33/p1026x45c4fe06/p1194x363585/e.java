package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585;

@j95.b
/* loaded from: classes7.dex */
public final class e extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f170544d = new java.util.concurrent.ConcurrentHashMap();

    public static void Bi(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e eVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            c12362x460991bc = null;
        }
        eVar.getClass();
        if (str == null || str.length() == 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchParcelStoreService", "[" + eVar.hashCode() + "]remove(instanceId:" + str + ')');
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = eVar.f170544d;
        if (c12362x460991bc != null) {
            concurrentHashMap.remove(str, c12362x460991bc);
        } else {
            concurrentHashMap.remove(str);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc Ai(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc) this.f170544d.get(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]get(instanceId:");
        sb6.append(str);
        sb6.append("), return?");
        sb6.append(c12362x460991bc != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchParcelStoreService", sb6.toString());
        return c12362x460991bc;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchParcelStoreService", "[" + hashCode() + "]onAccountReleased");
        this.f170544d.clear();
    }

    public final void wi(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc) {
        if ((str == null || str.length() == 0) || c12362x460991bc == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandLaunchParcelStoreService", "[" + hashCode() + "]add(instanceId:" + str + ')');
        this.f170544d.put(str, c12362x460991bc);
    }
}
