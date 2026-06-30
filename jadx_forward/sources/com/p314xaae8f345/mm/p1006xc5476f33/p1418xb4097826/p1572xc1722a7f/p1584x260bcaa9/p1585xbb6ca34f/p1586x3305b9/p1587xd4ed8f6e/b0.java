package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class b0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.e f203116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 f203117e;

    public b0(vp2.e eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var) {
        this.f203116d = eVar;
        this.f203117e = m0Var;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        vp2.e eVar;
        java.lang.String str2;
        java.lang.Class cls;
        java.lang.Object obj;
        java.lang.String num;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.nw1 m59258xd0557130;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = ((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) adapter).a0();
        if (i17 < a07) {
            return;
        }
        int i18 = i17 - a07;
        vp2.e eVar2 = this.f203116d;
        java.lang.Object obj2 = eVar2.f520448e.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
        so2.j5 j5Var = (so2.j5) obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m0 m0Var = this.f203117e;
        r45.qt2 qt2Var = m0Var.f203332i;
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(2)) == null) {
            str = "";
        }
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            pf5.z zVar = pf5.z.f435481a;
            boolean z17 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z17) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activityC0065xcd7aa112).a(rq2.w.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            rq2.w wVar = (rq2.w) a17;
            cl0.g gVar = new cl0.g();
            str2 = str;
            gVar.s("page_index", java.lang.Integer.valueOf(wVar.f480436e));
            gVar.s("banner_live_index", java.lang.String.valueOf(i18));
            boolean z18 = j5Var instanceof wp2.b;
            wp2.b bVar = z18 ? (wp2.b) j5Var : null;
            if (bVar == null || (feedObject = bVar.getFeedObject()) == null || (m59258xd0557130 = feedObject.m59258xd0557130()) == null) {
                cls = rq2.w.class;
                obj = "";
            } else {
                cls = rq2.w.class;
                obj = java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0));
            }
            gVar.s("liveid", obj);
            r45.qt2 qt2Var2 = m0Var.f203332i;
            java.lang.String m75945x2fec8307 = qt2Var2 != null ? qt2Var2.m75945x2fec8307(1) : null;
            java.lang.String gVar2 = gVar.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
            eVar = eVar2;
            wVar.Q6(m75945x2fec8307, "main_page_banner_live", r26.i0.t(gVar2, ",", ";", false));
            wp2.b bVar2 = z18 ? (wp2.b) j5Var : null;
            if (bVar2 != null) {
                cl0.g gVar3 = new cl0.g();
                gVar3.s("main_page_position", 2);
                m0Var.f203329f.l(bVar2, i18, gVar3);
                if (wVar.f480443o != 0) {
                    java.lang.String str3 = wVar.f480444p;
                    if (!(str3 == null || str3.length() == 0)) {
                        gVar3.s("pull_liveid", java.lang.Long.valueOf(wVar.f480443o));
                        gVar3.s("pull_commentsence", wVar.f480444p);
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962) view.findViewWithTag("nearby-live-preview-view-tag");
                if (c14522x8ffd8962 != null) {
                    gVar3.o("playstatus", c14522x8ffd8962.getPlayStatus());
                    java.lang.String mo58381xe699b631 = c14522x8ffd8962.mo58381xe699b631();
                    if (mo58381xe699b631 == null) {
                        mo58381xe699b631 = "";
                    }
                    gVar3.h("streamid", mo58381xe699b631);
                }
                ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                long j17 = i18;
                ml2.x1 x1Var = ml2.x1.f409740n;
                if (!z17) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                java.lang.String str4 = (nyVar == null || (num = java.lang.Integer.valueOf(nyVar.f216913n).toString()) == null) ? "" : num;
                java.lang.String gVar4 = gVar3.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar4, "toString(...)");
                j0Var.sj(bVar2, j17, x1Var, str4, "", "", gVar4);
            }
        } else {
            eVar = eVar2;
            str2 = str;
            cls = rq2.w.class;
        }
        tp2.f fVar = m0Var.f203331h;
        if (fVar != null) {
            java.util.ArrayList arrayList = eVar.f520448e;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("main_page_position", "2");
            bundle.putInt("card_index", i18);
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            rq2.w wVar2 = (rq2.w) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(cls);
            if (wVar2 != null && wVar2.f480443o != 0) {
                java.lang.String str5 = wVar2.f480444p;
                if (!(str5 == null || str5.length() == 0)) {
                    bundle.putLong("pull_liveid", wVar2.f480443o);
                    bundle.putString("pull_commentsence", wVar2.f480444p);
                }
            }
            tp2.f.d(fVar, j5Var, i17, i18, view, arrayList, str2, 2, bundle, null, null, 0L, 1792, null);
        }
    }
}
