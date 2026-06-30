package ws3;

/* loaded from: classes9.dex */
public class k implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public boolean f530719d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd f530720e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd) {
        this.f530720e = viewOnFocusChangeListenerC16962x770823dd;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.ViewOnFocusChangeListenerC16962x770823dd viewOnFocusChangeListenerC16962x770823dd = this.f530720e;
        if (viewOnFocusChangeListenerC16962x770823dd.b() != this.f530719d) {
            ws3.q qVar = viewOnFocusChangeListenerC16962x770823dd.f236700i;
            if (qVar != null) {
                boolean b17 = viewOnFocusChangeListenerC16962x770823dd.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.h0 h0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.h0) qVar;
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16959x6229db69 activityC16959x6229db69 = h0Var.f236722a;
                if (b17) {
                    activityC16959x6229db69.mo48674x36654fab();
                    java.lang.String a17 = vs3.b.a(activityC16959x6229db69.f236637g.m67852xfb85ada3());
                    if (a17 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneRechargeUI", "null phone, return");
                    } else {
                        s75.d.f486168a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.e0(h0Var, a17), "search_matched_mobile", true);
                        if (activityC16959x6229db69.L) {
                            activityC16959x6229db69.L = false;
                        } else {
                            activityC16959x6229db69.L = true;
                        }
                    }
                } else {
                    activityC16959x6229db69.f236637g.m67853x310592d0().setText("");
                    activityC16959x6229db69.f236637g.m67853x310592d0().setTextColor(activityC16959x6229db69.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
                    activityC16959x6229db69.f236652y = "";
                    activityC16959x6229db69.Z6();
                    activityC16959x6229db69.a7(false, false);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC16959x6229db69.f236637g.m67852xfb85ada3())) {
                        ((android.widget.AutoCompleteTextView) activityC16959x6229db69.f236637g.m67842xd454f3ba()).showDropDown();
                    }
                }
            }
            this.f530719d = viewOnFocusChangeListenerC16962x770823dd.b();
        }
        viewOnFocusChangeListenerC16962x770823dd.c();
    }
}
