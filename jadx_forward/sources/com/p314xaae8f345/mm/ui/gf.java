package com.p314xaae8f345.mm.ui;

/* loaded from: classes14.dex */
public class gf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21424xdbf688d7 f290224d;

    public gf(com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7) {
        this.f290224d = c21424xdbf688d7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MultiTalkRoomPopupNav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomPopupNav", "click cancel button..");
        com.p314xaae8f345.mm.ui.C21424xdbf688d7 c21424xdbf688d7 = this.f290224d;
        if (c21424xdbf688d7.f278536p == com.p314xaae8f345.mm.ui.kf.Inviting) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkRoomPopupNav", "reject multiTalk!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13945, 3, 1, 0, 0, c21424xdbf688d7.f278533m, java.lang.Integer.valueOf(c21424xdbf688d7.f278541u.f66526xeabee3b), java.lang.Long.valueOf(c21424xdbf688d7.f278541u.f66527xc6d1e13f));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13945, 2, 0, 0, 0, c21424xdbf688d7.f278533m, java.lang.Integer.valueOf(c21424xdbf688d7.f278541u.f66526xeabee3b), java.lang.Long.valueOf(c21424xdbf688d7.f278541u.f66527xc6d1e13f));
        }
        com.p314xaae8f345.mm.ui.jf.a(c21424xdbf688d7.f278537q);
        c21424xdbf688d7.f278527d.setVisibility(0);
        c21424xdbf688d7.mo78794x295c769d(com.p314xaae8f345.mm.R.C30861xcebc809e.b7a);
        c21424xdbf688d7.f278528e.setVisibility(0);
        c21424xdbf688d7.f278538r.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
