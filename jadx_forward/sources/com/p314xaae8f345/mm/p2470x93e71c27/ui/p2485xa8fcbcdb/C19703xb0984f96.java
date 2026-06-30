package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference */
/* loaded from: classes11.dex */
public class C19703xb0984f96 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public final android.view.View.OnClickListener A1;
    public android.text.SpannableString L;
    public java.lang.String M;
    public java.lang.String N;
    public android.view.View P;
    public android.view.View Q;
    public android.view.View R;
    public android.view.View S;
    public android.view.View T;
    public bi4.i0 U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.LinearLayout f272586l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f272587p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f272588p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.RelativeLayout f272589x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f272590x1;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.FrameLayout f272591y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.View.OnLayoutChangeListener f272592y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.view.View.OnClickListener f272593z1;

    public C19703xb0984f96(android.content.Context context) {
        this(context, null);
    }

    public void M() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoPreference", "checkUnreadBubbleTip isListVisible:%s", java.lang.Boolean.valueOf(this.f272588p1));
        N();
        if (this.f272590x1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoPreference", "checkUnreadBubbleTip mBubbleContentNewGroup.visible:%s, mStoryBubbleTipViews.visible:%s", java.lang.Integer.valueOf(this.f272586l1.getVisibility()), java.lang.Integer.valueOf(this.f272587p0.getVisibility()));
        }
    }

    public void N() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountInfoPreference", "forceStopBubbleTip this:%s, bindView:%s", this, java.lang.Boolean.valueOf(this.f272590x1));
        if (this.f272590x1) {
            this.f272589x0.setVisibility(8);
            ((ye4.e) i95.n0.c(ye4.e.class)).getClass();
            if (bf4.f.f101248b.f()) {
                this.f272586l1.setVisibility(8);
                return;
            }
            this.f272587p0.setVisibility(8);
            this.f272591y0.setVisibility(8);
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
            e51.f fVar = ef4.j0.f333985a;
            android.widget.ImageView anchor = this.f272587p0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchor, "anchor");
            java.util.ArrayList arrayList = ef4.j0.f333987c;
            java.util.Objects.toString(arrayList);
            e51.j jVar = (e51.j) ef4.j0.f333986b.get(anchor);
            if (jVar == null || !arrayList.contains(jVar)) {
                return;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.StoryUIFactory", "stopUnreadBubbleConfetti", new java.lang.Object[0]);
            jVar.h();
            arrayList.remove(jVar);
        }
    }

    public void O(boolean z17, boolean z18, boolean z19) {
        android.view.View view;
        this.X = z17;
        this.Y = z18;
        this.W = z19;
        boolean g17 = bi4.v1.g();
        this.V = g17;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = this.Z;
        android.content.Context context = this.f279303d;
        if (c21526xca364659 != null && !g17) {
            if (z17) {
                c21526xca364659.m79272x1c5c5ff4(i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            } else {
                c21526xca364659.m79271x1c5c5ff4(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            }
        }
        if (this.V && z19) {
            android.view.View view2 = this.Q;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view3 = this.Q;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (!this.V || z19) {
            android.view.View view4 = this.P;
            if (view4 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view5 = this.P;
            if (view5 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/pluginsdk/ui/preference/AccountInfoPreference", "updateAccountStoryStatus", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (this.V && (view = this.R) != null) {
            view.setOnClickListener(this.A1);
        }
        if (this.R != null) {
            int f17 = (z17 || !z18) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a8f) : i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a8g);
            if (this.V) {
                f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a8g);
            }
            android.view.View view6 = this.R;
            view6.setPadding(view6.getPaddingLeft(), f17, this.R.getPaddingRight(), this.R.getPaddingBottom());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.S = view;
        android.view.View.OnLayoutChangeListener onLayoutChangeListener = this.f272592y1;
        this.f272592y1 = onLayoutChangeListener;
        if (onLayoutChangeListener != null) {
            view.addOnLayoutChangeListener(onLayoutChangeListener);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        if (this.M != null && imageView != null && gm0.j1.a()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, this.M, null);
        }
        android.view.View.OnClickListener onClickListener = this.A1;
        imageView.setOnClickListener(onClickListener);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659) view.findViewById(com.p314xaae8f345.mm.R.id.kbb);
        this.Z = c21526xca364659;
        java.lang.String str = this.M;
        android.content.Context context = this.f279303d;
        if (str != null && c21526xca364659 != null) {
            c21526xca364659.m79266x3b2de958(true);
            this.Z.i(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561387h3));
            if (!this.V) {
                if (this.X) {
                    this.Z.m79272x1c5c5ff4(i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
                } else {
                    this.Z.m79271x1c5c5ff4(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                }
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca3646592 = this.Z;
            java.lang.CharSequence charSequence = this.L;
            if (charSequence == null) {
                charSequence = this.M;
            }
            c21526xca3646592.m79270x765074af(charSequence);
            if (this.Z.m79227x74f59ea8() != null) {
                this.Z.m79227x74f59ea8().setFakeBoldText(true);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ouv);
        if (this.N != null && textView != null) {
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571536i5, this.N));
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        textView.setOnClickListener(onClickListener);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.m47);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        view.findViewById(com.p314xaae8f345.mm.R.id.leo).setOnClickListener(new y35.b(this));
        this.P = view.findViewById(com.p314xaae8f345.mm.R.id.gxn);
        this.Q = view.findViewById(com.p314xaae8f345.mm.R.id.gxp);
        this.R = view.findViewById(com.p314xaae8f345.mm.R.id.gxv);
        this.T = view.findViewById(com.p314xaae8f345.mm.R.id.ovx);
        if (this.R != null) {
            int f17 = (this.X || !this.Y) ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a8f) : i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a8g);
            if (this.V) {
                f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.a8g);
            }
            android.view.View view2 = this.R;
            view2.setPadding(view2.getPaddingLeft(), f17, this.R.getPaddingRight(), this.R.getPaddingBottom());
            if (this.V) {
                this.R.setOnClickListener(onClickListener);
            } else {
                this.R.setOnClickListener(this.f272593z1);
            }
        }
        android.view.View view3 = this.R;
        bi4.i0 i0Var = this.U;
        if (i0Var != null) {
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1) i0Var).n(view, view3)) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1) this.U).c();
            }
            O(this.X, this.Y, this.W);
            view.post(new y35.c(this, view));
        }
        if (bi4.v1.g() && (view instanceof android.widget.RelativeLayout)) {
            android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view;
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h1(context, relativeLayout, (android.widget.LinearLayout) view3, 0);
            android.view.View view4 = h1Var.f255457g;
            relativeLayout.addView(view4);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view4.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.addRule(3, com.p314xaae8f345.mm.R.id.gxv);
            h1Var.b4(this.M);
            this.U = h1Var;
        }
        O(this.X, this.Y, this.W);
        view.post(new y35.c(this, view));
    }

    public C19703xb0984f96(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19703xb0984f96(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.U = null;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = true;
        this.Z = null;
        this.f272587p0 = null;
        this.f272589x0 = null;
        this.f272591y0 = null;
        this.f272586l1 = null;
        this.f272588p1 = true;
        this.f272590x1 = false;
        this.f272592y1 = null;
        this.f272593z1 = null;
        this.A1 = new y35.a(this);
    }
}
