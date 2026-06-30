package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f241139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f241140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 f241141f;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f241141f = activityC17301x38c077a3;
        this.f241139d = str;
        this.f241140e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3 = this.f241141f;
        java.lang.String str = activityC17301x38c077a3.f240852q.f69643x7b28c57e;
        java.lang.String str2 = this.f241139d;
        boolean equals = str2.equals(str);
        android.graphics.Bitmap bitmap = this.f241140e;
        if (equals && activityC17301x38c077a3.f240843e != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.scanner.ProductUI", "onGetPictureFinish: notifyKey=" + str2);
            try {
                activityC17301x38c077a3.f240843e.setImageBitmap(bitmap);
                activityC17301x38c077a3.f240843e.setBackgroundDrawable(null);
                activityC17301x38c077a3.f240843e.setBackgroundColor(-1);
                activityC17301x38c077a3.h7();
                activityC17301x38c077a3.getClass();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ProductUI", "onGetPictureFinish : [%s]", e17.getLocalizedMessage());
            }
        }
        if (!str2.equals(activityC17301x38c077a3.f240852q.f69634x4e41914f) || (imageView = activityC17301x38c077a3.f240844f) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }
}
