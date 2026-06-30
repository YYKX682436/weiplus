package nh5;

/* renamed from: nh5.f0$$d */
/* loaded from: classes12.dex */
public final /* synthetic */ class C29208x5b3bb1a implements r.a {
    @Override // r.a
    /* renamed from: apply */
    public final java.lang.Object mo1850x58b836e(java.lang.Object obj) {
        java.lang.Long l17 = (java.lang.Long) obj;
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        long days = timeUnit.toDays(l17.longValue());
        java.lang.Long valueOf = java.lang.Long.valueOf(l17.longValue() - java.util.concurrent.TimeUnit.DAYS.toMillis(days));
        long hours = timeUnit.toHours(valueOf.longValue());
        java.lang.Long valueOf2 = java.lang.Long.valueOf(valueOf.longValue() - java.util.concurrent.TimeUnit.HOURS.toMillis(hours));
        long minutes = timeUnit.toMinutes(valueOf2.longValue());
        return days + "-" + hours + ":" + minutes + ":" + timeUnit.toSeconds(java.lang.Long.valueOf(valueOf2.longValue() - java.util.concurrent.TimeUnit.MINUTES.toMillis(minutes)).longValue());
    }
}
