package wo1;

/* loaded from: classes5.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f529449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f529450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(wo1.a1 a1Var, qo1.f0 f0Var, po1.d dVar) {
        super(0);
        this.f529448d = a1Var;
        this.f529449e = f0Var;
        this.f529450f = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.net.wifi.WifiInfo wifiInfo;
        java.lang.String ssid;
        android.content.Context context = this.f529448d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        qo1.f0 task = this.f529449e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        po1.d device = this.f529450f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        boolean z17 = task instanceof qo1.c1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackupUIUtils", "show connection switch bottom dialog, pkgId=" + task.f447016i + " isRestore=" + z17);
        java.lang.String str = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174457b : com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.w1.f174456a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570244dq2, (android.view.ViewGroup) null);
        if (b3.l.m9698x3fed0563(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.NetworkUtils", "Permission of ACCESS_FINE_LOCATION not granted.");
        } else {
            java.lang.Object systemService = context.getApplicationContext().getSystemService("wifi");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            android.net.wifi.WifiManager wifiManager = (android.net.wifi.WifiManager) systemService;
            if (wifiManager.isWifiEnabled() && (wifiInfo = (android.net.wifi.WifiInfo) yj0.a.j(wifiManager, "com/tencent/mm/plugin/backup/roambackup/helper/NetworkUtils", "getCurrentSsid", "(Landroid/content/Context;)Ljava/lang/String;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) != null) {
                ssid = wifiInfo.getSSID();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ssid, "getSSID(...)");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.NetworkUtils", "getCurrentSsid: ".concat(ssid));
                if (r26.i0.y(ssid, "\"", false) && r26.i0.n(ssid, "\"", false)) {
                    ssid = ssid.substring(1, ssid.length() - 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ssid, "substring(...)");
                }
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569268sa2)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfm, ssid));
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rrz)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.mfj);
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s8u)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfk, str));
                ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ril)).setOnClickListener(new uo1.p(y1Var));
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s7n)).setOnClickListener(new uo1.v(y1Var, device, task));
                y1Var.k(inflate);
                y1Var.s();
                return jz5.f0.f384359a;
            }
        }
        ssid = "<unknown ssid>";
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569268sa2)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfm, ssid));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.rrz)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.mfj);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s8u)).setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfk, str));
        ((android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ril)).setOnClickListener(new uo1.p(y1Var));
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.s7n)).setOnClickListener(new uo1.v(y1Var, device, task));
        y1Var.k(inflate);
        y1Var.s();
        return jz5.f0.f384359a;
    }
}
