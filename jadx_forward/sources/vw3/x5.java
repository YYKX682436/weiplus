package vw3;

/* loaded from: classes10.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerSportUI f522714d;

    public x5(com.tencent.mm.plugin.repairer.ui.RepairerSportUI repairerSportUI) {
        this.f522714d = repairerSportUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerSportUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.RepairerSportUI repairerSportUI = this.f522714d;
        java.lang.Integer h17 = r26.h0.h(((com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) repairerSportUI.findViewById(com.p314xaae8f345.mm.R.id.owl)).getText().toString());
        int intValue = h17 != null ? h17.intValue() : 1;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        long j17 = 1000;
        ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).wi("", "gh_43f2581f6fd6", (int) (calendar.getTimeInMillis() / j17), (int) (java.lang.System.currentTimeMillis() / j17), intValue, com.p314xaae8f345.mm.p2621x8fb0427b.la.m0(), 1);
        dp.a.m125853x26a183b((android.content.Context) repairerSportUI, com.p314xaae8f345.mm.R.C30867xcad56011.f572013w9, 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerSportUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
