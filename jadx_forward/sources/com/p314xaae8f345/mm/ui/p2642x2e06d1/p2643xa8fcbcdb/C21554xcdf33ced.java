package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.KeyValuePreference */
/* loaded from: classes9.dex */
public class C21554xcdf33ced extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.LinearLayout N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public java.lang.String S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public android.widget.ImageView Y;
    public android.graphics.drawable.Drawable Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f279291l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f279292p0;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.List f279293x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f279294y0;

    public C21554xcdf33ced(android.content.Context context) {
        this(context, null);
    }

    public void M(android.view.View view) {
        ((java.util.LinkedList) this.f279293x0).add(view);
    }

    public void N() {
        ((java.util.LinkedList) this.f279293x0).clear();
    }

    public void O(boolean z17) {
        this.R = z17;
        if (z17) {
            this.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570827c10;
        }
    }

    public void Q(android.graphics.drawable.Drawable drawable) {
        this.Z = drawable;
    }

    public void R(int i17) {
        this.X = i17;
    }

    public void S(int i17) {
        this.f279291l1 = i17;
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setMaxLines(i17);
        }
    }

    public void T(boolean z17) {
        this.P = z17;
    }

    public void V(java.lang.String str) {
        this.S = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.widget.LinearLayout linearLayout;
        super.t(view);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.m7k);
        this.f279292p0 = findViewById;
        if (this.f279305f != null) {
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.w(this));
        }
        this.L = (android.widget.TextView) view.findViewById(android.R.id.summary);
        this.N = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.nsc);
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setSingleLine(this.P);
            if (this.U) {
                this.N.setGravity(this.W);
            }
        }
        if (this.R) {
            this.H = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570827c10;
        }
        this.M = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.S)) {
            this.M.setText(this.S);
        }
        android.widget.TextView textView2 = this.M;
        android.content.Context context = this.f279303d;
        if (textView2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            int i17 = this.f279294y0;
            if (i17 == 0) {
                i17 = i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561319f7);
            }
            layoutParams2.width = i17;
            this.M.setLayoutParams(layoutParams2);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        this.Y = imageView;
        if (this.Z != null) {
            imageView.setVisibility(this.X);
            this.Y.setImageDrawable(this.Z);
        } else {
            imageView.setVisibility(8);
        }
        if (this.T && (linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.cg7)) != null) {
            linearLayout.setGravity(this.V);
        }
        java.util.List<android.view.View> list = this.f279293x0;
        if (((java.util.LinkedList) list).size() > 0) {
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.nsc);
            linearLayout2.removeAllViews();
            for (android.view.View view2 : list) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view2);
                }
                linearLayout2.addView(view2);
            }
        }
        if (this.Q) {
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.cg7);
            if (findViewById2 instanceof android.widget.LinearLayout) {
                ((android.widget.LinearLayout) findViewById2).setGravity(16);
            }
            android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.oct);
            if ((findViewById3 instanceof android.view.ViewGroup) && (layoutParams = findViewById3.getLayoutParams()) != null) {
                layoutParams.height = -2;
                findViewById3.setLayoutParams(layoutParams);
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.M.getLayoutParams();
            layoutParams3.gravity = 48;
            layoutParams3.topMargin = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            this.M.setLayoutParams(layoutParams3);
            com.p314xaae8f345.mm.ui.bk.s0(this.M.getPaint());
            this.M.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
            this.L.setTextSize(0, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561383gz));
            this.L.setTextColor(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.ahj));
        }
        int i18 = this.f279291l1;
        if (i18 > 0) {
            this.L.setMaxLines(i18);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzk, viewGroup2);
        return u17;
    }

    public C21554xcdf33ced(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21554xcdf33ced(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = true;
        this.Q = false;
        this.R = false;
        this.S = null;
        this.T = false;
        this.U = false;
        this.V = 17;
        this.W = 17;
        this.X = 0;
        this.Y = null;
        this.Z = null;
        this.f279293x0 = new java.util.LinkedList();
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
