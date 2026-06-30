package wk2;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f528478a;

    /* renamed from: b, reason: collision with root package name */
    public final int f528479b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f528480c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f528481d;

    /* renamed from: e, reason: collision with root package name */
    public final tk2.a f528482e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f528483f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 f528484g;

    /* renamed from: h, reason: collision with root package name */
    public final wk2.c f528485h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f528486i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.Runnable f528487j;

    public j(android.content.Context context, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, java.util.ArrayList dataList, tk2.a service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f528478a = context;
        this.f528479b = i17;
        this.f528480c = recyclerView;
        this.f528481d = dataList;
        this.f528482e = service;
        this.f528483f = new java.util.HashSet();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        this.f528484g = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7) layoutManager;
        this.f528485h = new wk2.c();
        this.f528486i = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        recyclerView.i(new wk2.h(this));
        this.f528487j = new wk2.e(this);
    }

    public final void a(int i17) {
        jz5.f0 f0Var;
        android.view.View mo7935xa188593e = this.f528484g.mo7935xa188593e(i17);
        if (mo7935xa188593e != null) {
            if (!((mm2.c1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) this.f528482e).P0(mm2.c1.class)).f8()) {
                uk2.a c17 = c(i17);
                if (c17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MultiStreamAutoPlay", "checkAutoPlay pos:" + i17 + "  return for data = null");
                } else {
                    android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mo7935xa188593e.findViewById(com.p314xaae8f345.mm.R.id.icp);
                    if (frameLayout == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MultiStreamAutoPlay", "checkAutoPlay pos:" + i17 + " return for view:" + mo7935xa188593e);
                    } else {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4) frameLayout.findViewWithTag("nearby-live-preview-view-tag");
                        if (c14263xfb9026d4 != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamAutoPlay", "getOrCreateLiveView get view:" + c14263xfb9026d4);
                        } else {
                            wk2.c cVar = this.f528485h;
                            cVar.getClass();
                            android.content.Context context = this.f528478a;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                            java.util.HashSet hashSet = cVar.f528468a;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4) pm0.v.a0(hashSet, wk2.a.f528466d);
                            if (c14263xfb9026d42 != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerViewRecycler", "getOrCreate: get view success, view.hashcode = " + c14263xfb9026d42.hashCode() + " recycledViews.size = " + hashSet.size());
                                c14263xfb9026d4 = c14263xfb9026d42;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d43 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4(context);
                                cVar.f528469b.add(new java.lang.ref.WeakReference(c14263xfb9026d43));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerViewRecycler", "createView view:" + c14263xfb9026d43);
                                c14263xfb9026d4 = c14263xfb9026d43;
                            }
                            c14263xfb9026d4.setTag("nearby-live-preview-view-tag");
                            frameLayout.addView(c14263xfb9026d4);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamAutoPlay", "getOrCreateLiveView create view:" + c14263xfb9026d4);
                        }
                        boolean d17 = d(c14263xfb9026d4);
                        java.util.HashSet hashSet2 = this.f528483f;
                        if (d17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MultiStreamAutoPlay", "checkAutoPlay pos:" + i17 + " isCurPlayerView true , data: " + c17 + " set:" + hashSet2.size());
                        } else {
                            hashSet2.add(new wk2.d(i17, c14263xfb9026d4, c17));
                            c14263xfb9026d4.c(c17);
                        }
                    }
                }
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MultiStreamAutoPlay", "checkAutoPlayInternal invalid pos:" + i17 + " view:" + mo7935xa188593e);
        }
    }

    public final void b(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15416x1f1f78b7 c15416x1f1f78b7 = this.f528484g;
        android.view.View mo7935xa188593e = c15416x1f1f78b7.mo7935xa188593e(i17);
        if (mo7935xa188593e != null) {
            int i18 = c15416x1f1f78b7.f93457h;
            android.graphics.Rect rect = new android.graphics.Rect();
            mo7935xa188593e.getGlobalVisibleRect(rect);
            if ((((float) (i18 == 0 ? rect.width() : rect.height())) * 1.0f) / ((float) (i18 == 0 ? mo7935xa188593e.getWidth() : mo7935xa188593e.getHeight())) < 0.5f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4) mo7935xa188593e.findViewWithTag("nearby-live-preview-view-tag");
                if (c14263xfb9026d4 != null ? d(c14263xfb9026d4) : false) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamAutoPlay", "stopCurrentView: pos");
                    this.f528486i.mo50300x3fa464aa(this.f528487j);
                    java.util.HashSet hashSet = this.f528483f;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        java.lang.Object next = it.next();
                        if (((wk2.d) next).f528471a == i17) {
                            arrayList.add(next);
                        }
                    }
                    java.util.Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        e((wk2.d) it6.next());
                    }
                    kz5.h0.A(hashSet, new wk2.i(i17));
                }
            }
        }
    }

    public final uk2.a c(int i17) {
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f528481d;
            if (i17 < arrayList.size()) {
                return (uk2.a) arrayList.get(i17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MultiStreamAutoPlay", "getFeedByPos return for invalid pos:" + i17);
        return null;
    }

    public final boolean d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d4) {
        java.lang.Object obj;
        java.util.Iterator it = this.f528483f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((wk2.d) obj).f528472b, c14263xfb9026d4)) {
                break;
            }
        }
        return obj != null;
    }

    public final void e(wk2.d dVar) {
        dVar.f528472b.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d4 = dVar.f528472b;
        android.view.ViewParent parent = c14263xfb9026d4.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(c14263xfb9026d4);
        }
        wk2.c cVar = this.f528485h;
        cVar.getClass();
        if (c14263xfb9026d4.getParent() != null) {
            android.view.ViewParent parent2 = c14263xfb9026d4.getParent();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent2).removeView(c14263xfb9026d4);
        }
        mn0.b0 b0Var = c14263xfb9026d4.f193289d;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            c14263xfb9026d4.d();
        }
        java.util.HashSet hashSet = cVar.f528468a;
        hashSet.add(c14263xfb9026d4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("recycleView view:");
        sb6.append(c14263xfb9026d4);
        sb6.append(" isPlaying:");
        mn0.b0 b0Var2 = c14263xfb9026d4.f193289d;
        sb6.append(b0Var2 != null && ((mn0.y) b0Var2).b(false));
        sb6.append(" size:");
        sb6.append(hashSet.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerViewRecycler", sb6.toString());
    }
}
