package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class k4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200338d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f200339e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.l71 f200340f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4 f200341g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.l71 l71Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4 q4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200339e = c19792x256d2725;
        this.f200340f = l71Var;
        this.f200341g = q4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k4(this.f200339e, this.f200340f, this.f200341g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.k4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.l71 l71Var;
        boolean z17;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e first;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f200338d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f200339e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4 q4Var = this.f200341g;
            if (c19792x256d2725 == null || (l71Var = this.f200340f) == null) {
                android.view.View view = q4Var.f201017a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$refreshFeed$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$refreshFeed$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = q4Var.f201017a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$refreshFeed$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$refreshFeed$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (pm0.v.z((int) l71Var.m75942xfb822ef2(33), 2)) {
                    ae2.in inVar = ae2.in.f85221a;
                    z17 = true;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85309i7).mo141623x754a37bb()).r()).intValue() == 1) {
                        this.f200338d = 1;
                        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q4.b(q4Var, c19792x256d2725, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    z17 = true;
                }
                android.view.View view3 = q4Var.f201023g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget", "showUIV1", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget", "showUIV1", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = q4Var.f201024h;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget", "showUIV1", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget", "showUIV1", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
                r45.mb4 mb4Var = null;
                java.lang.String m76944x730bcac6 = m76802x2dd01666 != null ? m76802x2dd01666.m76944x730bcac6() : null;
                if (m76944x730bcac6 != null && m76944x730bcac6.length() != 0) {
                    z17 = false;
                }
                android.widget.TextView textView = q4Var.f201021e;
                if (z17) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(m76944x730bcac6);
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd016662 = c19792x256d2725.m76802x2dd01666();
                if (m76802x2dd016662 != null && (m76962x74cd162e = m76802x2dd016662.m76962x74cd162e()) != null && (first = m76962x74cd162e.getFirst()) != null) {
                    mb4Var = bu2.z.i(first);
                }
                r45.mb4 mb4Var2 = mb4Var;
                if (mb4Var2 != null) {
                    boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mb4Var2.m75945x2fec8307(16));
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    android.widget.ImageView imageView = q4Var.f201020d;
                    if (K0) {
                        g1Var.e().c(new mn2.c1(mb4Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
                    } else {
                        g1Var.e().c(new mn2.r3(mb4Var2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e, null, 4, null), imageView, g1Var.h(mn2.f1.B));
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n4 n4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n4(q4Var, c19792x256d2725);
                android.widget.TextView textView2 = q4Var.f201022f;
                textView2.setOnClickListener(n4Var);
                com.p314xaae8f345.mm.ui.fk.a(textView2);
                java.util.HashMap hashMap = new java.util.HashMap();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.oo0 oo0Var = q4Var.f201018b;
                hashMap.put("finder_username", oo0Var.Y().f492179a);
                hashMap.put("liveid", java.lang.String.valueOf(oo0Var.Y().f492192n.m75942xfb822ef2(0)));
                hashMap.put("ref_objectid", java.lang.String.valueOf(c19792x256d2725.m76784x5db1b11()));
                i95.m c17 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.u1 u1Var = ml2.u1.f409613r2;
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String b17 = b52.b.b();
                if (b17 == null) {
                    b17 = "";
                }
                zy2.zb.I8(zbVar, u1Var, hashMap, b17, "1002", null, null, false, 112, null);
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
