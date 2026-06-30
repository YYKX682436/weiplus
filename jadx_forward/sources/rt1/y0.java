package rt1;

/* loaded from: classes7.dex */
public final class y0 implements rt1.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b f481031a;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b activityC13030x3e5b0a3b) {
        this.f481031a = activityC13030x3e5b0a3b;
    }

    @Override // rt1.b1
    public p3325xe03a0797.p3326xc267989b.y0 a() {
        return this.f481031a.f176141d;
    }

    @Override // rt1.b1
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b activityC13030x3e5b0a3b = this.f481031a;
        android.view.View view = activityC13030x3e5b0a3b.f176154m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = false;
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!((c13026x8642c3d7 == null || (arrayList = c13026x8642c3d7.f176137d) == null || !(arrayList.isEmpty() ^ true)) ? false : true)) {
            android.view.View view2 = activityC13030x3e5b0a3b.f176153i;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a071 = activityC13030x3e5b0a3b.f176151g;
            if (c12809xaf47a071 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c12809xaf47a071.setVisibility(8);
            rt1.r0 r0Var = activityC13030x3e5b0a3b.f176152h;
            if (r0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerAdapter");
                throw null;
            }
            java.util.ArrayList arrayList4 = r0Var.f481012d;
            if (true ^ arrayList4.isEmpty()) {
                r0Var.m8154xdb81fc7f(0, arrayList4.size());
                arrayList4.clear();
                return;
            }
            return;
        }
        android.view.View view3 = activityC13030x3e5b0a3b.f176153i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
            throw null;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view3, arrayList5.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderData", "(Lcom/tencent/mm/plugin/car_license_plate/api/entity/MMCarLicensePlateInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a0712 = activityC13030x3e5b0a3b.f176151g;
        if (c12809xaf47a0712 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c12809xaf47a0712.setVisibility(0);
        rt1.r0 r0Var2 = activityC13030x3e5b0a3b.f176152h;
        if (r0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerAdapter");
            throw null;
        }
        java.util.ArrayList newList = c13026x8642c3d7.f176137d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        java.util.ArrayList arrayList6 = r0Var2.f481012d;
        if (!arrayList6.isEmpty()) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.c0 a17 = p012xc85e97e9.p103xe821e364.p104xd1075a44.h0.a(new rt1.s0(new java.util.ArrayList(arrayList6), new java.util.ArrayList(newList)), true);
            arrayList6.clear();
            arrayList6.addAll(newList);
            a17.b(r0Var2);
        } else if (!newList.isEmpty()) {
            arrayList6.addAll(newList);
            r0Var2.m8153xd399a4d9(0, newList.size());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.C13032x6313e41e c13032x6313e41e = activityC13030x3e5b0a3b.f176149e;
        if (c13032x6313e41e != null && c13032x6313e41e.f176157e) {
            z17 = true;
        }
        if (z17) {
            activityC13030x3e5b0a3b.finish();
        }
    }

    @Override // rt1.b1
    public void c(qt1.f exception) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exception, "exception");
        if (exception.f448056g instanceof qt1.e) {
            st1.g.b(exception);
        }
    }

    @Override // rt1.b1
    public android.app.Activity d() {
        return this.f481031a;
    }

    @Override // rt1.b1
    public void e(rt1.a1 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        if (rt1.a1.f480917d == request) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.ui.ActivityC13030x3e5b0a3b activityC13030x3e5b0a3b = this.f481031a;
            android.view.View view = activityC13030x3e5b0a3b.f176154m;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loadingView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = activityC13030x3e5b0a3b.f176153i;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emptyView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", "onRenderLoading", "(Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListViewContract$ViewCallback$Request;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12809xaf47a071 c12809xaf47a071 = activityC13030x3e5b0a3b.f176151g;
            if (c12809xaf47a071 != null) {
                c12809xaf47a071.setVisibility(8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
        }
    }
}
