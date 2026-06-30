package df2;

/* loaded from: classes3.dex */
public final class sx implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cy f312914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f312915e;

    public sx(df2.cy cyVar, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862) {
        this.f312914d = cyVar;
        this.f312915e = c19786x6a1e2862;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/MsgBoxShowController$setupBottomSheetAppealButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.E, "3", null, 4, null);
        df2.cy cyVar = this.f312914d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = cyVar.f311449n;
        if (y1Var != null) {
            y1Var.q();
        }
        df2.nm nmVar = (df2.nm) cyVar.m56789x25fe639c(df2.nm.class);
        if (nmVar != null) {
            nmVar.Z6(this.f312915e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/MsgBoxShowController$setupBottomSheetAppealButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
