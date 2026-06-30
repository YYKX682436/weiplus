package kk2;

/* loaded from: classes3.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final jk2.a f390018h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.h32 f390019i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f390020m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(jk2.a plugin, r45.h32 finderLiveNoticeInfo) {
        super(((df2.wv) plugin).f313256a.O6(), false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(plugin, "plugin");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderLiveNoticeInfo, "finderLiveNoticeInfo");
        this.f390018h = plugin;
        this.f390019i = finderLiveNoticeInfo;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dtk;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.gz9);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.tmx);
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView2);
        }
        this.f390020m = rootView;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        android.view.View d17 = d(com.p314xaae8f345.mm.R.id.f6a);
        if (d17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View d18 = d(com.p314xaae8f345.mm.R.id.ava);
        if (d18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(d18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(d18, "com/tencent/mm/plugin/finder/live/model/guide/panel/LiveNoticeGuidePanel", "openPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view = this.f390020m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.fdo);
        ya2.g gVar = ya2.h.f542017a;
        df2.wv wvVar = (df2.wv) this.f390018h;
        ya2.b2 b17 = gVar.b(((mm2.c1) wvVar.b().a(mm2.c1.class)).f410385o);
        if (b17 != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            vo0.d a17 = g1Var.a();
            mn2.n nVar = new mn2.n(b17.m176700xe5e0d2a0(), null, 2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            android.view.View view2 = this.f390020m;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.fed);
            if (textView != null) {
                le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                android.content.Context O6 = wvVar.f313256a.O6();
                java.lang.String w07 = b17.w0();
                ((ke0.e) xVar).getClass();
                textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(O6, w07));
            }
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1 m1Var = ya2.m1.f542044a;
            android.view.View view3 = this.f390020m;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            android.view.View findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.fdn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            zy2.tb.a(m1Var, (android.widget.ImageView) findViewById, b17.f69300x731cac1b, 0, 4, null);
        }
        android.view.View view4 = this.f390020m;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.tmx);
        android.view.View view5 = this.f390020m;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) view5.findViewById(com.p314xaae8f345.mm.R.id.tmy);
        android.view.View view6 = this.f390020m;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.widget.TextView textView4 = (android.widget.TextView) view6.findViewById(com.p314xaae8f345.mm.R.id.tmz);
        java.lang.String t17 = zl2.q4.t(zl2.q4.f555466a, this.f390019i, com.p314xaae8f345.mm.R.C30867xcad56011.csf, false, false, true, 4, null);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        r45.h32 h32Var = this.f390019i;
        java.lang.String m75945x2fec8307 = h32Var.m75945x2fec8307(3);
        if (m75945x2fec8307 != null) {
            if (!(m75945x2fec8307.length() > 0)) {
                m75945x2fec8307 = null;
            }
            if (m75945x2fec8307 != null) {
                arrayList3.add(m75945x2fec8307);
            }
        }
        java.lang.String m75945x2fec83072 = h32Var.m75945x2fec8307(23);
        if (m75945x2fec83072 != null) {
            if (!(m75945x2fec83072.length() > 0)) {
                m75945x2fec83072 = null;
            }
            if (m75945x2fec83072 != null) {
                arrayList3.add(m75945x2fec83072);
            }
        }
        arrayList3.add(t17);
        java.lang.String str = (java.lang.String) kz5.n0.a0(arrayList3, 0);
        if (str != null) {
            if (textView2 != null) {
                textView2.setText(str);
            }
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        java.lang.String str2 = (java.lang.String) kz5.n0.a0(arrayList3, 1);
        if (str2 != null) {
            if (textView3 != null) {
                textView3.setText(str2);
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
        }
        java.lang.String str3 = (java.lang.String) kz5.n0.a0(arrayList3, 2);
        if (str3 != null) {
            if (textView4 != null) {
                textView4.setText(str3);
            }
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        }
        android.view.View view7 = this.f390020m;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view7.findViewById(com.p314xaae8f345.mm.R.id.rtj);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new kk2.a(this));
        }
        android.view.View view8 = this.f390020m;
        if (view8 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view8.findViewById(com.p314xaae8f345.mm.R.id.ryw);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new kk2.c(this));
        }
        java.lang.String m75945x2fec83073 = h32Var.m75945x2fec8307(4);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        y(1, 1, m75945x2fec83073);
        java.lang.String m75945x2fec83074 = h32Var.m75945x2fec8307(4);
        y(1, 2, m75945x2fec83074 != null ? m75945x2fec83074 : "");
        super.w();
    }

    public final void y(int i17, int i18, java.lang.String str) {
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.f408780m2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", i17);
        jSONObject.put("type", i18);
        jSONObject.put("notice_id", str);
        ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
