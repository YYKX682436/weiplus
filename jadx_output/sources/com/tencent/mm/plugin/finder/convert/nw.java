package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nw extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f104133e;

    /* renamed from: f, reason: collision with root package name */
    public final int f104134f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f104135g = jz5.h.b(com.tencent.mm.plugin.finder.convert.mw.f104050d);

    public nw(r45.qt2 qt2Var, int i17) {
        this.f104133e = qt2Var;
        this.f104134f = i17;
    }

    public static final void n(com.tencent.mm.plugin.finder.convert.nw nwVar, com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.feed.ys ysVar, int i17, int i18) {
        int i19;
        nwVar.getClass();
        java.util.LinkedList list = ysVar.f111192d.getList(4);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[jump2HotTab] finderObject=");
        sb6.append(finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null);
        sb6.append(" objectList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.StreamCardFeedConvert", sb6.toString());
        java.util.LinkedList linkedList = ysVar.f111194f;
        if (linkedList == null || linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.e("Finder.StreamCardFeedConvert", "rvFeedList is empty");
            return;
        }
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.c(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) a17;
        ey2.o0 N6 = ((ey2.t0) uVar.e(c61.l7.class).a(ey2.t0.class)).N6(4);
        N6.a(ey2.q0.f257474g);
        N6.f257448h = java.lang.System.currentTimeMillis();
        N6.f257443c = java.util.Collections.synchronizedList(new java.util.ArrayList(ysVar.f111194f));
        android.os.Bundle bundle = new android.os.Bundle();
        ey2.e2 e2Var = (ey2.e2) ((jz5.n) nwVar.f104135g).getValue();
        java.util.LinkedList list2 = ysVar.f111192d.getList(4);
        kotlin.jvm.internal.o.f(list2, "getObject(...)");
        java.lang.String token = ey2.e2.f257356i.a(ysVar);
        com.tencent.mm.plugin.finder.convert.fw fwVar = new com.tencent.mm.plugin.finder.convert.fw(bundle);
        e2Var.getClass();
        kotlin.jvm.internal.o.g(token, "token");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = e2Var.f257357e;
        if (concurrentHashMap.containsKey(token)) {
            com.tencent.mars.xlog.Log.i("Finder.StreamCardVM", "[checkPreloadForReportReadStats] token=" + token + " has exist.");
        } else {
            com.tencent.mars.xlog.Log.i("Finder.StreamCardVM", "[checkPreloadForReportReadStats] token=" + token + " not exist.");
            concurrentHashMap.put(token, list2);
            fwVar.invoke();
        }
        bundle.putInt("RequestScene", 1);
        if (finderObject != null) {
            java.util.Iterator it6 = list.iterator();
            i19 = 0;
            while (it6.hasNext()) {
                if (((com.tencent.mm.protocal.protobuf.FinderObject) it6.next()).getId() == finderObject.getId()) {
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
        java.util.List subList = ysVar.f111192d.getList(4).subList(0, java.lang.Math.min(3, ysVar.f111192d.getList(4).size()));
        kotlin.jvm.internal.o.f(subList, "subList(...)");
        java.util.Iterator it7 = subList.iterator();
        java.lang.String totalFeedId = "";
        while (it7.hasNext()) {
            totalFeedId = totalFeedId + pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) it7.next()).getId()) + '|';
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        java.lang.String u17 = pm0.v.u(finderObject != null ? finderObject.getId() : 0L);
        r45.qt2 W6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(mMActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).W6(nwVar.f104134f);
        o3Var.getClass();
        kotlin.jvm.internal.o.g(totalFeedId, "totalFeedId");
        jx3.f.INSTANCE.d(20586, java.lang.Integer.valueOf(i17), u17, java.lang.Integer.valueOf(i19 + 1), java.lang.Long.valueOf(c01.id.c()), totalFeedId, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(W6.getInteger(5)), W6.getString(2), W6.getString(0));
        finderHomeUIC.f7(4, bundle);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f487855v;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.finder.feed.ys item = (com.tencent.mm.plugin.finder.feed.ys) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        vb2.q a17 = vb2.q.a(holder.itemView);
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.gw(this, item, i17));
        vb2.l lVar = a17.f434705b;
        lVar.f434645a.setOnClickListener(new com.tencent.mm.plugin.finder.convert.hw(this, a17, item, i17));
        vb2.l lVar2 = a17.f434706c;
        lVar2.f434645a.setOnClickListener(new com.tencent.mm.plugin.finder.convert.iw(this, a17, item, i17));
        vb2.l lVar3 = a17.f434707d;
        lVar3.f434645a.setOnClickListener(new com.tencent.mm.plugin.finder.convert.jw(this, a17, item, i17));
        a17.f434709f.setOnClickListener(new com.tencent.mm.plugin.finder.convert.kw(this, item, i17));
        ey2.e2 e2Var = (ey2.e2) ((jz5.n) this.f104135g).getValue();
        e2Var.getClass();
        e2Var.f257358f.put(ey2.e2.f257356i.a(item), java.lang.Integer.valueOf(i17));
        a17.f434710g.setText(item.f111192d.getString(1));
        a17.f434708e.setText(item.f111192d.getString(2));
        java.util.LinkedList list2 = item.f111192d.getList(4);
        kotlin.jvm.internal.o.f(list2, "getObject(...)");
        int i19 = 0;
        for (java.lang.Object obj : list2) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
            if (i19 == 0) {
                kotlin.jvm.internal.o.d(finderObject);
                o(lVar, finderObject);
            } else if (i19 == 1) {
                kotlin.jvm.internal.o.d(finderObject);
                o(lVar2, finderObject);
            } else if (i19 == 2) {
                kotlin.jvm.internal.o.d(finderObject);
                o(lVar3, finderObject);
            }
            i19 = i27;
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        vb2.q a17 = vb2.q.a(holder.itemView);
        com.tencent.mm.ui.bk.r0(a17.f434710g.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(a17.f434708e.getPaint(), 0.8f);
        vb2.l lVar = a17.f434705b;
        com.tencent.mm.ui.bk.r0(lVar.f434650f.getPaint(), 0.8f);
        vb2.l lVar2 = a17.f434706c;
        com.tencent.mm.ui.bk.r0(lVar2.f434650f.getPaint(), 0.8f);
        vb2.l lVar3 = a17.f434707d;
        com.tencent.mm.ui.bk.r0(lVar3.f434650f.getPaint(), 0.8f);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = lVar.f434649e;
        android.content.Context context = holder.f293121e;
        weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icon_filled_awesome, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
        lVar2.f434649e.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icon_filled_awesome, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
        lVar3.f434649e.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icon_filled_awesome, context.getResources().getColor(com.tencent.mm.R.color.f478553an)));
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new com.tencent.mm.plugin.finder.convert.lw(holder, this));
    }

    public final void o(vb2.l lVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        lVar.f434645a.setTag(finderObject);
        lVar.f434648d.setText(finderObject.getLikeCount() > 0 ? com.tencent.mm.plugin.finder.assist.w2.g(2, finderObject.getLikeCount()) : "0");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = lVar.f434645a.getContext();
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = null;
        java.lang.String nickname = contact != null ? contact.getNickname() : null;
        ((ke0.e) xVar).getClass();
        lVar.f434650f.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, nickname));
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d a17 = g1Var.a();
        com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
        mn2.n nVar = new mn2.n(contact2 != null ? contact2.getHeadUrl() : null, null, 2, null);
        android.widget.ImageView avatar = lVar.f434646b;
        kotlin.jvm.internal.o.f(avatar, "avatar");
        a17.c(nVar, avatar, g1Var.h(mn2.f1.f329957h));
        vo0.d e17 = g1Var.e();
        cu2.t tVar = cu2.u.f222441a;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc != null && (media = objectDesc.getMedia()) != null) {
            finderMedia = media.getFirst();
        }
        if (finderMedia == null) {
            finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
        }
        wo0.c a18 = e17.a(new mn2.c1(bu2.z.i(finderMedia), com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null));
        a18.g(g1Var.h(mn2.f1.f329953d));
        android.widget.ImageView cover = lVar.f434647c;
        kotlin.jvm.internal.o.f(cover, "cover");
        a18.c(cover);
    }
}
