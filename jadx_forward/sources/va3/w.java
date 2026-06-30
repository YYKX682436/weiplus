package va3;

/* loaded from: classes15.dex */
public abstract class w {
    public static double[] a(double[] dArr) {
        if (dArr == null && dArr.length != 2) {
            return dArr;
        }
        double d17 = dArr[0];
        double d18 = dArr[1];
        if (d17 < 72.004d || d17 > 137.8347d || d18 < 0.8293d || d18 > 55.8271d) {
            return new double[]{d17, d18};
        }
        double d19 = d17 - 105.0d;
        double d27 = d18 - 35.0d;
        double d28 = d19 * 2.0d;
        double d29 = d19 * 0.1d;
        double d37 = d29 * d27;
        double sqrt = (d28 - 100.0d) + (d27 * 3.0d) + (d27 * 0.2d * d27) + d37 + (java.lang.Math.sqrt(java.lang.Math.abs(d19)) * 0.2d);
        double d38 = 6.0d * d19 * 3.141592653589793d;
        double d39 = d28 * 3.141592653589793d;
        double d47 = d27 * 3.141592653589793d;
        double sin = sqrt + ((((java.lang.Math.sin(d38) * 20.0d) + (java.lang.Math.sin(d39) * 20.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin(d47) * 20.0d) + (java.lang.Math.sin((d27 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin((d27 / 12.0d) * 3.141592653589793d) * 160.0d) + (java.lang.Math.sin(d47 / 30.0d) * 320.0d)) * 2.0d) / 3.0d);
        double sqrt2 = d19 + 300.0d + (d27 * 2.0d) + (d29 * d19) + d37 + (java.lang.Math.sqrt(java.lang.Math.abs(d19)) * 0.1d) + ((((java.lang.Math.sin(d38) * 20.0d) + (java.lang.Math.sin(d39) * 20.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin(d19 * 3.141592653589793d) * 20.0d) + (java.lang.Math.sin((d19 / 3.0d) * 3.141592653589793d) * 40.0d)) * 2.0d) / 3.0d) + ((((java.lang.Math.sin((d19 / 12.0d) * 3.141592653589793d) * 150.0d) + (java.lang.Math.sin((d19 / 30.0d) * 3.141592653589793d) * 300.0d)) * 2.0d) / 3.0d);
        double d48 = (d18 / 180.0d) * 3.141592653589793d;
        double sin2 = java.lang.Math.sin(d48);
        double d49 = 1.0d - ((0.006693421622965943d * sin2) * sin2);
        double sqrt3 = java.lang.Math.sqrt(d49);
        return new double[]{(d17 * 2.0d) - (d17 + ((sqrt2 * 180.0d) / (((6378245.0d / sqrt3) * java.lang.Math.cos(d48)) * 3.141592653589793d))), (d18 * 2.0d) - (d18 + ((sin * 180.0d) / ((6335552.717000426d / (d49 * sqrt3)) * 3.141592653589793d)))};
    }

    public static java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23) {
        if (c16279x64cea23.f226124m == null) {
            c16279x64cea23.f226124m = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<msg><location x=\"");
        sb6.append(c16279x64cea23.f226119e);
        sb6.append("\" y=\"");
        sb6.append(c16279x64cea23.f226120f);
        sb6.append("\" scale=\"");
        sb6.append(c16279x64cea23.f226121g);
        sb6.append("\" label=\"");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(c16279x64cea23.f226122h));
        sb6.append("\" poiname=\"");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(c16279x64cea23.f226124m));
        sb6.append("\" maptype=\"0\" poiid=\"");
        sb6.append(c16279x64cea23.f226127p);
        sb6.append("\" isFromPoiList=\"");
        sb6.append(c16279x64cea23.f226128q);
        sb6.append("\" poiCategoryTips=\"");
        java.lang.String str = c16279x64cea23.f226129r;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("\" poiBusinessHour=\"");
        java.lang.String str2 = c16279x64cea23.f226130s;
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append("\" poiPhone=\"");
        java.lang.String str3 = c16279x64cea23.f226131t;
        sb6.append(str3 != null ? str3 : "");
        sb6.append("\" poiPriceTips=\"");
        sb6.append(c16279x64cea23.f226132u);
        sb6.append("\" buildingId=\"");
        sb6.append(c16279x64cea23.f226133v);
        sb6.append("\" floorName=\"");
        sb6.append(c16279x64cea23.f226134w);
        sb6.append("\" /></msg>");
        return sb6.toString();
    }

    public static android.content.pm.PackageInfo c(android.content.Context context, java.lang.String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 1);
        } catch (android.content.ActivityNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MapUtil", e17, "", new java.lang.Object[0]);
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MapUtil", e18, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static boolean d(double d17, double d18) {
        return java.lang.Math.abs(d18) <= 180.0d && java.lang.Math.abs(d17) <= 90.0d;
    }
}
