package df2;

/* loaded from: classes3.dex */
public final class l00 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f312153d;

    public l00(df2.m00 m00Var) {
        this.f312153d = m00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ce0 ce0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/ShopVIPController$setupClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.m00 m00Var = this.f312153d;
        r45.j92 j92Var = (r45.j92) ((mm2.f6) m00Var.m56788xbba4bfc0(mm2.f6.class)).f410575p1.mo3195x754a37bb();
        if (j92Var != null && (ce0Var = (r45.ce0) j92Var.m75936x14adae67(1)) != null) {
            st2.c2 c2Var = st2.c2.f493782a;
            android.content.Context O6 = m00Var.O6();
            byte[] s07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(s07, "getUuidRandom(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(m00Var.O6(), c2Var.d(O6, ce0Var, 1177, s07, "", m00Var.getStore().getLiveRoomData()));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/ShopVIPController$setupClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
