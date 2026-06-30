package com.tencent.mm.plugin.finder.feed.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveCreateVisitorModeUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class FinderLiveCreateVisitorModeUI extends com.tencent.mm.plugin.finder.ui.MMLiveFinderUI {
    public static final /* synthetic */ int S = 0;
    public com.tencent.mm.ui.widget.MMEditText A;
    public android.widget.ImageView B;
    public android.view.View C;
    public android.widget.Button D;
    public int E;
    public java.lang.String G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f109354J;
    public java.lang.String K;
    public java.lang.String L;
    public int N;
    public com.tencent.mm.ui.tools.f5 P;
    public int Q;
    public long R;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f109358y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f109359z;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f109355v = "FinderLiveCreateVisitorModeUI";

    /* renamed from: w, reason: collision with root package name */
    public final int f109356w = 1000;

    /* renamed from: x, reason: collision with root package name */
    public final int f109357x = 1001;
    public boolean F = true;
    public int M = 28;

    public static final void d7(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        java.lang.String str = finderLiveCreateVisitorModeUI.L;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i(finderLiveCreateVisitorModeUI.f109355v, "continuePost nickNameStr:" + finderLiveCreateVisitorModeUI.L + " is empty!");
            finderLiveCreateVisitorModeUI.e7(true);
            return;
        }
        java.lang.String str2 = finderLiveCreateVisitorModeUI.f109354J;
        if (!(str2 == null || str2.length() == 0) && kotlin.jvm.internal.o.b(finderLiveCreateVisitorModeUI.f109354J, finderLiveCreateVisitorModeUI.K) && finderLiveCreateVisitorModeUI.F) {
            java.lang.String str3 = finderLiveCreateVisitorModeUI.f109354J;
            str2 = str3 != null ? r26.n0.Z(str3, "/96") : null;
        }
        java.lang.String str4 = finderLiveCreateVisitorModeUI.L;
        java.lang.String str5 = str4 == null ? "" : str4;
        if (str2 == null) {
            str2 = "";
        }
        new ke2.j0(str5, str2, finderLiveCreateVisitorModeUI.Q, finderLiveCreateVisitorModeUI.R, new com.tencent.mm.plugin.finder.feed.ui.q8(finderLiveCreateVisitorModeUI)).l();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: X6, reason: from getter */
    public java.lang.String getF109355v() {
        return this.f109355v;
    }

    public final void e7(boolean z17) {
        android.widget.Button button = this.D;
        if (button != null) {
            button.setEnabled(z17);
        }
        if (z17) {
            if (com.tencent.mm.ui.bk.C()) {
                android.widget.Button button2 = this.D;
                if (button2 != null) {
                    button2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
                    return;
                }
                return;
            }
            android.widget.Button button3 = this.D;
            if (button3 != null) {
                button3.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                return;
            }
            return;
        }
        if (com.tencent.mm.ui.bk.C()) {
            android.widget.Button button4 = this.D;
            if (button4 != null) {
                button4.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_2));
                return;
            }
            return;
        }
        android.widget.Button button5 = this.D;
        if (button5 != null) {
            button5.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.apr;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        android.graphics.Bitmap T;
        java.lang.String str;
        android.text.Editable text;
        int i19 = this.f109356w;
        int i27 = this.f109357x;
        java.lang.String str2 = this.f109355v;
        boolean z17 = true;
        if (i17 == i19) {
            if (intent == null || i18 != -1) {
                return;
            }
            setIntent(new android.content.Intent());
            java.lang.String b17 = com.tencent.mm.ui.tools.i1.b(getContext(), intent, g83.a.a());
            if (b17 != null && b17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e(str2, "imgPath is null or empty");
                db5.t7.makeText(this, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dbk), 0).show();
                return;
            } else {
                getIntent().putExtra("key_source_img_path", b17);
                ((w40.e) i95.n0.c(w40.e.class)).getClass();
                qs2.v.f366327a.b(this, getIntent(), i27);
                return;
            }
        }
        if (i17 == i27 && intent != null && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("key_result_img_path");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.tencent.mars.xlog.Log.e(str2, "cropped avatar path is null or empty");
                return;
            }
            this.I = stringExtra;
            com.tencent.mars.xlog.Log.i(str2, "avatar path %s file length %d KB", stringExtra, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(stringExtra) / 1024));
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || (T = com.tencent.mm.sdk.platformtools.x.T(stringExtra, 256, 256, false)) == null) {
                return;
            }
            android.widget.ImageView imageView = this.f109359z;
            if (imageView != null) {
                imageView.setImageBitmap(T);
            }
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.A;
            if (mMEditText == null || (text = mMEditText.getText()) == null || (str = text.toString()) == null) {
                str = "";
            }
            java.lang.String b18 = hc2.l.b(str);
            this.L = b18;
            e7(!(b18.length() == 0));
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String d17;
        super.onCreate(bundle);
        ae2.in inVar = ae2.in.f3688a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3711c2).getValue()).r()).intValue();
        if (intValue > 0 && intValue < Integer.MAX_VALUE) {
            this.M = intValue;
        }
        java.lang.String str = "";
        setMMTitle("");
        setActionbarColor(getContext().getResources().getColor(com.tencent.mm.R.color.aay));
        setBackBtn(new com.tencent.mm.plugin.finder.feed.ui.x8(this), com.tencent.mm.R.raw.icons_filled_back);
        this.F = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3721d2).getValue()).r()).intValue() == 0;
        java.lang.String str2 = "initConfigValue filterMyAvatarUrl:" + this.F;
        java.lang.String str3 = this.f109355v;
        com.tencent.mars.xlog.Log.i(str3, str2);
        android.content.Intent intent = getIntent();
        this.H = intent != null ? intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME") : null;
        android.content.Intent intent2 = getIntent();
        this.G = intent2 != null ? intent2.getStringExtra("KEY_ALIAS_VISITOR_AVATAR") : null;
        android.content.Intent intent3 = getIntent();
        this.E = intent3 != null ? intent3.getIntExtra("KEY_SOURCE", 0) : 0;
        android.content.Intent intent4 = getIntent();
        this.Q = intent4 != null ? intent4.getIntExtra("KEY_REPORT_TO_SVR_SCENE", 0) : 0;
        android.content.Intent intent5 = getIntent();
        this.R = intent5 != null ? intent5.getLongExtra("KEY_REPORT_TO_SVR_TS", 0L) : 0L;
        this.f109358y = findViewById(com.tencent.mm.R.id.a_0);
        this.f109359z = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.a_4);
        com.tencent.mm.ui.widget.MMEditText mMEditText = (com.tencent.mm.ui.widget.MMEditText) findViewById(com.tencent.mm.R.id.kbn);
        this.A = mMEditText;
        if (mMEditText != null) {
            java.lang.String str4 = this.H;
            if (str4 == null) {
                str4 = "";
            }
            mMEditText.setText(str4);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.kbi);
        this.B = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.r8(this));
        }
        this.D = (android.widget.Button) findViewById(com.tencent.mm.R.id.c9z);
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(c01.z1.r());
        if (n07 != null && (d17 = n07.d()) != null) {
            str = d17;
        }
        this.K = str;
        java.lang.String str5 = this.G;
        this.f109354J = str5 == null || str5.length() == 0 ? this.K : this.G;
        android.widget.ImageView imageView2 = this.f109359z;
        if (imageView2 != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.l().c(new mn2.n(this.f109354J, null, 2, null), imageView2, g1Var.h(mn2.f1.f329961o));
        }
        android.view.View view = this.f109358y;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.s8(this));
        }
        int i17 = this.M;
        int i18 = i17 / 2;
        zl2.r4.f473950a.Z2(this.A, null, i17, i18 <= 0 ? i17 : i18, (r17 & 16) != 0, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, new com.tencent.mm.plugin.finder.feed.ui.t8(this));
        this.C = findViewById(com.tencent.mm.R.id.f487077nf2);
        e7(false);
        android.widget.Button button = this.D;
        if (button != null) {
            button.setOnClickListener(new com.tencent.mm.plugin.finder.feed.ui.w8(this));
        }
        android.widget.Button button2 = this.D;
        java.lang.Object layoutParams = button2 != null ? button2.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        int i19 = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
        this.N = i19;
        if (i19 <= 0) {
            this.N = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479731dn);
        }
        if (this.E == 1) {
            android.widget.Button button3 = this.D;
            if (button3 != null) {
                button3.setBackgroundResource(com.tencent.mm.R.drawable.f481737a52);
            }
        } else {
            android.widget.Button button4 = this.D;
            if (button4 != null) {
                button4.setBackgroundResource(com.tencent.mm.R.drawable.a0z);
            }
        }
        com.tencent.mars.xlog.Log.i(str3, "initConfirmBtnConfig:" + this.N + ", sourceType:" + this.E);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("maxNickNameLength:");
        sb6.append(this.M);
        com.tencent.mars.xlog.Log.i(str3, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.P;
        if (f5Var != null) {
            f5Var.d();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMLiveFinderUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        android.view.View decorView;
        super.onResume();
        android.view.Window window = getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new com.tencent.mm.plugin.finder.feed.ui.z8(this));
    }
}
