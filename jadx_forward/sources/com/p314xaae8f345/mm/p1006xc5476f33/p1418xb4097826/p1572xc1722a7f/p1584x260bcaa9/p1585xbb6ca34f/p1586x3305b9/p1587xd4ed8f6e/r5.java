package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class r5 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 f203458b;

    public r5(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var) {
        this.f203457a = s0Var;
        this.f203458b = t5Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.util.Iterator it;
        android.content.Context context;
        android.content.Context context2;
        java.lang.String str;
        boolean z17;
        java.lang.Object obj;
        pf5.u uVar;
        java.lang.String str2;
        boolean z18;
        java.lang.String str3;
        java.lang.String num;
        java.lang.String num2;
        r45.oa2 oa2Var;
        r45.h32 h32Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        r45.fa2 fa2Var;
        java.lang.String str4;
        r45.fa2 fa2Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.r5 r5Var = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SpecialColumnListConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it6 = recordsSet.iterator();
        while (it6.hasNext()) {
            in5.j jVar = (in5.j) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var = r5Var.f203458b;
            t5Var.getClass();
            cl0.g gVar = new cl0.g();
            android.view.View view = jVar.f374608f;
            if (view != null && (context = view.getContext()) != null) {
                pf5.u uVar2 = pf5.u.f435469a;
                rq2.w wVar = (rq2.w) uVar2.b(context).a(rq2.w.class);
                if (wVar != null) {
                    in5.c cVar = jVar.f374603a;
                    boolean z19 = cVar instanceof vp2.r;
                    java.util.HashMap hashMap = wVar.f480438g;
                    it = it6;
                    if (z19) {
                        vp2.r rVar = z19 ? (vp2.r) cVar : null;
                        if (rVar == null || (fa2Var2 = rVar.f520486e) == null || (str4 = fa2Var2.f455660f) == null) {
                            str4 = "";
                        }
                        gVar.s("page_index", hashMap.get(str4));
                        gVar.s("column_id", str4);
                        tp2.f fVar = t5Var.f203492o;
                        java.lang.String c17 = fVar != null ? fVar.c(jVar.f374607e, jVar.f374608f, "onExpose") : null;
                        r45.qt2 qt2Var = t5Var.f203491n;
                        java.lang.String m75945x2fec8307 = qt2Var != null ? qt2Var.m75945x2fec8307(1) : null;
                        java.lang.String gVar2 = gVar.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                        wVar.P6(c17, m75945x2fec8307, "main_page_column_more", r26.i0.t(gVar2, ",", ";", false));
                    } else {
                        boolean z27 = cVar instanceof wp2.b;
                        wp2.b bVar = z27 ? (wp2.b) cVar : null;
                        if (bVar == null || (fa2Var = bVar.f529917p) == null || (str = fa2Var.f455660f) == null) {
                            context2 = context;
                            str = "";
                        } else {
                            context2 = context;
                        }
                        boolean z28 = cVar instanceof vp2.e0;
                        int i17 = z28 ? 2 : 1;
                        gVar.s("page_index", hashMap.get(str));
                        gVar.s("column_id", str);
                        gVar.s("card_type", java.lang.Integer.valueOf(i17));
                        gVar.s("card_index", java.lang.Integer.valueOf(jVar.f374607e));
                        wp2.b bVar2 = z27 ? (wp2.b) cVar : null;
                        if (bVar2 == null || (feedObject = bVar2.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) {
                            z17 = z27;
                            obj = "";
                        } else {
                            z17 = z27;
                            obj = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0));
                        }
                        gVar.s("liveid", obj);
                        vp2.e0 e0Var = z28 ? (vp2.e0) cVar : null;
                        gVar.s("Noticeid", (e0Var == null || (oa2Var = e0Var.f520450d) == null || (h32Var = (r45.h32) oa2Var.m75936x14adae67(0)) == null) ? null : h32Var.m75945x2fec8307(4));
                        tp2.f fVar2 = t5Var.f203492o;
                        if (fVar2 != null) {
                            uVar = uVar2;
                            str2 = fVar2.c(jVar.f374607e, jVar.f374608f, "onExpose");
                        } else {
                            uVar = uVar2;
                            str2 = null;
                        }
                        r45.qt2 qt2Var2 = t5Var.f203491n;
                        if (qt2Var2 != null) {
                            z18 = true;
                            str3 = qt2Var2.m75945x2fec8307(1);
                        } else {
                            z18 = true;
                            str3 = null;
                        }
                        java.lang.String gVar3 = gVar.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
                        wVar.P6(str2, str3, "main_page_column_card", r26.i0.t(gVar3, ",", ";", false));
                        cl0.g gVar4 = new cl0.g();
                        gVar4.s("main_page_position", java.lang.Integer.valueOf(t5Var.f203495r));
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
                        if (abstractC14490x69736cb5 != null) {
                            t5Var.f203486f.l(abstractC14490x69736cb5, jVar.f374607e, gVar4);
                        }
                        gVar4.s("column_id", str);
                        gVar4.s("card_index", java.lang.Integer.valueOf(jVar.f374607e));
                        if (wVar.f480443o != 0) {
                            java.lang.String str5 = wVar.f480444p;
                            if (!((str5 == null || str5.length() == 0) ? z18 : false)) {
                                gVar4.s("pull_liveid", java.lang.Long.valueOf(wVar.f480443o));
                                gVar4.s("pull_commentsence", wVar.f480444p);
                            }
                        }
                        if (z28) {
                            vp2.e0 e0Var2 = z28 ? (vp2.e0) cVar : null;
                            if (e0Var2 != null) {
                                ml2.d dVar = t5Var.f203490m;
                                int i18 = jVar.f374607e;
                                ml2.x1 x1Var = ml2.x1.f409735f;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar.b(context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                java.lang.String str6 = (nyVar == null || (num2 = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? "" : num2;
                                java.lang.String gVar5 = gVar4.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar5, "toString(...)");
                                dVar.h(e0Var2, i18, x1Var, str6, "", gVar5);
                            }
                        } else {
                            android.content.Context context3 = context2;
                            pf5.u uVar3 = uVar;
                            wp2.b bVar3 = z17 ? (wp2.b) cVar : null;
                            if (bVar3 != null) {
                                ml2.d dVar2 = t5Var.f203490m;
                                int i19 = jVar.f374607e;
                                ml2.x1 x1Var2 = ml2.x1.f409735f;
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) uVar3.b(context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                                java.lang.String str7 = (nyVar2 == null || (num = java.lang.Integer.valueOf(nyVar2.f216913n).toString()) == null) ? "" : num;
                                java.lang.String gVar6 = gVar4.toString();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar6, "toString(...)");
                                dVar2.h(bVar3, i19, x1Var2, str7, "", gVar6);
                            }
                        }
                    }
                    r5Var = this;
                    it6 = it;
                }
            }
            it = it6;
            r5Var = this;
            it6 = it;
        }
        sp2.j jVar2 = sp2.j.f492587a;
        android.content.Context context4 = this.f203457a.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        jVar2.c(context4, recordsSet, null);
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        sp2.k kVar = this.f203458b.f203486f;
        int i17 = item.f374607e;
        in5.c cVar = item.f374603a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        org.json.JSONObject q17 = kVar.q(null, i17, (so2.j5) cVar);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f491911e = q17;
        }
        sp2.j jVar = sp2.j.f492587a;
        android.content.Context context = this.f203457a.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, q17, null, 8, null);
    }
}
