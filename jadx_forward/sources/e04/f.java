package e04;

/* loaded from: classes15.dex */
public class f implements com.p314xaae8f345.mm.p944x882e457a.u0, e04.k {

    /* renamed from: d, reason: collision with root package name */
    public android.app.ProgressDialog f327430d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Activity f327431e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.Bundle f327432f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f327433g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f327434h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f327435i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f327436m;

    /* renamed from: n, reason: collision with root package name */
    public int f327437n;

    /* renamed from: o, reason: collision with root package name */
    public int f327438o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f327439p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f327440q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f327441r;

    /* renamed from: s, reason: collision with root package name */
    public rz3.e f327442s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s f327443t;

    /* renamed from: u, reason: collision with root package name */
    public wu5.c f327444u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.TimerTask f327445v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f327446w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab f327447x;

    public f(com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab) {
        this.f327438o = -1;
        this.f327439p = false;
        this.f327440q = false;
        this.f327441r = null;
        this.f327444u = null;
        this.f327445v = null;
        this.f327447x = c25309x51dbc9ab;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s sVar = this.f327443t;
        if (sVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) sVar).u7(false, false, null);
        }
        android.app.ProgressDialog progressDialog = this.f327430d;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        wu5.c cVar = this.f327444u;
        if (cVar != null) {
            cVar.cancel(false);
        }
        java.util.TimerTask timerTask = this.f327445v;
        if (timerTask != null) {
            timerTask.cancel();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.app.Activity r25, rz3.e r26, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.s r27, java.lang.String r28, boolean r29, int r30, java.lang.String r31, android.os.Bundle r32, int r33, boolean r34, int r35, boolean r36, boolean r37, int r38, java.util.ArrayList r39) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.f.b(android.app.Activity, rz3.e, com.tencent.mm.plugin.scanner.view.s, java.lang.String, boolean, int, java.lang.String, android.os.Bundle, int, boolean, int, boolean, boolean, int, java.util.ArrayList):void");
    }

    public final void c(android.os.Bundle extra) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        android.app.Activity activity = this.f327431e;
        java.lang.String str = null;
        sz3.l0 l0Var = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17284x451cd422) activity).R1 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        byte[] byteArray = extra.getByteArray("key_scan_bar_code_circle_search_image_data");
        int i17 = extra.getInt("key_scan_bar_code_circle_search_image_format");
        int i18 = extra.getInt("key_scan_bar_code_circle_search_image_width");
        int i19 = extra.getInt("key_scan_bar_code_circle_search_image_height");
        int i27 = extra.getInt("key_scan_bar_code_circle_search_image_source");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807 c17258x2152d807 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17258x2152d807) extra.getParcelable("key_scan_bar_code_circle_search_normal_rect");
        android.graphics.RectF rectF = c17258x2152d807 != null ? new android.graphics.RectF(c17258x2152d807.f240144d, c17258x2152d807.f240145e, c17258x2152d807.f240146f, c17258x2152d807.f240147g) : null;
        java.lang.String string = extra.getString("key_scan_bar_code_circle_search_query");
        java.lang.String string2 = extra.getString("key_scan_bar_code_circle_search_ext");
        if (string2 != null) {
            byte[] bytes = string2.getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(bytes);
        } else {
            gVar = null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BarcodeStringHandler", "69Scene ScanProductDistributeResult, link " + string + " ,code " + this.f327436m + " ,to action MM_SCAN_GOODS_DISTRIBUTE_TO_CIRCLE_SEARCH");
        tg0.f1 f1Var = (tg0.f1) i95.n0.c(tg0.f1.class);
        android.app.Activity context = this.f327431e;
        int i28 = i27 == 1 ? 6 : 7;
        android.graphics.Point point = new android.graphics.Point(i18, i19);
        e04.e eVar = new e04.e(this, l0Var);
        sg0.e eVar2 = (sg0.e) f1Var;
        eVar2.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        eVar2.Ri(13, i28, tg0.e1.f500595e);
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19216xc2476b75.class);
        intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 13);
        intent.putExtra("entrance", i28);
        if (byteArray != null) {
            zv4.f fVar = zv4.f.f557993a;
            if (i17 != 1) {
                if (i17 == 2) {
                    str = fVar.f(byteArray, point);
                } else if (i17 != 3) {
                    str = i17 != 4 ? i17 != 5 ? "" : fVar.e(byteArray, point, true) : fVar.g(byteArray, point, true);
                }
            }
            android.graphics.Bitmap a17 = com.p314xaae8f345.mm.p786x600aa8b.e.a(byteArray, 0, byteArray.length);
            if (a17 != null) {
                str = fVar.d(a17, true);
            }
        }
        if (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20668xdde6b58c()) == 1) {
            intent.putExtra("image_url", "");
        } else {
            intent.putExtra("image_url", str != null ? str : "");
        }
        intent.putExtra("image_rect", rectF);
        intent.putExtra("scan_query", string);
        ok5.d.b(intent, "ui_status", new sg0.a(eVar), new ok5.h());
        if (gVar != null) {
            intent.putExtra("ext_info", gVar.i());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUIFromScanBarCode", "(Landroid/content/Context;I[BLandroid/graphics/Point;ILandroid/graphics/RectF;Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;Lcom/tencent/mm/feature/websearch/api/ICircleToSearchUIStatusListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/websearch/CircleToSearchFeatureService", "enterCircleToSearchUIFromScanBarCode", "(Landroid/content/Context;I[BLandroid/graphics/Point;ILandroid/graphics/RectF;Ljava/lang/String;Lcom/tencent/mm/protobuf/ByteString;Lcom/tencent/mm/feature/websearch/api/ICircleToSearchUIStatusListener;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void d(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2047x373aa5.r rVar) {
        if (this.f327443t == null || !this.f327439p) {
            android.app.ProgressDialog progressDialog = this.f327430d;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            this.f327430d = db5.e1.Q(this.f327431e, "", str, true, true, new e04.b(this, rVar));
            return;
        }
        a();
        this.f327445v = new e04.o2(this.f327443t, new e04.a(this), rVar);
        this.f327444u = ((ku5.t0) ku5.t0.f394148d).k(this.f327445v, 500L);
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03ba  */
    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo815x76e0bfae(int r35, int r36, java.lang.String r37, com.p314xaae8f345.mm.p944x882e457a.m1 r38) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e04.f.mo815x76e0bfae(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    public f(java.lang.String str, com.p314xaae8f345.p2891x34da02.C25309x51dbc9ab c25309x51dbc9ab) {
        this(c25309x51dbc9ab);
        this.f327446w = str;
    }
}
