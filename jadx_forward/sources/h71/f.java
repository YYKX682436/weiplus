package h71;

/* loaded from: classes15.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 f360920a;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 activityC11391x705f5af4) {
        this.f360920a = activityC11391x705f5af4;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar == null) {
            return null;
        }
        boolean b17 = fVar.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11391x705f5af4 activityC11391x705f5af4 = this.f360920a;
        if (b17) {
            r45.gf3 gf3Var = (r45.gf3) fVar.f152151d;
            java.lang.String str = gf3Var.f456718d;
            if (str != null) {
                activityC11391x705f5af4.f154729d = str;
            }
            java.lang.String str2 = gf3Var.f456719e;
            if (str2 != null) {
                activityC11391x705f5af4.f154731f = str2;
            }
            java.lang.String str3 = gf3Var.f456726o;
            if (str3 != null) {
                activityC11391x705f5af4.f154736n = str3;
            }
            activityC11391x705f5af4.f154732g = gf3Var.f456722h;
            activityC11391x705f5af4.f154733h = gf3Var.f456720f;
            activityC11391x705f5af4.f154734i = gf3Var.f456721g;
            activityC11391x705f5af4.f154735m = gf3Var.f456724m;
            activityC11391x705f5af4.f154737o = gf3Var.f456723i;
            e71.k.wi().mo9952xce0038c9(activityC11391x705f5af4.V6(), new java.lang.String[0]);
            activityC11391x705f5af4.X6();
            activityC11391x705f5af4.f154741s = false;
            ul5.k m78511x9f88d943 = activityC11391x705f5af4.m78511x9f88d943();
            if (m78511x9f88d943 != null) {
                m78511x9f88d943.mo82163x4e0f6657(true);
            }
            activityC11391x705f5af4.m79335xcc101dd9().setVisibility(0);
            android.view.View view = activityC11391x705f5af4.f154740r;
            if (view == null) {
                return fVar;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "stopLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "stopLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return fVar;
        }
        activityC11391x705f5af4.f154741s = true;
        ul5.k m78511x9f88d9432 = activityC11391x705f5af4.m78511x9f88d943();
        if (m78511x9f88d9432 != null) {
            m78511x9f88d9432.mo82163x4e0f6657(false);
        }
        activityC11391x705f5af4.m79335xcc101dd9().setVisibility(4);
        android.view.View view2 = activityC11391x705f5af4.f154740r;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = activityC11391x705f5af4.f154740r;
        android.view.View findViewById = view3 != null ? view3.findViewById(com.p314xaae8f345.mm.R.id.v_x) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            android.view.View view4 = findViewById;
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = activityC11391x705f5af4.f154740r;
        android.view.View findViewById2 = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.nht) : null;
        if (findViewById2 == null) {
            return fVar;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        android.view.View view6 = findViewById2;
        yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/account/security/ui/MySafeDeviceDetailUI", "showError", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return fVar;
    }
}
