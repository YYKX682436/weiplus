package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes10.dex */
public final class ua implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f255883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255884e;

    public ua(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078) {
        this.f255883d = bitmap;
        this.f255884e = activityC18639xf6f98078;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f255883d;
        int width = bitmap.getWidth();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255884e;
        if (width != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
            if (activityC18639xf6f98078.q7().getWidth() != 0) {
                float height = bitmap.getHeight() / bitmap.getWidth();
                float height2 = activityC18639xf6f98078.q7().getHeight() / activityC18639xf6f98078.q7().getWidth();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "setForegroundPic vpic post end " + bitmap.getWidth() + ' ' + bitmap.getHeight() + ' ' + height + ' ' + activityC18639xf6f98078.q7().getWidth() + ' ' + activityC18639xf6f98078.q7().getHeight() + ' ' + height2);
                if (height > height2) {
                    activityC18639xf6f98078.J7(bitmap);
                    return;
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setForegroundPic vpic post end ");
        sb6.append(bitmap.getWidth());
        sb6.append(' ');
        sb6.append(bitmap.getHeight());
        sb6.append(' ');
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d8 d8Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078.f255099u2;
        sb6.append(activityC18639xf6f98078.q7().getWidth());
        sb6.append(' ');
        sb6.append(activityC18639xf6f98078.q7().getHeight());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", sb6.toString());
        um5.d dVar = new um5.d();
        dVar.b(bitmap);
        int width2 = activityC18639xf6f98078.q7().getWidth();
        int height3 = activityC18639xf6f98078.q7().getHeight();
        dVar.f510674b = width2;
        dVar.f510675c = height3;
        dVar.f510677e.f510726b.d();
        dVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ta(activityC18639xf6f98078));
    }
}
