package com.tencent.mm.plugin.facedetect.ui;

@db5.a(3)
/* loaded from: classes14.dex */
public class FaceDetectUI extends com.tencent.mm.ui.MMActivity implements i72.x, d72.e {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f100069z = 0;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.RelativeLayout f100079p;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f100088y;

    /* renamed from: d, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f100070d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f100071e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f100072f = -1;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.model.b0 f100073g = null;

    /* renamed from: h, reason: collision with root package name */
    public g72.a0 f100074h = null;

    /* renamed from: i, reason: collision with root package name */
    public boolean f100075i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f100076m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f100077n = false;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f100078o = null;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.views.FaceDetectView f100080q = null;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.views.FaceScanRect f100081r = null;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f100082s = null;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService f100083t = null;

    /* renamed from: u, reason: collision with root package name */
    public android.content.ServiceConnection f100084u = null;

    /* renamed from: v, reason: collision with root package name */
    public boolean f100085v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f100086w = false;

    /* renamed from: x, reason: collision with root package name */
    public i72.z f100087x = null;

    public void T6(int i17, int i18, java.lang.String str, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "finishWithResult errType: %d, errCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 0 && i18 != 0 && h72.s.e().h() && h72.s.e().f279474h) {
            h72.s.e().d();
        }
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putParcelable("key_parcelable_reporter", com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a());
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putInt("err_type", i17);
        bundle3.putInt("err_code", i18);
        bundle3.putString("err_msg", str);
        bundle3.putAll(bundle2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle3);
        setResult(-1, intent);
        finish();
    }

    public final void U6(int i17, int i18, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "onProcessingError errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("show_err_msg", str2);
        X6();
        T6(i17, i18, str, bundle);
    }

    public void V6(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: face detect result: %d", java.lang.Integer.valueOf(i17));
        if (i17 > 0 && i17 < 10) {
            if (i17 == 3) {
                U6(4, 90017, "face detect time out", str);
                return;
            }
            if (i17 == 6 || i17 == 5) {
                U6(4, 90023, "face track failed or not stable", str);
                return;
            } else if (i17 == 7) {
                U6(4, 90009, "audio permission not granted", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hhn));
                return;
            } else {
                U6(4, 90018, "system error", str);
                return;
            }
        }
        com.tencent.mm.plugin.facedetect.model.b0 b0Var = this.f100073g;
        if (b0Var.f99994a >= b0Var.f99995b - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: collect data ok");
            this.f100080q.f(true, null);
            android.graphics.Bitmap previewBm = this.f100080q.getPreviewBm();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(previewBm == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "bitmap == null: %b", objArr);
            s75.d.b(new g72.w(this, previewBm, new g72.x(this)), "save_face_bitmap");
            return;
        }
        com.tencent.mm.plugin.facedetect.model.y.INSTANCE.f100043d.f100044i.getClass();
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceDetectNativeManager", "hy: move to next motion no instance");
        b0Var.f99994a++;
        int i18 = b0Var.a().f99986a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", java.lang.Integer.valueOf(i18));
        if (this.f100073g.a().f99992g) {
            this.f100081r.a(new g72.y(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: detect ok. start next: %d", java.lang.Integer.valueOf(i18));
            W6();
        }
    }

    public final void W6() {
        e72.h kVar;
        if (this.f100076m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: start capture face");
            com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView = this.f100080q;
            android.graphics.Rect rect = new android.graphics.Rect(this.f100081r.getLeft(), this.f100081r.getTop(), this.f100081r.getRight(), this.f100081r.getBottom());
            com.tencent.mm.plugin.facedetect.model.a0 a17 = this.f100073g.a();
            faceDetectView.getClass();
            if (a17.f99986a == 100) {
                return;
            }
            e72.h hVar = faceDetectView.f100125m;
            if (hVar != null) {
                hVar.h();
            }
            faceDetectView.f100127o = false;
            faceDetectView.f100128p = false;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            faceDetectView.f100131s = android.os.SystemClock.elapsedRealtime();
            faceDetectView.f100129q = a17.f99990e;
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectView", "carson logic");
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectView", "item.hintStr" + a17.f99989d);
            faceDetectView.f100130r = a17.f99991f;
            if (a17.f99986a == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IFaceMotion.Factory", "hy: is read number");
                kVar = new e72.v(null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.IFaceMotion.Factory", "hy: is normal");
                kVar = new e72.k(a17.f99989d, a17.f99988c);
            }
            faceDetectView.f100125m = kVar;
            android.view.ViewGroup viewGroup = faceDetectView.f100122g;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
            android.view.ViewGroup viewGroup2 = faceDetectView.f100123h;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            faceDetectView.f100125m.e(faceDetectView.getContext(), faceDetectView.f100122g, faceDetectView.f100123h);
            faceDetectView.f100125m.b(faceDetectView.f100126n);
            com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = faceDetectView.f100119d;
            if (faceDetectCameraView != null) {
                long j17 = a17.f99987b;
                synchronized (faceDetectCameraView) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectCameraView", "hy: request clear queue");
                    com.tencent.mm.plugin.facedetect.model.y.f100041f.removeCallbacksAndMessages(null);
                    faceDetectCameraView.f100108v = rect;
                    faceDetectCameraView.G();
                    ((i72.m) faceDetectCameraView.f100112z).c(j17);
                }
            }
        }
    }

    public final void X6() {
        wo.d1 d1Var;
        this.f100076m = false;
        this.f100080q.f(false, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: stopped scan");
        this.f100075i = false;
        i72.m mVar = (i72.m) this.f100080q.f100119d.f100112z;
        synchronized (mVar.f289427d.f100107u) {
            com.tencent.mm.plugin.facedetect.model.n0 n0Var = mVar.f289424a;
            if (n0Var != null && n0Var.f100017c && (d1Var = n0Var.f100016b) != null) {
                d1Var.l();
                n0Var.f100017c = false;
                com.tencent.mm.plugin.facedetect.model.s.f100033d.c();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: stopped preview");
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "unbindService, mBound: %b", java.lang.Boolean.valueOf(this.f100085v));
        if (this.f100085v) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "unbindService");
            l85.h1.g(this.f100084u, "tools", true, j45.l.e("tools"));
            this.f100085v = false;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "finish");
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "FaceDetectUI release");
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "releaseFaceDetect");
        if (!this.f100077n) {
            this.f100087x = null;
            this.f100077n = true;
            if (this.f100074h.f269224a) {
                X6();
                i72.m mVar = (i72.m) this.f100080q.f100119d.f100112z;
                com.tencent.mm.plugin.facedetect.views.FaceDetectCameraView faceDetectCameraView = mVar.f289427d;
                if (!faceDetectCameraView.f100102p) {
                    faceDetectCameraView.f100102p = true;
                    s75.d.b(new i72.i(mVar), "FaceDetectCameraView_Camera");
                }
            }
            android.os.PowerManager.WakeLock wakeLock = this.f100070d;
            if (wakeLock != null && wakeLock.isHeld()) {
                android.os.PowerManager.WakeLock wakeLock2 = this.f100070d;
                yj0.a.c(wakeLock2, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                wakeLock2.release();
                yj0.a.f(wakeLock2, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "releaseWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
                this.f100070d = null;
            }
            s75.d.b(new g72.p(this), "Face_active_gc");
        }
        Y6();
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aai;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "onBackPressed and cancel");
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "onUserCancel");
        e72.g currentMotionCancelInfo = this.f100080q.getCurrentMotionCancelInfo();
        T6(1, currentMotionCancelInfo.f249903a, currentMotionCancelInfo.f249904b, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(2097280);
        this.f100071e = getIntent().getStringExtra("k_user_name");
        this.f100072f = getIntent().getIntExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        this.f100088y = getIntent().getStringExtra("business_tips");
        com.tencent.mm.plugin.facedetect.model.FaceDetectReporter faceDetectReporter = (com.tencent.mm.plugin.facedetect.model.FaceDetectReporter) getIntent().getBundleExtra("key_reporter_bundle").getParcelable("key_parcelable_reporter");
        if (faceDetectReporter != null) {
            com.tencent.mm.plugin.facedetect.model.FaceDetectReporter.a().g(faceDetectReporter);
        }
        int i17 = this.f100072f;
        android.os.Bundle extras = getIntent().getExtras();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectControllerFactory", "getController serverScene: %d", java.lang.Integer.valueOf(i17));
        switch (i17) {
            case 0:
            case 1:
            case 3:
            case 4:
                new d72.b(this, this, i17, 0, extras);
                break;
            case 2:
            case 5:
                new d72.c(this, this, i17, 0, extras);
                break;
            case 6:
                new d72.d(this, this, i17, 0, extras);
                break;
        }
        getWindow().setFlags(1024, 1024);
        ((android.widget.Button) findViewById(com.tencent.mm.R.id.f485535i05)).setOnClickListener(new g72.q(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484279dn3);
        this.f100078o = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f100079p = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.dnz);
        this.f100081r = (com.tencent.mm.plugin.facedetect.views.FaceScanRect) findViewById(com.tencent.mm.R.id.dnj);
        this.f100080q = (com.tencent.mm.plugin.facedetect.views.FaceDetectView) findViewById(com.tencent.mm.R.id.dni);
        this.f100082s = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dhc);
        this.f100080q.setCallback(this);
        this.f100080q.setBusinessTip(this.f100088y);
        com.tencent.mm.plugin.facedetect.views.FaceDetectView faceDetectView = this.f100080q;
        android.widget.RelativeLayout relativeLayout = this.f100079p;
        android.view.ViewGroup centerHintHolder = this.f100081r.getCenterHintHolder();
        faceDetectView.f100122g = relativeLayout;
        faceDetectView.f100123h = centerHintHolder;
        this.f100080q.setErrTextView(this.f100082s);
        this.f100080q.d(true, this.f100071e);
        this.f100081r.setOnRefreshRectListener(new g72.r(this));
        this.f100081r.setVisibility(4);
        this.f100074h = new g72.a0(this, null);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: current %d instance not destroyed", java.lang.Integer.valueOf(hashCode()));
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "onStart");
        if (this.f100070d == null) {
            this.f100070d = ((android.os.PowerManager) getSystemService("power")).newWakeLock(10, "Scan Lock");
        }
        if (!this.f100070d.isHeld()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "acquire wakeLock");
            android.os.PowerManager.WakeLock wakeLock = this.f100070d;
            yj0.a.c(wakeLock, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "acquireWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            wakeLock.acquire();
            yj0.a.f(wakeLock, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI", "acquireWakeLock", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService.class);
        intent.putExtra("key_face_service_connection_from", 2);
        this.f100084u = new g72.s(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "bindService");
        l85.h1.a(intent, this.f100084u, 1, "tools", true, j45.l.e("tools"));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectUI", "hy: onStop, finish");
        Y6();
        if (this.f100086w) {
            finish();
        } else {
            T6(1, 90006, "cancel with on stop", null);
        }
    }
}
