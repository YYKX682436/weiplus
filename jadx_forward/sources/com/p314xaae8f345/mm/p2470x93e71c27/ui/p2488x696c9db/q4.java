package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f273384d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f273385e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 f273386f;

    public q4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 r4Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g4 g4Var) {
        this.f273386f = r4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f273384d != null) {
            android.graphics.Bitmap bitmap = this.f273385e;
            if (bitmap == null || !bitmap.isRecycled()) {
                if (this.f273385e != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEngine", "RenderJob imageView width:%s, height:%s, bmp width:%s, height:%s", java.lang.Integer.valueOf(this.f273384d.getWidth()), java.lang.Integer.valueOf(this.f273384d.getHeight()), java.lang.Integer.valueOf(this.f273385e.getWidth()), java.lang.Integer.valueOf(this.f273385e.getHeight()));
                }
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p4.a(this.f273384d, this.f273385e);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p4.a(this.f273384d, null);
            }
        }
        this.f273384d = null;
        this.f273385e = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f273386f.f273405i.f273325c;
        n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(1, this));
    }
}
