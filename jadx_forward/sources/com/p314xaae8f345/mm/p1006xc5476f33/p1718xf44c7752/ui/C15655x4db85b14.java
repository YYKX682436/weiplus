package com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui;

/* renamed from: com.tencent.mm.plugin.gallery.ui.ImageFolderMgrView */
/* loaded from: classes10.dex */
public class C15655x4db85b14 extends android.widget.LinearLayout implements t23.k1, android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public e33.e3 f220092d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f220093e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f220094f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 f220095g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f220096h;

    /* renamed from: i, reason: collision with root package name */
    public e33.c2 f220097i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f220098m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f220099n;

    /* renamed from: o, reason: collision with root package name */
    public t23.k1 f220100o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f220101p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15636x5edd5fff f220102q;

    /* renamed from: r, reason: collision with root package name */
    public e33.g3 f220103r;

    /* renamed from: s, reason: collision with root package name */
    public e33.f3 f220104s;

    public C15655x4db85b14(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f220092d = null;
        this.f220098m = false;
        this.f220099n = false;
        this.f220101p = new java.util.LinkedList();
        this.f220102q = null;
        setOrientation(1);
        this.f220093e = new android.widget.FrameLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        this.f220093e.setVisibility(8);
        addView(this.f220093e, layoutParams);
        android.view.View view = new android.view.View(getContext());
        this.f220094f = view;
        view.setBackgroundColor(-872415232);
        this.f220094f.setOnClickListener(new e33.y2(this));
        this.f220093e.addView(this.f220094f, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55 c22646x1e9ca55 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22646x1e9ca55(getContext());
        this.f220095g = c22646x1e9ca55;
        c22646x1e9ca55.b(0.0f, 0.0f, com.p314xaae8f345.mm.ui.zk.a(getContext(), 8), com.p314xaae8f345.mm.ui.zk.a(getContext(), 8));
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a1w);
        layoutParams2.gravity = 48;
        this.f220093e.addView(this.f220095g, layoutParams2);
        android.widget.ListView listView = new android.widget.ListView(getContext());
        this.f220096h = listView;
        listView.setCacheColorHint(0);
        this.f220096h.setOnItemClickListener(this);
        this.f220095g.addView(this.f220096h, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        e33.c2 c2Var = new e33.c2(getContext());
        this.f220097i = c2Var;
        this.f220096h.setAdapter((android.widget.ListAdapter) c2Var);
        this.f220100o = new e33.z2(this);
        getViewTreeObserver().addOnPreDrawListener(new e33.b3(this));
    }

    @Override // t23.k1
    public void F6(java.util.LinkedList linkedList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFolderMgrView", "onQueryAlbumFinished, %s, size: %s.", this, java.lang.Integer.valueOf(linkedList.size()));
        t23.p0.k().f496825a.remove(this);
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) it.next();
            if (com.p314xaae8f345.mm.vfs.w6.j(c15630x7d8d0183.n())) {
                linkedList2.add(c15630x7d8d0183);
            }
        }
        t23.p0.n().c(new e33.d3(this, linkedList2));
    }

    public final void a(boolean z17) {
        if (this.f220098m == z17 || this.f220099n) {
            return;
        }
        if (this.f220098m) {
            this.f220099n = true;
            android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -1.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setAnimationListener(new e33.x2(this));
            this.f220096h.startAnimation(translateAnimation);
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setDuration(300L);
            this.f220094f.startAnimation(alphaAnimation);
            return;
        }
        this.f220099n = true;
        this.f220093e.setVisibility(0);
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(300L);
        this.f220094f.startAnimation(alphaAnimation2);
        android.view.animation.TranslateAnimation translateAnimation2 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        translateAnimation2.setDuration(300L);
        translateAnimation2.setAnimationListener(new e33.w2(this));
        this.f220096h.startAnimation(translateAnimation2);
    }

    public void b(java.util.List list, v23.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = list.iterator();
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d01832 = null;
        while (it.hasNext()) {
            v23.b bVar2 = (v23.b) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar2, "<this>");
            if (bVar2 instanceof v23.c) {
                c15630x7d8d0183 = ((v23.c) bVar2).f514425g;
            } else {
                java.util.List list2 = bVar2.f514420b;
                c15630x7d8d0183 = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183(bVar2.f514419a, list2.size());
                c15630x7d8d0183.r(bVar2.f514421c);
                c15630x7d8d0183.f219953i = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) kz5.n0.a0(list2, 0);
                c15630x7d8d0183.f219954m = bVar2.f514422d;
                c15630x7d8d0183.f219955n = bVar2.f514423e == 2;
            }
            linkedList.add(c15630x7d8d0183);
            if (bVar != null && bVar2 == bVar) {
                c15630x7d8d01832 = c15630x7d8d0183;
            }
        }
        this.f220097i.d(linkedList);
        if (c15630x7d8d01832 != null) {
            e33.c2 c2Var = this.f220097i;
            java.lang.String str = c15630x7d8d01832.f219951g;
            c2Var.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            java.lang.String str2 = c15630x7d8d01832.f219948d;
            if (str2 == null) {
                str2 = "";
            }
            c2Var.f328718f = str2;
            c2Var.f328719g = str;
        }
        this.f220097i.notifyDataSetChanged();
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 item = this.f220097i.getItem(i17);
        if (item == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFolderMgrView", "toSelectItemByPos, get folder failed:" + i17);
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageFolderMgrView", "toSelectItemByPos: %d", java.lang.Integer.valueOf(i17));
        a(false);
        e33.e3 e3Var = this.f220092d;
        if (e3Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = ((e33.e0) e3Var).f328742a;
            activityC15653x403456cd.f220047d2 = item;
            e33.d2 d2Var = activityC15653x403456cd.f220052g2;
            if (d2Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.ActivityC13334x22686520 activityC13334x22686520 = ((e22.f) d2Var).f328181a;
                activityC13334x22686520.W6().a();
                com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e.C13338xd2201716 W6 = activityC13334x22686520.W6();
                java.lang.String nickName = item.f219949e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(nickName, "nickName");
                W6.f179685d.setText(nickName);
            }
        }
        e33.c2 c2Var = this.f220097i;
        java.lang.String str = item.f219951g;
        c2Var.getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str2 = item.f219948d;
        if (str2 == null) {
            str2 = "";
        }
        c2Var.f328718f = str2;
        c2Var.f328719g = str;
        this.f220097i.notifyDataSetChanged();
        return item;
    }

    public void d() {
        a(!this.f220098m);
        e33.c2 c2Var = this.f220097i;
        java.util.LinkedList linkedList = c2Var.f328717e;
        if (linkedList == null || linkedList.size() == 0 || !c2Var.f328720h) {
            return;
        }
        for (int i17 = 0; i17 < c2Var.f328717e.size(); i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183 c15630x7d8d0183 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15630x7d8d0183) c2Var.f328717e.get(i17);
            if (c15630x7d8d0183 != null && c15630x7d8d0183.f219956o) {
                t23.p0.n().d(new e33.a2(c2Var, new java.util.concurrent.atomic.AtomicReference(c15630x7d8d0183)));
            }
        }
    }

    /* renamed from: getSelectedAlbumName */
    public java.lang.String m63713xfd841089() {
        return this.f220097i.f328718f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        c(i17);
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/ui/ImageFolderMgrView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    /* renamed from: setFavItemCount */
    public void m63714xa2cb4a63(int i17) {
        this.f220097i.getClass();
        e33.h3 h3Var = new e33.h3(null);
        h3Var.f328785d = new java.lang.ref.WeakReference(this.f220097i);
        t23.p0.n().c(h3Var);
    }

    /* renamed from: setFolderAlbumDialogDismiss */
    public void m63715x788e5d83(e33.f3 f3Var) {
        this.f220104s = f3Var;
    }

    /* renamed from: setListener */
    public void m63716xc6cf6336(e33.e3 e3Var) {
        this.f220092d = e3Var;
    }

    /* renamed from: setOnFolderStateChanged */
    public void m63717x864ef832(e33.g3 g3Var) {
        this.f220103r = g3Var;
    }

    /* renamed from: setupEnableCheckMediaCount */
    public void m63718x8e594833(java.lang.Boolean bool) {
        this.f220097i.f328720h = bool.booleanValue();
    }
}
