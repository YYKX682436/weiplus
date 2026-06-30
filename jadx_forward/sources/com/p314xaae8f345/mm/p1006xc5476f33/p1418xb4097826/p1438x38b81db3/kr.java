package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class kr extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nr {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f185388g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f185389h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl contract) {
        super(contract);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        this.f185388g = contract;
        this.f185389h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jr.f185309d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nr, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dj_;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nr
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl n() {
        return this.f185388g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nr, in5.r
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.u1 item, int i17, int i18, boolean z17, java.util.List list) {
        boolean z18;
        java.lang.String str;
        boolean z19;
        java.lang.String str2;
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.aha);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) p17);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f564907ah5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) p18);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.qlm);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p19, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderNewStyle2BigCardConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hqt)).setVisibility(0);
        if (((java.lang.Boolean) ((jz5.n) this.f185389h).mo141623x754a37bb()).booleanValue()) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ah6)).setVisibility(0);
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ah6)).setVisibility(8);
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.qgk);
        boolean z27 = true;
        if (item.getFeedObject().m59431x67d3b560()) {
            z18 = true;
        } else {
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z18 = false;
        }
        android.content.Context context = holder.f374654e;
        if (z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
            r45.qt2 V6 = e17 != null ? e17.V6() : null;
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(viewGroup, "watch_later_in_feed_card");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("watch_later_");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context);
            sb6.append(e18 != null ? java.lang.Integer.valueOf(e18.f216913n) : null);
            sb6.append('_');
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = item.getFeedObject();
            sb6.append(pm0.v.u(feedObject != null ? feedObject.m59251x5db1b11() : 0L));
            aVar.tk(viewGroup, sb6.toString());
            aVar.Tj(viewGroup, 24, 1, true);
            aVar.Ai(viewGroup, new vn2.w0(viewGroup, context, item, 0.0f));
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
            lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context);
            lVarArr[2] = new jz5.l("comment_scene", e19 != null ? java.lang.Integer.valueOf(e19.f216913n) : null);
            aVar.gk(viewGroup, kz5.c1.k(lVarArr));
            viewGroup.setVisibility(0);
            if (((java.util.HashSet) ((jz5.n) ((ey2.g1) pf5.u.f435469a.e(c61.l7.class).a(ey2.g1.class)).f338912h).mo141623x754a37bb()).contains(java.lang.Long.valueOf(item.mo2128x1ed62e84()))) {
                ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.qwd)).setVisibility(0);
                ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qgl)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.lsz);
                viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.hr(holder, item, this, i17));
            } else {
                viewGroup.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ir(holder, item, this, i17));
                ((android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.qwd)).setVisibility(8);
                ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qgl)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.lqi);
            }
        } else {
            viewGroup.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ahb);
        java.lang.String str4 = "";
        if (textView != null) {
            r45.ru2 m76771x17e42f9f = item.getFeedObject().getFeedObject().m76771x17e42f9f();
            if (m76771x17e42f9f == null || (str2 = m76771x17e42f9f.m75945x2fec8307(0)) == null) {
                str2 = "";
            }
            r45.ru2 m76771x17e42f9f2 = item.getFeedObject().getFeedObject().m76771x17e42f9f();
            int m75939xb282bd08 = m76771x17e42f9f2 != null ? m76771x17e42f9f2.m75939xb282bd08(1) : 0;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(str2);
                if (m75939xb282bd08 != 3) {
                    if (m75939xb282bd08 == 4) {
                        i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77788x5ac80f24;
                    } else if (m75939xb282bd08 == 5) {
                        i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880;
                    }
                    textView.setTextColor(context.getColor(i19));
                }
                i19 = com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19;
                textView.setTextColor(context.getColor(i19));
            }
        }
        r45.ru2 m76771x17e42f9f3 = item.getFeedObject().getFeedObject().m76771x17e42f9f();
        if (m76771x17e42f9f3 == null || (str = m76771x17e42f9f3.m75945x2fec8307(2)) == null) {
            str = "";
        }
        if (str.length() == 0) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hqr)).setVisibility(8);
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hqr)).setVisibility(0);
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hqr)).setText(str);
        }
        ya2.g gVar = ya2.h.f542017a;
        java.lang.String str5 = item.getFeedObject().f66949xdec927b;
        r45.xk m59211x37f6d02b = item.getFeedObject().m59211x37f6d02b();
        if (ya2.g.h(gVar, str5, m59211x37f6d02b != null ? m59211x37f6d02b.m75945x2fec8307(0) : null, false, false, 12, null)) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hqt)).setVisibility(0);
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hqt)).setVisibility(8);
        }
        if (!(this.f185388g.f190602d.getIntent().getIntExtra("key_reuqest_scene", 0) == 40)) {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818 c0090x87990818 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818) holder.p(com.p314xaae8f345.mm.R.id.f569075oy0);
            if (c0090x87990818 == null) {
                return;
            }
            c0090x87990818.setVisibility(8);
            return;
        }
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.a(item).m59135x7efe73ec());
        if (mb4Var != null) {
            str4 = ds2.h.f324399a.c(item.mo2128x1ed62e84(), mb4Var, false).n();
            float f17 = cu2.x.c(cu2.x.f303982a, str4, false, false, false, 14, null).f68986xa6baeca6;
            if (f17 <= 0.0f) {
                r45.no2 m76812x1c39ba23 = item.getFeedObject().getFeedObject().m76812x1c39ba23();
                int m75939xb282bd082 = m76812x1c39ba23 != null ? m76812x1c39ba23.m75939xb282bd08(0) : 0;
                f17 = (m75939xb282bd082 <= 0 || mb4Var.m75939xb282bd08(3) <= 0) ? 0.0f : (m75939xb282bd082 * 1.0f) / mb4Var.m75939xb282bd08(3);
            }
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818 c0090x879908182 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818) holder.p(com.p314xaae8f345.mm.R.id.f569075oy0);
            if (c0090x879908182 != null) {
                c0090x879908182.setProgress(a06.d.b(1000 * f17));
                c0090x879908182.setVisibility(f17 > 0.0f ? 0 : 8);
            }
        } else {
            p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818 c0090x879908183 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0090x87990818) holder.p(com.p314xaae8f345.mm.R.id.f569075oy0);
            if (c0090x879908183 != null) {
                c0090x879908183.setProgress(0);
                c0090x879908183.setVisibility(8);
            }
        }
        java.lang.String str6 = str4;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z19 = true;
        } else {
            java.lang.String str7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z19 = false;
        }
        if (!z19 && !z65.c.a()) {
            kb2.b bVar = kb2.b.f387758a;
            z27 = false;
        }
        if (z27) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setPlayProgress cachePlayProgress=");
            sb7.append(cu2.x.c(cu2.x.f303982a, str6, false, false, false, 14, null).f68986xa6baeca6);
            sb7.append(",breakPointTimeMs=");
            r45.no2 m76812x1c39ba232 = item.getFeedObject().getFeedObject().m76812x1c39ba23();
            sb7.append(m76812x1c39ba232 != null ? java.lang.Integer.valueOf(m76812x1c39ba232.m75939xb282bd08(0)) : null);
            sb7.append(",videoDuration=");
            sb7.append(mb4Var != null ? java.lang.Integer.valueOf(mb4Var.m75939xb282bd08(3)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNewStyle2BigCardConvert", sb7.toString());
        }
    }
}
