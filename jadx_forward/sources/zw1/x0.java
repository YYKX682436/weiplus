package zw1;

/* loaded from: classes15.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.y0 f558374d;

    public x0(zw1.y0 y0Var) {
        this.f558374d = y0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        boolean z17;
        java.lang.String sb6;
        r45.jv3 jv3Var;
        zw1.y0 y0Var = this.f558374d;
        android.widget.LinearLayout linearLayout = y0Var.f558384d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = y0Var.f558389i;
        linearLayout.getHeight();
        android.widget.LinearLayout linearLayout2 = y0Var.f558384d;
        linearLayout2.getWidth();
        int width = linearLayout2.getWidth();
        int height = linearLayout2.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/CollectMainUI$16$1", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/collect/ui/CollectMainUI$16$1", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        linearLayout2.draw(new android.graphics.Canvas(createBitmap));
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb7.append(q75.c.d());
            sb7.append("mm_facetoface_collect_qrcode_");
            sb7.append(java.lang.System.currentTimeMillis());
            sb7.append(".png");
            sb6 = sb7.toString();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, sb6, false);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Boolean.valueOf(activityC13144xce1cfbb7.V1 == null);
            objArr[1] = java.lang.Boolean.valueOf(activityC13144xce1cfbb7.f177924c2);
            objArr[2] = java.lang.Boolean.valueOf(activityC13144xce1cfbb7.f177944x0 == 8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectMainUI", "mHalfPageInfo:%s,hasHalfPageShown:%s,isRegionHK()%s", objArr);
            jv3Var = activityC13144xce1cfbb7.V1;
        } catch (java.lang.Exception e17) {
            e = e17;
            i17 = 1;
            z17 = false;
        }
        if (jv3Var != null && !activityC13144xce1cfbb7.f177924c2) {
            if (!(activityC13144xce1cfbb7.f177944x0 == 8)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.Y6(activityC13144xce1cfbb7, jv3Var);
                i17 = 1;
                z17 = false;
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13144xce1cfbb7.mo55332x76847179();
                ((ub0.r) oVar).getClass();
                q75.c.f(sb6, mo55332x76847179);
                activityC13144xce1cfbb7.f177924c2 = z17;
                activityC13144xce1cfbb7.A.setVisibility(8);
            }
        }
        if (y0Var.f558385e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CollectMainUI", "doSaveQrCode success ");
            i17 = 1;
            z17 = false;
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.Z6(activityC13144xce1cfbb7, activityC13144xce1cfbb7.mo55332x76847179(), activityC13144xce1cfbb7.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_p), com.p314xaae8f345.mm.R.raw.f79703xc84d169a, y0Var.f558386f, y0Var.f558387g);
                vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC13144xce1cfbb7.mo55332x76847179();
                ((ub0.r) oVar2).getClass();
                q75.c.f(sb6, mo55332x768471792);
                activityC13144xce1cfbb7.f177924c2 = z17;
            } catch (java.lang.Exception e18) {
                e = e18;
                activityC13144xce1cfbb7.f177924c2 = z17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CollectMainUI", "save fixed amount qrcode failed!" + e.getMessage());
                dp.a.m125854x26a183b(activityC13144xce1cfbb7.mo55332x76847179(), activityC13144xce1cfbb7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_v), i17).show();
                activityC13144xce1cfbb7.A.setVisibility(8);
            }
            activityC13144xce1cfbb7.A.setVisibility(8);
        }
        i17 = 1;
        z17 = false;
        vb0.o oVar22 = (vb0.o) i95.n0.c(vb0.o.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x7684717922 = activityC13144xce1cfbb7.mo55332x76847179();
        ((ub0.r) oVar22).getClass();
        q75.c.f(sb6, mo55332x7684717922);
        activityC13144xce1cfbb7.f177924c2 = z17;
        activityC13144xce1cfbb7.A.setVisibility(8);
    }
}
