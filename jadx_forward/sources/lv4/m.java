package lv4;

/* loaded from: classes12.dex */
public final class m implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final kv4.m f403059a;

    /* renamed from: b, reason: collision with root package name */
    public final mv4.e f403060b;

    /* renamed from: c, reason: collision with root package name */
    public final jv4.m f403061c;

    public m(kv4.m delegate, mv4.e data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f403059a = delegate;
        this.f403060b = data;
        this.f403061c = jv4.m.f383779i;
    }

    @Override // jv4.n
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        android.content.res.Resources resources;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        lv4.n nVar = holder instanceof lv4.n ? (lv4.n) holder : null;
        if (nVar == null) {
            return;
        }
        qv4.z zVar = (qv4.z) nVar;
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) zVar.f448563e).mo141623x754a37bb();
        mv4.e eVar = this.f403060b;
        if (textView != null) {
            textView.setText(((rv4.h) eVar).f482010f);
        }
        rv4.h hVar = (rv4.h) eVar;
        hVar.f482009e = hVar.f482008d;
        android.view.View view = ((qv4.z) ((lv4.n) holder)).f448562d;
        if (view != null) {
            view.getMeasuredHeight();
        }
        eVar.getClass();
        if (view != null) {
            com.p314xaae8f345.mm.ui.kk.f(view, ((rv4.h) eVar).f482009e);
        }
        rv4.h hVar2 = (rv4.h) eVar;
        boolean z17 = hVar2.f482015k;
        jz5.g gVar = zVar.f448565g;
        jz5.g gVar2 = zVar.f448566h;
        if (z17) {
            if (hVar2.f482016l) {
                android.view.View i18 = nVar.i();
                if (i18 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(i18, arrayList.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(i18, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view2 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                android.view.View i19 = nVar.i();
                if (i19 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(i19, arrayList4.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(i19, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            android.view.View j17 = nVar.j();
            if (j17 == null) {
                return;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(j17, arrayList5.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(j17, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (hVar2.f482016l) {
            android.view.View i27 = nVar.i();
            if (i27 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(i27, arrayList6.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i27.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(i27, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view4 = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            if (view4 != null) {
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                arrayList7.add(0);
                java.util.Collections.reverse(arrayList7);
                yj0.a.d(view4, arrayList7.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
            if (view5 != null) {
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view5, arrayList8.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View j18 = nVar.j();
            if (j18 != null) {
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(j18, arrayList9.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j18.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(j18, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view6 = (android.view.View) ((jz5.n) zVar.f448567i).mo141623x754a37bb();
            if (view6 != null) {
                view6.setOnClickListener(new lv4.d(this));
            }
            android.view.View view7 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
            if (view7 != null) {
                view7.setOnClickListener(new lv4.g(this));
            }
            android.view.View view8 = (android.view.View) ((jz5.n) zVar.f448564f).mo141623x754a37bb();
            if (view8 != null) {
                view8.setOnClickListener(new lv4.j(this));
                return;
            }
            return;
        }
        android.view.View i28 = nVar.i();
        if (i28 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(i28, arrayList10.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i28.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(i28, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View j19 = nVar.j();
        if (j19 != null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(j19, arrayList11.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j19.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(j19, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view9 = (android.view.View) ((jz5.n) zVar.f448572q).mo141623x754a37bb();
        if (view9 != null) {
            view9.setOnClickListener(new lv4.k(this));
        }
        int i29 = ((java.util.ArrayList) hVar2.f482011g).size() > hVar2.f482013i ? 0 : 8;
        jz5.g gVar3 = zVar.f448568m;
        android.view.View view10 = (android.view.View) ((jz5.n) gVar3).mo141623x754a37bb();
        if (view10 != null) {
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal12 = zj0.c.f554818a;
            arrayList12.add(java.lang.Integer.valueOf(i29));
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view10, arrayList12.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view11 = (android.view.View) ((jz5.n) zVar.f448571p).mo141623x754a37bb();
        if (view11 != null) {
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal13 = zj0.c.f554818a;
            arrayList13.add(java.lang.Integer.valueOf(i29));
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view11, arrayList13.toArray(), "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view11, "com/tencent/mm/plugin/websearch/teach/base/item/FTSTeachHistoryTitleItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view12 = (android.view.View) ((jz5.n) gVar3).mo141623x754a37bb();
        if (view12 != null) {
            view12.setOnClickListener(new lv4.l(this));
        }
        android.view.View view13 = (android.view.View) ((jz5.n) zVar.f448569n).mo141623x754a37bb();
        if (view13 != null) {
            view13.setRotation(hVar2.f482017m ? 180.0f : 0.0f);
        }
        android.widget.TextView textView2 = (android.widget.TextView) ((jz5.n) zVar.f448570o).mo141623x754a37bb();
        if (textView2 != null) {
            if (hVar2.f482017m) {
                resources = textView2.getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.o4q;
            } else {
                resources = textView2.getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.o3s;
            }
            textView2.setText(resources.getString(i17));
        }
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return this.f403061c;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return ((rv4.h) this.f403060b).v();
    }

    @Override // nv4.g
    public void w() {
        ((rv4.h) this.f403060b).w();
    }
}
