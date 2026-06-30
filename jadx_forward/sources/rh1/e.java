package rh1;

/* loaded from: classes7.dex */
public class e extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f477162q;

    /* renamed from: r, reason: collision with root package name */
    public final rh1.d f477163r;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var) {
        super(null);
        this.f477163r = new rh1.d(this);
        this.f477162q = o6Var;
    }

    public static android.graphics.Bitmap u(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / 1.0f), (int) (bitmap.getHeight() / 1.0f), true);
        bitmap.recycle();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(90.0f);
        int width = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        zj0.a aVar = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar.c(java.lang.Boolean.TRUE);
        aVar.c(matrix);
        aVar.c(java.lang.Integer.valueOf(height));
        aVar.c(java.lang.Integer.valueOf(width));
        aVar.c(0);
        aVar.c(0);
        aVar.c(createScaledBitmap);
        java.lang.Object obj = new java.lang.Object();
        yj0.a.d(obj, aVar.b(), "com/tencent/mm/plugin/appbrand/multitask/AppBrandMultiTaskPageAdapter", "getScaledRotateBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar.a(0), ((java.lang.Integer) aVar.a(1)).intValue(), ((java.lang.Integer) aVar.a(2)).intValue(), ((java.lang.Integer) aVar.a(3)).intValue(), ((java.lang.Integer) aVar.a(4)).intValue(), (android.graphics.Matrix) aVar.a(5), ((java.lang.Boolean) aVar.a(6)).booleanValue());
        yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/appbrand/multitask/AppBrandMultiTaskPageAdapter", "getScaledRotateBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        createScaledBitmap.recycle();
        return createBitmap;
    }

    @Override // ak3.i, ak3.c
    public boolean c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f477162q;
        return !(o6Var != null ? o6Var.q2() : false);
    }

    @Override // ak3.i, ak3.c
    public void f(ak3.b bVar) {
        super.f(bVar);
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.m3.b(mo2157x19263085()) || mo2157x19263085().getResources().getConfiguration().orientation == 2) {
            return;
        }
        ((android.view.ViewGroup) mo2159xc2a54588().getParent()).setBackground(null);
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        if (!rh1.b.f477157a) {
            return super.g();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f477162q;
        return (o6Var.q2() || o6Var.e3() || o6Var.Q0() || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kf.a(o6Var)) ? false : true;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getActivity */
    public android.app.Activity mo2157x19263085() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f477162q;
        if (o6Var != null) {
            return o6Var.r0();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: Exception -> 0x007a, all -> 0x0107, TryCatch #2 {Exception -> 0x007a, blocks: (B:10:0x0012, B:12:0x0018, B:14:0x0022, B:16:0x0030, B:20:0x006f, B:22:0x0075, B:25:0x00de, B:27:0x00e4, B:29:0x00fc, B:31:0x007d, B:34:0x0092, B:37:0x00a2, B:39:0x00a8, B:41:0x00ae, B:43:0x00b8, B:46:0x00c0, B:47:0x0101, B:50:0x004a, B:52:0x0066), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de A[Catch: Exception -> 0x007a, all -> 0x0107, TryCatch #2 {Exception -> 0x007a, blocks: (B:10:0x0012, B:12:0x0018, B:14:0x0022, B:16:0x0030, B:20:0x006f, B:22:0x0075, B:25:0x00de, B:27:0x00e4, B:29:0x00fc, B:31:0x007d, B:34:0x0092, B:37:0x00a2, B:39:0x00a8, B:41:0x00ae, B:43:0x00b8, B:46:0x00c0, B:47:0x0101, B:50:0x004a, B:52:0x0066), top: B:9:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: Exception -> 0x007a, all -> 0x0107, TryCatch #2 {Exception -> 0x007a, blocks: (B:10:0x0012, B:12:0x0018, B:14:0x0022, B:16:0x0030, B:20:0x006f, B:22:0x0075, B:25:0x00de, B:27:0x00e4, B:29:0x00fc, B:31:0x007d, B:34:0x0092, B:37:0x00a2, B:39:0x00a8, B:41:0x00ae, B:43:0x00b8, B:46:0x00c0, B:47:0x0101, B:50:0x004a, B:52:0x0066), top: B:9:0x0012 }] */
    @Override // ak3.i, ak3.c
    /* renamed from: getBitmap */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap mo2158x12501425() {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rh1.e.mo2158x12501425():android.graphics.Bitmap");
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getContentView */
    public android.view.View mo2159xc2a54588() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f477162q;
        if (o6Var != null) {
            return o6Var.f156343s;
        }
        return null;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getMaskView */
    public android.view.View mo2161x8c409d27() {
        return mo2159xc2a54588();
    }

    @Override // ak3.i, ak3.c
    public void h(ak3.a aVar) {
        this.f87119h = aVar;
    }

    @Override // ak3.i, ak3.c
    public void j(boolean z17, jk3.e eVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f477162q;
        if (o6Var != null) {
            if (mo2157x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) mo2157x19263085()).A = !z17;
            }
            o6Var.G2();
        }
    }

    @Override // ak3.i, ak3.c
    public void l() {
    }

    @Override // ak3.i
    public boolean q() {
        if (rh1.b.f477157a) {
            return true;
        }
        return this instanceof pa3.r;
    }
}
