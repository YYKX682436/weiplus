package db5;

/* loaded from: classes11.dex */
public class j6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a f309942d;

    public j6(com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a) {
        this.f309942d = c21516xe823d84a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a c21516xe823d84a = this.f309942d;
        db5.t6 t6Var = c21516xe823d84a.C;
        if (t6Var != null) {
            t6Var.g(obj);
        }
        if (c21516xe823d84a.c(c21516xe823d84a.F, editable, obj, this).length() <= 0) {
            c21516xe823d84a.F.setBackground(null);
            return;
        }
        c21516xe823d84a.h();
        if (c21516xe823d84a.I) {
            return;
        }
        c21516xe823d84a.F.setBackground(c21516xe823d84a.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563444aj2));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
