package zw1;

/* loaded from: classes8.dex */
public class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.g4 f558157d;

    public f4(zw1.g4 g4Var) {
        this.f558157d = g4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String sb6;
        ww1.a3 a3Var;
        zw1.g4 g4Var = this.f558157d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "saveBitmap height: %s, width: %s", java.lang.Integer.valueOf(g4Var.f558171d.getHeight()), java.lang.Integer.valueOf(g4Var.f558171d.getWidth()));
        if (g4Var.f558178n.isFinishing() || g4Var.f558178n.isDestroyed() || g4Var.f558171d.getHeight() == 0 || g4Var.f558171d.getWidth() == 0) {
            return;
        }
        int width = g4Var.f558171d.getWidth();
        int height = g4Var.f558171d.getHeight();
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(height));
        arrayList.add(java.lang.Integer.valueOf(width));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$22$1", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$22$1", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        g4Var.f558171d.draw(new android.graphics.Canvas(createBitmap));
        try {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            sb7.append(q75.c.d());
            sb7.append("mm_facetoface_collect_qrcode_");
            sb7.append(java.lang.System.currentTimeMillis());
            sb7.append(".png");
            sb6 = sb7.toString();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, sb6, false);
            a3Var = g4Var.f558172e;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUI", "save fixed amount qrcode failed!, errmsg:%s", e17.getMessage());
            dp.a.m125854x26a183b(g4Var.f558178n.mo55332x76847179(), g4Var.f558178n.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_v), 1).show();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 17, java.lang.Integer.valueOf(g4Var.f558177m));
            g4Var.f558172e.getClass();
        }
        if (a3Var.Q == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "doSaveQrCode success ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = g4Var.f558178n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Z6(activityC13149x63b02cb3, activityC13149x63b02cb3.mo55332x76847179(), g4Var.f558178n.mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b_p), com.p314xaae8f345.mm.R.raw.f79703xc84d169a, g4Var.f558173f);
            return;
        }
        if (g4Var.f558174g == 1) {
            r45.mu5 mu5Var = g4Var.f558175h;
            if (mu5Var != null && mu5Var.f462370d) {
                zw1.n6.b(g4Var.f558175h, zw1.n6.c(a3Var), g4Var.f558178n.mo55332x76847179());
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalite190b0cf18204487696c6d9890f89c090@pay");
            bundle.putBoolean("isHalfScreen", true);
            bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, true);
            bundle.putBoolean("forbidRightGesture", true);
            bundle.putDouble("heightPercent", 0.99d);
            bundle.putString("query", "data=" + java.net.URLEncoder.encode(android.util.Base64.encodeToString(g4Var.f558172e.Q.m75962x8b6d8abc(), 2), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(g4Var.f558178n.mo55332x76847179(), bundle, true, false, new zw1.e4(this));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.a7(g4Var.f558178n, g4Var.f558176i, a3Var);
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = g4Var.f558178n.mo55332x76847179();
        ((ub0.r) oVar).getClass();
        q75.c.f(sb6, mo55332x76847179);
        g4Var.f558172e.getClass();
        android.view.View view = g4Var.f558178n.f177981t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$22$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
