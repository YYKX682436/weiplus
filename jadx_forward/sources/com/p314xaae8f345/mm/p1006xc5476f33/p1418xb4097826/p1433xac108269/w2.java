package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes8.dex */
public abstract class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f184176a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f184177b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f184178c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f184179d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f184180e;

    static {
        new java.util.HashMap();
        f184177b = new java.util.HashMap();
        f184178c = new java.util.HashMap();
        f184179d = new java.util.HashMap();
        f184180e = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
    }

    public static java.lang.String a(int i17) {
        if (i17 > 999) {
            return "···";
        }
        return i17 + "";
    }

    public static java.lang.String b(android.content.Context context, long j17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        if (j17 < 3600000) {
            return "";
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis() - j17;
        int i17 = (int) (timeInMillis / 60000);
        if (i17 < 10) {
            return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2r);
        }
        int i18 = (int) (timeInMillis / 3600000);
        if (i18 == 0) {
            if (i17 < 1) {
                i17 = 1;
            }
            return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f87, java.lang.Integer.valueOf(i17));
        }
        if (i18 < 24) {
            if (i18 < 1) {
                i18 = 1;
            }
            return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f86, java.lang.Integer.valueOf(i18));
        }
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j17);
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1)) {
            return "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17));
        }
        return "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17));
    }

    public static java.lang.String c(int i17) {
        int i18 = i17 % 60;
        int i19 = i17 / 60;
        int i27 = i19 % 60;
        int i28 = i19 / 60;
        if (i28 == 0) {
            return j(i27) + ":" + j(i18);
        }
        return j(i28) + ":" + j(i27) + ":" + j(i18);
    }

    public static java.lang.String d(int i17) {
        if (i17 <= 0) {
            return "0";
        }
        if (i17 <= 999) {
            return java.lang.String.valueOf(i17);
        }
        java.lang.String str = f184180e;
        if (!str.equals("zh_CN") && !str.equals("zh_HK") && !str.equals("zh_TW")) {
            return i17 <= 100000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573491es3, java.lang.Double.valueOf(((i17 * 1.0f) / 1000.0f) - 0.05d)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ese, 100);
        }
        if (i17 <= 9999) {
            return java.lang.String.valueOf(i17);
        }
        if (i17 > 100000) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.es8, 10);
        }
        double doubleValue = new java.math.BigDecimal(((i17 * 1.0f) / 10000.0f) - 0.05d).setScale(1, java.math.RoundingMode.UP).doubleValue();
        return ((double) java.lang.Math.round(doubleValue)) - doubleValue == 0.0d ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.es6, java.lang.Integer.valueOf((int) java.lang.Math.round(doubleValue))) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573488es0, java.lang.Double.valueOf(doubleValue));
    }

    public static java.lang.String e(int i17, int i18) {
        if (i17 <= i18) {
            return java.lang.String.valueOf(i17);
        }
        return i18 + "+";
    }

    public static java.lang.String f(int i17) {
        if (i17 <= 0) {
            return "0";
        }
        java.lang.String str = f184180e;
        if (str.equals("zh_CN") || str.equals("zh_HK") || str.equals("zh_TW")) {
            if (i17 <= 9999) {
                return java.lang.String.valueOf(i17);
            }
            if (i17 >= 10000000) {
                return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.es8, 1000);
            }
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573493es5, new java.math.BigDecimal(i17 / 10000.0f).setScale(1, 4).stripTrailingZeros().toPlainString());
        }
        float f17 = i17;
        if (f17 < 1000.0f) {
            return java.lang.String.valueOf(i17);
        }
        if (f17 < 1000000.0f) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573492es4, new java.math.BigDecimal(f17 / 1000.0f).setScale(1, 4).stripTrailingZeros().toPlainString());
        }
        if (f17 >= 1.0E7f) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.esb, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573490es2, new java.math.BigDecimal(f17 / 1000000.0f).setScale(1, 4).stripTrailingZeros().toPlainString());
    }

    public static java.lang.String g(int i17, int i18) {
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        return i17 == 1 ? h(i18) : o(i18, false);
    }

    public static java.lang.String h(long j17) {
        if (j17 <= 0) {
            return "0";
        }
        if (j17 <= 999) {
            return java.lang.String.valueOf(j17);
        }
        java.lang.String str = f184180e;
        return (str.equals("zh_CN") || str.equals("zh_HK") || str.equals("zh_TW")) ? j17 <= 9999 ? java.lang.String.valueOf(j17) : j17 <= 99990000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573488es0, java.lang.Double.valueOf(((((float) j17) * 1.0f) / 10000.0f) - 0.05d)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.es9, 1) : j17 <= 990000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573491es3, java.lang.Double.valueOf(((((float) j17) * 1.0f) / 1000.0f) - 0.05d)) : j17 <= 99990000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573489es1, java.lang.Double.valueOf(((((float) j17) * 1.0f) / 1000000.0f) - 0.05d)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.es_, 100);
    }

    public static java.lang.String i(long j17) {
        if (j17 <= 0) {
            return "0";
        }
        java.lang.String str = f184180e;
        return (str.equals("zh_CN") || str.equals("zh_HK") || str.equals("zh_TW")) ? j17 <= 9999 ? java.lang.String.valueOf(j17) : j17 <= 99990000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573488es0, java.lang.Double.valueOf(((((float) j17) * 1.0f) / 10000.0f) - 0.05d)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.esc, java.lang.Double.valueOf((((((float) j17) * 1.0f) / 10000.0f) / 10000.0f) - 0.05d)) : j17 <= 999 ? java.lang.String.valueOf(j17) : j17 <= 990000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573491es3, java.lang.Double.valueOf(((((float) j17) * 1.0f) / 1000.0f) - 0.05d)) : j17 <= 990000000 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.esa, java.lang.Double.valueOf((((((float) j17) * 1.0f) / 1000.0f) / 1000.0f) - 0.05d)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.esf, java.lang.Double.valueOf(((((((float) j17) * 1.0f) / 10000.0f) / 10000.0f) / 10.0f) - 0.05d));
    }

    public static java.lang.String j(int i17) {
        if (i17 >= 10) {
            return java.lang.String.valueOf(i17);
        }
        return "0" + i17;
    }

    public static java.lang.String k(android.content.Context context, long j17) {
        if (j17 < 3600000) {
            return "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
        long j18 = currentTimeMillis / 3600000;
        if (j18 == 0) {
            int i17 = (int) (currentTimeMillis / 60000);
            return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f87, java.lang.Integer.valueOf(i17 >= 1 ? i17 : 1));
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis >= 0 && timeInMillis < 86400000) {
            int i18 = (int) j18;
            return context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f86, java.lang.Integer.valueOf(i18 >= 1 ? i18 : 1));
        }
        long timeInMillis2 = gregorianCalendar2.getTimeInMillis();
        long j19 = (j17 - timeInMillis2) + 2592000000L;
        int i19 = (int) (((timeInMillis2 + 86400000) - j17) / 86400000);
        if (j19 > 0 && i19 <= 30) {
            int i27 = i19 >= 1 ? i19 : 1;
            return context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571208l, i27, java.lang.Integer.valueOf(i27));
        }
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar();
        gregorianCalendar3.setTimeInMillis(j17);
        return gregorianCalendar.get(1) == gregorianCalendar3.get(1) ? android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17).toString() : android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17).toString();
    }

    public static java.lang.String l(android.content.Context context, long j17) {
        if (j17 < 3600000) {
            return "";
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.HashMap hashMap = f184177b;
        boolean containsKey = hashMap.containsKey(java.lang.Long.valueOf(j17));
        java.util.HashMap hashMap2 = f184178c;
        if (containsKey) {
            if (currentTimeMillis - ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() >= 60000) {
                hashMap.remove(java.lang.Long.valueOf(j17));
            } else if (hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
                return (java.lang.String) hashMap2.get(java.lang.Long.valueOf(j17));
            }
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis >= 0 && timeInMillis < 86400000) {
            int i17 = (int) ((currentTimeMillis - j17) / 3600000);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f86, java.lang.Integer.valueOf(i17 >= 1 ? i17 : 1));
            hashMap2.put(java.lang.Long.valueOf(j17), string);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
            return string;
        }
        long timeInMillis2 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
        if (timeInMillis2 > 0 && timeInMillis2 < 86400000) {
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
            hashMap2.put(java.lang.Long.valueOf(j17), string2);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
            return string2;
        }
        long timeInMillis3 = j17 - (gregorianCalendar2.getTimeInMillis() - 172800000);
        if (timeInMillis3 >= 0 && timeInMillis3 < 86400000) {
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573674fd2);
            hashMap2.put(java.lang.Long.valueOf(j17), string3);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
            return string3;
        }
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar();
        gregorianCalendar3.setTimeInMillis(j17);
        if (gregorianCalendar.get(1) == gregorianCalendar3.get(1)) {
            java.lang.String str = "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17));
            hashMap2.put(java.lang.Long.valueOf(j17), str);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
            return str;
        }
        java.lang.String str2 = "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17));
        hashMap2.put(java.lang.Long.valueOf(j17), str2);
        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(currentTimeMillis));
        return str2;
    }

    public static synchronized java.lang.String m(android.content.Context context, long j17, java.lang.Boolean bool) {
        java.lang.String quantityString;
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.class) {
            if (j17 < 3600000) {
                return "";
            }
            long a17 = c01.id.a();
            java.util.HashMap hashMap = f184177b;
            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                if (a17 - ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() < 60000) {
                    java.util.HashMap hashMap2 = f184178c;
                    if (hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
                        return (java.lang.String) hashMap2.get(java.lang.Long.valueOf(j17));
                    }
                } else {
                    hashMap.remove(java.lang.Long.valueOf(j17));
                }
            }
            long j18 = a17 - j17;
            if (j18 < 0 && j18 > -3600000) {
                j18 = 0;
            }
            if (j18 < 0) {
                java.lang.String str = "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17));
                f184178c.put(java.lang.Long.valueOf(j17), str);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17));
                return str;
            }
            if (j18 / 3600000 == 0) {
                int i17 = (int) (j18 / 60000);
                if (i17 < 1) {
                    i17 = 1;
                }
                java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f87, java.lang.Integer.valueOf(i17));
                f184178c.put(java.lang.Long.valueOf(j17), string);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17));
                return string;
            }
            if (j18 <= 86400000) {
                int i18 = (int) (j18 / 3600000);
                if (i18 < 1) {
                    i18 = 1;
                }
                java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f86, java.lang.Integer.valueOf(i18));
                f184178c.put(java.lang.Long.valueOf(j17), string2);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17));
                return string2;
            }
            if (j18 <= 172800000) {
                java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
                f184178c.put(java.lang.Long.valueOf(j17), string3);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17));
                return string3;
            }
            if (j18 <= 259200000) {
                java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573674fd2);
                f184178c.put(java.lang.Long.valueOf(j17), string4);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17));
                return string4;
            }
            if (j18 <= 2592000000L) {
                java.lang.String quantityString2 = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571208l, (int) (j18 / 86400000), java.lang.Integer.valueOf((int) (j18 / 86400000)));
                f184178c.put(java.lang.Long.valueOf(j17), quantityString2);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17));
                return quantityString2;
            }
            if (j18 <= 31536000000L) {
                java.lang.String quantityString3 = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571209m, (int) (j18 / 2592000000L), java.lang.Integer.valueOf((int) (j18 / 2592000000L)));
                f184178c.put(java.lang.Long.valueOf(j17), quantityString3);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17));
                return quantityString3;
            }
            if (bool.booleanValue()) {
                quantityString = "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17));
            } else {
                quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571210n, (int) (j18 / 31536000000L), java.lang.Integer.valueOf((int) (j18 / 31536000000L)));
            }
            f184178c.put(java.lang.Long.valueOf(j17), quantityString);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(a17));
            return quantityString;
        }
    }

    public static java.lang.String n(android.content.Context context, long j17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(j17);
        long j18 = timeInMillis - j17;
        long j19 = j18 / 3600000;
        java.util.HashMap hashMap = f184177b;
        java.util.HashMap hashMap2 = f184178c;
        if (j19 == 0) {
            int i17 = (int) (j18 / 60000);
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f87, java.lang.Integer.valueOf(i17 >= 1 ? i17 : 1));
            hashMap2.put(java.lang.Long.valueOf(j17), string);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return string;
        }
        java.util.GregorianCalendar gregorianCalendar3 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis2 = j17 - gregorianCalendar3.getTimeInMillis();
        if (timeInMillis2 >= 0 && timeInMillis2 < 86400000) {
            int i18 = (int) j19;
            java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f86, java.lang.Integer.valueOf(i18 >= 1 ? i18 : 1));
            hashMap2.put(java.lang.Long.valueOf(j17), string2);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return string2;
        }
        if (gregorianCalendar.get(6) == gregorianCalendar2.get(6) + 1) {
            java.lang.String string3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
            hashMap2.put(java.lang.Long.valueOf(j17), string3);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return string3;
        }
        if (gregorianCalendar.get(6) == gregorianCalendar2.get(6) + 2) {
            java.lang.String string4 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573674fd2);
            hashMap2.put(java.lang.Long.valueOf(j17), string4);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return string4;
        }
        long timeInMillis3 = gregorianCalendar3.getTimeInMillis();
        long j27 = (j17 - timeInMillis3) + 2592000000L;
        int i19 = (int) (((timeInMillis3 + 86400000) - j17) / 86400000);
        if (j27 > 0 && i19 <= 30) {
            int i27 = i19 >= 1 ? i19 : 1;
            java.lang.String quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571208l, i27, java.lang.Integer.valueOf(i27));
            hashMap2.put(java.lang.Long.valueOf(j17), quantityString);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return quantityString;
        }
        if (gregorianCalendar.get(1) == gregorianCalendar2.get(1)) {
            java.lang.String str = "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17));
            hashMap2.put(java.lang.Long.valueOf(j17), str);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            return str;
        }
        java.lang.String str2 = "" + ((java.lang.Object) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17));
        hashMap2.put(java.lang.Long.valueOf(j17), str2);
        hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
        return str2;
    }

    public static java.lang.String o(int i17, boolean z17) {
        if (i17 <= 0) {
            return "0";
        }
        int i18 = z17 ? 1000000 : 100000;
        if (i17 <= 999) {
            return java.lang.String.valueOf(i17);
        }
        java.lang.String str = f184180e;
        return (str.equals("zh_CN") || str.equals("zh_HK") || str.equals("zh_TW")) ? i17 <= 9999 ? java.lang.String.valueOf(i17) : i17 <= i18 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573488es0, java.lang.Double.valueOf(((i17 * 1.0f) / 10000.0f) - 0.05d)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.es8, 10) : i17 <= i18 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573491es3, java.lang.Double.valueOf(((i17 * 1.0f) / 1000.0f) - 0.05d)) : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ese, 100);
    }

    public static java.lang.CharSequence p(android.content.Context context, long j17) {
        return android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcv), j17);
    }

    public static java.lang.String q(android.content.Context context, int i17, java.lang.String str) {
        java.util.Map map = f184176a;
        if (((java.util.HashMap) map).get(str) == null) {
            r(context, str);
        }
        java.util.List list = (java.util.List) ((java.util.HashMap) map).get(str);
        if (i17 >= list.size() || list.get(i17) == null || ((java.lang.String) list.get(i17)).equals("")) {
            r(context, str);
        }
        java.util.List list2 = (java.util.List) ((java.util.HashMap) map).get(str);
        return i17 < list2.size() ? (java.lang.String) list2.get(i17) : "";
    }

    public static void r(android.content.Context context, java.lang.String str) {
        java.lang.String[] stringArray = context.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559562ae);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("");
        for (java.lang.String str2 : stringArray) {
            arrayList.add(str2);
        }
        ((java.util.HashMap) f184176a).put(str, arrayList);
    }

    public static java.lang.String s(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            str2 = "";
        }
        if (str == null || str.isEmpty()) {
            return str2;
        }
        if (!str.equals(c01.z1.r()) && !str.equals(g92.b.f351302e.U()) && !str.equals(c01.z1.k())) {
            return str2;
        }
        if (str2.isEmpty()) {
            return "**";
        }
        return str2.charAt(0) + "**";
    }
}
