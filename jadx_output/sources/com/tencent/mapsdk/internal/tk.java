package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class tk implements com.tencent.mapsdk.internal.bq, com.tencent.mapsdk.internal.bs, com.tencent.mapsdk.internal.os, com.tencent.mapsdk.internal.ot, com.tencent.mapsdk.internal.ox, com.tencent.mapsdk.internal.oz, com.tencent.mapsdk.internal.pb, com.tencent.mapsdk.internal.pc, com.tencent.mapsdk.internal.pd, com.tencent.mapsdk.internal.pe {

    /* renamed from: a, reason: collision with root package name */
    public static final int f51647a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f51648b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f51649c = -9;

    /* renamed from: n, reason: collision with root package name */
    private static final int f51650n = 256;

    /* renamed from: o, reason: collision with root package name */
    private static final int f51651o = -14803236;

    /* renamed from: p, reason: collision with root package name */
    private static final int f51652p = -13752731;

    /* renamed from: q, reason: collision with root package name */
    private static final int f51653q = -15611905;

    /* renamed from: r, reason: collision with root package name */
    private static final int f51654r = -14650226;

    /* renamed from: s, reason: collision with root package name */
    private static final int f51655s = -11088785;

    /* renamed from: t, reason: collision with root package name */
    private static final int f51656t = -9906011;

    /* renamed from: u, reason: collision with root package name */
    private static final int f51657u = -11635864;

    /* renamed from: v, reason: collision with root package name */
    private static final int f51658v = -16777063;

    /* renamed from: w, reason: collision with root package name */
    private static final int f51659w = -16777063;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mapsdk.engine.jni.JNI f51660d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f51661e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mapsdk.internal.op f51662f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mapsdk.internal.lw f51663g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mapsdk.internal.lv f51664h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ox f51665i;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mapsdk.internal.ne f51666j;

    /* renamed from: k, reason: collision with root package name */
    long f51667k;

    /* renamed from: l, reason: collision with root package name */
    public long f51668l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f51669m;

    /* renamed from: x, reason: collision with root package name */
    private float f51670x;

    /* renamed from: y, reason: collision with root package name */
    private java.lang.String f51671y;

    /* renamed from: z, reason: collision with root package name */
    private final java.util.concurrent.locks.ReentrantLock f51672z;

    /* renamed from: com.tencent.mapsdk.internal.tk$10, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass10 implements com.tencent.map.tools.CallbackRunnable<java.lang.Boolean> {
        public AnonymousClass10() {
        }

        private java.lang.Boolean a() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return java.lang.Boolean.FALSE;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Boolean.valueOf(tkVar.f51660d.nativeNeedDispaly(tkVar.f51661e));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Boolean run() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return java.lang.Boolean.FALSE;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Boolean.valueOf(tkVar.f51660d.nativeNeedDispaly(tkVar.f51661e));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$100, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass100 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LightType f51675a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LightColor f51676b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LightDirection f51677c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f51678d;

        public AnonymousClass100(com.tencent.tencentmap.mapsdk.maps.model.LightType lightType, com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, com.tencent.tencentmap.mapsdk.maps.model.LightDirection lightDirection, float f17) {
            this.f51675a = lightType;
            this.f51676b = lightColor;
            this.f51677c = lightDirection;
            this.f51678d = f17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetSpotOrDirectionalLight(tkVar.f51661e, this.f51675a, this.f51676b, this.f51677c, this.f51678d);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$101, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass101 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.PolygonInfo f51680a;

        public AnonymousClass101(com.tencent.map.lib.models.PolygonInfo polygonInfo) {
            this.f51680a = polygonInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            com.tencent.mapsdk.engine.jni.JNI jni = tkVar.f51660d;
            long j17 = tkVar.f51661e;
            com.tencent.map.lib.models.PolygonInfo polygonInfo = this.f51680a;
            jni.nativeUpdatePolygon(j17, polygonInfo.polygonId, polygonInfo.borderLineId, polygonInfo);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$103, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass103 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.util.List f51684a;

        public AnonymousClass103(java.util.List list) {
            this.f51684a = list;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetIndoorCellInfo(tkVar.f51661e, this.f51684a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$104, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass104 implements com.tencent.mapsdk.internal.ne.a {
        public AnonymousClass104() {
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeResetIndoorCellInfo(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$108, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass108 implements com.tencent.map.tools.CallbackRunnable<java.lang.Boolean> {
        public AnonymousClass108() {
        }

        private java.lang.Boolean a() {
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Boolean.valueOf(tkVar.f51660d.nativeDrawFrame(tkVar.f51661e));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Boolean run() {
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Boolean.valueOf(tkVar.f51660d.nativeDrawFrame(tkVar.f51661e));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$109, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass109 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51694a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51695b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f51696c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int[] f51697d;

        public AnonymousClass109(int i17, int i18, boolean z17, int[] iArr) {
            this.f51694a = i17;
            this.f51695b = i18;
            this.f51696c = z17;
            this.f51697d = iArr;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f51694a < 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            if (tkVar.f51666j == null) {
                return;
            }
            tkVar.f51660d.nativeSetPolygonHidden(tkVar.f51661e, this.f51694a, this.f51695b, this.f51696c, this.f51697d);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$110, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass110 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51702b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int[] f51703c;

        public AnonymousClass110(int i17, int i18, int[] iArr) {
            this.f51701a = i17;
            this.f51702b = i18;
            this.f51703c = iArr;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f51701a < 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            if (tkVar.f51666j == null) {
                return;
            }
            tkVar.f51660d.nativeDeletePolygon(tkVar.f51661e, this.f51701a, this.f51702b, this.f51703c);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$111, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass111 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.MaskLayer f51705a;

        public AnonymousClass111(com.tencent.map.lib.models.MaskLayer maskLayer) {
            this.f51705a = maskLayer;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddMaskLayer(tkVar.f51661e, this.f51705a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddMaskLayer(tkVar.f51661e, this.f51705a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$112, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass112 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51707a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51708b;

        public AnonymousClass112(int i17, int i18) {
            this.f51707a = i17;
            this.f51708b = i18;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateMaskLayer(tkVar.f51661e, this.f51707a, this.f51708b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$113, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass113 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51710a;

        public AnonymousClass113(int i17) {
            this.f51710a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeRemoveMaskLayer(tkVar.f51661e, this.f51710a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$114, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass114 implements com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.GeoPoint> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f51712a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f51713b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f51714c;

        public AnonymousClass114(byte[] bArr, float f17, float f18) {
            this.f51712a = bArr;
            this.f51713b = f17;
            this.f51714c = f18;
        }

        private com.tencent.map.lib.models.GeoPoint a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return new com.tencent.map.lib.models.GeoPoint();
            }
            double[] dArr = new double[2];
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeFromScreenLocation(tkVar.f51661e, this.f51712a, this.f51713b, this.f51714c, dArr);
            return new com.tencent.map.lib.models.GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ com.tencent.map.lib.models.GeoPoint run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return new com.tencent.map.lib.models.GeoPoint();
            }
            double[] dArr = new double[2];
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeFromScreenLocation(tkVar.f51661e, this.f51712a, this.f51713b, this.f51714c, dArr);
            return new com.tencent.map.lib.models.GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$117, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass117 implements com.tencent.map.tools.CallbackRunnable<java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51722a;

        public AnonymousClass117(java.lang.String str) {
            this.f51722a = str;
        }

        private java.lang.Boolean a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return java.lang.Boolean.FALSE;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Boolean.valueOf(tkVar.f51660d.nativeHasStreetRoad(tkVar.f51661e, this.f51722a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Boolean run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return java.lang.Boolean.FALSE;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Boolean.valueOf(tkVar.f51660d.nativeHasStreetRoad(tkVar.f51661e, this.f51722a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$122, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass122 implements com.tencent.mapsdk.internal.ne.a {
        public AnonymousClass122() {
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeShowTraffic(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$123, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass123 implements com.tencent.mapsdk.internal.ne.a {
        public AnonymousClass123() {
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeHideTraffic(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$125, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass125 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51735a;

        public AnonymousClass125(java.lang.String str) {
            this.f51735a = str;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateMapResource(tkVar.f51661e, this.f51735a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$126, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass126 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51737a;

        public AnonymousClass126(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51737a = qvVar;
        }

        private java.lang.Integer a() {
            com.tencent.mapsdk.internal.qv qvVar = this.f51737a;
            if (qvVar == null) {
                return -1;
            }
            int i17 = qvVar.f51076s;
            return i17 != -1 ? java.lang.Integer.valueOf(i17) : java.lang.Integer.valueOf(com.tencent.mapsdk.internal.tk.a(com.tencent.mapsdk.internal.tk.this, qvVar));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            com.tencent.mapsdk.internal.qv qvVar = this.f51737a;
            if (qvVar == null) {
                return -1;
            }
            int i17 = qvVar.f51076s;
            return i17 != -1 ? java.lang.Integer.valueOf(i17) : java.lang.Integer.valueOf(com.tencent.mapsdk.internal.tk.a(com.tencent.mapsdk.internal.tk.this, qvVar));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$127, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass127 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51739a;

        public AnonymousClass127(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51739a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.mapsdk.internal.qv qvVar = this.f51739a;
            if (qvVar == null || qvVar.f51076s == -1) {
                return;
            }
            com.tencent.mapsdk.internal.tk.a(com.tencent.mapsdk.internal.tk.this, qvVar);
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            com.tencent.mapsdk.internal.qv qvVar2 = this.f51739a;
            if (tkVar.f51661e != 0) {
                tkVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass134(qvVar2));
            }
            com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
            tkVar2.a(new com.tencent.mapsdk.internal.tk.AnonymousClass133(this.f51739a));
            com.tencent.mapsdk.internal.tk tkVar3 = com.tencent.mapsdk.internal.tk.this;
            com.tencent.mapsdk.internal.qv qvVar3 = this.f51739a;
            if (tkVar3.f51661e != 0) {
                tkVar3.a(new com.tencent.mapsdk.internal.tk.AnonymousClass135(qvVar3));
            }
            com.tencent.mapsdk.internal.qv qvVar4 = this.f51739a;
            if (qvVar4.f51071b.E) {
                com.tencent.mapsdk.internal.tk tkVar4 = com.tencent.mapsdk.internal.tk.this;
                if (tkVar4.f51661e != 0) {
                    tkVar4.a(new com.tencent.mapsdk.internal.tk.AnonymousClass139(qvVar4));
                }
            } else {
                com.tencent.mapsdk.internal.tk tkVar5 = com.tencent.mapsdk.internal.tk.this;
                if (tkVar5.f51661e != 0) {
                    tkVar5.a(new com.tencent.mapsdk.internal.tk.AnonymousClass138(qvVar4));
                }
            }
            com.tencent.mapsdk.internal.tk tkVar6 = com.tencent.mapsdk.internal.tk.this;
            com.tencent.mapsdk.internal.qv qvVar5 = this.f51739a;
            if (tkVar6.f51661e != 0) {
                tkVar6.a(new com.tencent.mapsdk.internal.tk.AnonymousClass137(qvVar5));
            }
            if (!com.tencent.mapsdk.internal.hr.a(this.f51739a.f51071b.H)) {
                com.tencent.mapsdk.internal.tk tkVar7 = com.tencent.mapsdk.internal.tk.this;
                com.tencent.mapsdk.internal.qv qvVar6 = this.f51739a;
                if (tkVar7.f51661e != 0) {
                    tkVar7.a(new com.tencent.mapsdk.internal.tk.AnonymousClass136(qvVar6));
                }
            }
            com.tencent.mapsdk.internal.tk tkVar8 = com.tencent.mapsdk.internal.tk.this;
            tkVar8.a(new com.tencent.mapsdk.internal.tk.AnonymousClass40(this.f51739a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$128, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass128 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51741a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51742b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f51743c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f51744d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int[] f51745e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int[] f51746f;

        public AnonymousClass128(com.tencent.mapsdk.internal.qv qvVar, int i17, boolean z17, boolean z18, int[] iArr, int[] iArr2) {
            this.f51741a = qvVar;
            this.f51742b = i17;
            this.f51743c = z17;
            this.f51744d = z18;
            this.f51745e = iArr;
            this.f51746f = iArr2;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.Integer a() {
            /*
                r26 = this;
                r0 = r26
                com.tencent.mapsdk.internal.tk r1 = com.tencent.mapsdk.internal.tk.this
                com.tencent.mapsdk.engine.jni.JNI r2 = r1.f51660d
                long r3 = r1.f51661e
                com.tencent.mapsdk.internal.qv r1 = r0.f51741a
                int r5 = r1.f51076s
                int[] r6 = r1.f51073p
                int[] r7 = r1.f51072d
                com.tencent.mapsdk.internal.fy r1 = r1.f51071b
                java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> r1 = r1.f49513m
                r8 = 0
                com.tencent.map.lib.models.GeoPoint[] r9 = new com.tencent.map.lib.models.GeoPoint[r8]
                java.lang.Object[] r1 = r1.toArray(r9)
                com.tencent.map.lib.models.GeoPoint[] r1 = (com.tencent.map.lib.models.GeoPoint[]) r1
                com.tencent.mapsdk.internal.qv r9 = r0.f51741a
                com.tencent.mapsdk.internal.fy r10 = r9.f51071b
                int[] r11 = r10.f49518r
                if (r11 == 0) goto L38
                int r12 = r11.length
                if (r12 <= 0) goto L38
                r8 = r11[r8]
                r11 = 33
                if (r8 != r11) goto L31
                java.lang.String r8 = "color_point_texture.png"
                goto L47
            L31:
                r11 = 20
                if (r8 != r11) goto L38
                java.lang.String r8 = "color_texture_line_v2.png"
                goto L47
            L38:
                java.lang.String r8 = r10.f49525y
                boolean r8 = com.tencent.mapsdk.internal.hr.a(r8)
                if (r8 == 0) goto L43
                java.lang.String r8 = "color_texture_flat_style.png"
                goto L47
            L43:
                com.tencent.mapsdk.internal.fy r8 = r9.f51071b
                java.lang.String r8 = r8.f49525y
            L47:
                r9 = r8
                com.tencent.mapsdk.internal.qv r8 = r0.f51741a
                com.tencent.mapsdk.internal.fy r10 = r8.f51071b
                float r11 = r10.f49524x
                int r12 = r0.f51742b
                boolean r13 = r0.f51743c
                boolean r14 = r0.f51744d
                boolean r15 = r10.B
                boolean r10 = r10.O
                int r8 = r8.getZIndex()
                float r8 = (float) r8
                r16 = r8
                com.tencent.mapsdk.internal.qv r8 = r0.f51741a
                r17 = r10
                com.tencent.mapsdk.internal.fy r10 = r8.f51071b
                r18 = r15
                boolean r15 = r10.f49522v
                r19 = r15
                int[] r15 = r10.f49519s
                r20 = r15
                int[] r15 = r0.f51745e
                r21 = r15
                float r15 = r10.f49521u
                r22 = r15
                int[] r15 = r0.f51746f
                if (r10 != 0) goto L7e
                r10 = 1065353216(0x3f800000, float:1.0)
                goto L80
            L7e:
                float r10 = r10.A
            L80:
                r25 = r10
                int r23 = r8.getLevel()
                com.tencent.mapsdk.internal.qv r8 = r0.f51741a
                boolean r24 = r8.isVisible()
                r8 = r1
                r1 = r17
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r18
                r17 = r19
                r18 = r20
                r19 = r21
                r20 = r22
                r21 = r15
                r15 = r1
                r22 = r25
                int r1 = r2.nativeCreateOrUpdateLine(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.tk.AnonymousClass128.a():java.lang.Integer");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
        @Override // com.tencent.map.tools.CallbackRunnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ java.lang.Integer run() {
            /*
                r26 = this;
                r0 = r26
                com.tencent.mapsdk.internal.tk r1 = com.tencent.mapsdk.internal.tk.this
                com.tencent.mapsdk.engine.jni.JNI r2 = r1.f51660d
                long r3 = r1.f51661e
                com.tencent.mapsdk.internal.qv r1 = r0.f51741a
                int r5 = r1.f51076s
                int[] r6 = r1.f51073p
                int[] r7 = r1.f51072d
                com.tencent.mapsdk.internal.fy r1 = r1.f51071b
                java.util.ArrayList<com.tencent.map.lib.models.GeoPoint> r1 = r1.f49513m
                r8 = 0
                com.tencent.map.lib.models.GeoPoint[] r9 = new com.tencent.map.lib.models.GeoPoint[r8]
                java.lang.Object[] r1 = r1.toArray(r9)
                com.tencent.map.lib.models.GeoPoint[] r1 = (com.tencent.map.lib.models.GeoPoint[]) r1
                com.tencent.mapsdk.internal.qv r9 = r0.f51741a
                com.tencent.mapsdk.internal.fy r10 = r9.f51071b
                int[] r11 = r10.f49518r
                if (r11 == 0) goto L38
                int r12 = r11.length
                if (r12 <= 0) goto L38
                r8 = r11[r8]
                r11 = 33
                if (r8 != r11) goto L31
                java.lang.String r8 = "color_point_texture.png"
                goto L47
            L31:
                r11 = 20
                if (r8 != r11) goto L38
                java.lang.String r8 = "color_texture_line_v2.png"
                goto L47
            L38:
                java.lang.String r8 = r10.f49525y
                boolean r8 = com.tencent.mapsdk.internal.hr.a(r8)
                if (r8 == 0) goto L43
                java.lang.String r8 = "color_texture_flat_style.png"
                goto L47
            L43:
                com.tencent.mapsdk.internal.fy r8 = r9.f51071b
                java.lang.String r8 = r8.f49525y
            L47:
                r9 = r8
                com.tencent.mapsdk.internal.qv r8 = r0.f51741a
                com.tencent.mapsdk.internal.fy r10 = r8.f51071b
                float r11 = r10.f49524x
                int r12 = r0.f51742b
                boolean r13 = r0.f51743c
                boolean r14 = r0.f51744d
                boolean r15 = r10.B
                boolean r10 = r10.O
                int r8 = r8.getZIndex()
                float r8 = (float) r8
                r16 = r8
                com.tencent.mapsdk.internal.qv r8 = r0.f51741a
                r17 = r10
                com.tencent.mapsdk.internal.fy r10 = r8.f51071b
                r18 = r15
                boolean r15 = r10.f49522v
                r19 = r15
                int[] r15 = r10.f49519s
                r20 = r15
                int[] r15 = r0.f51745e
                r21 = r15
                float r15 = r10.f49521u
                r22 = r15
                int[] r15 = r0.f51746f
                if (r10 != 0) goto L7e
                r10 = 1065353216(0x3f800000, float:1.0)
                goto L80
            L7e:
                float r10 = r10.A
            L80:
                r25 = r10
                int r23 = r8.getLevel()
                com.tencent.mapsdk.internal.qv r8 = r0.f51741a
                boolean r24 = r8.isVisible()
                r8 = r1
                r1 = r17
                r10 = r11
                r11 = r12
                r12 = r13
                r13 = r14
                r14 = r18
                r17 = r19
                r18 = r20
                r19 = r21
                r20 = r22
                r21 = r15
                r15 = r1
                r22 = r25
                int r1 = r2.nativeCreateOrUpdateLine(r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.tk.AnonymousClass128.run():java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$129, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass129 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51748a;

        public AnonymousClass129(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51748a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            int i17;
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || (i17 = this.f51748a.f51076s) == -1) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetLineSelected(tkVar.f51661e, i17, this.f51748a.isSelected());
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$13, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass13 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51750a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51751b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f51752c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f51753d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f51754e;

        public AnonymousClass13(int i17, int i18, int i19, int i27, int i28) {
            this.f51750a = i17;
            this.f51751b = i18;
            this.f51752c = i19;
            this.f51753d = i27;
            this.f51754e = i28;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeCheckTrafficBlockCache(tkVar.f51661e, this.f51750a, this.f51751b, this.f51752c, this.f51753d, this.f51754e);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$131, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass131 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51757a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f51758b;

        public AnonymousClass131(int i17, boolean z17) {
            this.f51757a = i17;
            this.f51758b = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (this.f51757a == -1) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeDeleteLine(tkVar.f51661e, this.f51757a, this.f51758b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$133, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass133 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51764a;

        public AnonymousClass133(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51764a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.mapsdk.internal.qv.a aVar;
            com.tencent.mapsdk.internal.qv qvVar = this.f51764a;
            int i17 = qvVar.f51076s;
            if (i17 == -1 || (aVar = qvVar.f51077t) == null) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetTurnArrow(tkVar.f51661e, i17, this.f51764a.f51071b.f49513m, aVar.f51084a, aVar.f51085b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$134, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass134 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51766a;

        public AnonymousClass134(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51766a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.mapsdk.internal.qv qvVar = this.f51766a;
            int i17 = qvVar.f51076s;
            if (i17 == -1) {
                return;
            }
            com.tencent.mapsdk.internal.fy fyVar = qvVar.f51071b;
            int[] iArr = {fyVar.f49511J, fyVar.K};
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetTurnArrowStyle(tkVar.f51661e, i17, iArr[0], iArr[1]);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$135, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass135 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51768a;

        public AnonymousClass135(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51768a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            int i17 = this.f51768a.f51076s;
            if (i17 == -1) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetLineDrawArrow(tkVar.f51661e, i17, this.f51768a.f51071b.f49523w);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$136, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass136 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51770a;

        public AnonymousClass136(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51770a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            int i17 = this.f51770a.f51076s;
            if (i17 == -1) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetLineDirectionArrowTextureName(tkVar.f51661e, i17, this.f51770a.f51071b.H);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$137, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass137 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51772a;

        public AnonymousClass137(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51772a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            int i17 = this.f51772a.f51076s;
            if (i17 == -1) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetDrawCap(tkVar.f51661e, i17, this.f51772a.f51071b.f49526z);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$138, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass138 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51774a;

        public AnonymousClass138(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51774a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.map.lib.models.GeoPoint geoPoint;
            com.tencent.mapsdk.internal.qv qvVar = this.f51774a;
            int i17 = qvVar.f51076s;
            if (i17 == -1 || (geoPoint = qvVar.f51075r) == null) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeLineInsertPoint(tkVar.f51661e, i17, geoPoint, this.f51774a.f51074q);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$139, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass139 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51776a;

        public AnonymousClass139(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51776a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.map.lib.models.GeoPoint geoPoint;
            com.tencent.mapsdk.internal.qv qvVar = this.f51776a;
            int i17 = qvVar.f51076s;
            if (i17 == -1 || (geoPoint = qvVar.f51075r) == null) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeLineClearPoint(tkVar.f51661e, i17, geoPoint, this.f51776a.f51074q);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$143, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass143 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f51785a;

        public AnonymousClass143(boolean z17) {
            this.f51785a = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (0 != com.tencent.mapsdk.internal.tk.this.f51661e) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetBuilding3DEffect(tkVar.f51661e, this.f51785a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$146, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass146 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f51794a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f51795b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f51796c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f51797d;

        public AnonymousClass146(boolean z17, boolean z18, boolean z19, boolean z27) {
            this.f51794a = z17;
            this.f51795b = z18;
            this.f51796c = z19;
            this.f51797d = z27;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetLocationFollow(tkVar.f51661e, this.f51794a, this.f51795b, this.f51796c, this.f51797d);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$148, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass148 implements com.tencent.mapsdk.internal.ne.a {
        public AnonymousClass148() {
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeHideCompass(tkVar.f51661e);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$149, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass149 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.pi f51802a;

        public AnonymousClass149(com.tencent.mapsdk.internal.pi piVar) {
            this.f51802a = piVar;
        }

        private java.lang.Integer a() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            com.tencent.mapsdk.engine.jni.JNI jni = tkVar.f51660d;
            long j17 = tkVar.f51661e;
            com.tencent.mapsdk.internal.pi piVar = this.f51802a;
            java.lang.String str = piVar.f50609f;
            java.lang.String str2 = piVar.f50616m;
            double d17 = piVar.f50612i;
            double d18 = piVar.f50613j;
            float f17 = piVar.f50617n;
            float f18 = piVar.f50618o;
            float f19 = piVar.f50626w;
            float f27 = piVar.f50627x;
            float f28 = piVar.f50625v;
            float a17 = piVar.a();
            com.tencent.mapsdk.internal.pi piVar2 = this.f51802a;
            return java.lang.Integer.valueOf(jni.nativeAddMarker(j17, str, str2, d17, d18, f17, f18, f19, f27, f28, a17, piVar2.f50629z, piVar2.f50628y, piVar2.C, piVar2.D, piVar2.E, piVar2.G, piVar2.F));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            com.tencent.mapsdk.engine.jni.JNI jni = tkVar.f51660d;
            long j17 = tkVar.f51661e;
            com.tencent.mapsdk.internal.pi piVar = this.f51802a;
            java.lang.String str = piVar.f50609f;
            java.lang.String str2 = piVar.f50616m;
            double d17 = piVar.f50612i;
            double d18 = piVar.f50613j;
            float f17 = piVar.f50617n;
            float f18 = piVar.f50618o;
            float f19 = piVar.f50626w;
            float f27 = piVar.f50627x;
            float f28 = piVar.f50625v;
            float a17 = piVar.a();
            com.tencent.mapsdk.internal.pi piVar2 = this.f51802a;
            return java.lang.Integer.valueOf(jni.nativeAddMarker(j17, str, str2, d17, d18, f17, f18, f19, f27, f28, a17, piVar2.f50629z, piVar2.f50628y, piVar2.C, piVar2.D, piVar2.E, piVar2.G, piVar2.F));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$15, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass15 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f51804a;

        public AnonymousClass15(float f17) {
            this.f51804a = f17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetRotate(tkVar.f51661e, this.f51804a, false);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$150, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass150 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.pi f51806a;

        public AnonymousClass150(com.tencent.mapsdk.internal.pi piVar) {
            this.f51806a = piVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                com.tencent.mapsdk.engine.jni.JNI jni = tkVar.f51660d;
                long j17 = tkVar.f51661e;
                int a17 = this.f51806a.I.a();
                com.tencent.mapsdk.internal.pi piVar = this.f51806a;
                java.lang.String str = piVar.f50609f;
                double d17 = piVar.f50612i;
                double d18 = piVar.f50613j;
                float f17 = piVar.f50617n;
                float f18 = piVar.f50618o;
                float f19 = piVar.f50626w;
                float f27 = piVar.f50627x;
                float f28 = piVar.f50625v;
                float a18 = piVar.a();
                com.tencent.mapsdk.internal.pi piVar2 = this.f51806a;
                jni.nativeUpdateMarkerInfo(j17, a17, str, d17, d18, f17, f18, f19, f27, f28, a18, piVar2.f50629z, piVar2.f50628y, piVar2.C, piVar2.D, piVar2.E, piVar2.G, piVar2.F, piVar2.f50601J);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$153, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass153 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int[] f51812a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51813b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f51814c;

        public AnonymousClass153(int[] iArr, int i17, boolean z17) {
            this.f51812a = iArr;
            this.f51813b = i17;
            this.f51814c = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetIconsHidden(tkVar.f51661e, this.f51812a, this.f51813b, this.f51814c);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$156, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass156 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51821a;

        public AnonymousClass156(java.lang.String str) {
            this.f51821a = str;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetCompassImage(tkVar.f51661e, this.f51821a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$162, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass162 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51838a;

        public AnonymousClass162(int i17) {
            this.f51838a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetIndoorConfigType(tkVar.f51661e, this.f51838a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$163, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass163 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51840a;

        public AnonymousClass163(java.lang.String str) {
            this.f51840a = str;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeIsCityHasTraffic(tkVar.f51661e, this.f51840a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeIsCityHasTraffic(tkVar.f51661e, this.f51840a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$164, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass164 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51842a;

        public AnonymousClass164(int i17) {
            this.f51842a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (0 != com.tencent.mapsdk.internal.tk.this.f51661e) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                if (tkVar.f51666j == null) {
                    return;
                }
                tkVar.f51660d.nativeSetIndoorFloor(tkVar.f51661e, this.f51842a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$166, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass166 implements com.tencent.map.tools.CallbackRunnable<java.lang.String[]> {
        public AnonymousClass166() {
        }

        private java.lang.String[] a() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetIndoorFloorNames(tkVar.f51661e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.String[] run() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetIndoorFloorNames(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$167, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass167 implements com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.qr> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GeoPoint f51846a;

        public AnonymousClass167(com.tencent.map.lib.models.GeoPoint geoPoint) {
            this.f51846a = geoPoint;
        }

        private com.tencent.mapsdk.internal.qr a() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            java.lang.String nativeGetActiveIndoorBuildingGUID = tkVar.f51660d.nativeGetActiveIndoorBuildingGUID(tkVar.f51661e);
            com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
            java.lang.String nativeGetCurIndoorName = tkVar2.f51660d.nativeGetCurIndoorName(tkVar2.f51661e, this.f51846a);
            com.tencent.mapsdk.internal.tk tkVar3 = com.tencent.mapsdk.internal.tk.this;
            int nativeGetIndoorCurrentFloorId = tkVar3.f51660d.nativeGetIndoorCurrentFloorId(tkVar3.f51661e);
            com.tencent.mapsdk.internal.tk tkVar4 = com.tencent.mapsdk.internal.tk.this;
            return new com.tencent.mapsdk.internal.qr(nativeGetActiveIndoorBuildingGUID, nativeGetCurIndoorName, tkVar4.f51660d.nativeGetIndoorFloorNames(tkVar4.f51661e), nativeGetIndoorCurrentFloorId);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ com.tencent.mapsdk.internal.qr run() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            java.lang.String nativeGetActiveIndoorBuildingGUID = tkVar.f51660d.nativeGetActiveIndoorBuildingGUID(tkVar.f51661e);
            com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
            java.lang.String nativeGetCurIndoorName = tkVar2.f51660d.nativeGetCurIndoorName(tkVar2.f51661e, this.f51846a);
            com.tencent.mapsdk.internal.tk tkVar3 = com.tencent.mapsdk.internal.tk.this;
            int nativeGetIndoorCurrentFloorId = tkVar3.f51660d.nativeGetIndoorCurrentFloorId(tkVar3.f51661e);
            com.tencent.mapsdk.internal.tk tkVar4 = com.tencent.mapsdk.internal.tk.this;
            return new com.tencent.mapsdk.internal.qr(nativeGetActiveIndoorBuildingGUID, nativeGetCurIndoorName, tkVar4.f51660d.nativeGetIndoorFloorNames(tkVar4.f51661e), nativeGetIndoorCurrentFloorId);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$168, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass168 implements com.tencent.map.tools.CallbackRunnable<android.graphics.Rect> {
        public AnonymousClass168() {
        }

        private android.graphics.Rect a() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetIndoorBound(tkVar.f51661e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ android.graphics.Rect run() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetIndoorBound(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$169, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass169 implements com.tencent.map.tools.CallbackRunnable<java.lang.String> {
        public AnonymousClass169() {
        }

        private java.lang.String a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetActiveIndoorBuildingGUID(tkVar.f51661e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.String run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetActiveIndoorBuildingGUID(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$17, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass17 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.callbacks.TileOverlayCallback f51850a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f51851b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f51852c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f51853d;

        public AnonymousClass17(com.tencent.map.lib.callbacks.TileOverlayCallback tileOverlayCallback, boolean z17, boolean z18, int i17) {
            this.f51850a = tileOverlayCallback;
            this.f51851b = z17;
            this.f51852c = z18;
            this.f51853d = i17;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return -1;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddTileOverlay(tkVar.f51661e, this.f51850a, this.f51851b, this.f51852c, this.f51853d));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return -1;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddTileOverlay(tkVar.f51661e, this.f51850a, this.f51851b, this.f51852c, this.f51853d));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$170, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass170 implements com.tencent.map.tools.CallbackRunnable<java.lang.String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GeoPoint f51855a;

        public AnonymousClass170(com.tencent.map.lib.models.GeoPoint geoPoint) {
            this.f51855a = geoPoint;
        }

        private java.lang.String a() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetCurIndoorName(tkVar.f51661e, this.f51855a);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.String run() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetCurIndoorName(tkVar.f51661e, this.f51855a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$171, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass171 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51857a;

        public AnonymousClass171(int i17) {
            this.f51857a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetIndoorMaskColor(tkVar.f51661e, this.f51857a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$172, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass172 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f51859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f51860b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f51861c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f51862d;

        public AnonymousClass172(float f17, float f18, float f19, float f27) {
            this.f51859a = f17;
            this.f51860b = f18;
            this.f51861c = f19;
            this.f51862d = f27;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetIndoorActiveScreenArea(tkVar.f51661e, this.f51859a, this.f51860b, this.f51861c, this.f51862d);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$173, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass173 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f51864a;

        public AnonymousClass173(boolean z17) {
            this.f51864a = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetIndoorBuildingPickEnabled(tkVar.f51661e, this.f51864a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$174, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass174 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51866a;

        public AnonymousClass174(int i17) {
            this.f51866a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            int i17 = this.f51866a;
            if (i17 == 1) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetTrafficColor(tkVar.f51661e, com.tencent.mapsdk.internal.tk.f51651o, com.tencent.mapsdk.internal.tk.f51653q, com.tencent.mapsdk.internal.tk.f51656t, -16777063);
            } else if (i17 == 2) {
                com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
                tkVar2.f51660d.nativeSetTrafficColor(tkVar2.f51661e, com.tencent.mapsdk.internal.tk.f51652p, com.tencent.mapsdk.internal.tk.f51654r, com.tencent.mapsdk.internal.tk.f51657u, -16777063);
            } else {
                com.tencent.mapsdk.internal.tk tkVar3 = com.tencent.mapsdk.internal.tk.this;
                tkVar3.f51660d.nativeSetTrafficColor(tkVar3.f51661e, com.tencent.mapsdk.internal.tk.f51651o, com.tencent.mapsdk.internal.tk.f51653q, com.tencent.mapsdk.internal.tk.f51655s, -16777063);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$175, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass175 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String[] f51868a;

        public AnonymousClass175(java.lang.String[] strArr) {
            this.f51868a = strArr;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetShowIndoorBuildingWhiteList(tkVar.f51661e, this.f51868a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$179, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass179 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51878a;

        public AnonymousClass179(int i17) {
            this.f51878a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetLocationCircleColor(tkVar.f51661e, this.f51878a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$180, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass180 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f51883a;

        public AnonymousClass180(boolean z17) {
            this.f51883a = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetLocationCircleHidden(tkVar.f51661e, this.f51883a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$185, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass185 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f51897a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51898b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f51899c = true;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f51900d = false;

        public AnonymousClass185(byte[] bArr, int i17) {
            this.f51897a = bArr;
            this.f51898b = i17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.map.tools.CallbackRunnable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public java.lang.Integer run() {
            synchronized (com.tencent.mapsdk.internal.tk.this.f51669m) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return -1;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Integer.valueOf(tkVar.f51660d.nativeRefreshTrafficData(tkVar.f51661e, this.f51897a, this.f51898b, this.f51899c, this.f51900d));
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$190, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass190 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GeoPoint f51919a;

        public AnonymousClass190(com.tencent.map.lib.models.GeoPoint geoPoint) {
            this.f51919a = geoPoint;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (0 != com.tencent.mapsdk.internal.tk.this.f51661e) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                if (tkVar.f51666j == null) {
                    return;
                }
                tkVar.f51660d.nativeSetCenter(tkVar.f51661e, this.f51919a, false);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$193, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass193 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f51926a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f51927b = false;

        public AnonymousClass193(double d17) {
            this.f51926a = d17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetScale(tkVar.f51661e, this.f51926a, this.f51927b);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$194, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass194 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51929a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51930b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f51931c;

        public AnonymousClass194(int i17, int i18, int i19) {
            this.f51929a = i17;
            this.f51930b = i18;
            this.f51931c = i19;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetMarkerScaleLevelRange(tkVar.f51661e, this.f51929a, this.f51930b, this.f51931c);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$195, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass195 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f51933a;

        public AnonymousClass195(double d17) {
            this.f51933a = d17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (0 != com.tencent.mapsdk.internal.tk.this.f51661e) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                if (tkVar.f51666j == null) {
                    return;
                }
                tkVar.f51660d.nativeSetScale(tkVar.f51661e, this.f51933a, false);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$2, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass2 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51935a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51936b;

        public AnonymousClass2(int i17, int i18) {
            this.f51935a = i17;
            this.f51936b = i18;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetTrafficMode(tkVar.f51661e, this.f51935a, this.f51936b);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$27, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass27 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51957a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51958b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f51959c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f51960d;

        public AnonymousClass27(int i17, int i18, int i19, int i27) {
            this.f51957a = i17;
            this.f51958b = i18;
            this.f51959c = i19;
            this.f51960d = i27;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetTrafficColor(tkVar.f51661e, this.f51957a, this.f51958b, this.f51959c, this.f51960d);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$28, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass28 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51962a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51963b;

        public AnonymousClass28(int i17, int i18) {
            this.f51962a = i17;
            this.f51963b = i18;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeBringElementAbove(tkVar.f51661e, this.f51962a, this.f51963b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$29, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass29 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51965a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51966b;

        public AnonymousClass29(int i17, int i18) {
            this.f51965a = i17;
            this.f51966b = i18;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeBringElementBelow(tkVar.f51661e, this.f51965a, this.f51966b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$3, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass3 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f51968a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f51969b = true;

        public AnonymousClass3(int i17) {
            this.f51968a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetScaleLevel(tkVar.f51661e, this.f51968a, this.f51969b);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$33, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass33 implements com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.AnnocationTextResult> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.AnnocationText f51978a;

        public AnonymousClass33(com.tencent.map.lib.models.AnnocationText annocationText) {
            this.f51978a = annocationText;
        }

        private com.tencent.map.lib.models.AnnocationTextResult a() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeCreateAnnotationTextBitmap(tkVar.f51661e, this.f51978a);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ com.tencent.map.lib.models.AnnocationTextResult run() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeCreateAnnotationTextBitmap(tkVar.f51661e, this.f51978a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$34, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass34 implements com.tencent.map.tools.CallbackRunnable<java.util.List<java.lang.Integer>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.Rect f51980a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f51981b;

        public AnonymousClass34(android.graphics.Rect rect, int i17) {
            this.f51980a = rect;
            this.f51981b = i17;
        }

        private java.util.List<java.lang.Integer> a() {
            java.util.ArrayList arrayList = null;
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            int[] iArr = new int[100];
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            int nativeQueryCityCodeList = tkVar.f51660d.nativeQueryCityCodeList(tkVar.f51661e, this.f51980a, this.f51981b, iArr, 100);
            if (nativeQueryCityCodeList > 0) {
                arrayList = new java.util.ArrayList(nativeQueryCityCodeList);
                for (int i17 = 0; i17 < nativeQueryCityCodeList; i17++) {
                    arrayList.add(java.lang.Integer.valueOf(iArr[i17]));
                }
            }
            return arrayList;
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.util.List<java.lang.Integer> run() {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return null;
            }
            int[] iArr = new int[100];
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            int nativeQueryCityCodeList = tkVar.f51660d.nativeQueryCityCodeList(tkVar.f51661e, this.f51980a, this.f51981b, iArr, 100);
            if (nativeQueryCityCodeList <= 0) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(nativeQueryCityCodeList);
            for (int i17 = 0; i17 < nativeQueryCityCodeList; i17++) {
                arrayList.add(java.lang.Integer.valueOf(iArr[i17]));
            }
            return arrayList;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$35, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass35 implements com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.ru[]> {
        public AnonymousClass35() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.tencent.map.tools.CallbackRunnable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public com.tencent.mapsdk.internal.ru[] run() {
            synchronized (com.tencent.mapsdk.internal.tk.this.f51669m) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return null;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                int[] nativeFetchLackedTrafficBlocks = tkVar.f51660d.nativeFetchLackedTrafficBlocks(tkVar.f51661e);
                if (nativeFetchLackedTrafficBlocks == null || nativeFetchLackedTrafficBlocks.length == 0) {
                    return null;
                }
                com.tencent.mapsdk.internal.ru[] ruVarArr = new com.tencent.mapsdk.internal.ru[nativeFetchLackedTrafficBlocks.length / 9];
                for (int i17 = 0; i17 < nativeFetchLackedTrafficBlocks.length / 9; i17++) {
                    com.tencent.mapsdk.internal.ru ruVar = new com.tencent.mapsdk.internal.ru();
                    ruVarArr[i17] = ruVar;
                    int i18 = i17 * 9;
                    ruVar.f51261a = nativeFetchLackedTrafficBlocks[i18];
                    ruVar.f51262b = nativeFetchLackedTrafficBlocks[i18 + 1];
                    ruVar.f51264d = nativeFetchLackedTrafficBlocks[i18 + 2];
                    ruVar.f51263c = nativeFetchLackedTrafficBlocks[i18 + 3];
                    ruVar.f51266f = nativeFetchLackedTrafficBlocks[i18 + 4];
                    ruVar.f51265e = nativeFetchLackedTrafficBlocks[i18 + 5];
                    ruVar.f51267g = nativeFetchLackedTrafficBlocks[i18 + 6];
                    ruVar.f51268h = nativeFetchLackedTrafficBlocks[i18 + 7];
                    ruVar.f51269i = nativeFetchLackedTrafficBlocks[i18 + 8];
                }
                return ruVarArr;
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$36, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass36 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51984a;

        public AnonymousClass36(java.lang.String str) {
            this.f51984a = str;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeMapLoadKMLFile(tkVar.f51661e, this.f51984a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$37, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass37 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51986a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51988c;

        public AnonymousClass37(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f51986a = str;
            this.f51987b = str2;
            this.f51988c = str3;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeResetEnginePath(tkVar.f51661e, this.f51986a, this.f51987b, this.f51988c);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$38, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass38 implements com.tencent.mapsdk.internal.ne.a {
        public AnonymousClass38() {
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeResumeRenderMsgQueue(tkVar.f51661e);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$40, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass40 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.mapsdk.internal.qv f51996a;

        public AnonymousClass40(com.tencent.mapsdk.internal.qv qvVar) {
            this.f51996a = qvVar;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.mapsdk.internal.qv qvVar;
            int i17;
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || (i17 = (qvVar = this.f51996a).f51076s) == -1) {
                return;
            }
            com.tencent.mapsdk.internal.fy fyVar = qvVar.f51071b;
            if (fyVar.I < 0.0f) {
                return;
            }
            int i18 = fyVar.C;
            if (i18 == 3 || i18 == 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetLineArrowSpacing(tkVar.f51661e, i17, this.f51996a.f51071b.I);
            } else {
                com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
                tkVar2.f51660d.nativeSetLineFootPrintSpacing(tkVar2.f51661e, i17, this.f51996a.f51071b.I);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$41, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass41 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f51998a;

        public AnonymousClass41(java.lang.String str) {
            this.f51998a = str;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetServerHost(tkVar.f51661e, this.f51998a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$42, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass42 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f52000a;

        public AnonymousClass42(java.lang.String str) {
            this.f52000a = str;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeMapSetSatelliteServerFullUrl(tkVar.f51661e, this.f52000a);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$44, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass44 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f52004a;

        public AnonymousClass44(boolean z17) {
            this.f52004a = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeEnableBaseMap(tkVar.f51661e, this.f52004a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$45, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass45 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f52006a;

        public AnonymousClass45(boolean z17) {
            this.f52006a = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeEnableBuilding(tkVar.f51661e, this.f52006a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$47, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass47 implements com.tencent.map.tools.CallbackRunnable<java.lang.String> {
        public AnonymousClass47() {
        }

        private java.lang.String a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return "";
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetMapEngineVersion(tkVar.f51661e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.String run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return "";
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetMapEngineVersion(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$48, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass48 implements com.tencent.map.tools.CallbackRunnable<java.lang.String> {
        public AnonymousClass48() {
        }

        private java.lang.String a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return "";
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetDataEngineVersion(tkVar.f51661e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.String run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return "";
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetDataEngineVersion(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$5, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass5 implements com.tencent.mapsdk.internal.ne.a {
        public AnonymousClass5() {
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeZoomOut(tkVar.f51661e);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$50, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass50 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.String f52016a;

        public AnonymousClass50(java.lang.String str) {
            this.f52016a = str;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return -1;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.getIndoorOutlineZoom(tkVar.f51661e, this.f52016a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return -1;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.getIndoorOutlineZoom(tkVar.f51661e, this.f52016a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$51, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass51 implements com.tencent.map.tools.CallbackRunnable<java.lang.String> {
        public AnonymousClass51() {
        }

        private java.lang.String a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.getMapEngineRenderStatus(tkVar.f51661e);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.String run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.getMapEngineRenderStatus(tkVar.f51661e);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$53, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass53 implements com.tencent.map.tools.CallbackRunnable<java.lang.Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52020a;

        public AnonymousClass53(int i17) {
            this.f52020a = i17;
        }

        private java.lang.Boolean a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return java.lang.Boolean.FALSE;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Boolean.valueOf(tkVar.f51660d.checkMapLoadFinishedTask(tkVar.f51661e, this.f52020a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Boolean run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return java.lang.Boolean.FALSE;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Boolean.valueOf(tkVar.f51660d.checkMapLoadFinishedTask(tkVar.f51661e, this.f52020a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$55, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass55 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GeoPoint[] f52026a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text f52027b;

        public AnonymousClass55(com.tencent.map.lib.models.GeoPoint[] geoPointArr, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
            this.f52026a = geoPointArr;
            this.f52027b = text;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return -1;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.addLineText(tkVar.f51661e, this.f52026a, this.f52027b));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return -1;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.addLineText(tkVar.f51661e, this.f52026a, this.f52027b));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$57, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass57 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.PolygonInfo f52031a;

        public AnonymousClass57(com.tencent.map.lib.models.PolygonInfo polygonInfo) {
            this.f52031a = polygonInfo;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddPolygon(tkVar.f51661e, this.f52031a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddPolygon(tkVar.f51661e, this.f52031a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$58, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass58 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52033a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text f52034b;

        public AnonymousClass58(int i17, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
            this.f52033a = i17;
            this.f52034b = text;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.setLineTextStyle(tkVar.f51661e, this.f52033a, this.f52034b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$6, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass6 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.graphics.RectF f52037a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GeoPoint f52038b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f52039c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f52040d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f52041e;

        public AnonymousClass6(android.graphics.RectF rectF, com.tencent.map.lib.models.GeoPoint geoPoint, int i17, int i18, boolean z17) {
            this.f52037a = rectF;
            this.f52038b = geoPoint;
            this.f52039c = i17;
            this.f52040d = i18;
            this.f52041e = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                com.tencent.mapsdk.engine.jni.JNI jni = tkVar.f51660d;
                long j17 = tkVar.f51661e;
                android.graphics.RectF rectF = this.f52037a;
                jni.nativeSetFlagOfZoomToSpanForLocation(j17, rectF.top, rectF.left, rectF.bottom, rectF.right);
                com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
                tkVar2.f51660d.nativeZoomToSpanForNavigation(tkVar2.f51661e, this.f52038b, this.f52039c, this.f52040d, this.f52041e);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$63, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass63 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.MarkerInfo f52050a;

        public AnonymousClass63(com.tencent.map.lib.models.MarkerInfo markerInfo) {
            this.f52050a = markerInfo;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddTextMarker(tkVar.f51661e, this.f52050a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddTextMarker(tkVar.f51661e, this.f52050a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$64, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass64 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52052a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.MarkerInfo f52053b;

        public AnonymousClass64(int i17, com.tencent.map.lib.models.MarkerInfo markerInfo) {
            this.f52052a = i17;
            this.f52053b = markerInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateTextMarker(tkVar.f51661e, this.f52052a, this.f52053b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$65, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass65 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52055a;

        public AnonymousClass65(int i17) {
            this.f52055a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetMapFontSize(tkVar.f51661e, this.f52055a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$67, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass67 implements com.tencent.map.tools.CallbackRunnable<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.AggregationOverlayInfo f52059a;

        public AnonymousClass67(com.tencent.map.lib.models.AggregationOverlayInfo aggregationOverlayInfo) {
            this.f52059a = aggregationOverlayInfo;
        }

        private java.lang.Long a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddAggregatioinOverlay(tkVar.f51661e, this.f52059a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Long run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddAggregatioinOverlay(tkVar.f51661e, this.f52059a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$68, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass68 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.CircleInfo f52061a;

        public AnonymousClass68(com.tencent.map.lib.models.CircleInfo circleInfo) {
            this.f52061a = circleInfo;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52061a == null) {
                return -1;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddCircle(tkVar.f51661e, this.f52061a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52061a == null) {
                return -1;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeAddCircle(tkVar.f51661e, this.f52061a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$69, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass69 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52063a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.AggregationOverlayInfo f52064b;

        public AnonymousClass69(long j17, com.tencent.map.lib.models.AggregationOverlayInfo aggregationOverlayInfo) {
            this.f52063a = j17;
            this.f52064b = aggregationOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateAggregatioinOverlay(tkVar.f51661e, this.f52063a, this.f52064b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$70, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass70 implements com.tencent.map.tools.CallbackRunnable<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.HeatmapInfo f52070a;

        public AnonymousClass70(com.tencent.map.lib.models.HeatmapInfo heatmapInfo) {
            this.f52070a = heatmapInfo;
        }

        private java.lang.Long a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddHeatmapOverlay(tkVar.f51661e, this.f52070a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Long run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddHeatmapOverlay(tkVar.f51661e, this.f52070a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$71, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass71 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52072a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.HeatmapInfo f52073b;

        public AnonymousClass71(long j17, com.tencent.map.lib.models.HeatmapInfo heatmapInfo) {
            this.f52072a = j17;
            this.f52073b = heatmapInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateHeatmapOverlay(tkVar.f51661e, this.f52072a, this.f52073b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$73, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass73 implements com.tencent.map.tools.CallbackRunnable<com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52077a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LatLng f52078b;

        public AnonymousClass73(long j17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
            this.f52077a = j17;
            this.f52078b = latLng;
        }

        private com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.getAggregationUnit(tkVar.f51661e, this.f52077a, this.f52078b);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return null;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.getAggregationUnit(tkVar.f51661e, this.f52077a, this.f52078b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$74, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass74 implements com.tencent.map.tools.CallbackRunnable<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.ArcLineOverlayInfo f52080a;

        public AnonymousClass74(com.tencent.map.lib.models.ArcLineOverlayInfo arcLineOverlayInfo) {
            this.f52080a = arcLineOverlayInfo;
        }

        private java.lang.Long a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddArcLineOverlay(tkVar.f51661e, this.f52080a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Long run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddArcLineOverlay(tkVar.f51661e, this.f52080a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$75, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass75 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52082a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.ArcLineOverlayInfo f52083b;

        public AnonymousClass75(long j17, com.tencent.map.lib.models.ArcLineOverlayInfo arcLineOverlayInfo) {
            this.f52082a = j17;
            this.f52083b = arcLineOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateArcLineOverlay(tkVar.f51661e, this.f52082a, this.f52083b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$76, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass76 implements com.tencent.map.tools.CallbackRunnable<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.ScatterPlotInfo f52085a;

        public AnonymousClass76(com.tencent.map.lib.models.ScatterPlotInfo scatterPlotInfo) {
            this.f52085a = scatterPlotInfo;
        }

        private java.lang.Long a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddScatterOverlay(tkVar.f51661e, this.f52085a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Long run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddScatterOverlay(tkVar.f51661e, this.f52085a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$77, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass77 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52087a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.ScatterPlotInfo f52088b;

        public AnonymousClass77(long j17, com.tencent.map.lib.models.ScatterPlotInfo scatterPlotInfo) {
            this.f52087a = j17;
            this.f52088b = scatterPlotInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateScatterPlotOverlay(tkVar.f51661e, this.f52087a, this.f52088b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$78, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass78 implements com.tencent.map.tools.CallbackRunnable<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.TrailOverlayInfo f52090a;

        public AnonymousClass78(com.tencent.map.lib.models.TrailOverlayInfo trailOverlayInfo) {
            this.f52090a = trailOverlayInfo;
        }

        private java.lang.Long a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddTrailOverlay(tkVar.f51661e, this.f52090a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Long run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddTrailOverlay(tkVar.f51661e, this.f52090a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$79, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass79 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.CircleInfo f52093b;

        public AnonymousClass79(int i17, com.tencent.map.lib.models.CircleInfo circleInfo) {
            this.f52092a = i17;
            this.f52093b = circleInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateCircle(tkVar.f51661e, this.f52092a, this.f52093b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$80, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass80 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.TrailOverlayInfo f52101b;

        public AnonymousClass80(long j17, com.tencent.map.lib.models.TrailOverlayInfo trailOverlayInfo) {
            this.f52100a = j17;
            this.f52101b = trailOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateTrailOverlay(tkVar.f51661e, this.f52100a, this.f52101b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$82, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass82 implements com.tencent.map.tools.CallbackRunnable<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GroundOverlayInfo f52104a;

        public AnonymousClass82(com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo) {
            this.f52104a = groundOverlayInfo;
        }

        private java.lang.Long a() {
            com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo;
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || (groundOverlayInfo = this.f52104a) == null || !groundOverlayInfo.checkValid()) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddGroundOverlay(tkVar.f51661e, this.f52104a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Long run() {
            com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo;
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || (groundOverlayInfo = this.f52104a) == null || !groundOverlayInfo.checkValid()) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddGroundOverlay(tkVar.f51661e, this.f52104a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$83, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass83 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52106a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GroundOverlayInfo f52107b;

        public AnonymousClass83(long j17, com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo) {
            this.f52106a = j17;
            this.f52107b = groundOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52106a == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateGroundOverlay(tkVar.f51661e, this.f52106a, this.f52107b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$84, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass84 implements com.tencent.map.tools.CallbackRunnable<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.IntersectionOverlayInfo f52109a;

        public AnonymousClass84(com.tencent.map.lib.models.IntersectionOverlayInfo intersectionOverlayInfo) {
            this.f52109a = intersectionOverlayInfo;
        }

        private java.lang.Long a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddIntersectionOverlay(tkVar.f51661e, this.f52109a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Long run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddIntersectionOverlay(tkVar.f51661e, this.f52109a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$85, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass85 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52111a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.IntersectionOverlayInfo f52112b;

        public AnonymousClass85(long j17, com.tencent.map.lib.models.IntersectionOverlayInfo intersectionOverlayInfo) {
            this.f52111a = j17;
            this.f52112b = intersectionOverlayInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                long j17 = this.f52111a;
                if (j17 == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk.this.f51660d.nativeUpdateIntersectionOverlay(j17, this.f52112b);
            }
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$86, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass86 implements com.tencent.map.tools.CallbackRunnable<java.lang.Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GLModelInfo f52114a;

        public AnonymousClass86(com.tencent.map.lib.models.GLModelInfo gLModelInfo) {
            this.f52114a = gLModelInfo;
        }

        private java.lang.Long a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddGLModel(tkVar.f51661e, this.f52114a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Long run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0L;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Long.valueOf(tkVar.f51660d.nativeAddGLModel(tkVar.f51661e, this.f52114a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$87, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass87 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52116a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.tencent.map.lib.models.GLModelInfo f52117b;

        public AnonymousClass87(long j17, com.tencent.map.lib.models.GLModelInfo gLModelInfo) {
            this.f52116a = j17;
            this.f52117b = gLModelInfo;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52116a == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeUpdateGLModel(tkVar.f51661e, this.f52116a, this.f52117b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$88, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass88 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52119a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f52120b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f52121c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f52122d;

        public AnonymousClass88(long j17, int i17, float f17, boolean z17) {
            this.f52119a = j17;
            this.f52120b = i17;
            this.f52121c = f17;
            this.f52122d = z17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52119a == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeStartGLModelSkeletonAnimation(tkVar.f51661e, this.f52119a, this.f52120b, this.f52121c, this.f52122d);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$89, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass89 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52124a;

        public AnonymousClass89(long j17) {
            this.f52124a = j17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52124a == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeStopGLModelSkeletonAnimation(tkVar.f51661e, this.f52124a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$9, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass9 implements com.tencent.mapsdk.internal.ne.a {
        public AnonymousClass9() {
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                return;
            }
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            if (tkVar.f51667k == 0) {
                tkVar.f51660d.nativeUpdateFrame(tkVar.f51661e, 0.0d);
            } else {
                tkVar.f51660d.nativeUpdateFrame(tkVar.f51661e, elapsedRealtime - com.tencent.mapsdk.internal.tk.this.f51667k);
            }
            com.tencent.mapsdk.internal.tk.this.f51667k = elapsedRealtime;
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$90, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass90 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f52127a;

        public AnonymousClass90(int i17) {
            this.f52127a = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeDeleteCircle(tkVar.f51661e, this.f52127a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$91, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass91 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52129a;

        public AnonymousClass91(long j17) {
            this.f52129a = j17;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeGetGLModelSkeletonAnimationCount(tkVar.f51661e, this.f52129a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeGetGLModelSkeletonAnimationCount(tkVar.f51661e, this.f52129a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$92, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass92 implements com.tencent.map.tools.CallbackRunnable<float[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52131a;

        public AnonymousClass92(long j17) {
            this.f52131a = j17;
        }

        private float[] a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return new float[0];
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetGLModelSkeletonAnimationDuration(tkVar.f51661e, this.f52131a);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ float[] run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return new float[0];
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetGLModelSkeletonAnimationDuration(tkVar.f51661e, this.f52131a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$93, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass93 implements com.tencent.map.tools.CallbackRunnable<java.lang.String[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52133a;

        public AnonymousClass93(long j17) {
            this.f52133a = j17;
        }

        private java.lang.String[] a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return new java.lang.String[0];
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetGLModelSkeletonAnimationName(tkVar.f51661e, this.f52133a);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.String[] run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return new java.lang.String[0];
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetGLModelSkeletonAnimationName(tkVar.f51661e, this.f52133a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$94, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass94 implements com.tencent.map.tools.CallbackRunnable<java.lang.String[]> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52135a;

        public AnonymousClass94(long j17) {
            this.f52135a = j17;
        }

        private java.lang.String[] a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return new java.lang.String[0];
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetVariantNames(tkVar.f51661e, this.f52135a);
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.String[] run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return new java.lang.String[0];
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return tkVar.f51660d.nativeGetVariantNames(tkVar.f51661e, this.f52135a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$95, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass95 implements com.tencent.map.tools.CallbackRunnable<java.lang.Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52137a;

        public AnonymousClass95(long j17) {
            this.f52137a = j17;
        }

        private java.lang.Integer a() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeGetCurrentMaterialVariant(tkVar.f51661e, this.f52137a));
        }

        @Override // com.tencent.map.tools.CallbackRunnable
        public final /* synthetic */ java.lang.Integer run() {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return 0;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            return java.lang.Integer.valueOf(tkVar.f51660d.nativeGetCurrentMaterialVariant(tkVar.f51661e, this.f52137a));
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$96, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass96 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52139a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f52140b;

        public AnonymousClass96(long j17, int i17) {
            this.f52139a = j17;
            this.f52140b = i17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52139a == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetMaterialVariant(tkVar.f51661e, this.f52139a, this.f52140b);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$97, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass97 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52142a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f52143b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f52144c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f52145d;

        public AnonymousClass97(long j17, float f17, float f18, float f19) {
            this.f52142a = j17;
            this.f52143b = f17;
            this.f52144c = f18;
            this.f52145d = f19;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52142a == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetMonoColor(tkVar.f51661e, this.f52142a, this.f52143b, this.f52144c, this.f52145d);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$98, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass98 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f52147a;

        public AnonymousClass98(long j17) {
            this.f52147a = j17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0 || this.f52147a == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeResetMonoColor(tkVar.f51661e, this.f52147a);
        }
    }

    /* renamed from: com.tencent.mapsdk.internal.tk$99, reason: invalid class name */
    /* loaded from: classes13.dex */
    public class AnonymousClass99 implements com.tencent.mapsdk.internal.ne.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.tencent.tencentmap.mapsdk.maps.model.LightColor f52149a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f52150b;

        public AnonymousClass99(com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, float f17) {
            this.f52149a = lightColor;
            this.f52150b = f17;
        }

        @Override // com.tencent.mapsdk.internal.ne.a
        public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
            if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                return;
            }
            com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
            tkVar.f51660d.nativeSetAmbientLight(tkVar.f51661e, this.f52149a, this.f52150b);
        }
    }

    public tk(android.content.Context context, com.tencent.mapsdk.internal.ne neVar) {
        com.tencent.mapsdk.internal.mb mbVar = new com.tencent.mapsdk.internal.mb() { // from class: com.tencent.mapsdk.internal.tk.1
            @Override // com.tencent.mapsdk.internal.mb, com.tencent.mapsdk.internal.lv
            public final void a(java.lang.String str, byte[] bArr) {
                synchronized (com.tencent.mapsdk.internal.tk.this.f51669m) {
                    if (com.tencent.mapsdk.internal.tk.this.f51661e != 0 && !android.text.TextUtils.isEmpty(str)) {
                        com.tencent.mapsdk.internal.tk.this.a(str, bArr);
                    }
                }
            }

            @Override // com.tencent.mapsdk.internal.mb, com.tencent.mapsdk.internal.lv
            public final void a(java.lang.String str, com.tencent.mapsdk.internal.lx lxVar) {
                if (lxVar != com.tencent.mapsdk.internal.lx.CANCEL && lxVar != com.tencent.mapsdk.internal.lx.ERROR) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.la.a.f50262c, "download url: " + str + ", status: " + lxVar.name());
                    return;
                }
                com.tencent.mapsdk.core.utils.log.LogUtil.e(com.tencent.mapsdk.internal.la.a.f50262c, "download url: " + str + ", status: " + lxVar.name());
            }
        };
        this.f51664h = mbVar;
        this.f51667k = 0L;
        this.f51668l = 0L;
        this.f51670x = 1.0f;
        this.f51671y = null;
        this.f51669m = new java.lang.Object();
        this.f51672z = new java.util.concurrent.locks.ReentrantLock();
        this.f51660d = new com.tencent.mapsdk.engine.jni.JNI();
        com.tencent.mapsdk.internal.lw lwVar = new com.tencent.mapsdk.internal.lw();
        this.f51663g = lwVar;
        lwVar.a(mbVar);
        this.f51666j = neVar;
        this.f51670x = context.getResources().getDisplayMetrics().density;
    }

    private java.lang.Object B() {
        return this.f51669m;
    }

    private void C() {
        this.f51666j.f50522v = true;
    }

    private void D() {
        com.tencent.mapsdk.internal.lw lwVar = this.f51663g;
        if (lwVar != null) {
            lwVar.b(this.f51664h);
            this.f51663g.a();
        }
        if (this.f51661e != 0) {
            long j17 = this.f51661e;
            synchronized (this.f51669m) {
                this.f51661e = 0L;
                this.f51660d.nativeDestroyEngine(j17);
            }
        }
        this.f51666j = null;
        this.f51660d.destory();
    }

    private int E() {
        com.tencent.mapsdk.internal.ne neVar = this.f51666j;
        if (neVar != null) {
            return neVar.K;
        }
        return -1;
    }

    private boolean F() {
        if (this.f51661e == 0) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() - this.f51668l > 560) {
            this.f51660d.nativeClearDownloadURLCache(this.f51661e);
            this.f51668l = android.os.SystemClock.elapsedRealtime();
        }
        return this.f51660d.nativeGenerateTextures(this.f51661e);
    }

    private boolean G() {
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass108>) new com.tencent.mapsdk.internal.tk.AnonymousClass108(), (com.tencent.mapsdk.internal.tk.AnonymousClass108) java.lang.Boolean.FALSE)).booleanValue();
    }

    private com.tencent.mapsdk.internal.ru[] H() {
        return (com.tencent.mapsdk.internal.ru[]) a(new com.tencent.mapsdk.internal.tk.AnonymousClass35(), (com.tencent.mapsdk.internal.tk.AnonymousClass35) null);
    }

    private void I() {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass122());
    }

    private void J() {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass123());
    }

    private long K() {
        return this.f51661e;
    }

    private void L() {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass148());
    }

    private int M() {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Integer>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Integer>() { // from class: com.tencent.mapsdk.internal.tk.165
            private java.lang.Integer a() {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return -1;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Integer.valueOf(tkVar.f51660d.nativeGetIndoorCurrentFloorId(tkVar.f51661e));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Integer run() {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return -1;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Integer.valueOf(tkVar.f51660d.nativeGetIndoorCurrentFloorId(tkVar.f51661e));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Integer>) (-1))).intValue();
    }

    private java.lang.String[] N() {
        return (java.lang.String[]) a(new com.tencent.mapsdk.internal.tk.AnonymousClass166(), (com.tencent.mapsdk.internal.tk.AnonymousClass166) null);
    }

    private android.graphics.Rect O() {
        return (android.graphics.Rect) a(new com.tencent.mapsdk.internal.tk.AnonymousClass168(), (com.tencent.mapsdk.internal.tk.AnonymousClass168) null);
    }

    private java.lang.String P() {
        return (java.lang.String) a(new com.tencent.mapsdk.internal.tk.AnonymousClass169(), (com.tencent.mapsdk.internal.tk.AnonymousClass169) null);
    }

    private void Q() {
        com.tencent.mapsdk.internal.ne neVar;
        if (0 == this.f51661e || (neVar = this.f51666j) == null) {
            return;
        }
        neVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass5());
    }

    private void R() {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass9());
    }

    private boolean S() {
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass10>) new com.tencent.mapsdk.internal.tk.AnonymousClass10(), (com.tencent.mapsdk.internal.tk.AnonymousClass10) java.lang.Boolean.FALSE)).booleanValue();
    }

    private int T() {
        return this.f51660d.nativeGetLanguage(this.f51661e);
    }

    private void U() {
        if (this.f51661e == 0) {
            return;
        }
        b(new com.tencent.mapsdk.internal.tk.AnonymousClass38());
    }

    private java.lang.String V() {
        return (java.lang.String) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass47>) new com.tencent.mapsdk.internal.tk.AnonymousClass47(), (com.tencent.mapsdk.internal.tk.AnonymousClass47) "");
    }

    private java.lang.String W() {
        return (java.lang.String) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass48>) new com.tencent.mapsdk.internal.tk.AnonymousClass48(), (com.tencent.mapsdk.internal.tk.AnonymousClass48) "");
    }

    private java.lang.String X() {
        return (java.lang.String) a(new com.tencent.mapsdk.internal.tk.AnonymousClass51(), (com.tencent.mapsdk.internal.tk.AnonymousClass51) null);
    }

    private void Y() {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass104());
    }

    private static void Z() {
    }

    private static void aa() {
    }

    private float[] ab() {
        return this.f51660d.nativeGLProjectMatrix();
    }

    private int[] ad() {
        return this.f51660d.nativeGLViewport();
    }

    private float ae() {
        return this.f51660d.nativeGLViewScaleRatio();
    }

    private void g(java.lang.String str) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass125(str));
    }

    private void i(int i17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass174(i17));
    }

    private void j(int i17) {
        if (this.f51661e == 0 || i17 < 0 || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass90(i17));
    }

    private void k(int i17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass113(i17));
    }

    private void o(int i17) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass179(i17));
    }

    public final android.content.Context A() {
        com.tencent.mapsdk.internal.ne neVar = this.f51666j;
        if (neVar == null) {
            return null;
        }
        return neVar.getContext();
    }

    @java.lang.Deprecated
    public final boolean h() {
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.tk.152
            private java.lang.Boolean a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.TRUE;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Boolean.valueOf(tkVar.f51660d.nativeIsMapDrawFinished(tkVar.f51661e));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Boolean run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.TRUE;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Boolean.valueOf(tkVar.f51660d.nativeIsMapDrawFinished(tkVar.f51661e));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>) java.lang.Boolean.TRUE)).booleanValue();
    }

    public final void l() {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.118
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeShowStreetRoad(tkVar.f51661e);
            }
        });
    }

    public final void m() {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.120
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeHideStreetRoad(tkVar.f51661e);
                }
            }
        });
    }

    public final boolean n() {
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.tk.142
            private java.lang.Boolean a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.FALSE;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Boolean.valueOf(tkVar.f51660d.nativeNeedRedraw(tkVar.f51661e));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Boolean run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.FALSE;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Boolean.valueOf(tkVar.f51660d.nativeNeedRedraw(tkVar.f51661e));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>) java.lang.Boolean.FALSE)).booleanValue();
    }

    public final float p() {
        if (0 == this.f51661e) {
            return 1.0f;
        }
        return (float) this.f51660d.nativeGetScale(this.f51661e);
    }

    @Override // com.tencent.mapsdk.internal.pb
    public final void p_() {
        com.tencent.mapsdk.internal.pb pbVar;
        com.tencent.mapsdk.internal.ne neVar = this.f51666j;
        if (neVar == null || (pbVar = neVar.G) == null) {
            return;
        }
        pbVar.p_();
    }

    public final int q() {
        if (0 == this.f51661e) {
            return 20;
        }
        return this.f51660d.nativeGetScaleLevel(this.f51661e);
    }

    public final float r() {
        if (0 == this.f51661e) {
            return 0.0f;
        }
        return this.f51660d.nativeGetSkew(this.f51661e);
    }

    public final float s() {
        if (0 == this.f51661e) {
            return 0.0f;
        }
        return this.f51660d.nativeGetRotate(this.f51661e);
    }

    public final float t() {
        if (0 == this.f51661e) {
            return 0.0f;
        }
        return this.f51660d.nativeMapSightGetOnScreenHeight(this.f51661e);
    }

    public final int u() {
        if (0 == this.f51661e) {
            return 1;
        }
        return this.f51660d.nativeGetMapStyle(this.f51661e);
    }

    public final boolean v() {
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.tk.23
            private java.lang.Boolean a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.FALSE;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Boolean.valueOf(tkVar.f51660d.nativeIsTileOverlayEnabled(tkVar.f51661e));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Boolean run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.FALSE;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Boolean.valueOf(tkVar.f51660d.nativeIsTileOverlayEnabled(tkVar.f51661e));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>) java.lang.Boolean.FALSE)).booleanValue();
    }

    public final void w() {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.32
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeClearRouteNameSegments(tkVar.f51661e);
            }
        });
    }

    public final java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> x() {
        return (java.util.ArrayList) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi>>>) new com.tencent.map.tools.CallbackRunnable<java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi>>() { // from class: com.tencent.mapsdk.internal.tk.52
            private java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return null;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return tkVar.f51660d.nativeGetPoisInScreen(tkVar.f51661e);
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi> run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return null;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return tkVar.f51660d.nativeGetPoisInScreen(tkVar.f51661e);
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.util.ArrayList<com.tencent.tencentmap.mapsdk.maps.model.MapPoi>>) null);
    }

    public final boolean y() {
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.tk.81
            private java.lang.Boolean a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.FALSE;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Boolean.valueOf(tkVar.f51660d.nativeGetAndResetDirty(tkVar.f51661e));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Boolean run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.FALSE;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Boolean.valueOf(tkVar.f51660d.nativeGetAndResetDirty(tkVar.f51661e));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>) java.lang.Boolean.FALSE)).booleanValue();
    }

    public final float[] z() {
        double[] nativeGLViewMatrix = this.f51660d.nativeGLViewMatrix();
        if (nativeGLViewMatrix == null || nativeGLViewMatrix.length == 0) {
            return null;
        }
        android.graphics.PointF a17 = this.f51666j.f50513m.a(com.tencent.mapsdk.internal.kr.a(this.f51666j.f50506f.o()));
        a(nativeGLViewMatrix, a17.x, -a17.y);
        float[] fArr = new float[nativeGLViewMatrix.length];
        for (int i17 = 0; i17 < nativeGLViewMatrix.length; i17++) {
            fArr[i17] = new java.math.BigDecimal(nativeGLViewMatrix[i17]).floatValue();
        }
        return fArr;
    }

    private void b(final int i17, final int i18, final int i19, final int i27, final int i28) {
        b(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.24
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeCheckTrafficBlockCacheForReplay(tkVar.f51661e, i17, i18, i19, i27, i28);
                }
            }
        });
    }

    private void c(java.lang.String str) {
        if (this.f51661e == 0 || this.f51666j == null) {
            return;
        }
        this.f51660d.nativeSetSkyBoxTexture(this.f51661e, str);
    }

    private com.tencent.map.lib.models.CityTrafficInfo e(final java.lang.String str) {
        return (com.tencent.map.lib.models.CityTrafficInfo) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.CityTrafficInfo>>) new com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.CityTrafficInfo>() { // from class: com.tencent.mapsdk.internal.tk.46
            private com.tencent.map.lib.models.CityTrafficInfo a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return null;
                }
                com.tencent.map.lib.models.CityTrafficInfo cityTrafficInfo = new com.tencent.map.lib.models.CityTrafficInfo();
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeGetTrafficCityInfo(tkVar.f51661e, str, cityTrafficInfo);
                return cityTrafficInfo;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ com.tencent.map.lib.models.CityTrafficInfo run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return null;
                }
                com.tencent.map.lib.models.CityTrafficInfo cityTrafficInfo = new com.tencent.map.lib.models.CityTrafficInfo();
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeGetTrafficCityInfo(tkVar.f51661e, str, cityTrafficInfo);
                return cityTrafficInfo;
            }
        }, (com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.CityTrafficInfo>) null);
    }

    private void g(com.tencent.mapsdk.internal.qv qvVar) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass135(qvVar));
    }

    private void h(com.tencent.mapsdk.internal.qv qvVar) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass136(qvVar));
    }

    private void k(com.tencent.mapsdk.internal.qv qvVar) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass139(qvVar));
    }

    private void l(int i17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass162(i17));
    }

    private void m(boolean z17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass143(z17));
    }

    private void n(int i17) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass171(i17));
    }

    @Override // com.tencent.mapsdk.internal.bs
    public final int d() {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Integer>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Integer>() { // from class: com.tencent.mapsdk.internal.tk.119
            private java.lang.Integer a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return -1;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Integer.valueOf(tkVar.f51660d.nativeClearCache(tkVar.f51661e));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Integer run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return -1;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Integer.valueOf(tkVar.f51660d.nativeClearCache(tkVar.f51661e));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Integer>) (-1))).intValue();
    }

    @Override // com.tencent.mapsdk.internal.bs
    public final void f() {
        b(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.141
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeUnlockEngine(tkVar.f51661e);
            }
        });
    }

    public final com.tencent.map.lib.models.GeoPoint[] i() {
        final com.tencent.map.lib.models.GeoPoint[] geoPointArr = new com.tencent.map.lib.models.GeoPoint[4];
        com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint(39984186, 116307503);
        for (int i17 = 0; i17 < 4; i17++) {
            geoPointArr[i17] = geoPoint;
        }
        return (com.tencent.map.lib.models.GeoPoint[]) b((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.GeoPoint[]>>) new com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.GeoPoint[]>() { // from class: com.tencent.mapsdk.internal.tk.116
            private com.tencent.map.lib.models.GeoPoint[] a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return geoPointArr;
                }
                double[] dArr = new double[8];
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeFromMapSight(tkVar.f51661e, dArr);
                return new com.tencent.map.lib.models.GeoPoint[]{new com.tencent.map.lib.models.GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d)), new com.tencent.map.lib.models.GeoPoint((int) (dArr[3] * 1000000.0d), (int) (dArr[2] * 1000000.0d)), new com.tencent.map.lib.models.GeoPoint((int) (dArr[5] * 1000000.0d), (int) (dArr[4] * 1000000.0d)), new com.tencent.map.lib.models.GeoPoint((int) (dArr[7] * 1000000.0d), (int) (dArr[6] * 1000000.0d))};
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ com.tencent.map.lib.models.GeoPoint[] run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return geoPointArr;
                }
                double[] dArr = new double[8];
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeFromMapSight(tkVar.f51661e, dArr);
                return new com.tencent.map.lib.models.GeoPoint[]{new com.tencent.map.lib.models.GeoPoint((int) (dArr[1] * 1000000.0d), (int) (dArr[0] * 1000000.0d)), new com.tencent.map.lib.models.GeoPoint((int) (dArr[3] * 1000000.0d), (int) (dArr[2] * 1000000.0d)), new com.tencent.map.lib.models.GeoPoint((int) (dArr[5] * 1000000.0d), (int) (dArr[4] * 1000000.0d)), new com.tencent.map.lib.models.GeoPoint((int) (dArr[7] * 1000000.0d), (int) (dArr[6] * 1000000.0d))};
            }
        }, (com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.GeoPoint[]>) geoPointArr);
    }

    private void a(com.tencent.mapsdk.internal.op opVar) {
        this.f51662f = opVar;
    }

    private void b(com.tencent.map.lib.models.PolygonInfo polygonInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass101(polygonInfo));
    }

    private void e(com.tencent.mapsdk.internal.qv qvVar) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass133(qvVar));
    }

    private boolean f(java.lang.String str) {
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass117>) new com.tencent.mapsdk.internal.tk.AnonymousClass117(str), (com.tencent.mapsdk.internal.tk.AnonymousClass117) java.lang.Boolean.FALSE)).booleanValue();
    }

    private void j(com.tencent.mapsdk.internal.qv qvVar) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass138(qvVar));
    }

    private void l(com.tencent.mapsdk.internal.qv qvVar) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass40(qvVar));
    }

    private void m(int i17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass164(i17));
    }

    private void o(boolean z17) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass180(z17));
    }

    private void p(int i17) {
        com.tencent.mapsdk.internal.ne neVar;
        if (0 == this.f51661e || (neVar = this.f51666j) == null) {
            return;
        }
        neVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass3(i17));
    }

    private void q(int i17) {
        if (this.f51661e == 0) {
            return;
        }
        this.f51660d.nativeSetLanguage(this.f51661e, i17);
    }

    private boolean r(int i17) {
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass53>) new com.tencent.mapsdk.internal.tk.AnonymousClass53(i17), (com.tencent.mapsdk.internal.tk.AnonymousClass53) java.lang.Boolean.FALSE)).booleanValue();
    }

    private void s(int i17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass65(i17));
    }

    private void a(com.tencent.mapsdk.internal.ox oxVar) {
        this.f51665i = oxVar;
    }

    private void b(com.tencent.mapsdk.internal.qv qvVar) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass127(qvVar));
    }

    private void f(com.tencent.mapsdk.internal.qv qvVar) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass134(qvVar));
    }

    private void h(java.lang.String str) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass156(str));
    }

    private void n(boolean z17) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass173(z17));
    }

    @Override // com.tencent.mapsdk.internal.bs
    public final void c() {
        b(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.130
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeLockEngine(tkVar.f51661e);
            }
        });
    }

    public final void e(final boolean z17) {
        if (0 == this.f51661e || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.161
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetIndoorBuildingStyle(tkVar.f51661e, z17 ? 1 : 0);
                }
            }
        });
    }

    public final void g(final boolean z17) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.184
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetLocationCompassMarkerHidden(tkVar.f51661e, z17);
                }
            }
        });
    }

    public final void k(final boolean z17) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.39
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSwitchEngineForeGround(tkVar.f51661e, z17);
                }
            }
        });
    }

    public final void l(final boolean z17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.43
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeEnablePOI(tkVar.f51661e, z17);
            }
        });
    }

    private void c(int i17, int i18) {
        b(new com.tencent.mapsdk.internal.tk.AnonymousClass2(i17, i18));
    }

    private int d(java.lang.String str) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass163>) new com.tencent.mapsdk.internal.tk.AnonymousClass163(str), (com.tencent.mapsdk.internal.tk.AnonymousClass163) 0)).intValue();
    }

    private void i(com.tencent.mapsdk.internal.qv qvVar) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass137(qvVar));
    }

    private int l(java.lang.String str) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass50>) new com.tencent.mapsdk.internal.tk.AnonymousClass50(str), (com.tencent.mapsdk.internal.tk.AnonymousClass50) (-1))).intValue();
    }

    private void p(boolean z17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass44(z17));
    }

    private void q(boolean z17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass45(z17));
    }

    public final boolean a(android.content.Context context, com.tencent.mapsdk.internal.oo ooVar, com.tencent.mapsdk.internal.w wVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int[] iArr = new int[1];
        this.f51660d.initCallback(ooVar, wVar, this, this, this, this, this.f51666j.f50508h, this, this, this, this, this);
        this.f51661e = this.f51660d.nativeInitEngine(str, str2, str3, com.tencent.mapsdk.internal.hs.a(context), 256, com.tencent.mapsdk.internal.hs.a(context), iArr, false, com.tencent.tencentmap.mapsdk.maps.model.Language.zh.ordinal());
        if (iArr[0] != 0) {
            com.tencent.mapsdk.core.utils.log.LogUtil.b("init engine fail:" + iArr[0]);
            com.tencent.mapsdk.core.utils.log.LogUtil.a(E()).e(com.tencent.mapsdk.internal.la.a.f50260a, "init engine fail: " + iArr[0]);
            this.f51661e = 0L;
            return false;
        }
        com.tencent.mapsdk.core.utils.log.LogUtil.a(E()).c(com.tencent.mapsdk.internal.la.a.f50260a, "init engine success: " + iArr[0]);
        this.f51660d.nativeSetCenter(this.f51661e, new com.tencent.map.lib.models.GeoPoint(39984186, 116307503), false);
        this.f51660d.registerCallback(this.f51661e);
        this.f51660d.nativeSetTrafficColor(this.f51661e, f51651o, f51653q, f51655s, -16777063);
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50201b, E());
        return true;
    }

    @Override // com.tencent.mapsdk.internal.ot
    public final void b(java.lang.String str, com.tencent.mapsdk.internal.lt ltVar) {
        com.tencent.map.lib.models.DataSource dataSource = com.tencent.map.lib.models.DataSource.get(ltVar.f50375b);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.B, "onRequestDownload DataSource:" + dataSource + " uri:" + str);
        if (dataSource == com.tencent.map.lib.models.DataSource.TILE_OVERLAY) {
            com.tencent.map.lib.models.MapTileID mapTileID = (com.tencent.map.lib.models.MapTileID) ltVar.f50377d;
            int tileTag = mapTileID.getTileTag();
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50202c, "onRequestDownload tileOverlayId:".concat(java.lang.String.valueOf(tileTag)));
            com.tencent.mapsdk.internal.qz a17 = this.f51666j.H.a(tileTag);
            if (a17 != null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50202c, "onRequestDownload found TileOverlay");
                a17.d().a(str, new com.tencent.mapsdk.internal.rd(a17.f51133q), ltVar.f50376c);
                com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.kx.f50202c, "req-count", E());
                com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.kx.f50202c, "R/" + mapTileID.getX() + "-" + mapTileID.getY() + "-" + mapTileID.getZ(), E());
                return;
            }
        }
        this.f51663g.a(str, this.f51666j.f50521u.d());
        com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.kx.f50201b, "req-count", E());
    }

    public final void j(final boolean z17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.25
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetTileOverlayEnabled(tkVar.f51661e, z17);
            }
        });
    }

    public final com.tencent.map.lib.models.GeoPoint o() {
        return (com.tencent.map.lib.models.GeoPoint) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.GeoPoint>>) new com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.GeoPoint>() { // from class: com.tencent.mapsdk.internal.tk.192
            private com.tencent.map.lib.models.GeoPoint a() {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return null;
                }
                com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint();
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeGetCenterMapPoint(tkVar.f51661e, geoPoint);
                return geoPoint;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ com.tencent.map.lib.models.GeoPoint run() {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return null;
                }
                com.tencent.map.lib.models.GeoPoint geoPoint = new com.tencent.map.lib.models.GeoPoint();
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeGetCenterMapPoint(tkVar.f51661e, geoPoint);
                return geoPoint;
            }
        }, (com.tencent.map.tools.CallbackRunnable<com.tencent.map.lib.models.GeoPoint>) new com.tencent.map.lib.models.GeoPoint());
    }

    private void j(java.lang.String str) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass41(str));
    }

    private void k(java.lang.String str) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass42(str));
    }

    public final void c(final boolean z17) {
        if (this.f51661e == 0 || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.159
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeLandMarkEnabled(tkVar.f51661e, z17);
                }
            }
        });
    }

    public final void e(int i17) {
        if (0 == this.f51661e) {
            return;
        }
        this.f51660d.nativeSetMapStyle(this.f51661e, i17, false);
    }

    public final void f(final boolean z17) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.181
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetLocationMarkerHidden(tkVar.f51661e, z17);
                }
            }
        });
    }

    public final void g(final int i17) {
        if (this.f51661e == 0 || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.22
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeReloadTileOverlay(tkVar.f51661e, i17);
                }
            }
        });
    }

    public final void h(final boolean z17) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.186
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetLocationRedLineHidden(tkVar.f51661e, z17);
                }
            }
        });
    }

    public final void i(final boolean z17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.11
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetNeedDisplay(tkVar.f51661e, z17);
            }
        });
    }

    private java.lang.String c(com.tencent.map.lib.models.GeoPoint geoPoint) {
        return (java.lang.String) a(new com.tencent.mapsdk.internal.tk.AnonymousClass170(geoPoint), (com.tencent.mapsdk.internal.tk.AnonymousClass170) null);
    }

    private void d(int i17, int i18) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass112(i17, i18));
    }

    private void i(java.lang.String str) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass36(str));
    }

    private void j(long j17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass98(j17));
    }

    @Override // com.tencent.mapsdk.internal.ox
    public final void e() {
        com.tencent.mapsdk.internal.ox oxVar = this.f51665i;
        if (oxVar != null) {
            oxVar.e();
        }
    }

    public final void f(final int i17) {
        if (this.f51661e == 0 || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.21
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeRemoveTileOverlay(tkVar.f51661e, i17);
                }
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.pd
    public final void g() {
        com.tencent.mapsdk.internal.ne neVar = this.f51666j;
        if (neVar != null) {
            final com.tencent.mapsdk.internal.v vVar = neVar.f50520t;
            a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.26
                @Override // com.tencent.mapsdk.internal.ne.a
                public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                    com.tencent.mapsdk.internal.v vVar2 = vVar;
                    if (vVar2 == null || vVar2.f52422o == null) {
                        return;
                    }
                    vVar2.f52420m = vVar2.f52423p.o();
                    int q17 = vVar2.f52423p.q();
                    float p17 = vVar2.f52423p.p();
                    com.tencent.mapsdk.internal.v.b bVar = vVar2.f52409b;
                    if (q17 != bVar.f52444m) {
                        vVar2.f52422o.f50508h.c(com.tencent.mapsdk.internal.gf.f49577c);
                    } else if (p17 != bVar.f52443l) {
                        vVar2.f52422o.f50508h.c(com.tencent.mapsdk.internal.gf.f49576b);
                    }
                    if (vVar2.f52409b != null) {
                        float d17 = com.tencent.mapsdk.internal.v.d(p17);
                        if (d17 < vVar2.a()) {
                            float f17 = com.tencent.mapsdk.internal.v.f(d17);
                            if (vVar2.f52423p.r() > f17) {
                                vVar2.b(f17);
                            }
                        }
                        vVar2.f52409b.a(q17, p17);
                    }
                }
            });
        }
    }

    public final void h(final int i17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.56
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.removeLineText(tkVar.f51661e, i17);
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.oz
    public final void k() {
        java.util.List<com.tencent.mapsdk.internal.oz> list;
        com.tencent.mapsdk.internal.ne neVar = this.f51666j;
        if (neVar == null || (list = neVar.I) == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator<com.tencent.mapsdk.internal.oz> it = neVar.I.iterator();
        while (it.hasNext()) {
            it.next().k();
        }
    }

    private void c(int i17, int i18, int i19) {
        if (0 == this.f51661e || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass194(i17, i18, i19));
    }

    private void d(com.tencent.mapsdk.internal.qv qvVar) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass129(qvVar));
    }

    private java.lang.String[] h(long j17) {
        return (java.lang.String[]) b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass94>) new com.tencent.mapsdk.internal.tk.AnonymousClass94(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass94) new java.lang.String[0]);
    }

    private int i(long j17) {
        return ((java.lang.Integer) b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass95>) new com.tencent.mapsdk.internal.tk.AnonymousClass95(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass95) 0)).intValue();
    }

    @Override // com.tencent.mapsdk.internal.oz
    public final void j() {
        java.util.List<com.tencent.mapsdk.internal.oz> list;
        com.tencent.mapsdk.internal.ne neVar = this.f51666j;
        if (neVar == null || (list = neVar.I) == null || list.isEmpty()) {
            return;
        }
        java.util.Iterator<com.tencent.mapsdk.internal.oz> it = neVar.I.iterator();
        while (it.hasNext()) {
            it.next().j();
        }
    }

    private void e(int i17, int i18) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass28(i17, i18));
    }

    private void f(int i17, int i18) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass29(i17, i18));
    }

    public final void d(final boolean z17) {
        if (this.f51661e == 0 || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.160
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeIndoorBuildingEnabled(tkVar.f51661e, z17);
                }
            }
        });
    }

    private int e(long j17) {
        return ((java.lang.Integer) b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass91>) new com.tencent.mapsdk.internal.tk.AnonymousClass91(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass91) 0)).intValue();
    }

    private float[] f(long j17) {
        return (float[]) b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass92>) new com.tencent.mapsdk.internal.tk.AnonymousClass92(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass92) new float[0]);
    }

    private java.lang.String[] g(long j17) {
        return (java.lang.String[]) b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass93>) new com.tencent.mapsdk.internal.tk.AnonymousClass93(j17), (com.tencent.mapsdk.internal.tk.AnonymousClass93) new java.lang.String[0]);
    }

    public final void c(final float f17, final float f18) {
        com.tencent.mapsdk.internal.ne neVar;
        if (0 == this.f51661e || (neVar = this.f51666j) == null) {
            return;
        }
        neVar.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.4
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeZoomIn(tkVar.f51661e, f17, f18);
                }
            }
        });
    }

    private void d(com.tencent.map.lib.models.GeoPoint geoPoint) {
        this.f51666j.a(new com.tencent.mapsdk.internal.tk.AnonymousClass190(geoPoint));
    }

    public final void c(final int i17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.12
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetMaxScaleLevel(tkVar.f51661e, i17);
            }
        });
    }

    public final void d(final int i17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.14
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetMinScaleLevel(tkVar.f51661e, i17);
            }
        });
    }

    private void c(float f17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass15(f17));
    }

    private void d(long j17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass89(j17));
    }

    private <T> T e(final com.tencent.map.tools.CallbackRunnable<T> callbackRunnable, T t17) {
        if (callbackRunnable != null && this.f51666j != null && this.f51661e != 0) {
            this.f51666j.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.107
                @Override // com.tencent.mapsdk.internal.ne.a
                public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                    callbackRunnable.run();
                }
            });
        }
        return t17;
    }

    private void d(float f17, float f18) {
        this.f51660d.scheduleClickOnNextRender(this.f51661e, f17, f18);
    }

    public final void c(final long j17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.72
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeRemoveGLVisualizationOverlay(tkVar.f51661e, j17);
            }
        });
    }

    private <T> T c(com.tencent.map.tools.CallbackRunnable<T> callbackRunnable, T t17) {
        if (this.f51666j != null && this.f51661e != 0) {
            try {
                if (this.f51666j != null && this.f51661e != 0) {
                    if (java.lang.Thread.currentThread().getName().contains(com.tencent.mapsdk.internal.ua.f52309a)) {
                        return (T) b((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<T>>) callbackRunnable, (com.tencent.map.tools.CallbackRunnable<T>) t17);
                    }
                    return (T) e((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<T>>) callbackRunnable, (com.tencent.map.tools.CallbackRunnable<T>) t17);
                }
                return t17;
            } catch (java.lang.Exception e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50206g, "safeCallEngine", e17);
            }
        }
        return t17;
    }

    private <T> T d(com.tencent.map.tools.CallbackRunnable<T> callbackRunnable, T t17) {
        if (callbackRunnable == null || this.f51666j == null || this.f51661e == 0) {
            return t17;
        }
        if (java.lang.Thread.currentThread().getName().contains(com.tencent.mapsdk.internal.ua.f52309a)) {
            return (T) b((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<T>>) callbackRunnable, (com.tencent.map.tools.CallbackRunnable<T>) t17);
        }
        return (T) e((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<T>>) callbackRunnable, (com.tencent.map.tools.CallbackRunnable<T>) t17);
    }

    private int a(byte[] bArr, int i17) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass185>) new com.tencent.mapsdk.internal.tk.AnonymousClass185(bArr, i17), (com.tencent.mapsdk.internal.tk.AnonymousClass185) (-1))).intValue();
    }

    private void a(int i17, int i18, int i19, int i27, int i28) {
        b(new com.tencent.mapsdk.internal.tk.AnonymousClass13(i17, i18, i19, i27, i28));
    }

    private void b(com.tencent.mapsdk.internal.pi piVar) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass150(piVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int c(com.tencent.mapsdk.internal.qv r14) {
        /*
            r13 = this;
            com.tencent.mapsdk.internal.fy r0 = r14.f51071b
            int r1 = r0.C
            r2 = 3
            r3 = 1
            r4 = 0
            if (r1 != r2) goto Lc
            r9 = r3
            r1 = r4
            goto Ld
        Lc:
            r9 = r4
        Ld:
            int[] r2 = r14.f51073p
            r2 = r2[r4]
            r5 = 33
            if (r2 != r5) goto L18
            r1 = 2
            r8 = r1
            goto L1f
        L18:
            r5 = 20
            r8 = r1
            if (r2 != r5) goto L1f
            r10 = r3
            goto L20
        L1f:
            r10 = r4
        L20:
            int[] r1 = new int[r4]
            java.util.List<java.lang.Integer> r0 = r0.L
            if (r0 == 0) goto L4c
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r1 = r4
        L2d:
            com.tencent.mapsdk.internal.fy r2 = r14.f51071b
            java.util.List<java.lang.Integer> r2 = r2.L
            int r2 = r2.size()
            if (r1 >= r2) goto L4a
            com.tencent.mapsdk.internal.fy r2 = r14.f51071b
            java.util.List<java.lang.Integer> r2 = r2.L
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L2d
        L4a:
            r12 = r0
            goto L4d
        L4c:
            r12 = r1
        L4d:
            int[] r0 = new int[r4]
            com.tencent.mapsdk.internal.fy r1 = r14.f51071b
            int[] r1 = r1.f49520t
            if (r1 == 0) goto L66
            int r0 = r1.length
            int[] r0 = new int[r0]
        L58:
            com.tencent.mapsdk.internal.fy r1 = r14.f51071b
            int[] r1 = r1.f49520t
            int r2 = r1.length
            if (r4 >= r2) goto L66
            r1 = r1[r4]
            r0[r4] = r1
            int r4 = r4 + 1
            goto L58
        L66:
            r11 = r0
            com.tencent.mapsdk.internal.tk$128 r0 = new com.tencent.mapsdk.internal.tk$128
            r5 = r0
            r6 = r13
            r7 = r14
            r5.<init>(r7, r8, r9, r10, r11, r12)
            r14 = -1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r14 = r13.c(r0, r14)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.tk.c(com.tencent.mapsdk.internal.qv):int");
    }

    private int a(com.tencent.map.lib.models.PolygonInfo polygonInfo) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass57>) new com.tencent.mapsdk.internal.tk.AnonymousClass57(polygonInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass57) 0)).intValue();
    }

    public final void b(final boolean z17) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.154
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetCompassVisible(tkVar.f51661e, z17);
                }
            }
        });
    }

    private int a(com.tencent.map.lib.models.CircleInfo circleInfo) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass68>) new com.tencent.mapsdk.internal.tk.AnonymousClass68(circleInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass68) (-1))).intValue();
    }

    private com.tencent.mapsdk.internal.qr b(com.tencent.map.lib.models.GeoPoint geoPoint) {
        if (geoPoint == null) {
            geoPoint = new com.tencent.map.lib.models.GeoPoint();
        }
        return (com.tencent.mapsdk.internal.qr) a(new com.tencent.mapsdk.internal.tk.AnonymousClass167(geoPoint), (com.tencent.mapsdk.internal.tk.AnonymousClass167) null);
    }

    public final void b(final int i17) {
        if (0 == this.f51661e) {
            return;
        }
        b(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.178
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetLocationMarkerZIndex(tkVar.f51661e, i17);
            }
        });
    }

    private void a(int i17, com.tencent.map.lib.models.CircleInfo circleInfo) {
        if (this.f51661e == 0 || circleInfo == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass79(i17, circleInfo));
    }

    public final void b(final java.lang.String str) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.182
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetLocationCompassMarkerImage(tkVar.f51661e, str);
                }
            }
        });
    }

    private void a(int i17, int i18, boolean z17, int[] iArr) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass109(i17, i18, z17, iArr));
    }

    private void a(int i17, int i18, int[] iArr) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass110(i17, i18, iArr));
    }

    public final void b(final float f17, final float f18) {
        com.tencent.mapsdk.internal.ne neVar;
        if (0 == this.f51661e || (neVar = this.f51666j) == null) {
            return;
        }
        neVar.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.188

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f51910c = false;

            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeMoveBy(tkVar.f51661e, f17, f18, this.f51910c);
                }
            }
        });
    }

    private int a(com.tencent.map.lib.models.MaskLayer maskLayer) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass111>) new com.tencent.mapsdk.internal.tk.AnonymousClass111(maskLayer), (com.tencent.mapsdk.internal.tk.AnonymousClass111) 0)).intValue();
    }

    private void b(double d17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass195(d17));
    }

    public final void b(final float f17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.16
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetSkew(tkVar.f51661e, f17, false);
            }
        });
    }

    private com.tencent.map.lib.models.GeoPoint a(byte[] bArr, float f17, float f18) {
        return (com.tencent.map.lib.models.GeoPoint) b((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass114>) new com.tencent.mapsdk.internal.tk.AnonymousClass114(bArr, f17, f18), (com.tencent.mapsdk.internal.tk.AnonymousClass114) new com.tencent.map.lib.models.GeoPoint());
    }

    public final void b(final int i17, final int i18) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.18
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetTileOverlayPriority(tkVar.f51661e, i17, i18);
            }
        });
    }

    public final android.graphics.PointF a(final double d17, final double d18) {
        return (android.graphics.PointF) b((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<android.graphics.PointF>>) new com.tencent.map.tools.CallbackRunnable<android.graphics.PointF>() { // from class: com.tencent.mapsdk.internal.tk.115

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f51716a = null;

            private android.graphics.PointF a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return new android.graphics.PointF();
                }
                float[] fArr = new float[2];
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeToScreenLocation(tkVar.f51661e, this.f51716a, d17, d18, fArr);
                return new android.graphics.PointF(fArr[0], fArr[1]);
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ android.graphics.PointF run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return new android.graphics.PointF();
                }
                float[] fArr = new float[2];
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeToScreenLocation(tkVar.f51661e, this.f51716a, d17, d18, fArr);
                return new android.graphics.PointF(fArr[0], fArr[1]);
            }
        }, (com.tencent.map.tools.CallbackRunnable<android.graphics.PointF>) new android.graphics.PointF());
    }

    public final void b(final int i17, final int i18, final int i19) {
        if (this.f51661e == 0 || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.20
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetTileOverlayVisibleLevelRange(tkVar.f51661e, i17, i18, i19);
                }
            }
        });
    }

    public final void a(final boolean z17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.121
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetSatelliteEnabled(tkVar.f51661e, z17);
            }
        });
    }

    private void b(int i17, int i18, int i19, int i27) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass27(i18, i17, i19, i27));
    }

    public final java.lang.String a(final com.tencent.map.lib.models.GeoPoint geoPoint) {
        return (java.lang.String) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.String>>) new com.tencent.map.tools.CallbackRunnable<java.lang.String>() { // from class: com.tencent.mapsdk.internal.tk.124
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.tencent.map.tools.CallbackRunnable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public java.lang.String run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return "";
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                byte[] nativeGetCityName = tkVar.f51660d.nativeGetCityName(tkVar.f51661e, geoPoint);
                if (nativeGetCityName != null) {
                    try {
                        return new java.lang.String(nativeGetCityName, "GBK").trim();
                    } catch (java.io.UnsupportedEncodingException unused) {
                    }
                }
                return "";
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.String>) "");
    }

    private int a(com.tencent.mapsdk.internal.qv qvVar) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass126>) new com.tencent.mapsdk.internal.tk.AnonymousClass126(qvVar), (com.tencent.mapsdk.internal.tk.AnonymousClass126) (-1))).intValue();
    }

    @Override // com.tencent.mapsdk.internal.bq
    public final java.lang.String b() {
        return (java.lang.String) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.String>>) new com.tencent.map.tools.CallbackRunnable<java.lang.String>() { // from class: com.tencent.mapsdk.internal.tk.59
            private java.lang.String a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return "";
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return tkVar.f51660d.nativeGetEngineLogInfo(tkVar.f51661e);
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.String run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return "";
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return tkVar.f51660d.nativeGetEngineLogInfo(tkVar.f51661e);
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.String>) "");
    }

    private int b(com.tencent.map.lib.models.MarkerInfo markerInfo) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass63>) new com.tencent.mapsdk.internal.tk.AnonymousClass63(markerInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass63) 0)).intValue();
    }

    private void a(int i17, boolean z17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass131(i17, z17));
    }

    private boolean a(final int i17, final float f17, final float f18) {
        if (i17 == -1) {
            return false;
        }
        return ((java.lang.Boolean) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.tk.132
            private java.lang.Boolean a() {
                return java.lang.Boolean.valueOf(com.tencent.mapsdk.internal.tk.this.f51660d.nativeOnTapLine(i17, f17, f18));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Boolean run() {
                return java.lang.Boolean.valueOf(com.tencent.mapsdk.internal.tk.this.f51660d.nativeOnTapLine(i17, f17, f18));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>) java.lang.Boolean.FALSE)).booleanValue();
    }

    public final void b(final long j17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.66
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk.this.f51660d.nativeRemoveEngineOverlay(j17);
            }
        });
    }

    private void b(java.util.List<com.tencent.map.lib.models.IndoorCellInfo> list) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass103(list));
    }

    public final com.tencent.mapsdk.engine.jni.models.TappedElement a(final float f17, final float f18) {
        return (com.tencent.mapsdk.engine.jni.models.TappedElement) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.engine.jni.models.TappedElement>>) new com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.engine.jni.models.TappedElement>() { // from class: com.tencent.mapsdk.internal.tk.140
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.tencent.map.tools.CallbackRunnable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public com.tencent.mapsdk.engine.jni.models.TappedElement run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return null;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                byte[] nativeOnTap = tkVar.f51660d.nativeOnTap(tkVar.f51661e, f17, f18);
                if (nativeOnTap == null) {
                    return null;
                }
                try {
                    return com.tencent.mapsdk.engine.jni.models.TappedElement.fromBytes(nativeOnTap);
                } catch (java.lang.Exception unused) {
                    return null;
                }
            }
        }, (com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.engine.jni.models.TappedElement>) null);
    }

    public final void a(final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds> list) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.144
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 != com.tencent.mapsdk.internal.tk.this.f51661e) {
                    if (list == null) {
                        com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                        tkVar.f51660d.nativeSetBuildingBlackList(tkVar.f51661e, null);
                    } else {
                        com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
                        tkVar2.f51660d.nativeSetBuildingBlackList(tkVar2.f51661e, (com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds[]) list.toArray(new com.tencent.tencentmap.mapsdk.maps.model.LatLngBounds[0]));
                    }
                }
            }
        });
    }

    public final void b(final com.tencent.mapsdk.internal.ne.a aVar) {
        if (this.f51666j == null || this.f51661e == 0) {
            return;
        }
        a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Object>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Object>() { // from class: com.tencent.mapsdk.internal.tk.106
            @Override // com.tencent.map.tools.CallbackRunnable
            public final java.lang.Object run() {
                aVar.a(null);
                return null;
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Object>) null);
    }

    public final void a(final com.tencent.map.lib.models.GeoPoint geoPoint, final float f17, final float f18, final boolean z17) {
        if (0 == this.f51661e || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.145
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetLocationInfo(tkVar.f51661e, geoPoint.getLatitudeE6() / 1000000.0d, geoPoint.getLongitudeE6() / 1000000.0d, f17, f18, z17);
                }
            }
        });
    }

    public final <T> T b(com.tencent.map.tools.CallbackRunnable<T> callbackRunnable, T t17) {
        return (callbackRunnable == null || this.f51666j == null || this.f51661e == 0) ? t17 : callbackRunnable.run();
    }

    private void a(boolean z17, boolean z18, boolean z19, boolean z27) {
        if (0 == this.f51661e || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass146(z17, z18, z19, z27));
    }

    public final void a(final float f17) {
        if (0 == this.f51661e || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.147
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetLocationHeading(tkVar.f51661e, f17);
                }
            }
        });
    }

    @Override // com.tencent.mapsdk.internal.os
    public final void a(java.lang.String str, com.tencent.mapsdk.internal.lt ltVar) {
        com.tencent.map.lib.models.DataSource dataSource = com.tencent.map.lib.models.DataSource.get(ltVar.f50375b);
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.B, "onCancelDownload DataSource:" + dataSource + " uri:" + str);
        if (dataSource == com.tencent.map.lib.models.DataSource.TILE_OVERLAY) {
            com.tencent.map.lib.models.MapTileID mapTileID = (com.tencent.map.lib.models.MapTileID) ltVar.f50377d;
            int tileTag = mapTileID.getTileTag();
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50202c, "onCancelDownload tileOverlayId:".concat(java.lang.String.valueOf(tileTag)));
            com.tencent.mapsdk.internal.qz a17 = this.f51666j.H.a(tileTag);
            if (a17 != null) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50202c, "onCancelDownload found TileOverlay");
                a17.d().a(str);
                com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.kx.f50202c, "cancel-count", E());
                com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.kx.f50202c, "C/" + mapTileID.getX() + "-" + mapTileID.getY() + "-" + mapTileID.getZ(), E());
                return;
            }
        }
        this.f51663g.a(str);
        com.tencent.mapsdk.internal.lb.e(com.tencent.mapsdk.internal.kx.f50201b, "cancel-count", E());
    }

    private int a(com.tencent.mapsdk.internal.pi piVar) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass149>) new com.tencent.mapsdk.internal.tk.AnonymousClass149(piVar), (com.tencent.mapsdk.internal.tk.AnonymousClass149) 0)).intValue();
    }

    public final void a(final int[] iArr, final int i17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.151
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeDeleteIcons(tkVar.f51661e, iArr, i17);
            }
        });
    }

    private void a(int[] iArr, int i17, boolean z17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass153(iArr, i17, z17));
    }

    public final void a(final int i17, final int i18) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.155
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetCompassPosition(tkVar.f51661e, i17, i18);
                }
            }
        });
    }

    public final double a(final android.graphics.Rect rect, final android.graphics.Rect rect2) {
        return ((java.lang.Double) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Double>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Double>() { // from class: com.tencent.mapsdk.internal.tk.157
            private java.lang.Double a() {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return java.lang.Double.valueOf(1.0d);
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Double.valueOf(tkVar.f51660d.nativeGetTargetScale(tkVar.f51661e, rect, rect2));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Double run() {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return java.lang.Double.valueOf(1.0d);
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Double.valueOf(tkVar.f51660d.nativeGetTargetScale(tkVar.f51661e, rect, rect2));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Double>) java.lang.Double.valueOf(1.0d))).doubleValue();
    }

    public final void a(final android.graphics.Rect rect, final android.graphics.Rect rect2, final boolean z17) {
        if (0 == this.f51661e || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.158
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeZoomToSpan(tkVar.f51661e, rect, rect2, z17);
                }
            }
        });
    }

    private void a(float f17, float f18, float f19, float f27) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass172(f17, f18, f19, f27));
    }

    private void a(java.lang.String[] strArr) {
        if (this.f51661e == 0) {
            return;
        }
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass175(strArr));
    }

    public final int a(final java.lang.String str, final float f17, final float f18) {
        if (0 == this.f51661e) {
            return 0;
        }
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Integer>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Integer>() { // from class: com.tencent.mapsdk.internal.tk.176
            private java.lang.Integer a() {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return 0;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Integer.valueOf(tkVar.f51660d.nativeSetLocationMarkerImage(tkVar.f51661e, str, f17, f18));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Integer run() {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return 0;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Integer.valueOf(tkVar.f51660d.nativeSetLocationMarkerImage(tkVar.f51661e, str, f17, f18));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Integer>) 0)).intValue();
    }

    public final void a(final int i17) {
        if (0 == this.f51661e) {
            return;
        }
        b(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.177
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetLocationMarkerLevel(tkVar.f51661e, i17);
            }
        });
    }

    public final void a(final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.183
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetLocationCompassGroupImages(tkVar.f51661e, str, str2, str3, str4, str5);
                }
            }
        });
    }

    public final void a(final float f17, final int i17, final com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        if (0 == this.f51661e) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.187
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetLocationRedLineInfo(tkVar.f51661e, f17, i17, latLng);
                }
            }
        });
    }

    public final void a(final com.tencent.map.lib.models.GeoPoint geoPoint, final boolean z17) {
        com.tencent.mapsdk.internal.ne neVar;
        if (0 == this.f51661e || (neVar = this.f51666j) == null) {
            return;
        }
        neVar.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.189
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetCenter(tkVar.f51661e, geoPoint, z17);
                }
            }
        });
    }

    public final void a(final com.tencent.map.lib.models.GeoPoint geoPoint, final int i17) {
        com.tencent.mapsdk.internal.ne neVar;
        if (0 == this.f51661e || (neVar = this.f51666j) == null) {
            return;
        }
        neVar.a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.191

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f51923c = true;

            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetCenterMapPointAndScaleLevel(tkVar.f51661e, geoPoint, i17, this.f51923c);
                }
            }
        });
    }

    private void a(double d17) {
        com.tencent.mapsdk.internal.ne neVar;
        if (0 == this.f51661e || (neVar = this.f51666j) == null) {
            return;
        }
        neVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass193(d17));
    }

    private void a(com.tencent.map.lib.models.GeoPoint geoPoint, android.graphics.RectF rectF, int i17, int i18, boolean z17) {
        com.tencent.mapsdk.internal.ne neVar;
        if (0 == this.f51661e || (neVar = this.f51666j) == null) {
            return;
        }
        neVar.a(new com.tencent.mapsdk.internal.tk.AnonymousClass6(rectF, geoPoint, i17, i18, z17));
    }

    public final void a(final float f17, final float f18, final boolean z17) {
        if (0 == this.f51661e || this.f51666j == null) {
            return;
        }
        e((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>() { // from class: com.tencent.mapsdk.internal.tk.7
            private java.lang.Boolean a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.FALSE;
                }
                if (z17) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetScreenCenterOffset(tkVar.f51661e, f17, f18, true);
                } else {
                    com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
                    com.tencent.mapsdk.internal.ey eyVar = tkVar2.f51666j.f50513m;
                    com.tencent.mapsdk.internal.fu a17 = eyVar.a(tkVar2.o());
                    com.tencent.mapsdk.internal.tk tkVar3 = com.tencent.mapsdk.internal.tk.this;
                    tkVar3.f51660d.nativeSetScreenCenterOffset(tkVar3.f51661e, f17, f18, false);
                    com.tencent.mapsdk.internal.fu a18 = eyVar.a(com.tencent.mapsdk.internal.tk.this.o());
                    double d17 = a18.f49467a;
                    double d18 = d17 - a17.f49467a;
                    double d19 = a18.f49468b;
                    com.tencent.map.lib.models.GeoPoint a19 = eyVar.a(new com.tencent.mapsdk.internal.fu(d17 + d18, d19 + (d19 - a17.f49468b)));
                    com.tencent.mapsdk.internal.tk tkVar4 = com.tencent.mapsdk.internal.tk.this;
                    tkVar4.f51660d.nativeSetCenter(tkVar4.f51661e, a19, false);
                }
                return java.lang.Boolean.TRUE;
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Boolean run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return java.lang.Boolean.FALSE;
                }
                if (z17) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetScreenCenterOffset(tkVar.f51661e, f17, f18, true);
                } else {
                    com.tencent.mapsdk.internal.tk tkVar2 = com.tencent.mapsdk.internal.tk.this;
                    com.tencent.mapsdk.internal.ey eyVar = tkVar2.f51666j.f50513m;
                    com.tencent.mapsdk.internal.fu a17 = eyVar.a(tkVar2.o());
                    com.tencent.mapsdk.internal.tk tkVar3 = com.tencent.mapsdk.internal.tk.this;
                    tkVar3.f51660d.nativeSetScreenCenterOffset(tkVar3.f51661e, f17, f18, false);
                    com.tencent.mapsdk.internal.fu a18 = eyVar.a(com.tencent.mapsdk.internal.tk.this.o());
                    double d17 = a18.f49467a;
                    double d18 = d17 - a17.f49467a;
                    double d19 = a18.f49468b;
                    com.tencent.map.lib.models.GeoPoint a19 = eyVar.a(new com.tencent.mapsdk.internal.fu(d17 + d18, d19 + (d19 - a17.f49468b)));
                    com.tencent.mapsdk.internal.tk tkVar4 = com.tencent.mapsdk.internal.tk.this;
                    tkVar4.f51660d.nativeSetCenter(tkVar4.f51661e, a19, false);
                }
                return java.lang.Boolean.TRUE;
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Boolean>) java.lang.Boolean.FALSE);
    }

    public final void a(final int i17, final int i18, final int i19, final int i27) {
        if (0 == this.f51661e || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.8
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetViewport(tkVar.f51661e, i17, i18, i19, i27);
                }
            }
        });
    }

    private int a(com.tencent.map.lib.callbacks.TileOverlayCallback tileOverlayCallback, boolean z17, boolean z18, int i17) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass17>) new com.tencent.mapsdk.internal.tk.AnonymousClass17(tileOverlayCallback, z17, z18, i17), (com.tencent.mapsdk.internal.tk.AnonymousClass17) (-1))).intValue();
    }

    public final void a(final int i17, final int i18, final int i19) {
        if (this.f51661e == 0 || this.f51666j == null) {
            return;
        }
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.19
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e != 0) {
                    com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                    tkVar.f51660d.nativeSetTileOverlayDataLevelRange(tkVar.f51661e, i17, i18, i19);
                }
            }
        });
    }

    private void a(com.tencent.mapsdk.internal.oy oyVar) {
        this.f51660d.setMapCallbackGetGLContext(oyVar);
    }

    public final void a(final int i17, final float f17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.30
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetPriority(tkVar.f51661e, i17, f17);
            }
        });
    }

    public final void a(final java.util.List<com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection> list, final java.util.List<com.tencent.map.lib.models.GeoPoint> list2) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.31
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                java.util.List list3;
                java.util.List list4;
                if (0 == com.tencent.mapsdk.internal.tk.this.f51661e || (list3 = list) == null || list3.isEmpty() || (list4 = list2) == null || list4.isEmpty()) {
                    return;
                }
                int size = list.size();
                byte[][] bArr = new byte[size];
                for (int i17 = 0; i17 < size; i17++) {
                    com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection mapRouteSection = (com.tencent.tencentmap.mapsdk.maps.model.MapRouteSection) list.get(i17);
                    if (mapRouteSection != null) {
                        bArr[i17] = mapRouteSection.toBytes();
                    }
                }
                int size2 = list2.size();
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeAddRouteNameSegments(tkVar.f51661e, bArr, size, (com.tencent.map.lib.models.GeoPoint[]) list2.toArray(new com.tencent.map.lib.models.GeoPoint[size2]), size2);
            }
        });
    }

    private com.tencent.map.lib.models.AnnocationTextResult a(com.tencent.map.lib.models.AnnocationText annocationText) {
        return (com.tencent.map.lib.models.AnnocationTextResult) a(new com.tencent.mapsdk.internal.tk.AnonymousClass33(annocationText), (com.tencent.mapsdk.internal.tk.AnonymousClass33) null);
    }

    private java.util.List<java.lang.Integer> a(android.graphics.Rect rect, int i17) {
        return (java.util.List) a(new com.tencent.mapsdk.internal.tk.AnonymousClass34(rect, i17), (com.tencent.mapsdk.internal.tk.AnonymousClass34) null);
    }

    private void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass37(str, str2, str3));
    }

    public final void a(final java.lang.String str, final java.lang.String str2) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.49
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.nativeSetBuildingToSpecificFloor(tkVar.f51661e, str, str2);
                com.tencent.mapsdk.internal.ox oxVar = com.tencent.mapsdk.internal.tk.this.f51665i;
                if (oxVar != null) {
                    oxVar.e();
                }
            }
        });
    }

    public final void a(final double[] dArr, final double[] dArr2, final int i17) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.54
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.setRestrictBounds(tkVar.f51661e, dArr, dArr2, i17);
            }
        });
    }

    private int a(com.tencent.map.lib.models.GeoPoint[] geoPointArr, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass55>) new com.tencent.mapsdk.internal.tk.AnonymousClass55(geoPointArr, text), (com.tencent.mapsdk.internal.tk.AnonymousClass55) (-1))).intValue();
    }

    private void a(int i17, com.tencent.tencentmap.mapsdk.maps.model.PolylineOptions.Text text) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass58(i17, text));
    }

    public final long a(final com.tencent.map.lib.models.MarkerInfo markerInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Long>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Long>() { // from class: com.tencent.mapsdk.internal.tk.60
            private java.lang.Long a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return 0L;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Long.valueOf(tkVar.f51660d.nativeAddMarker2(tkVar.f51661e, markerInfo));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Long run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return 0L;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                return java.lang.Long.valueOf(tkVar.f51660d.nativeAddMarker2(tkVar.f51661e, markerInfo));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Long>) 0L)).longValue();
    }

    public final int a(final long j17) {
        return ((java.lang.Integer) a((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Integer>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Integer>() { // from class: com.tencent.mapsdk.internal.tk.61
            private java.lang.Integer a() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return 0;
                }
                return java.lang.Integer.valueOf(com.tencent.mapsdk.internal.tk.this.f51660d.nativeGetEngineId(j17));
            }

            @Override // com.tencent.map.tools.CallbackRunnable
            public final /* synthetic */ java.lang.Integer run() {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return 0;
                }
                return java.lang.Integer.valueOf(com.tencent.mapsdk.internal.tk.this.f51660d.nativeGetEngineId(j17));
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Integer>) 0)).intValue();
    }

    public final void a(final long j17, final com.tencent.map.lib.models.MarkerInfo markerInfo) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.62
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk.this.f51660d.nativeUpdateMarker(j17, markerInfo);
            }
        });
    }

    private void a(int i17, com.tencent.map.lib.models.MarkerInfo markerInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass64(i17, markerInfo));
    }

    public final void a(int i17, int i18, boolean z17) {
        if (this.f51661e == 0) {
            return;
        }
        this.f51660d.nativeSetMarkerMainSubRelation(this.f51661e, i17, i18, z17);
    }

    private long a(com.tencent.map.lib.models.AggregationOverlayInfo aggregationOverlayInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass67>) new com.tencent.mapsdk.internal.tk.AnonymousClass67(aggregationOverlayInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass67) 0L)).longValue();
    }

    private void a(long j17, com.tencent.map.lib.models.AggregationOverlayInfo aggregationOverlayInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass69(j17, aggregationOverlayInfo));
    }

    private long a(com.tencent.map.lib.models.HeatmapInfo heatmapInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass70>) new com.tencent.mapsdk.internal.tk.AnonymousClass70(heatmapInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass70) 0L)).longValue();
    }

    private void a(long j17, com.tencent.map.lib.models.HeatmapInfo heatmapInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass71(j17, heatmapInfo));
    }

    private com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit a(long j17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
        return (com.tencent.tencentmap.mapsdk.maps.model.VectorHeatAggregationUnit) a(new com.tencent.mapsdk.internal.tk.AnonymousClass73(j17, latLng), (com.tencent.mapsdk.internal.tk.AnonymousClass73) null);
    }

    private long a(com.tencent.map.lib.models.ArcLineOverlayInfo arcLineOverlayInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass74>) new com.tencent.mapsdk.internal.tk.AnonymousClass74(arcLineOverlayInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass74) 0L)).longValue();
    }

    private void a(long j17, com.tencent.map.lib.models.ArcLineOverlayInfo arcLineOverlayInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass75(j17, arcLineOverlayInfo));
    }

    private long a(com.tencent.map.lib.models.ScatterPlotInfo scatterPlotInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass76>) new com.tencent.mapsdk.internal.tk.AnonymousClass76(scatterPlotInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass76) 0L)).longValue();
    }

    private void a(long j17, com.tencent.map.lib.models.ScatterPlotInfo scatterPlotInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass77(j17, scatterPlotInfo));
    }

    private long a(com.tencent.map.lib.models.TrailOverlayInfo trailOverlayInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass78>) new com.tencent.mapsdk.internal.tk.AnonymousClass78(trailOverlayInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass78) 0L)).longValue();
    }

    private void a(long j17, com.tencent.map.lib.models.TrailOverlayInfo trailOverlayInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass80(j17, trailOverlayInfo));
    }

    private long a(com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass82>) new com.tencent.mapsdk.internal.tk.AnonymousClass82(groundOverlayInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass82) 0L)).longValue();
    }

    private void a(long j17, com.tencent.map.lib.models.GroundOverlayInfo groundOverlayInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass83(j17, groundOverlayInfo));
    }

    private long a(com.tencent.map.lib.models.IntersectionOverlayInfo intersectionOverlayInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass84>) new com.tencent.mapsdk.internal.tk.AnonymousClass84(intersectionOverlayInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass84) 0L)).longValue();
    }

    private void a(long j17, com.tencent.map.lib.models.IntersectionOverlayInfo intersectionOverlayInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass85(j17, intersectionOverlayInfo));
    }

    private long a(com.tencent.map.lib.models.GLModelInfo gLModelInfo) {
        return ((java.lang.Long) a((com.tencent.map.tools.CallbackRunnable<com.tencent.mapsdk.internal.tk.AnonymousClass86>) new com.tencent.mapsdk.internal.tk.AnonymousClass86(gLModelInfo), (com.tencent.mapsdk.internal.tk.AnonymousClass86) 0L)).longValue();
    }

    private void a(long j17, com.tencent.map.lib.models.GLModelInfo gLModelInfo) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass87(j17, gLModelInfo));
    }

    private void a(long j17, int i17, float f17, boolean z17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass88(j17, i17, f17, z17));
    }

    private void a(long j17, int i17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass96(j17, i17));
    }

    private void a(long j17, float f17, float f18, float f19) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass97(j17, f17, f18, f19));
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, float f17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass99(lightColor, f17));
    }

    private void a(com.tencent.tencentmap.mapsdk.maps.model.LightType lightType, com.tencent.tencentmap.mapsdk.maps.model.LightColor lightColor, com.tencent.tencentmap.mapsdk.maps.model.LightDirection lightDirection, float f17) {
        a(new com.tencent.mapsdk.internal.tk.AnonymousClass100(lightType, lightColor, lightDirection, f17));
    }

    public final void a(final com.tencent.tencentmap.mapsdk.maps.model.TrafficStyle trafficStyle) {
        a(new com.tencent.mapsdk.internal.ne.a() { // from class: com.tencent.mapsdk.internal.tk.102
            @Override // com.tencent.mapsdk.internal.ne.a
            public final void a(javax.microedition.khronos.opengles.GL10 gl10) {
                if (com.tencent.mapsdk.internal.tk.this.f51661e == 0) {
                    return;
                }
                com.tencent.mapsdk.internal.tk tkVar = com.tencent.mapsdk.internal.tk.this;
                tkVar.f51660d.setTrafficStyle(tkVar.f51661e, trafficStyle);
            }
        });
    }

    private com.tencent.tencentmap.mapsdk.maps.model.CameraPosition a(android.graphics.RectF rectF, android.graphics.RectF rectF2, float f17, float f18) {
        if (this.f51661e == 0) {
            return null;
        }
        return this.f51660d.nativeCalcMapOverLook(this.f51661e, rectF, rectF2, f17, f18);
    }

    public final void a(java.lang.String str, byte[] bArr) {
        if (this.f51661e == 0) {
            return;
        }
        this.f51660d.nativeWriteMapDataBlock(this.f51661e, str, bArr);
    }

    @Override // com.tencent.mapsdk.internal.bq
    public final void a(java.lang.String str) {
        this.f51671y = str;
    }

    @Override // com.tencent.mapsdk.internal.bq
    public final java.lang.String a() {
        java.lang.String str = this.f51671y;
        this.f51671y = null;
        return str;
    }

    @Override // com.tencent.mapsdk.internal.pe
    public final void a(float f17, float f18, long j17, java.lang.String str, java.lang.String str2) {
        android.util.Pair<com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay, com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject> pair;
        com.tencent.tencentmap.mapsdk.maps.TencentMap.OnVectorOverlayClickListener onVectorOverlayClickListener;
        com.tencent.mapsdk.internal.ne neVar = this.f51666j;
        if (neVar != null) {
            if (j17 > 0) {
                com.tencent.tencentmap.mapsdk.maps.model.LatLng fromScreenLocation = neVar.f50513m.fromScreenLocation(new android.graphics.Point((int) f17, (int) f18));
                com.tencent.mapsdk.internal.nh<?> nhVar = neVar.f50510j.f48965e.get(com.tencent.mapsdk.internal.nr.class);
                if (nhVar != null) {
                    pair = nhVar.a(fromScreenLocation, j17, str, str2);
                } else {
                    pair = new android.util.Pair<>(null, null);
                }
                java.lang.Object obj = pair.first;
                if (obj != null && (onVectorOverlayClickListener = neVar.L) != null) {
                    onVectorOverlayClickListener.onClicked((com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay) obj, (com.tencent.tencentmap.mapsdk.maps.TencentMap.IClickedObject) pair.second);
                }
            } else {
                neVar.M.b(f17, f18);
            }
            neVar.M = null;
        }
    }

    private static void a(double[] dArr, double d17, double d18) {
        for (int i17 = 0; i17 < 4; i17++) {
            int i18 = i17 + 0;
            int i19 = i18 + 12;
            dArr[i19] = dArr[i19] + (dArr[i18] * d17) + (dArr[i18 + 4] * d18) + (dArr[i18 + 8] * 0.0d);
        }
    }

    public final void a(final com.tencent.mapsdk.internal.ne.a aVar) {
        if (this.f51666j == null || this.f51661e == 0) {
            return;
        }
        c((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<java.lang.Object>>) new com.tencent.map.tools.CallbackRunnable<java.lang.Object>() { // from class: com.tencent.mapsdk.internal.tk.105
            @Override // com.tencent.map.tools.CallbackRunnable
            public final java.lang.Object run() {
                aVar.a(null);
                return null;
            }
        }, (com.tencent.map.tools.CallbackRunnable<java.lang.Object>) null);
    }

    public final <T> T a(com.tencent.map.tools.CallbackRunnable<T> callbackRunnable, T t17) {
        if (this.f51666j != null && this.f51661e != 0) {
            try {
                return (T) b((com.tencent.map.tools.CallbackRunnable<com.tencent.map.tools.CallbackRunnable<T>>) callbackRunnable, (com.tencent.map.tools.CallbackRunnable<T>) t17);
            } catch (java.lang.Exception e17) {
                com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50206g, "safeCallSyncEngine", e17);
            }
        }
        return t17;
    }

    @Override // com.tencent.mapsdk.internal.pc
    public final void a(int[] iArr, int[] iArr2) {
        com.tencent.mapsdk.core.utils.log.LogUtil.b("Marker", "dispatchMarkerCollisionChanged hidden = " + java.util.Arrays.toString(iArr) + " shown = " + java.util.Arrays.toString(iArr2));
        if (iArr == null && iArr2 == null) {
            return;
        }
        java.util.List<com.tencent.tencentmap.mapsdk.maps.model.Marker> b17 = this.f51666j.f50497J.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.tencentmap.mapsdk.maps.model.Marker> it = b17.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.av avVar = (com.tencent.mapsdk.internal.av) it.next();
            if (!avVar.f48864b.n()) {
                arrayList.add(avVar.f48864b);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mapsdk.internal.an) it6.next()).a(iArr, iArr2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ int a(com.tencent.mapsdk.internal.tk r13, com.tencent.mapsdk.internal.qv r14) {
        /*
            com.tencent.mapsdk.internal.fy r0 = r14.f51071b
            int r1 = r0.C
            r2 = 3
            r3 = 1
            r4 = 0
            if (r1 != r2) goto Lc
            r9 = r3
            r1 = r4
            goto Ld
        Lc:
            r9 = r4
        Ld:
            int[] r2 = r14.f51073p
            r2 = r2[r4]
            r5 = 33
            if (r2 != r5) goto L18
            r1 = 2
            r8 = r1
            goto L1f
        L18:
            r5 = 20
            r8 = r1
            if (r2 != r5) goto L1f
            r10 = r3
            goto L20
        L1f:
            r10 = r4
        L20:
            int[] r1 = new int[r4]
            java.util.List<java.lang.Integer> r0 = r0.L
            if (r0 == 0) goto L4c
            int r0 = r0.size()
            int[] r0 = new int[r0]
            r1 = r4
        L2d:
            com.tencent.mapsdk.internal.fy r2 = r14.f51071b
            java.util.List<java.lang.Integer> r2 = r2.L
            int r2 = r2.size()
            if (r1 >= r2) goto L4a
            com.tencent.mapsdk.internal.fy r2 = r14.f51071b
            java.util.List<java.lang.Integer> r2 = r2.L
            java.lang.Object r2 = r2.get(r1)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0[r1] = r2
            int r1 = r1 + 1
            goto L2d
        L4a:
            r12 = r0
            goto L4d
        L4c:
            r12 = r1
        L4d:
            int[] r0 = new int[r4]
            com.tencent.mapsdk.internal.fy r1 = r14.f51071b
            int[] r1 = r1.f49520t
            if (r1 == 0) goto L66
            int r0 = r1.length
            int[] r0 = new int[r0]
        L58:
            com.tencent.mapsdk.internal.fy r1 = r14.f51071b
            int[] r1 = r1.f49520t
            int r2 = r1.length
            if (r4 >= r2) goto L66
            r1 = r1[r4]
            r0[r4] = r1
            int r4 = r4 + 1
            goto L58
        L66:
            r11 = r0
            com.tencent.mapsdk.internal.tk$128 r0 = new com.tencent.mapsdk.internal.tk$128
            r5 = r0
            r6 = r13
            r7 = r14
            r5.<init>(r7, r8, r9, r10, r11, r12)
            r14 = -1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object r13 = r13.c(r0, r14)
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.tk.a(com.tencent.mapsdk.internal.tk, com.tencent.mapsdk.internal.qv):int");
    }
}
