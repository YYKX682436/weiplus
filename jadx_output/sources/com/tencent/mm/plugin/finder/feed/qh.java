package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class qh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uh f108823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f108824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(com.tencent.mm.plugin.finder.feed.uh uhVar, java.util.List list, boolean z17) {
        super(0);
        this.f108823d = uhVar;
        this.f108824e = list;
        this.f108825f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int i18;
        com.tencent.mm.plugin.finder.feed.li liVar = this.f108823d.f109188m;
        if (liVar != null) {
            java.util.List<cd2.b> msgList = this.f108824e;
            kotlin.jvm.internal.o.g(msgList, "msgList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("presenter.getData(");
            com.tencent.mm.plugin.finder.feed.uh uhVar = liVar.f107294d;
            sb6.append(uhVar.f109191p.hashCode());
            sb6.append(" --- ");
            java.util.ArrayList arrayList = uhVar.f109191p;
            sb6.append(arrayList);
            sb6.append(')');
            com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", sb6.toString());
            int size = arrayList.size();
            if (arrayList.isEmpty()) {
                arrayList.addAll(msgList);
            } else {
                arrayList.get(kz5.c0.h(arrayList));
                for (cd2.b bVar : msgList) {
                    java.util.Iterator it = arrayList.iterator();
                    int i19 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i19 = -1;
                            break;
                        }
                        cd2.b bVar2 = (cd2.b) it.next();
                        if (bVar2.f40655d.i() == bVar.f40655d.i() && bVar2.f40655d.d() == bVar.f40655d.d()) {
                            break;
                        }
                        i19++;
                    }
                    if (i19 == -1) {
                        arrayList.add(bVar);
                    } else {
                        arrayList.set(i19, bVar);
                    }
                }
                kz5.g0.t(arrayList, com.tencent.mm.plugin.finder.feed.th.f109060d);
                com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyPresenter", "increment size " + msgList.size());
                if (!msgList.isEmpty()) {
                    long j17 = uhVar.f109185g.get();
                    if (j17 > 0) {
                        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i17 = -1;
                                break;
                            }
                            if (((cd2.b) listIterator.previous()).f40655d.i() == j17) {
                                i17 = listIterator.nextIndex();
                                break;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyPresenter", "unread index " + i17 + ", raw size " + arrayList.size());
                        if (i17 != -1) {
                            if (i17 >= 0) {
                                int i27 = 0;
                                while (true) {
                                    ((cd2.b) arrayList.get(i27)).f40656e = false;
                                    if (i27 == i17) {
                                        break;
                                    }
                                    i27++;
                                }
                            }
                            if (i17 != kz5.c0.h(arrayList)) {
                                ((cd2.b) arrayList.get(i17)).f40656e = true;
                            }
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyPresenter", "mergeData after");
            if (arrayList.isEmpty()) {
                i18 = 0;
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.ki(liVar.getResources().getString(com.tencent.mm.R.string.ns8), liVar, false, liVar.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3)));
            } else {
                i18 = 0;
                pm0.v.X(new com.tencent.mm.plugin.finder.feed.ki(null, liVar, false, 0));
            }
            if (this.f108825f) {
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = liVar.f107301n;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.P(i18);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("finishLoadMore: onFinishRefresh notifyDataSetChanged size:");
                androidx.recyclerview.widget.RecyclerView recyclerView = liVar.f107300m;
                if (recyclerView == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                sb7.append(adapter != null ? java.lang.Integer.valueOf(adapter.getItemCount()) : null);
                com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", sb7.toString());
                androidx.recyclerview.widget.RecyclerView recyclerView2 = liVar.f107300m;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter2 = recyclerView2.getAdapter();
                if (adapter2 != null) {
                    adapter2.notifyDataSetChanged();
                }
            } else {
                ym5.s3 s3Var = new ym5.s3(1);
                s3Var.f463522g = false;
                s3Var.f463521f = !msgList.isEmpty();
                s3Var.f463523h = msgList.size();
                androidx.recyclerview.widget.RecyclerView recyclerView3 = liVar.f107300m;
                if (recyclerView3 == null) {
                    kotlin.jvm.internal.o.o("recyclerView");
                    throw null;
                }
                androidx.recyclerview.widget.f2 adapter3 = recyclerView3.getAdapter();
                if (adapter3 != null) {
                    adapter3.notifyItemRangeInserted(size, msgList.size());
                }
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout2 = liVar.f107301n;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.onPreFinishLoadMoreSmooth(s3Var);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
