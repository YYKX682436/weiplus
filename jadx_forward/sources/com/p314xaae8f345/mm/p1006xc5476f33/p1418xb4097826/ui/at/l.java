package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at;

/* loaded from: classes.dex */
public abstract class l extends hg5.d implements tj5.n {
    public final jz5.g A;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Boolean f210420r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a f210421s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f210422t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f210423u;

    /* renamed from: v, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 f210424v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f210425w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f210426x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f210427y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f210428z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, java.lang.Boolean bool, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.a callback) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f210420r = bool;
        this.f210421s = callback;
        this.f210425w = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.i(this));
        this.f210426x = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.b(this));
        this.f210427y = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.h(context));
        this.f210428z = "";
        this.A = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.k(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // tj5.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C3(java.lang.String r1, java.lang.String r2, java.util.List r3, tj5.o r4) {
        /*
            r0 = this;
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L23
            boolean r4 = r26.n0.N(r1)
            r4 = r4 ^ r2
            if (r4 == 0) goto Lc
            goto Ld
        Lc:
            r1 = r3
        Ld:
            if (r1 == 0) goto L23
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r4 = r0.R()
            r4.D(r1)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f210424v
            if (r1 != 0) goto L1b
            goto L20
        L1b:
            r4 = 8
            r1.setVisibility(r4)
        L20:
            jz5.f0 r1 = jz5.f0.f384359a
            goto L24
        L23:
            r1 = r3
        L24:
            if (r1 != 0) goto L46
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r1 = r0.R()
            ym3.b r4 = r1.A
            r4.e()
            kotlinx.coroutines.r2 r1 = r1.B
            if (r1 == 0) goto L36
            p3325xe03a0797.p3326xc267989b.p2.a(r1, r3, r2, r3)
        L36:
            com.tencent.mm.plugin.finder.ui.at.FinderAtSomeoneLiveList r1 = r0.R()
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(r1, r3, r2, r3)
            com.tencent.mm.ui.base.AlphabetScrollBar r1 = r0.f210424v
            if (r1 != 0) goto L42
            goto L46
        L42:
            r2 = 0
            r1.setVisibility(r2)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.l.C3(java.lang.String, java.lang.String, java.util.List, tj5.o):void");
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(P(), (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381;
        android.view.View findViewById;
        super.G();
        android.view.View view = this.f362936i;
        if (view != null && (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)) != null) {
            findViewById.setContentDescription(findViewById.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dkw));
            findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.d(this));
        }
        if (getContext().getResources().getConfiguration().orientation == 2) {
            android.view.View view2 = this.f362937m;
            android.view.ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.width = mo0.h.a(getContext(), 512.0f);
            }
            android.view.View view3 = this.f362937m;
            android.view.ViewGroup.LayoutParams layoutParams2 = view3 != null ? view3.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams2 : null;
            if (layoutParams3 != null) {
                layoutParams3.addRule(14);
            }
            android.view.View view4 = this.f362936i;
            android.view.ViewGroup.LayoutParams layoutParams4 = view4 != null ? view4.getLayoutParams() : null;
            if (layoutParams4 != null) {
                layoutParams4.width = mo0.h.a(getContext(), 512.0f);
            }
            android.view.View view5 = this.f362936i;
            android.view.ViewGroup.LayoutParams layoutParams5 = view5 != null ? view5.getLayoutParams() : null;
            android.widget.RelativeLayout.LayoutParams layoutParams6 = layoutParams5 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.addRule(14);
            }
            android.view.View view6 = this.f362935h;
            if (view6 != null) {
                view6.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.c(view6, this));
            }
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Boolean bool2 = this.f210420r;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, bool)) {
            android.view.View view7 = this.f362936i;
            if (view7 != null) {
                c22479x68a26381 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) view7.findViewById(com.p314xaae8f345.mm.R.id.gfm);
            }
            c22479x68a26381 = null;
        } else {
            android.view.View view8 = this.f362936i;
            if (view8 != null) {
                c22479x68a26381 = (com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381) view8.findViewById(com.p314xaae8f345.mm.R.id.gfl);
            }
            c22479x68a26381 = null;
        }
        this.f210422t = c22479x68a26381;
        if (c22479x68a26381 != null) {
            c22479x68a26381.setVisibility(0);
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a263812 = this.f210422t;
        if (c22479x68a263812 != null) {
            c22479x68a263812.g();
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a263813 = this.f210422t;
        if (c22479x68a263813 != null) {
            c22479x68a263813.m80988xce28f7ee(this);
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a263814 = this.f210422t;
        if (c22479x68a263814 != null) {
            c22479x68a263814.m80989x764b0e09(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572082y8));
        }
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a263815 = this.f210422t;
        if (c22479x68a263815 != null) {
            c22479x68a263815.f291349g.setTextSize(1, 17.0f);
        }
        android.view.View view9 = this.f362936i;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = view9 != null ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view9.findViewById(com.p314xaae8f345.mm.R.id.f565154bh0) : null;
        this.f210423u = c22849x81a93d25;
        jz5.g gVar = this.f210426x;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f210423u;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7967x900dcbe1((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) this.f210427y).mo141623x754a37bb());
        }
        ((xm3.t0) ((jz5.n) gVar).mo141623x754a37bb()).B = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.j) ((jz5.n) this.A).mo141623x754a37bb();
        android.view.View view10 = this.f362936i;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3 = view10 != null ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3) view10.findViewById(com.p314xaae8f345.mm.R.id.f564479sj) : null;
        this.f210424v = c21465x84498b3;
        if (c21465x84498b3 != null) {
            c21465x84498b3.m79298x40d747ee(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.e(this));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b32 = this.f210424v;
        if (c21465x84498b32 != null) {
            c21465x84498b32.m78861xe90b84f5(new java.lang.String[]{"🔍", "#"});
        }
        R().f233604u.mo7806x9d92d11c(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.f(this));
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool2, bool)) {
            M();
        } else {
            android.view.View view11 = this.f362937m;
            if (view11 != null) {
                view11.setBackground(null);
            }
            android.view.View view12 = this.f362936i;
            if (view12 != null) {
                view12.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ag_);
            }
        }
        android.view.View view13 = this.f362936i;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = view13 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) view13.findViewById(com.p314xaae8f345.mm.R.id.enn) : null;
        if (c22613xe7040d9c == null) {
            return;
        }
        c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.g(this));
    }

    @Override // tj5.n
    public boolean G0() {
        return true;
    }

    public abstract in5.s K();

    public abstract java.lang.String L(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var);

    public void M() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522;
        android.view.View view = this.f362937m;
        if (view != null) {
            view.setBackground(null);
        }
        android.view.View view2 = this.f362936i;
        if (view2 != null) {
            view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aga);
        }
        android.view.View view3 = this.f362936i;
        if (view3 != null && (c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view3.findViewById(com.p314xaae8f345.mm.R.id.f565291bz2)) != null) {
            c22699x3dcdb3522.m82040x7541828(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        }
        android.view.View view4 = this.f362936i;
        if (view4 != null && (textView = (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.odf)) != null) {
            textView.setTextColor(android.graphics.Color.parseColor("#CCFFFFFF"));
        }
        android.view.View view5 = this.f362936i;
        if (view5 != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view5.findViewById(com.p314xaae8f345.mm.R.id.meb)) != null) {
            c22699x3dcdb352.m82040x7541828(android.graphics.Color.parseColor("#6B6B6B"));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b3 = this.f210424v;
        if (c21465x84498b3 != null) {
            c21465x84498b3.m78863x1c5c5ff4(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77671x8113c22a));
        }
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21465x84498b3 c21465x84498b32 = this.f210424v;
        if (c21465x84498b32 != null) {
            c21465x84498b32.m78862x5756e8e0(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
        }
    }

    public abstract ym3.a N();

    public abstract ym3.b O();

    public abstract int P();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.C15102xc0008663 R() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.at.C15102xc0008663) ((jz5.n) this.f210425w).mo141623x754a37bb();
    }

    @Override // tj5.n
    public void U1(boolean z17) {
    }

    @Override // tj5.n
    public void o3(int i17, tj5.x xVar) {
    }

    @Override // tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
    }
}
