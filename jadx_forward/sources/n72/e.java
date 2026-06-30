package n72;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n72.f f416788d;

    public e(n72.f fVar) {
        this.f416788d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wo.d1 d1Var = this.f416788d.f416789d.f416808g;
        if (d1Var == null || d1Var.f529187c || !this.f416788d.f416789d.f416814p) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceReflectCam", "camera is null or has released!");
            return;
        }
        n72.q qVar = this.f416788d.f416789d;
        if (qVar.G == 1) {
            return;
        }
        k72.k kVar = k72.j.f386258a;
        android.content.Context applicationContext = qVar.f416822x.getApplicationContext();
        n72.q qVar2 = this.f416788d.f416789d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = qVar2.f416822x;
        android.hardware.Camera camera = qVar2.f416808g.f529185a;
        int i17 = qVar2.B;
        android.widget.TextView textView = qVar2.f416823y;
        k72.i iVar = qVar2.H;
        int i18 = qVar2.f416811m;
        n72.q qVar3 = this.f416788d.f416789d;
        android.graphics.Point point = new android.graphics.Point(qVar3.f416809h, qVar3.f416810i);
        n72.q qVar4 = this.f416788d.f416789d;
        int i19 = qVar4.f416817s;
        java.lang.String str = qVar4.f416818t;
        int i27 = qVar4.f416809h;
        int i28 = qVar4.f416810i;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionLogic", "initFaceDetect（）");
        kVar.f386259a = applicationContext;
        kVar.f386260b = i17;
        kVar.f386263e = textView;
        kVar.f386264f = activityC13534x1dc4b4e7.getResources().getDisplayMetrics().widthPixels;
        kVar.f386265g = activityC13534x1dc4b4e7.getResources().getDisplayMetrics().heightPixels;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionLogic", "mUiWidth:%s  mUiHeight：%s", java.lang.Integer.valueOf(kVar.f386264f), java.lang.Integer.valueOf(kVar.f386265g));
        kVar.f386261c = i19;
        kVar.f386262d = str;
        kVar.f386266h = i27;
        kVar.f386267i = i28;
        new android.graphics.Rect(0, 0, 0, 0);
        new android.graphics.Rect(0, 0, 0, 0);
        kVar.f386269k = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionLogic", "action：%s,mActionHint:%s", java.lang.Integer.valueOf(kVar.f386261c), kVar.f386262d);
        java.lang.String str2 = kVar.f386262d;
        if (str2 != null) {
            kVar.f386263e.setText(str2);
        } else {
            int i29 = kVar.f386261c;
            if (i29 == 1) {
                kVar.f386263e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c67);
            } else if (i29 == 2) {
                kVar.f386263e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c68);
            }
        }
        com.p314xaae8f345.p3223x6dd56e0.p3243x7dcc77cf.C27972x100071ea.m121365x68ac462(applicationContext.getApplicationContext(), camera, i17, new k72.h(kVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionLogic", "init face detect, camera, rotate: %s", java.lang.Integer.valueOf(i18));
        k72.u uVar = k72.u.B;
        uVar.f386296u = i18;
        int i37 = point.x;
        int i38 = point.y;
        uVar.f386297v = i37;
        uVar.f386298w = i38;
    }
}
