package ap1;

/* loaded from: classes5.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.x1 f12750d;

    public v1(ap1.x1 x1Var) {
        this.f12750d = x1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.x1 x1Var = this.f12750d;
        j75.f fVar = x1Var.f12764e;
        if (fVar == null) {
            fVar = x1Var.Q6();
            x1Var.f12764e = fVar;
        }
        if (fVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        fVar.B3(new ap1.d(ap1.e.f12642g, null));
        androidx.appcompat.app.AppCompatActivity activity = x1Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Contact", (java.lang.String[]) ((ap1.c2) fVar.getState()).f12630n.toArray(new java.lang.String[0]));
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSelectContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
