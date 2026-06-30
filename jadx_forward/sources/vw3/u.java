package vw3;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI f522661d;

    public u(com.tencent.mm.plugin.repairer.ui.RepairerBlockDetectUI repairerBlockDetectUI) {
        this.f522661d = repairerBlockDetectUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        em.u2 U6 = this.f522661d.U6();
        if (U6.f336378c == null) {
            U6.f336378c = (android.widget.EditText) U6.f336376a.findViewById(com.p314xaae8f345.mm.R.id.vec);
        }
        java.lang.String obj = U6.f336378c.getText().toString();
        ix3.i.f376967j.b().f376976g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(obj, 32L);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerBlockDetectUI$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
