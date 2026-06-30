package ak4;

/* loaded from: classes11.dex */
public final class d extends android.text.style.ReplacementSpan implements gb5.a, xe0.h0 {
    public float A;
    public int B;
    public int C;
    public boolean D;
    public ak4.i E;
    public long F;
    public boolean G;
    public java.lang.String H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f5602J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public final java.lang.String P;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f5603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f5604e;

    /* renamed from: f, reason: collision with root package name */
    public final bi4.d f5605f;

    /* renamed from: g, reason: collision with root package name */
    public final bi4.c f5606g;

    /* renamed from: h, reason: collision with root package name */
    public final xe0.u0 f5607h;

    /* renamed from: i, reason: collision with root package name */
    public mj4.h f5608i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnClickListener f5609m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5610n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5611o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5612p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f5613q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5614r;

    /* renamed from: s, reason: collision with root package name */
    public long f5615s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f5616t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.ref.WeakReference f5617u;

    /* renamed from: v, reason: collision with root package name */
    public final ak4.k f5618v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f5619w;

    /* renamed from: x, reason: collision with root package name */
    public final float f5620x;

    /* renamed from: y, reason: collision with root package name */
    public final float f5621y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f5622z;

    public d(android.view.View view, java.lang.String str, java.lang.String str2, bi4.d iconType, bi4.c cVar, xe0.u0 style, mj4.h hVar, android.view.View.OnClickListener onClickListener) {
        kotlin.jvm.internal.o.g(iconType, "iconType");
        kotlin.jvm.internal.o.g(style, "style");
        this.f5603d = str;
        this.f5604e = str2;
        this.f5605f = iconType;
        this.f5606g = cVar;
        this.f5607h = style;
        this.f5608i = hVar;
        this.f5609m = onClickListener;
        this.f5610n = c(hVar, null);
        this.f5618v = new ak4.k();
        this.f5619w = l(this.f5608i);
        float f17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density;
        this.f5620x = f17;
        float f18 = style.f453804e;
        this.f5621y = f18 <= 0.0f ? (style.f453800a * 0.5f) + (f17 * 4.0f) : f18;
        this.f5622z = style.f453809j != xe0.p0.f453767d;
        this.A = -1.0f;
        this.C = -1;
        this.P = "MicroMsg.TextStatus.TSItemSpan@" + hashCode();
        this.f5617u = view != null ? new java.lang.ref.WeakReference(view) : null;
        mj4.h hVar2 = this.f5608i;
        h(hVar2 != null ? ((mj4.k) hVar2).z() : false, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        new android.graphics.Rect();
    }

    @Override // xe0.h0
    public boolean a(int i17, int i18) {
        return d(i17, i18);
    }

    @Override // xe0.h0
    public void b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        onClick(view);
    }

    public final boolean c(mj4.h hVar, java.lang.Boolean bool) {
        boolean booleanValue = bool != null ? bool.booleanValue() : hVar != null ? ((mj4.k) hVar).z() : false;
        java.lang.String str = this.f5603d;
        if (str == null || r26.n0.N(str)) {
            return booleanValue;
        }
        if (str != null ? kotlin.jvm.internal.o.b(str, en1.a.a()) : false) {
            return true;
        }
        return booleanValue;
    }

