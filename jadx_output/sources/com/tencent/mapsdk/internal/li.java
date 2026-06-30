package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class li {
    public static double a(double d17) {
        double d18 = d17 % 360.0d;
        if (d18 > 180.0d) {
            return d18 - 360.0d;
        }
        return d18 < -180.0d ? d18 + 360.0d : d18;
    }

    private static double b(double d17) {
        return (d17 * 3.141592653589793d) / 180.0d;
    }

    private static double c(double d17) {
        return (d17 * 180.0d) / 3.141592653589793d;
    }

    public static double a(double d17, double d18, double d19, double d27, double d28, double d29) {
        return ((((d18 - d27) * d28) + ((d19 - d17) * d29)) + (d17 * d27)) - (d19 * d18);
    }

    private static double[] b(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3) {
        double d17;
        double[] a17 = a(latLng2, latLng3);
        double d18 = 0.0d;
        if (java.lang.Double.isNaN(a17[0])) {
            d17 = latLng.latitude;
        } else {
            double d19 = a17[0];
            if (d19 == 0.0d) {
                d18 = Double.NaN;
                d17 = Double.NaN;
            } else {
                d18 = (-1.0d) / d19;
                d17 = latLng.latitude + ((1.0d / d19) * latLng.longitude);
            }
        }
        return new double[]{d18, d17};
    }

    private static boolean c(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3) {
        return (a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng2, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng3) - a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng2)) - a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng3) < 1.0E-6d;
    }

    private static double a(double d17, int i17) {
        try {
            return new java.math.BigDecimal(d17).setScale(i17, 4).doubleValue();
        } catch (java.lang.Exception unused) {
            return d17;
        }
    }

    private static float a(float f17, int i17) {
        try {
            return new java.math.BigDecimal(f17).setScale(i17, 4).floatValue();
        } catch (java.lang.Exception unused) {
            return f17;
        }
    }

    private static double c(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate2, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate3) {
        return java.lang.Math.atan((a(coordinate, coordinate2) / 2.0d) / a(coordinate3, coordinate, coordinate2)) * 2.0d;
    }

    private static android.graphics.PointF a(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4) {
        float f17 = pointF2.x;
        float f18 = pointF.x;
        if (f17 != f18) {
            float f19 = pointF4.x;
            float f27 = pointF3.x;
            if (f19 != f27) {
                float f28 = pointF2.y;
                float f29 = pointF.y;
                float f37 = (f28 - f29) / (f17 - f18);
                float f38 = pointF4.y;
                float f39 = pointF3.y;
                float f47 = (f38 - f39) / (f19 - f27);
                if (f37 == f47) {
                    return null;
                }
                float f48 = ((f39 * f19) - (f38 * f27)) / (f19 - f27);
                float f49 = (f48 - (((f29 * f17) - (f28 * f18)) / (f17 - f18))) / (f37 - f47);
                return new android.graphics.PointF(f49, (f47 * f49) + f48);
            }
        }
        return null;
    }

    private static double b(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate2) {
        return (coordinate.y() - coordinate2.y()) / (coordinate.x() - coordinate2.x());
    }

    public static double b(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate2, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate3) {
        return java.lang.Math.atan((a(coordinate, coordinate2) / 2.0d) / a(coordinate3, coordinate, coordinate2)) * 2.0d * a(coordinate, coordinate3);
    }

    private static double c(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate2) {
        return (java.lang.Math.atan((coordinate.y() - coordinate2.y()) / (coordinate.x() - coordinate2.x())) * 180.0d) / 3.141592653589793d;
    }

    private static android.graphics.Rect a(com.tencent.map.lib.models.GeoPoint geoPoint, android.graphics.Rect rect) {
        int max = java.lang.Math.max(java.lang.Math.abs(rect.left - geoPoint.getLongitudeE6()), java.lang.Math.abs(rect.right - geoPoint.getLongitudeE6()));
        int max2 = java.lang.Math.max(java.lang.Math.abs(rect.top - geoPoint.getLatitudeE6()), java.lang.Math.abs(rect.bottom - geoPoint.getLatitudeE6()));
        return new android.graphics.Rect(geoPoint.getLongitudeE6() - max2, geoPoint.getLatitudeE6() - max, geoPoint.getLongitudeE6() + max2, geoPoint.getLatitudeE6() + max);
    }

    private static android.graphics.Rect a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2) {
        if (geoPoint == null || geoPoint2 == null || geoPoint.equals(geoPoint2)) {
            return null;
        }
        int abs = java.lang.Math.abs(geoPoint.getLongitudeE6() - geoPoint2.getLongitudeE6());
        int abs2 = java.lang.Math.abs(geoPoint.getLatitudeE6() - geoPoint2.getLatitudeE6());
        return new android.graphics.Rect(geoPoint.getLongitudeE6() - abs, geoPoint.getLatitudeE6() - abs2, geoPoint.getLongitudeE6() + abs, geoPoint.getLatitudeE6() + abs2);
    }

    private static com.tencent.map.lib.models.GeoPoint a(com.tencent.map.lib.models.GeoPoint geoPoint, com.tencent.map.lib.models.GeoPoint geoPoint2, com.tencent.map.lib.models.GeoPoint geoPoint3) {
        int latitudeE6 = geoPoint2.getLatitudeE6() - geoPoint.getLatitudeE6();
        int longitudeE6 = geoPoint2.getLongitudeE6() - geoPoint.getLongitudeE6();
        if (latitudeE6 == 0 && longitudeE6 == 0) {
            return null;
        }
        double latitudeE62 = (((geoPoint3.getLatitudeE6() - geoPoint.getLatitudeE6()) * latitudeE6) + ((geoPoint3.getLongitudeE6() - geoPoint.getLongitudeE6()) * longitudeE6)) / ((latitudeE6 * latitudeE6) + (longitudeE6 * longitudeE6));
        if (latitudeE62 < 0.0d) {
            return new com.tencent.map.lib.models.GeoPoint(geoPoint);
        }
        if (latitudeE62 > 1.0d) {
            return new com.tencent.map.lib.models.GeoPoint(geoPoint2);
        }
        return new com.tencent.map.lib.models.GeoPoint(geoPoint.getLatitudeE6() + ((int) (latitudeE6 * latitudeE62)), geoPoint.getLongitudeE6() + ((int) (longitudeE6 * latitudeE62)));
    }

    private static double[] a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2) {
        double d17;
        double d18;
        if (java.lang.Math.abs(latLng.longitude - latLng2.longitude) < 1.0E-6d) {
            d18 = Double.NaN;
            d17 = Double.NaN;
        } else if (java.lang.Math.abs(latLng.latitude - latLng2.latitude) < 1.0E-6d) {
            double d19 = latLng.latitude;
            d18 = 0.0d;
            d17 = d19;
        } else {
            double d27 = latLng2.latitude;
            double d28 = latLng.latitude;
            double d29 = latLng2.longitude;
            double d37 = latLng.longitude;
            double d38 = (d27 - d28) / (d29 - d37);
            d17 = ((d29 * d28) - (d37 * d27)) / (d29 - d28);
            d18 = d38;
        }
        return new double[]{d18, d17};
    }

    public static double a(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate2, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate3) {
        double a17 = a(coordinate, coordinate2);
        double a18 = a(coordinate, coordinate3);
        double a19 = a(coordinate2, coordinate3);
        double d17 = a17 + a18;
        if (d17 == a19) {
            return 0.0d;
        }
        if (a19 <= 1.0E-6d) {
            return a17;
        }
        double d18 = a18 * a18;
        double d19 = a17 * a17;
        double d27 = a19 * a19;
        if (d18 >= d19 + d27) {
            return a17;
        }
        if (d19 >= d18 + d27) {
            return a18;
        }
        double d28 = (d17 + a19) / 2.0d;
        return (java.lang.Math.sqrt((((d28 - a17) * d28) * (d28 - a18)) * (d28 - a19)) * 2.0d) / a19;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3) {
        double d17;
        double d18;
        double[] a17 = a(latLng2, latLng3);
        if (java.lang.Double.isNaN(a17[0])) {
            d18 = latLng2.longitude;
            d17 = latLng.latitude;
        } else {
            double d19 = a17[0];
            if (d19 == 0.0d) {
                double d27 = latLng.longitude;
                double d28 = latLng2.latitude;
                d18 = d27;
                d17 = d28;
            } else {
                double d29 = d19 * d19;
                double d37 = latLng2.longitude;
                double d38 = latLng.latitude;
                double d39 = latLng2.latitude;
                double d47 = (((d29 * d37) + ((d38 - d39) * d19)) + latLng.longitude) / (d29 + 1.0d);
                d17 = (d19 * (d47 - d37)) + d39;
                d18 = d47;
            }
        }
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d17, d18);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LatLng a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, int i17) {
        double d17 = latLng2.longitude;
        double d18 = latLng.longitude;
        double d19 = d17 > d18 ? d18 - i17 : d18 + i17;
        double d27 = latLng2.latitude;
        double d28 = latLng.latitude;
        return new com.tencent.tencentmap.mapsdk.maps.model.LatLng(d27 > d28 ? d28 - i17 : d28 + i17, d19);
    }

    public static double a(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate2) {
        double x17 = coordinate.x() - coordinate2.x();
        double y17 = coordinate.y() - coordinate2.y();
        return java.lang.Math.sqrt((x17 * x17) + (y17 * y17));
    }

    public static boolean a(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, double d17, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng2, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng3) {
        if (a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng2, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng3) - d17 > 1.0E-6d) {
            return false;
        }
        com.tencent.tencentmap.mapsdk.maps.model.LatLng a17 = a(latLng, latLng2, latLng3);
        return (a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng2, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng3) - a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) a17, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng2)) - a((com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) a17, (com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate) latLng3) < 1.0E-6d;
    }

    private static java.lang.String a() {
        byte[] bArr = new byte[20];
        new java.security.SecureRandom().nextBytes(bArr);
        return new java.lang.String(bArr);
    }

    private static int a(int i17) {
        int i18 = i17 - 0;
        if (i18 > 0) {
            return new java.security.SecureRandom().nextInt(i18) + 0;
        }
        return 0;
    }

    public static java.lang.String a(java.lang.String str) {
        return android.text.TextUtils.isEmpty(str) ? str : com.tencent.map.tools.Util.getMD5String(str.getBytes());
    }

    public static java.lang.String a(java.io.File file) {
        int i17;
        java.io.FileInputStream fileInputStream = null;
        try {
            java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
                byte[] bArr = new byte[10485760];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                java.lang.String bigInteger = new java.math.BigInteger(1, messageDigest.digest()).toString(16);
                int length = 40 - bigInteger.length();
                if (length > 0) {
                    for (i17 = 0; i17 < length; i17++) {
                        bigInteger = "0".concat(java.lang.String.valueOf(bigInteger));
                    }
                }
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) fileInputStream2);
                return bigInteger;
            } catch (java.io.IOException | java.security.NoSuchAlgorithmException unused) {
                fileInputStream = fileInputStream2;
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) fileInputStream);
                return "";
            } catch (java.lang.Throwable th6) {
                th = th6;
                fileInputStream = fileInputStream2;
                com.tencent.mapsdk.internal.kt.a((java.io.Closeable) fileInputStream);
                throw th;
            }
        } catch (java.io.IOException | java.security.NoSuchAlgorithmException unused2) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static double a(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate2, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate3, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate4) {
        double x17 = (coordinate2.x() - coordinate.x()) * 2.0d;
        double y17 = (coordinate2.y() - coordinate.y()) * 2.0d;
        double x18 = (((coordinate2.x() * coordinate2.x()) + (coordinate2.y() * coordinate2.y())) - (coordinate.x() * coordinate.x())) - (coordinate.y() * coordinate.y());
        double x19 = (coordinate3.x() - coordinate2.x()) * 2.0d;
        double y18 = (coordinate3.y() - coordinate2.y()) * 2.0d;
        double x27 = (((coordinate3.x() * coordinate3.x()) + (coordinate3.y() * coordinate3.y())) - (coordinate2.x() * coordinate2.x())) - (coordinate2.y() * coordinate2.y());
        double d17 = (x18 * y18) - (x27 * y17);
        double d18 = (y18 * x17) - (y17 * x19);
        double d19 = d17 / d18;
        double d27 = ((x17 * x27) - (x19 * x18)) / d18;
        coordinate4.setX(d19);
        coordinate4.setY(d27);
        return java.lang.Math.sqrt(java.lang.Math.pow(coordinate.x() - d19, 2.0d) + java.lang.Math.pow(coordinate.y() - d27, 2.0d));
    }

    public static double a(com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate2, double d17, boolean z17, com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate coordinate3) {
        double a17 = (a(coordinate, coordinate2) * 0.5d) / java.lang.Math.sin(b(0.5d * d17));
        double x17 = (coordinate.x() + coordinate2.x()) / 2.0d;
        double y17 = (coordinate.y() + coordinate2.y()) / 2.0d;
        double sqrt = java.lang.Math.sqrt((java.lang.Math.pow(a17, 2.0d) / (java.lang.Math.pow(coordinate.x() - coordinate2.x(), 2.0d) + java.lang.Math.pow(coordinate.y() - coordinate2.y(), 2.0d))) - 0.25d);
        double y18 = (coordinate.y() - coordinate2.y()) * sqrt;
        double x18 = (coordinate2.x() - coordinate.x()) * sqrt;
        if (d17 - 180.0d <= 1.0E-6d) {
            y18 = -y18;
            x18 = -x18;
        }
        if (java.lang.Double.isNaN(y18)) {
            y18 = 0.0d;
        }
        if (java.lang.Double.isNaN(x18)) {
            x18 = 0.0d;
        }
        double d18 = z17 ? x17 + y18 : x17 - y18;
        double d19 = z17 ? y17 + x18 : y17 - x18;
        coordinate3.setX(d18);
        coordinate3.setY(d19);
        return a17;
    }

    public static <T extends com.tencent.tencentmap.mapsdk.maps.interfaces.Coordinate> void a(T t17, double d17, T t18, T t19, boolean z17, com.tencent.map.tools.IndexCallback<android.util.Pair<java.lang.Double, java.lang.Double>> indexCallback) {
        double atan = (java.lang.Math.atan((t17.y() - t18.y()) / (t17.x() - t18.x())) * 180.0d) / 3.141592653589793d;
        boolean z18 = t17.x() > t18.x() ? !z17 : z17;
        int i17 = 0;
        double d18 = 0.0d;
        while (i17 < 360) {
            double d19 = i17;
            double tan = java.lang.Math.tan(b(z17 ? atan - d19 : d19 + atan));
            if (d18 != 0.0d && d18 * tan < 0.0d && java.lang.Math.abs(tan) > 1.0d) {
                z18 = !z18;
            }
            double sqrt = d17 / java.lang.Math.sqrt((tan * tan) + 1.0d);
            double d27 = tan * sqrt;
            com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50206g, i17 + ":curDeltaK[" + tan + "]deltaKChanged[" + z18 + "]clockwise[" + z17 + "]deltaX[" + sqrt + "]deltaY[" + d27 + "]");
            if (z18) {
                sqrt = -sqrt;
                d27 = -d27;
            }
            double x17 = t17.x();
            double d28 = z17 ? x17 - sqrt : x17 + sqrt;
            double y17 = t17.y();
            double d29 = z17 ? y17 - d27 : y17 + d27;
            double a17 = a(t18.x(), t18.y(), t19.x(), t19.y(), d28, d29);
            if (!z17 ? a17 < 0.0d : a17 > 0.0d) {
                indexCallback.callback(i17, new android.util.Pair<>(java.lang.Double.valueOf(d28), java.lang.Double.valueOf(d29)));
            }
            i17++;
            d18 = tan;
        }
    }
}
