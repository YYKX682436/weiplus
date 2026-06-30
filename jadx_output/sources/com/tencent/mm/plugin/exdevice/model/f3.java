package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes12.dex */
public class f3 {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f98893a;

    /* renamed from: b, reason: collision with root package name */
    public int f98894b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f98895c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f98896d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f98897e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f98898f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f98899g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f98900h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f98901i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f98902j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f98903k;

    /* renamed from: l, reason: collision with root package name */
    public android.app.Dialog f98904l;

    public static boolean c(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).getClass();
        r01.q3.cj().getClass();
        com.tencent.mm.sdk.platformtools.r2 r2Var = com.tencent.mm.storage.z3.M2;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizInfoStorage", "getSpecialInternalBizUsernames sql %s", "select bizinfo.username from rcontact, bizinfo where bizinfo.specialType = 1 and rcontact.username = bizinfo.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0 ");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = gm0.j1.u().f273153f.f("select bizinfo.username from rcontact, bizinfo where bizinfo.specialType = 1 and rcontact.username = bizinfo.username and (rcontact.verifyFlag & 8) != 0  and (rcontact.type & 1) != 0 ", null, 2);
        int columnIndex = f17.getColumnIndex(dm.i4.COL_USERNAME);
        while (f17.moveToNext()) {
            arrayList.add(f17.getString(columnIndex));
        }
        f17.close();
        java.lang.String str5 = arrayList.size() > 0 ? (java.lang.String) arrayList.get(0) : null;
        com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = new com.tencent.mm.opensdk.modelmsg.WXImageObject();
        wXImageObject.setImagePath(str2);
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str5);
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.mediaObject = wXImageObject;
        wXMediaMessage.title = e17;
        wXMediaMessage.description = str4;
        wXMediaMessage.setThumbImage(com.tencent.mm.sdk.platformtools.x.J(str2, null));
        com.tencent.mm.autogen.events.SendAppMsgEvent sendAppMsgEvent = new com.tencent.mm.autogen.events.SendAppMsgEvent();
        am.jt jtVar = sendAppMsgEvent.f54749g;
        jtVar.f7080a = wXMediaMessage;
        jtVar.f7081b = "wx7fa037cc7dfabad5";
        jtVar.f7082c = context.getString(com.tencent.mm.R.string.c5n);
        jtVar.f7083d = str;
        jtVar.f7084e = 2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            jtVar.f7087h = null;
        } else {
            jtVar.f7085f = str5;
            jtVar.f7086g = e17;
        }
        boolean e18 = sendAppMsgEvent.e();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
            am.mt mtVar = sendMsgEvent.f54752g;
            mtVar.f7362a = str;
            mtVar.f7363b = str3;
            mtVar.f7364c = c01.e2.C(str);
            mtVar.f7365d = 0;
            sendMsgEvent.e();
        }
        return e18;
    }

    public final java.lang.String a(android.graphics.Bitmap bitmap) {
        int[] c17 = bitmap != null ? com.tencent.mm.ui.bk.c(bitmap, 4, 4) : new int[]{-1, -16777216};
        com.tencent.mm.plugin.exdevice.model.d3 d3Var = new com.tencent.mm.plugin.exdevice.model.d3(this, c17);
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(d3Var);
        this.f98901i.setBackgroundDrawable(paintDrawable);
        this.f98896d.setTextColor(c17[1]);
        this.f98897e.setTextColor(c17[1]);
        this.f98898f.setTextColor(c17[1]);
        this.f98899g.setTextColor(c17[1]);
        this.f98900h.setTextColor(c17[1]);
        int i17 = this.f98894b;
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/model/SportShareImageLogic", "createAndSaveBitmap", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/exdevice/model/SportShareImageLogic", "createAndSaveBitmap", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        this.f98895c.draw(new android.graphics.Canvas(createBitmap));
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(new com.tencent.mm.vfs.r6(this.f98893a.getCacheDir(), "sport_share_bitmap.jpg").o());
        if (r6Var.m()) {
            r6Var.l();
        }
        try {
            com.tencent.mm.sdk.platformtools.x.D0(createBitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, r6Var.o(), true);
        } catch (java.io.IOException unused) {
        }
        return r6Var.o();
    }

    public void b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.exdevice.model.e3 e3Var) {
        if (this.f98902j) {
            return;
        }
        this.f98902j = true;
        this.f98903k = false;
        if (this.f98904l == null && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f491154c55), true, true, new com.tencent.mm.plugin.exdevice.model.a3(this));
            this.f98904l = Q;
            Q.show();
        }
        this.f98893a = context;
        this.f98894b = 1280;
        if (1280 > i65.a.B(context)) {
            this.f98894b = i65.a.B(context);
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a_k, (android.view.ViewGroup) null);
        this.f98895c = inflate;
        this.f98896d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.djd);
        this.f98897e = (android.widget.TextView) this.f98895c.findViewById(com.tencent.mm.R.id.djb);
        this.f98898f = (android.widget.TextView) this.f98895c.findViewById(com.tencent.mm.R.id.djk);
        this.f98900h = (android.widget.TextView) this.f98895c.findViewById(com.tencent.mm.R.id.k3s);
        this.f98899g = (android.widget.TextView) this.f98895c.findViewById(com.tencent.mm.R.id.djj);
        this.f98901i = this.f98895c.findViewById(com.tencent.mm.R.id.agq);
        this.f98896d.setText(str);
        this.f98898f.setText(str2);
        android.widget.ImageView imageView = (android.widget.ImageView) this.f98895c.findViewById(com.tencent.mm.R.id.a9n);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(imageView, c01.z1.r(), 0.5f);
        android.widget.ImageView imageView2 = (android.widget.ImageView) this.f98895c.findViewById(com.tencent.mm.R.id.agd);
        this.f98895c.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        this.f98895c.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f98894b, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f98894b, 1073741824));
        android.view.View view = this.f98895c;
        int i17 = this.f98894b;
        view.layout(0, 0, i17, i17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            imageView2.setImageResource(com.tencent.mm.R.color.f478866jc);
            e3Var.a(a(null));
            this.f98902j = false;
        } else {
            if (com.tencent.mm.plugin.exdevice.model.l3.Ai().f98986t == null) {
                com.tencent.mm.plugin.exdevice.model.l3.Ai().f98986t = n11.a.b();
            }
            com.tencent.mm.plugin.exdevice.model.l3.Ai().f98986t.m(str3, imageView2, new com.tencent.mm.plugin.exdevice.model.c3(this, e3Var));
        }
    }
}
