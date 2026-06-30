package cf2;

/* loaded from: classes3.dex */
public class d implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cf2.h f40907d;

    public d(cf2.h hVar) {
        this.f40907d = hVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        cf2.h hVar = this.f40907d;
        hVar.M.removeTextChangedListener(this);
        if (editable != null) {
            java.lang.String obj = editable.toString();
            if (com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
                hVar.Q.setVisibility(4);
                hVar.D();
            } else if (com.tencent.mm.ui.tools.v4.f(obj) > 120) {
                int c17 = com.tencent.mm.ui.tools.v4.c(120, obj);
                if (c17 <= 0 || c17 >= 120 || c17 >= obj.length()) {
                    hVar.Q.setVisibility(4);
                    hVar.D();
                } else {
                    hVar.M.setText(obj.substring(0, c17 + 1));
                    android.widget.EditText editText = hVar.M;
                    editText.setSelection(editText.getText().length());
                    hVar.Q.setVisibility(0);
                    hVar.Q.setText(hVar.M.getContext().getString(com.tencent.mm.R.string.g9u, 60));
                    android.widget.Button button = hVar.N;
                    button.setEnabled(false);
                    android.content.Context context = hVar.P;
                    button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                    button.setBackground(context.getDrawable(com.tencent.mm.R.drawable.f481068jy));
                }
            } else {
                hVar.Q.setVisibility(4);
                hVar.D();
            }
        } else {
            hVar.Q.setVisibility(4);
            hVar.D();
        }
        hVar.M.addTextChangedListener(this);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
