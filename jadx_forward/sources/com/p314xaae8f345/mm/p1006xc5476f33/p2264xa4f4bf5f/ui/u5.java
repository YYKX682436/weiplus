package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class u5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d f255876d;

    public u5(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d activityC18631x6637f79d) {
        this.f255876d = activityC18631x6637f79d;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18631x6637f79d activityC18631x6637f79d = this.f255876d;
        android.widget.EditText editText = activityC18631x6637f79d.f255063x;
        if (editText != null) {
            editText.removeTextChangedListener(activityC18631x6637f79d.f255065z);
        }
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(valueOf, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2);
        activityC18631x6637f79d.V6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivity", "afterTextChanged inputCount:" + e17);
        java.lang.String valueOf2 = java.lang.String.valueOf(editable);
        int i17 = activityC18631x6637f79d.f255061v;
        boolean z17 = false;
        if (e17 > i17) {
            java.lang.String h17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.h(valueOf2, i17);
            if (editable != null) {
                editable.replace(h17.length(), valueOf2.length(), "");
            }
            android.widget.TextView textView = activityC18631x6637f79d.B;
            if (textView != null) {
                textView.setVisibility(0);
            }
            bi4.d1 d1Var = activityC18631x6637f79d.f255051i;
            if (d1Var != null) {
                d1Var.f436480q++;
            }
        } else {
            android.widget.TextView textView2 = activityC18631x6637f79d.B;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            java.util.HashMap hashMap = activityC18631x6637f79d.f255058s;
            if (hashMap != null) {
                if (hashMap.containsKey(valueOf)) {
                    java.lang.String str = (java.lang.String) hashMap.get(valueOf);
                    bk4.f.V(bk4.i.a(), activityC18631x6637f79d.f255064y, str, null, null, null, false, false, 124, null);
                    activityC18631x6637f79d.f255050h = new lj4.d(valueOf, str);
                } else {
                    bk4.f.V(bk4.i.a(), activityC18631x6637f79d.f255064y, "userdefine", null, null, null, false, false, 124, null);
                    activityC18631x6637f79d.f255050h = new lj4.d(valueOf, "userdefine");
                }
            }
        }
        android.widget.EditText editText2 = activityC18631x6637f79d.f255063x;
        if (editText2 != null) {
            editText2.addTextChangedListener(activityC18631x6637f79d.f255065z);
        }
        android.view.View view = activityC18631x6637f79d.f255062w;
        android.widget.Button button = view != null ? (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.c9z) : null;
        if (button == null) {
            return;
        }
        if (editable != null && editable.length() == 0) {
            z17 = true;
        }
        button.setEnabled(!z17);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
