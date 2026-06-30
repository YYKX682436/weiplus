package xq;

/* loaded from: classes15.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public long f537524c;

    /* renamed from: d, reason: collision with root package name */
    public int f537525d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f537526e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f537527f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f537528g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2614xca6eae71.r0 f537529h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.gif.u f537530i;

    /* renamed from: k, reason: collision with root package name */
    public xq.c f537532k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f537533l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f537534m;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce f537538q;

    /* renamed from: r, reason: collision with root package name */
    public xq.f f537539r;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f537522a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f537523b = "";

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.RectF f537531j = new android.graphics.RectF();

    /* renamed from: n, reason: collision with root package name */
    public int f537535n = -16777216;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f537536o = new xq.h(this);

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f537537p = new xq.g(this);

    public final boolean a(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039) {
        java.util.Objects.toString(c22624x85d69039);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f537528g, c22624x85d69039)) {
            c();
            this.f537528g = c22624x85d69039;
            int i17 = this.f537525d;
            if (i17 == 889192497 || i17 == 922746929) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "recordTextView: skip pat msg");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f537528g;
                com.p314xaae8f345.mm.p2614xca6eae71.r0 r0Var = null;
                java.lang.CharSequence a17 = c22624x85d690392 != null ? c22624x85d690392.a() : null;
                android.text.Spannable spannable = a17 instanceof android.text.Spannable ? (android.text.Spannable) a17 : null;
                if (spannable != null) {
                    com.p314xaae8f345.mm.p2614xca6eae71.r0[] r0VarArr = (com.p314xaae8f345.mm.p2614xca6eae71.r0[]) spannable.getSpans(0, spannable.length(), com.p314xaae8f345.mm.p2614xca6eae71.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0VarArr);
                    int length = r0VarArr.length;
                    int i18 = 0;
                    while (true) {
                        if (i18 >= length) {
                            break;
                        }
                        com.p314xaae8f345.mm.p2614xca6eae71.r0 r0Var2 = r0VarArr[i18];
                        if (r0Var2.f274885f) {
                            r0Var = r0Var2;
                            break;
                        }
                        i18++;
                    }
                    if (r0Var != null) {
                        this.f537529h = r0Var;
                        r0Var.f274889m = java.lang.Math.round(0.0f);
                        r0Var.f274890n = true;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = this.f537528g;
                        if (c22624x85d690393 != null) {
                            c22624x85d690393.invalidate();
                        }
                    }
                }
            } else {
                this.f537535n = c22624x85d69039 != null ? c22624x85d69039.m84149xac551033() : this.f537535n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690394 = this.f537528g;
                if (c22624x85d690394 != null) {
                    c22624x85d690394.m84183x1c5c5ff4(0);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "recordTextView: " + this.f537528g + ", color:" + this.f537535n);
            }
        }
        if (this.f537528g == null) {
            if (this.f537533l) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "bindItemView: null");
                b();
                return true;
            }
            if (!this.f537534m) {
                pm0.v.U(200L, this.f537537p);
            }
        }
        this.f537534m = true;
        return false;
    }

    public final void b() {
        android.view.ViewPropertyAnimator animate;
        pm0.v.C(this.f537536o);
        pm0.v.C(this.f537537p);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar = this.f537530i;
        if (uVar != null) {
            uVar.b();
        }
        this.f537530i = null;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = this.f537527f;
        if (c16077xb54fe366 != null) {
            c16077xb54fe366.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3662 = this.f537527f;
        if (c16077xb54fe3662 != null && (animate = c16077xb54fe3662.animate()) != null) {
            animate.cancel();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3663 = this.f537527f;
        if (c16077xb54fe3663 != null) {
            c16077xb54fe3663.setScaleX(1.0f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3664 = this.f537527f;
        if (c16077xb54fe3664 != null) {
            c16077xb54fe3664.setScaleY(1.0f);
        }
        c();
        this.f537533l = false;
    }

    public final void c() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039;
        int i17 = this.f537525d;
        if (i17 == 889192497 || i17 == 922746929) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "recordTextView: skip pat msg");
            com.p314xaae8f345.mm.p2614xca6eae71.r0 r0Var = this.f537529h;
            if (r0Var != null) {
                r0Var.f274889m = java.lang.Math.round(255.0f);
                r0Var.f274890n = false;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690392 = this.f537528g;
            if (c22624x85d690392 != null) {
                c22624x85d690392.invalidate();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d690393 = this.f537528g;
        int m84149xac551033 = c22624x85d690393 != null ? c22624x85d690393.m84149xac551033() : 0;
        if (m84149xac551033 == 0 && (c22624x85d69039 = this.f537528g) != null) {
            c22624x85d69039.m84183x1c5c5ff4(this.f537535n);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "restoreTextView: " + this.f537528g + ", " + m84149xac551033);
    }

    public final void d(float f17, float f18, int i17) {
        xq.d dVar;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366;
        android.widget.FrameLayout frameLayout;
        if (this.f537530i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "updateView: no drawable");
            return;
        }
        if (this.f537526e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiAnimViewHolder", "updateView: no rootView");
            return;
        }
        if (this.f537527f == null) {
            android.widget.FrameLayout frameLayout2 = this.f537526e;
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3662 = new com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366(frameLayout2 != null ? frameLayout2.getContext() : null, null);
            this.f537527f = c16077xb54fe3662;
            android.widget.FrameLayout frameLayout3 = this.f537526e;
            if (frameLayout3 != null) {
                frameLayout3.addView(c16077xb54fe3662, new android.widget.FrameLayout.LayoutParams(i17, i17));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3663 = this.f537527f;
            if (c16077xb54fe3663 != null) {
                c16077xb54fe3663.setVisibility(8);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3664 = this.f537527f;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) (c16077xb54fe3664 != null ? c16077xb54fe3664.getLayoutParams() : null);
        if (layoutParams == null) {
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i17, i17);
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3665 = this.f537527f;
            if (c16077xb54fe3665 != null) {
                c16077xb54fe3665.setLayoutParams(layoutParams2);
            }
        } else if (layoutParams.width != i17 || layoutParams.height != i17) {
            layoutParams.width = i17;
            layoutParams.height = i17;
            com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3666 = this.f537527f;
            if (c16077xb54fe3666 != null) {
                c16077xb54fe3666.setLayoutParams(layoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3667 = this.f537527f;
        if (c16077xb54fe3667 != null) {
            c16077xb54fe3667.setTranslationX(f17 - (i17 / 2));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3668 = this.f537527f;
        if (c16077xb54fe3668 != null) {
            c16077xb54fe3668.setTranslationY(f18 - (i17 / 2));
        }
        if (this.f537533l) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6308x3120e0ce c6308x3120e0ce = this.f537538q;
        if (c6308x3120e0ce != null) {
            c6308x3120e0ce.k();
        }
        android.widget.FrameLayout frameLayout4 = this.f537526e;
        if ((frameLayout4 != null && frameLayout4.getVisibility() == 8) && (frameLayout = this.f537526e) != null) {
            frameLayout.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe3669 = this.f537527f;
        if ((c16077xb54fe3669 != null && c16077xb54fe3669.getVisibility() == 8) && (c16077xb54fe366 = this.f537527f) != null) {
            c16077xb54fe366.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe36610 = this.f537527f;
        if (c16077xb54fe36610 != null) {
            c16077xb54fe36610.setImageDrawable(this.f537530i);
        }
        xq.f fVar = this.f537539r;
        if (fVar != null) {
            xq.p pVar = ((xq.o) fVar).f537541a.f537547f;
        }
        java.lang.Runnable runnable = this.f537536o;
        pm0.v.C(runnable);
        xq.c cVar = this.f537532k;
        if (cVar != null && (dVar = cVar.f537506d) != null && (i18 = dVar.f537507b) >= 0) {
            pm0.v.U(i18, runnable);
        }
        this.f537533l = true;
        pm0.v.C(this.f537537p);
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe36611 = this.f537527f;
        if (c16077xb54fe36611 != null) {
            c16077xb54fe36611.animate().scaleX(1.5f).scaleY(1.5f).setDuration(0L).withEndAction(new xq.l(this, c16077xb54fe36611));
        }
    }
}
