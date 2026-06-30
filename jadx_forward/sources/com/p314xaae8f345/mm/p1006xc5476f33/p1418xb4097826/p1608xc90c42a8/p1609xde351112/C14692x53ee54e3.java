package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract;", "", "<init>", "()V", "PurchaseListPresenter", "PurchaseListViewCallback", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract */
/* loaded from: classes2.dex */
public final class C14692x53ee54e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3 f204265a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3();

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListPresenter;", "Lfs2/a;", "Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter */
    /* loaded from: classes2.dex */
    public static final class PurchaseListPresenter implements fs2.a {

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 f204266d;

        /* renamed from: e, reason: collision with root package name */
        public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback f204267e;

        /* renamed from: f, reason: collision with root package name */
        public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f204268f;

        /* renamed from: g, reason: collision with root package name */
        public int f204269g;

        public PurchaseListPresenter(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 loader) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
            this.f204266d = loader;
            this.f204269g = 1;
        }

        public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter purchaseListPresenter) {
            if (purchaseListPresenter.f().x() == 0 && purchaseListPresenter.f204266d.m56388xcaeb60d0().size() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback g17 = purchaseListPresenter.g();
                g17.a(false);
                g17.f204287g.setVisibility(0);
            }
        }

        public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f() {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = this.f204268f;
            if (c22848x6ddd90cf != null) {
                return c22848x6ddd90cf;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }

        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback g() {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback purchaseListViewCallback = this.f204267e;
            if (purchaseListViewCallback != null) {
                return purchaseListViewCallback;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }

        public void h(final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback callback) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            this.f204267e = callback;
            in5.s sVar = new in5.s() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$1
                @Override // in5.s
                /* renamed from: getItemConvert */
                public in5.r mo43555xf2bb75ea(int type) {
                    return type == so2.g2.class.hashCode() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gm() : type == so2.q2.class.hashCode() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.im() : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.im();
                }
            };
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f204266d;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(sVar, abstractC13919x46aff122.m56388xcaeb60d0(), false);
            c22848x6ddd90cf.f374638o = new in5.x() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$2$1
                @Override // in5.x
                public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter purchaseListPresenter;
                    java.lang.String str;
                    in5.s0 holder = (in5.s0) k3Var;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter purchaseListPresenter2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter.this;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56388xcaeb60d0 = purchaseListPresenter2.f204266d.m56388xcaeb60d0();
                    if (i17 >= 0 && i17 < m56388xcaeb60d0.size()) {
                        so2.j5 j5Var = (so2.j5) m56388xcaeb60d0.get(i17);
                        boolean z17 = j5Var instanceof so2.g2;
                        android.content.Context context = holder.f374654e;
                        if (z17) {
                            java.lang.Object obj = m56388xcaeb60d0.get(i17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderLiveEcSourceData");
                            so2.g2 g2Var = (so2.g2) obj;
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) g2Var.f491892d.m75936x14adae67(3);
                            if (c19786x6a1e2862 != null) {
                                if (c19786x6a1e2862.m76503x92bc3c07() == 0) {
                                    c19786x6a1e2862.m76550x2592a27b(1);
                                }
                                xc2.y2 y2Var = xc2.y2.f534876a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                                xc2.y2.i(y2Var, context, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
                            }
                            cl0.g gVar = new cl0.g();
                            gVar.h("tabtype", "直播回放");
                            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            java.lang.String gVar2 = gVar.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, context, 16L, 1L, false, 0, 0, r26.i0.t(gVar2, ",", ";", false), 56, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.f204265a, context, "course", true, i17 + 1, java.lang.Long.valueOf(g2Var.f491892d.m75942xfb822ef2(11)), null, 32, null);
                            return;
                        }
                        if (j5Var instanceof so2.q2) {
                            java.lang.Object obj2 = m56388xcaeb60d0.get(i17);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderLiveReplayFeed");
                            so2.q2 q2Var = (so2.q2) obj2;
                            boolean t27 = q2Var.t2();
                            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = q2Var.f492082n;
                            if (!t27) {
                                r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
                                java.lang.String m75945x2fec8307 = m76794xd0557130 != null ? m76794xd0557130.m75945x2fec8307(49) : null;
                                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                                    db5.t7.g(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e_f));
                                    return;
                                } else {
                                    db5.t7.g(context, m75945x2fec8307);
                                    return;
                                }
                            }
                            cl0.g gVar3 = new cl0.g();
                            ya2.b2 contact = q2Var.getContact();
                            if (contact != null) {
                                purchaseListPresenter = purchaseListPresenter2;
                                str = contact.D0();
                            } else {
                                purchaseListPresenter = purchaseListPresenter2;
                                str = null;
                            }
                            gVar3.h("finderusername", str);
                            gVar3.h("tabtype", "直播回放");
                            i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                            java.lang.String gVar4 = gVar3.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj(o3Var, context, 16L, 1L, false, 0, 0, r26.i0.t(gVar4, ",", ";", false), 56, null);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3 c14692x53ee54e3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.f204265a;
                            int i18 = i17 + 1;
                            r45.nw1 m76794xd05571302 = c19792x256d2725.m76794xd0557130();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.a(c14692x53ee54e3, context, "live", true, i18, null, m76794xd05571302 != null ? java.lang.Long.valueOf(m76794xd05571302.m75942xfb822ef2(0)) : null, 16, null);
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("object_id", pm0.v.u(c19792x256d2725.m76784x5db1b11()));
                            jSONObject.put("page_type", "pay");
                            jSONObject.put("object_type", q2Var.q2() ? 1 : 2);
                            zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                            ml2.o3[] o3VarArr = ml2.o3.f409306d;
                            java.lang.String jSONObject2 = jSONObject.toString();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                            ((ml2.j0) zbVar).Wj("watch_live_record", jSONObject2);
                            java.util.List I = kz5.j0.I(m56388xcaeb60d0, so2.q2.class);
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator it = ((java.util.ArrayList) I).iterator();
                            while (it.hasNext()) {
                                java.lang.Object next = it.next();
                                so2.q2 q2Var2 = (so2.q2) next;
                                if (q2Var2.t2() && q2Var2.m2() == q2Var.m2()) {
                                    arrayList.add(next);
                                }
                            }
                            int indexOf = arrayList.indexOf(q2Var);
                            if (indexOf < 0) {
                                indexOf = 0;
                            }
                            android.content.Intent intent = new android.content.Intent();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter purchaseListPresenter3 = purchaseListPresenter;
                            intent.putExtra("KEY_PARAMS_KEY_VALUE", so2.q2.f492079p.a(arrayList, purchaseListPresenter3.f204266d.m56357x44e5026c(), purchaseListPresenter3.f204269g, indexOf).mo14344x5f01b1f6());
                            intent.putExtra("KEY_PARAMS_SOURCE_TYPE", 1);
                            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                            vd2.t3.f517454a.b(intent, "pay", 0);
                            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).hj(purchaseListPresenter3.g().f204281a, intent, true);
                        }
                    }
                }
            };
            c22848x6ddd90cf.f374637n = new in5.y() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$onAttach$2$2
                /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
                @Override // in5.y
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 r5, final android.view.View r6, final int r7, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r8) {
                    /*
                        r4 = this;
                        in5.s0 r8 = (in5.s0) r8
                        java.lang.String r0 = "adapter"
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
                        java.lang.String r5 = "view"
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r5)
                        java.lang.String r5 = "holder"
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r5)
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter r5 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter.this
                        com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r8 = r5.f204266d
                        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r8 = r8.m56388xcaeb60d0()
                        java.lang.Object r8 = kz5.n0.a0(r8, r7)
                        so2.j5 r8 = (so2.j5) r8
                        r0 = 0
                        if (r8 == 0) goto L81
                        boolean r1 = r8 instanceof so2.q2
                        r2 = 0
                        if (r1 == 0) goto L2b
                        r1 = r8
                        so2.q2 r1 = (so2.q2) r1
                        goto L2c
                    L2b:
                        r1 = r2
                    L2c:
                        r3 = 1
                        if (r1 == 0) goto L3a
                        int r1 = r1.f492083o
                        if (r1 != r3) goto L35
                        r1 = r3
                        goto L36
                    L35:
                        r1 = r0
                    L36:
                        if (r1 != r3) goto L3a
                        r1 = r3
                        goto L3b
                    L3a:
                        r1 = r0
                    L3b:
                        if (r1 != 0) goto L54
                        boolean r1 = r8 instanceof so2.g2
                        if (r1 == 0) goto L44
                        r2 = r8
                        so2.g2 r2 = (so2.g2) r2
                    L44:
                        if (r2 == 0) goto L51
                        int r8 = r2.f491893e
                        if (r8 != r3) goto L4c
                        r8 = r3
                        goto L4d
                    L4c:
                        r8 = r0
                    L4d:
                        if (r8 != r3) goto L51
                        r8 = r3
                        goto L52
                    L51:
                        r8 = r0
                    L52:
                        if (r8 == 0) goto L81
                    L54:
                        rl5.r r8 = new rl5.r
                        android.content.Context r1 = r6.getContext()
                        r8.<init>(r1, r6)
                        r8.C = r3
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$showLongClickMenu$1 r1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$showLongClickMenu$1
                        r1.<init>()
                        r8.f478888y = r1
                        com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$showLongClickMenu$2 r1 = new com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListPresenter$showLongClickMenu$2
                        r1.<init>()
                        r8.f478887x = r1
                        r5 = 2
                        int[] r7 = new int[r5]
                        r6.getLocationInWindow(r7)
                        r0 = r7[r0]
                        r7 = r7[r3]
                        int r6 = r6.getWidth()
                        int r0 = r0 + r6
                        int r0 = r0 / r5
                        r8.n(r0, r7)
                        r0 = r3
                    L81:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14696xe4d4f8bc.c(androidx.recyclerview.widget.f2, android.view.View, int, androidx.recyclerview.widget.k3):boolean");
                }
            };
            this.f204268f = c22848x6ddd90cf;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = callback.f204285e;
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getRootView().getContext()));
            c22849x81a93d25.mo7960x6cab2c8d(callback.f204282b.f());
            c22849x81a93d25.N(new p012xc85e97e9.p103xe821e364.p104xd1075a44.p2() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$1
                @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.p2
                /* renamed from: getItemOffsets */
                public void mo7902x5db88677(android.graphics.Rect outRect, android.view.View view, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 parent, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outRect, "outRect");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
                    outRect.left = 0;
                    outRect.right = 0;
                    outRect.top = 0;
                    outRect.bottom = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.f204281a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                }
            });
            ym5.a1.h(c22849x81a93d25, new ym5.n0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$2
                @Override // ym5.n0
                /* renamed from: onViewExposed */
                public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
                }
            });
            ym5.a1.g(c22849x81a93d25, new ym5.m0() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$1$3

                /* renamed from: a, reason: collision with root package name */
                public final java.util.HashSet f204290a = new java.util.HashSet();

                /* renamed from: b, reason: collision with root package name */
                public final java.util.HashSet f204291b = new java.util.HashSet();

                @Override // ym5.m0
                public boolean d() {
                    return true;
                }

                @Override // ym5.m0
                public void e(android.view.View parent, java.util.List exposedHolders) {
                    android.content.Context context;
                    java.lang.String str;
                    java.lang.String str2;
                    java.lang.String str3;
                    java.lang.Object obj;
                    java.lang.String str4;
                    java.lang.String str5;
                    java.lang.String str6;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exposedHolders, "exposedHolders");
                    int i17 = 0;
                    for (java.lang.Object obj2 : exposedHolders) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) obj2;
                        in5.s0 s0Var = k3Var instanceof in5.s0 ? (in5.s0) k3Var : null;
                        if (s0Var != null) {
                            java.lang.Object obj3 = s0Var.f374658i;
                            so2.q2 q2Var = obj3 instanceof so2.q2 ? (so2.q2) obj3 : null;
                            android.content.Context context2 = s0Var.f374654e;
                            if (q2Var != null) {
                                java.util.HashSet hashSet = this.f204290a;
                                if (!hashSet.contains(java.lang.Long.valueOf(q2Var.m2()))) {
                                    hashSet.add(java.lang.Long.valueOf(q2Var.m2()));
                                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                                    jSONObject.put("object_id", pm0.v.u(q2Var.m2()));
                                    jSONObject.put("page_type", "pay");
                                    if (q2Var.q2()) {
                                        jSONObject.put("object_type", 1);
                                    } else {
                                        jSONObject.put("object_type", 2);
                                    }
                                    zy2.zb zbVar = (zy2.zb) i95.n0.c(zy2.zb.class);
                                    ml2.o3[] o3VarArr = ml2.o3.f409306d;
                                    java.lang.String jSONObject2 = jSONObject.toString();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                                    ((ml2.j0) zbVar).Wj("watch_live_expose", jSONObject2);
                                    cl0.g gVar = new cl0.g();
                                    ya2.b2 contact = q2Var.getContact();
                                    gVar.h("finderusername", contact != null ? contact.D0() : null);
                                    gVar.h("tabtype", "付费直播");
                                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                                    java.lang.String gVar2 = gVar.toString();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, context2, 16L, 2L, false, 0, 0, r26.i0.t(gVar2, ",", ";", false), 56, null);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3 c14692x53ee54e3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.f204265a;
                                    r45.nw1 m76794xd0557130 = q2Var.f492082n.m76794xd0557130();
                                    context = context2;
                                    str = "getContext(...)";
                                    str2 = "toString(...)";
                                    str3 = "tabtype";
                                    obj = "付费直播";
                                    str4 = "getService(...)";
                                    java.lang.Long valueOf = m76794xd0557130 != null ? java.lang.Long.valueOf(m76794xd0557130.m75942xfb822ef2(0)) : null;
                                    str5 = ",";
                                    str6 = ";";
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.a(c14692x53ee54e3, context2, "live", false, i18, null, valueOf, 16, null);
                                }
                            } else {
                                context = context2;
                                str = "getContext(...)";
                                str2 = "toString(...)";
                                str3 = "tabtype";
                                obj = "付费直播";
                                str4 = "getService(...)";
                                str5 = ",";
                                str6 = ";";
                            }
                            java.lang.Object obj4 = s0Var.f374658i;
                            so2.g2 g2Var = obj4 instanceof so2.g2 ? (so2.g2) obj4 : null;
                            if (g2Var != null) {
                                java.util.HashSet hashSet2 = this.f204291b;
                                r45.s11 s11Var = g2Var.f491892d;
                                if (!hashSet2.contains(java.lang.Long.valueOf(s11Var.m75942xfb822ef2(11)))) {
                                    hashSet2.add(java.lang.Long.valueOf(s11Var.m75942xfb822ef2(11)));
                                    cl0.g gVar3 = new cl0.g();
                                    gVar3.h(str3, obj);
                                    i95.m c18 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, str4);
                                    android.content.Context context3 = context;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, str);
                                    java.lang.String gVar4 = gVar3.toString();
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, str2);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.Mj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c18, context3, 16L, 2L, false, 0, 0, r26.i0.t(gVar4, str5, str6, false), 56, null);
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.f204265a, context3, "course", false, i18, java.lang.Long.valueOf(s11Var.m75942xfb822ef2(11)), null, 32, null);
                                    i17 = i18;
                                }
                            }
                        }
                        i17 = i18;
                    }
                }
            });
            callback.f204284d.m82683xb165a19d(new ym5.q3() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$2
                @Override // ym5.q3
                public void b(int i17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.f204282b.f204266d, false, 1, null);
                }

                @Override // ym5.q3
                public void c(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.a(false);
                }

                @Override // ym5.q3
                public void d(int i17, rn5.a aVar, boolean z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback purchaseListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f204282b.f204266d.mo56155xd210094c();
                    ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
                    purchaseListViewCallback.f204285e.m7964x8d4ad49c(new uw2.n0());
                }

                @Override // ym5.q3
                public void e(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback purchaseListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this;
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = purchaseListViewCallback.f204284d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22801x87cbdc00, "<get-rfLayout>(...)");
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.u(c22801x87cbdc00, null, 1, null);
                    purchaseListViewCallback.f204285e.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$2$onRefreshEnd$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.f204285e.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
                        }
                    }, 1000L);
                    purchaseListViewCallback.a(false);
                }
            });
            callback.a(true);
            callback.f204283c.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$initView$3
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.f204282b.f204266d.mo56155xd210094c();
                }
            }, 300L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.loader.FinderLivePurchaseContentListLoader");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1506xbe953013.C14231xd1c27277) abstractC13919x46aff122).f193226e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14697xf44027af(this);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13922x2e8bf6c7.m56397xe61f0140(abstractC13919x46aff122, g().f204288h, false, 2, null);
        }

        @Override // fs2.a
        /* renamed from: onDetach */
        public void mo979x3f5eee52() {
            this.f204266d.m56401x31d4943c(g().f204288h);
        }
    }

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/presenter/contract/FinderLivePurchaseListContract$PurchaseListViewCallback;", "", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback */
    /* loaded from: classes2.dex */
    public static final class PurchaseListViewCallback {

        /* renamed from: a, reason: collision with root package name */
        public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204281a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter f204282b;

        /* renamed from: c, reason: collision with root package name */
        public final android.view.View f204283c;

        /* renamed from: d, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f204284d;

        /* renamed from: e, reason: collision with root package name */
        public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f204285e;

        /* renamed from: f, reason: collision with root package name */
        public final android.widget.ProgressBar f204286f;

        /* renamed from: g, reason: collision with root package name */
        public final android.widget.TextView f204287g;

        /* renamed from: h, reason: collision with root package name */
        public final ym5.q1 f204288h;

        public PurchaseListViewCallback(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListPresenter presenter, android.view.View rootView) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
            this.f204281a = activity;
            this.f204282b = presenter;
            this.f204283c = rootView;
            this.f204284d = (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) rootView.findViewById(com.p314xaae8f345.mm.R.id.fjn);
            this.f204285e = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.fjm);
            this.f204286f = (android.widget.ProgressBar) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568013ld1);
            this.f204287g = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.dft);
            this.f204288h = new ym5.q1() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderLivePurchaseListContract$PurchaseListViewCallback$proxyRLayout$1
                @Override // ym5.m1
                /* renamed from: onChanged */
                public void mo56048x7bb163d5() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.f204284d.mo56048x7bb163d5();
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeChanged */
                public void mo56049xa44dd169(int i17, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback purchaseListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f204284d.mo56049xa44dd169(i17 + purchaseListViewCallback.f204282b.f().a0(), i18);
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeInserted */
                public void mo56051xb0566d03(int i17, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback purchaseListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f204284d.mo56051xb0566d03(i17 + purchaseListViewCallback.f204282b.f().a0(), i18);
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeMoved */
                public void mo56052x5e3cd6a8(int i17, int i18, int i19) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback purchaseListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f204284d.mo56052x5e3cd6a8(i17 + purchaseListViewCallback.f204282b.f().a0(), i18 + purchaseListViewCallback.f204282b.f().a0(), i19);
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeRemoved */
                public void mo56053xb9568715(int i17, int i18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback purchaseListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f204284d.mo56053xb9568715(i17 + purchaseListViewCallback.f204282b.f().a0(), i18);
                }

                @Override // ym5.p1
                /* renamed from: onPreFinishLoadMore */
                public void mo15403x2053b072(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.f204284d;
                    c22801x87cbdc00.getClass();
                    c22801x87cbdc00.O(reason);
                }

                @Override // ym5.p1
                /* renamed from: onPreFinishLoadMoreSmooth */
                public void mo56054xc12c74c0(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.f204284d.mo56054xc12c74c0(reason);
                }

                @Override // ym5.p1
                /* renamed from: onPreFinishRefresh */
                public void mo15404x8041b4e4(ym5.s3 reason) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
                    com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this.f204284d;
                    c22801x87cbdc00.getClass();
                    c22801x87cbdc00.Q(reason);
                }

                @Override // ym5.m1
                /* renamed from: onItemRangeChanged */
                public void mo56050xa44dd169(int i17, int i18, java.lang.Object obj) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback purchaseListViewCallback = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3.PurchaseListViewCallback.this;
                    purchaseListViewCallback.f204284d.mo56050xa44dd169(i17 + purchaseListViewCallback.f204282b.f().a0(), i18, obj);
                }
            };
        }

        public final void a(boolean z17) {
            this.f204286f.setVisibility(z17 ? 0 : 8);
        }
    }

    private C14692x53ee54e3() {
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14692x53ee54e3 c14692x53ee54e3, android.content.Context context, java.lang.String itemType, boolean z17, int i17, java.lang.Long l17, java.lang.Long l18, int i18, java.lang.Object obj) {
        if ((i18 & 16) != 0) {
            l17 = -1L;
        }
        if ((i18 & 32) != 0) {
            l18 = -1L;
        }
        c14692x53ee54e3.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemType, "itemType");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("card_type", itemType);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemType, "course")) {
            jSONObject.put("product_id", l17);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemType, "live")) {
            jSONObject.put("live_id", l18);
        }
        jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54497x63979feb, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        b6Var.c(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), "paid_content_card", z17, jSONObject);
    }
}
