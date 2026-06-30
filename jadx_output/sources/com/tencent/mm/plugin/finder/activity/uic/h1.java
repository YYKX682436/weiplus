package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes3.dex */
public final class h1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f101878d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f101879e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f101880f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f101881g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f101882h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f101883i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f101884m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f101885n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f101886o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f101887p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f101888q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f101889r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f101887p = "";
    }

    public static final void O6(com.tencent.mm.plugin.finder.activity.uic.h1 h1Var) {
        h1Var.getClass();
        if (!gm0.j1.u().l()) {
            db5.t7.l(h1Var.getActivity());
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("album_min_ratio_limit", 0.33333334f);
        intent.putExtra("album_max_ratio_limit", 3.0f);
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        androidx.appcompat.app.AppCompatActivity activity = h1Var.getActivity();
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.h(activity, com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL, intent);
    }

    public final void P6() {
        this.f101889r = true;
        int color = getResources().getColor(com.tencent.mm.R.color.f478980mj);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().O0(true);
        android.widget.ImageView imageView = this.f101883i;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("coverImageView");
            throw null;
        }
        imageView.setVisibility(0);
        android.widget.ImageView imageView2 = this.f101884m;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("coverMaskImageView");
            throw null;
        }
        imageView2.setVisibility(0);
        android.view.View view = this.f101885n;
        if (view == null) {
            kotlin.jvm.internal.o.o("coverMaskContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverSet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverSet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f101881g;
        if (textView != null) {
            textView.setText(getResources().getString(com.tencent.mm.R.string.cii));
        }
        android.widget.TextView textView2 = this.f101881g;
        if (textView2 != null) {
            textView2.setTextColor(color);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f101886o;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("addCoverIcon");
            throw null;
        }
        weImageView.setIconColor(color);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f101886o;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("addCoverIcon");
            throw null;
        }
        weImageView2.setImageResource(com.tencent.mm.R.raw.icons_filled_delete);
        android.view.View view2 = this.f101880f;
        if (view2 != null) {
            view2.setBackgroundResource(com.tencent.mm.R.drawable.f481513v9);
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = (com.tencent.mm.plugin.finder.activity.uic.c1) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.activity.uic.c1.class);
        int color2 = c1Var.getResources().getColor(com.tencent.mm.R.color.f478982ml);
        android.widget.TextView textView3 = c1Var.f101845g;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("nickNameText");
            throw null;
        }
        textView3.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
        c1Var.T6(color2);
        com.tencent.mm.ui.widget.MMEditText mMEditText = c1Var.f101843e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        mMEditText.setBackgroundResource(com.tencent.mm.R.drawable.aau);
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = c1Var.f101844f;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        mMEditText2.setBackgroundResource(com.tencent.mm.R.drawable.aau);
        android.widget.TextView textView4 = c1Var.f101849n;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("selectTimeText");
            throw null;
        }
        textView4.setBackgroundResource(com.tencent.mm.R.drawable.aau);
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = c1Var.f101843e;
        if (mMEditText3 == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        mMEditText3.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478985mo));
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = c1Var.f101844f;
        if (mMEditText4 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        mMEditText4.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478985mo));
        android.widget.TextView textView5 = c1Var.f101849n;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("selectTimeText");
            throw null;
        }
        textView5.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.f478985mo));
        c1Var.S6(true);
    }

    public final void Q6() {
        this.f101889r = false;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).getController().O0(com.tencent.mm.ui.bk.C());
        android.widget.ImageView imageView = this.f101883i;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("coverImageView");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = this.f101884m;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("coverMaskImageView");
            throw null;
        }
        imageView2.setVisibility(8);
        android.view.View view = this.f101885n;
        if (view == null) {
            kotlin.jvm.internal.o.o("coverMaskContainer");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverUnset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/uic/FinderActivitySelectCoverUIC", "onCoverUnset", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int color = getResources().getColor(com.tencent.mm.R.color.FG_0);
        android.widget.TextView textView = this.f101881g;
        if (textView != null) {
            textView.setTextColor(color);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f101886o;
        if (weImageView == null) {
            kotlin.jvm.internal.o.o("addCoverIcon");
            throw null;
        }
        weImageView.setIconColor(color);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f101886o;
        if (weImageView2 == null) {
            kotlin.jvm.internal.o.o("addCoverIcon");
            throw null;
        }
        weImageView2.setImageResource(com.tencent.mm.R.raw.icon_filled_add);
        android.view.View view2 = this.f101880f;
        if (view2 != null) {
            view2.setBackgroundResource(com.tencent.mm.R.drawable.f481512v8);
        }
        android.widget.TextView textView2 = this.f101881g;
        if (textView2 != null) {
            textView2.setText(getResources().getString(com.tencent.mm.R.string.ci9));
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        com.tencent.mm.plugin.finder.activity.uic.c1 c1Var = (com.tencent.mm.plugin.finder.activity.uic.c1) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.activity.uic.c1.class);
        c1Var.T6(c1Var.getResources().getColor(com.tencent.mm.R.color.f478714f5));
        android.widget.TextView textView3 = c1Var.f101845g;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("nickNameText");
            throw null;
        }
        textView3.setTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.FG_0));
        com.tencent.mm.ui.widget.MMEditText mMEditText = c1Var.f101843e;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        mMEditText.setBackgroundResource(com.tencent.mm.R.drawable.aat);
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = c1Var.f101843e;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("nameEdit");
            throw null;
        }
        mMEditText2.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        com.tencent.mm.ui.widget.MMEditText mMEditText3 = c1Var.f101844f;
        if (mMEditText3 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        mMEditText3.setBackgroundResource(com.tencent.mm.R.drawable.aat);
        com.tencent.mm.ui.widget.MMEditText mMEditText4 = c1Var.f101844f;
        if (mMEditText4 == null) {
            kotlin.jvm.internal.o.o("descEdit");
            throw null;
        }
        mMEditText4.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        android.widget.TextView textView4 = c1Var.f101849n;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("selectTimeText");
            throw null;
        }
        textView4.setHintTextColor(c1Var.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        android.widget.TextView textView5 = c1Var.f101849n;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("selectTimeText");
            throw null;
        }
        textView5.setBackgroundResource(com.tencent.mm.R.drawable.aat);
        c1Var.S6(false);
    }

    public final void R6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.vfs.w6.j(str)) {
            db5.t7.makeText(getActivity(), com.tencent.mm.R.string.cih, 0).show();
            com.tencent.mars.xlog.Log.e(pf5.o.TAG, "ERROR! filePath=" + str);
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f101878d;
        if (u3Var != null && !u3Var.isShowing()) {
            u3Var.show();
        }
        this.f101888q = true;
        this.f101887p = str == null ? "" : str;
        S6(str);
        P6();
    }

    public final void S6(java.lang.String str) {
        mn2.j0 j0Var = new mn2.j0(str == null ? "" : str);
        mn2.g1 g1Var = mn2.g1.f329975a;
        wo0.c a17 = g1Var.e().a(j0Var);
        a17.g(g1Var.h(mn2.f1.f329966t));
        a17.f447873d = new com.tencent.mm.plugin.finder.activity.uic.g1(str, this);
        android.widget.ImageView imageView = this.f101883i;
        if (imageView != null) {
            a17.c(imageView);
        } else {
            kotlin.jvm.internal.o.o("coverImageView");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i18 != -1) {
            return;
        }
        switch (i17) {
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL /* 20000 */:
                android.net.Uri data = intent.getData();
                java.lang.String inputPath = data != null ? data.getPath() : null;
                if (inputPath == null || inputPath.length() == 0) {
                    com.tencent.mars.xlog.Log.w(pf5.o.TAG, "filePath is null.try to getResultPhotoPath.");
                    vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    com.tencent.mm.plugin.finder.assist.e9 e9Var = com.tencent.mm.plugin.finder.assist.e9.f102132a;
                    java.lang.String str = com.tencent.mm.plugin.finder.assist.e9.f102143l;
                    ((ub0.r) oVar).getClass();
                    inputPath = com.tencent.mm.pluginsdk.ui.tools.l7.b(activity, intent, str);
                }
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, "filePath[" + inputPath + "] " + intent);
                if (inputPath == null || inputPath.length() == 0) {
                    com.tencent.mars.xlog.Log.e(pf5.o.TAG, "filePath is null.");
                    return;
                }
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                androidx.appcompat.app.AppCompatActivity context = getActivity();
                i0Var.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(inputPath, "inputPath");
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.b(inputPath, "");
                b17.F = 11;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putFloat("crop_fix_ratio", 0.75f);
                b17.M = bundle;
                ((w40.e) i95.n0.c(w40.e.class)).getClass();
                b17.a(1, "com.tencent.mm.plugin.finder.edit.FinderFixRatioPhoneEditPluginLayout");
                ut3.f.f431176c.f431177a = null;
                ut3.m.f431182a.f(context, 20002, com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p, b17, 1, 1);
                return;
            case 20001:
                R6(intent.getStringExtra("key_result_img_path"));
                return;
            case 20002:
                com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = (com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel) intent.getParcelableExtra("KSEGMENTMEDIAINFO");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("REQUEST_CODE_CROP_FIX_IMAGE model: ");
                sb6.append(captureDataManager$CaptureVideoNormalModel != null ? captureDataManager$CaptureVideoNormalModel.f155662f : null);
                com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
                if (captureDataManager$CaptureVideoNormalModel != null) {
                    java.lang.Boolean bool = captureDataManager$CaptureVideoNormalModel.f155664h;
                    kotlin.jvm.internal.o.f(bool, "getPhoto(...)");
                    if (!bool.booleanValue() || com.tencent.mm.sdk.platformtools.t8.K0(captureDataManager$CaptureVideoNormalModel.f155662f)) {
                        db5.t7.makeText(getActivity(), com.tencent.mm.R.string.cih, 0).show();
                        return;
                    } else {
                        R6(captureDataManager$CaptureVideoNormalModel.f155662f);
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.f482571i3);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f101883i = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.f484427e92);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f101886o = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2;
        android.view.View findViewById3 = getActivity().findViewById(com.tencent.mm.R.id.f482574i6);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f101884m = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = getActivity().findViewById(com.tencent.mm.R.id.f482573i5);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f101885n = findViewById4;
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type android.app.Activity");
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        float f17 = displayMetrics.widthPixels / 0.75f;
        android.widget.ImageView imageView = this.f101884m;
        android.view.View view = null;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("coverMaskImageView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = (int) f17;
        android.widget.ImageView imageView2 = this.f101884m;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("coverMaskImageView");
            throw null;
        }
        imageView2.setLayoutParams(layoutParams);
        this.f101880f = getActivity().findViewById(com.tencent.mm.R.id.f484426e91);
        this.f101881g = (android.widget.TextView) getActivity().findViewById(com.tencent.mm.R.id.f484428e93);
        this.f101878d = com.tencent.mm.ui.widget.dialog.u3.c(getActivity(), getString(com.tencent.mm.R.string.f490604zq), false, 0, null);
        this.f101879e = getActivity().findViewById(com.tencent.mm.R.id.f484423e84);
        android.view.View findViewById5 = getActivity().findViewById(com.tencent.mm.R.id.e88);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.d1(this));
            view = findViewById5;
        }
        this.f101882h = view;
        java.lang.String stringExtra = getIntent().getStringExtra("key_activity_local_cover_url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            Q6();
        } else {
            S6(stringExtra);
            P6();
        }
        android.view.View view2 = this.f101880f;
        if (view2 != null) {
            view2.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.e1(this));
        }
    }
}
