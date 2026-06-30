package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/x2;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class x2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f225356g = "";

    /* renamed from: h, reason: collision with root package name */
    public static final jm4.u5 f225357h;

    static {
        int i17 = jm4.w5.f381970d;
        jm4.u5 u5Var = (jm4.u5) p3380x6a61f93.p3381xf512d0a5.C30462x21b41440.m169136x21b0d463();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u5Var);
        f225357h = u5Var;
    }

    public static final java.lang.String A(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2 x2Var, bw5.rq0 rq0Var) {
        x2Var.getClass();
        int i17 = (int) ((rq0Var.f114189g * 255.0f) + 0.5f);
        java.lang.String format = java.lang.String.format("#%02X%02X%02X%02X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) ((rq0Var.f114186d * 255.0f) + 0.5f)), java.lang.Integer.valueOf((int) ((rq0Var.f114187e * 255.0f) + 0.5f)), java.lang.Integer.valueOf((int) ((rq0Var.f114188f * 255.0f) + 0.5f)), java.lang.Integer.valueOf(i17)}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    public final java.lang.String B(android.graphics.Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return "#00000000";
        }
        if (bitmap.getWidth() * bitmap.getHeight() > 500000) {
            double width = 500000.0d / (bitmap.getWidth() * bitmap.getHeight());
            bitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * width), (int) (bitmap.getHeight() * width), true);
        }
        int width2 = bitmap.getWidth() * bitmap.getHeight();
        int width3 = bitmap.getWidth();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        for (int i27 = 0; i27 < width3; i27++) {
            int height = bitmap.getHeight();
            for (int i28 = 0; i28 < height; i28++) {
                int pixel = bitmap.getPixel(i27, i28);
                i17 += android.graphics.Color.red(pixel);
                i18 += android.graphics.Color.green(pixel);
                i19 += android.graphics.Color.blue(pixel);
            }
        }
        java.lang.String format = java.lang.String.format("#%02X%02X%02XFF", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i17 / width2), java.lang.Integer.valueOf(i18 / width2), java.lang.Integer.valueOf(i19 / width2)}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.graphics.Bitmap r7, java.lang.String r8) {
        /*
            r6 = this;
            kotlin.jvm.internal.h0 r0 = new kotlin.jvm.internal.h0
            r0.<init>()
            java.lang.String r1 = "#00000000"
            r0.f391656d = r1
            java.lang.String r1 = "color"
            if (r7 == 0) goto La9
            int r2 = r7.getWidth()
            if (r2 == 0) goto La9
            int r2 = r7.getHeight()
            if (r2 != 0) goto L1b
            goto La9
        L1b:
            boolean r2 = r7.isRecycled()
            java.lang.String r3 = "LiteAppJsApiGetThemeColorForImage"
            if (r2 == 0) goto L29
            java.lang.String r7 = "bitmap2ByteArray in bitmap is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r7)
            goto L3a
        L29:
            android.graphics.Bitmap$Config r2 = r7.getConfig()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            if (r2 == r4) goto L3c
            java.lang.String r7 = "bitmap2ByteArray bitmap config invalid: %s"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r7, r2)
        L3a:
            r7 = 0
            goto L81
        L3c:
            int r2 = r7.getByteCount()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            r7.copyPixelsToBuffer(r2)
            byte[] r3 = r2.array()
            int r2 = r2.arrayOffset()
            if (r2 <= 0) goto L5d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)
            int r4 = r3.length
            e06.k r2 = e06.p.m(r2, r4)
            byte[] r3 = kz5.z.o0(r3, r2)
        L5d:
            bw5.tq0 r2 = new bw5.tq0
            r2.<init>()
            int r4 = r7.getWidth()
            r2.f115113d = r4
            boolean[] r4 = r2.f115116g
            r5 = 1
            r4[r5] = r5
            int r7 = r7.getHeight()
            r2.f115114e = r7
            r7 = 2
            r4[r7] = r5
            r7 = 4
            r2.f115115f = r7
            r7 = 3
            r4[r7] = r5
            jz5.l r7 = new jz5.l
            r7.<init>(r3, r2)
        L81:
            if (r7 != 0) goto L94
            com.tencent.mm.plugin.lite.api.o r7 = r6.f224976f
            java.lang.Object r8 = r0.f391656d
            jz5.l r0 = new jz5.l
            r0.<init>(r1, r8)
            java.util.Map r8 = kz5.b1.e(r0)
            r7.b(r8)
            return
        L94:
            java.lang.Object r1 = r7.f384366d
            byte[] r1 = (byte[]) r1
            java.lang.Object r7 = r7.f384367e
            bw5.tq0 r7 = (bw5.tq0) r7
            com.tencent.mm.plugin.lite.jsapi.comms.v2 r2 = new com.tencent.mm.plugin.lite.jsapi.comms.v2
            r2.<init>(r6, r0, r8)
            jm4.u5 r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.f225357h
            jm4.w5 r8 = (jm4.w5) r8
            r8.a(r1, r7, r2)
            return
        La9:
            com.tencent.mm.plugin.lite.api.o r7 = r6.f224976f
            java.lang.Object r8 = r0.f391656d
            jz5.l r0 = new jz5.l
            r0.<init>(r1, r8)
            java.util.Map r8 = kz5.b1.e(r0)
            r7.b(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.x2.C(android.graphics.Bitmap, java.lang.String):void");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        if (jSONObject == null) {
            this.f224976f.a("fail_no param");
            return;
        }
        f225356g = "";
        java.lang.String optString = jSONObject.optString("type");
        boolean z18 = true;
        if (!(optString == null || optString.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetThemeColorForImage", "Invoke type:%s", optString);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "ting")) {
                java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
                f225356g = optString2;
            }
        }
        java.lang.String optString3 = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        if (!(optString3 == null || optString3.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetThemeColorForImage", "Invoke localId:%s", optString3);
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            jd.c cVar = this.f224975e;
            java.lang.String zj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).zj(cVar.f380558b, cVar.f380557a, optString3);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj6)) {
                this.f224976f.a("path or localID not exist");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppJsApiGetThemeColorForImage", "cannot find localPath");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(zj6);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetThemeColorForImage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeFile = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
            yj0.a.e(obj, decodeFile, "com/tencent/mm/plugin/lite/jsapi/comms/LiteAppJsApiGetThemeColorForImage", "invoke", "(Ljava/lang/String;Lorg/json/JSONObject;Z)V", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
            if (!(f225356g.length() > 0)) {
                java.lang.String B = B(decodeFile);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetThemeColorForImage", "color:%s", B);
                this.f224976f.b(kz5.b1.e(new jz5.l("color", B)));
                return;
            }
            C(decodeFile, f225356g);
        }
        java.lang.String optString4 = jSONObject.optString("url");
        if (optString4 != null && optString4.length() != 0) {
            z18 = false;
        }
        if (z18) {
            this.f224976f.a("fail_no url");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiGetThemeColorForImage", "Invoke url:%s", optString4);
            ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Ai(optString4, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.w2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p
    public int z() {
        return 1;
    }
}
