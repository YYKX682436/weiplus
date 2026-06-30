package bw3;

/* loaded from: classes10.dex */
public final class e {
    public boolean A;
    public int B;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Rect f24918h;

    /* renamed from: i, reason: collision with root package name */
    public int f24919i;

    /* renamed from: j, reason: collision with root package name */
    public float f24920j;

    /* renamed from: k, reason: collision with root package name */
    public float f24921k;

    /* renamed from: o, reason: collision with root package name */
    public int f24925o;

    /* renamed from: p, reason: collision with root package name */
    public int f24926p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24929s;

    /* renamed from: w, reason: collision with root package name */
    public float f24933w;

    /* renamed from: x, reason: collision with root package name */
    public float f24934x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Vibrator f24935y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f24936z;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f24911a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f24912b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final float[] f24913c = new float[2];

    /* renamed from: d, reason: collision with root package name */
    public final float[] f24914d = new float[4];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f24915e = new float[2];

    /* renamed from: f, reason: collision with root package name */
    public bw3.d f24916f = bw3.d.f24907d;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f24917g = new android.graphics.Matrix();

    /* renamed from: l, reason: collision with root package name */
    public float[] f24922l = new float[8];

    /* renamed from: m, reason: collision with root package name */
    public final float[] f24923m = new float[8];

    /* renamed from: n, reason: collision with root package name */
    public final float[] f24924n = new float[4];

    /* renamed from: q, reason: collision with root package name */
    public float f24927q = 10.0f;

    /* renamed from: r, reason: collision with root package name */
    public float f24928r = 0.1f;

    /* renamed from: t, reason: collision with root package name */
    public final bw3.c f24930t = bw3.c.f24904d;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f24931u = true;

    /* renamed from: v, reason: collision with root package name */
    public final float f24932v = 15.0f;

    public e() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        this.f24935y = (android.os.Vibrator) systemService;
        this.A = true;
        this.f24917g.setScale(1.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0408  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bw3.e.a(android.view.MotionEvent):boolean");
    }

    public final void b(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = this.f24911a;
        java.util.Iterator it = kz5.c0.g(arrayList).iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            java.util.ArrayList arrayList2 = this.f24912b;
            java.lang.Object obj = arrayList.get(b17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            arrayList2.set(b17, java.lang.Integer.valueOf(motionEvent.findPointerIndex(((java.lang.Number) obj).intValue())));
        }
    }

