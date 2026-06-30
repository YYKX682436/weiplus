package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.j f182268d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.j jVar) {
        this.f182268d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.j jVar = this.f182268d;
        db5.e1.i(jVar.f182274d.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.k7_, com.p314xaae8f345.mm.R.C30867xcad56011.k7u);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13590x9555381d activityC13590x9555381d = jVar.f182274d;
        android.graphics.Bitmap i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ra.i(activityC13590x9555381d.F, activityC13590x9555381d.E);
        android.widget.ImageView imageView = (android.widget.ImageView) jVar.f182274d.findViewById(com.p314xaae8f345.mm.R.id.f569099p12);
        if (imageView != null) {
            imageView.setImageBitmap(i17);
            imageView.setVisibility(0);
        }
    }
}
