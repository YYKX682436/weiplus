package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class b extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a f228265f;

    public b(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575676fd);
        C(1);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.a aVar = this.f228265f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(80);
        getWindow().setSoftInputMode(48);
        android.view.Display defaultDisplay = getWindow().getWindowManager().getDefaultDisplay();
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = defaultDisplay.getWidth();
        attributes.height = defaultDisplay.getHeight();
        getWindow().setAttributes(attributes);
    }
}
