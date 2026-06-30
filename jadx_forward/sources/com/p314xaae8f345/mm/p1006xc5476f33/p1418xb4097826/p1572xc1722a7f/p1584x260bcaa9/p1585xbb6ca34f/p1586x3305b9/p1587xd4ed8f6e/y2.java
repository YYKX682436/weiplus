package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public class y2 extends in5.r {

    /* renamed from: n, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.j2 f203576n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.j2(null);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f203577e;

    /* renamed from: f, reason: collision with root package name */
    public final int f203578f;

    /* renamed from: g, reason: collision with root package name */
    public final float f203579g;

    /* renamed from: h, reason: collision with root package name */
    public final sp2.k f203580h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.p f203581i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f203582m;

    public y2(boolean z17, int i17, float f17, sp2.k kVar, yz5.p jumProfileCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumProfileCallback, "jumProfileCallback");
        this.f203577e = z17;
        this.f203578f = i17;
        this.f203579g = f17;
        this.f203580h = kVar;
        this.f203581i = jumProfileCallback;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570871c63;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        holder.p(com.p314xaae8f345.mm.R.id.f566403fs4).setBackground(m95.a.e(holder.f374654e.getResources(), com.p314xaae8f345.mm.R.raw.f80707xa254a1e2, 0.0f));
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "#onViewRecycled holder=" + holder);
        q(holder);
    }

    public final void n(in5.s0 s0Var, r45.mb4 mb4Var, wp2.b bVar) {
        java.lang.String str;
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f568828o70);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.icp);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.e_l);
        android.view.View findViewWithTag = viewGroup != null ? viewGroup.findViewWithTag("nearby-live-fluent-preview-view-tag") : null;
        if (findViewWithTag != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "bindCover remove fluentView");
            if (viewGroup != null) {
                viewGroup.removeView(findViewWithTag);
            }
        }
        if (imageView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LivingConvert", "bindCover return for thumbIv is null.");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int i17 = this.f203578f;
        layoutParams.width = i17;
        float f17 = i17;
        float f18 = this.f203579g;
        layoutParams.height = (int) (f18 * f17);
        imageView.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.k68);
        android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.width = i17;
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.k68);
        android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup3 != null ? viewGroup3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.height = (int) (f18 * f17);
        }
        java.lang.String str2 = bVar.f529919r;
        if (str2 == null) {
            str2 = "";
        }
        boolean z17 = false;
        if (str2.length() == 0) {
            str2 = zl2.q4.f555466a.y(mb4Var, 1);
            if (!(str2.length() > 0) && (str2 = bVar.f529919r) == null) {
                java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                str2 = m75945x2fec8307.concat(m75945x2fec83072);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(mb4Var.m75945x2fec8307(1));
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
            sb6.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
            str = sb6.toString();
        } else {
            str = str2;
        }
        ((android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f568828o70)).setTag(java.lang.Long.valueOf(bVar.getFeedObject().getFeedObject().m76784x5db1b11()));
        r45.nw1 m59258xd0557130 = bVar.getFeedObject().m59258xd0557130();
        if (m59258xd0557130 != null && m59258xd0557130.m75939xb282bd08(2) == 1) {
            z17 = true;
        }
        v(bVar, z17, str, imageView, textView, true);
    }

    public final void o(in5.s0 s0Var, wp2.b bVar) {
        java.lang.Object obj;
        r45.an1 an1Var = (r45.an1) bVar.f529916o.m75936x14adae67(11);
        if (an1Var == null) {
            obj = null;
        } else if (an1Var.m75933x41a8a7f2(5)) {
            ((android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f4p)).setVisibility(8);
            obj = jz5.f0.f384359a;
        } else {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f4p);
            viewGroup.setVisibility(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a;
            a3Var.a(viewGroup, an1Var);
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.f4q);
            textView.setText(an1Var.m75945x2fec8307(0));
            java.util.LinkedList m75941xfb821914 = an1Var.m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getWording_color(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.e(a3Var, textView, m75941xfb821914, null, null, 6, null);
            java.lang.Object p17 = s0Var.p(com.p314xaae8f345.mm.R.id.r6b);
            android.widget.ImageView imageView = (android.widget.ImageView) p17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a3Var.b(imageView, an1Var);
            obj = p17;
        }
        if (obj == null) {
            ((android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f4p)).setVisibility(8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x018a, code lost:
    
        if (r7 == null) goto L89;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p(wp2.b r13, in5.s0 r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2.p(wp2.b, in5.s0, java.util.List):boolean");
    }

    public final void q(in5.s0 s0Var) {
        java.lang.Object obj = s0Var.f374657h;
        if (obj != null && (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.l2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.l2) obj;
            p3325xe03a0797.p3326xc267989b.z0.e(l2Var.f203308a, null, 1, null);
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = l2Var.f203310c;
            if (activityLifecycleCallbacks != null) {
                android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        s0Var.f374657h = null;
    }

    public final java.lang.String r(wp2.b bVar) {
        java.lang.String str = bVar.f529918q;
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "cur live enable extDesc");
            return bVar.f529918q;
        }
        sp2.k kVar = this.f203580h;
        if (kVar != null && kVar.k()) {
            if (!(bVar.getFeedObject().m59226x730bcac6().length() == 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "cur live enable finderDesc");
                return bVar.getFeedObject().m59226x730bcac6();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disable desc, ");
        sb6.append(kVar != null ? java.lang.Boolean.valueOf(kVar.k()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", sb6.toString());
        return null;
    }

    public void s(wp2.b item, in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x01cf, code lost:
    
        if (r4 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a3, code lost:
    
        if (r4 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01d6, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01d1, code lost:
    
        r4 = r4.m76175x6d346f39();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:208:0x099f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x09bb  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0197  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [boolean, int] */
    @Override // in5.r
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r34, wp2.b r35, int r36, int r37, boolean r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 2539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.y2.h(in5.s0, wp2.b, int, int, boolean, java.util.List):void");
    }

    public final void u(wp2.b bVar, in5.s0 s0Var, boolean z17) {
        java.lang.String str;
        r45.mb4 mb4Var = bVar.getFeedObject().m59311x25315bf4() ? (r45.mb4) kz5.n0.Z(bVar.getFeedObject().m59259x7dea7760()) : (r45.mb4) kz5.n0.Z(bVar.getFeedObject().m59264x7efe73ec());
        if (mb4Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LivingConvert", "refreshLiveStatus: mediaObj is null, feedId=" + bVar.getFeedObject().getFeedObject().m76784x5db1b11());
            return;
        }
        java.lang.String str2 = bVar.f529919r;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = zl2.q4.f555466a.y(mb4Var, 1);
            if (!(str2.length() > 0)) {
                java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
                if (m75945x2fec83072 == null) {
                    m75945x2fec83072 = "";
                }
                str2 = m75945x2fec8307.concat(m75945x2fec83072);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(1);
            if (m75945x2fec83073 == null) {
                m75945x2fec83073 = "";
            }
            java.lang.String m75945x2fec83074 = mb4Var.m75945x2fec8307(19);
            str = m75945x2fec83073.concat(m75945x2fec83074 != null ? m75945x2fec83074 : "");
        } else {
            str = str2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) s0Var.p(com.p314xaae8f345.mm.R.id.f98);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.ffb);
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.f568828o70);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.e_l);
        if (z17) {
            if (c15315xe70278e1 != null) {
                c15315xe70278e1.setVisibility(8);
            }
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert", "refreshLiveStatus", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert", "refreshLiveStatus", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            if (c15315xe70278e1 != null) {
                c15315xe70278e1.setVisibility(0);
            }
            if (p17 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert", "refreshLiveStatus", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/LivingConvert", "refreshLiveStatus", "(Lcom/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/convertdata/base/LiveConvertData;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        s(bVar, s0Var, z17);
        v(bVar, z17, str, imageView, textView, false);
    }

    public final void v(wp2.b bVar, boolean z17, java.lang.String str, android.widget.ImageView imageView, android.widget.TextView textView, boolean z18) {
        java.lang.String str2;
        r45.co1 co1Var;
        r45.co1 co1Var2;
        if (imageView == null) {
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = bVar.getFeedObject().getFeedObject();
        if (!z17) {
            i95.m c17 = i95.n0.c(c61.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.zb.g7((c61.zb) c17, imageView, str, 0, 4, null);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        r45.nw1 m76794xd0557130 = feedObject.m76794xd0557130();
        if (!((m76794xd0557130 == null || (co1Var2 = (r45.co1) m76794xd0557130.m75936x14adae67(43)) == null || co1Var2.m75939xb282bd08(0) != 1) ? false : true)) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            wo0.c b17 = g1Var.e().b(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), this.f203577e ? g1Var.h(mn2.f1.f411501v) : g1Var.h(mn2.f1.f411486d));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.v2 v2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.v2(z18, feedObject, str, bVar);
            b17.getClass();
            b17.f529409g = v2Var;
            b17.f529408f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.w2(z18, feedObject, str, bVar);
            b17.c(imageView);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        i95.m c18 = i95.n0.c(vd2.i5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        vd2.i5.l7((vd2.i5) c18, str, imageView, null, 4, null);
        if (textView != null) {
            r45.nw1 m76794xd05571302 = feedObject.m76794xd0557130();
            if (m76794xd05571302 == null || (co1Var = (r45.co1) m76794xd05571302.m75936x14adae67(43)) == null || (str2 = co1Var.m75945x2fec8307(1)) == null) {
                str2 = "";
            }
            textView.setText(str2);
        }
        if (textView == null) {
            return;
        }
        textView.setVisibility(0);
    }

    public final void w(android.widget.TextView textView, java.lang.String str, int i17) {
        sp2.k kVar = this.f203580h;
        java.lang.Integer valueOf = kVar != null ? java.lang.Integer.valueOf(kVar.e()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivingConvert", "renderWatchCountHistoryTv: bottomExtraInfo=" + valueOf);
        boolean z17 = true;
        if (valueOf != null && valueOf.intValue() == 1) {
            textView.setVisibility(8);
            return;
        }
        if ((str == null || str.length() == 0) && i17 > 0) {
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.f(i17);
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }
}
