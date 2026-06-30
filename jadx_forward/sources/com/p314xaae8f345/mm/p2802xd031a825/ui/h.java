package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 f295720d;

    public h(com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e16) {
        this.f295720d = viewOnFocusChangeListenerC22900x495c6e16;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/EditHintView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e16 = this.f295720d;
        if (viewOnFocusChangeListenerC22900x495c6e16.A == null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(java.lang.System.currentTimeMillis());
            calendar.add(2, 1);
            viewOnFocusChangeListenerC22900x495c6e16.B = calendar.get(1);
            viewOnFocusChangeListenerC22900x495c6e16.C = calendar.get(2);
            viewOnFocusChangeListenerC22900x495c6e16.A = new al5.j1(viewOnFocusChangeListenerC22900x495c6e16.getContext(), 3, new com.p314xaae8f345.mm.p2802xd031a825.ui.g(this), viewOnFocusChangeListenerC22900x495c6e16.B, viewOnFocusChangeListenerC22900x495c6e16.C, calendar.get(5), calendar.getTimeInMillis());
        }
        viewOnFocusChangeListenerC22900x495c6e16.A.show();
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/EditHintView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
