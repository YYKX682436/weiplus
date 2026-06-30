package ap1;

/* loaded from: classes5.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.c1 f12766d;

    public y0(ap1.c1 c1Var) {
        this.f12766d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ap1.c2 c2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.c1 c1Var = this.f12766d;
        j75.f U6 = c1Var.U6();
        if (U6 != null) {
            U6.B3(new ap1.d(ap1.e.f12642g, null));
        }
        j75.f U62 = c1Var.U6();
        if (U62 != null && (c2Var = (ap1.c2) U62.getState()) != null) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(c1Var.getActivity(), 0, 0, false);
            android.view.View inflate = android.view.LayoutInflater.from(c1Var.getActivity()).inflate(com.tencent.mm.R.layout.f488710dq1, (android.view.ViewGroup) null);
            boolean z17 = c2Var.f12630n.size() == c2Var.f12629m.size();
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.riu);
            if (z17) {
                textView.setText(com.tencent.mm.R.string.mfg);
            } else {
                textView.setText(com.tencent.mm.R.string.mfi);
            }
            ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.ris)).setOnClickListener(new ap1.a1(z2Var));
            ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.rit)).setOnClickListener(new ap1.b1(z2Var, z17, c1Var, c2Var));
            z2Var.k(inflate, 0, 0);
            z2Var.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
