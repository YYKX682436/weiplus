package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public abstract class ck extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f184595e;

    /* renamed from: f, reason: collision with root package name */
    public final tu2.b f184596f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.r f184597g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f184598h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f184599i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f184600m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f184601n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z00 f184602o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.ValueAnimator f184603p;

    public /* synthetic */ ck(int i17, tu2.b bVar, int i18, yz5.r rVar, yz5.a aVar, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i19 & 2) != 0 ? new tu2.b() : bVar, (i19 & 4) != 0 ? -1 : i18, (i19 & 8) != 0 ? null : rVar, (i19 & 16) != 0 ? null : aVar);
    }

    public static /* synthetic */ void w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck ckVar, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshPostTime");
        }
        if ((i17 & 4) != 0) {
            f17 = 0.0f;
        }
        ckVar.v(s0Var, abstractC14490x69736cb5, f17);
    }

    @Override // in5.r
    public int e() {
        return this.f184595e;
    }

    public final void n(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.g4f);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f567982l91);
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        if (feed.getFeedObject().m59315x31740422()) {
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ya2.b2 contact = feed.getContact();
            if (r26.i0.q(contact != null ? contact.f69347xdec927b : null, xy2.c.e(context), false, 2, null) && feed.getFeedObject().m59335xcab26cf9()) {
                if (imageView != null) {
                    android.content.Context context2 = imageView.getContext();
                    android.content.Context context3 = imageView.getContext();
                    imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f79177x43599c6a, (context3 == null || (resources2 = context3.getResources()) == null) ? 0 : resources2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
                }
                if (linearLayout == null) {
                    return;
                }
                linearLayout.setVisibility(0);
                return;
            }
        }
        if (feed.getFeedObject().m59292xa80c944c() <= 0) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        if (imageView != null) {
            android.content.Context context4 = imageView.getContext();
            android.content.Context context5 = imageView.getContext();
            imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context4, com.p314xaae8f345.mm.R.raw.f80333xa4bb735e, (context5 == null || (resources = context5.getResources()) == null) ? 0 : resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        }
        if (linearLayout == null) {
            return;
        }
        linearLayout.setVisibility(0);
    }

    public final boolean o() {
        r45.r03 r03Var;
        r45.e21 e21Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.z00 z00Var = this.f184602o;
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((z00Var == null || (r03Var = z00Var.f192753a) == null || (e21Var = (r45.e21) r03Var.m75936x14adae67(16)) == null) ? null : e21Var.m75945x2fec8307(5));
    }

    public final void p(in5.s0 holder, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, java.lang.String username) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2;
        java.lang.String m76829x97edf6c0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        jz5.f0 f0Var = null;
        if (hc2.g0.f(feed.getFeedObject().getFeedObject(), holder, 0)) {
            nyVar = null;
        } else {
            r45.xk m59211x37f6d02b = feed.getFeedObject().m59211x37f6d02b();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            if (m59211x37f6d02b != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedRoundCornerConvert", "jumpBizProfile: bizUsername = " + m59211x37f6d02b.m75945x2fec8307(0));
                java.lang.String m75945x2fec8307 = m59211x37f6d02b.m75945x2fec8307(0);
                if (m75945x2fec8307 == null) {
                    m75945x2fec8307 = "";
                }
                android.content.Intent intent = new android.content.Intent();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar2, context, intent, feed.mo2128x1ed62e84(), null, 0, 5, false, 0, feed.w(), 192, null);
                intent.putExtra("Contact_User", m75945x2fec8307);
                intent.putExtra("Contact_Scene", 214);
                boolean z17 = true;
                intent.putExtra("biz_profile_enter_from_finder", true);
                intent.putExtra("force_get_contact", true);
                intent.putExtra("key_use_new_contact_profile", true);
                intent.putExtra("biz_profile_tab_type", 1);
                java.lang.String m76829x97edf6c02 = feed.getFeedObject().getFeedObject().m76829x97edf6c0();
                if (m76829x97edf6c02 != null && m76829x97edf6c02.length() != 0) {
                    z17 = false;
                }
                if (z17) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                    long mo2128x1ed62e84 = feed.mo2128x1ed62e84();
                    java.lang.String w17 = feed.w();
                    iyVar = iyVar2;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
                    m76829x97edf6c0 = o3Var.ek(mo2128x1ed62e84, w17, e17 != null ? e17.f216913n : 0);
                } else {
                    iyVar = iyVar2;
                    m76829x97edf6c0 = feed.getFeedObject().getFeedObject().m76829x97edf6c0();
                }
                intent.putExtra("Contact_Scene_Note", m76829x97edf6c0);
                nyVar2 = null;
                j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
                f0Var = jz5.f0.f384359a;
            } else {
                iyVar = iyVar2;
                nyVar2 = null;
            }
            if (f0Var == null) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("finder_username", username);
                nyVar = nyVar2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(iyVar, context, intent2, feed.mo2128x1ed62e84(), null, 0, 1, false, 0, feed.w(), 192, null);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(context, intent2);
            } else {
                nyVar = nyVar2;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar3 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : nyVar;
        if (nyVar3 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zi(4, feed.mo2128x1ed62e84(), nyVar3.V6(), 1, username);
        }
    }

    /* renamed from: q */
    public void h(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.e_e);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        java.lang.String n17 = item.n();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (n17 == null) {
            n17 = "";
        }
        mn2.n nVar = new mn2.n(n17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
        int intValue = ((java.lang.Number) ((jz5.n) this.f184601n).mo141623x754a37bb()).intValue();
        yz5.a aVar = this.f184598h;
        java.lang.String str2 = (aVar == null || (str = (java.lang.String) aVar.mo152xb9724478()) == null) ? "" : str;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.text.TextPaint paint = textView.getPaint();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(paint, "getPaint(...)");
        textView.setText(r(context, paint, item.getFeedObject().getNickNameSpan(), intValue, str2));
        if (item.getCurrentUsed()) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.g4l);
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.g4l);
            if (p18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        t(holder, item);
        s(holder, item);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f566484g13);
        java.lang.String m76786x8e4eb4e6 = item.getFeedObject().getFeedObject().m76786x8e4eb4e6();
        if (m76786x8e4eb4e6 == null || m76786x8e4eb4e6.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            android.text.SpannableString Ui = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ui(context, item.getFeedObject().getFeedObject().m76786x8e4eb4e6(), (int) textView2.getTextSize(), 1);
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560782u1);
            int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560796uf);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) Ui.getSpans(0, Ui.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class);
            if (z0VarArr != null) {
                for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : z0VarArr) {
                    z0Var.mo63036x52d2f021(color2, color);
                }
            }
            textView2.setText(Ui);
            textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
        }
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f566483g12)).setVisibility(8);
        pf5.z zVar = pf5.z.f435481a;
        boolean z19 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
        if (!z19) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
        p012xc85e97e9.p093xedfae76a.c1 a18 = zVar.a(activityC0065xcd7aa112).a(sc2.a8.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
        ((sc2.a8) a18).b7(item, holder, "TWO_FLOW", false, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yj(item));
        if (i17 == 0 && item.getIsOriginFeed()) {
            android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.f567079i22);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.klw)).setVisibility(0);
        } else {
            android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.f567079i22);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.klw)).setVisibility(8);
        }
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.i2f);
        if (p28 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshFriendsLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p28.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshFriendsLike", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f566598gf4);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wj(this, holder, item));
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xj(this, holder, item));
        u(holder, item);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) holder.p(com.p314xaae8f345.mm.R.id.mie);
        if (!z19) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a19 = zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd fdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fd) a19;
        if (!fdVar.f215926d || this.f184597g == null) {
            checkBox.setVisibility(8);
        } else {
            checkBox.setVisibility(0);
            boolean O6 = fdVar.O6(item.mo2128x1ed62e84());
            if (checkBox.isChecked() != O6) {
                checkBox.setChecked(O6);
            }
        }
        if (o()) {
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ebv);
            int color3 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560513mj);
            int color4 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560515ml);
            int color5 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560517mn);
            textView.setTextColor(color3);
            textView4.setTextColor(color3);
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fwn);
            if (textView5 != null) {
                textView5.setTextColor(color3);
            }
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fvz);
            if (textView6 != null) {
                textView6.setTextColor(color3);
            }
            android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.f566403fs4);
            if (p29 != null) {
                p29.setBackgroundColor(color5);
            }
            android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.lb6);
            if (p37 != null) {
                p37.setBackgroundColor(color5);
            }
            android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.l96);
            if (p38 != null) {
                p38.setBackgroundColor(color5);
            }
            holder.p(com.p314xaae8f345.mm.R.id.f567981l90).setBackgroundColor(color4);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f567982l91)).m82040x7541828(color4);
        }
    }

    public final java.lang.CharSequence r(android.content.Context context, android.text.TextPaint textPaint, android.text.SpannableString spannableString, int i17, java.lang.String str) {
        if (spannableString == null) {
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return spannableString;
        }
        int L = r26.n0.L(spannableString, str, 0, false, 6, null);
        int length = str.length() + L;
        if (L < 0) {
            return spannableString;
        }
        float measureText = textPaint.measureText("…");
        float measureText2 = textPaint.measureText(spannableString, 0, L);
        float measureText3 = textPaint.measureText(spannableString, L, length);
        float measureText4 = textPaint.measureText(spannableString, length, spannableString.length());
        float f17 = measureText2 + measureText3;
        float f18 = i17;
        if (f17 + measureText4 < f18) {
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m)), L, length, 33);
            return spannableString;
        }
        android.text.SpannableString spannableString2 = new android.text.SpannableString(str);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m)), 0, str.length(), 33);
        if (f17 + measureText < f18) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(spannableString, 0, L);
            spannableStringBuilder.append((java.lang.CharSequence) spannableString2);
            java.lang.CharSequence subSequence = spannableString.subSequence(length, spannableString.length());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subSequence, "subSequence(...)");
            spannableStringBuilder.append(android.text.TextUtils.ellipsize(subSequence, textPaint, (f18 - measureText2) - measureText3, android.text.TextUtils.TruncateAt.END));
            return spannableStringBuilder;
        }
        if (measureText3 + measureText4 + measureText < f18) {
            android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder();
            java.lang.CharSequence subSequence2 = spannableString.subSequence(0, L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subSequence2, "subSequence(...)");
            spannableStringBuilder2.append(android.text.TextUtils.ellipsize(subSequence2, textPaint, (f18 - measureText3) - measureText4, android.text.TextUtils.TruncateAt.START));
            spannableStringBuilder2.append((java.lang.CharSequence) spannableString2);
            spannableStringBuilder2.append((java.lang.CharSequence) spannableString, length, spannableString.length());
            return spannableStringBuilder2;
        }
        if (measureText + measureText3 + measureText >= f18) {
            android.text.SpannableStringBuilder spannableStringBuilder3 = new android.text.SpannableStringBuilder();
            spannableStringBuilder3.append(android.text.TextUtils.ellipsize(spannableString2, textPaint, f18, android.text.TextUtils.TruncateAt.END));
            return spannableStringBuilder3;
        }
        android.text.SpannableStringBuilder spannableStringBuilder4 = new android.text.SpannableStringBuilder();
        float f19 = (f18 - measureText3) / 2;
        java.lang.CharSequence subSequence3 = spannableString.subSequence(0, L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subSequence3, "subSequence(...)");
        java.lang.CharSequence subSequence4 = spannableString.subSequence(length, spannableString.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(subSequence4, "subSequence(...)");
        spannableStringBuilder4.append(android.text.TextUtils.ellipsize(subSequence3, textPaint, f19, android.text.TextUtils.TruncateAt.START));
        spannableStringBuilder4.append((java.lang.CharSequence) spannableString2);
        spannableStringBuilder4.append(android.text.TextUtils.ellipsize(subSequence4, textPaint, f19, android.text.TextUtils.TruncateAt.END));
        return spannableStringBuilder4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if ((r1.length() > 0) == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(in5.s0 r13, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r14) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck.s(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t(in5.s0 r11, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r12) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck.t(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }

    public void u(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2;
        r45.xk b17;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc3;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc4;
        r45.xk b18;
        android.view.ViewGroup.LayoutParams layoutParams;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2 = (com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2) holder.p(com.p314xaae8f345.mm.R.id.lb7);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.lb6);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.l96);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.e_e);
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.fuv);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f564832a85);
        android.content.Context context = holder.f374654e;
        float q17 = i65.a.q(context);
        if (!(q17 == 1.0f) && (layoutParams = imageView.getLayoutParams()) != null) {
            int dimension = (int) (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) * q17);
            layoutParams.width = dimension;
            layoutParams.height = dimension;
            imageView.setLayoutParams(layoutParams);
        }
        if (item.getFeedObject().m59328xcaae1dc7()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!item.getFeedObject().m59331xcb21161d() && !item.F0()) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p17, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(p19, arrayList7.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(p27, arrayList8.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(c22803x544dcce2.getProgress(), item.getFeedObject().m59277xa8f45ee4().m75939xb282bd08(4));
            this.f184603p = ofInt;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(ofInt);
            ofInt.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zj(c22803x544dcce2));
            android.animation.ValueAnimator valueAnimator = this.f184603p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueAnimator);
            android.animation.ValueAnimator duration = valueAnimator.setDuration(400L);
            if (duration != null) {
                duration.start();
                return;
            }
            return;
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList9.add(8);
        java.util.Collections.reverse(arrayList9);
        yj0.a.d(p18, arrayList9.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        arrayList10.add(8);
        java.util.Collections.reverse(arrayList10);
        yj0.a.d(p17, arrayList10.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = this.f184596f.f503665b;
        if (i17 == 2) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(p19, arrayList11.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(8);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(p27, arrayList12.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            return;
        }
        ya2.m1 m1Var = ya2.m1.f542044a;
        if (i17 != 3) {
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(p19, arrayList13.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            arrayList14.add(0);
            java.util.Collections.reverse(arrayList14);
            yj0.a.d(p27, arrayList14.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ya2.b2 contact = item.getContact();
            if (contact == null || (b17 = ya2.d.b(contact, false)) == null || (c19780xceb4c4dc2 = ya2.d.e(b17)) == null) {
                ya2.b2 contact2 = item.getContact();
                if (contact2 == null) {
                    c19780xceb4c4dc = null;
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                    zy2.tb.a(m1Var, imageView, c19780xceb4c4dc, 0, 4, null);
                    return;
                }
                c19780xceb4c4dc2 = contact2.f69300x731cac1b;
            }
            c19780xceb4c4dc = c19780xceb4c4dc2;
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            zy2.tb.a(m1Var, imageView, c19780xceb4c4dc, 0, 4, null);
            return;
        }
        ya2.g gVar = ya2.h.f542017a;
        java.lang.String str = item.getFeedObject().f66949xdec927b;
        r45.xk m59211x37f6d02b = item.getFeedObject().m59211x37f6d02b();
        if (!ya2.g.h(gVar, str, m59211x37f6d02b != null ? m59211x37f6d02b.m75945x2fec8307(0) : null, false, false, 12, null)) {
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            arrayList15.add(8);
            java.util.Collections.reverse(arrayList15);
            yj0.a.d(p19, arrayList15.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList15.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList16 = new java.util.ArrayList();
            arrayList16.add(8);
            java.util.Collections.reverse(arrayList16);
            yj0.a.d(p27, arrayList16.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(8);
            return;
        }
        java.util.ArrayList arrayList17 = new java.util.ArrayList();
        arrayList17.add(0);
        java.util.Collections.reverse(arrayList17);
        yj0.a.d(p19, arrayList17.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList17.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList18 = new java.util.ArrayList();
        arrayList18.add(0);
        java.util.Collections.reverse(arrayList18);
        yj0.a.d(p27, arrayList18.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderFeedRoundCornerConvert", "refreshPost", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ya2.b2 contact3 = item.getContact();
        if (contact3 == null || (b18 = ya2.d.b(contact3, false)) == null || (c19780xceb4c4dc4 = ya2.d.e(b18)) == null) {
            ya2.b2 contact4 = item.getContact();
            if (contact4 == null) {
                c19780xceb4c4dc3 = null;
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
                zy2.tb.a(m1Var, imageView, c19780xceb4c4dc3, 0, 4, null);
            }
            c19780xceb4c4dc4 = contact4.f69300x731cac1b;
        }
        c19780xceb4c4dc3 = c19780xceb4c4dc4;
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        zy2.tb.a(m1Var, imageView, c19780xceb4c4dc3, 0, 4, null);
    }

    public final void v(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        long m75939xb282bd08 = item.getFeedObject().m59258xd0557130() != null ? r0.m75939xb282bd08(6) : 0L;
        if (m75939xb282bd08 == 0) {
            m75939xb282bd08 = item.getFeedObject().m59220x3fdd41df() * 1000;
        }
        if (m75939xb282bd08 <= 0 || !item.getFeedObject().m59331xcb21161d()) {
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.l1s);
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.l1s);
        if (textView2 != null) {
            textView2.setVisibility(0);
            android.content.Context context = holder.f374654e;
            textView2.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.k(context, m75939xb282bd08));
            if (f17 > 0.0f) {
                textView2.setTextSize(0, f17 * i65.a.q(context));
            }
        }
    }

    public final void x(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.i1g);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.i1n);
        textView.setVisibility(item.getFeedObject().m59284xbb830663() > 0 ? 0 : 8);
        imageView.setVisibility(item.getFeedObject().m59284xbb830663() <= 0 ? 8 : 0);
        android.content.Context context = holder.f374654e;
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79731x8858d8c4, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        textView.setText(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.i(item.getFeedObject().m59284xbb830663()));
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
    }

    public ck(int i17, tu2.b itemViewConfig, int i18, yz5.r rVar, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemViewConfig, "itemViewConfig");
        this.f184595e = i17;
        this.f184596f = itemViewConfig;
        this.f184597g = rVar;
        this.f184598h = aVar;
        this.f184599i = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ak.f184424d);
        this.f184600m = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vj.f186325d);
        this.f184601n = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bk(this));
    }
}
