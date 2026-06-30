package e00;

/* loaded from: classes8.dex */
public final class e implements c00.y2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f327286a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(10);

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f327287b = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(10);

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f327288c = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(10);

    public bw5.x7 a(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "getValidJumpInfoCache of key ".concat(key));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f327288c;
        e00.b bVar = (e00.b) r2Var.get(key);
        if (bVar == null) {
            return null;
        }
        if ((java.lang.System.currentTimeMillis() / 1000) - bVar.f327272b <= 180) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "getValidJumpInfoCache success");
            return bVar.f327271a;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "getValidJumpInfoCache out of time");
        r2Var.m77803xc84af884(key);
        return null;
    }

    public void b(bw5.x7 x7Var, java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = this.f327288c;
        if (x7Var == null) {
            r2Var.m77803xc84af884(key);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "remove jumpInfo cache for key: ".concat(key));
            return;
        }
        e00.b bVar = new e00.b(x7Var, java.lang.System.currentTimeMillis() / 1000);
        r2Var.put(key, bVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Ecs.DefaultEcsCardInfoCacheStrategy", "updateJumpInfoCache for key" + key + " when:" + bVar.f327272b);
    }
}
