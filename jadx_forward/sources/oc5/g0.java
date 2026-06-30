package oc5;

/* loaded from: classes12.dex */
public final class g0 {

    /* renamed from: s, reason: collision with root package name */
    public static final oc5.s f425949s = new oc5.s(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f425950a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f425951b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f425952c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f425953d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f425954e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f425955f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f425956g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f425957h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Long f425958i;

    /* renamed from: j, reason: collision with root package name */
    public long f425959j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f425960k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f425961l;

    /* renamed from: m, reason: collision with root package name */
    public long f425962m;

    /* renamed from: n, reason: collision with root package name */
    public ry3.l f425963n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f425964o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2657x35c67d.C21797x90c3a062 f425965p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2657x35c67d.C21796x57fbb041 f425966q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p2657x35c67d.C21795x97f447e7 f425967r;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeResultEventListener$1] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeFailEventListener$1] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mNotifyDealQBarStrResultListener$1] */
    public g0(android.app.Activity context, boolean z17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f425951b = true;
        this.f425953d = new java.util.HashMap();
        this.f425954e = new java.util.HashMap();
        this.f425955f = new java.util.HashMap();
        this.f425956g = new java.util.HashMap();
        this.f425957h = new java.util.HashMap();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        ?? r17 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeResultEventListener$1
            {
                this.f39173x3fe91575 = 812146647;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 c5886xd11a0be7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5886xd11a0be7 event = c5886xd11a0be7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                oc5.s.a(oc5.g0.f425949s, new oc5.z(oc5.g0.this, event));
                return false;
            }
        };
        this.f425965p = r17;
        ?? r27 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mScanQRCodeFailEventListener$1
            {
                this.f39173x3fe91575 = 1700407223;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 c5885x60bd3c7) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5885x60bd3c7 event = c5885x60bd3c7;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                oc5.s.a(oc5.g0.f425949s, new oc5.y(oc5.g0.this, event));
                return false;
            }
        };
        this.f425966q = r27;
        ?? r37 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063>(a0Var) { // from class: com.tencent.mm.ui.chatting.gallery.scan.ImageScanCodeManager$mNotifyDealQBarStrResultListener$1
            {
                this.f39173x3fe91575 = 1280295539;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 c5751x758c1063) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5751x758c1063 event = c5751x758c1063;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                oc5.g0 g0Var = oc5.g0.this;
                g0Var.getClass();
                java.lang.String str2 = event.f136072g.f88699a;
                if (str2 == null) {
                    str2 = "";
                }
                java.util.ArrayList<oc5.o> arrayList = (java.util.ArrayList) g0Var.f425957h.get(str2);
                if (arrayList != null) {
                    for (oc5.o oVar : arrayList) {
                        if (oVar != null) {
                            oVar.a(event);
                        }
                    }
                }
                g0Var.f425956g.remove(str2);
                return false;
            }
        };
        this.f425967r = r37;
        this.f425950a = context;
        this.f425951b = z17;
        this.f425952c = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageScanCodeManager", "scanCode enableScan: %b, talker: %s", java.lang.Boolean.valueOf(z17), str);
        if (z17) {
            r17.mo48813x58998cd();
            r27.mo48813x58998cd();
            r37.mo48813x58998cd();
        }
    }

    public final boolean a(oc5.t tVar) {
        if (tVar != null && tVar.f426014i) {
            return false;
        }
        return tVar != null && tVar.f426010e == 1;
    }

    public final void b(oc5.l0 codeResult, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 codePointInfo, oc5.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codeResult, "codeResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(codePointInfo, "codePointInfo");
        java.lang.String str = codePointInfo.f240152d;
        if (str == null) {
            str = "";
        }
        java.util.HashMap hashMap = this.f425957h;
        if (!hashMap.containsKey(str)) {
            hashMap.put(str, new java.util.ArrayList());
        }
        java.lang.Object obj = hashMap.get(str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        if (!((java.util.ArrayList) obj).contains(oVar)) {
            java.lang.Object obj2 = hashMap.get(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            ((java.util.ArrayList) obj2).add(oVar);
        }
        this.f425956g.put(str, codeResult);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197 c5292x67f91197 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5292x67f91197();
        android.app.Activity activity = this.f425950a;
        am.r3 r3Var = c5292x67f91197.f135612g;
        r3Var.f89314b = activity;
        r3Var.f89313a = codePointInfo.f240152d;
        r3Var.f89315c = codePointInfo.f240153e;
        r3Var.f89316d = codePointInfo.f240154f;
        r3Var.f89321i = 37;
        int i17 = codeResult.f425989f;
        if (i17 != -1) {
            r3Var.f89321i = i17;
        }
        r3Var.f89319g = 4;
        int i18 = codeResult.f425990g;
        if (i18 != -1) {
            r3Var.f89319g = i18;
        }
        r3Var.f89318f = codeResult.f425991h;
        r3Var.f89317e = codeResult.f425992i;
        r3Var.f89323k = codeResult.f425994k;
        r3Var.f89322j = codeResult.f425995l;
        r3Var.f89324l = codeResult.f425993j;
        r3Var.f89325m = codeResult.f425996m;
        r45.db0 db0Var = new r45.db0();
        r45.bx5 bx5Var = new r45.bx5();
        java.lang.String str2 = this.f425952c;
        bx5Var.f452666e = com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(str2) ? 4 : (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(str2) || c01.e2.R(str2)) ? 2 : c01.e2.G(str2) ? 3 : 1;
        db0Var.f453814d = bx5Var;
        java.lang.String str3 = codeResult.f425997n;
        db0Var.f453815e = str3 != null ? str3 : "";
        r3Var.f89328p = db0Var;
        r3Var.f89331s = codePointInfo.f240159n;
        r3Var.f89330r = codePointInfo.f240158m;
        r3Var.f89329q = codePointInfo.f240163r;
        r3Var.f89327o = codeResult.f425987d;
        c5292x67f91197.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(oc5.t r11, oc5.n r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc5.g0.c(oc5.t, oc5.n):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final android.graphics.Bitmap d(oc5.t tVar, db5.f0 f0Var, android.graphics.Bitmap bitmap, android.graphics.Point point) {
        android.graphics.Rect rect;
        android.graphics.Bitmap bitmap2 = null;
        android.graphics.Point point2 = bitmap != null ? new android.graphics.Point(bitmap.getWidth(), bitmap.getHeight()) : null;
        if (bitmap == null || point2 == null || point2.x != point.x || point2.y != point.y) {
            try {
                android.view.Window window = this.f425950a.getWindow();
                android.graphics.Bitmap b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(window != null ? window.getDecorView() : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageScanCodeManager", "getScreenCropBitmap try to screenShot, result: " + b07);
                tVar.f426013h = true;
                return b07;
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImageScanCodeManager", th6, "getScreenCropBitmap exception", new java.lang.Object[0]);
                return null;
            }
        }
        boolean z17 = f0Var instanceof android.view.View;
        android.graphics.PointF c17 = e04.i3.c(z17 ? (android.view.View) f0Var : null, 0.0f, 0.0f);
        android.graphics.PointF c18 = e04.i3.c(z17 ? (android.view.View) f0Var : null, (z17 ? (android.view.View) f0Var : null) != null ? r8.getMeasuredWidth() : 0.0f, (z17 ? (android.view.View) f0Var : null) != null ? r11.getMeasuredHeight() : 0.0f);
        if (c17 == null || c18 == null) {
            rect = new android.graphics.Rect(0, 0, point.x, point.y);
        } else {
            int max = java.lang.Integer.max((int) (c17.x * point.x), 0);
            int max2 = java.lang.Integer.max((int) (c17.y * point.y), 0);
            rect = new android.graphics.Rect(max, max2, java.lang.Integer.min(java.lang.Integer.max((int) (c18.x * point.x), max), point.x), java.lang.Integer.min(java.lang.Integer.max((int) (c18.y * point.y), max2), point.y));
        }
        rect.toString();
        if (rect.width() == 0 || rect.height() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageScanCodeManager", "getScreenCropBitmap cropRect invalid, use sourceBitmap");
            return bitmap;
        }
        try {
            bitmap2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.Z(bitmap, rect, false);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ImageScanCodeManager", th7, "getBitmapFromRect exception", new java.lang.Object[0]);
        }
        if (bitmap2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageScanCodeManager", "getScreenCropBitmap cropBitmap null, use sourceBitmap");
            return bitmap;
        }
        bitmap2.toString();
        tVar.f426013h = true;
        return bitmap2;
    }

    public final void e(oc5.t tVar) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        if (tVar.f426013h && tVar.f426015j && (bitmap = tVar.f426009d) != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            if (bitmap.isRecycled() || (bitmap2 = tVar.f426009d) == null) {
                return;
            }
            bitmap2.recycle();
        }
    }

    public final void f() {
        if (this.f425951b) {
            mo48814x2efc64();
            mo48814x2efc64();
            mo48814x2efc64();
        }
        oc5.s.a(f425949s, new oc5.d0(this));
        java.util.Set<java.lang.String> keySet = this.f425956g.keySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
        for (java.lang.String str : keySet) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831 c5225x893b831 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5225x893b831();
            android.app.Activity activity = this.f425950a;
            am.p1 p1Var = c5225x893b831.f135558g;
            p1Var.f89127b = activity;
            p1Var.f89126a = str;
            c5225x893b831.e();
        }
        this.f425957h.clear();
    }

    public final void g(long j17, java.lang.String str) {
        if (this.f425964o) {
            return;
        }
        this.f425964o = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportCodeMenuItemExpose id: ");
        sb6.append(j17);
        sb6.append(", source: ");
        sb6.append(str);
        sb6.append(", codeItemDelayShowCost: ");
        sb6.append(this.f425962m);
        sb6.append(", initCost: ");
        ry3.l lVar = this.f425963n;
        sb6.append(lVar != null ? java.lang.Long.valueOf(lVar.f483055a) : null);
        sb6.append(", decodeCost: ");
        ry3.l lVar2 = this.f425963n;
        sb6.append(lVar2 != null ? java.lang.Long.valueOf(lVar2.f483056b) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageScanCodeManager", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Long.valueOf(j17);
        oc5.p[] pVarArr = oc5.p.f426003d;
        objArr[1] = 1;
        objArr[2] = java.lang.Long.valueOf(this.f425962m);
        ry3.l lVar3 = this.f425963n;
        objArr[3] = java.lang.Long.valueOf(lVar3 != null ? lVar3.f483055a : -2L);
        ry3.l lVar4 = this.f425963n;
        objArr[4] = java.lang.Long.valueOf(lVar4 != null ? lVar4.f483056b : -1L);
        g0Var.d(37109, objArr);
    }

    public final void h(android.view.View view, long j17, java.lang.String str, java.lang.String str2, android.graphics.Bitmap bitmap, boolean z17, int i17, boolean z18, oc5.n nVar) {
        if (this.f425951b) {
            if (str2 == null || str2.length() == 0) {
                return;
            }
            oc5.s.a(f425949s, new oc5.e0(this, view, j17, str, str2, bitmap, z17, i17, z18, nVar));
        }
    }
}
