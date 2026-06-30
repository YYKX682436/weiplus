package ap1;

/* loaded from: classes5.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.u1 f94265d;

    public q1(ap1.u1 u1Var) {
        this.f94265d = u1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectAllContactUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.u1 u1Var = this.f94265d;
        j75.f fVar = u1Var.f94279d;
        if (fVar == null) {
            fVar = u1Var.Q6();
            u1Var.f94279d = fVar;
        }
        if (fVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectAllContactUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ap1.c2 c2Var = (ap1.c2) fVar.mo140437x75286adb();
        if (!c2Var.f94161i) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectAllContactUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (c2Var.f94163n.size() == c2Var.f94162m.size()) {
            fVar.B3(new ap1.g2(false, null, 2, null));
        } else {
            fVar.B3(new ap1.g2(true, null, 2, null));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectAllContactUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
