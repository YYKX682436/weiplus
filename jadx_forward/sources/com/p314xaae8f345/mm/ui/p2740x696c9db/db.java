package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes4.dex */
public class db implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 f291891a;

    public db(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752) {
        this.f291891a = activityC22534xec824752;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        java.lang.String i17;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        boolean z18 = true;
        java.lang.String str3 = null;
        try {
            if (com.p314xaae8f345.mm.vfs.w6.j(str) && com.p314xaae8f345.mm.vfs.w6.k(str) > 0 && (i17 = com.p314xaae8f345.mm.vfs.w6.i(str, true)) != null) {
                p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9 c1098xe10e35e9 = new p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9(i17);
                if (c1098xe10e35e9.m7356xc00a8522(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90)) {
                    java.lang.String m7340x351be6 = c1098xe10e35e9.m7340x351be6(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f3174x9a13bc90);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m7340x351be6)) {
                        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.getDefault());
                        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH:mm", java.util.Locale.getDefault());
                        try {
                            java.util.Date parse = simpleDateFormat.parse(m7340x351be6);
                            if (parse != null) {
                                m7340x351be6 = simpleDateFormat2.format(parse);
                            }
                        } catch (java.text.ParseException unused) {
                        }
                        str3 = m7340x351be6;
                    }
                }
            }
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Util", e17, "exitExifTimeInfo error", new java.lang.Object[0]);
        }
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = this.f291891a;
        if (K0) {
            db5.t7.i(activityC22534xec824752.mo55332x76847179(), activityC22534xec824752.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncn), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            return;
        }
        if (!activityC22534xec824752.f291737t) {
            db5.t7.i(activityC22534xec824752.mo55332x76847179(), activityC22534xec824752.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncn), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC22534xec824752.mo55332x76847179();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293242a = activityC22534xec824752.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ncn);
        aVar.f293262s = activityC22534xec824752.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nm9, str3);
        aVar.f293265v = of5.b.a(mo55332x76847179).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572299ap0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(mo55332x76847179, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        java.lang.String stringExtra = activityC22534xec824752.getIntent().getStringExtra("key_conv_session_id");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            c01.n2.d().c("key_file_img_export_config", true).i("key_file_time_save_alert_last_sessionid", stringExtra);
            z18 = false;
        }
        activityC22534xec824752.f291737t = z18;
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752 activityC22534xec824752 = this.f291891a;
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.m(activityC22534xec824752.mo55332x76847179(), activityC22534xec824752.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i87));
    }
}
