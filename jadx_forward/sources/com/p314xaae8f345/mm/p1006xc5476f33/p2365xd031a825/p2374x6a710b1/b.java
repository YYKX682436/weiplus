package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l f262383d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f262384e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f262385f;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l lVar, android.widget.ImageView imageView, android.graphics.Bitmap bitmap) {
        this.f262383d = lVar;
        this.f262384e = imageView;
        this.f262385f = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f262383d.f262447d;
        android.widget.ImageView imageView = this.f262384e;
        java.lang.String str = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.pbo);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || ((c01.z1.I() || !str.equals(c19091x9511676c.f69223x58802fcb)) && !(c01.z1.I() && str.equals(c19091x9511676c.f69217xaef0808c)))) {
            java.lang.String str2 = c19091x9511676c.f69223x58802fcb;
        } else {
            imageView.setImageBitmap(this.f262385f);
        }
    }
}
