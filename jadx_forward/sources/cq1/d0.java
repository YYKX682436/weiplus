package cq1;

/* loaded from: classes8.dex */
public final class d0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f302866d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f302867e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f302868f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f302869g;

    /* renamed from: h, reason: collision with root package name */
    public android.app.Dialog f302870h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewTreeObserver f302871i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f302872m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f302873n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f302874o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f302875p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f302876q;

    /* renamed from: r, reason: collision with root package name */
    public int f302877r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f302878s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f302879t;

    /* renamed from: u, reason: collision with root package name */
    public cq1.v f302880u;

    /* renamed from: v, reason: collision with root package name */
    public cq1.w f302881v;

    public d0(android.content.Context mContext, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f302866d = mContext;
        this.f302867e = z17;
        this.f302868f = "LaunchMpBottomSheet";
        if (mContext instanceof android.app.Activity) {
            android.view.View decorView = ((android.app.Activity) mContext).getWindow().getDecorView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
            this.f302872m = ((android.view.ViewGroup) decorView).findViewById(android.R.id.content);
        }
        this.f302870h = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c(mContext);
        android.view.View inflate = android.view.View.inflate(mContext, com.p314xaae8f345.mm.R.C30864xbddafb2a.ehl, null);
        this.f302869g = inflate;
        this.f302878s = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.b0h) : null;
        android.view.View view = this.f302869g;
        this.f302879t = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.f565015b02) : null;
        android.view.View view2 = this.f302869g;
        this.f302873n = view2 != null ? (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.t3f) : null;
        android.view.View view3 = this.f302869g;
        this.f302874o = view3 != null ? (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.f565016sm0) : null;
        android.view.View view4 = this.f302869g;
        this.f302875p = view4 != null ? (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.sm9) : null;
        if (i17 == 0) {
            android.widget.TextView textView = this.f302873n;
            if (textView != null) {
                textView.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nab));
            }
            android.widget.TextView textView2 = this.f302875p;
            if (textView2 != null) {
                textView2.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nah));
            }
        } else if (i17 == 1) {
            android.widget.TextView textView3 = this.f302873n;
            if (textView3 != null) {
                textView3.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nac));
            }
            android.widget.TextView textView4 = this.f302875p;
            if (textView4 != null) {
                textView4.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nag));
            }
        } else if (i17 == 2) {
            android.widget.TextView textView5 = this.f302873n;
            if (textView5 != null) {
                textView5.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.na8));
            }
            android.widget.TextView textView6 = this.f302875p;
            if (textView6 != null) {
                textView6.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nag));
            }
        } else if (i17 == 3) {
            if (z17) {
                android.widget.TextView textView7 = this.f302873n;
                if (textView7 != null) {
                    textView7.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nav));
                }
                android.widget.TextView textView8 = this.f302875p;
                if (textView8 != null) {
                    textView8.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nai));
                }
            } else {
                android.widget.TextView textView9 = this.f302873n;
                if (textView9 != null) {
                    textView9.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.naa));
                }
                android.widget.TextView textView10 = this.f302875p;
                if (textView10 != null) {
                    textView10.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nae));
                }
            }
        }
        if (z17) {
            android.widget.TextView textView11 = this.f302874o;
            if (textView11 != null) {
                textView11.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.na6));
            }
            android.view.View view5 = this.f302878s;
            if (view5 != null) {
                view5.setOnClickListener(new cq1.x(this));
            }
        } else {
            android.widget.TextView textView12 = this.f302874o;
            if (textView12 != null) {
                textView12.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.na7));
            }
            android.widget.TextView textView13 = this.f302875p;
            if (textView13 != null) {
                textView13.setText(mContext.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nae));
            }
            android.view.View view6 = this.f302878s;
            if (view6 != null) {
                view6.setOnClickListener(new cq1.y(this));
            }
        }
        android.widget.TextView textView14 = this.f302874o;
        android.text.TextPaint paint = textView14 != null ? textView14.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        if (paint != null) {
            paint.setStrokeWidth(0.8f);
        }
        android.widget.TextView textView15 = this.f302875p;
        android.text.TextPaint paint2 = textView15 != null ? textView15.getPaint() : null;
        if (paint2 != null) {
            paint2.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        android.view.View view7 = this.f302879t;
        if (view7 != null) {
            view7.setOnClickListener(new cq1.z(this));
        }
        this.f302876q = a();
        android.app.Dialog dialog = this.f302870h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dialog, "null cannot be cast to non-null type com.tencent.mm.ui.widget.dialog.CustomSheetDialog");
        android.view.View view8 = this.f302869g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view8);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c) dialog).setContentView(view8);
        android.app.Dialog dialog2 = this.f302870h;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new cq1.a0(this));
        }
    }

    public final boolean a() {
        android.content.Context context = this.f302866d;
        return context != null && context.getResources().getConfiguration().orientation == 2;
    }

    public final void b() {
        android.app.Dialog dialog = this.f302870h;
        android.content.Context context = this.f302866d;
        java.lang.String str = this.f302868f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tryHide mBottomSheetDialog:%s, mContext:%s", dialog, context);
        android.app.Dialog dialog2 = this.f302870h;
        if (dialog2 != null) {
            if (!(context instanceof android.app.Activity)) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
                dialog2.dismiss();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, " cannot dismiss !");
            if (context == null || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
                return;
            }
            android.app.Dialog dialog3 = this.f302870h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog3);
            dialog3.dismiss();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.app.Dialog dialog = this.f302870h;
        if (dialog != null && dialog.isShowing()) {
            android.view.View view = this.f302872m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                b();
                return;
            }
            android.app.Dialog dialog2 = this.f302870h;
            if (dialog2 != null && dialog2.isShowing()) {
                if (this.f302876q == a()) {
                    int i17 = this.f302877r;
                    android.content.Context context = this.f302866d;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                b();
            }
        }
    }
}
