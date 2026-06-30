package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f154295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.q f154296e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.q qVar, android.graphics.Bitmap bitmap) {
        this.f154296e = qVar;
        this.f154295d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.q qVar = this.f154296e;
        android.app.Dialog dialog = qVar.f154307b.f153968i;
        if (dialog != null && dialog.isShowing()) {
            qVar.f154307b.f153968i.dismiss();
        }
        android.graphics.Bitmap bitmap = this.f154295d;
        if (bitmap != null) {
            qVar.f154307b.U6(qVar.f154306a, bitmap);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PreviewHdHeadImg", "showAAImag onLoadImageEnd bm == null");
            qVar.f154307b.finish();
        }
    }
}
