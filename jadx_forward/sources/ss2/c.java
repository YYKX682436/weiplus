package ss2;

/* loaded from: classes10.dex */
public final class c implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.d f493462d;

    public c(ss2.d dVar) {
        this.f493462d = dVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        ss2.d dVar = this.f493462d;
        if (editable != null && dVar.b().getSelectionStart() > 0) {
            dVar.b().getSelectionStart();
        }
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(dVar.f493469i * 2, java.lang.String.valueOf(editable)) / 2;
        int i17 = dVar.f493469i - b17;
        dVar.f493468h = i17;
        dVar.f493467g = i17 != 0;
        if (i17 / r1 >= 0.95d) {
            android.widget.TextView c17 = dVar.c();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(dVar.f493468h);
            sb6.append('/');
            sb6.append(dVar.f493469i);
            c17.setText(sb6.toString());
            if (dVar.f493468h > dVar.f493469i) {
                dVar.c().setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                dVar.f493467g = false;
            } else {
                dVar.c().setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            }
            dVar.c().setVisibility(0);
        } else {
            dVar.c().setText("");
            dVar.c().setVisibility(8);
        }
        dVar.a();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
