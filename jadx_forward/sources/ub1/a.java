package ub1;

/* loaded from: classes13.dex */
public class a extends ub1.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f507542d;

    /* renamed from: e, reason: collision with root package name */
    public kd0.d3 f507543e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f507544f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f507545g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f507546h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f507547i;

    public a(ub1.e eVar, java.lang.String str) {
        super(eVar);
        ((jd0.w2) ((kd0.e3) i95.n0.c(kd0.e3.class))).getClass();
        zs5.a0 type = (zs5.a0) ((jz5.n) zs5.n0.f556984b).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        this.f507543e = new zs5.z();
        this.f507544f = new java.lang.Object();
        this.f507545g = false;
        this.f507542d = str;
    }

    public int[] a(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (str.contains("barcode")) {
            hashSet.add(1);
        }
        if (str.contains("qrcode")) {
            hashSet.add(2);
        }
        int[] iArr = new int[hashSet.size()];
        java.util.Iterator it = hashSet.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num != null) {
                iArr[i17] = num.intValue();
                i17++;
            }
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect b(android.graphics.Rect r10, android.graphics.Point r11, int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub1.a.b(android.graphics.Rect, android.graphics.Point, int, int, int, int):android.graphics.Rect");
    }

    public final void c(com.p314xaae8f345.p2891x34da02.C25303x87b156a3 c25303x87b156a3, int i17, int i18, int i19, int i27, int i28) {
        int i29;
        int i37;
        if (c25303x87b156a3 == null) {
            return;
        }
        if (i28 == 90 || i28 == 270) {
            i29 = i17;
            i37 = i18;
        } else {
            i37 = i17;
            i29 = i18;
        }
        float f17 = c25303x87b156a3.f296763x0;
        float f18 = c25303x87b156a3.f296764x1;
        float f19 = c25303x87b156a3.f296765x2;
        float f27 = c25303x87b156a3.f296766x3;
        float f28 = c25303x87b156a3.f296767y0;
        float f29 = c25303x87b156a3.f296768y1;
        float f37 = c25303x87b156a3.f296769y2;
        float f38 = c25303x87b156a3.f296770y3;
        int i38 = 360 - ((i28 * 2) % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3);
        if (i38 == 90) {
            float f39 = i37;
            c25303x87b156a3.f296763x0 = f39 - f27;
            c25303x87b156a3.f296764x1 = f39 - f17;
            c25303x87b156a3.f296765x2 = f39 - f18;
            c25303x87b156a3.f296766x3 = f39 - f19;
            c25303x87b156a3.f296767y0 = f38;
            c25303x87b156a3.f296768y1 = f28;
            c25303x87b156a3.f296769y2 = f29;
            c25303x87b156a3.f296770y3 = f37;
        } else if (i38 == 180) {
            float f47 = i37;
            c25303x87b156a3.f296763x0 = f47 - f19;
            c25303x87b156a3.f296764x1 = f47 - f27;
            c25303x87b156a3.f296765x2 = f47 - f17;
            c25303x87b156a3.f296766x3 = f47 - f18;
            float f48 = i29;
            c25303x87b156a3.f296767y0 = f48 - f37;
            c25303x87b156a3.f296768y1 = f48 - f38;
            c25303x87b156a3.f296769y2 = f48 - f28;
            c25303x87b156a3.f296770y3 = f48 - f29;
        } else if (i38 == 270) {
            c25303x87b156a3.f296763x0 = f18;
            c25303x87b156a3.f296764x1 = f19;
            c25303x87b156a3.f296765x2 = f27;
            c25303x87b156a3.f296766x3 = f17;
            float f49 = i29;
            c25303x87b156a3.f296767y0 = f49 - f29;
            c25303x87b156a3.f296768y1 = f49 - f37;
            c25303x87b156a3.f296769y2 = f49 - f38;
            c25303x87b156a3.f296770y3 = f49 - f28;
        }
        float max = java.lang.Math.max((i27 * 1.0f) / i29, (i19 * 1.0f) / i37);
        c25303x87b156a3.f296763x0 *= max;
        c25303x87b156a3.f296764x1 *= max;
        c25303x87b156a3.f296765x2 *= max;
        c25303x87b156a3.f296766x3 *= max;
        c25303x87b156a3.f296767y0 *= max;
        c25303x87b156a3.f296768y1 *= max;
        c25303x87b156a3.f296769y2 *= max;
        c25303x87b156a3.f296770y3 *= max;
    }
}