    public final float c() {
        float[] fArr = this.f24923m;
        float f17 = fArr[1];
        int length = fArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            float f18 = fArr[i17];
            int i19 = i18 + 1;
            if (i18 == 3) {
                f17 = java.lang.Math.max(f17, f18);
            } else if (i18 == 5) {
                f17 = java.lang.Math.max(f17, f18);
            } else if (i18 == 7) {
                f17 = java.lang.Math.max(f17, f18);
            }
            i17++;
            i18 = i19;
        }
        return f17;
    }

    public final float d() {
        float max;
        float[] fArr = this.f24923m;
        int i17 = 0;
        float f17 = fArr[0];
        int length = fArr.length;
        float f18 = f17;
        int i18 = 0;
        while (i17 < length) {
            float f19 = fArr[i17];
            int i19 = i18 + 1;
            if (i18 == 2) {
                max = java.lang.Math.max(f18, f19);
            } else if (i18 == 4) {
                max = java.lang.Math.max(f18, f19);
            } else if (i18 != 6) {
                i17++;
                i18 = i19;
            } else {
                max = java.lang.Math.max(f18, f19);
            }
            f18 = max;
            i17++;
            i18 = i19;
        }
        return f18;
    }

    public final float e() {
        float min;
        float[] fArr = this.f24923m;
        int i17 = 0;
        float f17 = fArr[0];
        int length = fArr.length;
        float f18 = f17;
        int i18 = 0;
        while (i17 < length) {
            float f19 = fArr[i17];
            int i19 = i18 + 1;
            if (i18 == 2) {
                min = java.lang.Math.min(f18, f19);
            } else if (i18 == 4) {
                min = java.lang.Math.min(f18, f19);
            } else if (i18 != 6) {
                i17++;
                i18 = i19;
            } else {
                min = java.lang.Math.min(f18, f19);
            }
            f18 = min;
            i17++;
            i18 = i19;
        }
        return f18;
    }

    public final float f() {
        float[] fArr = this.f24923m;
        float f17 = fArr[1];
        int length = fArr.length;
        int i17 = 0;
        int i18 = 0;
        while (i17 < length) {
            float f18 = fArr[i17];
            int i19 = i18 + 1;
            if (i18 == 3) {
                f17 = java.lang.Math.min(f17, f18);
            } else if (i18 == 5) {
                f17 = java.lang.Math.min(f17, f18);
            } else if (i18 == 7) {
                f17 = java.lang.Math.min(f17, f18);
            }
            i17++;
            i18 = i19;
        }
        return f17;
    }

    public final float g(android.graphics.Matrix matrix) {
        matrix.getValues(new float[9]);
        float atan2 = (float) (java.lang.Math.atan2(r0[1], r0[0]) * 57.29577951308232d);
        float f17 = this.f24934x;
        return (f17 >= -90.0f || atan2 <= 0.0f) ? (f17 <= 90.0f || atan2 >= 0.0f) ? atan2 : atan2 + com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1 : atan2 - com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
    }

    public final void h(android.graphics.Matrix m17) {
        kotlin.jvm.internal.o.g(m17, "m");
        this.f24917g.set(m17);
        this.f24917g.mapPoints(this.f24923m, this.f24922l);
        float e17 = e();
        float[] fArr = this.f24924n;
        fArr[0] = e17;
        fArr[1] = f();
        fArr[2] = d();
        fArr[3] = c();
    }

    public final void i(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = this.f24911a;
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = this.f24912b;
        if (size == 1) {
            this.f24916f = bw3.d.f24908e;
            java.lang.Object obj = arrayList2.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            float x17 = motionEvent.getX(((java.lang.Number) obj).intValue());
            float[] fArr = this.f24913c;
            fArr[0] = x17;
            java.lang.Object obj2 = arrayList2.get(0);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            fArr[1] = motionEvent.getY(((java.lang.Number) obj2).intValue());
            return;
        }
        if (arrayList.size() == 2) {
            this.f24916f = bw3.d.f24909f;
            if (this.f24930t == bw3.c.f24905e) {
                this.f24917g.mapPoints(this.f24915e, new float[]{this.f24926p / 2.0f, this.f24925o / 2.0f});
            }
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            this.f24917g.invert(matrix);
            b(motionEvent);
            java.lang.Object obj3 = arrayList2.get(0);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            if (((java.lang.Number) obj3).intValue() < motionEvent.getPointerCount()) {
                java.lang.Object obj4 = arrayList2.get(1);
                kotlin.jvm.internal.o.f(obj4, "get(...)");
                if (((java.lang.Number) obj4).intValue() < motionEvent.getPointerCount()) {
                    java.lang.Object obj5 = arrayList2.get(0);
                    kotlin.jvm.internal.o.f(obj5, "get(...)");
                    java.lang.Object obj6 = arrayList2.get(0);
                    kotlin.jvm.internal.o.f(obj6, "get(...)");
                    java.lang.Object obj7 = arrayList2.get(1);
                    kotlin.jvm.internal.o.f(obj7, "get(...)");
                    java.lang.Object obj8 = arrayList2.get(1);
                    kotlin.jvm.internal.o.f(obj8, "get(...)");
                    matrix.mapPoints(this.f24914d, new float[]{motionEvent.getX(((java.lang.Number) obj5).intValue()), motionEvent.getY(((java.lang.Number) obj6).intValue()), motionEvent.getX(((java.lang.Number) obj7).intValue()), motionEvent.getY(((java.lang.Number) obj8).intValue())});
                }
            }
        }
    }
}
