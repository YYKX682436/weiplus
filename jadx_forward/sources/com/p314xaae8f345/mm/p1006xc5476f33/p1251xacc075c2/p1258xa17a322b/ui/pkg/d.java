package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView f174428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f174429e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ po1.d f174430f;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView restoreTaskStatusView, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, po1.d dVar) {
        this.f174428d = restoreTaskStatusView;
        this.f174429e = gVar;
        this.f174430f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174480p0);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 10L;
        c6839x89375b51.f141600e = 2L;
        c6839x89375b51.k();
        po1.d dVar = this.f174430f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd.RestoreTaskStatusView restoreTaskStatusView = this.f174428d;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar = this.f174429e;
        jz5.l a17 = restoreTaskStatusView.a(gVar, dVar, false);
        qo1.d1 d1Var = (qo1.d1) a17.f384366d;
        ((java.lang.Boolean) a17.f384367e).booleanValue();
        if (d1Var == qo1.d1.f446996d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StartRestoringUI", "task launched(pkgId=" + gVar.f297362d + "), finish current activity.");
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd activityC12875x98f0bdfd = restoreTaskStatusView.f174418v;
            if (activityC12875x98f0bdfd == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                throw null;
            }
            if (activityC12875x98f0bdfd == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                throw null;
            }
            activityC12875x98f0bdfd.setResult(-1, activityC12875x98f0bdfd.getIntent());
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12875x98f0bdfd activityC12875x98f0bdfd2 = restoreTaskStatusView.f174418v;
            if (activityC12875x98f0bdfd2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
                throw null;
            }
            activityC12875x98f0bdfd2.U6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/StartRestoringUI$RestoreTaskStatusView$onInitialState$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
