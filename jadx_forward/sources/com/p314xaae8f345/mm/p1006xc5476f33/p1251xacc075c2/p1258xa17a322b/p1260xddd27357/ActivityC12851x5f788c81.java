package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lio1/c;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI */
/* loaded from: classes5.dex */
public final class ActivityC12851x5f788c81 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements io1.c {

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.ref.WeakReference f174245o;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174247e;

    /* renamed from: f, reason: collision with root package name */
    public em.d4 f174248f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f174249g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f174250h;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ObjectAnimator f174253n;

    /* renamed from: d, reason: collision with root package name */
    public long f174246d = -1;

    /* renamed from: i, reason: collision with root package name */
    public mo1.a f174251i = mo1.a.f411795d;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f174252m = jz5.h.b(new mo1.i0(this));

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x018f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object U6(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81 r16, qo1.j0 r17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 r18, qo1.i0 r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12851x5f788c81.U6(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI, qo1.j0, com.tencent.wechat.aff.affroam.n0, qo1.i0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        if (this.f174246d == task.f447016i) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", "onProgressChanged, pkgId=" + this.f174246d + ", percentage = " + f17);
            p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(this), null, null, new mo1.m0(this, task, f17, null), 3, null);
        }
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0 state, qo1.i0 error) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        if (this.f174246d == task.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", "onTaskStateChanged, pkgId=" + this.f174246d + ", status=" + state);
            p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(this), null, null, new mo1.n0(this, task, state, error, null), 3, null);
        }
    }

    public final void V6() {
        finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559262q, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    public final int W6(qo1.j0 j0Var) {
        return ((j0Var instanceof qo1.c1) || (this.f174249g && (j0Var instanceof qo1.g0))) ? j0Var.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f78107x3b597091 : com.p314xaae8f345.mm.R.C30861xcebc809e.f78106xb97f2cdb : j0Var.b() ? com.p314xaae8f345.mm.R.C30861xcebc809e.f78068x5769ab60 : com.p314xaae8f345.mm.R.C30861xcebc809e.f78067x126befea;
    }

    public final java.lang.String X6(qo1.j0 j0Var) {
        if ((j0Var instanceof qo1.g0) && this.f174249g) {
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
            return com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b;
        }
        if (j0Var instanceof qo1.c1) {
            java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
            return com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b;
        }
        java.lang.String str3 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
        return com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
    }

    public final void Y6(java.lang.String str, int i17, long j17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put("packageId", j17);
        mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1) yVar).Di(str, jSONObject2);
    }

    public final qo1.d1 Z6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPermissionAndStartTask, pkgId=");
        sb6.append(gVar.f297362d);
        sb6.append(", convList.size=");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", sb6.toString());
        qo1.d1 g17 = list == null ? qo1.j1.f447056a.g(gVar) : qo1.j1.f447056a.h(gVar, list);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", "[checkPermissionAndStartTask] result = " + g17 + ", pkgId=" + this.f174246d + '.');
        this.f174250h = true;
        int ordinal = g17.ordinal();
        if (ordinal == 0) {
            this.f174250h = false;
            qo1.j0 d17 = qo1.j1.f447056a.d(gVar.f297362d);
            if (d17 instanceof qo1.v0) {
                qo1.v0 v0Var = (qo1.v0) d17;
                if (v0Var.f447009b == com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) {
                    v0Var.f447090x = true;
                }
            }
            return g17;
        }
        int i17 = com.p314xaae8f345.mm.R.C30867xcad56011.n0p;
        if (ordinal != 1) {
            if (ordinal == 2) {
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.n0q;
            } else if (ordinal != 3) {
                throw new jz5.j();
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(mo55332x76847179);
        e4Var.d(i17);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79770xc84f57c6);
        e4Var.c();
        return g17;
    }

    public final java.lang.Object a7(qo1.f0 f0Var, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.a2 a2Var = f0Var.f447012e;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (a2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", "fail to get roamTask by pkgId=" + new java.lang.Long(f0Var.f447016i));
            return f0Var2;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.p0 c17 = a2Var.c();
        if (f17 < 0.0f) {
            f17 = a2Var.b();
        }
        int i17 = (int) (f17 * 100);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        java.lang.String b17 = fo1.r.b(c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", "updateProgress, progress = " + i17 + ", hint = " + b17);
        em.d4 d4Var = this.f174248f;
        if (d4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        d4Var.d().setText(b17);
        android.animation.ObjectAnimator objectAnimator = this.f174253n;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        em.d4 d4Var2 = this.f174248f;
        if (d4Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.ProgressBar g17 = d4Var2.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getStatusProgress(...)");
        if (g17.getProgress() <= 0 || i17 - g17.getProgress() <= 2.0f) {
            g17.setProgress(i17);
        } else {
            android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(g17, "progress", g17.getProgress(), i17);
            if (i17 < 90) {
                ofInt.setDuration(1000L);
            } else {
                ofInt.setDuration((java.lang.Math.max(100 - i17, 0) * 50) + 100);
            }
            ofInt.start();
            this.f174253n = ofInt;
        }
        return f0Var2;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.eqc;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 126 && i18 == -1) {
            if (!(intent == null)) {
                java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Select_Contact");
                if (stringArrayExtra == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MM.Roam.RoamLiteTaskDetailUI", "result is null");
                    return;
                }
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174247e;
                if (gVar != null) {
                    Z6(gVar, kz5.z.z0(stringArrayExtra));
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pkgInfo");
                    throw null;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("skip for invalid data, reqCode=");
        sb6.append(i17);
        sb6.append(", resultCode=");
        sb6.append(i18);
        sb6.append(", dataIsNull=");
        sb6.append(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Roam.RoamLiteTaskDetailUI", sb6.toString());
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        mo1.a aVar = this.f174251i;
        if (aVar == mo1.a.f411795d) {
            return;
        }
        if (aVar == mo1.a.f411796e) {
            Y6(this.f174249g ? "roamLiteStartRestoreResult" : "roamLiteStartBackupResult", 1, this.f174246d);
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        f174245o = new java.lang.ref.WeakReference(this);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.v1.f174447a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        if (!v1Var.a(mo55332x76847179, new mo1.j0(this))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Roam.RoamLiteTaskDetailUI", "onCreate, can not backup ");
        }
        onNewIntent(getIntent());
        getWindow().addFlags(128);
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.ofb);
        m78563x4e0f6657(false);
        mo74406x9c8c0d33(new mo1.k0(this), com.p314xaae8f345.mm.R.raw.f78354xfa054953);
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.a7l), new mo1.l0(this), null, com.p314xaae8f345.mm.ui.fb.GREEN);
        m78560xe21cbbf(false);
        mo74407xb0dfae51(0, false);
        this.f174248f = new em.d4(m78513xc2a54588());
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f174250h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Roam.RoamLiteTaskDetailUI", "[onDestroy] Fail to launch task, pkgId=" + this.f174246d + ", dummyAsRestore=" + this.f174249g);
            Y6("roamLiteStartRestoreResult", 2, this.f174246d);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra("packageId", -1L);
        this.f174246d = longExtra;
        if (longExtra < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Roam.RoamLiteTaskDetailUI", "Invalid packageId = " + this.f174246d);
            V6();
            return;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.k(longExtra);
        if (k17 != null) {
            this.f174247e = k17;
            this.f174249g = intent.getBooleanExtra("dummyAsRestore", false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Roam.RoamLiteTaskDetailUI", "Fail to get package by packageId=" + this.f174246d);
            V6();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        r0Var.p(this);
        r0Var.e(true);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a;
        r0Var.b(this);
        qo1.j0 d17 = qo1.j1.f447056a.d(this.f174246d);
        jz5.l d18 = d17.d();
        p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(this), null, null, new mo1.o0(this, d17, (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.n0) d18.f384366d, (qo1.i0) d18.f384367e, null), 3, null);
        r0Var.e(false);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
    /* renamed from: supportNavigationSwipeBack */
    public boolean mo52922x430f73e() {
        return false;
    }
}
