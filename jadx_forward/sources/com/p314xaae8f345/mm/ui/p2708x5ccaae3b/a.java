package com.p314xaae8f345.mm.ui.p2708x5ccaae3b;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a f290260c;

    /* renamed from: a, reason: collision with root package name */
    public final long f290261a;

    /* renamed from: b, reason: collision with root package name */
    public final long f290262b;

    public a() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(7, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        this.f290261a = calendar.getTimeInMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.set(5, 1);
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        this.f290262b = calendar2.getTimeInMillis();
        java.util.Calendar.getInstance().getTimeInMillis();
    }

    public static com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a e() {
        if (f290260c == null) {
            synchronized (com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a.class) {
                f290260c = new com.p314xaae8f345.mm.ui.p2708x5ccaae3b.a();
            }
        }
        return f290260c;
    }

    public long a(java.util.Date date) {
        if (date.getTime() >= this.f290261a) {
            return com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        if (date.getTime() >= this.f290262b) {
            return 9223372036854775806L;
        }
        return (date.getYear() * 100) + date.getMonth();
    }

    public long b(long j17) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(j17);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public java.lang.String c(java.util.Date date, android.content.Context context) {
        return date.getTime() >= this.f290261a ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxs) : date.getTime() >= this.f290262b ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxr) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bnc, java.lang.Integer.valueOf(date.getYear() + 1900), java.lang.Integer.valueOf(date.getMonth() + 1));
    }

    public java.lang.String d(java.util.Date date, android.content.Context context) {
        if (date.getTime() >= this.f290261a) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxs);
        }
        if (date.getTime() >= this.f290262b) {
            return context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jxr);
        }
        return (date.getYear() + 1900) + "/" + (date.getMonth() + 1);
    }
}
