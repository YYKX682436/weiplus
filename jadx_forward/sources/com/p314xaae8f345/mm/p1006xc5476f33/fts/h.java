package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f218944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.i f218945f;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.fts.i iVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f218945f = iVar;
        this.f218943d = str;
        this.f218944e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.i iVar = this.f218945f;
        if (this.f218943d.equals(iVar.f218949a.getTag())) {
            t13.m mVar = new t13.m(iVar.f218950b.getResources(), this.f218944e);
            android.widget.ImageView imageView = iVar.f218949a;
            imageView.setImageDrawable(mVar);
            imageView.postInvalidate();
        }
    }
}
