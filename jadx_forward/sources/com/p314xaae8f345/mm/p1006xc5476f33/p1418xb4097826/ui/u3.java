package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class u3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 f211430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f211431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f211432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f211433g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f211434h;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2, int i17, android.widget.EditText editText, yz5.l lVar, android.widget.TextView textView) {
        this.f211430d = activityC15025x361cfff2;
        this.f211431e = i17;
        this.f211432f = editText;
        this.f211433g = lVar;
        this.f211434h = textView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        java.lang.String obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15025x361cfff2 activityC15025x361cfff2 = this.f211430d;
        int i17 = this.f211431e == 1 ? activityC15025x361cfff2.f210081x0 : activityC15025x361cfff2.f210084y0;
        android.widget.EditText editText = this.f211432f;
        ck5.f b17 = ck5.f.b(editText);
        b17.f124094f = 1;
        b17.f124093e = i17;
        b17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;
        b17.f124089a = true;
        b17.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.t3(this.f211434h, i17, activityC15025x361cfff2));
        android.text.Editable text = editText.getText();
        if (text == null || (obj = text.toString()) == null || (str = r26.n0.u0(obj).toString()) == null) {
            str = "";
        }
        this.f211433g.mo146xb9724478(str);
        editText.setTextColor(i65.a.d(activityC15025x361cfff2, com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