    public final boolean d(int i17, int i18) {
        if (g()) {
            return false;
        }
        if (!this.N) {
            com.tencent.mars.xlog.Log.i(this.P, "[TSSpanHit] containsPoint skip: lastDrawValid=false");
            return false;
        }
        boolean z17 = this.f5610n;
        xe0.u0 u0Var = this.f5607h;
        xe0.t0 t0Var = z17 ? u0Var.f453817r : u0Var.f453816q;
        int i19 = this.f5602J - t0Var.f453797b;
        int i27 = this.K - t0Var.f453796a;
        int i28 = this.L + t0Var.f453799d;
        int i29 = this.M + t0Var.f453798c;
        if (i19 <= i17 && i17 <= i28) {
            return i27 <= i18 && i18 <= i29;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0133  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r18, java.lang.CharSequence r19, int r20, int r21, float r22, int r23, int r24, int r25, android.graphics.Paint r26) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak4.d.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:15:0x0040, B:18:0x004a, B:20:0x0060, B:22:0x0067, B:24:0x006b, B:26:0x0073, B:29:0x007b, B:31:0x0091, B:33:0x0095, B:38:0x00a1, B:40:0x00b7, B:42:0x00c8, B:44:0x00d0, B:67:0x00cd), top: B:14:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7 A[Catch: all -> 0x0196, TryCatch #2 {all -> 0x0196, blocks: (B:15:0x0040, B:18:0x004a, B:20:0x0060, B:22:0x0067, B:24:0x006b, B:26:0x0073, B:29:0x007b, B:31:0x0091, B:33:0x0095, B:38:0x00a1, B:40:0x00b7, B:42:0x00c8, B:44:0x00d0, B:67:0x00cd), top: B:14:0x0040 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak4.d.e():void");
    }

    public final android.view.View f() {
        java.lang.ref.WeakReference weakReference = this.f5617u;
        if (weakReference != null) {
            return (android.view.View) weakReference.get();
        }
        return null;
    }

