package qp5;

/* loaded from: classes9.dex */
public class a0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f447363d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f447364e;

    public a0(com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2) {
        this.f447364e = viewOnFocusChangeListenerC22907xe18534c2;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        boolean startsWith = obj.startsWith(".");
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f447364e;
        if (startsWith) {
            editable.insert(0, "0");
        } else if (viewOnFocusChangeListenerC22907xe18534c2.U && com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.f(obj, viewOnFocusChangeListenerC22907xe18534c2.f295694h)) {
            return;
        }
        boolean n17 = viewOnFocusChangeListenerC22907xe18534c2.n();
        qp5.i0 i0Var = viewOnFocusChangeListenerC22907xe18534c2.f295698n;
        if (i0Var != null) {
            if (n17 != this.f447363d) {
                i0Var.mo9068x194c4a1(n17);
                this.f447363d = viewOnFocusChangeListenerC22907xe18534c2.n();
            }
            qp5.i0 i0Var2 = viewOnFocusChangeListenerC22907xe18534c2.f295698n;
        }
        viewOnFocusChangeListenerC22907xe18534c2.s();
        if (viewOnFocusChangeListenerC22907xe18534c2.f295706t) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.a(viewOnFocusChangeListenerC22907xe18534c2, editable);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        qp5.k0 k0Var = this.f447364e.f295690d;
        if (k0Var != null) {
            k0Var.a(charSequence);
        }
    }
}
