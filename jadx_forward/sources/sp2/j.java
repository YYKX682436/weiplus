package sp2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.j f492587a = new sp2.j();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f492588b;

    public static /* synthetic */ void e(sp2.j jVar, android.content.Context context, in5.j jVar2, org.json.JSONObject jSONObject, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            jSONObject = null;
        }
        if ((i17 & 8) != 0) {
            num = null;
        }
        jVar.d(context, jVar2, jSONObject, num);
    }

    public final void a(r45.ni4 ni4Var, so2.j5 j5Var) {
        if (j5Var instanceof wp2.b) {
            ni4Var.set(14, java.lang.Long.valueOf(((wp2.b) j5Var).f529917p.f455658d));
            return;
        }
        if (j5Var instanceof vp2.e) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.e) j5Var).f520447d.f455658d));
            return;
        }
        if (j5Var instanceof vp2.l) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.l) j5Var).f520469e.f455658d));
            return;
        }
        if (j5Var instanceof vp2.n) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.n) j5Var).f520477d.f455658d));
        } else if (j5Var instanceof vp2.c) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.c) j5Var).f520444e.f455658d));
        } else if (j5Var instanceof vp2.p) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.p) j5Var).f520482d.f455658d));
        }
    }

    public final int b(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context).getD();
    }

    public final void c(android.content.Context context, java.util.Set recordsSet, java.lang.Integer num) {
        int intValue;
        java.lang.String num2;
        java.lang.Object tag;
        java.lang.Object tag2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        if (f492588b) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            if (jVar.f374603a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                r45.ni4 ni4Var = new r45.ni4();
                in5.c cVar = jVar.f374603a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
                sp2.j jVar2 = f492587a;
                jVar2.a(ni4Var, abstractC14490x69736cb5);
                boolean z17 = false;
                ni4Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
                so2.h3.f491925d.f(ni4Var, num != null ? num.intValue() : jVar2.b(context), -1);
                ni4Var.set(5, java.lang.Integer.valueOf((int) jVar.f374606d));
                ni4Var.set(6, java.lang.Integer.valueOf(jVar.f374607e));
                ni4Var.set(4, abstractC14490x69736cb5.g0());
                android.view.View view = jVar.f374608f;
                if (view == null || (tag2 = view.getTag(com.p314xaae8f345.mm.R.id.f567633k62)) == null) {
                    java.lang.Integer num3 = 0;
                    intValue = num3.intValue();
                } else {
                    long longValue = tag2 instanceof java.lang.Long ? ((java.lang.Number) tag2).longValue() : 0L;
                    intValue = java.lang.Integer.valueOf(longValue != 0 ? (int) (android.os.SystemClock.elapsedRealtime() - longValue) : 0).intValue();
                }
                ni4Var.set(7, java.lang.Integer.valueOf(intValue));
                android.view.View view2 = jVar.f374608f;
                if (view2 != null) {
                    view2.setTag(com.p314xaae8f345.mm.R.id.f567633k62, 0L);
                }
                android.view.View view3 = jVar.f374608f;
                if (view3 != null && (tag = view3.getTag(com.p314xaae8f345.mm.R.id.k67)) != null) {
                    z17 = java.lang.Boolean.valueOf(((java.lang.Boolean) tag).booleanValue()).booleanValue();
                }
                ni4Var.set(8, java.lang.Boolean.valueOf(z17));
                linkedList.add(ni4Var);
                ni4Var.set(9, java.lang.Long.valueOf(jVar.f374604b));
                ni4Var.set(13, java.lang.Long.valueOf(jVar.f374604b));
                ni4Var.set(12, java.lang.Integer.valueOf(ni4Var.m75939xb282bd08(5)));
                org.json.JSONObject jSONObject = cVar instanceof so2.h1 ? ((so2.h1) cVar).f491911e : cVar instanceof vp2.n ? ((vp2.n) cVar).f520478e : cVar instanceof vp2.l ? ((vp2.l) cVar).f520471g : null;
                java.lang.String commentScene = (num == null || (num2 = num.toString()) == null) ? java.lang.String.valueOf(jVar2.b(context)) : num2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentScene, "commentScene");
                if (jSONObject == null) {
                    jSONObject = new org.json.JSONObject();
                }
                sp2.i iVar = sp2.i.f492580a;
                long j17 = jVar.f374607e;
                ml2.x1 x1Var = ml2.x1.f409751y;
                jSONObject.put("exp_time", (int) jVar.f374606d);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                iVar.a(abstractC14490x69736cb5, j17, x1Var, commentScene, jSONObject2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadUtils", "onExposeTimeRecorded pos:" + jVar.f374607e + "  start_expose_time_ms: " + jVar.f374604b + " feedId: " + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11() + " auto_play_time_ms:" + ni4Var.m75939xb282bd08(7) + " auto_play_with_sound:" + ni4Var.m75933x41a8a7f2(8) + "  areaId:" + ni4Var.m75942xfb822ef2(14) + " exposeTime:" + jVar.f374606d + " nick:" + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4());
            }
        }
        rq2.v.f480424a.g(num != null ? num.intValue() : b(context), linkedList);
        so2.h3.f491925d.d(linkedList);
    }

    public final void d(android.content.Context context, in5.j record, org.json.JSONObject jSONObject, java.lang.Integer num) {
        java.lang.String str;
        java.lang.String jSONObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(record, "record");
        if (f492588b) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        in5.c cVar = record.f374603a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
        if (abstractC14490x69736cb5 != null) {
            sp2.i iVar = sp2.i.f492580a;
            long j17 = record.f374607e;
            ml2.x1 x1Var = ml2.x1.f409750x;
            if (num == null || (str = num.toString()) == null) {
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) {
                    str = "";
                }
            }
            iVar.a(abstractC14490x69736cb5, j17, x1Var, str, (jSONObject == null || (jSONObject2 = jSONObject.toString()) == null) ? "" : jSONObject2);
            r45.ni4 ni4Var = new r45.ni4();
            sp2.j jVar = f492587a;
            jVar.a(ni4Var, abstractC14490x69736cb5);
            ni4Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
            so2.h3.f491925d.f(ni4Var, num != null ? num.intValue() : jVar.b(context), -1);
            ni4Var.set(9, java.lang.Long.valueOf(record.f374604b));
            ni4Var.set(6, java.lang.Integer.valueOf(record.f374607e));
            ni4Var.set(4, abstractC14490x69736cb5.g0());
            ni4Var.set(11, 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMarkReadUtils", "handleOnItemExposeStart pos:" + record.f374607e + " feedId: " + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11() + " start_expose_time_ms:" + ni4Var.m75942xfb822ef2(9) + " feed_index:" + ni4Var.m75939xb282bd08(6) + "  areaId:" + ni4Var.m75942xfb822ef2(14) + "  nick:" + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4());
            linkedList.add(ni4Var);
        }
        rq2.v.f480424a.g(num != null ? num.intValue() : b(context), linkedList);
        so2.h3.f491925d.d(linkedList);
    }
}
