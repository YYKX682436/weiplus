package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes12.dex */
public class j3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f282589d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f282590e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f282592g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 f282593h;

    public j3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var, java.lang.String str, int i17) {
        this.f282593h = k3Var;
        this.f282591f = str;
        this.f282592g = i17;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        android.view.View view;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = this.f282593h;
        if (k3Var.f282662m != null) {
            java.lang.String str = this.f282591f;
            if (!android.text.TextUtils.isEmpty(str)) {
                try {
                    if (k3Var.f282658f.containsKey(str)) {
                        int intValue = ((java.lang.Integer) k3Var.f282658f.get(str)).intValue();
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) k3Var.f282657e.get(intValue);
                        if (weakReference != null && (view = (android.view.View) weakReference.get()) != null && (view instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f)) {
                            java.lang.String str2 = (java.lang.String) k3Var.f282661i.get(intValue);
                            this.f282590e = true;
                            k3Var.f282672w.mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.i3(this, view, str2));
                            return true;
                        }
                    }
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2) k3Var.f282662m).getClass();
                    this.f282589d = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.t2.r(str);
                    return true;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ImageGalleryLazyLoader", "try to load Bmp fail: %s", e17.getMessage());
                    this.f282589d = null;
                }
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean b() {
        int i17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var = this.f282593h;
        k3Var.f282673x = false;
        if (!this.f282590e) {
            java.util.HashMap hashMap = k3Var.f282658f;
            java.lang.String str = this.f282591f;
            if (hashMap.containsKey(str)) {
                int intValue = ((java.lang.Integer) hashMap.get(str)).intValue();
                if (k3Var.f282662m != null || k3Var.f282663n == 0) {
                    k3Var.a(intValue, this.f282589d);
                } else {
                    k3Var.f282660h.put(intValue, this.f282589d);
                }
            }
            k3Var.h(str, this.f282589d);
            k3Var.d(this.f282592g, this.f282589d);
            java.lang.Object[] objArr = new java.lang.Object[1];
            android.graphics.Bitmap bitmap = this.f282589d;
            if (bitmap == null || bitmap.isRecycled()) {
                i17 = 0;
            } else {
                i17 = bitmap.getByteCount();
                if (i17 < 0) {
                    throw new java.lang.IllegalStateException("Negative size: " + bitmap);
                }
            }
            objArr[0] = java.lang.Integer.valueOf(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryLazyLoader", "bmp size : %s", objArr);
            this.f282589d = null;
        }
        k3Var.g();
        return false;
    }
}
