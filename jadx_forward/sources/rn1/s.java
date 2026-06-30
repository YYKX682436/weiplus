package rn1;

/* loaded from: classes12.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f479160d;

    public s(rn1.a0 a0Var) {
        this.f479160d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rn1.a0 a0Var = this.f479160d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) a0Var.f479145a.mo55332x76847179(), 1, true);
        k0Var.q(a0Var.f479145a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jyx), 17);
        k0Var.f293405n = new rn1.q(this);
        k0Var.f293414s = new rn1.r(this);
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
