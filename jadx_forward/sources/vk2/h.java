package vk2;

/* loaded from: classes3.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final tk2.a f519295h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f519296i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f519297m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f519298n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f519299o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f519300p;

    /* renamed from: q, reason: collision with root package name */
    public int f519301q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f519302r;

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.C14262x69c84bcd f519303s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1] */
    public h(android.content.Context context, tk2.a service) {
        super(context, false, null, false, 14, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f519295h = service;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f519299o = arrayList;
        this.f519300p = new java.util.ArrayList();
        jz5.g b17 = jz5.h.b(new vk2.f(this));
        this.f519302r = jz5.h.b(new vk2.e(context, this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f519297m;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7() { // from class: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: supportsPredictiveItemAnimations */
            public boolean mo7924x9f0306c5() {
                return false;
            }
        });
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f519297m;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba42.N(new vk2.d());
        vk2.a aVar = new vk2.a(this, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1522xbb6ca34f.C14260x30900fa3) ((jz5.n) b17).mo141623x754a37bb(), arrayList);
        this.f519298n = aVar;
        aVar.f374638o = new vk2.b(this);
        aVar.f374637n = new vk2.c(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f519297m;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba43.mo7960x6cab2c8d(aVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f519297m;
        if (c1163xf1deaba44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba44.m7963x830bc99d(true);
        this.f519303s = new p012xc85e97e9.p093xedfae76a.x() { // from class: com.tencent.mm.plugin.finder.live.multistream.panel.FinderLiveMultiStreamBottomPanelWidget$lifeObserver$1
            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE)
            /* renamed from: onPause */
            public final void m56890xb01dfb57() {
                wk2.j y17 = vk2.h.this.y();
                java.util.HashSet hashSet = y17.f528483f;
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    y17.e((wk2.d) it.next());
                }
                hashSet.clear();
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_RESUME)
            /* renamed from: onResume */
            public final void m56891x57429eec() {
                wk2.j y17 = vk2.h.this.y();
                y17.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamAutoPlay", "checkAutoPlay");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = y17.f528486i;
                java.lang.Runnable runnable = y17.f528487j;
                n3Var.mo50300x3fa464aa(runnable);
                n3Var.mo50297x7c4d7ca2(runnable, 0L);
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.avu;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573237dz3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f519296i = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.kor);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f519297m = c1163xf1deaba4;
        c1163xf1deaba4.setNestedScrollingEnabled(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        wk2.j y17 = y();
        java.util.HashSet hashSet = y17.f528483f;
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            y17.e((wk2.d) it.next());
        }
        hashSet.clear();
        android.content.Context context = this.f199914d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null && (mo273xed6858b4 = abstractActivityC21394xb3d2c0cf.mo273xed6858b4()) != null) {
            mo273xed6858b4.c(this.f519303s);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f519297m;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(this.f519298n);
        z(this.f519301q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        pm0.v.V(300L, new vk2.g(this));
    }

    public final wk2.j y() {
        return (wk2.j) ((jz5.n) this.f519302r).mo141623x754a37bb();
    }

    public final void z(int i17) {
        if (i17 % 2 != 0) {
            i17--;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f519297m;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/multistream/panel/FinderLiveMultiStreamBottomPanelWidget", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/multistream/panel/FinderLiveMultiStreamBottomPanelWidget", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }
}
