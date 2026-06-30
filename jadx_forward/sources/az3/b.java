package az3;

/* loaded from: classes9.dex */
public class b extends rz3.g implements rz3.e, com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: g, reason: collision with root package name */
    public int f97696g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f97697h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f97698i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f97699m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7054xe161b683 f97700n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Boolean f97701o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f97702p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f97703q;

    /* renamed from: r, reason: collision with root package name */
    public final zy3.j f97704r = new az3.a(this);

    public b(int i17, com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 abstractTextureViewSurfaceTextureListenerC25495xcec752e2, rz3.f fVar, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7054xe161b683 c7054xe161b683, java.lang.Boolean bool, java.lang.String str, java.lang.String str2) {
        this.f97701o = java.lang.Boolean.FALSE;
        this.f483342d = abstractTextureViewSurfaceTextureListenerC25495xcec752e2;
        this.f483343e = fVar;
        this.f97700n = c7054xe161b683;
        this.f483344f = abstractTextureViewSurfaceTextureListenerC25495xcec752e2.getContext();
        this.f97701o = bool;
        this.f97702p = str;
        this.f97703q = str2;
        if (bool.booleanValue()) {
            try {
                this.f97697h = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a("h5_" + new org.json.JSONObject(str2).getJSONObject("busi_base_info").getString("session_key"));
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankCardHandler", e17, "", new java.lang.Object[0]);
            }
        } else {
            this.f97697h = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r() + java.lang.System.currentTimeMillis());
        }
        gm0.j1.d().a(2693, this);
    }

    @Override // rz3.e
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankCardHandler", "notify Event: %d", java.lang.Integer.valueOf(i17));
        if (i17 == 1 || i17 == 2) {
            this.f483342d.f();
        } else if (i17 == 3) {
            this.f483343e.x();
        } else {
            if (i17 != 5) {
                return;
            }
            this.f483342d.e();
        }
    }

    @Override // rz3.a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(long j17, android.os.Bundle bundle) {
        if (bundle != null) {
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) bundle.getParcelable("param_card_bitmap");
            this.f97699m = bitmap;
            if (bitmap == null) {
                a(2, null);
                return;
            }
            if (this.f97701o.booleanValue()) {
                java.lang.String str = this.f97697h;
                byte[] a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(this.f97699m);
                int i17 = this.f97696g;
                this.f97696g = i17 + 1;
                new zy3.k(3, 101, str, a17, i17, this.f97702p, this.f97703q, this.f97704r);
                return;
            }
            java.lang.String str2 = this.f97697h;
            byte[] a18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.a(this.f97699m);
            int i18 = this.f97696g;
            this.f97696g = i18 + 1;
            gm0.j1.d().g(new zy3.l(3, 101, str2, a18, i18));
        }
    }

    @Override // rz3.a
    /* renamed from: destroy */
    public void mo9410x5cd39ffa() {
        gm0.j1.d().q(2693, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankCardHandler", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            a(2, null);
            return;
        }
        zy3.l lVar = (zy3.l) m1Var;
        if (this.f97697h.equals(lVar.f559196e)) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = lVar.f559195d.f152244b.f152233a;
            r45.ld ldVar = fVar != null ? ((r45.pl) fVar).f464680d : null;
            if (ldVar != null) {
                java.lang.String str2 = ldVar.f460850e.f473988d;
                r45.va5 va5Var = ldVar.f460850e.f473989e;
                r45.i90 i90Var = va5Var.f469571h;
                int i19 = (int) i90Var.f458370d;
                int i27 = (int) i90Var.f458371e;
                r45.i90 i90Var2 = va5Var.f469573m;
                android.graphics.Rect rect = new android.graphics.Rect(i19, i27, (int) i90Var2.f458370d, (int) i90Var2.f458371e);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankCardHandler", "cropRect %s", rect);
                android.graphics.Bitmap bitmap = this.f97699m;
                if (rect.left >= 0 && rect.top >= 0 && rect.width() > 0 && rect.width() <= bitmap.getWidth() && rect.height() > 0 && rect.height() <= bitmap.getHeight()) {
                    android.graphics.Bitmap bitmap2 = this.f97699m;
                    int i28 = rect.left;
                    int i29 = rect.top;
                    int width = rect.width();
                    int height = rect.height();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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
                    if (createBitmap != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                        if (this.f97698i) {
                            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17295x7fb3825a.f240818h;
                            if (!createBitmap.isRecycled() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                                android.content.Intent intent = new android.content.Intent();
                                android.content.Context mo24762xef326bb9 = ((h45.q) i95.n0.c(h45.q.class)).mo24754xf742bfee() ? ((h45.q) i95.n0.c(h45.q.class)).mo24762xef326bb9() : null;
                                if (mo24762xef326bb9 == null) {
                                    mo24762xef326bb9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                    intent.addFlags(268435456);
                                }
                                intent.setClass(mo24762xef326bb9, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17295x7fb3825a.class);
                                intent.putExtra("_card_num_", str2);
                                java.lang.String str3 = "_image_cache_key_" + str2;
                                ((java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17295x7fb3825a.f240818h).put(str3, createBitmap);
                                intent.putExtra("_image_cache_key_", str3);
                                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                arrayList2.add(intent);
                                java.util.Collections.reverse(arrayList2);
                                android.content.Context context = mo24762xef326bb9;
                                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "startConfirm", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                mo24762xef326bb9.startActivity((android.content.Intent) arrayList2.get(0));
                                yj0.a.f(context, "com/tencent/mm/plugin/scanner/ui/ConfirmScanBankCardResultUI", "startConfirm", "(Landroid/graphics/Bitmap;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            }
                        } else {
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94 c5961x66a09f94 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5961x66a09f94();
                            am.qs qsVar = c5961x66a09f94.f136260g;
                            qsVar.f89274a = str2;
                            qsVar.f89275b = createBitmap;
                            c5961x66a09f94.e();
                        }
                        this.f97700n.f143652d = 3L;
                        a(3, null);
                        return;
                    }
                }
            }
        }
        a(2, null);
    }
}
