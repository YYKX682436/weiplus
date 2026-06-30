package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class vk0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l implements he2.b {

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f196317p;

    /* renamed from: q, reason: collision with root package name */
    public long f196318q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f196319r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f196320s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f196321t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f196322u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f196323v;

    /* renamed from: w, reason: collision with root package name */
    public int f196324w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f196325x;

    static {
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lk0.f194942d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vk0(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusMonitor, "statusMonitor");
        this.f196317p = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uk0(root, this));
        this.f196319r = true;
        this.f196320s = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.tk0(this));
        this.f196321t = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.pk0(root, this));
        this.f196322u = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qk0(root));
        this.f196323v = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nk0(this));
        if (x0()) {
            i17 = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * 0.22d);
            com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } else {
            i17 = (int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y * 0.25d);
            com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469 c14364x8eb8469 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469) root.findViewById(com.p314xaae8f345.mm.R.id.s5t);
        c14364x8eb8469.b(i17, false);
        c14364x8eb8469.m57536x1ff432c7(true);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 u17 = u1();
        u17.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14273x154f5ffd(u17.getRootView().getContext()));
        u17.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kk0(root));
        this.f196325x = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean G() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mk0.f195058a[status.ordinal()] == 1) {
            this.f196325x = !(bundle != null ? bundle.getBoolean("PARAM_IS_ENTERING_COMMENT") : false);
        }
    }

    @Override // he2.b
    public android.view.View W() {
        return this.f446856d;
    }

    @Override // he2.b
    public void j(boolean z17) {
        df2.xw xwVar = (df2.xw) U0(df2.xw.class);
        if (xwVar == null) {
            return;
        }
        xwVar.f313348s = z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean k() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.po0
    public boolean r() {
        return x0() || this.f196325x;
    }

    public final bm2.a8 t1() {
        return (bm2.a8) ((jz5.n) this.f196323v).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 u1() {
        java.lang.Object mo141623x754a37bb = this.f196317p.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) mo141623x754a37bb;
    }

    public final void v1(java.util.List liveAppMsgList) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveAppMsgList, "liveAppMsgList");
        bm2.a8 t17 = t1();
        t17.getClass();
        java.util.ArrayList arrayList = t17.f103312m;
        int size = arrayList.size();
        arrayList.addAll(liveAppMsgList);
        t17.m8149x8b456734(size);
        if (this.f196319r) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 u17 = u1();
            int mo1894x7e414b06 = t1().mo1894x7e414b06() - 1;
            if (mo1894x7e414b06 < 0) {
                mo1894x7e414b06 = 0;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(mo1894x7e414b06));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(u17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin", "onReceiveNewMsg", "(Ljava/util/List;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            u17.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(u17, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin", "onReceiveNewMsg", "(Ljava/util/List;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            this.f196324w = 0;
            return;
        }
        android.view.View view = (android.view.View) ((jz5.n) this.f196321t).mo141623x754a37bb();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin", "onReceiveNewMsg", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorShopMsgPlugin", "onReceiveNewMsg", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int size2 = this.f196324w + liveAppMsgList.size();
        this.f196324w = size2;
        android.view.ViewGroup viewGroup = this.f446856d;
        if (size2 <= 99) {
            string = java.lang.String.valueOf(size2);
        } else {
            string = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        }
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f196322u).mo141623x754a37bb();
        java.lang.String string2 = viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{string}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        textView.setText(format);
    }

    @Override // he2.b
    public void w(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469 c14364x8eb8469 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14364x8eb8469) this.f446856d.findViewById(com.p314xaae8f345.mm.R.id.s5t);
        c14364x8eb8469.b(c14364x8eb8469.getHeight(), false);
    }

    public final void w1(r45.d54 status, java.lang.String clientMsgId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientMsgId, "clientMsgId");
        bm2.a8 t17 = t1();
        t17.getClass();
        java.util.ArrayList arrayList = t17.f103312m;
        java.util.Iterator it = arrayList.iterator();
        boolean z17 = false;
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dk2.zf) it.next()).v(), clientMsgId)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = arrayList.get(i17);
            dk2.dg dgVar = obj instanceof dk2.dg ? (dk2.dg) obj : null;
            if (dgVar != null) {
                dgVar.t(status);
            }
            t17.m8147xed6e4d18(i17);
        }
    }
}
