package ap1;

/* loaded from: classes5.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.x1 f94283d;

    public v1(ap1.x1 x1Var) {
        this.f94283d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.x1 x1Var = this.f94283d;
        j75.f fVar = x1Var.f94297e;
        if (fVar == null) {
            fVar = x1Var.Q6();
            x1Var.f94297e = fVar;
        }
        if (fVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        fVar.B3(new ap1.d(ap1.e.f94175g, null));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = x1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", (java.lang.String[]) ((ap1.c2) fVar.mo140437x75286adb()).f94163n.toArray(new java.lang.String[0]));
        abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
        abstractActivityC21394xb3d2c0cf.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
