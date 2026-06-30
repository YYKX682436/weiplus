package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class qh extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh f190356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f190357e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f190358f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar, java.util.List list, boolean z17) {
        super(0);
        this.f190356d = uhVar;
        this.f190357e = list;
        this.f190358f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.li liVar = this.f190356d.f190721m;
        if (liVar != null) {
            java.util.List<cd2.b> msgList = this.f190357e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgList, "msgList");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("presenter.getData(");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.uh uhVar = liVar.f188827d;
            sb6.append(uhVar.f190724p.hashCode());
            sb6.append(" --- ");
            java.util.ArrayList arrayList = uhVar.f190724p;
            sb6.append(arrayList);
            sb6.append(')');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", sb6.toString());
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
                        if (bVar2.f122188d.i() == bVar.f122188d.i() && bVar2.f122188d.d() == bVar.f122188d.d()) {
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
                kz5.g0.t(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.th.f190593d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyPresenter", "increment size " + msgList.size());
                if (!msgList.isEmpty()) {
                    long j17 = uhVar.f190718g.get();
                    if (j17 > 0) {
                        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i17 = -1;
                                break;
                            }
                            if (((cd2.b) listIterator.previous()).f122188d.i() == j17) {
                                i17 = listIterator.nextIndex();
                                break;
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyPresenter", "unread index " + i17 + ", raw size " + arrayList.size());
                        if (i17 != -1) {
                            if (i17 >= 0) {
                                int i27 = 0;
                                while (true) {
                                    ((cd2.b) arrayList.get(i27)).f122189e = false;
                                    if (i27 == i17) {
                                        break;
                                    }
                                    i27++;
                                }
                            }
                            if (i17 != kz5.c0.h(arrayList)) {
                                ((cd2.b) arrayList.get(i17)).f122189e = true;
                            }
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyPresenter", "mergeData after");
            if (arrayList.isEmpty()) {
                i18 = 0;
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ki(liVar.m130335x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ns8), liVar, false, liVar.m130335x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a)));
            } else {
                i18 = 0;
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ki(null, liVar, false, 0));
            }
            if (this.f190358f) {
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = liVar.f188834n;
                if (c22801x87cbdc00 != null) {
                    c22801x87cbdc00.P(i18);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("finishLoadMore: onFinishRefresh notifyDataSetChanged size:");
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = liVar.f188833m;
                if (c1163xf1deaba4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
                sb7.append(mo7946xf939df19 != null ? java.lang.Integer.valueOf(mo7946xf939df19.mo1894x7e414b06()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMention.NotifyViewCallback", sb7.toString());
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = liVar.f188833m;
                if (c1163xf1deaba42 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42.mo7946xf939df19();
                if (mo7946xf939df192 != null) {
                    mo7946xf939df192.m8146xced61ae5();
                }
            } else {
                ym5.s3 s3Var = new ym5.s3(1);
                s3Var.f545055g = false;
                s3Var.f545054f = !msgList.isEmpty();
                s3Var.f545056h = msgList.size();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = liVar.f188833m;
                if (c1163xf1deaba43 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df193 = c1163xf1deaba43.mo7946xf939df19();
                if (mo7946xf939df193 != null) {
                    mo7946xf939df193.m8153xd399a4d9(size, msgList.size());
                }
                com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = liVar.f188834n;
                if (c22801x87cbdc002 != null) {
                    c22801x87cbdc002.mo56054xc12c74c0(s3Var);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
