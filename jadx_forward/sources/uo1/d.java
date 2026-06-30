package uo1;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f511081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f511082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f511083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f511084g;

    public d(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, long j17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f511081d = f0Var;
        this.f511082e = g0Var;
        this.f511083f = j17;
        this.f511084g = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showAutoBackupBottomDialog$3$1$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f511081d.f391649d |= 1;
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f511082e;
        if (g0Var.f391654d > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BackupUIUtils", "[111] clear pause time. restartTime=" + g0Var.f391654d);
            eo1.a aVar = eo1.a.f337078a;
            long j17 = this.f511083f;
            aVar.b(j17, 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.r0.f174217a.q(j17);
            g0Var.f391654d = 0L;
        }
        this.f511084g.q();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/ui/BackupUIUtils$showAutoBackupBottomDialog$3$1$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
