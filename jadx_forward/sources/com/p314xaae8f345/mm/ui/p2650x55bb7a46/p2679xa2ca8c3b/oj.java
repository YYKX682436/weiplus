package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class oj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as f286742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f286743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f286744f;

    public oj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar, java.lang.String str) {
        this.f286744f = c21908xb66fd105;
        this.f286742d = asVar;
        this.f286743e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.as asVar = this.f286742d;
        if (asVar.f284948e == null) {
            return;
        }
        int height = asVar.f284950f.getHeight();
        int width = asVar.f284950f.getWidth();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(width);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(height);
        java.lang.String str = this.f286743e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[fillHeaderVBackground] after post，url: %s, targetWidth：%s， targetHeight：%s", str, valueOf, valueOf2);
        if (height == 0 || width == 0) {
            this.f286744f.u1(asVar.f284948e);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = asVar.f284948e.getLayoutParams();
        layoutParams.height = height;
        layoutParams.width = width;
        asVar.f284948e.setLayoutParams(layoutParams);
        asVar.f284948e.setTag(com.p314xaae8f345.mm.R.id.k7p, str);
        android.graphics.Bitmap Bi = ((j70.e) ((k70.v) i95.n0.c(k70.v.class))).Bi(str);
        if (Bi == null) {
            ((j70.e) ((k70.g0) i95.n0.c(k70.g0.class))).Ui(str, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nj(this, height, width));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", " [fillHeaderVBackground]load] use cacheBitmap");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f286744f;
        android.widget.ImageView imageView = asVar.f284948e;
        java.lang.String str2 = this.f286743e;
        c21908xb66fd105.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qj(c21908xb66fd105, Bi, height, width, imageView, str2));
    }
}
