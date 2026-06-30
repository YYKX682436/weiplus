package vg2;

/* loaded from: classes3.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.x0 f518146d;

    public w0(vg2.x0 x0Var) {
        this.f518146d = x0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftSamePkgGiftWidget$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.x0 x0Var = this.f518146d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x0Var.f518149f, "[click] giftId:" + x0Var.f518020e);
        r45.zb4 zb4Var = new r45.zb4();
        zb4Var.set(1, java.lang.Boolean.TRUE);
        zb4Var.set(2, x0Var.f518016a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573096dj5));
        zb4Var.set(0, x0Var.f518020e);
        mm2.s2 s2Var = (mm2.s2) dk2.ef.f314905a.i(mm2.s2.class);
        if (s2Var != null && (c14227x4262fb44 = s2Var.f410944p) != null) {
            c14227x4262fb44.mo7808x76db6cb1(zb4Var);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftSamePkgGiftWidget$initClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
