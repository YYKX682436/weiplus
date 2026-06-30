package com.tencent.magicbrush.ext_texture;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lcom/tencent/magicbrush/ext_texture/MBExternalTexturePlugin;", "Lbh/b;", "", dm.i4.COL_ID, "", "type", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "Ljz5/f0;", "onSurfaceTextureLoad", "onSurfaceTextureUpdate", "onSurfaceTextureUnload", "bh/c", "lib-magicbrush-nano_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class MBExternalTexturePlugin implements bh.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.magicbrush.MBRuntime f48627a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f48628b;

    public MBExternalTexturePlugin(com.tencent.magicbrush.MBRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f48627a = runtime;
        this.f48628b = new java.util.HashMap();
    }

    public final java.lang.String a(java.lang.String str, int i17) {
        return str + '#' + i17;
    }

    public void b(final java.lang.String type, final int i17) {
        kotlin.jvm.internal.o.g(type, "type");
        java.lang.String a17 = a(type, i17);
        if (this.f48628b.containsKey(a17)) {
            this.f48628b.remove(a17);
            final com.tencent.magicbrush.MBRuntime mBRuntime = this.f48627a;
            if (mBRuntime.f48577a == 0) {
                return;
            }
            mBRuntime.n(new java.lang.Runnable() { // from class: yg.i$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.magicbrush.MBRuntime mBRuntime2 = com.tencent.magicbrush.MBRuntime.this;
                    mBRuntime2.nativeUnregisterExtSurface(mBRuntime2.f48577a, i17, type);
                }
            });
        }
    }

    public final void onSurfaceTextureLoad(int i17, java.lang.String type, android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        java.lang.String a17 = a(type, i17);
        bh.c cVar = (bh.c) this.f48628b.get(a17);
        if (cVar == null) {
            return;
        }
        ah.i.b("MagicBrush", "surface texture loaded key = " + a17, new java.lang.Object[0]);
        cVar.f20760c = surfaceTexture;
        cVar.f20762e.invoke(surfaceTexture);
    }

    public final void onSurfaceTextureUnload(int i17, java.lang.String type) {
        kotlin.jvm.internal.o.g(type, "type");
        java.lang.String a17 = a(type, i17);
        ah.i.b("MagicBrush", "surface texture unload key = " + a17, new java.lang.Object[0]);
        bh.c cVar = (bh.c) this.f48628b.remove(a17);
        if (cVar == null) {
            return;
        }
        cVar.f20762e.invoke(null);
    }

    public final void onSurfaceTextureUpdate(int i17, java.lang.String type) {
        android.graphics.SurfaceTexture surfaceTexture;
        yz5.l lVar;
        kotlin.jvm.internal.o.g(type, "type");
        bh.c cVar = (bh.c) this.f48628b.get(a(type, i17));
        if (cVar == null || (surfaceTexture = cVar.f20760c) == null || (lVar = cVar.f20763f) == null) {
            return;
        }
        lVar.invoke(surfaceTexture);
    }
}
