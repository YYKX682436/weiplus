package az3;

/* loaded from: classes9.dex */
public class b extends rz3.g implements rz3.e, com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public int f16163g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f16164h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f16165i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f16166m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.WCPayScanBankCardNumberStruct f16167n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean f16168o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f16169p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f16170q;

    /* renamed from: r, reason: collision with root package name */
    public final zy3.j f16171r = new az3.a(this);

    public b(int i17, com.tencent.scanlib.ui.ScanView scanView, rz3.f fVar, com.tencent.mm.autogen.mmdata.rpt.WCPayScanBankCardNumberStruct wCPayScanBankCardNumberStruct, java.lang.Boolean bool, java.lang.String str, java.lang.String str2) {
        this.f16168o = java.lang.Boolean.FALSE;
        this.f401809d = scanView;
        this.f401810e = fVar;
        this.f16167n = wCPayScanBankCardNumberStruct;
        this.f401811f = scanView.getContext();
        this.f16168o = bool;
        this.f16169p = str;
        this.f16170q = str2;
        if (bool.booleanValue()) {
            try {
                this.f16164h = com.tencent.mm.sdk.platformtools.w2.a("h5_" + new org.json.JSONObject(str2).getJSONObject("busi_base_info").getString("session_key"));
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankCardHandler", e17, "", new java.lang.Object[0]);
            }
        } else {
            this.f16164h = com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r() + java.lang.System.currentTimeMillis());
        }
        gm0.j1.d().a(2693, this);
    }

    @Override // rz3.e
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankCardHandler", "notify Event: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 1 || i17 == 2) {
            this.f401809d.f();
        } else if (i17 == 3) {
            this.f401810e.x();
        } else {
            if (i17 != 5) {
                return;
            }
            this.f401809d.e();
        }
    }

    @Override // rz3.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(long j17, android.os.Bundle bundle) {
        if (bundle != null) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable("param_card_bitmap");
            this.f16166m = bitmap;
            if (bitmap == null) {
                a(2, null);
                return;
            }
            if (this.f16168o.booleanValue()) {
                java.lang.String str = this.f16164h;
                byte[] a17 = com.tencent.mm.sdk.platformtools.x.a(this.f16166m);
                int i17 = this.f16163g;
                this.f16163g = i17 + 1;
                new zy3.k(3, 101, str, a17, i17, this.f16169p, this.f16170q, this.f16171r);
                return;
            }
            java.lang.String str2 = this.f16164h;
            byte[] a18 = com.tencent.mm.sdk.platformtools.x.a(this.f16166m);
            int i18 = this.f16163g;
            this.f16163g = i18 + 1;
            gm0.j1.d().g(new zy3.l(3, 101, str2, a18, i18));
        }
    }

    @Override // rz3.a
    public void destroy() {
        gm0.j1.d().q(2693, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.BankCardHandler", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            a(2, null);
            return;
        }
        zy3.l lVar = (zy3.l) m1Var;
        if (this.f16164h.equals(lVar.f477663e)) {
            com.tencent.mm.protobuf.f fVar = lVar.f477662d.f70711b.f70700a;
            r45.ld ldVar = fVar != null ? ((r45.pl) fVar).f383147d : null;
            if (ldVar != null) {
                java.lang.String str2 = ldVar.f379317e.f392455d;
                r45.va5 va5Var = ldVar.f379317e.f392456e;
                r45.i90 i90Var = va5Var.f388038h;
                int i19 = (int) i90Var.f376837d;
                int i27 = (int) i90Var.f376838e;
                r45.i90 i90Var2 = va5Var.f388040m;
                android.graphics.Rect rect = new android.graphics.Rect(i19, i27, (int) i90Var2.f376837d, (int) i90Var2.f376838e);
                com.tencent.mars.xlog.Log.i("MicroMsg.BankCardHandler", "cropRect %s", rect);
                android.graphics.Bitmap bitmap = this.f16166m;
                if (rect.left >= 0 && rect.top >= 0 && rect.width() > 0 && rect.width() <= bitmap.getWidth() && rect.height() > 0 && rect.height() <= bitmap.getHeight()) {
                    android.graphics.Bitmap bitmap2 = this.f16166m;
                    int i28 = rect.left;
                    int i29 = rect.top;
                    int width = rect.width();
                    int height = rect.height();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(height));
                    arrayList.add(java.lang.Integer.valueOf(width));
                    arrayList.add(java.lang.Integer.valueOf(i29));
                    arrayList.add(java.lang.Integer.valueOf(i28));
                    arrayList.add(bitmap2);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/scanner/card/result/BankCardHandler", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                    yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/scanner/card/result/BankCardHandler", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                    if (createBitmap != null && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        if (this.f16165i) {
                            java.util.Map map = com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI.f159285h;
                            if (!createBitmap.isRecycled() && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                android.content.Intent intent = new android.content.Intent();
                                android.content.Context crossActivity = ((h45.q) i95.n0.c(h45.q.class)).TenPaySDKABTestKindaEnable() ? ((h45.q) i95.n0.c(h45.q.class)).getCrossActivity() : null;
                                if (crossActivity == null) {
                                    crossActivity = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                    intent.addFlags(268435456);
                                }
                                intent.setClass(crossActivity, com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI.class);
                                intent.putExtra("_card_num_", str2);
                                java.lang.String str3 = "_image_cache_key_" + str2;
                                ((java.util.HashMap) com.tencent.mm.plugin.scanner.ui.ConfirmScanBankCardResultUI.f159285h).put(str3, createBitmap);
                                intent.putExtra("_image_cache_key_", str3);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(intent);
                                java.util.Collections.reverse(arrayList2);
                                android.content.Context context = crossActivity;
                                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "startConfirm", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                crossActivity.startActivity((android.content.Intent) arrayList2.get(0));
                                yj0.a.f(context, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "startConfirm", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        } else {
                            com.tencent.mm.autogen.events.ScanBankCardResultEvent scanBankCardResultEvent = new com.tencent.mm.autogen.events.ScanBankCardResultEvent();
                            am.qs qsVar = scanBankCardResultEvent.f54727g;
                            qsVar.f7741a = str2;
                            qsVar.f7742b = createBitmap;
                            scanBankCardResultEvent.e();
                        }
                        this.f16167n.f62119d = 3L;
                        a(3, null);
                        return;
                    }
                }
            }
        }
        a(2, null);
    }
}
