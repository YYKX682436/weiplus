package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class a implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 f295638d;

    public a(com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e16) {
        this.f295638d = viewOnFocusChangeListenerC22900x495c6e16;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e16 = this.f295638d;
        if (viewOnFocusChangeListenerC22900x495c6e16.a() != viewOnFocusChangeListenerC22900x495c6e16.f295616t) {
            viewOnFocusChangeListenerC22900x495c6e16.getClass();
        }
        viewOnFocusChangeListenerC22900x495c6e16.b();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.ViewOnFocusChangeListenerC22900x495c6e16 viewOnFocusChangeListenerC22900x495c6e16 = this.f295638d;
        if (viewOnFocusChangeListenerC22900x495c6e16.f295622z == 4 && viewOnFocusChangeListenerC22900x495c6e16.a()) {
            viewOnFocusChangeListenerC22900x495c6e16.f295622z = 0;
            viewOnFocusChangeListenerC22900x495c6e16.f295606g.m121590x49eb759d();
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
