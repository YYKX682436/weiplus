package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class ke<D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jx<D> {

    /* renamed from: a, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.ke.b f131601a = new com.tencent.mapsdk.internal.ke.b() { // from class: com.tencent.mapsdk.internal.ke.1
        @Override // com.tencent.mapsdk.internal.ke.b
        public final java.lang.String a(java.lang.String str) {
            return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kc.a(str);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.ke.c f131602b;

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
        com.tencent.mapsdk.internal.ke.a f131606j;

        /* renamed from: k, reason: collision with root package name */
        public int f131607k = 104857600;

        /* renamed from: l, reason: collision with root package name */
        public com.tencent.mapsdk.internal.ke.b f131608l = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ke.f131601a;

        public c(com.tencent.mapsdk.internal.ke.a aVar) {
            this.f131606j = aVar;
        }

        private com.tencent.mapsdk.internal.ke.c a(com.tencent.mapsdk.internal.ke.b bVar) {
            this.f131608l = bVar;
            return this;
        }

        private com.tencent.mapsdk.internal.ke.c c() {
            this.f131607k = -1;
            return this;
        }

        private com.tencent.mapsdk.internal.ke.a d() {
            return this.f131606j;
        }

        private com.tencent.mapsdk.internal.ke.b e() {
            return this.f131608l;
        }

        @Override // com.tencent.mapsdk.internal.jy.a
        public final boolean b() {
            return false;
        }

        /* renamed from: toString */
        public java.lang.String mo36137x9616526c() {
            return "Options{mType=" + this.f131606j + ", mCacheSize=" + this.f131607k + ", keyGenerator=" + this.f131608l + '}';
        }

        @Override // com.tencent.mapsdk.internal.jy.a
        public final int a() {
            return this.f131607k;
        }
    }

    public ke(com.tencent.mapsdk.internal.ke.c cVar) {
        this.f131602b = cVar;
    }

    public com.tencent.mapsdk.internal.ke.c g() {
        return this.f131602b;
    }
}
