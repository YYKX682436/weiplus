package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public interface eu extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fn {

    /* loaded from: classes13.dex */
    public enum a {
        LEFT(0),
        RIGHT(1),
        BOTTOM(2),
        TOP(3);


        /* renamed from: e, reason: collision with root package name */
        public int f130946e;

        a(int i17) {
            this.f130946e = i17;
        }

        public static final com.tencent.mapsdk.internal.eu.a a(int i17) {
            if (i17 < 0 || i17 >= m36713xcee59d22().length) {
                i17 = 0;
            }
            return m36713xcee59d22()[i17];
        }
    }

    /* loaded from: classes13.dex */
    public enum b {
        LEFT_BOTTOM(0),
        CENTER_BOTTOM(4),
        RIGHT_BOTTOM(1),
        LEFT_TOP(3),
        CENTER_TOP(5),
        RIGHT_TOP(2);


        /* renamed from: g, reason: collision with root package name */
        public final int f130954g;

        b(int i17) {
            this.f130954g = i17;
        }

        public static com.tencent.mapsdk.internal.eu.b a(int i17) {
            if (i17 < 0 || i17 >= m36716xcee59d22().length) {
                i17 = 0;
            }
            com.tencent.mapsdk.internal.eu.b bVar = LEFT_BOTTOM;
            for (com.tencent.mapsdk.internal.eu.b bVar2 : m36716xcee59d22()) {
                if (bVar2.f130954g == i17) {
                    return bVar2;
                }
            }
            return bVar;
        }
    }

    android.graphics.Rect a();

    void a(com.tencent.mapsdk.internal.eu.b bVar);

    boolean a(android.view.ViewGroup viewGroup, android.os.Bundle bundle);

    void c();

    com.tencent.mapsdk.internal.eu.b d();
}
