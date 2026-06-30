package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class yd extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 implements zy2.e7 {

    /* renamed from: f, reason: collision with root package name */
    public final so2.c f218087f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f218088g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218089h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f218090i;

    /* renamed from: m, reason: collision with root package name */
    public xc2.p0 f218091m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f218092n;

    /* renamed from: o, reason: collision with root package name */
    public az2.f f218093o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f218094p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.od f218095q;

    /* renamed from: r, reason: collision with root package name */
    public db5.d5 f218096r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f218097s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f218087f = so2.c.f491814h;
        this.f218094p = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.md.f216696d);
        this.f218095q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.od(this);
        this.f218097s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.xd(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void O6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        db5.d5 d5Var = this.f218096r;
        if (d5Var != null) {
            pm0.v.C(g7());
            d5Var.dismiss();
        }
        this.f218096r = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void P6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        java.lang.Object obj = holder.f374658i;
        java.lang.Object obj2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null || (list = (java.util.List) f7().U6(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb()) == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) next).m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            boolean z17 = false;
            if (!m76521x7528c3fb.isEmpty()) {
                java.util.Iterator<T> it6 = m76521x7528c3fb.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    r45.wf6 wf6Var = (r45.wf6) it6.next();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
                    if (h7(wf6Var)) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (z17) {
                obj2 = next;
                break;
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) obj2;
        if (c19786x6a1e2862 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r1.f184026a.d(c19786x6a1e2862.m76480xe2ee1ca3(), abstractC14490x69736cb5.mo2128x1ed62e84());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void Q6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        U6(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public android.view.View R6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f566416qk1);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.p314xaae8f345.mm.R.id.f566417qk2);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicLikeUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicLikeUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public so2.c S6() {
        return this.f218087f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void W6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.p(com.p314xaae8f345.mm.R.id.f566416qk1) != null) {
            super.W6(holder);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return d7(holder);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c7(in5.s0 r13) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.yd.c7(in5.s0):void");
    }

    public final boolean d7(in5.s0 s0Var) {
        java.util.List list;
        java.lang.Object obj = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null || (list = (java.util.List) f7().U6(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb()) == null) {
            return false;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 e76 = e7(abstractC14490x69736cb5, list);
        boolean z17 = e76 != null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isNeedShow: canShowCarousel=");
        sb6.append(z17);
        sb6.append(", businessType=");
        sb6.append(e76 != null ? java.lang.Integer.valueOf(e76.m76480xe2ee1ca3()) : null);
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMusicLikeUIC", sb6.toString());
        return z17;
    }

    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 e7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.util.List list) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) next).m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            if (!m76521x7528c3fb.isEmpty()) {
                for (r45.wf6 wf6Var : m76521x7528c3fb) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
                    if (h7(wf6Var)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(next);
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) kz5.n0.Z(arrayList);
        if (c19786x6a1e2862 == null) {
            return null;
        }
        if (abstractC14490x69736cb5.getCurrentCarouselItemType() != so2.c.f491814h && !com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r1.f184026a.a(c19786x6a1e2862.m76480xe2ee1ca3(), java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()))) {
            z17 = false;
        }
        if (z17) {
            return c19786x6a1e2862;
        }
        return null;
    }

    public final xc2.k0 f7() {
        return (xc2.k0) ((jz5.n) this.f218094p).mo141623x754a37bb();
    }

    public final java.lang.Runnable g7() {
        return (java.lang.Runnable) ((jz5.n) this.f218097s).mo141623x754a37bb();
    }

    public final boolean h7(r45.wf6 wf6Var) {
        r45.d60 d60Var = (r45.d60) wf6Var.m75936x14adae67(31);
        java.lang.Integer valueOf = d60Var != null ? java.lang.Integer.valueOf(d60Var.m75939xb282bd08(5)) : null;
        return wf6Var.m75939xb282bd08(2) == 23 && wf6Var.m75939xb282bd08(1) == 16 && ((valueOf != null && valueOf.intValue() == 2) || ((valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 6)));
    }

    public final void i7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, xc2.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, yz5.a aVar) {
        java.lang.Object obj;
        r45.d60 d60Var;
        android.view.View inflate = android.view.View.inflate(m80379x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570578dh5, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.fth);
        int i17 = 0;
        if (str3 == null || str3.length() == 0) {
            if (textView != null) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.lou);
            }
        } else if (textView != null) {
            textView.setText(str3);
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qcq);
        if (str4 == null || str4.length() == 0) {
            if (textView2 != null) {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.lov);
            }
        } else if (textView2 != null) {
            textView2.setText(str4);
        }
        db5.d5 d5Var = this.f218096r;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        db5.d5 d5Var2 = new db5.d5(inflate);
        d5Var2.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576349x2);
        this.f218096r = d5Var2;
        inflate.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ud(aVar, this, abstractC14490x69736cb5));
        db5.d5 d5Var3 = this.f218096r;
        if (d5Var3 != null) {
            d5Var3.setWidth(-1);
        }
        db5.d5 d5Var4 = this.f218096r;
        if (d5Var4 != null) {
            d5Var4.setHeight(-2);
        }
        int dimensionPixelSize = m80379x76847179().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        db5.d5 d5Var5 = this.f218096r;
        if (d5Var5 != null) {
            d5Var5.showAtLocation(m80379x76847179().getWindow().getDecorView(), 80, 0, dimensionPixelSize);
        }
        android.content.Context context = inflate.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(abstractC14490x69736cb5.mo2128x1ed62e84(), abstractC14490x69736cb5.w(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.ra.class))).V6().m75939xb282bd08(5));
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        lVarArr[1] = new jz5.l("songid", str);
        lVarArr[2] = new jz5.l("audioid", str2);
        lVarArr[3] = new jz5.l("business_type", java.lang.Integer.valueOf(p0Var.f534767a.m76480xe2ee1ca3()));
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            java.lang.Object next = it.next();
            r45.wf6 wf6Var = (r45.wf6) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
            if (h7(wf6Var)) {
                obj = next;
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj;
        if (wf6Var2 != null && (d60Var = (r45.d60) wf6Var2.m75936x14adae67(31)) != null) {
            i17 = d60Var.m75939xb282bd08(5);
        }
        lVarArr[4] = new jz5.l("btntype", java.lang.Integer.valueOf(i17));
        lVarArr[5] = new jz5.l("session_buffer", ek6);
        hc2.v0.e(inflate, "like_and_song_sheet", 0, 0, false, true, kz5.c1.k(lVarArr), null, 78, null);
        pm0.v.C(g7());
        pm0.v.U(5000L, g7());
    }

    public final void l7(in5.s0 s0Var) {
        java.util.List list;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 e76;
        r45.d60 d60Var;
        java.lang.Object obj = s0Var.f374658i;
        java.lang.Object obj2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null || (list = (java.util.List) f7().U6(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb()) == null || (e76 = e7(abstractC14490x69736cb5, list)) == null) {
            return;
        }
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = e76.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            r45.wf6 wf6Var = (r45.wf6) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
            if (h7(wf6Var)) {
                obj2 = next;
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj2;
        if (wf6Var2 == null || (d60Var = (r45.d60) wf6Var2.m75936x14adae67(31)) == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.b09);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.b0o);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.b1l);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMusicLikeUIC", "[updateBtnStatus] isLikeSong:" + this.f218088g + " isFavAndGuidePost:" + this.f218089h);
        if (this.f218088g) {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80084xebd378da);
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.m82040x7541828(m158354x19263085().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abx));
            }
            if (textView != null) {
                textView.setText(this.f218089h ? m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572944li4) : m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0m));
            }
            if (textView != null) {
                textView.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b));
            }
        } else {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            if (textView != null) {
                java.lang.String m75945x2fec8307 = d60Var.m75945x2fec8307(4);
                if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                    m75945x2fec8307 = m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.erk);
                }
                textView.setText(m75945x2fec8307);
            }
            if (textView != null) {
                textView.setTextColor(m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77916xe61cad96));
            }
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(0);
        float b17 = i65.a.b(m80379x76847179(), 4);
        gradientDrawable.setCornerRadii(new float[]{b17, b17, b17, b17, b17, b17, b17, b17});
        gradientDrawable.setColor(!this.f218088g ? m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh) : m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77667x8113c229));
        if (viewGroup == null) {
            return;
        }
        viewGroup.setBackground(gradientDrawable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        g7();
        pm0.v.C(g7());
        db5.d5 d5Var = this.f218096r;
        if (d5Var != null) {
            d5Var.dismiss();
        }
        this.f218096r = null;
    }
}
