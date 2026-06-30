package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.IconPreference */
/* loaded from: classes8.dex */
public class C21549x15041e54 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public int A1;
    public int B1;
    public final int C1;
    public android.widget.ImageView D1;
    public android.view.ViewGroup E1;
    public android.view.View F1;
    public android.view.View G1;
    public android.widget.TextView H1;
    public android.widget.TextView I1;
    public android.widget.TextView J1;
    public android.widget.TextView K1;
    public android.widget.TextView L;
    public android.widget.ImageView L1;
    public int M;
    public boolean M1;
    public android.graphics.drawable.Drawable N;
    public java.lang.String N1;
    public final int O1;
    public android.widget.ImageView P;
    public final int P1;
    public int Q;
    public final android.content.Context Q1;
    public android.graphics.drawable.Drawable R;
    public boolean R1;
    public android.widget.ImageView S;
    public boolean S1;
    public android.widget.RelativeLayout.LayoutParams T;
    public int T1;
    public android.graphics.drawable.Drawable U;
    public boolean U1;
    public java.lang.String V;
    public boolean V1;
    public int W;
    public android.view.View W1;
    public int X;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.t X1;
    public int Y;
    public int Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f279283l1;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f279284p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f279285p1;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f279286x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f279287x1;

    /* renamed from: y0, reason: collision with root package name */
    public int f279288y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.graphics.Bitmap f279289y1;

    /* renamed from: z1, reason: collision with root package name */
    public int f279290z1;

    public C21549x15041e54(android.content.Context context) {
        this(context, null);
    }

    public int M() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bzh;
    }

    public void N() {
        android.widget.TextView textView = this.J1;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(r2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4) * i65.a.m(this.Q1));
            this.J1.setBackground(null);
        }
    }

    public void O(java.lang.String str) {
        this.f279284p0 = str;
        android.widget.TextView textView = this.I1;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void Q(int i17) {
        this.Z = i17;
        android.widget.TextView textView = this.I1;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void R(android.graphics.Bitmap bitmap) {
        this.f279289y1 = bitmap;
        this.Q = -1;
        this.R = null;
        android.widget.ImageView imageView = this.S;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public void S(int i17) {
        this.Q = i17;
        this.f279289y1 = null;
        android.widget.ImageView imageView = this.S;
        if (imageView != null) {
            imageView.setImageResource(i17);
        }
    }

    public void T(int i17) {
        this.f279290z1 = i17;
        android.widget.ImageView imageView = this.S;
        if (imageView != null) {
            imageView.setVisibility(i17);
        }
    }

    public void V(int i17) {
        this.B1 = i17;
        android.view.View view = this.F1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/preference/IconPreference", "setRightProspectVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/preference/IconPreference", "setRightProspectVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void W(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.E1;
        if (viewGroup != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) viewGroup.getLayoutParams();
            layoutParams.height = i18;
            layoutParams.width = i17;
            this.E1.setLayoutParams(layoutParams);
        }
    }

    public void Y(int i17) {
        this.A1 = i17;
        android.view.ViewGroup viewGroup = this.E1;
        if (viewGroup != null) {
            viewGroup.setVisibility(i17);
        }
    }

    public void Z(int i17, int i18) {
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(i17, i18);
        this.T = layoutParams;
        layoutParams.addRule(13);
        android.widget.ImageView imageView = this.S;
        if (imageView == null) {
            return;
        }
        imageView.setLayoutParams(this.T);
    }

    public void a0(int i17) {
        this.X = i17;
        android.widget.TextView textView = this.K1;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void b0(int i17) {
        this.f279283l1 = i17;
        android.widget.TextView textView = this.J1;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void c0(int i17) {
        this.Y = i17;
        android.widget.ImageView imageView = this.D1;
        if (imageView != null) {
            imageView.setVisibility(i17);
        }
    }

    public void d0(java.lang.String str, int i17, int i18) {
        this.f279286x0 = str;
        this.f279288y0 = i17;
        this.f279287x1 = i18;
        android.widget.TextView textView = this.J1;
        if (textView != null) {
            textView.setText(str);
            if (i17 != -1) {
                android.widget.TextView textView2 = this.J1;
                android.content.Context context = this.Q1;
                textView2.setBackgroundDrawable(context.getResources().getDrawable(i17));
                if (this.f279288y0 == com.p314xaae8f345.mm.R.C30861xcebc809e.asx) {
                    this.J1.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562163ad4) * i65.a.m(context));
                }
            }
            this.J1.setTextColor(i18);
        }
    }

    public void e0(boolean z17) {
        this.R1 = z17;
        android.widget.TextView textView = this.J1;
        if (textView != null) {
            if (!z17) {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.p314xaae8f345.mm.R.C30861xcebc809e.b8i, 0);
                this.J1.setCompoundDrawablePadding((int) this.Q1.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3));
            }
        }
    }

    public void g0(java.lang.String str, int i17) {
        this.V = str;
        this.W = i17;
        android.widget.TextView textView = this.K1;
        if (textView != null) {
            if (str != null) {
                textView.setText(str);
            }
            if (this.W != -1) {
                this.K1.setBackgroundDrawable(this.Q1.getResources().getDrawable(this.W));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public java.lang.String l() {
        return !android.text.TextUtils.isEmpty(this.f279286x0) ? this.f279286x0 : super.l();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.L = (android.widget.TextView) view.findViewById(android.R.id.summary);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        this.L1 = imageView;
        android.content.Context context = this.f279303d;
        if (imageView != null) {
            android.graphics.drawable.Drawable drawable = this.U;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                this.L1.setVisibility(0);
            } else if (this.f279310n != 0) {
                android.graphics.drawable.Drawable drawable2 = context.getResources().getDrawable(this.f279310n);
                this.U = drawable2;
                imageView.setImageDrawable(drawable2);
                this.L1.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            int i17 = this.f279311o;
            if (i17 != 0) {
                this.L1.getDrawable().setColorFilter(i17, android.graphics.PorterDuff.Mode.SRC_ATOP);
            } else if (this.L1.getDrawable() != null) {
                this.L1.getDrawable().clearColorFilter();
            }
            if (this.M1) {
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.L1.getLayoutParams();
                layoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                layoutParams.gravity = 48;
                this.L1.setLayoutParams(layoutParams);
            } else {
                android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) this.L1.getLayoutParams();
                layoutParams2.topMargin = 0;
                layoutParams2.gravity = 16;
                this.L1.setLayoutParams(layoutParams2);
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.jlx);
        int i18 = this.P1;
        if (i18 > 0) {
            linearLayout.setMinimumHeight(i18);
        }
        int i19 = this.O1;
        if (i19 != -1) {
            linearLayout.setMinimumHeight(i19);
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o58);
        this.K1 = textView;
        android.content.Context context2 = this.Q1;
        if (textView != null) {
            if (this.S1) {
                textView.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.C30861xcebc809e.b8i, 0, 0, 0);
                this.K1.setCompoundDrawablePadding((int) context2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3));
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            this.K1.setVisibility(this.X);
            this.K1.setText(this.V);
            com.p314xaae8f345.mm.ui.bk.s0(this.K1.getPaint());
            int i27 = this.W;
            if (i27 != -1) {
                if (i27 == com.p314xaae8f345.mm.R.C30861xcebc809e.asx) {
                    this.K1.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562163ad4) * i65.a.m(context2));
                } else {
                    this.K1.setTextSize(0, i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f562162ad3) * i65.a.m(context2));
                }
                this.K1.setBackgroundDrawable(context2.getResources().getDrawable(this.W));
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(this.V1 ? com.p314xaae8f345.mm.R.id.o59 : com.p314xaae8f345.mm.R.id.o5_);
        this.J1 = textView2;
        if (textView2 != null) {
            textView2.setVisibility(this.f279283l1);
            this.J1.setText(this.f279286x0);
            if (this.f279288y0 != -1) {
                this.J1.setBackgroundDrawable(context2.getResources().getDrawable(this.f279288y0));
                if (this.f279288y0 == com.p314xaae8f345.mm.R.C30861xcebc809e.asx) {
                    this.J1.setTextSize(0, i65.a.f(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f562163ad4) * i65.a.m(context2));
                }
            }
            if (this.f279285p1 != -1) {
                this.J1.setTextSize(0, i65.a.f(context2, r3) * i65.a.m(context2));
            }
            int i28 = this.f279287x1;
            if (i28 != -1) {
                this.J1.setTextColor(i28);
            }
            if (this.R1) {
                this.J1.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.p314xaae8f345.mm.R.C30861xcebc809e.b8i, 0);
                this.J1.setCompoundDrawablePadding((int) context2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3));
            } else {
                this.J1.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.o4r);
        this.D1 = imageView2;
        imageView2.setVisibility(this.Y);
        int i29 = this.T1;
        if (i29 != -1) {
            this.D1.setImageResource(i29);
        }
        this.S = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h_s);
        this.E1 = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.m4_);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.m3q);
        this.G1 = findViewById;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.C1));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.m47);
        this.F1 = findViewById2;
        int i37 = this.B1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i37));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/base/preference/IconPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.graphics.Bitmap bitmap = this.f279289y1;
        if (bitmap != null) {
            this.S.setImageBitmap(bitmap);
        } else {
            int i38 = this.Q;
            if (i38 != -1) {
                this.S.setImageResource(i38);
            } else {
                android.graphics.drawable.Drawable drawable3 = this.R;
                if (drawable3 != null) {
                    this.S.setImageDrawable(drawable3);
                }
            }
        }
        android.widget.ImageView imageView3 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.rrl);
        this.P = imageView3;
        if (imageView3 != null) {
            android.graphics.drawable.Drawable drawable4 = this.N;
            if (drawable4 != null) {
                imageView3.setImageDrawable(drawable4);
            }
            this.P.setVisibility(this.M);
        }
        this.S.setVisibility(this.f279290z1);
        this.E1.setVisibility(this.A1);
        android.widget.RelativeLayout.LayoutParams layoutParams3 = this.T;
        if (layoutParams3 != null) {
            this.S.setLayoutParams(layoutParams3);
        }
        this.H1 = (android.widget.TextView) view.findViewById(android.R.id.title);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
        this.I1 = textView3;
        if (textView3 != null) {
            textView3.setVisibility(this.Z);
            this.I1.setText(this.f279284p0);
            if (this.U1) {
                this.I1.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
            } else {
                this.I1.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560406jj));
            }
        }
        android.widget.TextView textView4 = this.H1;
        if (textView4 != null) {
            if (this.U1) {
                textView4.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
            } else {
                textView4.setTextColor(context2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            }
        }
        view.setEnabled(!this.U1);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.t tVar = this.X1;
        if (tVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gg ggVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.gg) tVar;
            ggVar.getClass();
            android.widget.TextView textView5 = (android.widget.TextView) view.findViewById(android.R.id.summary);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = ggVar.f242610a;
            if (textView5 != null) {
                textView5.setTextSize(0, i65.a.f(c21549x15041e54.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(c21549x15041e54.f279303d));
                textView5.setGravity(8388613);
                textView5.setEllipsize(android.text.TextUtils.TruncateAt.END);
            }
            android.widget.TextView textView6 = (android.widget.TextView) view.findViewById(android.R.id.title);
            if (textView6 != null) {
                textView6.setTextSize(0, i65.a.f(c21549x15041e54.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(c21549x15041e54.f279303d));
                textView6.setMaxLines(1);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, M(), viewGroup2);
        this.W1 = u17;
        java.lang.String str = this.N1;
        if (str != null && str.length() > 0) {
            this.W1.setContentDescription(this.N1);
        }
        return this.W1;
    }

    public C21549x15041e54(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21549x15041e54(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = 8;
        this.P = null;
        this.Q = -1;
        this.S = null;
        this.V = "";
        this.W = -1;
        this.X = 8;
        this.Y = 8;
        this.Z = 8;
        this.f279284p0 = "";
        this.f279286x0 = "";
        this.f279288y0 = -1;
        this.f279283l1 = 8;
        this.f279285p1 = -1;
        this.f279287x1 = -1;
        this.f279289y1 = null;
        this.f279290z1 = 8;
        this.A1 = 8;
        this.B1 = 8;
        this.C1 = 8;
        this.D1 = null;
        this.E1 = null;
        this.F1 = null;
        this.G1 = null;
        this.O1 = -1;
        this.P1 = -1;
        this.R1 = false;
        this.S1 = false;
        this.T1 = -1;
        this.U1 = false;
        this.V1 = false;
        this.X1 = null;
        this.Q1 = context;
        this.P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561408ho);
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
