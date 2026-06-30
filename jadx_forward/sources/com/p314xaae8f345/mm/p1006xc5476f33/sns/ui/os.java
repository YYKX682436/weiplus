package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public abstract class os {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f251654a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f251655b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f251656c;

    static {
        new java.util.HashMap();
        f251654a = new java.util.HashMap();
        f251655b = new java.util.HashMap();
        f251656c = new java.util.HashMap();
    }

    public static java.lang.String a(android.content.Context context, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j17);
        boolean z17 = false;
        boolean z18 = calendar.get(1) == calendar2.get(1);
        boolean z19 = z18 && calendar.get(2) == calendar2.get(2);
        boolean z27 = z18 && z19 && calendar.get(5) == calendar2.get(5);
        boolean z28 = z18 && z19 && calendar.get(5) - 1 == calendar2.get(5);
        if (!z28) {
            if ((z18 && calendar.get(2) - 1 == calendar2.get(2)) || calendar.get(1) - calendar2.get(1) == 1) {
                calendar.add(5, -1);
                if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
                    z17 = true;
                }
                z28 = z17;
            }
        }
        if (z27) {
            java.lang.String str = (java.lang.String) c(context, j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str;
        }
        if (z28) {
            java.lang.String str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi) + " " + ((java.lang.String) c(context, j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str2;
        }
        java.lang.String str3 = (java.lang.String) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17);
        if (str3.indexOf("-") > 0) {
            int i17 = calendar2.get(2) + 1;
            str3 = calendar2.get(5) + " " + e(context, i17);
            if (!z18) {
                str3 = str3 + " " + calendar2.get(1);
            }
        }
        java.lang.String str4 = str3 + " " + ((java.lang.String) c(context, j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInDetail", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return str4;
    }

    public static synchronized java.lang.String b(android.content.Context context, long j17) {
        synchronized (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.class) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
            if (j17 < 3600000) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return "";
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            java.util.HashMap hashMap = f251655b;
            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                if (timeInMillis - ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() < 60000) {
                    java.util.HashMap hashMap2 = f251656c;
                    if (hashMap2.containsKey(java.lang.Long.valueOf(j17))) {
                        java.lang.String str = (java.lang.String) hashMap2.get(java.lang.Long.valueOf(j17));
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                        return str;
                    }
                } else {
                    hashMap.remove(java.lang.Long.valueOf(j17));
                }
            }
            long j18 = timeInMillis - j17;
            if (j18 / 3600000 == 0) {
                int i17 = (int) (j18 / 60000);
                if (i17 < 1) {
                    i17 = 1;
                }
                java.lang.String quantityString = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571207k, i17, java.lang.Integer.valueOf(i17));
                f251656c.put(java.lang.Long.valueOf(j17), quantityString);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return quantityString;
            }
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis2 = j17 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis2 > 0 && timeInMillis2 <= 86400000) {
                int i18 = (int) (j18 / 3600000);
                if (i18 < 1) {
                    i18 = 1;
                }
                java.lang.String quantityString2 = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571206j, i18, java.lang.Integer.valueOf(i18));
                f251656c.put(java.lang.Long.valueOf(j17), quantityString2);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return quantityString2;
            }
            long timeInMillis3 = (j17 - gregorianCalendar2.getTimeInMillis()) + 86400000;
            if (timeInMillis3 > 0 && timeInMillis3 <= 86400000) {
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
                f251656c.put(java.lang.Long.valueOf(j17), string);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                return string;
            }
            int timeInMillis4 = (int) (((gregorianCalendar2.getTimeInMillis() + 86400000) - j17) / 86400000);
            if (timeInMillis4 < 1) {
                timeInMillis4 = 1;
            }
            java.lang.String quantityString3 = context.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571208l, timeInMillis4, java.lang.Integer.valueOf(timeInMillis4));
            f251656c.put(java.lang.Long.valueOf(j17), quantityString3);
            hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(timeInMillis));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatSnsTimeInTimeLine", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return quantityString3;
        }
    }

    public static java.lang.CharSequence c(android.content.Context context, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromatSnsTime24", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.lang.CharSequence format = android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcv), j17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromatSnsTime24", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return format;
    }

    public static java.lang.String d(android.content.Context context, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTimeInMillis(j17);
        boolean z17 = false;
        boolean z18 = calendar.get(1) == calendar2.get(1);
        boolean z19 = z18 && calendar.get(2) == calendar2.get(2);
        boolean z27 = z18 && z19 && calendar.get(5) == calendar2.get(5);
        boolean z28 = z18 && z19 && calendar.get(5) - 1 == calendar2.get(5);
        if (!z28) {
            if ((z18 && calendar.get(2) - 1 == calendar2.get(2)) || calendar.get(1) - calendar2.get(1) == 1) {
                calendar.add(5, -1);
                if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
                    z17 = true;
                }
                z28 = z17;
            }
        }
        if (z27) {
            java.lang.String str = (java.lang.String) c(context, j17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str;
        }
        if (z28) {
            java.lang.String str2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi) + " " + ((java.lang.String) c(context, j17));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return str2;
        }
        java.lang.String str3 = z18 ? (java.lang.String) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), j17) : (java.lang.String) android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fcl), j17);
        if (str3.indexOf("-") > 0) {
            int i17 = calendar2.get(2) + 1;
            str3 = calendar2.get(5) + " " + e(context, i17);
            if (!z18) {
                str3 = str3 + " " + calendar2.get(1);
            }
        }
        java.lang.String str4 = str3 + " " + ((java.lang.String) c(context, j17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromatSnsTimeInGallery", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return str4;
    }

    public static java.lang.String e(android.content.Context context, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.lang.String[] stringArray = context.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559563af);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("");
        for (java.lang.String str : stringArray) {
            arrayList.add(str);
        }
        if (i17 >= arrayList.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return "";
        }
        java.lang.String str2 = (java.lang.String) arrayList.get(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return str2;
    }

    public static int f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getYear", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        int i17 = new java.util.GregorianCalendar().get(1);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getYear", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return i17;
    }

    public static void g(android.content.Context context, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.lang.String[] stringArray = context.getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559563af);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("");
        for (java.lang.String str2 : stringArray) {
            arrayList.add(str2);
        }
        ((java.util.HashMap) f251654a).put(str, arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
    }

    public static boolean h(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        int i17 = gregorianCalendar.get(7) - 1;
        if (i17 == 0) {
            i17 = 7;
        }
        long timeInMillis = gregorianCalendar2.getTimeInMillis() - (i17 * 86400000);
        long timeInMillis2 = gregorianCalendar2.getTimeInMillis() + ((7 - i17) * 86400000);
        if (j17 < timeInMillis || j17 >= timeInMillis2) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isThisWeek", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return true;
    }

    public static boolean i(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        long timeInMillis = j17 - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        if (timeInMillis <= 0 || timeInMillis > 86400000) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isToday", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        return true;
    }
}
