package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class t implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239473a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f239474b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f239475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 f239476d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 b0Var, int i17, java.lang.String str, android.widget.EditText editText) {
        this.f239476d = b0Var;
        this.f239473a = i17;
        this.f239474b = str;
        this.f239475c = editText;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.b0 b0Var = this.f239476d;
        android.widget.EditText editText = this.f239475c;
        java.lang.String str2 = this.f239474b;
        int i17 = this.f239473a;
        if (z17) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7058x50451a49 c7058x50451a49 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7058x50451a49();
            c7058x50451a49.f143661f = i17;
            c7058x50451a49.p(str2);
            c7058x50451a49.f143659d = 3L;
            c7058x50451a49.k();
            b0Var.f239174b.mo25076x67bff276(editText.getText().toString());
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7058x50451a49 c7058x50451a492 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7058x50451a49();
        c7058x50451a492.f143661f = i17;
        c7058x50451a492.p(str2);
        c7058x50451a492.f143659d = 2L;
        c7058x50451a492.k();
        editText.clearFocus();
        b0Var.f239174b.mo25075x3d6f0539();
    }
}
