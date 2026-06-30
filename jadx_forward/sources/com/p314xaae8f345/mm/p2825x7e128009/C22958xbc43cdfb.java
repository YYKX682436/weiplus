package com.p314xaae8f345.mm.p2825x7e128009;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0082 J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0005H\u0082 ¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/xeffect/FaceTracker;", "", "", "", "modelMap", "", "nInitWithMap", "([Ljava/lang/String;)J", "nPtr", "Ljava/nio/Buffer;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "", "width", "height", "nDetect", "", "nGetAlignments", "nGetFaceRect", "nGetFaceAngles", "nGetFaceRects", "nGetFacePartConf", "Ljz5/f0;", "nDestroy", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.tencent.mm.xeffect.FaceTracker */
/* loaded from: classes14.dex */
public final class C22958xbc43cdfb {

    /* renamed from: a, reason: collision with root package name */
    public final long f296321a;

    static {
        tq5.k.a("xlabeffect");
    }

    public C22958xbc43cdfb(java.util.Map modelMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(modelMap, "modelMap");
        this.f296321a = m83675x51329638(tq5.i.f502803b.a(modelMap));
    }

    /* renamed from: nDestroy */
    private final native void m83668x62cd7fac(long j17);

    /* renamed from: nDetect */
    private final native int m83669x34bc88b1(long nPtr, java.nio.Buffer data, int width, int height);

    /* renamed from: nGetAlignments */
    private final native float[] m83670xedc12518(long nPtr);

    /* renamed from: nGetFaceAngles */
    private final native float[] m83671x2e70f4e5(long nPtr);

    /* renamed from: nGetFacePartConf */
    private final native float[] m83672xcfae835c(long nPtr);

    /* renamed from: nGetFaceRect */
    private final native float[] m83673x4b332209(long nPtr);

    /* renamed from: nGetFaceRects */
    private final native float[] m83674x1b311f8a(long nPtr);

    /* renamed from: nInitWithMap */
    private final native long m83675x51329638(java.lang.String[] modelMap);

    public final void a() {
        long j17 = this.f296321a;
        if (j17 != 0) {
            m83668x62cd7fac(j17);
        }
    }

    public final int b(java.nio.Buffer data, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.h(data, "data");
        long j17 = this.f296321a;
        if (j17 != 0) {
            return m83669x34bc88b1(j17, data, i17, i18);
        }
        return -1;
    }

    public final java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] m83670xedc12518 = m83670xedc12518(this.f296321a);
        if (m83670xedc12518 != null) {
            int length = m83670xedc12518.length;
            if (length < 2) {
                com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.b("FaceTracker", "alignments data no face count", new java.lang.Object[0]);
            }
            int i17 = (int) m83670xedc12518[0];
            int i18 = (int) m83670xedc12518[1];
            if (length != (i17 * i18 * 2) + 2) {
                com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.b("FaceTracker", "alignments data size error, face:" + i17 + ", point:" + i18 + ", float:" + length, new java.lang.Object[0]);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                android.graphics.PointF[] pointFArr = new android.graphics.PointF[i18];
                for (int i27 = 0; i27 < i18; i27++) {
                    pointFArr[i27] = new android.graphics.PointF();
                }
                for (int i28 = 0; i28 < i18; i28++) {
                    android.graphics.PointF pointF = new android.graphics.PointF();
                    pointFArr[i28] = pointF;
                    int i29 = (i19 * i17) + (i28 * 2);
                    pointF.x = m83670xedc12518[i29 + 2];
                    pointF.y = m83670xedc12518[i29 + 3];
                }
                arrayList.add(pointFArr);
            }
        }
        return arrayList;
    }

    public final java.util.List d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] m83671x2e70f4e5 = m83671x2e70f4e5(this.f296321a);
        if (m83671x2e70f4e5 != null) {
            int length = m83671x2e70f4e5.length;
            if (length % 3 != 0) {
                com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.b("FaceTracker", "angles data size not match " + length, new java.lang.Object[0]);
            }
            int i17 = length / 3;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = i18 * 3;
                arrayList.add(new tq5.a(m83671x2e70f4e5[i19], m83671x2e70f4e5[i19 + 1], m83671x2e70f4e5[i19 + 2]));
            }
        }
        return arrayList;
    }

    public final java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] m83672xcfae835c = m83672xcfae835c(this.f296321a);
        if (m83672xcfae835c != null) {
            int length = m83672xcfae835c.length;
            if (length < 2) {
                com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.b("FaceTracker", "part conf data no face count", new java.lang.Object[0]);
                return arrayList;
            }
            int i17 = (int) m83672xcfae835c[0];
            int i18 = (int) m83672xcfae835c[1];
            if (length != (i17 * i18) + 2) {
                com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.b("FaceTracker", "part conf data size error, face:" + i17 + ", conf:" + i18 + ", float:" + length, new java.lang.Object[0]);
                return arrayList;
            }
            for (int i19 = 0; i19 < i17; i19++) {
                int i27 = (i19 * i17) + 2;
                arrayList.add(kz5.v.r(m83672xcfae835c, i27, i27 + i18));
            }
        }
        return arrayList;
    }

    public final java.util.List f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] m83674x1b311f8a = m83674x1b311f8a(this.f296321a);
        if (m83674x1b311f8a != null) {
            int length = m83674x1b311f8a.length;
            if (length % 4 != 0) {
                com.p314xaae8f345.mm.p2825x7e128009.C22977x1926be7b.b("FaceTracker", "rects data size not match " + length, new java.lang.Object[0]);
            }
            int i17 = length / 4;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = i18 * 4;
                float f17 = m83674x1b311f8a[i19];
                float f18 = m83674x1b311f8a[i19 + 1];
                arrayList.add(new android.graphics.RectF(f17, f18, m83674x1b311f8a[i19 + 2] + f17, m83674x1b311f8a[i19 + 3] + f18));
            }
        }
        return arrayList;
    }
}
