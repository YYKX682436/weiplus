package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29;

/* loaded from: classes12.dex */
public class f3 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f180426a;

    /* renamed from: b, reason: collision with root package name */
    public int f180427b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f180428c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f180429d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180430e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f180431f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f180432g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180433h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f180434i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f180435j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f180436k;

    /* renamed from: l, reason: collision with root package name */
    public android.app.Dialog f180437l;

    public static boolean c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
        r01.q3.cj().getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInfoStorage", "getSpecialInternalBizUsernames sql %s", "select bizinfo.username from rcontact, bizinfo where bizinfo.specialType = 1 and rcontact.username = bizinfo.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0 ");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = gm0.j1.u().f354686f.f("select bizinfo.username from rcontact, bizinfo where bizinfo.specialType = 1 and rcontact.username = bizinfo.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0 ", null, 2);
        int columnIndex = f17.getColumnIndex(dm.i4.f66875xa013b0d5);
        while (f17.moveToNext()) {
            arrayList.add(f17.getString(columnIndex));
        }
        f17.close();
        java.lang.String str5 = arrayList.size() > 0 ? (java.lang.String) arrayList.get(0) : null;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9 c11283x90d63ed9 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11283x90d63ed9();
        c11283x90d63ed9.m48465x27678dde(str2);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str5);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504();
        c11286x34a5504.f33122xe4128443 = c11283x90d63ed9;
        c11286x34a5504.f33130x6942258 = e17;
        c11286x34a5504.f33121x993583fc = str4;
        c11286x34a5504.m48468xb4dcc327(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str2, null));
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12 c5987xfe669c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5987xfe669c12();
        am.jt jtVar = c5987xfe669c12.f136282g;
        jtVar.f88613a = c11286x34a5504;
        jtVar.f88614b = "wx7fa037cc7dfabad5";
        jtVar.f88615c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5n);
        jtVar.f88616d = str;
        jtVar.f88617e = 2;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
            jtVar.f88620h = null;
        } else {
            jtVar.f88618f = str5;
            jtVar.f88619g = e17;
        }
        boolean e18 = c5987xfe669c12.e();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
            am.mt mtVar = c5990xd50ae361.f136285g;
            mtVar.f88895a = str;
            mtVar.f88896b = str3;
            mtVar.f88897c = c01.e2.C(str);
            mtVar.f88898d = 0;
            c5990xd50ae361.e();
        }
        return e18;
    }

    public final java.lang.String a(android.graphics.Bitmap bitmap) {
        int[] c17 = bitmap != null ? com.p314xaae8f345.mm.ui.bk.c(bitmap, 4, 4) : new int[]{-1, -16777216};
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d3 d3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.d3(this, c17);
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(d3Var);
        this.f180434i.setBackgroundDrawable(paintDrawable);
        this.f180429d.setTextColor(c17[1]);
        this.f180430e.setTextColor(c17[1]);
        this.f180431f.setTextColor(c17[1]);
        this.f180432g.setTextColor(c17[1]);
        this.f180433h.setTextColor(c17[1]);
        int i17 = this.f180427b;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/model/SportShareImageLogic", "createAndSaveBitmap", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/exdevice/model/SportShareImageLogic", "createAndSaveBitmap", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        this.f180428c.draw(new android.graphics.Canvas(createBitmap));
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(new com.p314xaae8f345.mm.vfs.r6(this.f180426a.getCacheDir(), "sport_share_bitmap.jpg").o());
        if (r6Var.m()) {
            r6Var.l();
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, r6Var.o(), true);
        } catch (java.io.IOException unused) {
        }
        return r6Var.o();
    }

    public void b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e3 e3Var) {
        if (this.f180435j) {
            return;
        }
        this.f180435j = true;
        this.f180436k = false;
        if (this.f180437l == null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572687c55), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.a3(this));
            this.f180437l = Q;
            Q.show();
        }
        this.f180426a = context;
        this.f180427b = 1280;
        if (1280 > i65.a.B(context)) {
            this.f180427b = i65.a.B(context);
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_k, (android.view.ViewGroup) null);
        this.f180428c = inflate;
        this.f180429d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.djd);
        this.f180430e = (android.widget.TextView) this.f180428c.findViewById(com.p314xaae8f345.mm.R.id.djb);
        this.f180431f = (android.widget.TextView) this.f180428c.findViewById(com.p314xaae8f345.mm.R.id.djk);
        this.f180433h = (android.widget.TextView) this.f180428c.findViewById(com.p314xaae8f345.mm.R.id.k3s);
        this.f180432g = (android.widget.TextView) this.f180428c.findViewById(com.p314xaae8f345.mm.R.id.djj);
        this.f180434i = this.f180428c.findViewById(com.p314xaae8f345.mm.R.id.agq);
        this.f180429d.setText(str);
        this.f180431f.setText(str2);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f180428c.findViewById(com.p314xaae8f345.mm.R.id.a9n);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, c01.z1.r(), 0.5f);
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.f180428c.findViewById(com.p314xaae8f345.mm.R.id.agd);
        this.f180428c.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f180428c.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f180427b, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f180427b, 1073741824));
        android.view.View view = this.f180428c;
        int i17 = this.f180427b;
        view.layout(0, 0, i17, i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            imageView2.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560399jc);
            e3Var.a(a(null));
            this.f180435j = false;
        } else {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180519t == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180519t = n11.a.b();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ai().f180519t.m(str3, imageView2, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.c3(this, e3Var));
        }
    }
}
