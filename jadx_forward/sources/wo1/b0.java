package wo1;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qo1.f0 f529434d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo1.a1 f529435e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g f529436f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ po1.d f529437g;

    public b0(qo1.f0 f0Var, wo1.a1 a1Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar, po1.d dVar) {
        this.f529434d = f0Var;
        this.f529435e = a1Var;
        this.f529436f = gVar;
        this.f529437g = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onAutoBackupConsecutiveFail$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f529434d.o()) {
            qo1.f0 f0Var = this.f529434d;
            synchronized (f0Var) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseRoamTask", "clearConsecutiveFailure, pkgId=" + f0Var.f447016i);
                com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.u.f174270a.d().l(f0Var.f447016i, 0L);
            }
        }
        this.f529435e.p(this.f529436f, this.f529434d, this.f529437g);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/component/BaseTaskStatusView$onAutoBackupConsecutiveFail$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
