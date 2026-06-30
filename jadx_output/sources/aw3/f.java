package aw3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk0.n f14837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl.f0 f14838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xk0.n nVar, dl.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f14837d = nVar;
        this.f14838e = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aw3.f(this.f14837d, this.f14838e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        aw3.f fVar = (aw3.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap t17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xk0.n nVar = this.f14837d;
        nVar.f454997J = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = nVar.H;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e(nVar.F(), "readBitmapFromPath: failed, path null");
            int width = nVar.I().getWidth();
            int height = nVar.I().getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/items/PictureItem", "readBitmapFromPath", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            t17 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, t17, "com/tencent/mm/items/PictureItem", "readBitmapFromPath", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(t17, "createBitmap(...)");
        } else {
            t17 = com.tencent.mm.sdk.platformtools.x.t(str, nVar.I().getHeight(), nVar.I().getWidth(), true, false);
            if (t17 == null) {
                com.tencent.mars.xlog.Log.e(nVar.F(), "readBitmapFromPath: failed w:" + nVar.I().getWidth() + ", h:" + nVar.I().getHeight() + ", path:" + str);
                t17 = com.tencent.mm.sdk.platformtools.x.m(nVar.I().getWidth(), nVar.I().getHeight(), android.graphics.Bitmap.Config.ARGB_8888, false);
                kotlin.jvm.internal.o.f(t17, "createBitmap(...)");
            } else {
                com.tencent.mars.xlog.Log.i(nVar.F(), "readBitmapFromPath success, " + java.lang.Thread.currentThread().getName() + ", w:" + nVar.I().getWidth() + ", h:" + nVar.I().getHeight() + ", path:" + str + ' ');
            }
        }
        nVar.f454952g = t17;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.K0(nVar.I) ? false : com.tencent.mm.sdk.platformtools.x.D0(nVar.f454952g, 100, android.graphics.Bitmap.CompressFormat.PNG, nVar.I, false);
        long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
        com.tencent.mars.xlog.Log.i(nVar.F(), "loadBitmapFromReadFile: [" + nVar.f454952g.hashCode() + "] saveResult=" + D0 + ", readBitmapTimeCost=" + currentTimeMillis2 + "ms, saveTimeCost=" + currentTimeMillis4 + "ms, " + nVar.I);
        nVar.F = true;
        this.f14838e.r();
        return jz5.f0.f302826a;
    }
}
