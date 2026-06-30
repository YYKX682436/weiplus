package org.p3363xbe4143f1;

/* loaded from: classes13.dex */
abstract class c {

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        int f429360a;

        /* renamed from: b, reason: collision with root package name */
        int f429361b;

        /* renamed from: c, reason: collision with root package name */
        long f429362c;

        /* renamed from: d, reason: collision with root package name */
        private org.p3363xbe4143f1.C29688x8aef3eee f429363d;

        public synchronized boolean a() {
            return this.f429363d != null;
        }

        public synchronized boolean b() {
            boolean z17;
            if (this.f429360a > 0) {
                z17 = this.f429361b > 0;
            }
            return z17;
        }

        public synchronized int c() {
            org.p3363xbe4143f1.C29688x8aef3eee c29688x8aef3eee;
            c29688x8aef3eee = this.f429363d;
            return c29688x8aef3eee == null ? 0 : c29688x8aef3eee.m154703x333fdfcc();
        }

        public synchronized void d() {
            org.p3363xbe4143f1.C29688x8aef3eee c29688x8aef3eee = this.f429363d;
            if (c29688x8aef3eee != null) {
                c29688x8aef3eee.m154705x41012807();
                this.f429363d = null;
            }
        }

        public synchronized void e() {
            d();
            this.f429360a = 0;
            this.f429361b = 0;
            this.f429362c = 0L;
        }

        public synchronized boolean a(int i17) {
            boolean z17;
            org.p3363xbe4143f1.C29688x8aef3eee c29688x8aef3eee = this.f429363d;
            if (c29688x8aef3eee != null) {
                z17 = c29688x8aef3eee.m154697xf68939af(i17);
            }
            return z17;
        }

        public synchronized boolean a(int i17, android.hardware.HardwareBuffer hardwareBuffer) {
            boolean z17;
            org.p3363xbe4143f1.C29688x8aef3eee c29688x8aef3eee = this.f429363d;
            if (c29688x8aef3eee != null && hardwareBuffer != null) {
                z17 = c29688x8aef3eee.m154704xbc40ed77(i17, hardwareBuffer);
            }
            return z17;
        }

        public synchronized boolean a(android.graphics.Bitmap bitmap, int i17) {
            boolean z17;
            org.p3363xbe4143f1.C29688x8aef3eee c29688x8aef3eee = this.f429363d;
            if (c29688x8aef3eee != null && bitmap != null) {
                z17 = c29688x8aef3eee.m154698xb6ae9793(bitmap, i17);
            }
            return z17;
        }

        public synchronized boolean a(org.p3363xbe4143f1.C29687x78413754 c29687x78413754, int i17, int i18, float f17) {
            float f18;
            int m154680xb7389127;
            if (c29687x78413754 == null || i17 <= 0 || i18 <= 0 || f17 <= 0.0f) {
                return false;
            }
            if (c29687x78413754.m154689x6be2dc6() >= c29687x78413754.m154680xb7389127()) {
                f18 = i17 * 1.0f;
                m154680xb7389127 = c29687x78413754.m154689x6be2dc6();
            } else {
                f18 = i18 * 1.0f;
                m154680xb7389127 = c29687x78413754.m154680xb7389127();
            }
            org.p3363xbe4143f1.C29688x8aef3eee m154692x247a0e = org.p3363xbe4143f1.C29688x8aef3eee.m154692x247a0e(c29687x78413754, f17, f18 / m154680xb7389127);
            this.f429363d = m154692x247a0e;
            this.f429360a = m154692x247a0e.m154706x6be2dc6();
            this.f429361b = this.f429363d.m154702xb7389127();
            this.f429362c = c29687x78413754.m154837x89444d94();
            return true;
        }
    }

    public static double a(int i17, int i18) {
        if (i18 <= 1 || i17 < 0) {
            return 0.0d;
        }
        if (i17 >= i18 - 1) {
            return 1.0d;
        }
        return ((i17 * 1.0d) + 0.1d) / i18;
    }

    public static android.graphics.Matrix a(int i17, int i18, int i19, int i27, int i28) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (i17 != 0 && i18 > 0 && i19 > 0 && i27 > 0 && i28 > 0) {
            float f17 = i27;
            float f18 = i18;
            float f19 = (f17 * 1.0f) / f18;
            float f27 = i28;
            float f28 = i19;
            float f29 = (1.0f * f27) / f28;
            if (i17 == 1) {
                matrix.setScale(f19, f29);
            } else if (i17 != 3) {
                float min = java.lang.Math.min(f19, f29);
                matrix.setScale(min, min);
                if (f19 < f29) {
                    matrix.postTranslate(0.0f, (f27 - (f28 * min)) * 0.5f);
                } else {
                    matrix.postTranslate((f17 - (f18 * min)) * 0.5f, 0.0f);
                }
            } else {
                float max = java.lang.Math.max(f19, f29);
                matrix.setScale(max, max);
                if (f19 > f29) {
                    matrix.postTranslate(0.0f, (f27 - (f28 * max)) * 0.5f);
                } else {
                    matrix.postTranslate((f17 - (f18 * max)) * 0.5f, 0.0f);
                }
            }
        }
        return matrix;
    }

    private static double a(double d17, double d18) {
        return d17 - (((int) java.lang.Math.floor(d17 / d18)) * d18);
    }

    public static int a(double d17, int i17) {
        if (i17 <= 1) {
            return 0;
        }
        double a17 = a(d17, 1.0d);
        if (a17 <= 0.0d && d17 != 0.0d) {
            a17 += 1.0d;
        }
        int floor = (int) java.lang.Math.floor(a17 * i17);
        return floor == i17 ? i17 - 1 : floor;
    }
}
