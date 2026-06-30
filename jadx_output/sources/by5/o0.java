package by5;

/* loaded from: classes13.dex */
public class o0 {

    /* renamed from: a, reason: collision with root package name */
    public double f36576a;

    /* renamed from: b, reason: collision with root package name */
    public double f36577b;

    /* renamed from: c, reason: collision with root package name */
    public double f36578c = 1.0d;

    /* renamed from: d, reason: collision with root package name */
    public double[] f36579d = new double[0];

    public static by5.o0 b(java.lang.String str) {
        by5.o0 o0Var = new by5.o0();
        java.lang.String[] split = str.replace("(", "-").replace(")", "").split("-");
        if (split == null || split.length < 2) {
            by5.c4.c("TimeRange", "getTimeRange, length error");
            return null;
        }
        int i17 = 0;
        double b17 = by5.a0.b(split[0]);
        if (b17 < 0.0d || b17 > 24.0d) {
            by5.c4.c("TimeRange", "getTimeRange, bind.rangeFrom.timeStart parse error");
            return null;
        }
        o0Var.f36576a = b17;
        double b18 = by5.a0.b(split[1]);
        if (b18 < 0.0d || b18 > 24.0d) {
            by5.c4.c("TimeRange", "getTimeRange, bind.rangeFrom.timeEnd parse error");
            return null;
        }
        o0Var.f36577b = b18;
        if (split.length == 3) {
            by5.z d17 = by5.a0.d(split[2]);
            if (!d17.f36615a) {
                by5.c4.c("TimeRange", "getTimeRange, scale parse error");
                return null;
            }
            double a17 = d17.a();
            if (a17 < 0.0d || a17 > 1000000.0001d) {
                by5.c4.c("TimeRange", "getTimeRange, scale parse value error");
                return null;
            }
            o0Var.f36578c = a17;
        } else if (split.length > 3) {
            double[] dArr = new double[split.length - 2];
            while (true) {
                int i18 = i17 + 2;
                if (i18 >= split.length) {
                    o0Var.f36579d = dArr;
                    break;
                }
                by5.z d18 = by5.a0.d(split[i18]);
                if (!d18.f36615a) {
                    by5.c4.c("TimeRange", "getTimeRange, scales parse error");
                    return null;
                }
                double a18 = d18.a();
                if (a18 < 0.0d || a18 > 1000000.0001d) {
                    break;
                }
                dArr[i17] = a18;
                i17++;
            }
            by5.c4.c("TimeRange", "getTimeRange, scales parse value error");
            return null;
        }
        return o0Var;
    }

    public double a(double d17) {
        double d18 = this.f36576a;
        if (d17 < d18) {
            return 0.0d;
        }
        double d19 = this.f36577b;
        if (d17 > d19) {
            return 0.0d;
        }
        double[] dArr = this.f36579d;
        if (dArr == null || dArr.length == 0) {
            return this.f36578c;
        }
        int i17 = 0;
        if (dArr.length == 1) {
            return dArr[0];
        }
        if (d17 == d19) {
            return dArr[dArr.length - 1];
        }
        int length = dArr.length - 1;
        double d27 = (d19 - d18) / length;
        double d28 = d17 - d18;
        while (i17 < length) {
            int i18 = i17 + 1;
            double d29 = i17 * d27;
            if (d28 <= i18 * d27) {
                double[] dArr2 = this.f36579d;
                double d37 = dArr2[i17];
                return d37 + (((dArr2[i18] - d37) * (d28 - d29)) / d27);
            }
            i17 = i18;
        }
        double[] dArr3 = this.f36579d;
        return dArr3[dArr3.length - 1];
    }
}
