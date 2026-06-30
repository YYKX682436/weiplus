package gn4;

/* loaded from: classes15.dex */
public class c0 extends fn4.h {
    public android.view.View E;
    public android.view.View F;
    public android.widget.ImageView G;
    public android.widget.TextView H;
    public android.view.View I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f355128J;
    public android.view.View K;
    public android.view.View L;
    public android.view.View M;
    public android.view.View N;
    public android.view.View P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;
    public android.widget.ImageView T;
    public android.widget.ImageView U;
    public android.widget.TextView V;
    public android.view.View W;

    /* renamed from: l1, reason: collision with root package name */
    public gn4.b0 f355129l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.TextView f355130p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f355131p1;

    /* renamed from: x0, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f355132x0;

    /* renamed from: y0, reason: collision with root package name */
    public r45.xn6 f355133y0;

    public void A(r45.xn6 xn6Var) {
        this.f355133y0 = xn6Var;
        android.view.View view = this.E;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        float dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1u);
        this.f244010m.setTextSize(0, dimensionPixelSize);
        this.f244011n.setTextSize(0, dimensionPixelSize);
        android.view.ViewGroup.LayoutParams layoutParams = this.K.getLayoutParams();
        layoutParams.height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1t);
        this.K.setLayoutParams(layoutParams);
        if (xn6Var.D.size() > 0) {
            android.view.View view2 = this.L;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.M;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.LinkedList linkedList = xn6Var.D;
            r45.x56 x56Var = (r45.x56) linkedList.get(0);
            this.N.setTag(x56Var);
            this.Q.setText(x56Var.f471329e);
            this.Q.setVisibility(0);
            android.view.View view4 = this.N;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.S.setVisibility(8);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x56Var.f471335n)) {
                n11.a.b().h(x56Var.f471335n, this.S, wm4.u.f528843b);
                this.S.setVisibility(0);
            }
            if (linkedList.size() > 1) {
                r45.x56 x56Var2 = (r45.x56) linkedList.get(1);
                this.P.setTag(x56Var2);
                this.R.setText(x56Var2.f471329e);
                this.R.setVisibility(0);
                android.view.View view5 = this.P;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.T.setVisibility(8);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(x56Var2.f471335n)) {
                    n11.a.b().h(x56Var2.f471335n, this.T, wm4.u.f528843b);
                    this.T.setVisibility(0);
                }
            } else {
                android.view.View view6 = this.P;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.R.setVisibility(8);
            }
        } else {
            android.view.View view7 = this.L;
            if (view7 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view8 = this.M;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        B(xn6Var);
        if (this.f355131p1) {
            android.view.View view9 = this.M;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view10 = this.W;
        if (view10 != null && this.V != null && this.U != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.V.setVisibility(8);
            this.U.setVisibility(8);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xn6Var.f471802t)) {
                this.V.setText(xn6Var.f471802t);
                this.V.setVisibility(0);
                if (fn4.z0.f(xn6Var)) {
                    android.view.View view11 = this.W;
                    java.util.ArrayList arrayList11 = new java.util.ArrayList();
                    arrayList11.add(0);
                    java.util.Collections.reverse(arrayList11);
                    yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                    yj0.a.f(view11, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateView", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xn6Var.C)) {
                    this.U.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
                } else {
                    n11.a.b().h(xn6Var.C, this.U, wm4.u.f528842a);
                }
                this.U.setVisibility(0);
            }
        }
        android.widget.TextView textView = this.f355130p0;
        if (textView != null) {
            textView.setText(xn6Var.f471788d);
        }
    }

    public void B(r45.xn6 xn6Var) {
        if ((xn6Var.L & 128) <= 0) {
            android.view.View view = this.F;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.F;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "updateWowUI", "(Lcom/tencent/mm/protocal/protobuf/TopStoryVideoInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (xn6Var.R) {
            this.G.setImageResource(com.p314xaae8f345.mm.R.raw.f81241x228946f);
            this.H.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9b));
        } else {
            this.G.setImageResource(com.p314xaae8f345.mm.R.raw.f81242x1effd508);
            this.H.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        }
        this.H.setText(wm4.u.p(xn6Var.X));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getBarPointWidth */
    public int mo69279x5853ad3() {
        return this.f244008h.getWidth();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d1p;
    }

    /* renamed from: getWowView */
    public android.view.View m131888x98f24fae() {
        return this.F;
    }

    @Override // fn4.h, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void j() {
        super.j();
        this.I = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.cgt);
        this.E = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.msx);
        this.F = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.poj);
        this.G = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.poi);
        this.H = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.poh);
        this.f355128J = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.f568007lc1);
        this.K = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.f568006lc0);
        this.L = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.nwl);
        this.M = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.avu);
        this.N = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.nvx);
        this.P = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.f568742nw1);
        this.Q = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.nvy);
        this.R = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.f568743nw2);
        this.S = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.nvw);
        this.T = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.f568741nw0);
        this.U = (android.widget.ImageView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.ne8);
        this.V = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.nec);
        this.W = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.ne7);
        this.f355130p0 = (android.widget.TextView) this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.odf);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void m() {
        r45.xn6 xn6Var;
        super.m();
        gn4.b0 b0Var = this.f355129l1;
        if (b0Var == null || (xn6Var = this.f355133y0) == null) {
            return;
        }
        int i17 = this.f244013p;
        int mo69281xdf1112ec = mo69281xdf1112ec();
        gn4.z zVar = ((gn4.n) b0Var).f355174a;
        int width = mo69281xdf1112ec > 0 ? (zVar.f346060y.getWidth() * i17) / mo69281xdf1112ec : 0;
        rm4.d dVar = zVar.m131898x15cb7231().o4().f346012f;
        if (dVar != null && dVar.f478988d < zVar.m131898x15cb7231().I2().c()) {
            dVar.f478988d = zVar.m131898x15cb7231().I2().c();
        }
        fn4.b bVar = zVar.A;
        if (bVar.I2().d()) {
            int c17 = bVar.I2().c() / 1000;
            if (((wm4.p) i95.n0.c(wm4.p.class)).f528832f.containsKey(xn6Var.f471792h)) {
                ((wm4.p) i95.n0.c(wm4.p.class)).f528832f.put(xn6Var.f471792h, java.lang.Integer.valueOf(c17));
            }
        }
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) zVar.f346059x.getLayoutParams();
        layoutParams.width = width;
        zVar.f346059x.setLayoutParams(layoutParams);
        zVar.f346059x.requestLayout();
        if (!(zVar.G.getVisibility() == 0)) {
            zVar.G.w();
        }
        if ((xn6Var.L & 256) <= 0) {
            bVar.g1(xn6Var, zVar, i17, mo69281xdf1112ec);
        }
        bVar.v6(xn6Var, zVar, i17, mo69281xdf1112ec);
    }

    /* renamed from: setOnUpdateProgressLenListener */
    public void mo131889x46e95712(gn4.b0 b0Var) {
        this.f355129l1 = b0Var;
    }

    /* renamed from: setOnlyFS */
    public void m131890x1bf7447b(boolean z17) {
        this.f355131p1 = z17;
    }

    /* renamed from: setShareBtnClickListener */
    public void m131891x5634481d(android.view.View.OnClickListener onClickListener) {
        this.E.setOnClickListener(onClickListener);
    }

    /* renamed from: setSourceItemClickListener */
    public void m131892xe48a706c(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.V;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        android.widget.ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        android.view.View view = this.W;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setTagBtnClickListener */
    public void m131893x35bdf958(android.view.View.OnClickListener onClickListener) {
        this.N.setOnClickListener(onClickListener);
        this.P.setOnClickListener(onClickListener);
    }

    /* renamed from: setTitleClickListener */
    public void m131894x8f9a66e6(android.view.View.OnClickListener onClickListener) {
        this.f355130p0.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        gn4.b0 b0Var;
        super.setVisibility(i17);
        if (i17 != 8 && i17 != 4) {
            if (i17 != 0 || (b0Var = this.f355129l1) == null) {
                return;
            }
            ((gn4.n) b0Var).f355174a.f346058w.setVisibility(8);
            return;
        }
        gn4.b0 b0Var2 = this.f355129l1;
        if (b0Var2 != null) {
            gn4.z zVar = ((gn4.n) b0Var2).f355174a;
            if (zVar.m131898x15cb7231().I2().f346109e && (zVar.m131898x15cb7231().I2().d() || zVar.m131898x15cb7231().I2().f346110f)) {
                zVar.f346058w.setVisibility(0);
            } else {
                zVar.f346058w.setVisibility(8);
            }
        }
    }

    /* renamed from: setWowBtnClickListener */
    public void m131895x69555c5d(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.F;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "setWowBtnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoControlBar", "setWowBtnClickListener", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.F.setOnClickListener(onClickListener);
    }

    @Override // fn4.h
    public void w() {
        setVisibility(8);
    }

    @Override // fn4.h
    public void x() {
        setVisibility(0);
        this.f244009i.setVisibility(0);
        if (this.f355132x0 == null) {
            this.f355132x0 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new gn4.a0(this), false);
        }
        this.f355132x0.d();
        this.f355132x0.c(2000L, 2000L);
    }

    public void y() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f355132x0;
        if (b4Var != null) {
            b4Var.d();
            this.f355132x0.c(2000L, 2000L);
        }
    }

    public void z() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f355132x0;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
