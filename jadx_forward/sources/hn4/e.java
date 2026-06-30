package hn4;

/* loaded from: classes15.dex */
public class e extends fn4.d {
    public static p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e(fn4.b bVar) {
        android.view.View view;
        int i17 = 0;
        while (true) {
            if (i17 >= bVar.mo72292x4905e9fa().getChildCount()) {
                view = null;
                break;
            }
            view = bVar.mo72292x4905e9fa().getChildAt(i17);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = bVar.mo72292x4905e9fa().w0(view);
            if (view.getTag() != null && view.getTag().equals("video") && view.getTop() > 0 && w07.m8183xf806b362() >= 0) {
                break;
            }
            i17++;
        }
        if (view != null) {
            return bVar.mo72292x4905e9fa().w0(view);
        }
        return null;
    }

    @Override // fn4.d
    public void b(fn4.b bVar) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 mo72292x4905e9fa = bVar.mo72292x4905e9fa();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e17 = e(bVar);
        if (e17 instanceof hn4.d0) {
            hn4.d0 d0Var = (hn4.d0) e17;
            int u17 = d0Var != null ? d0Var.u() : -1;
            if (u17 != bVar.Y2() && bVar.I2().f346109e) {
                bVar.I2().m();
            }
            bVar.t();
            for (int i17 = 0; i17 < mo72292x4905e9fa.getChildCount(); i17++) {
                android.view.View childAt = mo72292x4905e9fa.getChildAt(i17);
                if (childAt.getTag() != null) {
                    hn4.d0 d0Var2 = (hn4.d0) bVar.mo72292x4905e9fa().w0(childAt);
                    if (d0Var2.u() == u17) {
                        d0Var2.v();
                        d0Var2.m();
                        if (!bVar.I2().f346109e) {
                            hn4.z zVar = (hn4.z) d0Var2.f364083h;
                            android.view.View view = zVar.f346054s;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollPlayContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            zVar.f346045g.setVisibility(0);
                            zVar.f346043e.setVisibility(8);
                            zVar.f346042d.setVisibility(8);
                            zVar.f346058w.setVisibility(8);
                        }
                    } else {
                        d0Var2.w();
                        hn4.z zVar2 = (hn4.z) d0Var2.f364083h;
                        android.view.View view2 = zVar2.f346054s;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        zVar2.f346045g.setVisibility(0);
                        zVar2.f346043e.setVisibility(8);
                        zVar2.f346042d.setVisibility(8);
                        zVar2.f346058w.setVisibility(8);
                        android.view.View view3 = zVar2.f346056u;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view4 = zVar2.f346055t;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoContainer", "setListScrollStopContainerStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        zVar2.f346048m.setVisibility(0);
                        zVar2.f346049n.setVisibility(8);
                        zVar2.f346052q.setVisibility(8);
                    }
                }
            }
        }
    }

    @Override // fn4.d
    public void c(fn4.b bVar) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e17 = e(bVar);
        if (e17 instanceof hn4.d0) {
            hn4.d0 d0Var = (hn4.d0) e17;
            if (!bVar.I2().f346109e) {
                if (bVar.s1().b()) {
                    d0Var.s(true);
                } else {
                    d0Var.f364083h.h();
                    bVar.I2().m();
                }
            }
            d0Var.m();
            bVar.X1(d0Var.u());
            bVar.o4().c();
        }
    }

    @Override // fn4.d
    public void d(fn4.b bVar, int i17) {
        android.view.View view = null;
        for (int i18 = 0; i18 < bVar.mo72292x4905e9fa().getChildCount(); i18++) {
            view = bVar.mo72292x4905e9fa().getChildAt(i18);
            if (bVar.mo72292x4905e9fa().u0(view) == i17) {
                break;
            }
        }
        if (view != null) {
            bVar.mo72292x4905e9fa().mo7976xc291bbd2(0, bVar.d2().e(view) - bVar.l4());
        }
    }
}
