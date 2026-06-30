package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class d30 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f215607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f215608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f215609f;

    public d30(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var, android.widget.TextView textView) {
        this.f215607d = bitmap;
        this.f215608e = f50Var;
        this.f215609f = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f215607d;
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.f50 f50Var = this.f215608e;
            int dimension = (int) f50Var.m80379x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            android.widget.TextView textView = this.f215609f;
            if (textView == null) {
                return;
            }
            java.lang.String string = f50Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            textView.setText(hc2.x0.l(string, f50Var.m80379x76847179(), '#', new android.graphics.drawable.BitmapDrawable(bitmap), com.p314xaae8f345.mm.R.C30859x5a72f63.a0c, dimension, 0, 0, 0, 224, null));
        }
    }
}
