package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class n0 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f286426a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 f286427b;

    public n0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.q0 q0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f286427b = q0Var;
        this.f286426a = f9Var;
    }

    @Override // db5.r4
    public void a(android.view.View menuView, int i17, android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 140 || itemId == 139) {
            yb5.d dVar = this.f286427b.f286822d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuView, "menuView");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f286426a;
            if (f9Var == null || dVar == null) {
                return;
            }
            java.util.Map m07 = ((vb5.l) ((vb5.m) dVar.f542241c.a(vb5.m.class))).m0(f9Var);
            java.lang.String str = itemId != 139 ? itemId != 140 ? "" : "group_msg_set_top_bubble_remove" : "group_msg_set_top_bubble_set";
            if (r26.n0.N(str) || m07 == null) {
                return;
            }
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(menuView, str);
            aVar.ik(menuView, 40, 26356);
            aVar.gk(menuView, m07);
        }
    }
}
