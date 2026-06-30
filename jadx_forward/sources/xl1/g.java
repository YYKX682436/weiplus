package xl1;

/* loaded from: classes7.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb f536639d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb c12811x748ecb) {
        this.f536639d = c12811x748ecb;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.sms.C12811x748ecb c12811x748ecb = this.f536639d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) c12811x748ecb.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            c12811x748ecb.f173644e.requestFocus();
            inputMethodManager.showSoftInput(c12811x748ecb.f173644e, 0);
        }
    }
}
