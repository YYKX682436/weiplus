package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at4.k f262394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f262395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l f262396f;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m mVar, at4.k kVar, android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.l lVar) {
        this.f262394d = kVar;
        this.f262395e = imageView;
        this.f262396f = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        at4.k kVar = this.f262394d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(kVar.f95413c);
        android.widget.ImageView imageView = this.f262395e;
        if (K0) {
            int i17 = kVar.f95416f;
            if (i17 > 0) {
                imageView.setImageResource(i17);
                return;
            }
            return;
        }
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        gt4.c1 c1Var = new gt4.c1(kVar.f95413c);
        ((x60.e) fVar).getClass();
        imageView.setImageBitmap(x51.w0.d(c1Var));
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this.f262396f);
    }
}
