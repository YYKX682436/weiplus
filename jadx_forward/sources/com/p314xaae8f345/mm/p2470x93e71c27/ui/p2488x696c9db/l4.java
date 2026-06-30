package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public class l4 implements x51.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 f273296d;

    public l4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 r4Var) {
        this.f273296d = r4Var;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 r4Var = this.f273296d;
        r4Var.f273403g.put(str, bitmap);
        android.widget.ImageView imageView = (android.widget.ImageView) r4Var.f273401e.get(str);
        if (imageView != null) {
            r4Var.f273402f.remove(imageView);
            r4Var.f273400d.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.k4(this, imageView, bitmap));
        }
        r4Var.f273401e.remove(str);
    }
}
