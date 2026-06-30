package wh;

/* loaded from: classes8.dex */
public final class l0 implements wh.u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final wh.l0 f527358a = new wh.l0();

    @Override // wh.u0
    /* renamed from: apply */
    public java.lang.Object mo40854x58b836e(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(calendar, "calendar");
        calendar.add(14, timeZone.getOffset(calendar.getTimeInMillis()));
        return new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f, java.util.Locale.getDefault()).format(new java.util.Date(longValue));
    }
}
