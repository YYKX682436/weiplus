package db5;

/* loaded from: classes.dex */
public class b3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.f3 f309825d;

    public b3(db5.f3 f3Var) {
        this.f309825d = f3Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        db5.f3 f3Var = this.f309825d;
        f3Var.M.removeTextChangedListener(this);
        if (editable != null) {
            java.lang.String obj = editable.toString();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
                f3Var.R.setVisibility(4);
                f3Var.D();
            } else {
                int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(obj);
                if (f17 > 0) {
                    android.widget.Button button = f3Var.N;
                    button.setEnabled(true);
                    android.content.Context context = f3Var.P;
                    button.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
                    button.setBackground(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk));
                } else {
                    f3Var.D();
                }
                com.p314xaae8f345.mm.ui.p2740x696c9db.v4.d(f3Var.Q, obj);
                int i17 = f3Var.Q;
                if (f17 > i17) {
                    int c17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.c(i17, obj);
                    if (c17 <= 0 || c17 >= f3Var.Q || c17 >= obj.length()) {
                        f3Var.R.setVisibility(4);
                    } else {
                        f3Var.M.setText(obj.substring(0, c17 + 1));
                        android.widget.EditText editText = f3Var.M;
                        editText.setSelection(editText.getText().length());
                        f3Var.R.setVisibility(0);
                        com.p314xaae8f345.mm.ui.jk.a();
                        f3Var.R.setText(f3Var.M.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9t, java.lang.Integer.valueOf(f3Var.Q / 2)));
                    }
                } else {
                    f3Var.R.setVisibility(4);
                }
            }
        } else {
            f3Var.R.setVisibility(4);
            f3Var.D();
        }
        f3Var.M.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
