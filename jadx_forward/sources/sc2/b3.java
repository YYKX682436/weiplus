package sc2;

/* loaded from: classes2.dex */
public final class b3 extends ad2.h {
    public boolean A;
    public r45.nh C;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f487310x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f487311y;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f487312z;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487309w = "FeedJumperBigBtnObserver";
    public final java.lang.Runnable B = new sc2.z2(this);

    @Override // ad2.h
    public void B(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.xk m59211x37f6d02b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.B(holder, jumpView, infoEx, source);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        if (2 == c19786x6a1e2862.m76480xe2ee1ca3() && 7 == c19786x6a1e2862.m76503x92bc3c07()) {
            ya2.g gVar = ya2.h.f542017a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
            java.lang.String str = (abstractC14490x69736cb5 == null || (feedObject2 = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject2.f66949xdec927b;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
            z17 = !ya2.g.h(gVar, str, (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (m59211x37f6d02b = feedObject.m59211x37f6d02b()) == null) ? null : m59211x37f6d02b.m75945x2fec8307(0), false, false, 12, null);
        } else {
            z17 = true;
        }
        I(z17, true);
        this.A = true;
    }

    @Override // ad2.h
    public void C(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.C(holder);
        android.view.View view = this.f487310x;
        if (view != null) {
            view.removeCallbacks(this.B);
        }
    }

    public final java.lang.String G(android.content.Context context, java.lang.String str, int i17) {
        if (!(str == null || str.length() == 0)) {
            return str;
        }
        java.lang.String string = context.getString(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }

    public final void H(xc2.p0 p0Var, in5.s0 s0Var) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        android.view.View view = this.f487310x;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshCommon", "(Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshCommon", "(Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        r45.nh nhVar = this.C;
        boolean z17 = true;
        java.lang.String str2 = "";
        if (nhVar == null || (str = nhVar.m75945x2fec8307(1)) == null) {
            str = "";
        }
        r45.nh nhVar2 = this.C;
        if (nhVar2 != null && (m75945x2fec8307 = nhVar2.m75945x2fec8307(0)) != null) {
            str2 = m75945x2fec8307;
        }
        java.lang.String q07 = y2Var.q0(str, str2);
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String l17 = l(q07, G(context, p0Var.f534767a.m76523x98b23862(), com.p314xaae8f345.mm.R.C30867xcad56011.f572795ck4));
        android.widget.TextView textView = this.f487311y;
        if (textView != null) {
            textView.setText(l17);
        }
        r45.nh nhVar3 = this.C;
        java.lang.String m75945x2fec83072 = nhVar3 != null ? nhVar3.m75945x2fec8307(4) : null;
        if (m75945x2fec83072 != null && m75945x2fec83072.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f487312z;
            if (c22699x3dcdb352 == null) {
                return;
            }
            c22699x3dcdb352.setVisibility(8);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f487312z;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.setVisibility(0);
        }
        r45.nh nhVar4 = this.C;
        y2Var.p0(nhVar4 != null ? nhVar4.m75945x2fec8307(4) : null, this.f487312z, null);
    }

    public final void I(boolean z17, boolean z18) {
        android.view.View view;
        if (!z17 && !this.A) {
            android.view.View view2 = this.f487310x;
            if (view2 != null) {
                view2.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563145xz);
                return;
            }
            return;
        }
        r45.nh nhVar = this.C;
        java.lang.String m75945x2fec8307 = nhVar != null ? nhVar.m75945x2fec8307(3) : null;
        if (!(m75945x2fec8307 == null || m75945x2fec8307.length() == 0)) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                r45.nh nhVar2 = this.C;
                int parseColor = android.graphics.Color.parseColor(nhVar2 != null ? nhVar2.m75945x2fec8307(3) : null);
                android.view.View view3 = this.f487310x;
                if (view3 != null) {
                    view3.setBackgroundColor(parseColor);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
        }
        if (!z18 || (view = this.f487310x) == null) {
            return;
        }
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563058vk);
    }

    public final void J(in5.s0 s0Var, boolean z17) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28623;
        xc2.p0 p0Var = this.f84680h;
        if ((p0Var == null || (c19786x6a1e28623 = p0Var.f534767a) == null || 2 != c19786x6a1e28623.m76480xe2ee1ca3()) ? false : true) {
            xc2.p0 p0Var2 = this.f84680h;
            if ((p0Var2 == null || (c19786x6a1e28622 = p0Var2.f534767a) == null || 7 != c19786x6a1e28622.m76503x92bc3c07()) ? false : true) {
                if (z17) {
                    android.view.View view = this.f487310x;
                    if (view != null && view.getVisibility() == 8) {
                        return;
                    }
                }
                int dimensionPixelSize = s0Var.f374654e.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
                android.content.Context context = s0Var.f374654e;
                if (z17) {
                    android.widget.TextView textView = this.f487311y;
                    if (textView != null) {
                        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573807fw4);
                    }
                    android.widget.TextView textView2 = this.f487311y;
                    if (textView2 != null) {
                        textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560783u2));
                    }
                    android.view.View view2 = this.f487310x;
                    if (view2 != null) {
                        view2.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563145xz));
                    }
                    android.view.View view3 = this.f487310x;
                    if (view3 != null) {
                        view3.postDelayed(new sc2.a3(this, dimensionPixelSize), 1000L);
                        return;
                    }
                    return;
                }
                android.widget.TextView textView3 = this.f487311y;
                if (textView3 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    xc2.p0 p0Var3 = this.f84680h;
                    textView3.setText(G(context, (p0Var3 == null || (c19786x6a1e2862 = p0Var3.f534767a) == null) ? null : c19786x6a1e2862.m76523x98b23862(), com.p314xaae8f345.mm.R.C30867xcad56011.cxd));
                }
                android.widget.TextView textView4 = this.f487311y;
                if (textView4 != null) {
                    textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
                }
                android.view.View view4 = this.f487310x;
                if (view4 == null || view4 == null) {
                    return;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "updateFollow", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "updateFollow", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487309w;
    }

    @Override // ad2.h
    public void p(in5.s0 holder, xc2.t0 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        int ordinal = action.f534839a.ordinal();
        if (ordinal == 0) {
            I(true, true);
        } else if (ordinal == 1) {
            J(holder, true);
        } else {
            if (ordinal != 2) {
                return;
            }
            J(holder, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        android.view.View a17;
        r45.wf6 wf6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.wf6 wf6Var2 = this.f84682m;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                }
                wf6Var = it.next();
                r45.wf6 wf6Var3 = (r45.wf6) wf6Var;
                if (wf6Var3.m75939xb282bd08(1) == infoEx.f534789r && wf6Var3.m75939xb282bd08(2) == 3) {
                    break;
                }
            }
            wf6Var2 = wf6Var;
        }
        this.C = wf6Var2 != null ? (r45.nh) wf6Var2.m75936x14adae67(6) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487309w, "[onBindView] hashCode:" + hashCode() + "holder: " + holder.hashCode() + " holder position: " + holder.m8188xa86cd69f() + " feedId=" + pm0.v.u(this.f84678f) + " showPosition=" + infoEx.f534789r + " showStyle=" + infoEx.f534790s + " businessType=" + c19786x6a1e2862.m76480xe2ee1ca3() + " jumpType=" + c19786x6a1e2862.m76503x92bc3c07() + " title=" + c19786x6a1e2862.m76514x1202da9d() + '|' + c19786x6a1e2862.m76523x98b23862() + " icon_url=" + c19786x6a1e2862.m76497x4fe38a1f() + " ext_info=" + c19786x6a1e2862.m76489xefafd82() + ' ');
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L0().r()).booleanValue()) {
            jz5.g gVar = bw2.s.f106420a;
            a17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.s.f106420a).mo141623x754a37bb()).mo146xb9724478(jumpView)).a();
        } else {
            a17 = jumpView.findViewById(com.p314xaae8f345.mm.R.id.e9w);
        }
        this.f487310x = a17;
        this.f487311y = a17 != null ? (android.widget.TextView) a17.findViewById(com.p314xaae8f345.mm.R.id.e9v) : null;
        android.view.View view = this.f487310x;
        this.f487312z = view != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.e9u) : null;
        if (2 != c19786x6a1e2862.m76480xe2ee1ca3()) {
            jz5.l k17 = nv2.n1.f422084h.k(feed.getFeedObject().getFeedObject());
            boolean booleanValue = ((java.lang.Boolean) k17.f384366d).booleanValue();
            ((java.lang.Boolean) k17.f384367e).booleanValue();
            I(booleanValue, false);
            H(infoEx, holder);
            return;
        }
        if (7 == c19786x6a1e2862.m76503x92bc3c07()) {
            android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
            if (findViewById != null) {
                findViewById.setTranslationY(0.0f);
            }
            android.view.View findViewById2 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.g1y);
            if (findViewById2 != null) {
                findViewById2.setTranslationY(0.0f);
            }
            android.view.View view2 = this.f487310x;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f487312z;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            ya2.g gVar2 = ya2.h.f542017a;
            java.lang.String str = feed.getFeedObject().f66949xdec927b;
            r45.xk m59211x37f6d02b = feed.getFeedObject().m59211x37f6d02b();
            if (ya2.g.h(gVar2, str, m59211x37f6d02b != null ? m59211x37f6d02b.m75945x2fec8307(0) : null, false, false, 12, null)) {
                android.view.View view3 = this.f487310x;
                if (view3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                jz5.l k18 = nv2.n1.f422084h.k(feed.getFeedObject().getFeedObject());
                boolean booleanValue2 = ((java.lang.Boolean) k18.f384366d).booleanValue();
                ((java.lang.Boolean) k18.f384367e).booleanValue();
                I(booleanValue2, true);
                android.view.View view4 = this.f487310x;
                if (view4 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView = this.f487311y;
                android.content.Context context = holder.f374654e;
                if (textView != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    textView.setText(G(context, c19786x6a1e2862.m76523x98b23862(), com.p314xaae8f345.mm.R.C30867xcad56011.cxd));
                }
                android.widget.TextView textView2 = this.f487311y;
                if (textView2 != null) {
                    textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560787u6));
                }
                android.view.View findViewById3 = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.gac);
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperBigBtnObserver", "refreshAdFollow", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                holder.f3639x46306858.requestLayout();
            }
        } else {
            jz5.l k19 = nv2.n1.f422084h.k(feed.getFeedObject().getFeedObject());
            boolean booleanValue3 = ((java.lang.Boolean) k19.f384366d).booleanValue();
            ((java.lang.Boolean) k19.f384367e).booleanValue();
            I(booleanValue3, true);
            H(infoEx, holder);
        }
        android.view.View view5 = this.f487310x;
        if (view5 != null) {
            view5.postDelayed(this.B, 5000L);
        }
    }

    @Override // ad2.h
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        zu2.q qVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.r(holder, jumpView, infoEx);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        if (c19786x6a1e2862.m76480xe2ee1ca3() != 2 || c19786x6a1e2862.m76503x92bc3c07() == 7) {
            return;
        }
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zu2.a0 a0Var = (zu2.a0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(zu2.a0.class);
        if (a0Var == null || (qVar = a0Var.f557227f) == null) {
            return;
        }
        qVar.a();
        qVar.d("big_btn_click");
    }
}
