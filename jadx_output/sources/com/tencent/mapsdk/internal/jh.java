package com.tencent.mapsdk.internal;

/* loaded from: classes16.dex */
public class jh implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.jk<java.lang.Integer> f49983d = new com.tencent.mapsdk.internal.jc();

    /* renamed from: e, reason: collision with root package name */
    private static final com.tencent.mapsdk.internal.jk<java.lang.Number> f49984e = new com.tencent.mapsdk.internal.ja();

    /* renamed from: a, reason: collision with root package name */
    int f49985a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.Class<?> f49986b;

    /* renamed from: c, reason: collision with root package name */
    com.tencent.mapsdk.internal.jf f49987c;

    /* renamed from: f, reason: collision with root package name */
    private com.tencent.mapsdk.internal.jk f49988f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.Object f49989g;

    /* loaded from: classes16.dex */
    public static class a extends com.tencent.mapsdk.internal.jh {

        /* renamed from: d, reason: collision with root package name */
        com.tencent.mapsdk.internal.jb f49990d;

        /* renamed from: e, reason: collision with root package name */
        double f49991e;

        private a(int i17, com.tencent.mapsdk.internal.jb jbVar) {
            super(i17, (byte) 0);
            this.f49986b = java.lang.Float.TYPE;
            this.f49987c = jbVar;
            this.f49990d = jbVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.jh
        /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.jh.a clone() {
            com.tencent.mapsdk.internal.jh.a aVar = (com.tencent.mapsdk.internal.jh.a) super.clone();
            aVar.f49990d = (com.tencent.mapsdk.internal.jb) aVar.f49987c;
            return aVar;
        }

        @Override // com.tencent.mapsdk.internal.jh
        public final java.lang.Object b() {
            return java.lang.Double.valueOf(this.f49991e);
        }

        @Override // com.tencent.mapsdk.internal.jh
        public final void a(double... dArr) {
            super.a(dArr);
            this.f49990d = (com.tencent.mapsdk.internal.jb) this.f49987c;
        }

        @Override // com.tencent.mapsdk.internal.jh
        public final void a(float f17) {
            this.f49991e = this.f49990d.b(f17);
        }

        public a(int i17, double... dArr) {
            super(i17, (byte) 0);
            a(dArr);
        }

        @Override // com.tencent.mapsdk.internal.jh
        public final void a(com.tencent.mapsdk.internal.it itVar) {
            if (itVar != null) {
                itVar.a(this.f49985a, java.lang.Double.valueOf(this.f49991e));
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class b extends com.tencent.mapsdk.internal.jh {

        /* renamed from: d, reason: collision with root package name */
        com.tencent.mapsdk.internal.jd f49992d;

        /* renamed from: e, reason: collision with root package name */
        int f49993e;

        private b(int i17, com.tencent.mapsdk.internal.jd jdVar) {
            super(i17, (byte) 0);
            this.f49986b = java.lang.Integer.TYPE;
            this.f49987c = jdVar;
            this.f49992d = jdVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.mapsdk.internal.jh
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.jh.b clone() {
            com.tencent.mapsdk.internal.jh.b bVar = (com.tencent.mapsdk.internal.jh.b) super.clone();
            bVar.f49992d = (com.tencent.mapsdk.internal.jd) bVar.f49987c;
            return bVar;
        }

        @Override // com.tencent.mapsdk.internal.jh
        public final java.lang.Object b() {
            return java.lang.Integer.valueOf(this.f49993e);
        }

        @Override // com.tencent.mapsdk.internal.jh
        public final void a(int... iArr) {
            super.a(iArr);
            this.f49992d = (com.tencent.mapsdk.internal.jd) this.f49987c;
        }

        @Override // com.tencent.mapsdk.internal.jh
        public final void a(float f17) {
            this.f49993e = this.f49992d.b(f17);
        }

        public b(int i17, int... iArr) {
            super(i17, (byte) 0);
            a(iArr);
        }

        @Override // com.tencent.mapsdk.internal.jh
        public final void a(com.tencent.mapsdk.internal.it itVar) {
            if (itVar != null) {
                itVar.a(this.f49985a, java.lang.Integer.valueOf(this.f49993e));
            }
        }
    }

    public /* synthetic */ jh(int i17, byte b17) {
        this(i17);
    }

    public static com.tencent.mapsdk.internal.jh a(int i17, int... iArr) {
        return new com.tencent.mapsdk.internal.jh.b(i17, iArr);
    }

    private void c() {
        if (this.f49988f == null) {
            java.lang.Class<?> cls = this.f49986b;
            this.f49988f = cls == java.lang.Integer.class ? f49983d : cls == java.lang.Double.class ? f49984e : null;
        }
        com.tencent.mapsdk.internal.jk jkVar = this.f49988f;
        if (jkVar != null) {
            this.f49987c.f49981f = jkVar;
        }
    }

    private int d() {
        return this.f49985a;
    }

    public java.lang.Object b() {
        return this.f49989g;
    }

    public java.lang.String toString() {
        return this.f49985a + ": " + this.f49987c.toString();
    }

    private jh(int i17) {
        this.f49987c = null;
        this.f49985a = i17;
    }

    public static com.tencent.mapsdk.internal.jh a(int i17, double... dArr) {
        return new com.tencent.mapsdk.internal.jh.a(i17, dArr);
    }

    public static com.tencent.mapsdk.internal.jh a(int i17, java.lang.Object... objArr) {
        com.tencent.mapsdk.internal.jh jhVar = new com.tencent.mapsdk.internal.jh(i17);
        jhVar.a(objArr);
        jhVar.a((com.tencent.mapsdk.internal.jk) null);
        return jhVar;
    }

    public void a(int... iArr) {
        this.f49986b = java.lang.Integer.TYPE;
        int length = iArr.length;
        com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[java.lang.Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = new com.tencent.mapsdk.internal.je.b();
            bVarArr[1] = (com.tencent.mapsdk.internal.je.b) com.tencent.mapsdk.internal.je.a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (com.tencent.mapsdk.internal.je.b) com.tencent.mapsdk.internal.je.a(0.0f, iArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                bVarArr[i17] = (com.tencent.mapsdk.internal.je.b) com.tencent.mapsdk.internal.je.a(i17 / (length - 1), iArr[i17]);
            }
        }
        this.f49987c = new com.tencent.mapsdk.internal.jd(bVarArr);
    }

    public void a(double... dArr) {
        this.f49986b = java.lang.Double.TYPE;
        int length = dArr.length;
        com.tencent.mapsdk.internal.je.a[] aVarArr = new com.tencent.mapsdk.internal.je.a[java.lang.Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = new com.tencent.mapsdk.internal.je.a();
            aVarArr[1] = (com.tencent.mapsdk.internal.je.a) com.tencent.mapsdk.internal.je.a(1.0f, dArr[0]);
        } else {
            aVarArr[0] = (com.tencent.mapsdk.internal.je.a) com.tencent.mapsdk.internal.je.a(0.0f, dArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                aVarArr[i17] = (com.tencent.mapsdk.internal.je.a) com.tencent.mapsdk.internal.je.a(i17 / (length - 1), dArr[i17]);
            }
        }
        this.f49987c = new com.tencent.mapsdk.internal.jb(aVarArr);
    }

    private void a(com.tencent.mapsdk.internal.je... jeVarArr) {
        int length = jeVarArr.length;
        com.tencent.mapsdk.internal.je[] jeVarArr2 = new com.tencent.mapsdk.internal.je[java.lang.Math.max(length, 2)];
        for (int i17 = 0; i17 < length; i17++) {
            jeVarArr2[i17] = jeVarArr[i17];
        }
        this.f49987c = new com.tencent.mapsdk.internal.jf(jeVarArr2);
    }

    public final void a(java.lang.Object... objArr) {
        this.f49986b = objArr[0].getClass();
        this.f49987c = com.tencent.mapsdk.internal.jf.a(objArr);
    }

    @Override // 
    /* renamed from: a */
    public com.tencent.mapsdk.internal.jh clone() {
        try {
            com.tencent.mapsdk.internal.jh jhVar = (com.tencent.mapsdk.internal.jh) super.clone();
            jhVar.f49985a = this.f49985a;
            jhVar.f49987c = this.f49987c.clone();
            jhVar.f49988f = this.f49988f;
            return jhVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public void a(com.tencent.mapsdk.internal.it itVar) {
        if (itVar != null) {
            itVar.a(this.f49985a, b());
        }
    }

    public final void a(com.tencent.mapsdk.internal.jk jkVar) {
        this.f49988f = jkVar;
        this.f49987c.f49981f = jkVar;
    }

    public void a(float f17) {
        this.f49989g = this.f49987c.a(f17);
    }

    private void a(int i17) {
        this.f49985a = i17;
    }

    private static com.tencent.mapsdk.internal.jh a(int i17, com.tencent.mapsdk.internal.je... jeVarArr) {
        com.tencent.mapsdk.internal.jf jfVar;
        int length = jeVarArr.length;
        int i18 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        for (com.tencent.mapsdk.internal.je jeVar : jeVarArr) {
            if (jeVar instanceof com.tencent.mapsdk.internal.je.a) {
                z17 = true;
            } else if (jeVar instanceof com.tencent.mapsdk.internal.je.b) {
                z18 = true;
            } else {
                z19 = true;
            }
        }
        if (z17 && !z18 && !z19) {
            com.tencent.mapsdk.internal.je.a[] aVarArr = new com.tencent.mapsdk.internal.je.a[length];
            while (i18 < length) {
                aVarArr[i18] = (com.tencent.mapsdk.internal.je.a) jeVarArr[i18];
                i18++;
            }
            jfVar = new com.tencent.mapsdk.internal.jb(aVarArr);
        } else if (z18 && !z17 && !z19) {
            com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[length];
            while (i18 < length) {
                bVarArr[i18] = (com.tencent.mapsdk.internal.je.b) jeVarArr[i18];
                i18++;
            }
            jfVar = new com.tencent.mapsdk.internal.jd(bVarArr);
        } else {
            jfVar = new com.tencent.mapsdk.internal.jf(jeVarArr);
        }
        com.tencent.mapsdk.internal.jh jhVar = new com.tencent.mapsdk.internal.jh(i17);
        jhVar.f49987c = jfVar;
        return jhVar;
    }
}
