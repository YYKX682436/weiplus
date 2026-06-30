package com.p314xaae8f345.p485x5dc4f1ad.p486xa7b754fd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/magicbrush/ext_texture/MBExternalTexturePlugin;", "Lbh/b;", "", dm.i4.f66865x76d1ec5a, "", "type", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "Ljz5/f0;", "onSurfaceTextureLoad", "onSurfaceTextureUpdate", "onSurfaceTextureUnload", "bh/c", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin */
/* loaded from: classes7.dex */
public final class C4211x20e2c38e implements bh.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 f130160a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f130161b;

    public C4211x20e2c38e(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f130160a = runtime;
        this.f130161b = new java.util.HashMap();
    }

    public final java.lang.String a(java.lang.String str, int i17) {
        return str + '#' + i17;
    }

    public void b(final java.lang.String type, final int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.String a17 = a(type, i17);
        if (this.f130161b.containsKey(a17)) {
            this.f130161b.remove(a17);
            final com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c83 = this.f130160a;
            if (abstractC4208x204d5c83.f130110a == 0) {
                return;
            }
            abstractC4208x204d5c83.n(new java.lang.Runnable() { // from class: yg.i$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 abstractC4208x204d5c832 = com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83.this;
                    abstractC4208x204d5c832.m34790xfaed6b5f(abstractC4208x204d5c832.f130110a, i17, type);
                }
            });
        }
    }

    /* renamed from: onSurfaceTextureLoad */
    public final void m34818x4612b5f3(int i17, java.lang.String type, android.graphics.SurfaceTexture surfaceTexture) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surfaceTexture, "surfaceTexture");
        java.lang.String a17 = a(type, i17);
        bh.c cVar = (bh.c) this.f130161b.get(a17);
        if (cVar == null) {
            return;
        }
        ah.i.b("MagicBrush", "surface texture loaded key = " + a17, new java.lang.Object[0]);
        cVar.f102293c = surfaceTexture;
        cVar.f102295e.mo146xb9724478(surfaceTexture);
    }

    /* renamed from: onSurfaceTextureUnload */
    public final void m34819x1b8fc0cc(int i17, java.lang.String type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.String a17 = a(type, i17);
        ah.i.b("MagicBrush", "surface texture unload key = " + a17, new java.lang.Object[0]);
        bh.c cVar = (bh.c) this.f130161b.remove(a17);
        if (cVar == null) {
            return;
        }
        cVar.f102295e.mo146xb9724478(null);
    }

    /* renamed from: onSurfaceTextureUpdate */
    public final void m34820x1ba81a96(int i17, java.lang.String type) {
        android.graphics.SurfaceTexture surfaceTexture;
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        bh.c cVar = (bh.c) this.f130161b.get(a(type, i17));
        if (cVar == null || (surfaceTexture = cVar.f102293c) == null || (lVar = cVar.f102296f) == null) {
            return;
        }
        lVar.mo146xb9724478(surfaceTexture);
    }
}
