package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class j4 extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 f203274b;

    public j4(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var) {
        this.f203273a = s0Var;
        this.f203274b = p4Var;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        android.content.Context context;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RecentWatchListConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it = recordsSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                sp2.j jVar = sp2.j.f492587a;
                android.content.Context context2 = this.f203273a.f3639x46306858.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                jVar.c(context2, recordsSet, null);
                return;
            }
            in5.j jVar2 = (in5.j) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.p4 p4Var = this.f203274b;
            p4Var.getClass();
            android.view.View view = jVar2.f374608f;
            if (view != null && (context = view.getContext()) != null) {
                pf5.z zVar = pf5.z.f435481a;
                boolean z17 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
                rq2.w wVar = (rq2.w) zVar.a(activityC0065xcd7aa112).a(rq2.w.class);
                if (wVar != null) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.putOpt("pull_liveid", java.lang.Long.valueOf(wVar.f480443o));
                    jSONObject.putOpt("pull_commentsence", wVar.f480444p);
                    jSONObject.putOpt("main_page_position", 5);
                    in5.c cVar = jVar2.f374603a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
                    if (abstractC14490x69736cb5 != null) {
                        ml2.d dVar = p4Var.f203420m;
                        int i17 = jVar2.f374607e;
                        ml2.x1 x1Var = ml2.x1.f409735f;
                        if (!z17) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                        if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
                            str = "";
                        }
                        java.lang.String str2 = str;
                        java.lang.String jSONObject2 = jSONObject.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                        dVar.h(abstractC14490x69736cb5, i17, x1Var, str2, "", jSONObject2);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        sp2.j jVar = sp2.j.f492587a;
        android.content.Context context = this.f203273a.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        sp2.j.e(jVar, context, item, null, null, 12, null);
    }
}
