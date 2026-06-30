package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes4.dex */
public final class c4 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c4 f149075a = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c4();

    @Override // r.a
    /* renamed from: apply */
    public java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.add(14, java.util.TimeZone.getDefault().getOffset(calendar.getTimeInMillis()));
        return new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, java.util.Locale.getDefault()).format(new java.util.Date(longValue));
    }
}
