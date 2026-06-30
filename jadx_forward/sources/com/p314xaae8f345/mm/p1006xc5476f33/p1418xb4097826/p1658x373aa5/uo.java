package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class uo implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f214745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp f214746f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f214747g;

    public uo(android.view.View view, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp cpVar, android.content.Context context) {
        this.f214744d = view;
        this.f214745e = c22621x7603e017;
        this.f214746f = cpVar;
        this.f214747g = context;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if ((editable != null ? editable.length() : -1) > 8 && editable != null) {
            editable.delete(editable.length() - 1, editable.length());
        }
        android.view.View view = this.f214744d;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jda);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f214745e;
            int parseInt = c22621x7603e017.getText().toString().length() == 0 ? -1 : java.lang.Integer.parseInt(c22621x7603e017.getText().toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp cpVar = this.f214746f;
            android.content.Context context = this.f214747g;
            if (parseInt == -1 || (parseInt <= cpVar.f213329h && parseInt >= 1)) {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
                textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572934cz5, java.lang.Integer.valueOf(cpVar.f213329h)));
                ((android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.b2z)).setEnabled(parseInt != -1);
            } else {
                textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23));
                textView.setText(context.getString(parseInt < 1 ? com.p314xaae8f345.mm.R.C30867xcad56011.cz6 : com.p314xaae8f345.mm.R.C30867xcad56011.f572933cz4, java.lang.Integer.valueOf(cpVar.f213329h)));
                ((android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.b2z)).setEnabled(false);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
