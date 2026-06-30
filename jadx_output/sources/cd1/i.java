package cd1;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: l, reason: collision with root package name */
    public static final cd1.i f40622l = new cd1.i();

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f40627e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.ComponentName f40628f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f40629g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.ResultReceiver f40630h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.g4 f40631i;

    /* renamed from: a, reason: collision with root package name */
    public int f40623a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f40624b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f40625c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40626d = false;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f40632j = null;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.Handler f40633k = new android.os.Handler(android.os.Looper.getMainLooper());

    public void a() {
        if (!this.f40625c) {
            c();
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new cd1.a(this), true);
        this.f40627e = b4Var;
        b4Var.c(0L, 300L);
        android.app.Activity activity = this.f40629g;
        if (activity != null) {
            this.f40631i = com.tencent.mm.ui.widget.dialog.g4.c(activity, activity.getString(com.tencent.mm.R.string.gor), false, null);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.HCEActivityMgr", "showProgressDialog mHceActivity is null");
        }
    }

    public final void b(boolean z17) {
        android.app.Activity activity = this.f40629g;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HCEActivityMgr", "checkDefaultNFCApplication mHceActivity is null");
            return;
        }
        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(android.nfc.NfcAdapter.getDefaultAdapter(activity));
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "component name: " + this.f40628f);
        if (cardEmulation.isDefaultServiceForCategory(this.f40628f, "payment")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "now is NFC Default Application");
            e(0, "NFC switch has opened and now is NFC default application");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "not NFC Default Application, isAutoSet: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.content.ComponentName componentName = this.f40628f;
            if (this.f40629g == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.HCEActivityMgr", "reuquestSetDefaultNFCApplication mHceActivity is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "request set default NFC application, hasRequestSetDefault: %b", java.lang.Boolean.valueOf(this.f40626d));
            if (!this.f40626d) {
                this.f40633k.postDelayed(new cd1.g(this, componentName), 200L);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.HCEActivityMgr", "has request set default NFC application");
                f(13004, "not set default NFC application", this.f40629g.getString(com.tencent.mm.R.string.f492457gp4));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd1.i.c():void");
    }

    public void d() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f40632j;
        if (j0Var != null && j0Var.isShowing()) {
            this.f40632j.dismiss();
            this.f40632j = null;
        }
        com.tencent.mm.ui.widget.dialog.g4 g4Var = this.f40631i;
        if (g4Var != null) {
            g4Var.dismiss();
            this.f40631i = null;
        }
    }

    public final void e(int i17, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("errCode", i17);
        bundle.putString("errMsg", str);
        this.f40630h.send(10001, bundle);
    }

    public final void f(int i17, java.lang.String str, java.lang.String str2) {
        d();
        android.app.Activity activity = this.f40629g;
        if (activity == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HCEActivityMgr", "showErrorDialog mHceActivity is null");
            return;
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = "";
        aVar.f211729s = str2;
        aVar.f211732v = this.f40629g.getString(com.tencent.mm.R.string.goq);
        aVar.E = new cd1.h(this, i17, str);
        aVar.A = true;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(activity, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        this.f40632j = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f40632j.show();
    }
}
