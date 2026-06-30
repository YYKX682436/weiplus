package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class xa implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f f211544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f211545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f211546f;

    public xa(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f211544d = activityC15047x3a53ff1f;
        this.f211545e = f0Var;
        this.f211546f = h0Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f = this.f211544d;
        int i17 = activityC15047x3a53ff1f.H;
        if (i17 != 2 || editable == null) {
            if (i17 == 1) {
                activityC15047x3a53ff1f.e7();
                return;
            }
            return;
        }
        android.widget.EditText editText = activityC15047x3a53ff1f.f210162u;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        ck5.f b17 = ck5.f.b(editText);
        int d76 = activityC15047x3a53ff1f.d7();
        b17.f124094f = 1;
        b17.f124093e = d76;
        b17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        b17.f124089a = true;
        b17.d(activityC15047x3a53ff1f);
        android.text.style.ForegroundColorSpan[] foregroundColorSpanArr = (android.text.style.ForegroundColorSpan[]) editable.getSpans(0, editable.length(), android.text.style.ForegroundColorSpan.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(foregroundColorSpanArr);
        for (android.text.style.ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            editable.removeSpan(foregroundColorSpan);
        }
        hc2.x0.g(editable.toString(), true, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.wa(editable));
        android.widget.EditText editText2 = activityC15047x3a53ff1f.f210162u;
        if (editText2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        android.text.Editable text = editText2.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        int i18 = 0;
        for (int i19 = 0; i19 < text.length(); i19++) {
            if (text.charAt(i19) == '\n') {
                i18++;
            }
        }
        int i27 = i18 + 1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i27);
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f211545e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModifyNameUI", "afterText change %d, %d", valueOf, java.lang.Integer.valueOf(f0Var.f391649d));
        int i28 = activityC15047x3a53ff1f.K;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f211546f;
        if (i27 > i28) {
            if (i27 > f0Var.f391649d) {
                f0Var.f391649d = i27;
                android.widget.EditText editText3 = activityC15047x3a53ff1f.f210162u;
                if (editText3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                    throw null;
                }
                java.lang.String str = (java.lang.String) h0Var.f391656d;
                editText3.setText(str != null ? str : "");
                android.widget.EditText editText4 = activityC15047x3a53ff1f.f210162u;
                if (editText4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
                    throw null;
                }
                java.lang.String str2 = (java.lang.String) h0Var.f391656d;
                editText4.setSelection(str2 != null ? str2.length() : 0);
            } else {
                h0Var.f391656d = editable.toString();
                f0Var.f391649d = i27;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f2 = this.f211544d;
            java.lang.String string = activityC15047x3a53ff1f2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d0x, activityC15047x3a53ff1f2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f5h));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.h7(activityC15047x3a53ff1f2, string, null, null, 6, null);
            return;
        }
        if (com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(editable.toString()) <= activityC15047x3a53ff1f.f210160J) {
            h0Var.f391656d = editable.toString();
            f0Var.f391649d = i27;
            return;
        }
        android.widget.EditText editText5 = activityC15047x3a53ff1f.f210162u;
        if (editText5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        java.lang.String str3 = (java.lang.String) h0Var.f391656d;
        editText5.setText(str3 != null ? str3 : "");
        android.widget.EditText editText6 = activityC15047x3a53ff1f.f210162u;
        if (editText6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("edit");
            throw null;
        }
        java.lang.String str4 = (java.lang.String) h0Var.f391656d;
        editText6.setSelection(str4 != null ? str4.length() : 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f3 = this.f211544d;
        java.lang.String string2 = activityC15047x3a53ff1f3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f.h7(activityC15047x3a53ff1f3, string2, null, null, 6, null);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        java.lang.Character C0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15047x3a53ff1f activityC15047x3a53ff1f = this.f211544d;
        if (activityC15047x3a53ff1f.H == 2 && i19 == 1) {
            boolean z17 = false;
            if (charSequence != null && (C0 = r26.p0.C0(charSequence, i17)) != null && C0.charValue() == '@') {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderModifyNameUI", "at auto goto");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_scene", 2);
                intent.putExtra("KEY_ENTER_SCENE", 1);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lk(activityC15047x3a53ff1f, 20001, intent, 3);
            }
        }
    }
}
