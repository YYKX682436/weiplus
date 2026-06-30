package s65;

/* loaded from: classes11.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b f484965d;

    public b(com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b activityC20971xf3908b5b) {
        this.f484965d = activityC20971xf3908b5b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2593x6f2fbec7.p2595xf206e0c9.ActivityC20971xf3908b5b activityC20971xf3908b5b = this.f484965d;
        if (activityC20971xf3908b5b.f273847i == 2) {
            s65.o0.g(activityC20971xf3908b5b, 3, 0);
        }
        java.lang.String c17 = com.p314xaae8f345.mm.p2593x6f2fbec7.p2594x49b0bd5a.l.c(activityC20971xf3908b5b.f273845g, false);
        if (c17 != null) {
            s65.w0.f485058a.l(1, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 72L, 1L, true);
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new s65.c(activityC20971xf3908b5b, c17), 300L);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(405L, 73L, 1L, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppInstallerUI", "pack not found!");
        db5.e1.T(activityC20971xf3908b5b, activityC20971xf3908b5b.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574951k35));
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) com.p314xaae8f345.mm.sdk.p2603x2137b148.SharedPreferencesC20998x2b0514dd.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "update_config_prefs", 4);
        o4Var.getClass();
        o4Var.clear();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdateUtil", "clearUpdateConfigPrefs");
        activityC20971xf3908b5b.finish();
    }
}
