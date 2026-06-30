package qi4;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final qi4.v f445321a = new qi4.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f445322b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f445323c = new java.util.LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static qi4.q f445324d = qi4.q.f445315e;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.CountDownLatch f445325e = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f445326f;

    static {
        new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, java.util.Locale.CHINA);
    }

    public final void a(java.lang.String userName, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        b();
        synchronized (this) {
            concurrentHashMap = f445322b;
            concurrentHashMap.remove(userName);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[deleteStatusInfoWithId] success, userName: " + userName + " statusId: " + str);
        }
        bw5.um0 m117490x103247b8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(userName, 0, 1, c01.id.c() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c);
        mj4.h hVar = null;
        if (m117490x103247b8 != null && m117490x103247b8.f115517d && m117490x103247b8.f115520g.size() > 0) {
            ai4.f fVar = ai4.f.f86672a;
            java.lang.Object obj = m117490x103247b8.f115520g.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            hVar = ai4.f.e(fVar, (bw5.sm0) obj, null, 2, null);
        }
        if (hVar != null) {
            synchronized (this) {
                concurrentHashMap.put(userName, hVar);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[deleteStatusInfoWithId] update, userName=");
            sb6.append(userName);
            sb6.append(" statusId:");
            mj4.k kVar = (mj4.k) hVar;
            sb6.append(kVar.o());
            sb6.append(" createTime: ");
            sb6.append(kVar.f408600b.f76512x81959a6e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", sb6.toString());
        }
    }

    public final void b() {
        if (f445326f) {
            return;
        }
        synchronized (this) {
            if (f445326f) {
                return;
            }
            qi4.p.f445309a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "activate: ");
            f445326f = true;
        }
    }

    public final boolean c(mj4.h hVar) {
        if (hVar == null) {
            return true;
        }
        mj4.k kVar = (mj4.k) hVar;
        if (kVar.w()) {
            return true;
        }
        qi4.p pVar = qi4.p.f445309a;
        int i17 = kVar.f408600b.f76512x81959a6e;
        pVar.getClass();
        return (((long) i17) * 1000) + ((long) com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c) < c01.id.c();
    }

    public final mj4.h d(java.lang.String userName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        ((ku5.t0) ku5.t0.f394148d).q(qi4.t.f445320d);
        java.util.HashMap hashMap = new java.util.HashMap();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this) {
            concurrentHashMap = f445322b;
            hashMap.putAll(concurrentHashMap);
        }
        java.util.Set set = f445323c;
        synchronized (set) {
            z17 = !set.contains(userName);
        }
        java.lang.Object obj = hashMap.get(userName);
        java.lang.Object obj2 = c((mj4.h) obj) ? null : obj;
        if (obj2 != null) {
            return (mj4.h) obj2;
        }
        if (z17) {
            b();
            bw5.um0 m117490x103247b8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117490x103247b8(userName, 0, 1, c01.id.c() - com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26672xc5b068cb.f56198x1c9ff21c);
            if (m117490x103247b8 != null && m117490x103247b8.f115517d && m117490x103247b8.f115520g.size() > 0) {
                ai4.f fVar = ai4.f.f86672a;
                java.lang.Object obj3 = m117490x103247b8.f115520g.get(0);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
                obj2 = ai4.f.e(fVar, (bw5.sm0) obj3, null, 2, null);
            }
            if (obj2 != null) {
                synchronized (this) {
                    concurrentHashMap.put(userName, obj2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[getLatestStatusByUserName] read aff success, userName=" + userName + ", cost =" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                return (mj4.h) obj2;
            }
        }
        synchronized (set) {
            set.add(userName);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[getLatestStatusByUserName] read failed, userName=" + userName + " enableAffQuery=" + z17);
        return null;
    }

    public final mj4.h e(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        return (mj4.h) f445322b.get(userName);
    }

    public final bw5.um0 f(bw5.sm0 sm0Var, mj4.h hVar) {
        int i17;
        if (sm0Var == null) {
            return null;
        }
        b();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[insertOrReplaceInfo] try check infoId = " + sm0Var.m12979xca73e223() + ", userName=" + sm0Var.e());
        bw5.um0 m117486xed349166 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27545x8281b564.m117475x9cf0d20b().m117486xed349166(sm0Var);
        if (hVar == null) {
            hVar = ai4.f.e(ai4.f.f86672a, sm0Var, null, 2, null);
        }
        int i18 = ((mj4.k) hVar).f408600b.f76512x81959a6e;
        if (m117486xed349166 == null || !m117486xed349166.f115517d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("StatusJVMCacheStorage", "[insertOrReplaceInfo] failed infoId = " + sm0Var.m12979xca73e223() + ", userName=" + sm0Var.e());
        } else {
            synchronized (this) {
                mj4.k kVar = (mj4.k) hVar;
                java.lang.String o17 = kVar.o();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f445322b;
                if (concurrentHashMap.contains(o17)) {
                    java.lang.Object obj = concurrentHashMap.get(kVar.o());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
                    i17 = ((mj4.k) ((mj4.h) obj)).f408600b.f76512x81959a6e;
                } else {
                    i17 = -1;
                }
                if (i18 >= i17) {
                    concurrentHashMap.put(o17, hVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[insertOrReplaceInfo] success infoId = " + sm0Var.m12979xca73e223() + ", userName=" + sm0Var.e() + ", createTime=" + i18 + ", cacheCreateTime=" + i17);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[insertOrReplaceInfo] abort, infoId = " + sm0Var.m12979xca73e223() + ", userName=" + sm0Var.e() + ", createTime=" + i18 + ", cacheCreateTime=" + i17);
                }
            }
        }
        return m117486xed349166;
    }

    public final void g(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        synchronized (this) {
        }
        java.util.Set set = f445323c;
        synchronized (set) {
            set.remove(userName);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("StatusJVMCacheStorage", "[invalidateCacheForUser] userName=".concat(userName));
    }
}
