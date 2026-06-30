package com.tencent.mm.feature.performance;

/* loaded from: classes4.dex */
public final class c4 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.feature.performance.c4 f67542a = new com.tencent.mm.feature.performance.c4();

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(14, java.util.TimeZone.getDefault().getOffset(calendar.getTimeInMillis()));
        return new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.util.Locale.getDefault()).format(new java.util.Date(longValue));
    }
}
