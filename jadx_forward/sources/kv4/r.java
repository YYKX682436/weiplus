package kv4;

/* loaded from: classes12.dex */
public final class r implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f394255a;

    /* renamed from: b, reason: collision with root package name */
    public final mv4.e f394256b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f394257c;

    /* renamed from: d, reason: collision with root package name */
    public final kv4.m f394258d;

    /* renamed from: e, reason: collision with root package name */
    public final jv4.m f394259e;

    public r(int i17, mv4.e boxData, java.util.List data, kv4.m delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxData, "boxData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f394255a = i17;
        this.f394256b = boxData;
        this.f394257c = data;
        this.f394258d = delegate;
        this.f394259e = jv4.m.f383780m;
    }

    @Override // jv4.n
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        kv4.o oVar = holder instanceof kv4.o ? (kv4.o) holder : null;
        if (oVar == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.kk.f(oVar.f394251d, this.f394255a > 0 ? com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 8) : com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 2));
        qv4.m mVar = (qv4.m) oVar;
        java.util.Iterator it = ((java.util.List) ((jz5.n) mVar.f448530e).mo141623x754a37bb()).iterator();
        int i17 = 0;
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            mv4.e eVar = this.f394256b;
            java.util.List list = this.f394257c;
            if (!hasNext) {
                for (java.lang.Object obj : (java.util.List) ((jz5.n) mVar.f448531f).mo141623x754a37bb()) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    android.view.View view = (android.view.View) obj;
                    if (i17 >= list.size() || !((rv4.h) eVar).f482016l) {
                        view.setBackground(null);
                    } else {
                        view.setBackground(b3.l.m9707x4a96be14(view.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.d9e));
                    }
                    i17 = i19;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i27 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view2 = (android.view.View) next;
            if (i18 < list.size()) {
                mv4.f fVar = (mv4.f) list.get(i18);
                android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.f565464ci2);
                if (textView != null) {
                    textView.setText(((rv4.k) fVar).f482041f);
                }
                jv4.i iVar = ((qv4.r0) this.f394258d).f448543d;
                if (iVar != null ? ((jv4.e) ((jv4.p) iVar).f383795e).f383768a.o() : false) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.f565909e25);
                    c22699x3dcdb352.setVisibility(8);
                    int a17 = (int) (ym5.x.a(view2.getContext(), 14.0f) * i65.a.q(view2.getContext()));
                    android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
                    layoutParams.width = a17;
                    layoutParams.height = a17;
                    c22699x3dcdb352.setLayoutParams(layoutParams);
                    java.lang.String str = ((rv4.k) fVar).f482049n;
                    if (str != null) {
                        int hashCode = str.hashCode();
                        if (hashCode == -827570853) {
                            if (str.equals("picture_regular")) {
                                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80865xceac455b);
                                c22699x3dcdb352.setVisibility(0);
                            }
                            c22699x3dcdb352.setVisibility(8);
                        } else if (hashCode != 104502475) {
                            if (hashCode == 153041747 && str.equals("subscriptions_regular")) {
                                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f81158x91f3b53);
                                c22699x3dcdb352.setVisibility(0);
                            }
                            c22699x3dcdb352.setVisibility(8);
                        } else {
                            if (str.equals("folder_regular")) {
                                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79391x63a94cb);
                                c22699x3dcdb352.setVisibility(0);
                            }
                            c22699x3dcdb352.setVisibility(8);
                        }
                    }
                }
                android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.f565569cs5);
                if (findViewById != null) {
                    int i28 = ((rv4.h) eVar).f482016l ? 0 : 8;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i28));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.h5n);
                if (c22699x3dcdb3522 != null) {
                    pv4.b.d(c22699x3dcdb3522, 16.0f);
                }
                if (c22699x3dcdb3522 != null) {
                    pv4.b.c(c22699x3dcdb3522, 16.0f);
                }
                float f17 = view2.getResources().getDisplayMetrics().density;
                if (((rv4.h) eVar).f482016l) {
                    int i29 = (int) (4 * f17);
                    int i37 = (int) (2 * f17);
                    view2.setPadding(i29, i37, i29, i37);
                } else {
                    int i38 = (int) (2 * f17);
                    view2.setPadding(0, i38, i38, i38);
                }
                view2.setOnClickListener(new kv4.p(fVar, this));
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/websearch/teach/base/box/FTSTeachHistoryViewItem", "bindData", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            i18 = i27;
        }
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return this.f394259e;
    }

    @Override // nv4.g
    public java.lang.String v() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        mv4.e eVar = this.f394256b;
        sb6.append(((rv4.h) eVar).f482016l);
        sb6.append('-');
        sb6.append(kz5.n0.g0(this.f394257c, null, null, null, 0, null, kv4.q.f394254d, 31, null));
        sb6.append('-');
        sb6.append(((rv4.h) eVar).f482018n);
        return sb6.toString();
    }

    @Override // nv4.g
    public void w() {
        java.util.Iterator it = this.f394257c.iterator();
        while (it.hasNext()) {
            ((rv4.k) ((mv4.f) it.next())).w();
        }
    }
}
