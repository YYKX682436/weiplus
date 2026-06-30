package zo1;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f f556260d;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f) {
        this.f556260d = activityC12867x6b26c82f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.y1.W);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51 c6839x89375b51 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6839x89375b51();
        c6839x89375b51.f141599d = 9L;
        c6839x89375b51.f141600e = 5L;
        c6839x89375b51.k();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f.f174331w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12867x6b26c82f activityC12867x6b26c82f = this.f556260d;
        activityC12867x6b26c82f.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC12867x6b26c82f, 0, 0, false);
        android.view.View inflate = android.view.LayoutInflater.from(activityC12867x6b26c82f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570243dq1, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.riu);
        zo1.w wVar = activityC12867x6b26c82f.f174340p;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("conversationAdapter");
            throw null;
        }
        if (wVar.x()) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mfg);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mfi);
        }
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.ris)).setOnClickListener(new zo1.r0(z2Var));
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.rit)).setOnClickListener(new zo1.s0(z2Var, activityC12867x6b26c82f));
        z2Var.k(inflate, 0, 0);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/pkg/CheckPackageContentUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
