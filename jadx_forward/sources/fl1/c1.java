package fl1;

/* loaded from: classes7.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f345262a;

    /* renamed from: e, reason: collision with root package name */
    public int f345266e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f345267f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f345268g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f345269h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f345270i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f345271j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.RatingBar f345272k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f345273l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f345274m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.LinearLayout f345275n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i f345276o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f345263b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f345264c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f345265d = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f345277p = false;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        fa1.s sVar = (fa1.s) c0Var.z1(fa1.s.class);
        if (sVar != null) {
            this.f345276o = ((fa1.a) sVar).L;
        }
    }

    public void a() {
        android.app.Dialog dialog = this.f345270i;
        if (dialog != null) {
            dialog.dismiss();
            this.f345270i = null;
        }
    }

    public final android.app.Dialog b(android.content.Context context, boolean z17) {
        sp.b bVar = new sp.b(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575457q);
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(z17);
        android.view.Window window = bVar.getWindow();
        if (window != null) {
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 81;
            attributes.height = -2;
            attributes.width = -1;
            window.setAttributes(attributes);
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575456p);
        }
        return bVar;
    }

    public final void c(int i17, int i18) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f345267f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "operateReport, no app id");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "operateReport, appId:%s, eventId:%s, session:%s, score:%s, scene:%s, result:%s, path:%s", this.f345267f, java.lang.Integer.valueOf(i17), this.f345268g, java.lang.Integer.valueOf(this.f345264c), java.lang.Integer.valueOf(this.f345266e), java.lang.Integer.valueOf(i18), this.f345269h);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16176, this.f345267f, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1()), java.lang.Integer.valueOf(this.f345264c), this.f345268g, this.f345269h, java.lang.Integer.valueOf(this.f345266e), java.lang.Integer.valueOf(i18));
        }
    }

    public final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar = this.f345276o;
        if (iVar == null) {
            return false;
        }
        r45.bg7 bg7Var = iVar.f169399f;
        if (bg7Var == null || (linkedList = bg7Var.f452285f) == null || linkedList.size() < 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game evaluate dialog: no config");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.mo68477x336bdfd8(1237L, 0L, 1L, false);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(o6Var.f156336n).f167254n);
        this.f345265d = currentTimeMillis;
        if (currentTimeMillis >= bg7Var.f452287h * 1000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game evaluate dialog: time limit");
        g0Var.mo68477x336bdfd8(1237L, 1L, 1L, false);
        return false;
    }

    public final boolean e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar = this.f345276o;
        if (iVar == null) {
            return false;
        }
        r45.dg7 dg7Var = iVar.f169400g;
        if (dg7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game review dialog: no config");
            return false;
        }
        ch1.b.f122809a.a(o6Var.u0().f158811d, o6Var.u0().L, o6Var.u0().M, 0L, 3L, dg7Var.f453993n);
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(o6Var.f156336n).f167254n);
        this.f345265d = currentTimeMillis;
        if (currentTimeMillis >= dg7Var.f453992m * 1000) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game review dialog: time limit");
        return false;
    }

    public final void f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.Runnable runnable) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar = this.f345276o;
        r45.bg7 bg7Var = iVar.f169399f;
        android.app.Dialog dialog = null;
        if (bg7Var == null || (linkedList = bg7Var.f452285f) == null || linkedList.size() < 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game evaluate dialog: no config");
        } else {
            iVar.f169399f = null;
            android.app.Dialog b17 = b(o6Var.r0(), false);
            this.f345270i = b17;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(b17.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569563ev, (android.view.ViewGroup) null, false);
            this.f345270i.setContentView(linearLayout);
            android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(this.f345270i.getContext());
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(java.lang.Math.min(h17.x, h17.y), linearLayout.getLayoutParams().height);
            layoutParams.gravity = 1;
            linearLayout.setLayoutParams(layoutParams);
            android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.obc);
            textView.setText(bg7Var.f452288i);
            android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.di6);
            textView2.setText(bg7Var.f452284e);
            android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f565772di3);
            fl1.b1 b1Var = new fl1.b1(this, textView, textView2, imageView, linearLayout, o6Var, runnable, bg7Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1223xb099fd48.ViewOnClickListenerC12771x8f53376b) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.kjw)).a(0, bg7Var, b1Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1223xb099fd48.ViewOnClickListenerC12771x8f53376b) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.kjx)).a(1, bg7Var, b1Var);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1223xb099fd48.ViewOnClickListenerC12771x8f53376b) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.kjy)).a(2, bg7Var, b1Var);
            this.f345270i.setOnCancelListener(new fl1.e0(this, o6Var, bg7Var, runnable));
            imageView.setOnClickListener(new fl1.f0(this, o6Var, bg7Var, runnable));
            dialog = this.f345270i;
        }
        this.f345270i = dialog;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1237L, 4L, 1L, false);
        android.app.Dialog dialog2 = this.f345270i;
        if (dialog2 != null) {
            dialog2.show();
        }
    }

    public final void g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.i iVar = this.f345276o;
        r45.dg7 dg7Var = iVar.f169400g;
        android.app.Dialog dialog = null;
        if (dg7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "no need show game review dialog: no config");
        } else {
            ch1.a aVar = ch1.b.f122809a;
            aVar.a(o6Var.u0().f158811d, o6Var.u0().L, o6Var.u0().M, 1L, 1L, dg7Var.f453993n);
            iVar.f169400g = null;
            android.app.Dialog b17 = b(o6Var.r0(), false);
            this.f345270i = b17;
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(b17.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b_b, (android.view.ViewGroup) null, false);
            this.f345270i.setContentView(linearLayout);
            int b18 = i65.a.b(this.f345270i.getContext(), 414);
            android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(this.f345270i.getContext());
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(java.lang.Math.min(h17.x, h17.y), b18);
            layoutParams.gravity = 1;
            linearLayout.setLayoutParams(layoutParams);
            o11.f fVar = new o11.f();
            fVar.f423611b = true;
            fVar.f423610a = true;
            n11.a.b().h(dg7Var.f453986d, (android.widget.ImageView) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.rrm), fVar.a());
            ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.s_0)).setText(dg7Var.f453987e);
            ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.s9z)).setText(dg7Var.f453988f);
            ((android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.s9y)).setText(dg7Var.f453989g);
            aVar.a(o6Var.u0().f158811d, o6Var.u0().L, o6Var.u0().M, 3L, 1L, dg7Var.f453993n);
            ((android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f565008re1)).setOnClickListener(new fl1.g0(this, o6Var, dg7Var, runnable));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dg7Var.f453990h)) {
                aVar.a(o6Var.u0().f158811d, o6Var.u0().L, o6Var.u0().M, 2L, 1L, dg7Var.f453993n);
                android.widget.Button button = (android.widget.Button) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f565009re2);
                button.setText(dg7Var.f453990h);
                button.setVisibility(0);
                button.setOnClickListener(new fl1.i0(this, o6Var, dg7Var, runnable));
            }
            dialog = this.f345270i;
        }
        this.f345270i = dialog;
        if (dialog != null) {
            dialog.show();
        }
    }

    public final boolean h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.Runnable runnable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559;
        if (o6Var == null || o6Var.E0() == null || o6Var.r0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "invalid close state");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 E0 = o6Var.E0();
        if (!E0.f158871l1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "can not show evaluate dialog");
            return false;
        }
        long j17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.m6.b(o6Var.f156336n).f167254n;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "app time lastResumeTime:%s, closeTime:%s, leastTime:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(E0.f158873x1));
        if ((currentTimeMillis - j17) / 1000 < E0.f158873x1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "time not enough to show evaluate dialog");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = o6Var.u0();
        java.lang.String str = u07.f128811x;
        this.f345262a = str;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "username is null, can not show evaluate dialog");
            return false;
        }
        android.app.Activity r07 = o6Var.r0();
        java.lang.String str2 = u07.f158811d;
        java.lang.String str3 = u07.f158812e;
        boolean z17 = E0.f158872p1;
        android.app.Dialog b17 = b(r07, true);
        this.f345270i = b17;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) android.view.LayoutInflater.from(b17.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569558eq, (android.view.ViewGroup) null, false);
        this.f345270i.setContentView(linearLayout);
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(this.f345270i.getContext());
        int min = java.lang.Math.min(h17.x, h17.y);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(min, -2);
        layoutParams.gravity = 1;
        linearLayout.setLayoutParams(layoutParams);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "createEvaluateDialog, dialog width:%d", java.lang.Integer.valueOf(min));
        this.f345273l = (android.widget.TextView) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.di7);
        this.f345274m = (android.widget.LinearLayout) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.di8);
        this.f345275n = (android.widget.LinearLayout) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.f565774di5);
        android.widget.TextView textView = (android.widget.TextView) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.f565773di4);
        if (z17) {
            textView.setVisibility(0);
            textView.setOnClickListener(new fl1.v0(this, r07, str2, str3));
        } else {
            textView.setVisibility(8);
            textView.setOnClickListener(null);
        }
        ((android.widget.TextView) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.dia)).setOnClickListener(new fl1.w0(this, r07));
        android.widget.RatingBar ratingBar = (android.widget.RatingBar) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.di9);
        this.f345272k = ratingBar;
        ratingBar.setOnRatingBarChangeListener(new fl1.x0(this));
        this.f345271j = (android.widget.TextView) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.di6);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            this.f345271j.setVisibility(8);
        } else {
            this.f345271j.setVisibility(0);
            this.f345271j.setText(r07.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571651lf, str3));
        }
        ((android.widget.ImageView) this.f345270i.findViewById(com.p314xaae8f345.mm.R.id.f565772di3)).setOnClickListener(new fl1.y0(this));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) linearLayout.getParent();
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new fl1.z0(this));
            linearLayout.setOnClickListener(new fl1.a1(this));
        }
        android.app.Dialog dialog = this.f345270i;
        this.f345270i = dialog;
        dialog.setOnCancelListener(new fl1.p0(this));
        this.f345270i.setOnDismissListener(new fl1.u0(this, runnable));
        this.f345263b = false;
        E0.f158871l1 = false;
        java.lang.String str4 = o6Var.f156336n;
        this.f345267f = str4;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "saveEvaluateReport, no app id");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u08 = o6Var.u0();
            this.f345268g = "";
            if (u08 != null) {
                this.f345268g = u08.f128809v;
            }
            this.f345266e = 1000;
            if (u08 != null && (c12559xbdae8559 = u08.f128802b2) != null) {
                this.f345266e = c12559xbdae8559.f169323f;
            }
            this.f345269h = "";
            if (o6Var.C0() != null && o6Var.C0().V0() != null) {
                this.f345269h = o6Var.C0().V0().X1();
            }
        }
        c(1, 1);
        android.app.Dialog dialog2 = this.f345270i;
        if (dialog2 != null) {
            dialog2.show();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 r20, boolean r21, r45.l25 r22, r45.bg7 r23) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fl1.c1.i(com.tencent.mm.plugin.appbrand.o6, boolean, r45.l25, r45.bg7):void");
    }

    public final void j(r45.et6 et6Var) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 2521;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxabusiness/updateevaluate";
        lVar.f152197a = et6Var;
        lVar.f152198b = new r45.ft6();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(a17, new fl1.k0(this));
    }

    public final void k(int i17) {
        int i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571657ll;
        if (i17 != 1) {
            if (i17 == 2) {
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571659ln;
            } else if (i17 == 3) {
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571658lm;
            } else if (i17 == 4) {
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571656lk;
            } else if (i17 == 5) {
                i18 = com.p314xaae8f345.mm.R.C30867xcad56011.f571655lj;
            }
        }
        this.f345273l.setText(i18);
    }
}
