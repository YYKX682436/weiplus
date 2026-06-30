package wo1;

/* loaded from: classes5.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final wo1.l1 f529519a = new wo1.l1();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.ref.WeakReference f529520b;

    public final void a(java.lang.String str) {
        if (!android.provider.Settings.canDrawOverlays(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamFloatWindowHelper", "Float window permission is denied, return directly.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamFloatWindowHelper", "Start float window service to show SAF guide");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.view.WindowManager windowManager = (android.view.WindowManager) systemService;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.emv, (android.view.ViewGroup) null);
        if (inflate == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamFloatWindowHelper", "Fail to inflate container view");
            return;
        }
        f529520b = new java.lang.ref.WeakReference(inflate);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.txn);
        frameLayout.removeAllViews();
        android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        android.view.View inflate2 = android.view.LayoutInflater.from(context2).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.emw, (android.view.ViewGroup) null);
        if (str != null) {
            ((android.widget.TextView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.vfe)).setText(context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ofk, str));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        frameLayout.addView(inflate2);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(-2, -2, android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002, 8, -3);
        layoutParams.gravity = 8388693;
        layoutParams.x = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams.y = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        windowManager.addView(inflate, layoutParams);
        inflate.setOnTouchListener(new wo1.j1(layoutParams, windowManager, inflate));
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.txm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById).setOnClickListener(new wo1.k1(windowManager, inflate));
    }
}
