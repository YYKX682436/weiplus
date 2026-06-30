package xe5;

/* loaded from: classes10.dex */
public final class i implements xe5.h0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f535573a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f535574b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f535575c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f535576d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f535577e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f535578f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f535579g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f535580h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f535581i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f535582j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f535583k;

    /* renamed from: l, reason: collision with root package name */
    public android.widget.TextView f535584l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f535585m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f535586n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f535587o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f535588p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f535589q;

    public i() {
        ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).getClass();
        this.f535589q = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.V3).mo141623x754a37bb()).r()).intValue() == 1;
    }

    public void a(boolean z17) {
        android.view.View view = this.f535573a;
        if (view == null) {
            return;
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "hideOrShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "hideOrShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b(int i17, long j17, java.lang.String tipsId, java.lang.String url, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsId, "tipsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        if (i18 == 1) {
            c(i17, j17, tipsId, url, qs5.n.f447980g, null);
        } else {
            c(i17, j17, tipsId, url, qs5.n.f447981h, null);
        }
    }

    public final void c(int i17, long j17, java.lang.String tipsId, java.lang.String url, qs5.n state, r45.nw1 nw1Var) {
        java.lang.Integer num;
        r45.g92 g92Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsId, "tipsId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        android.view.View view = this.f535580h;
        if (view == null) {
            num = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            num = 0;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f535580h;
        android.widget.ImageView imageView = view2 != null ? (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.fs7) : null;
        android.view.View view3 = this.f535580h;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.f4x) : null;
        android.view.View view4 = this.f535580h;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.f7y) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshLiveWidget source:");
        sb6.append(i17);
        sb6.append(", liveId:");
        sb6.append(j17);
        sb6.append(", tipsId:");
        sb6.append(tipsId);
        sb6.append(" state:");
        sb6.append(state);
        sb6.append(",url empty:");
        sb6.append(url.length() == 0);
        sb6.append('!');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNotifyTmplV1", sb6.toString());
        if (!(url.length() > 0)) {
            android.view.View view5 = this.f535580h;
            if (view5 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        int ordinal = state.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                java.lang.Integer num2 = num;
                if (!((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(nw1Var, "tmp")) {
                    i95.m c17 = i95.n0.c(vd2.i5.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    vd2.i5.l8((vd2.i5) c17, url, imageView, null, 4, null);
                    if (findViewById != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                        arrayList3.add(num2);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (findViewById2 != null) {
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    r45.g92 g92Var2 = new r45.g92();
                    g92Var2.set(38, java.lang.Integer.valueOf(nw1Var != null ? nw1Var.m75939xb282bd08(37) : 0));
                    i95.m c18 = i95.n0.c(s40.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    s40.w0.O1((s40.w0) c18, findViewById, qs5.n.f447978e, false, g92Var2, 4, null);
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hk(findViewById2, qs5.n.f447981h, true, g92Var2);
                    return;
                }
                i95.m c19 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                vd2.i5.l8((vd2.i5) c19, url, imageView, null, 4, null);
                if (findViewById != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(num2);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                i95.m c27 = i95.n0.c(s40.w0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
                qs5.n nVar = qs5.n.f447978e;
                s40.w0.g6((s40.w0) c27, findViewById2, nVar, false, null, 12, null);
                i95.m c28 = i95.n0.c(s40.w0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c28, "getService(...)");
                s40.w0.O1((s40.w0) c28, findViewById, nVar, false, null, 4, null);
                return;
            }
            if (ordinal != 3) {
                i95.m c29 = i95.n0.c(vd2.i5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c29, "getService(...)");
                java.lang.Integer num3 = num;
                vd2.i5.l8((vd2.i5) c29, url, imageView, null, 4, null);
                if (findViewById != null) {
                    java.util.ArrayList arrayList7 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
                    arrayList7.add(8);
                    java.util.Collections.reverse(arrayList7);
                    yj0.a.d(findViewById, arrayList7.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (findViewById2 != null) {
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
                    arrayList8.add(num3);
                    java.util.Collections.reverse(arrayList8);
                    yj0.a.d(findViewById2, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                i95.m c37 = i95.n0.c(s40.w0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c37, "getService(...)");
                s40.w0.g6((s40.w0) c37, findViewById2, qs5.n.f447981h, false, null, 12, null);
                i95.m c38 = i95.n0.c(s40.w0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c38, "getService(...)");
                s40.w0.O1((s40.w0) c38, findViewById, qs5.n.f447980g, false, null, 4, null);
                return;
            }
        }
        java.lang.Integer num4 = num;
        i95.m c39 = i95.n0.c(vd2.i5.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c39, "getService(...)");
        vd2.i5.l8((vd2.i5) c39, url, imageView, null, 4, null);
        if (findViewById != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
            arrayList9.add(num4);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById, arrayList9.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById2, arrayList10.toArray(), "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/viewitems/fnderlivenotifytmpl/FinderLiveNotifyTmplV1$TmplHolderV1", "refreshLiveWidget", "(IJLjava/lang/String;Ljava/lang/String;Lcom/tencent/plugin/finder/live/api/constants/ConstantsFinderLive$LiveCardState;Lcom/tencent/mm/protocal/protobuf/FinderLiveInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (nw1Var != null) {
            g92Var = new r45.g92();
            g92Var.set(38, java.lang.Integer.valueOf(nw1Var.m75939xb282bd08(37)));
        } else {
            g92Var = null;
        }
        i95.m c47 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c47, "getService(...)");
        s40.w0.O1((s40.w0) c47, findViewById, state, false, g92Var, 4, null);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hk(findViewById2, qs5.n.f447981h, true, g92Var);
    }
}
