package df2;

/* loaded from: classes3.dex */
public final class mx implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ox f312348d;

    public mx(df2.ox oxVar) {
        this.f312348d = oxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        xu2.u uVar;
        xu2.v vVar;
        android.content.Intent intent;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/MoreActionController$enableBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        df2.ox oxVar = this.f312348d;
        sb6.append(((mm2.e1) oxVar.m56788xbba4bfc0(mm2.e1.class)).f410520q.f461828e);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String shareId = sb6.toString();
        j0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareId, "shareId");
        ml2.y4 y4Var = ml2.j0.f409116i;
        y4Var.getClass();
        y4Var.F = shareId;
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (r4Var.w1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f409475e, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f409475e, null, null, null, null, null, false, 126, null);
        }
        oxVar.d7();
        df2.ju juVar = (df2.ju) oxVar.m56789x25fe639c(df2.ju.class);
        if (juVar != null) {
            juVar.d7();
            p3325xe03a0797.p3326xc267989b.r2 r2Var = juVar.f312033n;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
        }
        df2.tc tcVar = (df2.tc) oxVar.m56789x25fe639c(df2.tc.class);
        if (tcVar != null && (slVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl) tcVar.f312966n.remove(2)) != null) {
            slVar.dismiss();
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf N6 = oxVar.N6();
        if (N6 != null && (intent = N6.getIntent()) != null) {
            intent.putExtra("KEY_PARAMS_DO_ACTION", 0);
        }
        if (((mm2.c1) oxVar.m56788xbba4bfc0(mm2.c1.class)).M7() && (uVar = (xu2.u) oxVar.R6(xu2.u.class)) != null && (vVar = uVar.f538765r) != null) {
            vVar.a();
            vVar.c(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d);
        }
        if (!r4Var.y1(oxVar.getStore().getLiveRoomData())) {
            jf2.k0.f380910y.a(1, 3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/MoreActionController$enableBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
