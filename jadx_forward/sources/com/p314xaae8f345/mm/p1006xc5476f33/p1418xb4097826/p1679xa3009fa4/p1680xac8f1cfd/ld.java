package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ld extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0 implements zy2.d7 {

    /* renamed from: f, reason: collision with root package name */
    public final so2.c f216584f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f216585g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f216586h;

    /* renamed from: i, reason: collision with root package name */
    public da2.g f216587i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f216584f = so2.c.f491813g;
        this.f216585g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gd(this));
        this.f216586h = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hd.f216153d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void O6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        da2.g gVar = this.f216587i;
        if (gVar != null) {
            gVar.j();
        }
        this.f216587i = null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void P6(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0 animationType) {
        java.util.List list;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationType, "animationType");
        U6(holder);
        java.lang.Object obj = holder.f374658i;
        java.lang.Object obj2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null || (list = (java.util.List) ((xc2.k0) ((jz5.n) this.f216586h).mo141623x754a37bb()).U6(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb()) == null) {
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
            if (!m76521x7528c3fb.isEmpty()) {
                for (r45.wf6 wf6Var : m76521x7528c3fb) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
                    if (f7(wf6Var)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
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
    public android.view.View R6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.fte);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.p314xaae8f345.mm.R.id.ftf);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicFollowPatUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMusicFollowPatUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public so2.c S6() {
        return this.f216584f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void W6(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (holder.p(com.p314xaae8f345.mm.R.id.fte) != null) {
            super.W6(holder);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return d7(holder) && R6(holder) != null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.mb0
    public void c7(in5.s0 holder) {
        xc2.p0 e76;
        r45.d60 d60Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.c7(holder);
        U6(holder);
        java.lang.Object obj = holder.f374658i;
        java.lang.Object obj2 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null || (e76 = e7(abstractC14490x69736cb5)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = e76.f534767a;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            r45.wf6 wf6Var = (r45.wf6) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
            if (f7(wf6Var)) {
                obj2 = next;
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj2;
        if (wf6Var2 == null || (d60Var = (r45.d60) wf6Var2.m75936x14adae67(31)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notify: show, biz_type=");
        sb6.append(c19786x6a1e2862.m76480xe2ee1ca3());
        sb6.append(", wording=");
        boolean z17 = true;
        sb6.append(d60Var.m75945x2fec8307(1));
        sb6.append(", desc=");
        sb6.append(d60Var.m75945x2fec8307(2));
        sb6.append(", feedId=");
        sb6.append(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedMusicFollowPatUIC", sb6.toString());
        android.view.View R6 = R6(holder);
        if (R6 == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) R6.findViewById(com.p314xaae8f345.mm.R.id.k0v);
        if (textView != null) {
            textView.setText(d60Var.m75945x2fec8307(1));
        }
        android.widget.TextView textView2 = (android.widget.TextView) R6.findViewById(com.p314xaae8f345.mm.R.id.jzt);
        if (textView2 != null) {
            java.lang.String m75945x2fec8307 = d60Var.m75945x2fec8307(2);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (z17) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(d60Var.m75945x2fec8307(2));
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) R6.findViewById(com.p314xaae8f345.mm.R.id.b1l);
        if (textView3 != null) {
            textView3.setText(d60Var.m75945x2fec8307(4));
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d e17 = g1Var.e();
        java.lang.String m75945x2fec83072 = d60Var.m75945x2fec8307(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90 y90Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f;
        mn2.q3 q3Var = new mn2.q3(m75945x2fec83072, y90Var);
        mn2.f1 f1Var = mn2.f1.f411497r;
        wo0.c b17 = e17.b(q3Var, g1Var.h(f1Var));
        android.view.View findViewById = R6.findViewById(com.p314xaae8f345.mm.R.id.f567573jz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        b17.c((android.widget.ImageView) findViewById);
        wo0.c b18 = g1Var.e().b(new mn2.q3(d60Var.m75945x2fec8307(3), y90Var), g1Var.h(f1Var));
        android.view.View findViewById2 = R6.findViewById(com.p314xaae8f345.mm.R.id.b0o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        b18.c((android.widget.ImageView) findViewById2);
    }

    public final boolean d7(in5.s0 s0Var) {
        java.util.List list;
        java.lang.Object obj = s0Var.f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
        if (abstractC14490x69736cb5 == null || (list = (java.util.List) ((xc2.k0) ((jz5.n) this.f216586h).mo141623x754a37bb()).U6(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb()) == null) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) next).m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            if (!m76521x7528c3fb.isEmpty()) {
                for (r45.wf6 wf6Var : m76521x7528c3fb) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
                    if (f7(wf6Var)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(next);
            }
        }
        return (arrayList.isEmpty() ^ true) && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r1.f184026a.a(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) kz5.n0.X(arrayList)).m76480xe2ee1ca3(), null);
    }

    public final xc2.p0 e7(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        boolean z17;
        java.util.List list = (java.util.List) ((xc2.k0) ((jz5.n) this.f216586h).mo141623x754a37bb()).U6(abstractC14490x69736cb5.mo2128x1ed62e84()).mo3195x754a37bb();
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) obj).m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            if (!m76521x7528c3fb.isEmpty()) {
                for (r45.wf6 wf6Var : m76521x7528c3fb) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(wf6Var);
                    if (f7(wf6Var)) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            if (z17) {
                arrayList.add(obj);
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) kz5.n0.Z(arrayList);
        if (c19786x6a1e2862 == null) {
            return null;
        }
        xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
        p0Var.f534777f = abstractC14490x69736cb5;
        p0Var.f534790s = 23;
        p0Var.f534789r = 16;
        return p0Var;
    }

    public final boolean f7(r45.wf6 wf6Var) {
        if (wf6Var.m75939xb282bd08(2) != 23 || wf6Var.m75939xb282bd08(1) != 16) {
            return false;
        }
        r45.d60 d60Var = (r45.d60) wf6Var.m75936x14adae67(31);
        if (!(d60Var != null && d60Var.m75939xb282bd08(5) == 1)) {
            r45.d60 d60Var2 = (r45.d60) wf6Var.m75936x14adae67(31);
            if (!(d60Var2 != null && d60Var2.m75939xb282bd08(5) == 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        da2.g gVar = this.f216587i;
        if (gVar != null) {
            gVar.j();
        }
        this.f216587i = null;
    }
}
