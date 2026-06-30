package com.tencent.maas.flutter;

/* loaded from: classes5.dex */
public class TextureProviderHolder {

    /* loaded from: classes5.dex */
    public static class DSProxyInfo {

        /* renamed from: a, reason: collision with root package name */
        public final long f48011a;

        /* renamed from: b, reason: collision with root package name */
        public final io.clipworks.displaysys.DSProxySurface f48012b;

        public DSProxyInfo(long j17, io.clipworks.displaysys.DSProxySurface dSProxySurface) {
            this.f48011a = j17;
            this.f48012b = dSProxySurface;
        }

        public long getId() {
            return this.f48011a;
        }

        public java.lang.Object getSurfaceProxyObject() {
            return this.f48012b;
        }
    }

    public TextureProviderHolder(lg.a aVar) {
    }

    public com.tencent.maas.flutter.TextureProviderHolder.DSProxyInfo createSurfaceTexture(int i17, int i18, double d17) {
        throw null;
    }

    public void releaseSurfaceTexture(long j17) {
        throw null;
    }
}
