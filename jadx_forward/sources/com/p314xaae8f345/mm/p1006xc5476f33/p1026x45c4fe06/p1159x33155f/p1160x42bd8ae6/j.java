package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f167441e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, android.content.Context context) {
        this.f167440d = n7Var;
        this.f167441e = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        android.content.Context context = this.f167441e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f167440d;
        switch (itemId) {
            case 1:
                new ne1.f().A(n7Var.U1(), new org.json.JSONObject(), 10000);
                return;
            case 2:
            case 7:
            case 9:
                int itemId2 = menuItem.getItemId();
                java.lang.String o17 = n7Var.mo50354x59eafec1().mo49301x1d537609(itemId2 != 2 ? itemId2 != 7 ? itemId2 != 9 ? "wxfile://" : "wxfile://clientdata" : "wxfile://opendata" : "wxfile://usr", true).o();
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571565j1, o17), 0).show();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, o17, null);
                return;
            case 3:
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, n7Var.mo48798x74292566(), null);
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571561ix, n7Var.mo48798x74292566()), 1).show();
                return;
            case 4:
            case 5:
            default:
                return;
            case 6:
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d.a()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] disableForcePreload");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d.f170542a = false;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrand_process_force_preload").A("appbrand_process_force_preload", -1);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandForcePreloadConfig", "[ForcePreload] enableForcePreload");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d.f170542a = true;
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("appbrand_process_force_preload").A("appbrand_process_force_preload", 1);
                }
                menuItem.setTitle(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571563iz) + java.lang.String.format("(cur:%b)", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.d.a())));
                dp.a.m125854x26a183b(context, "Restart Wechat!!", 1).show();
                return;
            case 8:
                java.lang.String str = n7Var.mo32091x9a3f0ba2().u0().f128811x;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, str, null);
                dp.a.m125854x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571568j4, str), 1).show();
                return;
            case 10:
                iz5.a.h("test errlog " + new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, java.util.Locale.ENGLISH).format(new java.util.Date()));
                throw null;
            case 11:
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11707x2e869ce2.m49649xe062d354();
                return;
            case 12:
                ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.d(true);
                return;
            case 13:
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6.i(this));
                return;
        }
    }
}
