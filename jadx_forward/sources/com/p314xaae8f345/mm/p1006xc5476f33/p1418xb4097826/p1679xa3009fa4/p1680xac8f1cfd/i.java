package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f216216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j f216217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l f216218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f216219g;

    public i(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.l lVar, int i17) {
        this.f216216d = c19792x256d2725;
        this.f216217e = jVar;
        this.f216218f = lVar;
        this.f216219g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.content.Intent intent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$RvAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String m76836x6c03c64c = this.f216216d.m76836x6c03c64c();
        if (m76836x6c03c64c != null) {
            android.view.View itemView = this.f216218f.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j jVar = this.f216217e;
            java.util.List list = jVar.f216315e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) it.next(), 0));
            }
            android.content.Context context = itemView.getContext();
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Pj((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) it6.next()));
            }
            android.content.Intent intent2 = new android.content.Intent();
            int i17 = this.f216219g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) arrayList2.get(i17);
            long m76784x5db1b11 = c14994x9b99c079.getFeedObject().m76784x5db1b11();
            java.lang.String m59229xb5af1dd5 = c14994x9b99c079.m59229xb5af1dd5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent2, m76784x5db1b11, null, 0, 0, false, 0, m59229xb5af1dd5, 248, null);
            hc2.e0.b(intent2, i17, arrayList3, null, null);
            intent2.putExtra("finder_username", m76836x6c03c64c);
            intent2.putExtra("KEY_FINDER_SELF_FLAG", false);
            intent2.putExtra("KEY_FINDER_FEEDID", m76784x5db1b11);
            intent2.putExtra("KEY_FINDER_FEED_DUP_FLAG", m59229xb5af1dd5);
            intent2.putExtra("KEY_SPECIFY_COMMENTSCENE", 319);
            wa2.x.e(intent2, itemView, 0L, false, false, null, 30, null);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).lk(context, intent2);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            if (abstractActivityC21394xb3d2c0cf == null || (intent = abstractActivityC21394xb3d2c0cf.getIntent()) == null || (str = intent.getStringExtra("profile_username")) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
            r45.qt2 V6 = e17 != null ? e17.V6() : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("recommend_source_finder_username", str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) arrayList2.get(i17)).m59240x7c94657b().m76760x76845fea();
            jSONObject.put("finder_nickname", m76760x76845fea != null ? m76760x76845fea.m76184x8010e5e4() : null);
            jSONObject.put("click_item", 2);
            jSONObject.put("finderusername", m76836x6c03c64c);
            jSONObject.put("finder_index", jVar.f216318h + 1);
            jSONObject.put("click_item", 2);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("feedid", pm0.v.u(m76784x5db1b11));
            jSONObject2.put(ya.b.f77479x42930b2, i17);
            java.lang.String jSONObject3 = jSONObject2.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            jSONObject.put("feed_info", r26.i0.t(jSONObject3, ",", ";", false));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "channel_profile_otherfrdfollow_authorcard", 1, jSONObject, false, null, 48, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderAccountRecommendListConvert$RvAdapter$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
