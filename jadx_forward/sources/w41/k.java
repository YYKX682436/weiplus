package w41;

/* loaded from: classes15.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 f524402d;

    public k(com.p314xaae8f345.mm.p983xc3c3c8ee.ui.p985xb099fd48.C11220xb94149d6 c11220xb94149d6) {
        this.f524402d = c11220xb94149d6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/openim/ui/dialog/OpenIMKefuConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        v41.r rVar = this.f524402d.D1;
        if (rVar != null) {
            v41.h hVar = (v41.h) rVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmDialogUIModelImpl", "showConfirmDialog onConfirmClick");
            l41.m mVar = hVar.f514745a.f514738e;
            if (mVar != null) {
                ((l41.j1) mVar).d(hVar.f514746b);
            }
        }
        yj0.a.h(this, "com/tencent/mm/openim/ui/dialog/OpenIMKefuConfirmDialogView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
