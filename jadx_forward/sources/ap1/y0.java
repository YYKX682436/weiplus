package ap1;

/* loaded from: classes5.dex */
public final class y0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.c1 f94299d;

    public y0(ap1.c1 c1Var) {
        this.f94299d = c1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ap1.c2 c2Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ap1.c1 c1Var = this.f94299d;
        j75.f U6 = c1Var.U6();
        if (U6 != null) {
            U6.B3(new ap1.d(ap1.e.f94175g, null));
        }
        j75.f U62 = c1Var.U6();
        if (U62 != null && (c2Var = (ap1.c2) U62.mo140437x75286adb()) != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(c1Var.m158354x19263085(), 0, 0, false);
            android.view.View inflate = android.view.LayoutInflater.from(c1Var.m158354x19263085()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570243dq1, (android.view.ViewGroup) null);
            boolean z17 = c2Var.f94163n.size() == c2Var.f94162m.size();
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.riu);
            if (z17) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mfg);
            } else {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.mfi);
            }
            ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.ris)).setOnClickListener(new ap1.a1(z2Var));
            ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.rit)).setOnClickListener(new ap1.b1(z2Var, z17, c1Var, c2Var));
            z2Var.k(inflate, 0, 0);
            z2Var.C();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/backup/roambackup/uic/RoamDeleteContactBottomUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
