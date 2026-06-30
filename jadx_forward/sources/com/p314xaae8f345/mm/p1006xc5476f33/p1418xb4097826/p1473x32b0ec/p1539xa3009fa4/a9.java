package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class a9 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.t8 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f198437d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View findViewById = m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.qfz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f198437d = (android.widget.RelativeLayout) findViewById;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        jz5.f0 f0Var;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2 z2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.z2) a17;
        r45.lc1 u47 = g92.b.f351302e.u4();
        android.widget.RelativeLayout relativeLayout = this.f198437d;
        if (relativeLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        relativeLayout.removeAllViews();
        r45.s02 s02Var = new r45.s02();
        s02Var.set(3, 2);
        s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
        android.view.View Q6 = z2Var.Q6(u47, s02Var, true, true, false);
        if (Q6 != null) {
            android.widget.RelativeLayout relativeLayout2 = this.f198437d;
            if (relativeLayout2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(relativeLayout2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(relativeLayout2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRolePrivacyUIC", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            relativeLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(relativeLayout2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRolePrivacyUIC", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(relativeLayout2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.RelativeLayout relativeLayout3 = this.f198437d;
            if (relativeLayout3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
            relativeLayout3.addView(Q6, new android.widget.RelativeLayout.LayoutParams(-1, -2));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.RelativeLayout relativeLayout4 = this.f198437d;
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(8);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
                throw null;
            }
        }
    }
}
