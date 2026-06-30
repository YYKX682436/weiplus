package fd5;

/* loaded from: classes15.dex */
public final class d implements fd5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 f342877a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f342878b;

    public d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 lm6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lm6, "lm");
        this.f342877a = lm6;
    }

    @Override // fd5.a
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int b17;
        if (!this.f342878b || h3Var == null || h3Var.f93598g || (b17 = h3Var.b()) <= 0) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 c21844xd4ff61b8 = this.f342877a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(b17 - 1));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c21844xd4ff61b8, arrayList.toArray(), "com/tencent/mm/ui/chatting/layoutmanager/WeClawMDScrollLMComponent", "beforeOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c21844xd4ff61b8.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c21844xd4ff61b8, "com/tencent/mm/ui/chatting/layoutmanager/WeClawMDScrollLMComponent", "beforeOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
    }

    @Override // fd5.a
    public void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        int b17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 c21844xd4ff61b8;
        android.view.View mo7935xa188593e;
        if (!this.f342878b || h3Var == null || h3Var.f93598g || (b17 = h3Var.b()) <= 0 || (mo7935xa188593e = (c21844xd4ff61b8 = this.f342877a).mo7935xa188593e(b17 - 1)) == null) {
            return;
        }
        int m8018x1c4fb41d = (c21844xd4ff61b8.m8018x1c4fb41d() - c21844xd4ff61b8.m8026xc96f6de6()) - c21844xd4ff61b8.m8010xd6b039cc(mo7935xa188593e);
        if (m8018x1c4fb41d >= 0) {
            return;
        }
        c21844xd4ff61b8.mo8055xe23cdd48(m8018x1c4fb41d);
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMDScrollLMComponent", "setLayoutToLast: " + z17);
        this.f342878b = z17;
    }
}
