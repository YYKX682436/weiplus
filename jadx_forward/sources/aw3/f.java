package aw3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk0.n f96370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl.f0 f96371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xk0.n nVar, dl.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96370d = nVar;
        this.f96371e = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aw3.f(this.f96370d, this.f96371e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        aw3.f fVar = (aw3.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        fVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap t17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xk0.n nVar = this.f96370d;
        nVar.f536530J = true;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String str = nVar.H;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(nVar.F(), "readBitmapFromPath: failed, path null");
            int width = nVar.I().getWidth();
            int height = nVar.I().getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/items/PictureItem", "readBitmapFromPath", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            t17 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, t17, "com/tencent/mm/items/PictureItem", "readBitmapFromPath", "()Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "createBitmap(...)");
        } else {
            t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t(str, nVar.I().getHeight(), nVar.I().getWidth(), true, false);
            if (t17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(nVar.F(), "readBitmapFromPath: failed w:" + nVar.I().getWidth() + ", h:" + nVar.I().getHeight() + ", path:" + str);
                t17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(nVar.I().getWidth(), nVar.I().getHeight(), android.graphics.Bitmap.Config.ARGB_8888, false);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "createBitmap(...)");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.F(), "readBitmapFromPath success, " + java.lang.Thread.currentThread().getName() + ", w:" + nVar.I().getWidth() + ", h:" + nVar.I().getHeight() + ", path:" + str + ' ');
            }
        }
        nVar.f536485g = t17;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = java.lang.System.currentTimeMillis();
        boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(nVar.I) ? false : com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(nVar.f536485g, 100, android.graphics.Bitmap.CompressFormat.PNG, nVar.I, false);
        long currentTimeMillis4 = java.lang.System.currentTimeMillis() - currentTimeMillis3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.F(), "loadBitmapFromReadFile: [" + nVar.f536485g.hashCode() + "] saveResult=" + D0 + ", readBitmapTimeCost=" + currentTimeMillis2 + "ms, saveTimeCost=" + currentTimeMillis4 + "ms, " + nVar.I);
        nVar.F = true;
        this.f96371e.r();
        return jz5.f0.f384359a;
    }
}
