package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class fb0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f194067d;

    /* renamed from: e, reason: collision with root package name */
    public int f194068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 f194069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194069f = ob0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fb0(this.f194069f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.fb0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.SurfaceHolder holder;
        android.view.Surface surface;
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        co0.b c17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f194068e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = this.f194069f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int ordinal = ob0Var.u1().ordinal();
            if (ordinal == 0) {
                android.view.SurfaceView f150155g = ob0Var.f195267r.getF150155g();
                java.lang.String str = ob0Var.f195266q;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFrameShot from SURFACE_VIEW, surfaceView.isValid=");
                sb6.append((f150155g == null || (holder = f150155g.getHolder()) == null || (surface = holder.getSurface()) == null) ? null : java.lang.Boolean.valueOf(surface.isValid()));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, sb6.toString());
                if (f150155g != null) {
                    this.f194068e = 1;
                    obj = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0.t1(ob0Var, f150155g, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bitmap = (android.graphics.Bitmap) obj;
                }
            } else if (ordinal == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(ob0Var.f195266q, "getFrameShot from LIVE_PLAYER");
                mn0.b0 B1 = ob0Var.B1();
                nn0.c cVar = B1 instanceof nn0.c ? (nn0.c) B1 : null;
                android.graphics.Bitmap i18 = cVar != null ? cVar.i(android.graphics.Bitmap.Config.ARGB_8888, false, 1.0d) : null;
                this.f194067d = i18;
                this.f194068e = 2;
                if (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) == aVar) {
                    return aVar;
                }
                bitmap2 = i18;
                bitmap = bitmap2;
            } else {
                if (ordinal != 2) {
                    throw new jz5.j();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(ob0Var.f195266q, "getFrameShot from VIDEO_VIEW");
                android.view.TextureView mo46536x4ee17f0a = ob0Var.f195267r.mo46536x4ee17f0a();
                if (mo46536x4ee17f0a != null) {
                    bitmap = mo46536x4ee17f0a.getBitmap();
                }
            }
            bitmap = null;
        } else if (i17 == 1) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bitmap = (android.graphics.Bitmap) obj;
        } else {
            if (i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap2 = (android.graphics.Bitmap) this.f194067d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            bitmap = bitmap2;
        }
        if (ob0Var.D1()) {
            return bitmap;
        }
        if (bitmap != null && (c17 = co0.b.f125242e2.c(ob0Var.V0().f390662d.f150070e)) != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i19 = c17.U1;
            int i27 = c17.V1;
            if (width != 0 && height != 0 && i19 != 0 && i27 != 0) {
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
                yj0.a.d(obj2, aVar2.b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$getFrameShot$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) aVar2.a(0), ((java.lang.Integer) aVar2.a(1)).intValue(), ((java.lang.Integer) aVar2.a(2)).intValue(), ((java.lang.Integer) aVar2.a(3)).intValue(), ((java.lang.Integer) aVar2.a(4)).intValue(), (android.graphics.Matrix) aVar2.a(5), ((java.lang.Boolean) aVar2.a(6)).booleanValue());
                yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$getFrameShot$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;");
                return createBitmap;
            }
        }
        return null;
    }
}
