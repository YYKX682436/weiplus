package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d {

    /* renamed from: l, reason: collision with root package name */
    public static final java.lang.String f262671l = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b;

    /* renamed from: m, reason: collision with root package name */
    public static long f262672m = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f f262673a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f f262674b = null;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e f262675c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f f262676d;

    /* renamed from: e, reason: collision with root package name */
    public final mt4.c f262677e;

    /* renamed from: f, reason: collision with root package name */
    public mt4.d f262678f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f262679g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f262680h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f262681i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f262682j;

    /* renamed from: k, reason: collision with root package name */
    public final android.content.BroadcastReceiver f262683k;

    public c(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.b(this);
        this.f262683k = bVar;
        this.f262676d = fVar;
        f262672m = 0L;
        this.f262675c = eVar;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
        intentFilter.addAction("com.tencent.mm.gwallet.ACTION_PAY_RESPONSE");
        if (fp.h.a(33)) {
            activity.registerReceiver(bVar, intentFilter);
        } else {
            activity.registerReceiver(bVar, intentFilter, 2);
        }
        this.f262677e = new mt4.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public int a() {
        return 3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        try {
            abstractActivityC21394xb3d2c0cf.unregisterReceiver(this.f262683k);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GoogleWallet", e17.toString());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.U0(abstractActivityC21394xb3d2c0cf)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
        intent.setPackage(f262671l);
        abstractActivityC21394xb3d2c0cf.sendBroadcast(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public boolean c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, int i18, android.content.Intent intent) {
        if (i17 == 10001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleWallet", "purchase flow!result_code: %d", java.lang.Integer.valueOf(i18));
            if (intent == null) {
                g(abstractActivityC21394xb3d2c0cf, 1);
                return true;
            }
            int intExtra = intent.getIntExtra("RESPONSE_CODE", 0);
            if (intExtra == 3 || intExtra == 105) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.c(this.f262682j, this.f262681i, this.f262679g, intExtra, "");
                g(abstractActivityC21394xb3d2c0cf, intExtra);
                return true;
            }
            if (intExtra == 100000001) {
                g(abstractActivityC21394xb3d2c0cf, intExtra);
                return true;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar = this.f262674b;
        java.lang.String str = this.f262682j;
        java.lang.String str2 = this.f262681i;
        java.lang.String str3 = this.f262679g;
        int a17 = this.f262677e.a(intent);
        java.lang.String.valueOf(a17);
        nt4.f a18 = nt4.f.a(a17);
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.c(str, str2, str3, a17, a18.f421357b);
        if (fVar != null) {
            fVar.a(a18, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar, boolean z17) {
        this.f262674b = fVar;
        mt4.d dVar = this.f262678f;
        dVar.getClass();
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mt4.e eVar = (mt4.e) ((java.util.HashMap) dVar.f412834a).get((java.lang.String) it.next());
            if (eVar != null) {
                arrayList2.add(eVar.f412839e);
            }
        }
        if (arrayList2.size() > 0) {
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST");
            intent.setPackage(f262671l);
            intent.putStringArrayListExtra("tokens", arrayList2);
            intent.putExtra("IS_FAILED_CONSUME", z17);
            abstractActivityC21394xb3d2c0cf.sendBroadcast(intent);
            return;
        }
        nt4.f a17 = nt4.f.a(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar2 = this.f262674b;
        if (fVar2 != null) {
            fVar2.a(a17, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public void e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_QUERY_REQUEST");
        intent.setPackage(f262671l);
        intent.putExtra("is_direct", z17);
        abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, 10001);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public int f(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar) {
        this.f262673a = fVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar = this.f262675c;
        r45.oy3 oy3Var = eVar.f262688d;
        this.f262681i = oy3Var.f464144d;
        this.f262679g = oy3Var.f464145e;
        this.f262680h = oy3Var.f464146f;
        android.content.Intent intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_PAY_REQUEST");
        intent.setPackage(f262671l);
        intent.putExtra("product_id", this.f262681i);
        java.lang.String str = eVar.f262688d.f464147g;
        this.f262682j = str;
        java.lang.String str2 = this.f262679g;
        java.lang.String str3 = this.f262680h;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            str2 = "";
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            str3 = "";
        }
        intent.putExtra("developer_pay_load", str + "[#]" + str2 + "[#]" + str3);
        if (abstractActivityC21394xb3d2c0cf.getPackageManager().queryIntentActivities(intent, 65536).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleWallet", "Try to downloading GWallet Moudle!");
            nt4.f a17 = nt4.f.a(3);
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar2 = this.f262673a;
            if (fVar2 != null) {
                fVar2.a(a17, null);
            }
        } else {
            f262672m = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GoogleWallet", "GWallet Found!");
            abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, 10001);
        }
        return 10001;
    }

    public final void g(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17) {
        nt4.f a17 = nt4.f.a(i17);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", a17.f421356a);
        intent.putExtra("key_err_msg", a17.f421357b);
        intent.putExtra("key_launch_ts", f262672m);
        abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
        abstractActivityC21394xb3d2c0cf.finish();
    }
}
