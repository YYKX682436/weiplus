package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public abstract class je implements java.lang.Cloneable {

    /* renamed from: a, reason: collision with root package name */
    float f49969a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.Class<?> f49970b;

    /* renamed from: c, reason: collision with root package name */
    android.view.animation.Interpolator f49971c = null;

    /* renamed from: d, reason: collision with root package name */
    boolean f49972d = false;

    /* loaded from: classes16.dex */
    public static class c extends com.tencent.mapsdk.internal.je {

        /* renamed from: e, reason: collision with root package name */
        java.lang.Object f49975e;

        public c(float f17, java.lang.Object obj) {
            this.f49969a = f17;
            this.f49975e = obj;
            boolean z17 = obj != null;
            this.f49972d = z17;
            this.f49970b = z17 ? obj.getClass() : java.lang.Object.class;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.je
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.je.c e() {
            com.tencent.mapsdk.internal.je.c cVar = new com.tencent.mapsdk.internal.je.c(this.f49969a, this.f49975e);
            cVar.f49971c = this.f49971c;
            return cVar;
        }

        @Override // com.tencent.mapsdk.internal.je
        public final void a(java.lang.Object obj) {
            this.f49975e = obj;
            this.f49972d = obj != null;
        }

        @Override // com.tencent.mapsdk.internal.je
        public final java.lang.Object d() {
            return this.f49975e;
        }
    }

    public static com.tencent.mapsdk.internal.je a(float f17, int i17) {
        return new com.tencent.mapsdk.internal.je.b(f17, i17);
    }

    public static com.tencent.mapsdk.internal.je b() {
        return new com.tencent.mapsdk.internal.je.a();
    }

    public static com.tencent.mapsdk.internal.je c() {
        return new com.tencent.mapsdk.internal.je.c(0.0f, null);
    }

    private boolean f() {
        return this.f49972d;
    }

    private float g() {
        return this.f49969a;
    }

    private android.view.animation.Interpolator h() {
        return this.f49971c;
    }

    private java.lang.Class i() {
        return this.f49970b;
    }

    public abstract void a(java.lang.Object obj);

    public abstract java.lang.Object d();

    @Override // 
    public abstract com.tencent.mapsdk.internal.je e();

    public static com.tencent.mapsdk.internal.je a() {
        return new com.tencent.mapsdk.internal.je.b();
    }

    public static com.tencent.mapsdk.internal.je a(float f17, double d17) {
        return new com.tencent.mapsdk.internal.je.a(f17, d17);
    }

    public static com.tencent.mapsdk.internal.je a(float f17, java.lang.Object obj) {
        return new com.tencent.mapsdk.internal.je.c(f17, obj);
    }

    /* loaded from: classes16.dex */
    public static class a extends com.tencent.mapsdk.internal.je {

        /* renamed from: e, reason: collision with root package name */
        double f49973e;

        public a(float f17, double d17) {
            this.f49969a = f17;
            this.f49973e = d17;
            this.f49970b = java.lang.Double.TYPE;
            this.f49972d = true;
        }

        private double f() {
            return this.f49973e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.je
        /* renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.je.a e() {
            com.tencent.mapsdk.internal.je.a aVar = new com.tencent.mapsdk.internal.je.a(this.f49969a, this.f49973e);
            aVar.f49971c = this.f49971c;
            return aVar;
        }

        @Override // com.tencent.mapsdk.internal.je
        public final void a(java.lang.Object obj) {
            if (obj == null || obj.getClass() != java.lang.Double.class) {
                return;
            }
            this.f49973e = ((java.lang.Double) obj).doubleValue();
            this.f49972d = true;
        }

        @Override // com.tencent.mapsdk.internal.je
        public final java.lang.Object d() {
            return java.lang.Double.valueOf(this.f49973e);
        }

        public a() {
            this.f49969a = 0.0f;
            this.f49970b = java.lang.Double.TYPE;
        }
    }

    /* loaded from: classes16.dex */
    public static class b extends com.tencent.mapsdk.internal.je {

        /* renamed from: e, reason: collision with root package name */
        int f49974e;

        public b(float f17, int i17) {
            this.f49969a = f17;
            this.f49974e = i17;
            this.f49970b = java.lang.Integer.TYPE;
            this.f49972d = true;
        }

        private int f() {
            return this.f49974e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.je
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.je.b e() {
            com.tencent.mapsdk.internal.je.b bVar = new com.tencent.mapsdk.internal.je.b(this.f49969a, this.f49974e);
            bVar.f49971c = this.f49971c;
            return bVar;
        }

        @Override // com.tencent.mapsdk.internal.je
        public final void a(java.lang.Object obj) {
            if (obj == null || obj.getClass() != java.lang.Integer.class) {
                return;
            }
            this.f49974e = ((java.lang.Integer) obj).intValue();
            this.f49972d = true;
        }

        @Override // com.tencent.mapsdk.internal.je
        public final java.lang.Object d() {
            return java.lang.Integer.valueOf(this.f49974e);
        }

        public b() {
            this.f49969a = 0.0f;
            this.f49970b = java.lang.Integer.TYPE;
        }
    }

    private void a(float f17) {
        this.f49969a = f17;
    }

    private void a(android.view.animation.Interpolator interpolator) {
        this.f49971c = interpolator;
    }
}
