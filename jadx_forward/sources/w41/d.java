package w41;

/* loaded from: classes15.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f f524387d;

    public d(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11219x5502277f c11219x5502277f) {
        this.f524387d = c11219x5502277f;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ab0.r rVar = this.f524387d.C1;
        if (rVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n0 n0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.n0) rVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewContactWidgetNormal", "confirmDialog onConfirmClick");
            n0Var.f235072e.d(n0Var.f235069b, n0Var.f235070c, n0Var.f235071d, true, "");
            ((w41.c) n0Var.f235068a).dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
