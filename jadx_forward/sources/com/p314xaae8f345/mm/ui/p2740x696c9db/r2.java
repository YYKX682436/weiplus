package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes5.dex */
public class r2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s2 f292200d;

    public r2(com.p314xaae8f345.mm.ui.p2740x696c9db.s2 s2Var) {
        this.f292200d = s2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.p2740x696c9db.s2 s2Var = this.f292200d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("CropImage_OutputPath", s2Var.f292222d.getIntent().getStringExtra("CropImage_OutputPath"));
            intent.putExtra("OP_CODE", 1);
            s2Var.f292222d.setResult(-1, intent);
            s2Var.f292222d.finish();
            return;
        }
        if (itemId != 1) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("CropImage_OutputPath", s2Var.f292222d.getIntent().getStringExtra("CropImage_OutputPath"));
        intent2.putExtra("OP_CODE", 2);
        s2Var.f292222d.setResult(-1, intent2);
        s2Var.f292222d.finish();
    }
}