    public final boolean g() {
        java.lang.String str = this.f5604e;
        if (str == null || r26.n0.N(str)) {
            return this.f5619w.length() == 0;
        }
        return false;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(android.graphics.Paint paint, java.lang.CharSequence charSequence, int i17, int i18, android.graphics.Paint.FontMetricsInt fontMetricsInt) {
        java.lang.String str;
        java.lang.String str2;
        pj4.o1 j17;
        kotlin.jvm.internal.o.g(paint, "paint");
        if (g()) {
            return 0;
        }
        ak4.i i19 = i(paint);
        boolean z17 = this.f5607h.f453807h;
        if (fontMetricsInt != null) {
            android.graphics.Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i27 = fontMetricsInt2.descent;
            int i28 = fontMetricsInt2.ascent;
            int i29 = i28 + ((i27 - i28) / 2);
            int i37 = i19.f5629b / 2;
            int i38 = i29 - i37;
            fontMetricsInt.ascent = i38;
            fontMetricsInt.top = i38;
            int i39 = i29 + i37;
            fontMetricsInt.bottom = i39;
            fontMetricsInt.descent = i39;
        }
        e();
        if (!this.I) {
            android.view.View f17 = f();
            java.lang.String str3 = null;
            android.widget.TextView textView = f17 instanceof android.widget.TextView ? (android.widget.TextView) f17 : null;
            if (textView != null) {
                java.lang.String str4 = this.f5604e;
                if (str4 != null && (j17 = bk4.f0.f21465a.j(str4)) != null) {
                    java.lang.String c17 = bk4.g0.c(j17);
                    if (!r26.n0.N(c17)) {
                        str3 = c17;
                    }
                }
                if (str3 != null) {
                    java.lang.CharSequence contentDescription = textView.getContentDescription();
                    if (contentDescription == null || (str = contentDescription.toString()) == null) {
                        str = "";
                    }
                    if (r26.n0.N(str)) {
                        str2 = str3;
                    } else {
                        str2 = str + ", " + str3;
                    }
                    textView.setContentDescription(str2);
                    this.H = str3;
                    this.I = true;
                }
            }
        }
        return i19.f5628a;
    }

    public final void h(boolean z17, java.lang.String str) {
        if (this.f5611o) {
            return;
        }
        java.lang.String str2 = this.f5603d;
        if (str2 == null || r26.n0.N(str2)) {
            return;
        }
        if ((str2 != null ? kotlin.jvm.internal.o.b(str2, en1.a.a()) : false) && !z17) {
            this.f5611o = true;
            com.tencent.mars.xlog.Log.i(this.P, "[TSItemSpan] isRead selfOverride username=" + str2 + " rawIsRead=false finalIsRead=true scene=" + str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ak4.i i(android.graphics.Paint r33) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak4.d.i(android.graphics.Paint):ak4.i");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0051 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0272 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x027e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01af A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0261 A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026d A[Catch: all -> 0x0299, TryCatch #0 {all -> 0x0299, blocks: (B:3:0x0016, B:5:0x001a, B:10:0x0026, B:12:0x002e, B:14:0x0038, B:16:0x0046, B:18:0x005f, B:19:0x0067, B:23:0x007a, B:26:0x0087, B:29:0x008e, B:32:0x00ca, B:35:0x00d7, B:37:0x00e1, B:38:0x00eb, B:40:0x00f7, B:41:0x00f9, B:44:0x010e, B:49:0x0165, B:51:0x0272, B:59:0x0294, B:70:0x017f, B:73:0x0195, B:75:0x01a3, B:80:0x01af, B:82:0x01be, B:85:0x0204, B:86:0x0225, B:89:0x023b, B:91:0x0261, B:96:0x026d, B:99:0x01c7, B:102:0x01cc, B:104:0x01d2, B:107:0x01d9, B:110:0x01fb, B:111:0x01e2, B:113:0x01f1, B:127:0x0051, B:129:0x0055), top: B:2:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak4.d.j():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(java.lang.String str, boolean z17) {
        android.view.View f17 = f();
        java.lang.String str2 = this.f5603d;
        java.lang.String str3 = this.P;
        if (f17 == 0) {
            com.tencent.mars.xlog.Log.w(str3, "[TSItemSpan] refreshHost skip: host null/dead u=" + str2 + " reason=" + str);
            return;
        }
        if (f17 instanceof bi4.j0) {
            com.tencent.mars.xlog.Log.i(str3, "[TSItemSpan] refreshHost via IRefreshContent u=" + str2 + " reason=" + str + " host=" + f17.getClass().getSimpleName());
            ((bi4.j0) f17).a();
            return;
        }
        com.tencent.mars.xlog.Log.i(str3, "[TSItemSpan] refreshHost via View.post u=" + str2 + " reason=" + str + " host=" + f17.getClass().getSimpleName() + " requestLayout=" + z17);
        f17.post(new ak4.c(z17, f17));
    }

    public final java.lang.String l(mj4.h hVar) {
        java.lang.String str = this.f5604e;
        boolean z17 = str == null || r26.n0.N(str);
        java.lang.String str2 = this.f5603d;
        java.lang.String str3 = this.P;
        java.lang.String str4 = "";
        if (z17) {
            com.tencent.mars.xlog.Log.i(str3, "resolveWording empty: reason=iconId-null username=" + str2);
            return "";
        }
        pj4.o1 j17 = bk4.f0.f21465a.j(str);
        if (j17 == null) {
            com.tencent.mars.xlog.Log.i(str3, "resolveWording empty: reason=iconItem-null iconId=" + str + " username=" + str2);
            return "";
        }
        if (bk4.i.a().a(this.f5604e)) {
            java.lang.String str5 = hVar != null ? xe0.j0.a(hVar, false, 1, null).f355218i : null;
            if (str5 != null) {
                str4 = str5;
            }
        }
        if (r26.n0.N(str4)) {
            str4 = bk4.g0.c(j17);
        }
        com.tencent.mars.xlog.Log.i(str3, "resolveWording iconId=" + str + " desc='" + str4 + "' username=" + str2);
        return str4;
    }

    public final void onClick(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        android.view.View.OnClickListener onClickListener = this.f5609m;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // gb5.a
    public void setIsPressed(boolean z17) {
        if (this.f5612p == z17) {
            return;
        }
        this.f5612p = z17;
        android.view.View f17 = f();
        if (f17 != null) {
            f17.invalidate();
        }
    }
}
