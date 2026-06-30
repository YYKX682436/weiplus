package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public abstract class ke<D extends com.tencent.mapsdk.internal.jz> extends com.tencent.mapsdk.internal.jx<D> {

    /* renamed from: a, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.ke.b f50068a = new com.tencent.mapsdk.internal.ke.b() { // from class: com.tencent.mapsdk.internal.ke.1
        @Override // com.tencent.mapsdk.internal.ke.b
        public final java.lang.String a(java.lang.String str) {
            return com.tencent.mapsdk.internal.kc.a(str);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ke.c f50069b;

    /* loaded from: classes6.dex */
    public enum a {
        DISK,
        DB
    }

    /* loaded from: classes13.dex */
    public interface b {
        java.lang.String a(java.lang.String str);
    }

    /* loaded from: classes13.dex */
    public static abstract class c implements com.tencent.mapsdk.internal.jy.a {

        /* renamed from: j, reason: collision with root package name */
        com.tencent.mapsdk.internal.ke.a f50073j;

        /* renamed from: k, reason: collision with root package name */
        public int f50074k = 104857600;

        /* renamed from: l, reason: collision with root package name */
        public com.tencent.mapsdk.internal.ke.b f50075l = com.tencent.mapsdk.internal.ke.f50068a;

        public c(com.tencent.mapsdk.internal.ke.a aVar) {
            this.f50073j = aVar;
        }

        private com.tencent.mapsdk.internal.ke.c a(com.tencent.mapsdk.internal.ke.b bVar) {
            this.f50075l = bVar;
            return this;
        }

        private com.tencent.mapsdk.internal.ke.c c() {
            this.f50074k = -1;
            return this;
        }

        private com.tencent.mapsdk.internal.ke.a d() {
            return this.f50073j;
        }

        private com.tencent.mapsdk.internal.ke.b e() {
            return this.f50075l;
        }

        @Override // com.tencent.mapsdk.internal.jy.a
        public final boolean b() {
            return false;
        }

        public java.lang.String toString() {
            return "Options{mType=" + this.f50073j + ", mCacheSize=" + this.f50074k + ", keyGenerator=" + this.f50075l + '}';
        }

        @Override // com.tencent.mapsdk.internal.jy.a
        public final int a() {
            return this.f50074k;
        }
    }

    public ke(com.tencent.mapsdk.internal.ke.c cVar) {
        this.f50069b = cVar;
    }

    public com.tencent.mapsdk.internal.ke.c g() {
        return this.f50069b;
    }
}
