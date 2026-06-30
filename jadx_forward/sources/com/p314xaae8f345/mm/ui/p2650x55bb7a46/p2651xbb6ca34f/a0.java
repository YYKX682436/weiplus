package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes12.dex */
public class a0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f279917d;

    /* renamed from: e, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f279918e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f279919f;

    /* renamed from: g, reason: collision with root package name */
    public o11.g f279920g;

    /* renamed from: h, reason: collision with root package name */
    public o11.g f279921h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f279922i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f279923m;

    /* renamed from: n, reason: collision with root package name */
    public final long f279924n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f279925o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.u f279926p;

    /* renamed from: q, reason: collision with root package name */
    public final java.text.SimpleDateFormat f279927q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f279928r;

    public a0(android.content.Context context, java.util.List list, int i17, java.lang.String str) {
        this.f279919f = null;
        this.f279920g = null;
        this.f279921h = null;
        this.f279922i = true;
        this.f279923m = false;
        this.f279927q = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        this.f279928r = false;
        this.f279919f = list;
        this.f279922i = c01.d9.b().E();
        this.f279917d = context;
        y(context, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f279919f.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return x(i17).f279981c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onAttachedToRecyclerView */
    public void mo8156x4147ed22(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        super.mo8156x4147ed22(c1163xf1deaba4);
        this.f279918e = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List list) {
        if (list != null && list.size() > 0 && (k3Var instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z)) {
            if (((java.lang.Integer) list.get(0)).intValue() == 0) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z zVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z) k3Var;
                zVar.f279992h.setChecked(false);
                zVar.f279992h.setVisibility(0);
                android.view.View view = zVar.f279993i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z zVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z) k3Var;
            zVar2.f279992h.setChecked(false);
            zVar2.f279992h.setVisibility(8);
            android.view.View view2 = zVar2.f279993i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        super.mo8157xe5e2e48d(k3Var, i17, list);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return i17 == Integer.MAX_VALUE ? new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.t(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bdj, viewGroup, false)) : new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bxb, viewGroup, false));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var;
        super.mo8160xd8bfd53(k3Var);
        int m8183xf806b362 = k3Var.m8183xf806b362();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w x17 = x(m8183xf806b362);
        if (x17 == null || (f9Var = x17.f279980b) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "onViewAttachedToWindow item or msgInfo is null");
            return;
        }
        if (x17.f279979a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "onViewAttachedToWindow imagePath is null");
        } else if (x17.f279983e || x17.f279984f || f9Var.z2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryAdapter", "onViewAttachedToWindow no need to gen hd thumb");
        } else {
            ((ku5.t0) ku5.t0.f394148d).j(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.s(this, x17, m8183xf806b362), "MediaHistory-viewAttach");
        }
    }

    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w x(int i17) {
        return (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w) this.f279919f.get(i17);
    }

    public final void y(android.content.Context context, int i17) {
        o11.f fVar = new o11.f();
        fVar.f423618i = 1;
        fVar.f423631v = true;
        fVar.f423620k = i65.a.B(context) / i17;
        fVar.f423619j = i65.a.B(context) / i17;
        fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.a0y;
        this.f279920g = fVar.a();
        int B = i65.a.B(context) / i17;
        o11.f fVar2 = new o11.f();
        fVar2.f423618i = 1;
        fVar2.f423631v = true;
        fVar2.f423620k = i65.a.B(context) / i17;
        fVar2.f423619j = i65.a.B(context) / i17;
        fVar2.f423628s = false;
        this.f279921h = fVar2.a();
    }

    public a0(android.content.Context context, java.util.List list, int i17, java.lang.String str, long j17) {
        this.f279919f = null;
        this.f279920g = null;
        this.f279921h = null;
        this.f279922i = true;
        this.f279923m = false;
        this.f279927q = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        this.f279928r = false;
        this.f279919f = list;
        this.f279924n = j17;
        this.f279922i = c01.d9.b().E();
        this.f279923m = true;
        this.f279917d = context;
        y(context, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        java.lang.String str;
        boolean z17 = this.f279922i;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[onBindViewHolder] isSDCardAvailable:%s", java.lang.Boolean.valueOf(z17));
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.w x17 = x(i17);
        int m8185xcdaf1228 = k3Var.m8185xcdaf1228();
        android.content.Context context = this.f279917d;
        if (m8185xcdaf1228 == Integer.MAX_VALUE) {
            if (i17 != mo1894x7e414b06() - 1) {
                if (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(x(i17 + 1).f279982d)) == com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().a(new java.util.Date(x17.f279982d))) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.t tVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.t) k3Var;
                    android.widget.TextView textView = tVar.f279976d;
                    textView.setVisibility(0);
                    textView.setText(com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.e().d(new java.util.Date(x17.f279982d), context));
                    boolean z18 = this.f279925o;
                    android.widget.ProgressBar progressBar = tVar.f279977e;
                    if (z18) {
                        progressBar.setVisibility(0);
                        return;
                    } else {
                        progressBar.setVisibility(8);
                        return;
                    }
                }
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.t) k3Var).f279976d.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z zVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.z) k3Var;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        android.widget.ImageView imageView = zVar.f279988d;
        imageView.setTag(valueOf);
        zVar.f279993i.setTag(java.lang.Integer.valueOf(i17));
        if (x17.f279984f) {
            java.lang.String b17 = tv.a.b(x17.f279979a);
            n11.a b18 = n11.a.b();
            java.lang.String str2 = x17.f279979a;
            o11.f fVar = new o11.f();
            fVar.f423615f = b17;
            fVar.f423611b = true;
            b18.h(str2, imageView, fVar.a());
        } else {
            n11.a.b().h(x17.f279979a, imageView, this.f279920g);
        }
        boolean z19 = x17.f279983e;
        android.widget.TextView textView2 = zVar.f279990f;
        if (!z19 && !x17.f279984f) {
            textView2.setVisibility(8);
            android.view.View view = zVar.f279989e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = zVar.f279989e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(0);
            java.lang.String str3 = x17.f279985g.f279978a;
            boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str3 == null) {
                str3 = "";
            }
            textView2.setText(str3);
        }
        boolean z28 = this.f279928r;
        android.widget.CheckBox checkBox = zVar.f279992h;
        if (z28) {
            android.view.View view3 = zVar.f279993i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(0);
            if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.p4.f282798a.d(x17.f279980b)) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
                checkBox.setText("");
            }
        } else {
            android.view.View view4 = zVar.f279993i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            checkBox.setVisibility(8);
        }
        java.lang.String str4 = (i17 - 1) + ", " + this.f279927q.format(new java.util.Date(x17.f279982d));
        if (x17.f279983e) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571957ul) + str4;
        } else {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571944u8) + str4;
        }
        imageView.setContentDescription(str);
        imageView.setVisibility(0);
        android.view.View view5 = zVar.f279994m;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/ui/chatting/adapter/MediaHistoryGalleryAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
