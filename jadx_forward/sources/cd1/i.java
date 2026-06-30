package cd1;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: l, reason: collision with root package name */
    public static final cd1.i f122155l = new cd1.i();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f122160e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.ComponentName f122161f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f122162g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.ResultReceiver f122163h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 f122164i;

    /* renamed from: a, reason: collision with root package name */
    public int f122156a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f122157b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f122158c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f122159d = false;

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f122165j = null;

    /* renamed from: k, reason: collision with root package name */
    public final android.os.Handler f122166k = new android.os.Handler(android.os.Looper.getMainLooper());

    public void a() {
        if (!this.f122158c) {
            c();
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new cd1.a(this), true);
        this.f122160e = b4Var;
        b4Var.c(0L, 300L);
        android.app.Activity activity = this.f122162g;
        if (activity != null) {
            this.f122164i = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4.c(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gor), false, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEActivityMgr", "showProgressDialog mHceActivity is null");
        }
    }

    public final void b(boolean z17) {
        android.app.Activity activity = this.f122162g;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEActivityMgr", "checkDefaultNFCApplication mHceActivity is null");
            return;
        }
        android.nfc.cardemulation.CardEmulation cardEmulation = android.nfc.cardemulation.CardEmulation.getInstance(android.nfc.NfcAdapter.getDefaultAdapter(activity));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "component name: " + this.f122161f);
        if (cardEmulation.isDefaultServiceForCategory(this.f122161f, "payment")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "now is NFC Default Application");
            e(0, "NFC switch has opened and now is NFC default application");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "not NFC Default Application, isAutoSet: %b", java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.content.ComponentName componentName = this.f122161f;
            if (this.f122162g == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEActivityMgr", "reuquestSetDefaultNFCApplication mHceActivity is null");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "request set default NFC application, hasRequestSetDefault: %b", java.lang.Boolean.valueOf(this.f122159d));
            if (!this.f122159d) {
                this.f122166k.postDelayed(new cd1.g(this, componentName), 200L);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HCEActivityMgr", "has request set default NFC application");
                f(13004, "not set default NFC application", this.f122162g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573990gp4));
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
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f122165j;
        if (j0Var != null && j0Var.isShowing()) {
            this.f122165j.dismiss();
            this.f122165j = null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g4 g4Var = this.f122164i;
        if (g4Var != null) {
            g4Var.dismiss();
            this.f122164i = null;
        }
    }

    public final void e(int i17, java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("errCode", i17);
        bundle.putString("errMsg", str);
        this.f122163h.send(10001, bundle);
    }

    public final void f(int i17, java.lang.String str, java.lang.String str2) {
        d();
        android.app.Activity activity = this.f122162g;
        if (activity == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.HCEActivityMgr", "showErrorDialog mHceActivity is null");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = "";
        aVar.f293262s = str2;
        aVar.f293265v = this.f122162g.getString(com.p314xaae8f345.mm.R.C30867xcad56011.goq);
        aVar.E = new cd1.h(this, i17, str);
        aVar.A = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activity, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        this.f122165j = j0Var;
        j0Var.setCanceledOnTouchOutside(false);
        this.f122165j.show();
    }
}
