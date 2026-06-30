package ur2;

/* loaded from: classes10.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ur2.v f511956d;

    public r(ur2.v vVar) {
        this.f511956d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ur2.v vVar = this.f511956d;
        android.view.View view2 = vVar.f511959f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layout");
            throw null;
        }
        jz5.l[] lVarArr = new jz5.l[3];
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 == null || (str = c19783xd9a946b7.m76327x23a7af9b()) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_post_sessionid", str);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        lVarArr[1] = new jz5.l("enter_scene", java.lang.Integer.valueOf(c19783xd9a946b72 != null ? c19783xd9a946b72.m76275xbcc8608a() : 0));
        lVarArr[2] = new jz5.l("if_clk_empty", java.lang.Integer.valueOf(1 ^ (vVar.f511957d ? 1 : 0)));
        hc2.v0.b(view2, "short_title_input_box", "view_clk", 0, kz5.c1.k(lVarArr), null, 20, null);
        if (vVar.f511957d) {
            ry2.j.f482931a.a(vVar.m158354x19263085(), kz5.c0.i(new ry2.f(1, 0, 0, new ur2.s(vVar), null, 22, null), new ry2.f(3, 0, 0, new ur2.t(vVar), null, 22, null), new ry2.f(2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, 0, new ur2.u(vVar), null, 20, null)), null);
        } else {
            vVar.P6(0L);
            yz5.a aVar = vVar.f511958e;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/post/shorttitle/PostShortTitleUIC$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
