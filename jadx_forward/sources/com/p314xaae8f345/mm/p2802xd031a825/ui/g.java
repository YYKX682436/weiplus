package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class g implements android.app.DatePickerDialog.OnDateSetListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.h f295715a;

    public g(com.p314xaae8f345.mm.p2802xd031a825.ui.h hVar) {
        this.f295715a = hVar;
    }

    @Override // android.app.DatePickerDialog.OnDateSetListener
    public void onDateSet(android.widget.DatePicker datePicker, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.h hVar = this.f295715a;
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e16 = hVar.f295720d;
        if (i17 >= viewOnFocusChangeListenerC22900x495c6e16.B || i18 >= viewOnFocusChangeListenerC22900x495c6e16.C) {
            java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("00");
            if (c01.z1.I()) {
                hVar.f295720d.f295621y = decimalFormat.format(i18 + 1) + i17;
            } else {
                hVar.f295720d.f295621y = decimalFormat.format(i17).substring(2) + decimalFormat.format(i18 + 1);
            }
            hVar.f295720d.f295606g.setText(decimalFormat.format(i18 + 1) + decimalFormat.format(i17).substring(2));
        } else {
            db5.e1.s(viewOnFocusChangeListenerC22900x495c6e16.getContext(), hVar.f295720d.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.kli), null);
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e162 = hVar.f295720d;
        viewOnFocusChangeListenerC22900x495c6e162.f295616t = viewOnFocusChangeListenerC22900x495c6e162.a();
        hVar.f295720d.getClass();
    }
}
