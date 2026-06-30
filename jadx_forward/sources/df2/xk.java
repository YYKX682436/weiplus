package df2;

/* loaded from: classes3.dex */
public final class xk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f313317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15222x82447cec f313318e;

    public xk(df2.pl plVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15222x82447cec c15222x82447cec) {
        this.f313317d = plVar;
        this.f313318e = c15222x82447cec;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df2.pl plVar = this.f313317d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15222x82447cec c15222x82447cec = plVar.f312633z;
        if (c15222x82447cec != null) {
            c15222x82447cec.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f313318e.getContext().getSystemService("input_method");
        if (plVar.G || inputMethodManager == null) {
            return;
        }
        inputMethodManager.showSoftInput(plVar.f312633z, 0);
    }
}
