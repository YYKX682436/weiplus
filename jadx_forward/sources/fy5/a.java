package fy5;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static fy5.a f348795b;

    /* renamed from: a, reason: collision with root package name */
    public final gy5.a f348796a;

    public a(android.content.Context context, hy5.b bVar) {
        ky5.b.f395168a = context;
        if (gy5.a.f359167e != null) {
            throw new java.lang.RuntimeException("tinker server client is already init");
        }
        if (gy5.a.f359167e == null) {
            synchronized (iy5.a.class) {
                if (gy5.a.f359167e == null) {
                    gy5.a.f359167e = new gy5.a(bVar);
                }
            }
        }
        this.f348796a = gy5.a.f359167e;
    }

    public static fy5.a d() {
        fy5.a aVar = f348795b;
        if (aVar != null) {
            return aVar;
        }
        throw new java.lang.RuntimeException("you must init TinkerClient sdk first");
    }

    public fy5.a a(final boolean z17) {
        if (this.f348796a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerClient", "fetchPatchUpdate, tinkerServerClient, just return");
            return f348795b;
        }
        android.content.Context a17 = ky5.b.a();
        if (!((a17.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) && (a17.checkSelfPermission("android.permission.INTERNET") == 0))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerClient", "fetchPatchUpdate, permission refuse, you must access INTERNET and ACCESS_NETWORK_STATE permission first");
            return f348795b;
        }
        if (!ak0.o.g()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerClient", "fetchPatchUpdate, tinker is disable, just return");
            return f348795b;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            android.os.Looper.getMainLooper();
            android.os.Looper.myQueue().addIdleHandler(new android.os.MessageQueue.IdleHandler() { // from class: fy5.a$$a
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    gy5.a aVar = fy5.a.this.f348796a;
                    aVar.getClass();
                    android.content.SharedPreferences sharedPreferences = ky5.b.a().getSharedPreferences("patch_server_config", 0);
                    long j17 = sharedPreferences.getLong("fetch_patch_last_check", 0L);
                    if (j17 == -1) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.ServerClient", "tinker sync is disabled, with never check flag!");
                    } else {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                        if (!z17 && !aVar.f359171d) {
                            long j18 = aVar.f359169b;
                            if (currentTimeMillis < j18) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.ServerClient", "tinker sync should wait interval %ss", java.lang.Long.valueOf((j18 - currentTimeMillis) / 1000));
                            }
                        }
                        sharedPreferences.edit().putLong("fetch_patch_last_check", java.lang.System.currentTimeMillis()).commit();
                        hy5.b bVar = aVar.f359168a;
                        iy5.a aVar2 = aVar.f359170c;
                        aVar2.getClass();
                        if (bVar == null) {
                            throw new java.lang.RuntimeException("callback can't be null");
                        }
                        if (bVar.a()) {
                            bVar.c();
                            bVar.b(aVar2.f377571a.f384086a);
                        }
                    }
                    return false;
                }
            });
        }
        return f348795b;
    }

    public fy5.a b(int i17) {
        gy5.a aVar = this.f348796a;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerClient", "setFetchPatchIntervalByHours, tinkerServerClient == null, just return");
            return f348795b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerClient", "setFetchPatchIntervalByHours to %d hours", java.lang.Integer.valueOf(i17));
        aVar.getClass();
        long j17 = i17;
        if (j17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.ServerClient", "Warning, disableFetchPatchUpdate");
            ky5.b.a().getSharedPreferences("patch_server_config", 0).edit().putLong("fetch_patch_last_check", -1L).commit();
        } else {
            if (i17 < 0 || i17 > 24) {
                throw new java.lang.RuntimeException("hours must be between 0 and 24");
            }
            aVar.f359169b = j17 * 3600 * 1000;
        }
        return f348795b;
    }

    public fy5.a c(java.lang.String str, java.lang.String str2) {
        gy5.a aVar = this.f348796a;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.TinkerClient", "setPatchCondition, tinkerServerClient == null, just return");
            return f348795b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.TinkerClient", "setPatchCondition %s with value %s", str, str2);
        ((java.util.HashMap) aVar.f359170c.f377571a.f384086a).put(str, str2);
        return f348795b;
    }
}
