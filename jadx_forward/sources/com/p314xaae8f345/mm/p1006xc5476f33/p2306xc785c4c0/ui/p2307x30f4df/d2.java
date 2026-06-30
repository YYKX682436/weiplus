package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df;

/* loaded from: classes3.dex */
public class d2 implements p11.h {
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2307x30f4df.ActivityC18746x694b7935 activityC18746x694b7935) {
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap url = " + str);
        if (bVar == null || (bitmap = bVar.f441067d) == null || bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap bitmap is null");
            return null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap url is null");
            return null;
        }
        if (!(view instanceof android.widget.ImageView)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("micromsg.topstory.TopStoryUploadUI", "onProcessBitmap view not ImageView");
            return null;
        }
        if (bVar.f441067d.getWidth() < bVar.f441067d.getHeight()) {
            ((android.widget.ImageView) view).setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else {
            ((android.widget.ImageView) view).setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        return null;
    }
}
