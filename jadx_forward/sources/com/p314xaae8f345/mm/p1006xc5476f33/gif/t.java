package com.p314xaae8f345.mm.p1006xc5476f33.gif;

/* loaded from: classes15.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.u f223721d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar) {
        this.f223721d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f223721d.f223726g) {
            com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar = this.f223721d;
            if (uVar.G) {
                return;
            }
            if (uVar.f223724e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF had been recycle.");
                return;
            }
            if (uVar.f223725f == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF JNIHandle is null.");
                jx3.f.INSTANCE.mo68477x336bdfd8(401L, 18L, 1L, false);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar2 = this.f223721d;
            if (uVar2.f223739w <= 2000 && uVar2.f223738v <= 2000) {
                boolean z17 = true;
                uVar2.G = true;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar3 = this.f223721d;
                int i17 = uVar3.f223736t + 1;
                android.graphics.Bitmap[] bitmapArr = uVar3.f223734r;
                int length = i17 % bitmapArr.length;
                android.graphics.Bitmap bitmap = bitmapArr[length];
                if (bitmap == null) {
                    int i18 = uVar3.f223738v;
                    int i19 = uVar3.f223739w;
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gif/MMWXGFDrawable$4", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/gif/MMWXGFDrawable$4", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    this.f223721d.f223734r[length] = bitmap;
                }
                int mo44488x5ea842e8 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79.class)).mo44488x5ea842e8(this.f223721d.f223725f, null, 0, bitmap, this.f223721d.f223728i);
                if (mo44488x5ea842e8 == -904) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed. func is null.");
                    jx3.f.INSTANCE.mo68477x336bdfd8(401L, 8L, 1L, false);
                    return;
                }
                if (mo44488x5ea842e8 == -909) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed. frame is null.");
                    jx3.f.INSTANCE.mo68477x336bdfd8(401L, 11L, 1L, false);
                } else if (mo44488x5ea842e8 == -1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed.");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar4 = this.f223721d;
                int i27 = uVar4.f223741y + 1;
                uVar4.f223741y = i27;
                if (i27 >= uVar4.f223737u - 1 || mo44488x5ea842e8 == 1) {
                    uVar4.f223741y = -1;
                    int mo44492xa5576e92 = ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.InterfaceC10589x7a8f7b79.class)).mo44492xa5576e92(this.f223721d.f223725f);
                    if (mo44492xa5576e92 != 0) {
                        if (mo44492xa5576e92 == -905) {
                            jx3.f.INSTANCE.mo68477x336bdfd8(711L, 9L, 1L, false);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan Rewind buffer failed.");
                        return;
                    }
                }
                this.f223721d.A = java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar5 = this.f223721d;
                long j17 = uVar5.B;
                if (j17 != 0) {
                    long j18 = (j17 - uVar5.A) - uVar5.E;
                    uVar5.C = j18;
                    if (j18 < 0) {
                        int i28 = uVar5.f223741y;
                        if (j18 < -100) {
                            jx3.f fVar = jx3.f.INSTANCE;
                            fVar.mo68477x336bdfd8(401L, 16L, 1L, false);
                            fVar.mo68477x336bdfd8(401L, 17L, java.lang.Math.abs(this.f223721d.C), false);
                            com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc m45812x9cf0d20b = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b();
                            if (!com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45876x19318276() && !com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45880xd6d7f83d()) {
                                z17 = false;
                            }
                            m45812x9cf0d20b.mo46128x89c4face(z17, this.f223721d.f223722J);
                            this.f223721d.f223722J = com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo46127x5f00c26e(com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45880xd6d7f83d(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45879xc4cba789(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45878xceec352e(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45881x48bd4cc0(), com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45882xceec7804() ? android.os.Process.myTid() : 0, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45883x15c6d1e7(), 602, com.p314xaae8f345.mm.p788xd6f12a1a.InterfaceC10732xd7a300cc.m45812x9cf0d20b().mo45877xcf7250f0(), "MicroMsg.GIF.MMWXGFDrawable");
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar6 = this.f223721d;
                if (uVar6.H) {
                    uVar6.H = false;
                    java.lang.Runnable runnable = uVar6.L;
                    uVar6.F = android.os.SystemClock.uptimeMillis();
                    if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.q) runnable).run();
                    } else {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.o3 o3Var = uVar6.I;
                        if (o3Var != null) {
                            o3Var.d(runnable);
                        }
                    }
                } else {
                    java.lang.Runnable runnable2 = uVar6.L;
                    long j19 = uVar6.C;
                    uVar6.f(runnable2, j19 > 0 ? j19 : 0L);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.gif.u uVar7 = this.f223721d;
                int i29 = uVar7.f223728i[0];
                if (i29 <= 0) {
                    i29 = 100;
                }
                uVar7.B = i29;
                uVar7.G = false;
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GIF.MMWXGFDrawable", "image size is too big " + this.f223721d.f223739w + ", " + this.f223721d.f223738v);
        }
    }
}
