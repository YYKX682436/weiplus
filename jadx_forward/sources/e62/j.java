package e62;

/* loaded from: classes15.dex */
public final class j extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public l52.f f331301d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f331302e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f331303f = "";

    /* renamed from: g, reason: collision with root package name */
    public long f331304g;

    public final void b(boolean z17) {
        java.lang.ref.WeakReference weakReference;
        android.view.ViewGroup viewGroup;
        l52.f fVar = this.f331301d;
        if (fVar == null || (weakReference = fVar.f398137x) == null || (viewGroup = (android.view.ViewGroup) weakReference.get()) == null) {
            return;
        }
        fVar.a(viewGroup, z17 ? 0 : fVar.f398138y, viewGroup.getChildCount());
        fVar.f398136w = true;
    }

    public final void c(java.lang.String sessionPageName, long j17) {
        android.app.Activity activity;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionPageName, "sessionPageName");
        e(sessionPageName, j17);
        java.lang.ref.WeakReference weakReference = this.f331302e;
        if (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) {
            return;
        }
        l52.f fVar = this.f331301d;
        if (fVar != null) {
            fVar.n(0, activity);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecycleViewFeedMonitor", "curSessionPage: " + this.f331303f + ", startMonitor: " + this.f331301d);
    }

    public final void d() {
        l52.f fVar = this.f331301d;
        if (fVar != null) {
            fVar.n(1, null);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecycleViewFeedMonitor", "curSessionPage: " + this.f331303f + ", stopMonitor: " + this.f331301d);
    }

    public final void e(java.lang.String sessionName, long j17) {
        l52.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionName, "sessionName");
        if (this.f331304g == 0) {
            this.f331304g = j17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecycleViewFeedMonitor", "updateAppInTime: " + this.f331304g + ", " + sessionName);
            if (e62.q.c(sessionName) || (fVar = this.f331301d) == null || java.lang.Long.valueOf(j17).longValue() - fVar.f398121h <= 30000) {
                return;
            }
            fVar.f398131r = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "checkOtherPageAppIn: last sessionEnd");
            java.lang.String d17 = v52.c.g().d();
            java.lang.String b17 = w52.j.b();
            fVar.j();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new l52.b(fVar, fVar.f398131r, d17, b17));
            ((ku5.t0) ku5.t0.f394148d).k(new l52.d(fVar), 500L);
        }
    }

    public final void f(java.lang.String sessionName, long j17) {
        l52.f fVar;
        r45.va6 va6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionName, "sessionName");
        long j18 = this.f331304g;
        if (j18 != 0) {
            long j19 = j17 - j18;
            l52.f fVar2 = this.f331301d;
            if (fVar2 != null && fVar2.f398116c == 0 && (va6Var = fVar2.f398120g) != null) {
                long j27 = va6Var.f469577e + j19;
                va6Var.f469577e = j27;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FeedMonitor", "updateTimeLineFrontStayTime, frontTime: %d", java.lang.Long.valueOf(j27));
            }
            this.f331304g = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecycleViewFeedMonitor", "updateAppOutTime: " + j17);
            if (e62.q.c(sessionName) || (fVar = this.f331301d) == null) {
                return;
            }
            fVar.f398121h = java.lang.Long.valueOf(j17).longValue();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        l52.f fVar = this.f331301d;
        if (fVar != null) {
            e62.q.a().getClass();
            if (i17 != 0) {
                i18 = 1;
                if (i17 != 1) {
                    i18 = 2;
                    if (i17 != 2) {
                        i18 = -1;
                    }
                }
            } else {
                i18 = 0;
            }
            fVar.p(recyclerView, i18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        android.app.Activity activity;
        int y17;
        int i19;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        java.lang.ref.WeakReference weakReference = this.f331302e;
        if (weakReference != null && (activity = (android.app.Activity) weakReference.get()) != null) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = !(layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ? null : (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int i27 = -1;
            if (c1162x665295de != null) {
                try {
                    i27 = c1162x665295de.w();
                    c1162x665295de.m8020x7e414b06();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecycleViewFeedMonitor", "onScrolled: ", e17);
                }
            }
            int i28 = i27;
            recyclerView.getChildCount();
            if (activity.isFinishing() || activity.isDestroyed()) {
                yj0.a.h(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            l52.f fVar = this.f331301d;
            if (fVar != null) {
                int childCount = recyclerView.getChildCount();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = layoutManager2 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager2 : null;
                if (c1162x665295de2 != null) {
                    try {
                        y17 = (c1162x665295de2.y() - c1162x665295de2.w()) + 1;
                    } catch (java.lang.Exception unused) {
                    }
                    if (y17 <= childCount) {
                        i19 = y17;
                        fVar.o(activity, recyclerView, i28, i19, i18);
                    }
                }
                i19 = childCount;
                fVar.o(activity, recyclerView, i28, i19, i18);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/expt/hellhound/ext/sns/RecycleViewFeedMonitor", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
