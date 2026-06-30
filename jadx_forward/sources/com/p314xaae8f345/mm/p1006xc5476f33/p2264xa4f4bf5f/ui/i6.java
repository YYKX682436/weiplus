package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class i6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255507d;

    public i6(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        this.f255507d = activityC18635xb8188ef9;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255507d;
        android.widget.EditText editText = activityC18635xb8188ef9.f255094y1;
        if (editText != null) {
            editText.removeTextChangedListener(activityC18635xb8188ef9.A1);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC18635xb8188ef9.C;
        if (c22621x7603e017 != null) {
            c22621x7603e017.removeTextChangedListener(activityC18635xb8188ef9.A1);
        }
        java.lang.String valueOf = java.lang.String.valueOf(editable);
        boolean z17 = false;
        h12.m mVar = new h12.m(java.lang.String.valueOf(editable), 0);
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        int a17 = mVar.a(t4Var);
        activityC18635xb8188ef9.W6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "afterTextChanged inputCount:" + a17);
        java.lang.String.valueOf(editable);
        int i17 = activityC18635xb8188ef9.f255081p1;
        if (a17 > i17) {
            java.lang.String b17 = mVar.b(i17, t4Var);
            android.widget.EditText editText2 = activityC18635xb8188ef9.C;
            if (editText2 == null && (editText2 = activityC18635xb8188ef9.f255094y1) == null) {
                editText2 = null;
            }
            if (editText2 != null) {
                editText2.setText(pg5.d.a(activityC18635xb8188ef9, b17));
                editText2.setSelection(editText2.getText().length());
            }
            bi4.d1 d1Var = activityC18635xb8188ef9.f255077n;
            if (d1Var != null) {
                d1Var.f436480q++;
            }
            android.widget.TextView textView = activityC18635xb8188ef9.b7().f254944m;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView2 = activityC18635xb8188ef9.f255071f;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = activityC18635xb8188ef9.f255070e;
            if (c22849x81a93d25 != null) {
                c22849x81a93d25.performHapticFeedback(3, 2);
            }
        } else {
            android.widget.TextView textView3 = activityC18635xb8188ef9.b7().f254944m;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
            android.widget.TextView textView4 = activityC18635xb8188ef9.f255071f;
            if (textView4 != null) {
                textView4.setVisibility(4);
            }
            java.util.HashMap hashMap = activityC18635xb8188ef9.Z;
            if (hashMap != null) {
                if (activityC18635xb8188ef9.c7().z()) {
                    if (hashMap.containsKey(valueOf)) {
                        java.lang.String str = (java.lang.String) hashMap.get(valueOf);
                        activityC18635xb8188ef9.N = str != null ? str : "userdefine";
                        bk4.f.V(activityC18635xb8188ef9.c7(), activityC18635xb8188ef9.F, activityC18635xb8188ef9.N, null, null, null, false, false, 124, null);
                    } else {
                        activityC18635xb8188ef9.N = "userdefine";
                        bk4.f.V(activityC18635xb8188ef9.c7(), activityC18635xb8188ef9.F, activityC18635xb8188ef9.N, null, null, null, false, false, 124, null);
                    }
                } else if (activityC18635xb8188ef9.c7().x()) {
                    if (hashMap.containsKey(valueOf)) {
                        java.lang.String str2 = (java.lang.String) hashMap.get(valueOf);
                        bk4.f.V(bk4.i.a(), activityC18635xb8188ef9.f255096z1, str2, null, null, null, false, false, 124, null);
                        activityC18635xb8188ef9.f255076m = new lj4.d(valueOf, str2);
                    } else {
                        bk4.f.V(bk4.i.a(), activityC18635xb8188ef9.f255096z1, "userdefine", null, null, null, false, false, 124, null);
                        activityC18635xb8188ef9.f255076m = new lj4.d(valueOf, "userdefine");
                    }
                }
            }
        }
        android.widget.EditText editText3 = activityC18635xb8188ef9.f255094y1;
        if (editText3 != null) {
            editText3.addTextChangedListener(activityC18635xb8188ef9.A1);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC18635xb8188ef9.C;
        if (c22621x7603e0172 != null) {
            c22621x7603e0172.addTextChangedListener(activityC18635xb8188ef9.A1);
        }
        android.view.View view = activityC18635xb8188ef9.f255091x1;
        android.widget.Button button = view != null ? (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.c9z) : null;
        if (button != null) {
            if (editable != null && editable.length() == 0) {
                z17 = true;
            }
            button.setEnabled(!z17);
        }
        activityC18635xb8188ef9.Y6();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = activityC18635xb8188ef9.C;
        if (c22621x7603e0173 != null) {
            c22621x7603e0173.getText();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.String obj;
        java.util.Objects.toString(charSequence);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255507d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC18635xb8188ef9.C;
        if (c22621x7603e017 != null) {
            boolean z17 = false;
            if (charSequence != null && (obj = charSequence.toString()) != null) {
                if (!(obj.length() == 0)) {
                    z17 = true;
                }
            }
            if (z17) {
                c22621x7603e017.setHint("");
            } else {
                c22621x7603e017.setHint(activityC18635xb8188ef9.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jva));
            }
        }
    }
}
