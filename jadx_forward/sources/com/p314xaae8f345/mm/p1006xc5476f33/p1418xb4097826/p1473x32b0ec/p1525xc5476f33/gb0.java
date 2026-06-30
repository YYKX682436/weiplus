package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class gb0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f194207d;

    /* renamed from: e, reason: collision with root package name */
    public int f194208e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 f194209f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194209f = ob0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb0(this.f194209f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gb0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f194208e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = this.f194209f;
            android.view.SurfaceView f150155g = ob0Var.f195267r.getF150155g();
            if (f150155g != null) {
                android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(f150155g.getContext());
                boolean z17 = b17.x > b17.y;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(ob0Var.f195266q, "isHorizontal= " + z17 + " surfaceView.isValid=" + f150155g.getHolder().getSurface().isValid());
                if (z17 || !f150155g.getHolder().getSurface().isValid()) {
                    mn0.b0 B1 = ob0Var.B1();
                    nn0.c cVar = B1 instanceof nn0.c ? (nn0.c) B1 : null;
                    android.graphics.Bitmap i18 = cVar != null ? cVar.i(android.graphics.Bitmap.Config.ARGB_8888, false, 1.0d) : null;
                    this.f194207d = i18;
                    this.f194208e = 2;
                    if (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) == aVar) {
                        return aVar;
                    }
                    bitmap2 = i18;
                    bitmap = bitmap2;
                } else {
                    this.f194208e = 1;
                    obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.t1(ob0Var, f150155g, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bitmap = (android.graphics.Bitmap) obj;
                }
            } else {
                android.view.TextureView mo46536x4ee17f0a = ob0Var.f195267r.mo46536x4ee17f0a();
                bitmap = mo46536x4ee17f0a != null ? mo46536x4ee17f0a.getBitmap() : null;
            }
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bitmap = (android.graphics.Bitmap) obj;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap2 = (android.graphics.Bitmap) this.f194207d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bitmap = bitmap2;
        }
        if (bitmap == null) {
            return null;
        }
        if (sn0.b.f491497e2 == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
            sn0.b.f491497e2 = new sn0.b();
        }
        sn0.b bVar = sn0.b.f491497e2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i19 = bVar.U1;
        int i27 = bVar.V1;
        if (width == 0 || height == 0 || i19 == 0 || i27 == 0) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(i19 / width, i27 / height);
        zj0.a aVar2 = new zj0.a();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        aVar2.c(java.lang.Boolean.FALSE);
        aVar2.c(matrix);
        aVar2.c(java.lang.Integer.valueOf(height));
        aVar2.c(java.lang.Integer.valueOf(width));
        aVar2.c(0);
        aVar2.c(0);
        aVar2.c(bitmap);
        java.lang.Object obj2 = new java.lang.Object();
        yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$getFrameShotSecondary$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
        yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$getFrameShotSecondary$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
        return createBitmap;
    }
}
