package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class nw extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f185666e;

    /* renamed from: f, reason: collision with root package name */
    public final int f185667f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f185668g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mw.f185583d);

    public nw(r45.qt2 qt2Var, int i17) {
        this.f185666e = qt2Var;
        this.f185667f = i17;
    }

    public static final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nw nwVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys ysVar, int i17, int i18) {
        int i19;
        nwVar.getClass();
        java.util.LinkedList m75941xfb821914 = ysVar.f192725d.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[jump2HotTab] finderObject=");
        sb6.append(c19792x256d2725 != null ? java.lang.Long.valueOf(c19792x256d2725.m76784x5db1b11()) : null);
        sb6.append(" objectList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m75941xfb821914, 10));
        java.util.Iterator it = m75941xfb821914.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next()).m76784x5db1b11()));
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamCardFeedConvert", sb6.toString());
        java.util.LinkedList linkedList = ysVar.f192727f;
        if (linkedList == null || linkedList.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.StreamCardFeedConvert", "rvFeedList is empty");
            return;
        }
        pf5.u uVar = pf5.u.f435469a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = uVar.c(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca c15456x2c452bca = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) a17;
        ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4);
        N6.a(ey2.q0.f339007g);
        N6.f338981h = java.lang.System.currentTimeMillis();
        N6.f338976c = java.util.Collections.synchronizedList(new java.util.ArrayList(ysVar.f192727f));
        android.os.Bundle bundle = new android.os.Bundle();
        ey2.e2 e2Var = (ey2.e2) ((jz5.n) nwVar.f185668g).mo141623x754a37bb();
        java.util.LinkedList m75941xfb8219142 = ysVar.f192725d.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getObject(...)");
        java.lang.String token = ey2.e2.f338889i.a(ysVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fw fwVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fw(bundle);
        e2Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(token, "token");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = e2Var.f338890e;
        if (concurrentHashMap.containsKey(token)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamCardVM", "[checkPreloadForReportReadStats] token=" + token + " has exist.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.StreamCardVM", "[checkPreloadForReportReadStats] token=" + token + " not exist.");
            concurrentHashMap.put(token, m75941xfb8219142);
            fwVar.mo152xb9724478();
        }
        bundle.putInt("RequestScene", 1);
        if (c19792x256d2725 != null) {
            java.util.Iterator it6 = m75941xfb821914.iterator();
            i19 = 0;
            while (it6.hasNext()) {
                if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it6.next()).m76784x5db1b11() == c19792x256d2725.m76784x5db1b11()) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        i19 = -1;
        bundle.putInt("ScrollPosition", i19);
        if (i17 == 1) {
            bundle.putInt("Source", 3);
        } else if (i17 == 3) {
            bundle.putInt("Source", 2);
        } else if (i17 != 4) {
            bundle.putInt("Source", 4);
        } else {
            bundle.putInt("Source", 2);
        }
        java.util.List subList = ysVar.f192725d.m75941xfb821914(4).subList(0, java.lang.Math.min(3, ysVar.f192725d.m75941xfb821914(4).size()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subList, "subList(...)");
        java.util.Iterator it7 = subList.iterator();
        java.lang.String totalFeedId = "";
        while (it7.hasNext()) {
            totalFeedId = totalFeedId + pm0.v.u(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it7.next()).m76784x5db1b11()) + '|';
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        java.lang.String u17 = pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
        r45.qt2 W6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).W6(nwVar.f185667f);
        o3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(totalFeedId, "totalFeedId");
        jx3.f.INSTANCE.d(20586, java.lang.Integer.valueOf(i17), u17, java.lang.Integer.valueOf(i19 + 1), java.lang.Long.valueOf(c01.id.c()), totalFeedId, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(W6.m75939xb282bd08(5)), W6.m75945x2fec8307(2), W6.m75945x2fec8307(0));
        c15456x2c452bca.f7(4, bundle);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569388v;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        vb2.q a17 = vb2.q.a(holder.f3639x46306858);
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gw(this, item, i17));
        vb2.l lVar = a17.f516238b;
        lVar.f516178a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.hw(this, a17, item, i17));
        vb2.l lVar2 = a17.f516239c;
        lVar2.f516178a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.iw(this, a17, item, i17));
        vb2.l lVar3 = a17.f516240d;
        lVar3.f516178a.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jw(this, a17, item, i17));
        a17.f516242f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kw(this, item, i17));
        ey2.e2 e2Var = (ey2.e2) ((jz5.n) this.f185668g).mo141623x754a37bb();
        e2Var.getClass();
        e2Var.f338891f.put(ey2.e2.f338889i.a(item), java.lang.Integer.valueOf(i17));
        a17.f516243g.setText(item.f192725d.m75945x2fec8307(1));
        a17.f516241e.setText(item.f192725d.m75945x2fec8307(2));
        java.util.LinkedList m75941xfb821914 = item.f192725d.m75941xfb821914(4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getObject(...)");
        int i19 = 0;
        for (java.lang.Object obj : m75941xfb821914) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj;
            if (i19 == 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                o(lVar, c19792x256d2725);
            } else if (i19 == 1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                o(lVar2, c19792x256d2725);
            } else if (i19 == 2) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
                o(lVar3, c19792x256d2725);
            }
            i19 = i27;
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vb2.q a17 = vb2.q.a(holder.f3639x46306858);
        com.p314xaae8f345.mm.ui.bk.r0(a17.f516243g.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.bk.r0(a17.f516241e.getPaint(), 0.8f);
        vb2.l lVar = a17.f516238b;
        com.p314xaae8f345.mm.ui.bk.r0(lVar.f516183f.getPaint(), 0.8f);
        vb2.l lVar2 = a17.f516239c;
        com.p314xaae8f345.mm.ui.bk.r0(lVar2.f516183f.getPaint(), 0.8f);
        vb2.l lVar3 = a17.f516240d;
        com.p314xaae8f345.mm.ui.bk.r0(lVar3.f516183f.getPaint(), 0.8f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = lVar.f516182e;
        android.content.Context context = holder.f374654e;
        c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79525x33edc30c, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        lVar2.f516182e.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79525x33edc30c, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        lVar3.f516182e.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79525x33edc30c, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lw(holder, this));
    }

    public final void o(vb2.l lVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        lVar.f516178a.setTag(c19792x256d2725);
        lVar.f516181d.setText(c19792x256d2725.m76791xf4204902() > 0 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.g(2, c19792x256d2725.m76791xf4204902()) : "0");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = lVar.f516178a.getContext();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = null;
        java.lang.String m76184x8010e5e4 = m76760x76845fea != null ? m76760x76845fea.m76184x8010e5e4() : null;
        ((ke0.e) xVar).getClass();
        lVar.f516183f.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m76184x8010e5e4));
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea2 = c19792x256d2725.m76760x76845fea();
        mn2.n nVar = new mn2.n(m76760x76845fea2 != null ? m76760x76845fea2.m76175x6d346f39() : null, null, 2, null);
        android.widget.ImageView avatar = lVar.f516179b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatar, "avatar");
        a17.c(nVar, avatar, g1Var.h(mn2.f1.f411490h));
        vo0.d e17 = g1Var.e();
        cu2.t tVar = cu2.u.f303974a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        if (m76802x2dd01666 != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null) {
            c19788xd7cfd73e = m76962x74cd162e.getFirst();
        }
        if (c19788xd7cfd73e == null) {
            c19788xd7cfd73e = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e();
        }
        wo0.c a18 = e17.a(new mn2.c1(bu2.z.i(c19788xd7cfd73e), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, null, 12, null));
        a18.g(g1Var.h(mn2.f1.f411486d));
        android.widget.ImageView cover = lVar.f516180c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(cover, "cover");
        a18.c(cover);
    }
}
