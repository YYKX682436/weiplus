package com.tencent.mm.plugin.backup.roambackup.roamlite;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/roamlite/RoamLiteTaskDetailUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lio1/c;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoamLiteTaskDetailUI extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity implements io1.c {

    /* renamed from: o, reason: collision with root package name */
    public static java.lang.ref.WeakReference f92712o;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.wechat.aff.affroam.g f92714e;

    /* renamed from: f, reason: collision with root package name */
    public em.d4 f92715f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f92716g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f92717h;

    /* renamed from: n, reason: collision with root package name */
    public android.animation.ObjectAnimator f92720n;

    /* renamed from: d, reason: collision with root package name */
    public long f92713d = -1;

    /* renamed from: i, reason: collision with root package name */
    public mo1.a f92718i = mo1.a.f330262d;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f92719m = jz5.h.b(new mo1.i0(this));

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
    public static final java.lang.Object U6(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI r16, qo1.j0 r17, com.tencent.wechat.aff.affroam.n0 r18, qo1.i0 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.U6(com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI, qo1.j0, com.tencent.wechat.aff.affroam.n0, qo1.i0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // io1.c
    public void P5(qo1.f0 task, float f17) {
        kotlin.jvm.internal.o.g(task, "task");
        if (this.f92713d == task.f365483i) {
            com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "onProgressChanged, pkgId=" + this.f92713d + ", percentage = " + f17);
            kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new mo1.m0(this, task, f17, null), 3, null);
        }
    }

    @Override // io1.c
    public void V1(qo1.j0 task, com.tencent.wechat.aff.affroam.n0 state, qo1.i0 error) {
        kotlin.jvm.internal.o.g(task, "task");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(error, "error");
        if (this.f92713d == task.a()) {
            com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "onTaskStateChanged, pkgId=" + this.f92713d + ", status=" + state);
            kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new mo1.n0(this, task, state, error, null), 3, null);
        }
    }

    public final void V6() {
        finish();
        overridePendingTransition(com.tencent.mm.R.anim.f477729q, com.tencent.mm.R.anim.f477855dd);
    }

    public final int W6(qo1.j0 j0Var) {
        return ((j0Var instanceof qo1.c1) || (this.f92716g && (j0Var instanceof qo1.g0))) ? j0Var.b() ? com.tencent.mm.R.drawable.icon_restore_from_computer_doing : com.tencent.mm.R.drawable.icon_restore_from_computer_default : j0Var.b() ? com.tencent.mm.R.drawable.icon_backup_to_computer_doing : com.tencent.mm.R.drawable.icon_backup_to_computer_default;
    }

    public final java.lang.String X6(qo1.j0 j0Var) {
        if ((j0Var instanceof qo1.g0) && this.f92716g) {
            java.lang.String str = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
            return com.tencent.mm.plugin.backup.roambackup.w1.f92924b;
        }
        if (j0Var instanceof qo1.c1) {
            java.lang.String str2 = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
            return com.tencent.mm.plugin.backup.roambackup.w1.f92924b;
        }
        java.lang.String str3 = com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
        return com.tencent.mm.plugin.backup.roambackup.w1.f92923a;
    }

    public final void Y6(java.lang.String str, int i17, long j17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put("packageId", j17);
        mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        ((com.tencent.mm.plugin.backup.roambackup.p1) yVar).Di(str, jSONObject2);
    }

    public final qo1.d1 Z6(com.tencent.wechat.aff.affroam.g gVar, java.util.List list) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPermissionAndStartTask, pkgId=");
        sb6.append(gVar.f215829d);
        sb6.append(", convList.size=");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", sb6.toString());
        qo1.d1 g17 = list == null ? qo1.j1.f365523a.g(gVar) : qo1.j1.f365523a.h(gVar, list);
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "[checkPermissionAndStartTask] result = " + g17 + ", pkgId=" + this.f92713d + '.');
        this.f92717h = true;
        int ordinal = g17.ordinal();
        if (ordinal == 0) {
            this.f92717h = false;
            qo1.j0 d17 = qo1.j1.f365523a.d(gVar.f215829d);
            if (d17 instanceof qo1.v0) {
                qo1.v0 v0Var = (qo1.v0) d17;
                if (v0Var.f365476b == com.tencent.wechat.aff.affroam.o0.AFFROAM_TASK_TYPE_AUTO_BACKUP) {
                    v0Var.f365557x = true;
                }
            }
            return g17;
        }
        int i17 = com.tencent.mm.R.string.n0p;
        if (ordinal != 1) {
            if (ordinal == 2) {
                i17 = com.tencent.mm.R.string.n0q;
            } else if (ordinal != 3) {
                throw new jz5.j();
            }
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.d(i17);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
        return g17;
    }

    public final java.lang.Object a7(qo1.f0 f0Var, float f17, kotlin.coroutines.Continuation continuation) {
        com.tencent.wechat.aff.affroam.a2 a2Var = f0Var.f365479e;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (a2Var == null) {
            com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "fail to get roamTask by pkgId=" + new java.lang.Long(f0Var.f365483i));
            return f0Var2;
        }
        com.tencent.wechat.aff.affroam.p0 c17 = a2Var.c();
        if (f17 < 0.0f) {
            f17 = a2Var.b();
        }
        int i17 = (int) (f17 * 100);
        kotlin.jvm.internal.o.d(c17);
        java.lang.String b17 = fo1.r.b(c17);
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", "updateProgress, progress = " + i17 + ", hint = " + b17);
        em.d4 d4Var = this.f92715f;
        if (d4Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        d4Var.d().setText(b17);
        android.animation.ObjectAnimator objectAnimator = this.f92720n;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
        em.d4 d4Var2 = this.f92715f;
        if (d4Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        android.widget.ProgressBar g17 = d4Var2.g();
        kotlin.jvm.internal.o.f(g17, "getStatusProgress(...)");
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
            this.f92720n = ofInt;
        }
        return f0Var2;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eqc;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 126 && i18 == -1) {
            if (!(intent == null)) {
                java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Select_Contact");
                if (stringArrayExtra == null) {
                    com.tencent.mars.xlog.Log.w("MM.Roam.RoamLiteTaskDetailUI", "result is null");
                    return;
                }
                com.tencent.wechat.aff.affroam.g gVar = this.f92714e;
                if (gVar != null) {
                    Z6(gVar, kz5.z.z0(stringArrayExtra));
                    return;
                } else {
                    kotlin.jvm.internal.o.o("pkgInfo");
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
        com.tencent.mars.xlog.Log.i("MM.Roam.RoamLiteTaskDetailUI", sb6.toString());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        mo1.a aVar = this.f92718i;
        if (aVar == mo1.a.f330262d) {
            return;
        }
        if (aVar == mo1.a.f330263e) {
            Y6(this.f92716g ? "roamLiteStartRestoreResult" : "roamLiteStartBackupResult", 1, this.f92713d);
        }
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        f92712o = new java.lang.ref.WeakReference(this);
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477729q);
        com.tencent.mm.plugin.backup.roambackup.v1 v1Var = com.tencent.mm.plugin.backup.roambackup.v1.f92914a;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (!v1Var.a(context, new mo1.j0(this))) {
            com.tencent.mars.xlog.Log.e("MM.Roam.RoamLiteTaskDetailUI", "onCreate, can not backup ");
        }
        onNewIntent(getIntent());
        getWindow().addFlags(128);
        setMMTitle(com.tencent.mm.R.string.ofb);
        setBounceEnabled(false);
        setBackBtn(new mo1.k0(this), com.tencent.mm.R.raw.actionbar_icon_dark_close);
        addTextOptionMenu(0, getString(com.tencent.mm.R.string.a7l), new mo1.l0(this), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtnVisible(false);
        showOptionMenu(0, false);
        this.f92715f = new em.d4(getContentView());
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f92717h) {
            com.tencent.mars.xlog.Log.e("MM.Roam.RoamLiteTaskDetailUI", "[onDestroy] Fail to launch task, pkgId=" + this.f92713d + ", dummyAsRestore=" + this.f92716g);
            Y6("roamLiteStartRestoreResult", 2, this.f92713d);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        long longExtra = intent.getLongExtra("packageId", -1L);
        this.f92713d = longExtra;
        if (longExtra < 0) {
            com.tencent.mars.xlog.Log.e("MM.Roam.RoamLiteTaskDetailUI", "Invalid packageId = " + this.f92713d);
            V6();
            return;
        }
        com.tencent.wechat.aff.affroam.g k17 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.k(longExtra);
        if (k17 != null) {
            this.f92714e = k17;
            this.f92716g = intent.getBooleanExtra("dummyAsRestore", false);
        } else {
            com.tencent.mars.xlog.Log.e("MM.Roam.RoamLiteTaskDetailUI", "Fail to get package by packageId=" + this.f92713d);
            V6();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        r0Var.p(this);
        r0Var.e(true);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        r0Var.b(this);
        qo1.j0 d17 = qo1.j1.f365523a.d(this.f92713d);
        jz5.l d18 = d17.d();
        kotlinx.coroutines.l.d(androidx.lifecycle.z.a(this), null, null, new mo1.o0(this, d17, (com.tencent.wechat.aff.affroam.n0) d18.f302833d, (qo1.i0) d18.f302834e, null), 3, null);
        r0Var.e(false);
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean supportNavigationSwipeBack() {
        return false;
    }
}
