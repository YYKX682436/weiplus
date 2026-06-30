package co2;

/* loaded from: classes2.dex */
public final class b implements in5.y {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ co2.k f125316d;

    public b(co2.k kVar) {
        this.f125316d = kVar;
    }

    @Override // in5.y
    public boolean c(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        java.lang.String str;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        vn2.u0 u0Var = vn2.u0.f519920a;
        co2.k kVar = this.f125316d;
        java.lang.String tag = kVar.f125325d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = kVar.m158354x19263085();
        r45.qt2 qt2Var = (r45.qt2) ((jz5.n) kVar.f125326e).mo141623x754a37bb();
        co2.i iVar = (co2.i) ((jz5.n) kVar.f125330i).mo141623x754a37bb();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1562x28550ec7.C14445x62c29b8c loader = kVar.O6();
        java.lang.Object obj = holder.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) context, 1, false);
        k0Var.f293405n = new vn2.z(context);
        k0Var.f293414s = new vn2.f0(loader, abstractC14490x69736cb5, tag, qt2Var, context, iVar);
        k0Var.v();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("view_id", "remove_watch_later_card");
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(1)) == null) {
            str = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str);
        lVarArr[2] = new jz5.l("comment_scene", qt2Var != null ? java.lang.Integer.valueOf(qt2Var.m75939xb282bd08(5)) : "");
        lVarArr[3] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
        ((cy1.a) rVar).yj("view_exp", null, kz5.c1.k(lVarArr), 1, true);
        return true;
    }
}
