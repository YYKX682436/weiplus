package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public abstract class je implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    float f131502a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.Class<?> f131503b;

    /* renamed from: c, reason: collision with root package name */
    android.view.animation.Interpolator f131504c = null;

    /* renamed from: d, reason: collision with root package name */
    boolean f131505d = false;

    /* loaded from: classes16.dex */
    public static class c extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je {

        /* renamed from: e, reason: collision with root package name */
        java.lang.Object f131508e;

        public c(float f17, java.lang.Object obj) {
            this.f131502a = f17;
            this.f131508e = obj;
            boolean z17 = obj != null;
            this.f131505d = z17;
            this.f131503b = z17 ? obj.getClass() : java.lang.Object.class;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.je.c e() {
            com.tencent.mapsdk.internal.je.c cVar = new com.tencent.mapsdk.internal.je.c(this.f131502a, this.f131508e);
            cVar.f131504c = this.f131504c;
            return cVar;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        public final void a(java.lang.Object obj) {
            this.f131508e = obj;
            this.f131505d = obj != null;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        public final java.lang.Object d() {
            return this.f131508e;
        }
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je a(float f17, int i17) {
        return new com.tencent.mapsdk.internal.je.b(f17, i17);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je b() {
        return new com.tencent.mapsdk.internal.je.a();
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je c() {
        return new com.tencent.mapsdk.internal.je.c(0.0f, null);
    }

    private boolean f() {
        return this.f131505d;
    }

    private float g() {
        return this.f131502a;
    }

    private android.view.animation.Interpolator h() {
        return this.f131504c;
    }

    private java.lang.Class i() {
        return this.f131503b;
    }

    public abstract void a(java.lang.Object obj);

    public abstract java.lang.Object d();

    @Override // 
    public abstract com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je e();

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je a() {
        return new com.tencent.mapsdk.internal.je.b();
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je a(float f17, double d17) {
        return new com.tencent.mapsdk.internal.je.a(f17, d17);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je a(float f17, java.lang.Object obj) {
        return new com.tencent.mapsdk.internal.je.c(f17, obj);
    }

    /* loaded from: classes16.dex */
    public static class a extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je {

        /* renamed from: e, reason: collision with root package name */
        double f131506e;

        public a(float f17, double d17) {
            this.f131502a = f17;
            this.f131506e = d17;
            this.f131503b = java.lang.Double.TYPE;
            this.f131505d = true;
        }

        private double f() {
            return this.f131506e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.je.a e() {
            com.tencent.mapsdk.internal.je.a aVar = new com.tencent.mapsdk.internal.je.a(this.f131502a, this.f131506e);
            aVar.f131504c = this.f131504c;
            return aVar;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        public final void a(java.lang.Object obj) {
            if (obj == null || obj.getClass() != java.lang.Double.class) {
                return;
            }
            this.f131506e = ((java.lang.Double) obj).doubleValue();
            this.f131505d = true;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        public final java.lang.Object d() {
            return java.lang.Double.valueOf(this.f131506e);
        }

        public a() {
            this.f131502a = 0.0f;
            this.f131503b = java.lang.Double.TYPE;
        }
    }

    /* loaded from: classes16.dex */
    public static class b extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je {

        /* renamed from: e, reason: collision with root package name */
        int f131507e;

        public b(float f17, int i17) {
            this.f131502a = f17;
            this.f131507e = i17;
            this.f131503b = java.lang.Integer.TYPE;
            this.f131505d = true;
        }

        private int f() {
            return this.f131507e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.je.b e() {
            com.tencent.mapsdk.internal.je.b bVar = new com.tencent.mapsdk.internal.je.b(this.f131502a, this.f131507e);
            bVar.f131504c = this.f131504c;
            return bVar;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        public final void a(java.lang.Object obj) {
            if (obj == null || obj.getClass() != java.lang.Integer.class) {
                return;
            }
            this.f131507e = ((java.lang.Integer) obj).intValue();
            this.f131505d = true;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je
        public final java.lang.Object d() {
            return java.lang.Integer.valueOf(this.f131507e);
        }

        public b() {
            this.f131502a = 0.0f;
            this.f131503b = java.lang.Integer.TYPE;
        }
    }

    private void a(float f17) {
        this.f131502a = f17;
    }

    private void a(android.view.animation.Interpolator interpolator) {
        this.f131504c = interpolator;
    }
}
