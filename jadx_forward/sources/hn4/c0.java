package hn4;

/* loaded from: classes15.dex */
public class c0 extends fn4.h {
    public final android.view.View E;
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 F;
    public hn4.b0 G;

    public c0(android.content.Context context) {
        super(context);
        this.E = this.f244005e.findViewById(com.p314xaae8f345.mm.R.id.f566623gh5);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getBarPointWidth */
    public int mo69279x5853ad3() {
        return this.f244008h.getWidth();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    /* renamed from: getLayoutId */
    public int mo61294x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571117d21;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19229x611ccebb, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.ui.C17688x1a8cfd10
    public void m() {
        super.m();
        hn4.b0 b0Var = this.G;
        if (b0Var != null) {
            int i17 = this.f244013p;
            int mo69281xdf1112ec = mo69281xdf1112ec();
            hn4.z zVar = ((hn4.k) b0Var).f364116a;
            int width = mo69281xdf1112ec > 0 ? (zVar.f346060y.getWidth() * i17) / mo69281xdf1112ec : 0;
            rm4.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).H.f346012f;
            if (dVar != null && dVar.f478988d < ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.c()) {
                dVar.f478988d = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.c();
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.d()) {
                int c17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar.m133835x24b16ea2()).f256659J.c() / 1000;
                if (((wm4.p) i95.n0.c(wm4.p.class)).f528832f.containsKey(zVar.E.f471792h)) {
                    ((wm4.p) i95.n0.c(wm4.p.class)).f528832f.put(zVar.E.f471792h, java.lang.Integer.valueOf(c17));
                }
            }
            if (!(zVar.G.getVisibility() == 0)) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) zVar.f346059x.getLayoutParams();
                layoutParams.width = width;
                zVar.f346059x.setLayoutParams(layoutParams);
                zVar.f346059x.requestLayout();
                zVar.f346058w.setVisibility(0);
            }
            r45.xn6 xn6Var = zVar.E;
            int i18 = xn6Var.L & 256;
            fn4.b bVar = zVar.A;
            if (i18 <= 0) {
                bVar.g1(xn6Var, zVar, i17, mo69281xdf1112ec);
            }
            bVar.v6(zVar.E, zVar, i17, mo69281xdf1112ec);
        }
    }

    /* renamed from: setFullScreenBtnClickListener */
    public void m133832x7efa255d(android.view.View.OnClickListener onClickListener) {
        this.E.setOnClickListener(onClickListener);
    }

    /* renamed from: setOnUpdateProgressLenListener */
    public void m133833x46e95712(hn4.b0 b0Var) {
        this.G = b0Var;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        hn4.b0 b0Var;
        super.setVisibility(i17);
        if (i17 != 8 && i17 != 4) {
            if (i17 != 0 || (b0Var = this.G) == null) {
                return;
            }
            hn4.z zVar = ((hn4.k) b0Var).f364116a;
            zVar.f346058w.setVisibility(8);
            if (zVar.E.V != null) {
                android.view.View view = zVar.K;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) zVar.K.getLayoutParams();
                layoutParams.bottomMargin = i65.a.f(zVar.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
                zVar.K.setLayoutParams(layoutParams);
            }
            if (zVar.M.getVisibility() == 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) zVar.M.getLayoutParams();
                layoutParams2.bottomMargin = i65.a.f(zVar.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
                zVar.M.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        hn4.b0 b0Var2 = this.G;
        if (b0Var2 != null) {
            hn4.z zVar2 = ((hn4.k) b0Var2).f364116a;
            if (zVar2.E.V != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryListVideoContainer", "longVideoInfo onControlBarGone");
                android.view.View view2 = zVar2.K;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer$10", "onControlBarGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar2.m133835x24b16ea2()).f256659J.f346109e && (((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar2.m133835x24b16ea2()).f256659J.d() || ((com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e) zVar2.m133835x24b16ea2()).f256659J.f346110f)) {
                zVar2.f346058w.setVisibility(0);
            } else {
                zVar2.f346058w.setVisibility(8);
            }
            if (zVar2.M.getVisibility() == 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams3 = (android.widget.RelativeLayout.LayoutParams) zVar2.M.getLayoutParams();
                layoutParams3.bottomMargin = i65.a.f(zVar2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
                zVar2.M.setLayoutParams(layoutParams3);
            }
        }
    }

    @Override // fn4.h
    public void w() {
        setVisibility(8);
    }

    @Override // fn4.h
    public void x() {
        setVisibility(0);
        this.f244009i.setVisibility(0);
        if (this.F == null) {
            this.F = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new hn4.a0(this), false);
        }
        this.F.d();
        this.F.c(2000L, 2000L);
    }
}
