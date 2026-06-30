package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class dh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f210607d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15067xece7b73a f210608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 f210609f;

    public dh(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15067xece7b73a activityC15067xece7b73a, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54) {
        this.f210607d = bitmap;
        this.f210608e = activityC15067xece7b73a;
        this.f210609f = c21549x15041e54;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f210607d;
        if (bitmap != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15067xece7b73a activityC15067xece7b73a = this.f210608e;
            int dimension = (int) activityC15067xece7b73a.mo55332x76847179().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 c21549x15041e54 = this.f210609f;
            if (c21549x15041e54 == null) {
                return;
            }
            java.lang.String string = activityC15067xece7b73a.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cuo);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15067xece7b73a.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            c21549x15041e54.L(hc2.x0.l(string, mo55332x76847179, '#', new android.graphics.drawable.BitmapDrawable(bitmap), com.p314xaae8f345.mm.R.C30859x5a72f63.a0c, dimension, 0, 0, 0, 224, null));
        }
    }
}
