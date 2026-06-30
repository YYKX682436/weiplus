package rn1;

/* loaded from: classes12.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f479157d;

    public p(rn1.a0 a0Var) {
        this.f479157d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn1.a0 a0Var = this.f479157d;
        android.content.Intent intent = new android.content.Intent(a0Var.f479145a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1255x7e7a1bd6.ActivityC12836xdfc4e6e1.class);
        intent.putExtra("KEY_IS_BACKUP", true);
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(a0Var.f479145a, intent);
        qn1.c.i().m().d();
        qn1.c.i().m().e();
        qn1.c.i().m().c(false);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
