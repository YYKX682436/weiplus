package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class j0 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 f203269b;

    public j0(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var) {
        this.f203268a = s0Var;
        this.f203269b = m0Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        java.util.Iterator it;
        android.content.Context context;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String num;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.j0 j0Var = this;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BigBannerListConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it6 = recordsSet.iterator();
        while (it6.hasNext()) {
            in5.j jVar = (in5.j) it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var = j0Var.f203269b;
            m0Var.getClass();
            cl0.g gVar = new cl0.g();
            android.view.View view = jVar.f374608f;
            if (view != null && (context = view.getContext()) != null) {
                pf5.z zVar = pf5.z.f435481a;
                boolean z17 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
                rq2.w wVar = (rq2.w) zVar.a(activityC0065xcd7aa112).a(rq2.w.class);
                if (wVar != null) {
                    gVar.s("page_index", java.lang.Integer.valueOf(wVar.f480436e));
                    gVar.s("banner_live_index", java.lang.Integer.valueOf(jVar.f374607e));
                    in5.c cVar = jVar.f374603a;
                    boolean z18 = cVar instanceof wp2.b;
                    wp2.b bVar = z18 ? (wp2.b) cVar : null;
                    gVar.s("liveid", (bVar == null || (feedObject = bVar.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) ? "" : java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)));
                    tp2.f fVar = m0Var.f203331h;
                    if (fVar != null) {
                        it = it6;
                        str = "";
                        str2 = fVar.c(jVar.f374607e, jVar.f374608f, "onExpose");
                    } else {
                        it = it6;
                        str = "";
                        str2 = null;
                    }
                    r45.qt2 qt2Var = m0Var.f203332i;
                    java.lang.String m75945x2fec8307 = qt2Var != null ? qt2Var.m75945x2fec8307(1) : null;
                    java.lang.String gVar2 = gVar.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                    wVar.P6(str2, m75945x2fec8307, "main_page_banner_live", r26.i0.t(gVar2, ",", ";", false));
                    cl0.g gVar3 = new cl0.g();
                    gVar3.s("main_page_position", 2);
                    wp2.b bVar2 = z18 ? (wp2.b) cVar : null;
                    if (bVar2 != null) {
                        m0Var.f203329f.l(bVar2, jVar.f374607e, gVar3);
                    }
                    if (wVar.f480443o != 0) {
                        java.lang.String str3 = wVar.f480444p;
                        if (!(str3 == null || str3.length() == 0)) {
                            gVar3.s("pull_liveid", java.lang.Long.valueOf(wVar.f480443o));
                            gVar3.s("pull_commentsence", wVar.f480444p);
                        }
                    }
                    wp2.b bVar3 = z18 ? (wp2.b) cVar : null;
                    if (bVar3 != null) {
                        ml2.d dVar = m0Var.f203330g;
                        int i17 = jVar.f374607e;
                        ml2.x1 x1Var = ml2.x1.f409735f;
                        if (!z17) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                        java.lang.String str4 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? str : num;
                        java.lang.String gVar4 = gVar3.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
                        dVar.h(bVar3, i17, x1Var, str4, "", gVar4);
                    } else {
                        continue;
                    }
                    j0Var = this;
                    it6 = it;
                }
            }
            it = it6;
            j0Var = this;
            it6 = it;
        }
        sp2.j jVar2 = sp2.j.f492587a;
        android.content.Context context2 = this.f203268a.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        jVar2.c(context2, recordsSet, null);
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        sp2.k kVar = this.f203269b.f203329f;
        int i17 = item.f374607e;
        in5.c cVar = item.f374603a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.RVFeed");
        org.json.JSONObject q17 = kVar.q(null, i17, (so2.j5) cVar);
        so2.h1 h1Var = cVar instanceof so2.h1 ? (so2.h1) cVar : null;
        if (h1Var != null) {
            h1Var.f491911e = q17;
        }
        sp2.j jVar = sp2.j.f492587a;
        android.content.Context context = this.f203268a.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, q17, null, 8, null);
    }
}
