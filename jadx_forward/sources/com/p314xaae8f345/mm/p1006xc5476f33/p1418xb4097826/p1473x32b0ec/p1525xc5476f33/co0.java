package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class co0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14274x56897b10 f193715d;

    public co0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14274x56897b10 c14274x56897b10) {
        this.f193715d = c14274x56897b10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.C14274x56897b10 c14274x56897b10 = this.f193715d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = c14274x56897b10.f193301e;
        if (c22613xe7040d9c != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c.b(c22613xe7040d9c, null, 1, null);
        }
        yz5.l lVar = c14274x56897b10.f193304h;
        if (lVar != null) {
            int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
            c14274x56897b10.b(false);
            lVar.mo146xb9724478(java.lang.Integer.valueOf(m75939xb282bd08));
            c14274x56897b10.f193304h = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/plugin/FinderVisitorRoleChooserPlugin$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
