package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f239516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 f239517e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 b0Var, android.widget.EditText editText) {
        this.f239517e = b0Var;
        this.f239516d = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.widget.EditText editText = this.f239516d;
        if (editText.length() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 b0Var = this.f239517e;
            if (b0Var.f239174b != null) {
                dialogInterface.dismiss();
                b0Var.f239174b.mo25076x67bff276(editText.getText().toString());
            }
        }
    }
}
