package hr3;

/* loaded from: classes11.dex */
public class ya extends hr3.eb {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 f365742g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ya(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668) {
        super(c16861xdcf09668);
        this.f365742g = c16861xdcf09668;
    }

    @Override // hr3.eb, hr3.va
    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365742g;
        android.view.View view = c16861xdcf09668.f235267x0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!c16861xdcf09668.L.r2() || (c16861xdcf09668.L.r2() && com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(c16861xdcf09668.L.d1()))) {
            android.view.View view2 = c16861xdcf09668.f235271z1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c16861xdcf09668.D1.setVisibility(8);
            c16861xdcf09668.G1.setVisibility(8);
            c16861xdcf09668.E1.setVisibility(8);
        } else {
            android.view.View view3 = c16861xdcf09668.f235271z1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c16861xdcf09668.D1.setVisibility(0);
            if (c16861xdcf09668.Q() || c16861xdcf09668.L.d1().equals(c01.z1.r())) {
                c16861xdcf09668.E1.setVisibility(8);
            } else {
                c16861xdcf09668.E1.setVisibility(0);
            }
        }
        c16861xdcf09668.C1.setVisibility(8);
        c16861xdcf09668.F1.setVisibility(8);
        c16861xdcf09668.H1.setVisibility(8);
        if (c16861xdcf09668.Y) {
            android.view.View view4 = c16861xdcf09668.f235271z1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$NearByFriendHandler", "doInitJob", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c16861xdcf09668.C1.setVisibility(0);
            c16861xdcf09668.C1.setOnClickListener(new hr3.wa(this));
        }
        c16861xdcf09668.B1.setOnClickListener(new hr3.xa(this));
    }

    @Override // hr3.va
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16861xdcf09668 c16861xdcf09668 = this.f365742g;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16861xdcf09668.L;
        if (z3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormalUserFooterPreference", "contact is null in NearByFriendHandler");
            return;
        }
        if (z3Var.r2() && (!c16861xdcf09668.L.r2() || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(c16861xdcf09668.L.d1()))) {
            j();
        } else {
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.H3(c16861xdcf09668.L.d1())) {
                return;
            }
            k(false, true);
        }
    }
}
