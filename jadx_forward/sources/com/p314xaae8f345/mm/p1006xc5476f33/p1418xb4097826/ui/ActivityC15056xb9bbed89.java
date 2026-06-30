package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/tc", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderPreviewCoverUI */
/* loaded from: classes10.dex */
public final class ActivityC15056xb9bbed89 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tc S = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.tc(null);
    public boolean B;
    public boolean C;
    public java.lang.String E;
    public java.lang.String F;
    public int G;
    public long H;

    /* renamed from: J, reason: collision with root package name */
    public byte[] f210193J;
    public byte[] K;
    public int L;
    public java.lang.String P;
    public java.lang.String Q;
    public int R;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.ImageView f210194t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.ImageView f210195u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f210196v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f210197w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f210198x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f210199y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f210200z;
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final android.content.Intent D = new android.content.Intent();
    public int I = 2;
    public so2.b5 M = new so2.b5("", "", 0, 1, null, null, 0);
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.td N = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.td.f211405d;

    public static final void c7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15056xb9bbed89 activityC15056xb9bbed89, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.td tdVar, int i17) {
        activityC15056xb9bbed89.getClass();
        android.content.Intent intent = new android.content.Intent();
        r45.kb4 kb4Var = null;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.uc.f211445a[tdVar.ordinal()] == 1) {
            intent.putExtra("cover_style", activityC15056xb9bbed89.M.f491805g);
            intent.putExtra("cover_time_ms", activityC15056xb9bbed89.M.f491804f);
            intent.putExtra("cover_crop_model", activityC15056xb9bbed89.M.f491806h);
            intent.putExtra("cover_word_info_wrap", activityC15056xb9bbed89.M.f491807i);
            intent.putExtra("key_full_cover_path", activityC15056xb9bbed89.M.f491802d);
            intent.putExtra("key_cover_select_source", activityC15056xb9bbed89.M.f491808m);
            if (activityC15056xb9bbed89.B && !activityC15056xb9bbed89.C) {
                intent.putExtra("key_cover_can_use_profile_cover", true);
                intent.putExtra("key_other_cover_time_ms", activityC15056xb9bbed89.H);
                java.lang.String str = activityC15056xb9bbed89.E;
                if (str == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fullCoverUrl");
                    throw null;
                }
                intent.putExtra("key_other_full_cover_path", str);
                intent.putExtra("key_other_cover_select_source", activityC15056xb9bbed89.L);
            }
        } else {
            intent.putExtra("cover_style", activityC15056xb9bbed89.I);
            intent.putExtra("cover_time_ms", activityC15056xb9bbed89.H);
            intent.putExtra("cover_crop_model", activityC15056xb9bbed89.f210193J);
            intent.putExtra("cover_word_info_wrap", activityC15056xb9bbed89.K);
            java.lang.String str2 = activityC15056xb9bbed89.E;
            if (str2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fullCoverUrl");
                throw null;
            }
            intent.putExtra("key_full_cover_path", str2);
            intent.putExtra("key_cover_select_source", activityC15056xb9bbed89.L);
        }
        r45.kb4 kb4Var2 = new r45.kb4();
        byte[] byteArrayExtra = activityC15056xb9bbed89.getIntent().getByteArrayExtra("media_list_");
        if (byteArrayExtra != null) {
            try {
                kb4Var2.mo11468x92b714fd(byteArrayExtra);
                kb4Var = kb4Var2;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        if (kb4Var == null) {
            kb4Var = new r45.kb4();
        }
        boolean booleanExtra = activityC15056xb9bbed89.getIntent().getBooleanExtra("isLongVideoPost", false);
        intent.setClass(activityC15056xb9bbed89.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.class);
        intent.putExtra("media_list_", kb4Var.mo14344x5f01b1f6());
        intent.putExtra("media_list_count", kb4Var.m75941xfb821914(0).size());
        intent.putExtra("isLongVideoPost", booleanExtra);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15056xb9bbed89.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        xy2.c.c(mo55332x76847179, intent);
        intent.putExtra("key_cover_scene", tdVar);
        intent.putExtra("key_last_cover_scene", activityC15056xb9bbed89.N);
        activityC15056xb9bbed89.N = tdVar;
        intent.setClass(activityC15056xb9bbed89.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15059x3e98c949.class);
        activityC15056xb9bbed89.mo55332x76847179().startActivityForResult(intent, i17);
    }

    public static final void d7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15056xb9bbed89 activityC15056xb9bbed89) {
        int i17 = activityC15056xb9bbed89.R - 1;
        activityC15056xb9bbed89.R = i17;
        if (i17 <= 0) {
            android.view.View view = activityC15056xb9bbed89.f210198x;
            if (view != null) {
                view.setEnabled(true);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewBtn");
                throw null;
            }
        }
    }

    public static final void e7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15056xb9bbed89 activityC15056xb9bbed89, android.graphics.Bitmap bitmap) {
        int dimension = (int) activityC15056xb9bbed89.mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.app);
        int dimension2 = (int) activityC15056xb9bbed89.mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.aoa);
        jz5.o o17 = mv2.f0.f413094a.o(bitmap.getWidth(), bitmap.getHeight(), activityC15056xb9bbed89.I);
        float intValue = ((java.lang.Number) o17.f384376f).intValue() / ((java.lang.Number) o17.f384375e).floatValue();
        android.widget.ImageView imageView = activityC15056xb9bbed89.f210194t;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileImageView");
            throw null;
        }
        imageView.getLayoutParams().height = (int) (dimension * intValue);
        android.widget.ImageView imageView2 = activityC15056xb9bbed89.f210194t;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileImageView");
            throw null;
        }
        imageView2.setScaleType(android.widget.ImageView.ScaleType.values()[((java.lang.Number) o17.f384374d).intValue()]);
        android.widget.ImageView imageView3 = activityC15056xb9bbed89.f210194t;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileImageView");
            throw null;
        }
        imageView3.requestLayout();
        android.widget.ImageView imageView4 = activityC15056xb9bbed89.f210194t;
        if (imageView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileImageView");
            throw null;
        }
        imageView4.setImageBitmap(bitmap);
        android.graphics.Bitmap a17 = S.a(bitmap, dimension, dimension2);
        android.widget.ImageView imageView5 = activityC15056xb9bbed89.f210199y;
        if (imageView5 != null) {
            imageView5.setImageBitmap(a17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurImageView");
            throw null;
        }
    }

    public static final void f7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15056xb9bbed89 activityC15056xb9bbed89, android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView = activityC15056xb9bbed89.f210195u;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareImageView");
            throw null;
        }
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        android.widget.ImageView imageView2 = activityC15056xb9bbed89.f210195u;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareImageView");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        boolean z17 = this.B;
        android.content.Intent intent = this.D;
        if (z17) {
            intent.putExtra("RESULT_IS_SET_PROFILE_COVER", true);
            java.lang.String str = this.E;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fullCoverUrl");
                throw null;
            }
            intent.putExtra("RESULT_COVER_FULL_PATH", str);
            intent.putExtra("RESULT_COVER_QUALITY", this.G);
            intent.putExtra("RESULT_COVER_STYLE", this.I);
            intent.putExtra("RESULT_COVER_TIME_MS", this.H);
            intent.putExtra("key_cover_select_source", this.L);
            intent.putExtra("RESULT_COVER_WORD_INFO_WRAP", this.K);
        }
        if (this.M.f491803e.length() > 0) {
            intent.putExtra("RESULT_IS_SET_SHARE_COVER", true);
        }
        intent.putExtra("key_share_cover_item", this.M);
        setResult(0, intent);
        super.finish();
    }

    public final void g7() {
        this.R++;
        android.view.View view = this.f210198x;
        if (view != null) {
            view.setEnabled(false);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.edi;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.tt_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f210194t = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.ttg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f210195u = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.tt9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f210196v = findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.ttf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f210197w = findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.ros);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f210198x = findViewById5;
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.tt7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f210199y = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.tbl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f210200z = findViewById7;
        findViewById7.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.vc(this));
        android.view.View view = this.f210196v;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("profileEditBtn");
            throw null;
        }
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.wc(this));
        android.view.View view2 = this.f210197w;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shareEditBtn");
            throw null;
        }
        view2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.xc(this));
        android.view.View view3 = this.f210198x;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewBtn");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/FinderPreviewCoverUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f210198x;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewBtn");
            throw null;
        }
        view4.setEnabled(false);
        android.view.View view5 = this.f210198x;
        if (view5 != null) {
            view5.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.yc(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("previewBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (intent != null) {
            pf5.u uVar = pf5.u.f435469a;
            if (i17 != 1001) {
                if (i17 == 1002 && intent.getBooleanExtra("key_is_set_cover", false)) {
                    this.C = true;
                    so2.b5 b5Var = this.M;
                    java.lang.String stringExtra = intent.getStringExtra("RESULT_COVER_FULL_PATH");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    b5Var.getClass();
                    b5Var.f491802d = stringExtra;
                    so2.b5 b5Var2 = this.M;
                    java.lang.String stringExtra2 = intent.getStringExtra("RESULT_COVER_PATH");
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    b5Var2.getClass();
                    b5Var2.f491803e = stringExtra2;
                    this.M.f491805g = intent.getIntExtra("RESULT_COVER_STYLE", 0);
                    this.M.f491804f = intent.getLongExtra("RESULT_COVER_TIME_MS", 0L);
                    this.M.f491808m = intent.getIntExtra("key_cover_select_source", 0);
                    this.M.f491806h = intent.getByteArrayExtra("RESULT_COVER_CROP_MODEL");
                    this.M.f491807i = intent.getByteArrayExtra("RESULT_COVER_WORD_INFO_WRAP");
                    java.lang.String str = this.M.f491803e;
                    if (str.length() == 0) {
                        return;
                    }
                    this.Q = str;
                    mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    wo0.c d17 = d1Var.d(ya2.l.f542035a.e(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
                    g7();
                    d17.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.cd(this);
                    ((wo0.b) d17).a();
                    return;
                }
                return;
            }
            if (intent.getBooleanExtra("key_is_set_cover", false)) {
                this.B = true;
                java.lang.String stringExtra3 = intent.getStringExtra("RESULT_COVER_FULL_PATH");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                this.E = stringExtra3;
                java.lang.String stringExtra4 = intent.getStringExtra("RESULT_COVER_PATH");
                if (stringExtra4 == null) {
                    stringExtra4 = "";
                }
                this.F = stringExtra4;
                android.content.Intent intent2 = this.D;
                intent2.putExtra("RESULT_COVER_PATH", stringExtra4);
                this.G = intent.getIntExtra("RESULT_COVER_QUALITY", 0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15203xfa689ef1 c15203xfa689ef1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15203xfa689ef1) intent.getParcelableExtra("RESULT_CROP_INFO");
                if (c15203xfa689ef1 != null) {
                    intent2.putExtra("RESULT_CROP_INFO", c15203xfa689ef1);
                }
                this.I = intent.getIntExtra("RESULT_COVER_STYLE", 0);
                this.H = intent.getLongExtra("RESULT_COVER_TIME_MS", 0L);
                this.L = intent.getIntExtra("key_cover_select_source", 0);
                this.f210193J = intent.getByteArrayExtra("RESULT_COVER_CROP_MODEL");
                this.K = intent.getByteArrayExtra("RESULT_COVER_WORD_INFO_WRAP");
                java.lang.String str2 = this.F;
                if (str2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coverUrl");
                    throw null;
                }
                if (str2.length() == 0) {
                    return;
                }
                this.P = str2;
                mn2.d1 d1Var2 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                wo0.c d18 = d1Var2.d(ya2.l.f542035a.e(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
                g7();
                d18.f529406d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ad(this);
                ((wo0.b) d18).a();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0277, code lost:
    
        if ((r5.length() > 0) == true) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b4  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15056xb9bbed89.onCreate(android.os.Bundle):void");
    }
}
