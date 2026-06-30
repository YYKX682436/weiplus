package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes16.dex */
public class jh implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    private static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk<java.lang.Integer> f131516d = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jc();

    /* renamed from: e, reason: collision with root package name */
    private static final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk<java.lang.Number> f131517e = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ja();

    /* renamed from: a, reason: collision with root package name */
    int f131518a;

    /* renamed from: b, reason: collision with root package name */
    java.lang.Class<?> f131519b;

    /* renamed from: c, reason: collision with root package name */
    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf f131520c;

    /* renamed from: f, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk f131521f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.Object f131522g;

    /* loaded from: classes16.dex */
    public static class a extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh {

        /* renamed from: d, reason: collision with root package name */
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb f131523d;

        /* renamed from: e, reason: collision with root package name */
        double f131524e;

        private a(int i17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb jbVar) {
            super(i17, (byte) 0);
            this.f131519b = java.lang.Float.TYPE;
            this.f131520c = jbVar;
            this.f131523d = jbVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.jh.a mo36799x5a5dd5d() {
            com.tencent.mapsdk.internal.jh.a aVar = (com.tencent.mapsdk.internal.jh.a) super.mo36799x5a5dd5d();
            aVar.f131523d = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb) aVar.f131520c;
            return aVar;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        public final java.lang.Object b() {
            return java.lang.Double.valueOf(this.f131524e);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        public final void a(double... dArr) {
            super.a(dArr);
            this.f131523d = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb) this.f131520c;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        public final void a(float f17) {
            this.f131524e = this.f131523d.b(f17);
        }

        public a(int i17, double... dArr) {
            super(i17, (byte) 0);
            a(dArr);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar) {
            if (itVar != null) {
                itVar.a(this.f131518a, java.lang.Double.valueOf(this.f131524e));
            }
        }
    }

    /* loaded from: classes16.dex */
    public static class b extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh {

        /* renamed from: d, reason: collision with root package name */
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd f131525d;

        /* renamed from: e, reason: collision with root package name */
        int f131526e;

        private b(int i17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd jdVar) {
            super(i17, (byte) 0);
            this.f131519b = java.lang.Integer.TYPE;
            this.f131520c = jdVar;
            this.f131525d = jdVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.jh.b mo36799x5a5dd5d() {
            com.tencent.mapsdk.internal.jh.b bVar = (com.tencent.mapsdk.internal.jh.b) super.mo36799x5a5dd5d();
            bVar.f131525d = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd) bVar.f131520c;
            return bVar;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        public final java.lang.Object b() {
            return java.lang.Integer.valueOf(this.f131526e);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        public final void a(int... iArr) {
            super.a(iArr);
            this.f131525d = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd) this.f131520c;
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        public final void a(float f17) {
            this.f131526e = this.f131525d.b(f17);
        }

        public b(int i17, int... iArr) {
            super(i17, (byte) 0);
            a(iArr);
        }

        @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh
        public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar) {
            if (itVar != null) {
                itVar.a(this.f131518a, java.lang.Integer.valueOf(this.f131526e));
            }
        }
    }

    public /* synthetic */ jh(int i17, byte b17) {
        this(i17);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh a(int i17, int... iArr) {
        return new com.tencent.mapsdk.internal.jh.b(i17, iArr);
    }

    private void c() {
        if (this.f131521f == null) {
            java.lang.Class<?> cls = this.f131519b;
            this.f131521f = cls == java.lang.Integer.class ? f131516d : cls == java.lang.Double.class ? f131517e : null;
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar = this.f131521f;
        if (jkVar != null) {
            this.f131520c.f131514f = jkVar;
        }
    }

    private int d() {
        return this.f131518a;
    }

    public java.lang.Object b() {
        return this.f131522g;
    }

    /* renamed from: toString */
    public java.lang.String m36800x9616526c() {
        return this.f131518a + ": " + this.f131520c.m36796x9616526c();
    }

    private jh(int i17) {
        this.f131520c = null;
        this.f131518a = i17;
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh a(int i17, double... dArr) {
        return new com.tencent.mapsdk.internal.jh.a(i17, dArr);
    }

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh a(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh jhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh(i17);
        jhVar.a(objArr);
        jhVar.a((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk) null);
        return jhVar;
    }

    public void a(int... iArr) {
        this.f131519b = java.lang.Integer.TYPE;
        int length = iArr.length;
        com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[java.lang.Math.max(length, 2)];
        if (length == 1) {
            bVarArr[0] = new com.tencent.mapsdk.internal.je.b();
            bVarArr[1] = (com.tencent.mapsdk.internal.je.b) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(1.0f, iArr[0]);
        } else {
            bVarArr[0] = (com.tencent.mapsdk.internal.je.b) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(0.0f, iArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                bVarArr[i17] = (com.tencent.mapsdk.internal.je.b) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(i17 / (length - 1), iArr[i17]);
            }
        }
        this.f131520c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd(bVarArr);
    }

    public void a(double... dArr) {
        this.f131519b = java.lang.Double.TYPE;
        int length = dArr.length;
        com.tencent.mapsdk.internal.je.a[] aVarArr = new com.tencent.mapsdk.internal.je.a[java.lang.Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = new com.tencent.mapsdk.internal.je.a();
            aVarArr[1] = (com.tencent.mapsdk.internal.je.a) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(1.0f, dArr[0]);
        } else {
            aVarArr[0] = (com.tencent.mapsdk.internal.je.a) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(0.0f, dArr[0]);
            for (int i17 = 1; i17 < length; i17++) {
                aVarArr[i17] = (com.tencent.mapsdk.internal.je.a) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je.a(i17 / (length - 1), dArr[i17]);
            }
        }
        this.f131520c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb(aVarArr);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je... jeVarArr) {
        int length = jeVarArr.length;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je[] jeVarArr2 = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je[java.lang.Math.max(length, 2)];
        for (int i17 = 0; i17 < length; i17++) {
            jeVarArr2[i17] = jeVarArr[i17];
        }
        this.f131520c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf(jeVarArr2);
    }

    public final void a(java.lang.Object... objArr) {
        this.f131519b = objArr[0].getClass();
        this.f131520c = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf.a(objArr);
    }

    @Override // 
    /* renamed from: a */
    public com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh mo36799x5a5dd5d() {
        try {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh jhVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh) super.clone();
            jhVar.f131518a = this.f131518a;
            jhVar.f131520c = this.f131520c.mo36794x5a5dd5d();
            jhVar.f131521f = this.f131521f;
            return jhVar;
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    public void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it itVar) {
        if (itVar != null) {
            itVar.a(this.f131518a, b());
        }
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jk jkVar) {
        this.f131521f = jkVar;
        this.f131520c.f131514f = jkVar;
    }

    public void a(float f17) {
        this.f131522g = this.f131520c.a(f17);
    }

    private void a(int i17) {
        this.f131518a = i17;
    }

    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh a(int i17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je... jeVarArr) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf jfVar;
        int length = jeVarArr.length;
        int i18 = 0;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.je jeVar : jeVarArr) {
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
            jfVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jb(aVarArr);
        } else if (z18 && !z17 && !z19) {
            com.tencent.mapsdk.internal.je.b[] bVarArr = new com.tencent.mapsdk.internal.je.b[length];
            while (i18 < length) {
                bVarArr[i18] = (com.tencent.mapsdk.internal.je.b) jeVarArr[i18];
                i18++;
            }
            jfVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jd(bVarArr);
        } else {
            jfVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jf(jeVarArr);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh jhVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jh(i17);
        jhVar.f131520c = jfVar;
        return jhVar;
    }
}
