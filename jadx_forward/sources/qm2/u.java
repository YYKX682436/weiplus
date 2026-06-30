package qm2;

/* loaded from: classes3.dex */
public final class u extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f446285d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f446286e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f446287f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f446288g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14393xabbdae9d f446289h;

    /* renamed from: i, reason: collision with root package name */
    public gk2.e f446290i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f446291m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f446291m = jz5.h.b(new qm2.n(activity, this));
    }

    public final void O6(boolean z17) {
        gk2.e eVar;
        r45.h32 h32Var;
        gk2.e eVar2 = this.f446290i;
        if (eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).a8()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "setLiveNoticeInfo: has started live");
            return;
        }
        gk2.e eVar3 = this.f446290i;
        r45.c32 c32Var = eVar3 != null ? ((mm2.c1) eVar3.a(mm2.c1.class)).f410410r6 : null;
        gk2.e eVar4 = this.f446290i;
        r45.h32 z76 = eVar4 != null ? ((mm2.c1) eVar4.a(mm2.c1.class)).z7() : null;
        if (z17 && (eVar = this.f446290i) != null && (h32Var = ((mm2.c1) eVar.a(mm2.c1.class)).f410349h5) != null) {
            r45.q65 q65Var = (r45.q65) h32Var.m75936x14adae67(10);
            if (q65Var != null && q65Var.m75933x41a8a7f2(0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "setLiveNoticeInfo: is pay notice");
                z76 = h32Var;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setLiveNoticeInfo: canChangeWhiteList=");
        sb6.append(z17);
        sb6.append(", noticeId=");
        sb6.append(z76 != null ? z76.m75945x2fec8307(4) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, sb6.toString());
        if (z76 == null) {
            android.view.View view = this.f446285d;
            if (!(view != null && view.getVisibility() == 0)) {
                if ((c32Var != null ? c32Var.m75939xb282bd08(0) : 0) != 0) {
                    android.view.View view2 = this.f446285d;
                    if (view2 != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.view.View view3 = this.f446287f;
                    if (view3 != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(8);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    android.widget.TextView textView = this.f446286e;
                    if (textView == null) {
                        return;
                    }
                    android.content.res.Resources resources = m80379x76847179().getResources();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    objArr[0] = c32Var != null ? java.lang.Integer.valueOf(c32Var.m75939xb282bd08(0)) : null;
                    textView.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.noi, objArr));
                    return;
                }
            }
            android.view.View view4 = this.f446285d;
            if (view4 == null) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.lang.String m75945x2fec8307 = z76.m75945x2fec8307(4);
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) || (z76.m75939xb282bd08(6) & 1) != 1) {
            gk2.e eVar5 = this.f446290i;
            mm2.c1 c1Var = eVar5 != null ? (mm2.c1) eVar5.a(mm2.c1.class) : null;
            if (c1Var != null) {
                c1Var.f410349h5 = null;
                c1Var.f410343g5 = null;
            }
            android.view.View view5 = this.f446285d;
            if (view5 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new qm2.s(z76, this, z17, null), 3, null);
        android.view.View view6 = this.f446285d;
        if (view6 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/viewmodel/startlive/FinderStartLiveNoticeUIC", "setLiveNoticeInfo", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var2 = ml2.c1.f408858e;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", "1");
        jSONObject.put("notice_id", java.lang.String.valueOf(z76.m75945x2fec8307(4)));
        zy2.zb.j5(zbVar, 51L, jSONObject.toString(), null, 4, null);
        android.view.View view7 = this.f446285d;
        if (view7 != null) {
            view7.setOnClickListener(new qm2.t(this, z76, c32Var));
        }
    }
}
