package com.tencent.mm.plugin.finder.drama.drawer;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.drama.drawer.e0 f105262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qj2 f105263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f105264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f105266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f105267i;

    public p(com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var, r45.qj2 qj2Var, long j17, java.lang.String str, int i17, java.lang.String str2) {
        this.f105262d = e0Var;
        this.f105263e = qj2Var;
        this.f105264f = j17;
        this.f105265g = str;
        this.f105266h = i17;
        this.f105267i = str2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.app.Activity parentActivity;
        androidx.recyclerview.widget.f2 adapter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.drama.drawer.e0 e0Var = this.f105262d;
        android.app.Activity context = e0Var.getContext();
        com.tencent.mm.ui.vas.VASActivity vASActivity = context instanceof com.tencent.mm.ui.vas.VASActivity ? (com.tencent.mm.ui.vas.VASActivity) context : null;
        if (vASActivity != null && (parentActivity = vASActivity.getParentActivity()) != null) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(parentActivity instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.drama.detail.y yVar = (com.tencent.mm.plugin.finder.drama.detail.y) zVar.a((androidx.appcompat.app.AppCompatActivity) parentActivity).e(com.tencent.mm.plugin.finder.drama.detail.y.class);
            if (yVar != null) {
                java.util.ArrayList episodeList = e0Var.f105226p;
                int i17 = e0Var.f105229s;
                r45.qj2 nativeDramaInfo = this.f105263e;
                kotlin.jvm.internal.o.g(nativeDramaInfo, "nativeDramaInfo");
                kotlin.jvm.internal.o.g(episodeList, "episodeList");
                long j17 = nativeDramaInfo.getLong(0);
                if (j17 == 0) {
                    com.tencent.mars.xlog.Log.e("FinderNativeDramaDramaUIC", "no id");
                } else {
                    com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment = yVar.f105192m;
                    long j18 = this.f105264f;
                    java.lang.String str = this.f105265g;
                    int i18 = this.f105266h;
                    if (vASCommonFragment == null) {
                        if (yVar.f105193n == null) {
                            android.view.View decorView = yVar.getActivity().getWindow().getDecorView();
                            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
                            if (viewGroup != null) {
                                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(yVar.getContext());
                                frameLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                                frameLayout.setId(com.tencent.mm.R.id.tfe);
                                frameLayout.setBackgroundColor(frameLayout.getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
                                yVar.f105194o = frameLayout;
                                int k17 = i65.a.k(yVar.getContext()) + com.tencent.mm.ui.bk.p(yVar.getContext());
                                float a17 = kx2.a.f313278a.a(yVar.getContext());
                                float dimension = yVar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479726di);
                                float f17 = k17 * a17;
                                if (dimension < f17) {
                                    dimension = f17;
                                }
                                android.widget.FrameLayout frameLayout2 = yVar.f105194o;
                                if (frameLayout2 != null) {
                                    gx2.a aVar = new gx2.a();
                                    aVar.f277337c = dimension;
                                    aVar.f277338d = new hx2.g(yVar.getContext(), 0, 0, 0, false, false, 62, null);
                                    aVar.f277339e = new hx2.c(frameLayout2);
                                    aVar.f277340f = new hx2.b(yVar.getContext(), false, 2, null);
                                    yVar.f105193n = aVar.b(viewGroup);
                                }
                            }
                        }
                        android.content.Intent intent = new android.content.Intent();
                        androidx.fragment.app.i2 beginTransaction = yVar.getActivity().getSupportFragmentManager().beginTransaction();
                        kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
                        android.widget.FrameLayout frameLayout3 = yVar.f105194o;
                        if (frameLayout3 != null) {
                            frameLayout3.removeAllViews();
                        }
                        intent.putExtra("native_drama_id", nativeDramaInfo.getLong(0));
                        intent.putExtra("native_drama_init_position", i17);
                        intent.putExtra("native_drama_enter_object_id", j18);
                        intent.putExtra("native_drama_enter_promotion_comment_scene", i18);
                        intent.putExtra("native_drama_enter_dupflag", str);
                        r45.nb4 nb4Var = new r45.nb4();
                        java.util.LinkedList list = nb4Var.getList(0);
                        if (list != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(episodeList, 10));
                            java.util.Iterator it = episodeList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((zb2.b) it.next()).f471258d);
                            }
                            list.addAll(arrayList2);
                        }
                        intent.putExtra("native_drama_episode", nb4Var.toByteArray());
                        com.tencent.mm.ui.vas.VASCommonFragment b17 = lk5.q0.b("com.tencent.mm.plugin.finder.drama.drawer.FinderNativeDramaAllEpisodeUI", intent, false, 4, null);
                        yVar.f105192m = b17;
                        b17.q0(new com.tencent.mm.plugin.finder.drama.detail.r(yVar));
                        gx2.q qVar = yVar.f105193n;
                        if (qVar != null) {
                            qVar.setContentReachTop(new com.tencent.mm.plugin.finder.drama.detail.s(yVar));
                        }
                        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment2 = yVar.f105192m;
                        if (vASCommonFragment2 != null) {
                            beginTransaction.k(com.tencent.mm.R.id.tfe, vASCommonFragment2, null);
                            beginTransaction.f();
                        }
                    } else {
                        gx2.q qVar2 = yVar.f105193n;
                        if (qVar2 != null) {
                            com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.m(qVar2, false, 1, null);
                        }
                        com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment3 = yVar.f105192m;
                        if (vASCommonFragment3 != null) {
                            com.tencent.mm.plugin.finder.drama.drawer.c cVar = (com.tencent.mm.plugin.finder.drama.drawer.c) pf5.z.f353948a.b(vASCommonFragment3).a(com.tencent.mm.plugin.finder.drama.drawer.c.class);
                            cVar.getClass();
                            cVar.f105203f = i17;
                            cVar.f105204g = j17;
                            java.util.ArrayList arrayList3 = cVar.f105202e;
                            arrayList3.clear();
                            arrayList3.addAll(episodeList);
                            androidx.recyclerview.widget.RecyclerView recyclerView = cVar.f105201d;
                            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                                adapter.notifyDataSetChanged();
                            }
                            cVar.f105207m = i18;
                            cVar.f105205h = j18;
                            cVar.f105206i = str;
                            cVar.f105209o = this.f105267i;
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/drama/drawer/FinderNativeDramaDetailTabNewUIC$initNativeDramaTab$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
