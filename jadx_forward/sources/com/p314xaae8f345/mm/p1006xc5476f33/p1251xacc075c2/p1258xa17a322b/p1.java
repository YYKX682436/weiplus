package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

@j95.b
/* loaded from: classes5.dex */
public final class p1 extends i95.w implements mv.y {

    /* renamed from: g, reason: collision with root package name */
    public boolean f174209g;

    /* renamed from: h, reason: collision with root package name */
    public pi0.l1 f174210h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f174206d = "MicroMsg.RoamBackupFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f174207e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f174208f = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w0.f174455d);

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f174211i = "";

    public static final void wi(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var, long j17, boolean z17) {
        java.lang.Object obj;
        p1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.o1(p1Var, z17, j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = r0Var.k(j17);
        java.lang.String str = p1Var.f174206d;
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "Fail to get package info by pkgId=" + j17 + ", try get all package from cgi.");
            java.util.Iterator it = r0Var.h(true).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj).f297362d == j17) {
                        break;
                    }
                }
            }
            k17 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g) obj;
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "Package info is not exist, pkgId=" + j17);
                o1Var.mo152xb9724478();
                return;
            }
        }
        qo1.j1 j1Var = qo1.j1.f447056a;
        qo1.j0 d17 = j1Var.d(j17);
        if (!d17.e() && !d17.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[startTaskByPackageId] Fail to start a backup task, because a task is existed, pkgId=" + j17);
            o1Var.mo152xb9724478();
            return;
        }
        if (d17.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[startTaskByPackageId] Remove previous task. pkgId=" + j17);
            j1Var.e(j17, false);
        }
        if (z17 && j1Var.g(k17) != qo1.d1.f446996d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[startTaskByPackageId] Fail to launch task, pkgId=" + j17);
            o1Var.mo152xb9724478();
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.class);
        intent.addFlags(268435456);
        intent.putExtra("packageId", j17);
        intent.putExtra("dummyAsRestore", !z17);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService", "startTaskByPackageId", "(JZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService", "startTaskByPackageId", "(JZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d.f174229s;
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d.f174229s;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d activityC12849xeea2846d = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d) weakReference2.get() : null;
        if (activityC12849xeea2846d != null) {
            activityC12849xeea2846d.finish();
        }
    }

    public void Ai() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174177a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174178b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "skip cancelDowngrade: isInit=false");
            return;
        }
        e42.c0 c0Var = e42.c0.clicfg_roam_enable_downgrade;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (ih.a.e(c0Var, com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "cancelDowngrade");
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().n(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k0.kDefault);
        }
    }

    public void Bi() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174177a;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174178b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "skip downgrade: isInit=false");
            return;
        }
        e42.c0 c0Var = e42.c0.clicfg_roam_enable_downgrade;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (ih.a.e(c0Var, com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "downgrade");
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().n(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k0.kShouldDowngrade);
        }
    }

    public void Di(java.lang.String funcName, java.lang.String args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(funcName, "funcName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "[generalNotifyPc] funcName=" + funcName + ", args=" + pm0.v.e0(args, 0, 100));
        c01.d9.e().g(new com.p314xaae8f345.mm.p957x53236a1b.g1("weixin", 23, funcName, args));
    }

    public void Ni(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "[handleStatusNotify] params: name=" + str + ", args=" + str2);
        if (str == null || str2 == null) {
            return;
        }
        if (c01.z1.x()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f174206d, "[handleStatusNotify] Skip notify because currently logged in as exDevice");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.e1(str, this, str2));
    }

    public boolean Ri() {
        if (!Ui()) {
            return false;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_unify_roam_enable_load_media, false);
    }

    public boolean Ui() {
        return ((java.lang.Boolean) ((jz5.n) this.f174208f).mo141623x754a37bb()).booleanValue();
    }

    public void Vi(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174177a.a();
        if (Ui()) {
            aj(context, null, mv.b0.f413010e);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        if (qo1.j1.f447056a.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.k1(h0Var)) <= 0 || h0Var.f391656d == null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572219aa1));
            intent.putExtra("rawUrl", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.abd, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", true);
            if (!(context instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.class);
        if (!(context instanceof android.app.Activity)) {
            intent2.addFlags(268435456);
        }
        java.lang.Object obj = h0Var.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        intent2.putExtra("packageId", ((qo1.j0) obj).a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService", "openHomePage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService", "openHomePage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Zi(android.content.Context context, java.util.Map args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174177a.b();
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l1(this, args, context, null), 3, null);
    }

    public void aj(android.content.Context context, java.util.Map map, mv.b0 jumpType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpType, "jumpType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "openPageFromHome: args=" + map + " jumpType=" + jumpType);
        if (map != null) {
            map.put("jumpType", java.lang.Integer.valueOf(jumpType.f413015d));
        }
        mv.b0 b0Var = mv.b0.f413010e;
        Zi(context, kz5.c1.j(new jz5.l("home", map)));
    }

    public void bj(java.lang.String identity, java.lang.String deviceId, long j17, yz5.l cb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(identity, "identity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cb6, "cb");
        if (Ui()) {
            if (j17 <= com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d && identity.length() <= 0) {
            }
            this.f174207e.put(identity, new jz5.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), cb6));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("curBindId", identity);
            jSONObject.put("deviceId", deviceId);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            Di("bindId", jSONObject2);
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.n1(this, identity);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(n1Var, j17, null);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "onAccountInitialized");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "cleanWild");
            ((ku5.t0) ku5.t0.f394148d).q(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.h1.f174150d);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174177a;
        l2Var.a();
        if (Ui()) {
            l2Var.b();
        }
        ((uz.a) ((vz.f1) i95.n0.c(vz.f1.class))).getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f174206d, "onAccountReleased");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2 l2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174177a;
        synchronized (l2Var) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174179c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "unInitialize roam backup");
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174182f.compareAndSet(true, false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "unregister auto backup trigger listener");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174183g);
                    com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495.mo40976xa01141ab(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174184h);
                }
                ro1.t tVar = ro1.t.f479541d;
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                context2.unregisterReceiver(ro1.t.f479544g);
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174179c = false;
            }
        }
        synchronized (l2Var) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174178b) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.RoamBackup.RoamServiceInitializer", "do basic uninit");
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l2.f174178b = false;
            }
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Di(new ob0.d() { // from class: com.tencent.mm.plugin.backup.roambackup.RoamBackupFeatureService$onCreate$1
            {
                super("RoamBackup");
            }

            @Override // ob0.d
            /* renamed from: onResume */
            public void mo46781x57429eec() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.this.f174206d, "could resume");
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.this.getClass();
                boolean z17 = false;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (!gm0.j1.a() || w11.a1.b())) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.this.f174206d, "skip onResume: NewSyncMgr.needInit");
                    return;
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.this;
                ((ku5.t0) u0Var).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.i1(p1Var), p1Var.f174206d);
            }

            @Override // ob0.d
            /* renamed from: onSuspend */
            public void mo46783xe142a15d() {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.this.f174206d, "should downgrade");
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.this.getClass();
                boolean z17 = false;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (!gm0.j1.a() || w11.a1.b())) {
                    z17 = true;
                }
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.this.f174206d, "skip onSuspend: NewSyncMgr.needInit");
                    return;
                }
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1 p1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1.this;
                ((ku5.t0) u0Var).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.j1(p1Var), p1Var.f174206d);
            }
        });
    }
}
