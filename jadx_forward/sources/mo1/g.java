package mo1;

/* loaded from: classes5.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d f411818d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d activityC12849xeea2846d) {
        this.f411818d = activityC12849xeea2846d;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/roamlite/CreateRoamLitePkgUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.f174477n);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 2L;
        c6839x89375b51.f141600e = 3L;
        c6839x89375b51.k();
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1260xddd27357.ActivityC12849xeea2846d activityC12849xeea2846d = this.f411818d;
        android.content.Intent intent = new android.content.Intent(activityC12849xeea2846d.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12866x739418c6.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = activityC12849xeea2846d.f174237n;
        if (c12853x6acde7c9 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rangeInfo");
            throw null;
        }
        intent.putExtra("convParcelRange", c12853x6acde7c9);
        intent.putExtra("autoBackupEnable", false);
        activityC12849xeea2846d.startActivityForResult(intent, 125);
        activityC12849xeea2846d.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559262q);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/roamlite/CreateRoamLitePkgUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
