package h93;

/* loaded from: classes11.dex */
public final class r extends h93.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f361259g;

    /* renamed from: h, reason: collision with root package name */
    public final int f361260h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f361259g = "MicroMsg.RecommendLabelPanel";
        this.f361260h = 1;
    }

    @Override // h93.c
    public int P6() {
        return this.f361260h;
    }

    @Override // h93.c
    public java.lang.String R6() {
        return this.f361259g;
    }

    @Override // h93.c
    public void S6() {
        java.util.List list;
        super.S6();
        android.view.View V6 = V6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById = V6().findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.TextView) findViewById).setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573912o75);
        O6().e();
        O6().m78886xd6475ca5(2);
        java.lang.String str = this.f361227d;
        if (str != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
            if (wi6 != null) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                p75.d dVar = dm.g2.f318565s;
                linkedList.add(dVar.u());
                linkedList.add(dm.g2.f318563q.u());
                p75.i0 h17 = dm.g2.f318560n.h(dm.g2.f318562p);
                p75.y yVar = (p75.y) new p75.z0(dVar.z()).c(dVar.q(0));
                yVar.f(dm.g2.f318564r.i(0));
                h17.f434190d = yVar;
                h17.f434192f = linkedList;
                java.util.List l17 = h17.a().l(wi6.f276535d);
                list = kz5.n0.V(((java.util.ArrayList) l17).isEmpty() ? new java.util.ArrayList() : new java.util.ArrayList(l17));
            } else {
                list = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load labelsByLastUse: ");
            sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f361259g, sb6.toString());
            if (list == null || list.isEmpty()) {
                list = kz5.p0.f395529d;
            }
            if (true ^ list.isEmpty()) {
                O6().r(Q6().O6(), kz5.n0.K0(list, 5));
                O6().v(this.f361228e, str, "2", 33926);
                android.view.View V62 = V6();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "initRecommendLabels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "initRecommendLabels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    @Override // h93.c
    public void T6(java.util.ArrayList selectedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedList, "selectedList");
        O6().m79144xad8cef56(selectedList);
    }

    @Override // h93.c
    public void U6(java.lang.String keyword, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keyword, "keyword");
        if (list != null) {
            android.view.View V6 = V6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        boolean z17 = O6().m79121x4cc68f0b() > 0;
        android.view.View V62 = V6();
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/RecommendLabelPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public android.view.View V6() {
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.u8k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        return mo144222x4ff8c0f0;
    }

    @Override // h93.c
    /* renamed from: W6, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130 O6() {
        android.view.View findViewById = V6().findViewById(com.p314xaae8f345.mm.R.id.u8i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44.C16180x2cdd3130) findViewById;
    }
}
