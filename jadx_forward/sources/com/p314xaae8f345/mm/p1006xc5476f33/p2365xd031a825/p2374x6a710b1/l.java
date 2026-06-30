package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

/* loaded from: classes9.dex */
public class l implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f262447d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f262448e;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f262452i;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f262449f = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f262450g = null;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f262451h = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f262453m = false;

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c;
        if (android.text.TextUtils.isEmpty(this.f262452i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BankcardLogoHelper", "mBankcardLogoUrl is empty");
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f262448e;
        if (weakReference != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) weakReference.get();
            if (imageView != null) {
                imageView.getTag();
            }
            if (imageView == null || str == null || !str.equals(this.f262452i)) {
                return;
            }
            if (!this.f262453m) {
                imageView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.k(this, imageView, bitmap));
                imageView.setTag(com.p314xaae8f345.mm.R.id.pbo, null);
            } else {
                if (imageView.getTag(com.p314xaae8f345.mm.R.id.pbo) == null || (c19091x9511676c = this.f262447d) == null || c19091x9511676c.f69223x58802fcb == null) {
                    return;
                }
                java.lang.String str2 = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.pbo);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || !str2.equals(this.f262447d.f69223x58802fcb)) {
                    return;
                }
                imageView.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.j(this, imageView, bitmap));
                imageView.setTag(com.p314xaae8f345.mm.R.id.pbo, null);
            }
        }
    }
}
