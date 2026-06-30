package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

/* loaded from: classes5.dex */
public class e extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.d f225928f;

    public e(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
        C(1);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.d dVar = this.f225928f;
        if (dVar != null) {
            ((ra3.g) dVar).f475032a[0].dismiss();
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(80);
        android.view.Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = defaultDisplay.getWidth();
        getWindow().setAttributes(attributes);
    }
}
