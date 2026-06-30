package r02;

/* loaded from: classes8.dex */
public class r0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f449858e;

    /* renamed from: n, reason: collision with root package name */
    public r02.m0 f449864n;

    /* renamed from: d, reason: collision with root package name */
    public final m43.e f449857d = new m43.e();

    /* renamed from: f, reason: collision with root package name */
    public final boolean f449859f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f449860g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f449861h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f449862i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f449863m = true;

    public r0(android.content.Context context) {
        this.f449858e = context;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f449857d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) this.f449857d.get(i17)).f178847c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        android.view.View view;
        int i18;
        r02.q0 q0Var = (r02.q0) k3Var;
        m43.e eVar = this.f449857d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) eVar.get(i17);
        q0Var.f3639x46306858.setClickable(this.f449859f);
        int i19 = r0Var.f178847c;
        android.view.View view2 = q0Var.f449855d;
        switch (i19) {
            case 1:
                view = view2;
                if (eVar.d(2) != 0) {
                    this.f449860g = true;
                    android.view.View view3 = q0Var.f449855d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13248x1980fe57) view).a(r0Var, false);
                    break;
                } else {
                    this.f449860g = false;
                    android.view.View view4 = q0Var.f449855d;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 2:
            case 4:
                view = view2;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) view).m54725x76491f2c(r0Var);
                break;
            case 3:
                view = view2;
                int d17 = eVar.d(4);
                if (d17 != 0) {
                    this.f449861h = true;
                    android.view.View view5 = q0Var.f449855d;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    r0Var.f178856l = d17;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13248x1980fe57) view).a(r0Var, this.f449860g);
                    break;
                } else {
                    this.f449861h = false;
                    android.view.View view6 = q0Var.f449855d;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 5:
                view = view2;
                if (eVar.d(6) != 0) {
                    android.view.View view7 = q0Var.f449855d;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(0);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13248x1980fe57) view).a(r0Var, this.f449860g || this.f449861h);
                    break;
                } else {
                    android.view.View view8 = q0Var.f449855d;
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(8);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(view8, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                }
            case 6:
                view = view2;
                if (!this.f449862i && i17 >= 3 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) eVar.get(i17 - 3)).f178847c == 6) {
                    android.view.View view9 = q0Var.f449855d;
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(view9, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                } else {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) view).m54725x76491f2c(r0Var);
                    break;
                }
            case 7:
                view = view2;
                if (!this.f449862i) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(eVar)) {
                        i18 = 0;
                    } else {
                        java.util.Iterator it = eVar.iterator();
                        i18 = 0;
                        while (it.hasNext()) {
                            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1362x633fb29.r0) it.next()).f178847c == 6) {
                                i18++;
                            }
                        }
                    }
                    if (i18 > 3) {
                        android.view.View view10 = q0Var.f449855d;
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                        arrayList8.add(0);
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(view10, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        break;
                    }
                }
                android.view.View view11 = q0Var.f449855d;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
                arrayList9.add(8);
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view11, arrayList9.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                break;
            case 8:
                if (!this.f449863m) {
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
                    arrayList10.add(8);
                    java.util.Collections.reverse(arrayList10);
                    view = view2;
                    yj0.a.d(view2, arrayList10.toArray(), "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/TaskListAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/downloader_app/ui/TaskListAdapter$TaskViwHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    break;
                } else {
                    view = view2;
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13240x9c8ab066) view).m54712x76491f2c(r0Var.f178858n);
                    break;
                }
            default:
                view = view2;
                break;
        }
        if (view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.C13249xf095011d) view).m54726x26e1c75(this.f449864n);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        android.content.Context context = this.f449858e;
        android.view.View view = new android.view.View(context);
        switch (i17) {
            case 1:
            case 3:
            case 5:
                view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4m, viewGroup, false);
                break;
            case 2:
            case 4:
            case 6:
                view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4o, viewGroup, false);
                break;
            case 7:
                view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4l, viewGroup, false);
                break;
            case 8:
                view = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a4j, viewGroup, false);
                break;
        }
        return new r02.q0(view);
    }

    public void x(java.util.LinkedList linkedList) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList)) {
            return;
        }
        int size = linkedList.size();
        m43.e eVar = this.f449857d;
        if (size != 1) {
            eVar.removeAll(linkedList);
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new r02.p0(this));
        } else {
            int indexOf = eVar.indexOf(linkedList.get(0));
            eVar.remove(indexOf);
            com.p314xaae8f345.mm.p794xb0fa9b5e.w0.c(true, new r02.o0(this, indexOf));
        }
    }
}
