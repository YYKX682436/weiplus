package com.tencent.mm.plugin.backup.roambackup;

@j95.b
/* loaded from: classes5.dex */
public final class p1 extends i95.w implements mv.y {

    /* renamed from: g, reason: collision with root package name */
    public boolean f92676g;

    /* renamed from: h, reason: collision with root package name */
    public pi0.l1 f92677h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f92673d = "MicroMsg.RoamBackupFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f92674e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f92675f = jz5.h.b(com.tencent.mm.plugin.backup.roambackup.w0.f92922d);

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f92678i = "";

    public static final void wi(com.tencent.mm.plugin.backup.roambackup.p1 p1Var, long j17, boolean z17) {
        java.lang.Object obj;
        p1Var.getClass();
        com.tencent.mm.plugin.backup.roambackup.o1 o1Var = new com.tencent.mm.plugin.backup.roambackup.o1(p1Var, z17, j17);
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        com.tencent.wechat.aff.affroam.g k17 = r0Var.k(j17);
        java.lang.String str = p1Var.f92673d;
        if (k17 == null) {
            com.tencent.mars.xlog.Log.w(str, "Fail to get package info by pkgId=" + j17 + ", try get all package from cgi.");
            java.util.Iterator it = r0Var.h(true).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.tencent.wechat.aff.affroam.g) obj).f215829d == j17) {
                        break;
                    }
                }
            }
            k17 = (com.tencent.wechat.aff.affroam.g) obj;
            if (k17 == null) {
                com.tencent.mars.xlog.Log.e(str, "Package info is not exist, pkgId=" + j17);
                o1Var.invoke();
                return;
            }
        }
        qo1.j1 j1Var = qo1.j1.f365523a;
        qo1.j0 d17 = j1Var.d(j17);
        if (!d17.e() && !d17.f()) {
            com.tencent.mars.xlog.Log.e(str, "[startTaskByPackageId] Fail to start a backup task, because a task is existed, pkgId=" + j17);
            o1Var.invoke();
            return;
        }
        if (d17.f()) {
            com.tencent.mars.xlog.Log.i(str, "[startTaskByPackageId] Remove previous task. pkgId=" + j17);
            j1Var.e(j17, false);
        }
        if (z17 && j1Var.g(k17) != qo1.d1.f365463d) {
            com.tencent.mars.xlog.Log.e(str, "[startTaskByPackageId] Fail to launch task, pkgId=" + j17);
            o1Var.invoke();
            return;
        }
        android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.class);
        intent.addFlags(268435456);
        intent.putExtra("packageId", j17);
        intent.putExtra("dummyAsRestore", !z17);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService", "startTaskByPackageId", "(JZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService", "startTaskByPackageId", "(JZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI.f92696s;
        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI.f92696s;
        com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI createRoamLitePkgUI = weakReference2 != null ? (com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI) weakReference2.get() : null;
        if (createRoamLitePkgUI != null) {
            createRoamLitePkgUI.finish();
        }
    }

    public void Ai() {
        com.tencent.mm.plugin.backup.roambackup.l2 l2Var = com.tencent.mm.plugin.backup.roambackup.l2.f92644a;
        if (!com.tencent.mm.plugin.backup.roambackup.l2.f92645b) {
            com.tencent.mars.xlog.Log.i(this.f92673d, "skip cancelDowngrade: isInit=false");
            return;
        }
        e42.c0 c0Var = e42.c0.clicfg_roam_enable_downgrade;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (ih.a.e(c0Var, com.tencent.mars.xlog.Log.getLogLevel() <= 1)) {
            com.tencent.mars.xlog.Log.i(this.f92673d, "cancelDowngrade");
            com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().n(com.tencent.wechat.aff.affroam.k0.kDefault);
        }
    }

    public void Bi() {
        com.tencent.mm.plugin.backup.roambackup.l2 l2Var = com.tencent.mm.plugin.backup.roambackup.l2.f92644a;
        if (!com.tencent.mm.plugin.backup.roambackup.l2.f92645b) {
            com.tencent.mars.xlog.Log.i(this.f92673d, "skip downgrade: isInit=false");
            return;
        }
        e42.c0 c0Var = e42.c0.clicfg_roam_enable_downgrade;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (ih.a.e(c0Var, com.tencent.mars.xlog.Log.getLogLevel() <= 1)) {
            com.tencent.mars.xlog.Log.i(this.f92673d, "downgrade");
            com.tencent.mm.plugin.backup.roambackup.u.f92737a.d().n(com.tencent.wechat.aff.affroam.k0.kShouldDowngrade);
        }
    }

    public void Di(java.lang.String funcName, java.lang.String args) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mars.xlog.Log.i(this.f92673d, "[generalNotifyPc] funcName=" + funcName + ", args=" + pm0.v.e0(args, 0, 100));
        c01.d9.e().g(new com.tencent.mm.modelsimple.g1("weixin", 23, funcName, args));
    }

    public void Ni(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i(this.f92673d, "[handleStatusNotify] params: name=" + str + ", args=" + str2);
        if (str == null || str2 == null) {
            return;
        }
        if (c01.z1.x()) {
            com.tencent.mars.xlog.Log.w(this.f92673d, "[handleStatusNotify] Skip notify because currently logged in as exDevice");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.backup.roambackup.e1(str, this, str2));
    }

    public boolean Ri() {
        if (!Ui()) {
            return false;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_unify_roam_enable_load_media, false);
    }

    public boolean Ui() {
        return ((java.lang.Boolean) ((jz5.n) this.f92675f).getValue()).booleanValue();
    }

    public void Vi(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.backup.roambackup.l2.f92644a.a();
        if (Ui()) {
            aj(context, null, mv.b0.f331477e);
            return;
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (qo1.j1.f365523a.b(new com.tencent.mm.plugin.backup.roambackup.k1(h0Var)) <= 0 || h0Var.f310123d == null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getString(com.tencent.mm.R.string.f490686aa1));
            intent.putExtra("rawUrl", context.getString(com.tencent.mm.R.string.abd, com.tencent.mm.sdk.platformtools.m2.d()));
            intent.putExtra("showShare", false);
            intent.putExtra("neverGetA8Key", true);
            if (!(context instanceof android.app.Activity)) {
                intent.setFlags(268435456);
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            return;
        }
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.class);
        if (!(context instanceof android.app.Activity)) {
            intent2.addFlags(268435456);
        }
        java.lang.Object obj = h0Var.f310123d;
        kotlin.jvm.internal.o.d(obj);
        intent2.putExtra("packageId", ((qo1.j0) obj).a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService", "openHomePage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService", "openHomePage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Zi(android.content.Context context, java.util.Map args) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(args, "args");
        com.tencent.mm.plugin.backup.roambackup.l2.f92644a.b();
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new com.tencent.mm.plugin.backup.roambackup.l1(this, args, context, null), 3, null);
    }

    public void aj(android.content.Context context, java.util.Map map, mv.b0 jumpType) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpType, "jumpType");
        com.tencent.mars.xlog.Log.i(this.f92673d, "openPageFromHome: args=" + map + " jumpType=" + jumpType);
        if (map != null) {
            map.put("jumpType", java.lang.Integer.valueOf(jumpType.f331482d));
        }
        mv.b0 b0Var = mv.b0.f331477e;
        Zi(context, kz5.c1.j(new jz5.l("home", map)));
    }

    public void bj(java.lang.String identity, java.lang.String deviceId, long j17, yz5.l cb6) {
        kotlin.jvm.internal.o.g(identity, "identity");
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(cb6, "cb");
        if (Ui()) {
            if (j17 <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT && identity.length() <= 0) {
            }
            this.f92674e.put(identity, new jz5.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), cb6));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("curBindId", identity);
            jSONObject.put("deviceId", deviceId);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            Di("bindId", jSONObject2);
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.backup.roambackup.n1 n1Var = new com.tencent.mm.plugin.backup.roambackup.n1(this, identity);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.t(n1Var, j17, null);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i(this.f92673d, "onAccountInitialized");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i(this.f92673d, "cleanWild");
            ((ku5.t0) ku5.t0.f312615d).q(com.tencent.mm.plugin.backup.roambackup.h1.f92617d);
        }
        com.tencent.mm.plugin.backup.roambackup.l2 l2Var = com.tencent.mm.plugin.backup.roambackup.l2.f92644a;
        l2Var.a();
        if (Ui()) {
            l2Var.b();
        }
        ((uz.a) ((vz.f1) i95.n0.c(vz.f1.class))).getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i(this.f92673d, "onAccountReleased");
        com.tencent.mm.plugin.backup.roambackup.l2 l2Var = com.tencent.mm.plugin.backup.roambackup.l2.f92644a;
        synchronized (l2Var) {
            if (com.tencent.mm.plugin.backup.roambackup.l2.f92646c) {
                com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "unInitialize roam backup");
                if (com.tencent.mm.plugin.backup.roambackup.l2.f92649f.compareAndSet(true, false)) {
                    com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "unregister auto backup trigger listener");
                    com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(com.tencent.mm.plugin.backup.roambackup.l2.f92650g);
                    com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.removeLifecycleCallback(com.tencent.mm.plugin.backup.roambackup.l2.f92651h);
                }
                ro1.t tVar = ro1.t.f398008d;
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                context2.unregisterReceiver(ro1.t.f398011g);
                com.tencent.mm.plugin.backup.roambackup.l2.f92646c = false;
            }
        }
        synchronized (l2Var) {
            if (com.tencent.mm.plugin.backup.roambackup.l2.f92645b) {
                com.tencent.mars.xlog.Log.i("MM.RoamBackup.RoamServiceInitializer", "do basic uninit");
                com.tencent.mm.plugin.backup.roambackup.l2.f92645b = false;
            }
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        ((com.tencent.mm.feature.performance.adpf.s0) ((ob0.f) i95.n0.c(ob0.f.class))).Di(new ob0.d() { // from class: com.tencent.mm.plugin.backup.roambackup.RoamBackupFeatureService$onCreate$1
            {
                super("RoamBackup");
            }

            @Override // ob0.d
            public void onResume() {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.backup.roambackup.p1.this.f92673d, "could resume");
                com.tencent.mm.plugin.backup.roambackup.p1.this.getClass();
                boolean z17 = false;
                if (com.tencent.mm.sdk.platformtools.x2.n() && (!gm0.j1.a() || w11.a1.b())) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.backup.roambackup.p1.this.f92673d, "skip onResume: NewSyncMgr.needInit");
                    return;
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.backup.roambackup.p1 p1Var = com.tencent.mm.plugin.backup.roambackup.p1.this;
                ((ku5.t0) u0Var).h(new com.tencent.mm.plugin.backup.roambackup.i1(p1Var), p1Var.f92673d);
            }

            @Override // ob0.d
            public void onSuspend() {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.backup.roambackup.p1.this.f92673d, "should downgrade");
                com.tencent.mm.plugin.backup.roambackup.p1.this.getClass();
                boolean z17 = false;
                if (com.tencent.mm.sdk.platformtools.x2.n() && (!gm0.j1.a() || w11.a1.b())) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.backup.roambackup.p1.this.f92673d, "skip onSuspend: NewSyncMgr.needInit");
                    return;
                }
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.backup.roambackup.p1 p1Var = com.tencent.mm.plugin.backup.roambackup.p1.this;
                ((ku5.t0) u0Var).h(new com.tencent.mm.plugin.backup.roambackup.j1(p1Var), p1Var.f92673d);
            }
        });
    }
}
