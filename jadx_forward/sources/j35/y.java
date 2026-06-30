package j35;

/* loaded from: classes5.dex */
public class y implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e f379059d;

    public y(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e activityC19627x87d09a1e) {
        this.f379059d = activityC19627x87d09a1e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "onResume() goIgnoreBatteryOptimizations ");
        int i18 = com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e.f271046s;
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e activityC19627x87d09a1e = this.f379059d;
        activityC19627x87d09a1e.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "goIgnoreBatteryOptimizations()");
        try {
            activityC19627x87d09a1e.startActivityForResult(new android.content.Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS").setData(android.net.Uri.parse("package:" + activityC19627x87d09a1e.getPackageName())), 1);
            if (com.p314xaae8f345.mm.p642xad8b531f.o.a().getBoolean("954_93_first", true)) {
                jx3.f.INSTANCE.mo68477x336bdfd8(954L, 93L, 1L, false);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = com.p314xaae8f345.mm.p642xad8b531f.o.a();
                a17.getClass();
                a17.putBoolean("954_93_first", false);
            }
            jx3.f.INSTANCE.mo68477x336bdfd8(954L, 94L, 1L, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", java.lang.Integer.valueOf(activityC19627x87d09a1e.f271051i), e17.getMessage());
        }
    }
}
