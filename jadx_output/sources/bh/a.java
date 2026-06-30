package bh;

/* loaded from: classes7.dex */
public abstract class a {
    public static void a(bh.b bVar, final java.lang.String type, final int i17, final int i18, final int i19, final android.view.Surface surface, yz5.l replaceCallback, yz5.l lVar, boolean z17, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: registerSurface");
        }
        yz5.l lVar2 = (i27 & 64) != 0 ? null : lVar;
        boolean z18 = (i27 & 128) != 0 ? true : z17;
        com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin mBExternalTexturePlugin = (com.tencent.magicbrush.ext_texture.MBExternalTexturePlugin) bVar;
        mBExternalTexturePlugin.getClass();
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(replaceCallback, "replaceCallback");
        java.lang.String a17 = mBExternalTexturePlugin.a(type, i17);
        if (i18 <= 0 || i19 <= 0 || mBExternalTexturePlugin.f48628b.containsKey(a17)) {
            return;
        }
        mBExternalTexturePlugin.f48628b.put(a17, new bh.c(i18, i19, null, surface, replaceCallback, lVar2));
        final com.tencent.magicbrush.MBRuntime mBRuntime = mBExternalTexturePlugin.f48627a;
        if (mBRuntime.f48577a == 0) {
            return;
        }
        final boolean z19 = z18;
        mBRuntime.n(new java.lang.Runnable() { // from class: yg.i$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.magicbrush.MBRuntime mBRuntime2 = com.tencent.magicbrush.MBRuntime.this;
                mBRuntime2.nativeRegisterExtSurface(mBRuntime2.f48577a, i17, type, i18, i19, surface, z19);
            }
        });
    }
}
