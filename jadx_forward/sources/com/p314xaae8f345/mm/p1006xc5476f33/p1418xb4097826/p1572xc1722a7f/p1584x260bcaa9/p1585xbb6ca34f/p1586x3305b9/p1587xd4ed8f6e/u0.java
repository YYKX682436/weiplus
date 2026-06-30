package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public class u0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f203502e;

    public u0(boolean z17) {
        this.f203502e = z17;
    }

    @Override // in5.r
    public int e() {
        return this.f203502e ? com.p314xaae8f345.mm.R.C30864xbddafb2a.f570758dv3 : com.p314xaae8f345.mm.R.C30864xbddafb2a.c6p;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jz5.l lVar;
        java.lang.String str;
        jz5.l lVar2;
        java.lang.String m76184x8010e5e4;
        r45.h32 h32Var;
        vp2.l item = (vp2.l) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        cl0.g gVar = new cl0.g();
        r45.oa2 oa2Var = item.f520468d;
        gVar.s("Noticeid", (oa2Var == null || (h32Var = (r45.h32) oa2Var.m75936x14adae67(0)) == null) ? null : h32Var.m75945x2fec8307(4));
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        java.lang.String str2 = "";
        if (activity != null) {
            pf5.z zVar = pf5.z.f435481a;
            boolean z18 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z18) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity;
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            if (!z18) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activityC0065xcd7aa112).a(rq2.w.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.HeadImgNoticeConvert", "optionIconReport: true");
            ((rq2.w) a17).P6("", V6.m75945x2fec8307(1), "main_page_notice_card", gVar2);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hlq);
        boolean z19 = this.f203502e;
        if (textView != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) oa2Var.m75936x14adae67(1);
            if (c19782x23db1cfa != null && (m76184x8010e5e4 = c19782x23db1cfa.m76184x8010e5e4()) != null) {
                str2 = m76184x8010e5e4;
            }
            textView.setText(str2);
            if (!z19) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            }
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hlp);
        if (imageView != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) oa2Var.m75936x14adae67(1);
            java.lang.String m76175x6d346f39 = c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76175x6d346f39() : null;
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.a().c(new mn2.n(m76175x6d346f39, null, 2, null), imageView, g1Var.h(mn2.f1.f411491i));
        }
        if (z19) {
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.rqu);
            if (textView2 == null) {
                return;
            }
            java.lang.String m75945x2fec8307 = item.f520470f.m75945x2fec8307(8);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                m75945x2fec8307 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e1t);
            }
            textView2.setText(m75945x2fec8307);
            return;
        }
        long m75939xb282bd08 = (((r45.h32) oa2Var.m75936x14adae67(0)) != null ? r1.m75939xb282bd08(0) : 0) * 1000;
        r45.h32 h32Var2 = (r45.h32) oa2Var.m75936x14adae67(0);
        if (h32Var2 != null && h32Var2.m75939xb282bd08(20) == 1) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mq_, android.text.format.DateFormat.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), m75939xb282bd08));
        } else {
            zl2.q4 q4Var = zl2.q4.f555466a;
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573670fc4);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (string == null || string.length() == 0) {
                string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2);
            }
            java.lang.String str3 = string;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var.f391656d = java.util.Calendar.getInstance();
            java.util.Date date = new java.util.Date(m75939xb282bd08);
            ((java.util.Calendar) h0Var.f391656d).setTime(date);
            int i19 = ((java.util.Calendar) h0Var.f391656d).get(6);
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            java.util.Date date2 = new java.util.Date(c01.id.c());
            calendar.setTime(date2);
            int i27 = i19 - calendar.get(6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderUtil2", "[getFinderLiveNoticeTips] dayDiff:" + i27 + ", bookTime:" + date + ", todayTime:" + date2);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            h0Var2.f391656d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m75939xb282bd08).toString();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j()) {
                int i28 = ((java.util.Calendar) h0Var.f391656d).get(1);
                int i29 = ((java.util.Calendar) h0Var.f391656d).get(2) + 1;
                int i37 = ((java.util.Calendar) h0Var.f391656d).get(5);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(i28);
                sb6.append('.');
                sb6.append(i29);
                sb6.append('.');
                sb6.append(i37);
                lVar = new jz5.l(sb6.toString(), h0Var2.f391656d);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, bool)) {
                if (i27 == -1) {
                    lVar2 = new jz5.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi), h0Var2.f391656d);
                } else if (i27 == 0) {
                    lVar2 = new jz5.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_), h0Var2.f391656d);
                } else if (i27 == 1) {
                    lVar2 = new jz5.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fda), h0Var2.f391656d);
                } else if (i27 != 2) {
                    lVar = zl2.q4.u(h0Var, false, str3, m75939xb282bd08, h0Var2, bool);
                } else {
                    lVar2 = new jz5.l(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573048dc3), h0Var2.f391656d);
                }
                lVar = lVar2;
            } else {
                lVar = zl2.q4.u(h0Var, false, str3, m75939xb282bd08, h0Var2, bool);
            }
            lVar.m141639x9616526c();
            str = ((java.lang.String) lVar.f384366d) + ' ' + ((java.lang.String) lVar.f384367e);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hlo);
        if (textView3 != null) {
            textView3.setText(str);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        android.widget.TextView textView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!this.f203502e || (textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.rqu)) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.fk.a(textView);
    }
}
