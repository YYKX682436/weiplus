package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class lk {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f131844a = "PoolUtil";

    /* renamed from: b, reason: collision with root package name */
    private static final int f131845b = 20;

    /* renamed from: c, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.lk.k<java.lang.Object> f131846c = new com.tencent.mapsdk.internal.lk.k<java.lang.Object>() { // from class: com.tencent.mapsdk.internal.lk.1
        @Override // com.tencent.mapsdk.internal.lk.k
        public final void a(java.lang.Object obj) {
        }
    };

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.tencent.mapsdk.internal.lk$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static class AnonymousClass3<T> implements com.tencent.mapsdk.internal.lk.e<java.util.List<T>> {
        private static java.util.List<T> b() {
            return new java.util.ArrayList();
        }

        @Override // com.tencent.mapsdk.internal.lk.e
        public final /* synthetic */ java.lang.Object a() {
            return new java.util.ArrayList();
        }
    }

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f131847a = 256;

        /* renamed from: b, reason: collision with root package name */
        public int f131848b = 256;

        /* renamed from: c, reason: collision with root package name */
        public android.graphics.Bitmap.Config f131849c;

        public a(android.graphics.Bitmap.Config config) {
            this.f131849c = config;
        }

        private void a(com.tencent.mapsdk.internal.lk.a aVar) {
            if (aVar != null) {
                this.f131847a = aVar.f131847a;
                this.f131848b = aVar.f131848b;
                this.f131849c = aVar.f131849c;
            }
        }
    }

    /* loaded from: classes13.dex */
    public static abstract class b<T> implements com.tencent.mapsdk.internal.lk.e<T> {

        /* renamed from: a, reason: collision with root package name */
        com.tencent.mapsdk.internal.lk.a f131850a;

        public b(com.tencent.mapsdk.internal.lk.a aVar) {
            this.f131850a = aVar;
        }
    }

    /* loaded from: classes13.dex */
    public interface e<T> {
        T a();
    }

    /* loaded from: classes13.dex */
    public interface g<T> {
        T a();

        boolean a(T t17);
    }

    /* loaded from: classes13.dex */
    public interface h {
        com.tencent.mapsdk.internal.lk.l a();
    }

    /* loaded from: classes13.dex */
    public static final class i<T> implements com.tencent.mapsdk.internal.lk.h {

        /* renamed from: a, reason: collision with root package name */
        public final T f131856a;

        /* renamed from: b, reason: collision with root package name */
        private com.tencent.mapsdk.internal.lk.l f131857b = new com.tencent.mapsdk.internal.lk.d();

        public i(T t17) {
            this.f131856a = t17;
        }

        private T b() {
            return this.f131856a;
        }

        @Override // com.tencent.mapsdk.internal.lk.h
        public final com.tencent.mapsdk.internal.lk.l a() {
            return this.f131857b;
        }
    }

    /* loaded from: classes13.dex */
    public interface k<T> {
        void a(T t17);
    }

    /* loaded from: classes13.dex */
    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        private static final boolean f131861a = false;

        private static com.tencent.mapsdk.internal.lk.l b() {
            return new com.tencent.mapsdk.internal.lk.d();
        }

        public abstract void a();

        public abstract void a(boolean z17);
    }

    private lk() {
    }

    public static com.tencent.mapsdk.internal.lk.g<com.tencent.mapsdk.internal.lk.i<android.graphics.Bitmap>> a(com.tencent.mapsdk.internal.lk.a aVar) {
        return a(10, new com.tencent.mapsdk.internal.lk.b<com.tencent.mapsdk.internal.lk.i<android.graphics.Bitmap>>(aVar) { // from class: com.tencent.mapsdk.internal.lk.2
            private com.tencent.mapsdk.internal.lk.i<android.graphics.Bitmap> b() {
                com.tencent.mapsdk.internal.lk.a aVar2 = this.f131850a;
                return new com.tencent.mapsdk.internal.lk.i<>(android.graphics.Bitmap.createBitmap(aVar2.f131847a, aVar2.f131848b, aVar2.f131849c));
            }

            @Override // com.tencent.mapsdk.internal.lk.e
            public final /* synthetic */ java.lang.Object a() {
                com.tencent.mapsdk.internal.lk.a aVar2 = this.f131850a;
                return new com.tencent.mapsdk.internal.lk.i(android.graphics.Bitmap.createBitmap(aVar2.f131847a, aVar2.f131848b, aVar2.f131849c));
            }
        });
    }

    private static <T extends com.tencent.mapsdk.internal.lk.h> com.tencent.mapsdk.internal.lk.g<T> b(int i17, com.tencent.mapsdk.internal.lk.e<T> eVar) {
        return a(new com.tencent.mapsdk.internal.lk.j.a(i17), eVar);
    }

    private static <T> com.tencent.mapsdk.internal.lk.k<T> c() {
        return (com.tencent.mapsdk.internal.lk.k<T>) f131846c;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.tencent.mapsdk.internal.lk$4, reason: invalid class name */
    /* loaded from: classes13.dex */
    public static class AnonymousClass4<T> implements com.tencent.mapsdk.internal.lk.k<java.util.List<T>> {
        @Override // com.tencent.mapsdk.internal.lk.k
        public final /* synthetic */ void a(java.lang.Object obj) {
            ((java.util.List) obj).clear();
        }

        private static void a(java.util.List<T> list) {
            list.clear();
        }
    }

    /* loaded from: classes13.dex */
    public static class c extends com.tencent.mapsdk.internal.lk.l {

        /* renamed from: a, reason: collision with root package name */
        private volatile java.lang.RuntimeException f131851a;

        @Override // com.tencent.mapsdk.internal.lk.l
        public final void a() {
            if (this.f131851a != null) {
                throw new java.lang.IllegalStateException("Already released", this.f131851a);
            }
        }

        @Override // com.tencent.mapsdk.internal.lk.l
        public final void a(boolean z17) {
            if (z17) {
                this.f131851a = new java.lang.RuntimeException("Released");
            } else {
                this.f131851a = null;
            }
        }
    }

    /* loaded from: classes13.dex */
    public static class d extends com.tencent.mapsdk.internal.lk.l {

        /* renamed from: a, reason: collision with root package name */
        private volatile boolean f131852a;

        @Override // com.tencent.mapsdk.internal.lk.l
        public final void a() {
            if (this.f131852a) {
                throw new java.lang.IllegalStateException("Already released");
            }
        }

        @Override // com.tencent.mapsdk.internal.lk.l
        public final void a(boolean z17) {
            this.f131852a = z17;
        }
    }

    /* loaded from: classes13.dex */
    public static final class j {
        private j() {
        }

        /* loaded from: classes13.dex */
        public static class b<T> extends com.tencent.mapsdk.internal.lk.j.a<T> {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Object f131860a;

            public b(int i17) {
                super(i17);
                this.f131860a = new java.lang.Object();
            }

            @Override // com.tencent.mapsdk.internal.lk.j.a, com.tencent.mapsdk.internal.lk.g
            public final T a() {
                T t17;
                synchronized (this.f131860a) {
                    t17 = (T) super.a();
                }
                return t17;
            }

            @Override // com.tencent.mapsdk.internal.lk.j.a, com.tencent.mapsdk.internal.lk.g
            public final boolean a(T t17) {
                boolean a17;
                synchronized (this.f131860a) {
                    a17 = super.a(t17);
                }
                return a17;
            }
        }

        /* loaded from: classes13.dex */
        public static class a<T> implements com.tencent.mapsdk.internal.lk.g<T> {

            /* renamed from: a, reason: collision with root package name */
            private final java.lang.Object[] f131858a;

            /* renamed from: b, reason: collision with root package name */
            private int f131859b;

            public a(int i17) {
                if (i17 <= 0) {
                    throw new java.lang.IllegalArgumentException("The max pool size must be > 0");
                }
                this.f131858a = new java.lang.Object[i17];
            }

            private boolean b(T t17) {
                for (int i17 = 0; i17 < this.f131859b; i17++) {
                    if (this.f131858a[i17] == t17) {
                        return true;
                    }
                }
                return false;
            }

            @Override // com.tencent.mapsdk.internal.lk.g
            public T a() {
                int i17 = this.f131859b;
                if (i17 <= 0) {
                    return null;
                }
                int i18 = i17 - 1;
                java.lang.Object[] objArr = this.f131858a;
                T t17 = (T) objArr[i18];
                objArr[i18] = null;
                this.f131859b = i17 - 1;
                return t17;
            }

            @Override // com.tencent.mapsdk.internal.lk.g
            public boolean a(T t17) {
                int i17;
                boolean z17;
                int i18 = 0;
                while (true) {
                    i17 = this.f131859b;
                    if (i18 >= i17) {
                        z17 = false;
                        break;
                    }
                    if (this.f131858a[i18] == t17) {
                        z17 = true;
                        break;
                    }
                    i18++;
                }
                if (!z17) {
                    java.lang.Object[] objArr = this.f131858a;
                    if (i17 >= objArr.length) {
                        return false;
                    }
                    objArr[i17] = t17;
                    this.f131859b = i17 + 1;
                    return true;
                }
                throw new java.lang.IllegalStateException("Already in the pool!");
            }
        }
    }

    private static <T> com.tencent.mapsdk.internal.lk.g<java.util.List<T>> b() {
        return a(new com.tencent.mapsdk.internal.lk.j.b(20), new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lk.AnonymousClass3(), new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lk.AnonymousClass4());
    }

    public static <T extends com.tencent.mapsdk.internal.lk.h> com.tencent.mapsdk.internal.lk.g<T> a(int i17, com.tencent.mapsdk.internal.lk.e<T> eVar) {
        return a(new com.tencent.mapsdk.internal.lk.j.b(i17), eVar);
    }

    private static <T extends com.tencent.mapsdk.internal.lk.h> com.tencent.mapsdk.internal.lk.g<T> a(int i17, com.tencent.mapsdk.internal.lk.e<T> eVar, com.tencent.mapsdk.internal.lk.k<T> kVar) {
        return a(new com.tencent.mapsdk.internal.lk.j.b(i17), eVar, kVar);
    }

    /* loaded from: classes13.dex */
    public static final class f<T> implements com.tencent.mapsdk.internal.lk.g<T> {

        /* renamed from: a, reason: collision with root package name */
        private final com.tencent.mapsdk.internal.lk.e<T> f131853a;

        /* renamed from: b, reason: collision with root package name */
        private final com.tencent.mapsdk.internal.lk.k<T> f131854b;

        /* renamed from: c, reason: collision with root package name */
        private final com.tencent.mapsdk.internal.lk.g<T> f131855c;

        public f(com.tencent.mapsdk.internal.lk.g<T> gVar, com.tencent.mapsdk.internal.lk.e<T> eVar, com.tencent.mapsdk.internal.lk.k<T> kVar) {
            this.f131855c = gVar;
            this.f131853a = eVar;
            this.f131854b = kVar;
        }

        @Override // com.tencent.mapsdk.internal.lk.g
        public final T a() {
            T a17 = this.f131855c.a();
            if (a17 == null) {
                a17 = this.f131853a.a();
                com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lk.f131844a, "Created new ".concat(java.lang.String.valueOf(a17)));
            }
            if (a17 instanceof com.tencent.mapsdk.internal.lk.h) {
                a17.a().a(false);
            }
            return (T) a17;
        }

        @Override // com.tencent.mapsdk.internal.lk.g
        public final boolean a(T t17) {
            if (t17 instanceof com.tencent.mapsdk.internal.lk.h) {
                ((com.tencent.mapsdk.internal.lk.h) t17).a().a(true);
            }
            this.f131854b.a(t17);
            return this.f131855c.a(t17);
        }
    }

    private static <T> com.tencent.mapsdk.internal.lk.g<T> a(com.tencent.mapsdk.internal.lk.g<T> gVar, com.tencent.mapsdk.internal.lk.e<T> eVar, com.tencent.mapsdk.internal.lk.k<T> kVar) {
        return new com.tencent.mapsdk.internal.lk.f(gVar, eVar, kVar);
    }

    private static <T> com.tencent.mapsdk.internal.lk.g<java.util.List<T>> a() {
        return a(new com.tencent.mapsdk.internal.lk.j.b(20), new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lk.AnonymousClass3(), new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lk.AnonymousClass4());
    }

    private static <T extends com.tencent.mapsdk.internal.lk.h> com.tencent.mapsdk.internal.lk.g<T> a(com.tencent.mapsdk.internal.lk.g<T> gVar, com.tencent.mapsdk.internal.lk.e<T> eVar) {
        return a(gVar, eVar, f131846c);
    }
}
