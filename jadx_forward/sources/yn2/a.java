package yn2;

/* loaded from: classes2.dex */
public final class a extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public long f545493g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yn2.m f545494h;

    public a(yn2.m mVar) {
        this.f545494h = mVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof ec2.f) || ((event instanceof fc2.s) && ((fc2.s) event).f342513d == 2) || (event instanceof fc2.t);
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof fc2.t) {
            yn2.m mVar = this.f545494h;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = mVar.f545534o;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba42 != null ? c1163xf1deaba42.mo7946xf939df19() : null;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
            if (c22848x6ddd90cf == null) {
                return;
            }
            fc2.t tVar = (fc2.t) ev6;
            int i17 = 0;
            int i18 = tVar.f342518d;
            if (i18 != 6) {
                if (i18 == 10) {
                    if (((in5.s0) in5.n0.Y(c22848x6ddd90cf, tVar.f342525k, false, 2, null)) != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", "on tab invisible lastCenterFeedId:" + this.f545493g);
                        return;
                    }
                    return;
                }
                if (i18 != 9 || (c1163xf1deaba4 = mVar.f545534o) == null) {
                    return;
                }
                int childCount = c1163xf1deaba4.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    android.view.View childAt = c1163xf1deaba4.getChildAt(i19);
                    if (!(childAt != null && childAt.getVisibility() == 0) && childAt != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$1$1", "onEventHappen", "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/finder/megavideo/topstory/flow/convert/MegaVideoCardConvert$1$1", "onEventHappen", "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                return;
            }
            long j17 = this.f545493g;
            long j18 = tVar.f342525k;
            if (j17 != j18) {
                this.f545493g = j18;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e.e eVar = mVar.f545527e;
                java.util.Iterator it = ((xn2.p0) eVar).j().m56388xcaeb60d0().iterator();
                java.util.LinkedList linkedList = null;
                java.util.LinkedList linkedList2 = null;
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    int i27 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    so2.j5 j5Var = (so2.j5) next;
                    int i28 = tVar.f342527m;
                    if (i17 != i28 && java.lang.Math.abs(i28 - i17) <= 2 && (j5Var instanceof zn2.a)) {
                        if (linkedList == null) {
                            linkedList = new java.util.LinkedList();
                        }
                        linkedList.add(j5Var);
                        if (linkedList2 == null) {
                            linkedList2 = new java.util.LinkedList();
                        }
                        linkedList2.add(java.lang.Integer.valueOf(i17));
                    }
                    i17 = i27;
                }
                android.app.Activity activity = ((xn2.p0) eVar).f537076a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity : null;
                if (linkedList != null && activityC0065xcd7aa112 != null) {
                    vn2.i iVar = vn2.i.f519836a;
                    p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activityC0065xcd7aa112).a(um3.b.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    pf5.e.m158343xd39de650((pf5.e) a17, null, null, new vn2.g(linkedList, null), 3, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MegaVideoCardConvert", "lastCenterFeedId=" + pm0.v.u(this.f545493g) + ", new centerFeedId=" + pm0.v.u(tVar.f342525k) + ",center position=" + tVar.f342527m + ",preload position=" + linkedList2);
            }
        }
    }

    @Override // fc2.d
    public void H0() {
    }
}
