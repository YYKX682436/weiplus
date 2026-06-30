package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes9.dex */
public abstract class w6 {
    public static java.lang.CharSequence a(android.content.Context context, long j17) {
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j17);
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar();
        gregorianCalendar2.setTimeInMillis(java.lang.System.currentTimeMillis());
        return gregorianCalendar2.get(1) == gregorianCalendar.get(1) ? gregorianCalendar2.get(6) == gregorianCalendar.get(6) ? i65.a.r(context, com.tencent.mm.R.string.cdq) : gregorianCalendar.get(6) - gregorianCalendar2.get(6) == 1 ? i65.a.r(context, com.tencent.mm.R.string.cdp) : k35.m1.d(context.getString(com.tencent.mm.R.string.cdo), j17 / 1000) : k35.m1.d(context.getString(com.tencent.mm.R.string.cbf), j17 / 1000);
    }

    public static java.lang.CharSequence b(android.content.Context context, int i17) {
        if (i17 <= 0) {
            return context.getString(com.tencent.mm.R.string.ccs, 0, 0);
        }
        return context.getString(com.tencent.mm.R.string.ccs, java.lang.Integer.valueOf(i17 / 60), java.lang.Integer.valueOf(i17 % 60));
    }

    public static java.lang.CharSequence c(android.content.Context context, long j17) {
        if (j17 < 3600000) {
            return "";
        }
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
        long timeInMillis = j17 - gregorianCalendar2.getTimeInMillis();
        if (timeInMillis > 0 && timeInMillis <= 86400000) {
            return context.getString(com.tencent.mm.R.string.fd_);
        }
        long timeInMillis2 = gregorianCalendar2.getTimeInMillis() - j17;
        if (timeInMillis2 > 0 && timeInMillis2 <= 86400000) {
            return context.getString(com.tencent.mm.R.string.fdi);
        }
        new java.util.GregorianCalendar().setTimeInMillis(j17);
        int timeInMillis3 = (int) ((gregorianCalendar.getTimeInMillis() - j17) / 86400000);
        int i17 = timeInMillis3 >= 1 ? timeInMillis3 : 1;
        return i17 > 30 ? android.text.format.DateFormat.format(context.getString(com.tencent.mm.R.string.cbf), j17) : context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489675l, i17, java.lang.Integer.valueOf(i17));
    }
}
