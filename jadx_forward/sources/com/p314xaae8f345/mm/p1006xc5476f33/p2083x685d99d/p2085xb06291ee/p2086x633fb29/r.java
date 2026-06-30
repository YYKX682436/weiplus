package com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29;

/* loaded from: classes13.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f243976d = new java.lang.ref.WeakReference(null);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s f243977e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.b bVar) {
        this.f243977e = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.s sVar = this.f243977e;
        try {
            sVar.getClass();
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(sVar.hashCode());
            objArr[1] = java.lang.Integer.valueOf(hashCode());
            sVar.getClass();
            objArr[2] = true;
            objArr[3] = java.lang.Boolean.valueOf(sVar.f243986i == null);
            objArr[4] = java.lang.Boolean.valueOf(this.f243976d.get() == null);
            sVar.getClass();
            objArr[5] = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SightPlayController", "#0x%x-#0x%x want draw thumb, but surface status error, surface null ? %B, thumb bgView null ? %B, thumb null ? %B, mask null ? %B", objArr);
            sVar.getClass();
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) this.f243976d.get();
            java.lang.ref.WeakReference weakReference = sVar.f243986i;
            android.view.View view = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view != null && bitmap != null && !bitmap.isRecycled()) {
                view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2085xb06291ee.p2086x633fb29.q(this, view, bitmap));
                return;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[2];
            objArr2[0] = java.lang.Boolean.valueOf(view == null);
            objArr2[1] = java.lang.Boolean.valueOf(bitmap == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SightPlayController", "bgView:%B, thumb:%B", objArr2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightPlayController", e17, "", new java.lang.Object[0]);
        }
    }
}
