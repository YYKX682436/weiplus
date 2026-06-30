package rb2;

/* loaded from: classes10.dex */
public abstract class m0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f475219e;

    /* renamed from: f, reason: collision with root package name */
    public final long f475220f;

    /* renamed from: g, reason: collision with root package name */
    public da2.g f475221g;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        this.f475219e = presenter;
        this.f475220f = j17;
    }

    public static void y(rb2.m0 m0Var, in5.s0 holder, so2.y0 item, android.widget.ImageView authView, android.widget.ImageView imageView, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAuthIcon");
        }
        if ((i17 & 8) != 0) {
            imageView = null;
        }
        m0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authView, "authView");
        rb2.n0 n0Var = rb2.n0.f475228a;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        n0Var.b(context, item, authView, imageView);
    }

    public final void A(java.lang.String str, in5.s0 s0Var, android.view.View view, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, int i17, int i18, int i19, yz5.l lVar) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        java.lang.String str2;
        android.widget.TextView textView;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.sd) ((r45.wf6) obj).m75936x14adae67(33)) != null) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.sd sdVar = wf6Var != null ? (r45.sd) wf6Var.m75936x14adae67(33) : null;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565376c75)) != null) {
            java.lang.String m75945x2fec8307 = sdVar != null ? sdVar.m75945x2fec8307(1) : null;
            textView.setText(m75945x2fec8307 == null || m75945x2fec8307.length() == 0 ? s0Var.f374654e.getResources().getString(i17) : sdVar != null ? sdVar.m75945x2fec8307(1) : null);
        }
        if (view != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f565375c74)) != null) {
            if (sdVar == null || (str2 = sdVar.m75945x2fec8307(0)) == null) {
                str2 = "";
            }
            if (str2.length() == 0) {
                d75.b.g(new rb2.d0(c22699x3dcdb352, i18, i19));
            } else {
                c22699x3dcdb352.m82040x7541828(s0Var.f374654e.getResources().getColor(i19, null));
                mn2.g1 g1Var = mn2.g1.f411508a;
                wo0.c b17 = g1Var.e().b(new mn2.q3(str2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), g1Var.h(mn2.f1.f411497r));
                rb2.h0 h0Var = new rb2.h0(this, c22699x3dcdb352, i18, i19);
                b17.getClass();
                b17.f529412j = h0Var;
                b17.f529411i = new rb2.i0(this, c22699x3dcdb352, i18, i19);
                b17.c(c22699x3dcdb352);
            }
        }
        if (view != null) {
            view.setOnClickListener(new rb2.j0(str, c19786x6a1e2862, lVar));
        }
    }

    public final void n(in5.s0 holder, so2.y0 item, int i17, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.dz8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "blinkView, " + i17 + ", blink:" + item.f492251v + ", hasBlink:" + item.f492253x + " isBlinking:" + item.f492254y);
        if (!item.f492254y) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!item.f492251v || item.f492253x || item.f492254y) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "begin blink animation " + i17 + ", duration:" + item.f492252w);
        item.f492253x = true;
        item.f492254y = true;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p17.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "blinkView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ILjava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p17.animate().alpha(0.0f).setDuration(1000L).setStartDelay(item.f492252w).setListener(new rb2.w(p17, item, tag, i17)).start();
    }

    public final void o(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b c15302x70e49e3b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b) holder.p(com.p314xaae8f345.mm.R.id.rrw);
        if (c15302x70e49e3b != null) {
            c15302x70e49e3b.m62114x5691fb54(new rb2.x(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) holder.p(com.p314xaae8f345.mm.R.id.c6d);
        c15258xcd50c176.m61741xc3b64c0d(4);
        c15258xcd50c176.m61734x50e5c22f(true);
        c15258xcd50c176.f(false, true);
        c15258xcd50c176.m61739x5164a7fa(holder.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560654qk, null));
        c15258xcd50c176.m61743x9bd24cae(new rb2.y(holder, this));
    }

    public final java.lang.String p(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String str3 = null;
            try {
                boolean z17 = true;
                if (!jSONObject.has(str2)) {
                    z17 = false;
                }
                if (z17) {
                    str3 = jSONObject.getString(str2);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", e17);
            }
            return str3 == null ? "" : str3;
        } catch (org.json.JSONException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderCommentConvert", e18.getMessage());
            return "";
        }
    }

    public final void q(so2.y0 item, in5.s0 holder, boolean z17) {
        jz5.f0 f0Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.ky0 m76052x34c6289e = item.f492236d.u0().m76052x34c6289e();
        java.lang.String str = (m76052x34c6289e == null || (m75945x2fec8307 = m76052x34c6289e.m75945x2fec8307(4)) == null) ? "" : m75945x2fec8307;
        r45.xk m60785x37f6d02b = item.f492236d.m60785x37f6d02b();
        android.content.Context context = holder.f374654e;
        if (m60785x37f6d02b != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String m75945x2fec83072 = m60785x37f6d02b.m75945x2fec8307(0);
            java.lang.String str2 = m75945x2fec83072 != null ? m75945x2fec83072 : "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f475219e;
            so2.g0.b(item, context, str2, nPresenter.mo56026x8fadefe3(), nPresenter.z0(), str);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            java.lang.String Z0 = item.f492236d.Z0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            so2.g0.d(item, Z0, context, str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        o3Var.Gk(context, item.f492236d.f68959xf9a02e3e, true, true, 1, z17);
    }

    public void r(in5.s0 holder, so2.y0 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        holder.f374658i = item;
    }

    public final void s(in5.s0 holder, so2.y0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.s(com.p314xaae8f345.mm.R.id.f565385c85, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.k(holder.f374654e, item.f492236d.y0() * 1000));
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0276  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(so2.y0 r19, in5.s0 r20) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.m0.t(so2.y0, in5.s0):void");
    }

    public final void u(so2.y0 item, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.h0().r()).booleanValue()) {
            holder.w(com.p314xaae8f345.mm.R.id.f567916l23, 8);
            java.util.LinkedList<r45.zb1> m76076x61be024c = item.f492236d.u0().m76076x61be024c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76076x61be024c, "getInteraction_label_list(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = m76076x61be024c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                int m75939xb282bd08 = ((r45.zb1) next).m75939xb282bd08(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
                if (m75939xb282bd08 == 1) {
                    arrayList.add(next);
                }
            }
            java.util.List V0 = kz5.n0.V0(arrayList);
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            boolean h17 = item.f492236d.h1();
            boolean f17 = item.f492236d.f1();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) V0;
            if (arrayList2.isEmpty()) {
                if (h17) {
                    r45.zb1 zb1Var = new r45.zb1();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
                    zb1Var.set(1, 1);
                    zb1Var.set(0, "<_wc_custom_link_ color=\"Brand_100\" backgroundenabled=\"0\">" + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpv) + "</_wc_custom_link_>");
                    arrayList2.add(zb1Var);
                } else if (f17) {
                    r45.zb1 zb1Var2 = new r45.zb1();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
                    zb1Var2.set(1, 1);
                    zb1Var2.set(0, "<_wc_custom_link_ color=\"#C5984C\" backgroundenabled=\"0\">" + context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cpt) + "</_wc_custom_link_>");
                    arrayList2.add(zb1Var2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) holder.p(com.p314xaae8f345.mm.R.id.ulp);
            if (c15301xb3484a3c != null) {
                int i17 = V0.isEmpty() ^ true ? 0 : 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList3.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(c15301xb3484a3c, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "refreshInteractLabel", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c15301xb3484a3c.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(c15301xb3484a3c, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "refreshInteractLabel", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (c15301xb3484a3c.getVisibility() == 0) {
                    c15301xb3484a3c.a(V0);
                }
            }
            java.util.LinkedList<r45.zb1> m76076x61be024c2 = item.f492236d.u0().m76076x61be024c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76076x61be024c2, "getInteraction_label_list(...)");
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj : m76076x61be024c2) {
                int m75939xb282bd082 = ((r45.zb1) obj).m75939xb282bd08(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3 d3Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d3.f183609e;
                if (m75939xb282bd082 == 2) {
                    arrayList4.add(obj);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c c15301xb3484a3c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15301xb3484a3c) holder.p(com.p314xaae8f345.mm.R.id.skv);
            if (c15301xb3484a3c2 != null) {
                int i18 = arrayList4.isEmpty() ^ true ? 0 : 8;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList5.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(c15301xb3484a3c2, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "refreshInteractLabel", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c15301xb3484a3c2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(c15301xb3484a3c2, "com/tencent/mm/plugin/finder/convert/comment/FinderCommentBaseConvert", "refreshInteractLabel", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (c15301xb3484a3c2.getVisibility() == 0) {
                    c15301xb3484a3c2.a(arrayList4);
                }
            }
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.ehq);
            java.util.Iterator it6 = V0.iterator();
            while (it6.hasNext()) {
                if (((r45.zb1) it6.next()).m75939xb282bd08(3) == 8) {
                    imageView.setVisibility(8);
                }
            }
            java.util.Iterator it7 = arrayList4.iterator();
            while (it7.hasNext()) {
                if (((r45.zb1) it7.next()).m75939xb282bd08(3) == 8) {
                    imageView.setVisibility(8);
                }
            }
        }
    }

    public final void v(in5.s0 holder, so2.y0 item) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hgh);
        if (textView == null) {
            return;
        }
        r45.dc1 m76077x6978e4f7 = item.f492236d.u0().m76077x6978e4f7();
        if (m76077x6978e4f7 == null || (str = m76077x6978e4f7.m75945x2fec8307(0)) == null) {
            str = "";
        }
        if (!((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.J0().r()).booleanValue() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x0437, code lost:
    
        if (r9 == null) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x015f, code lost:
    
        if ((62 == r11.m76480xe2ee1ca3()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013e, code lost:
    
        if (r0 == null) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x079f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0172  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(in5.s0 r47, so2.y0 r48, int r49) {
        /*
            Method dump skipped, instructions count: 2174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.m0.w(in5.s0, so2.y0, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if ((r6 == null || r6.length() == 0) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(in5.s0 r22, so2.y0 r23) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.m0.x(in5.s0, so2.y0):void");
    }

    public final void z(in5.s0 holder, android.view.View commentContent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentContent, "commentContent");
        so2.y0 y0Var = (so2.y0) holder.f374658i;
        java.util.ArrayList arrayList = y0Var != null ? y0Var.A : null;
        if (arrayList == null || arrayList.isEmpty()) {
            ym5.a1.h(commentContent, null);
        } else {
            ym5.a1.h(commentContent, new rb2.g0(holder));
        }
    }
}
