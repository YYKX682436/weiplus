package l85;

/* loaded from: classes8.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f398720a = true;

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f398721b = jz5.h.a(jz5.i.f384362d, l85.i1.f398719d);

    public static final void a(android.content.Intent intent) {
        java.lang.String format;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("ams_pull_up_proc");
            java.lang.String stringExtra2 = intent.getStringExtra("ams_pull_up_from");
            int intExtra = intent.getIntExtra("ams_pull_up_id", -1);
            long longExtra = intent.getLongExtra("ams_pull_up_time", -1L);
            if (longExtra <= 0) {
                format = java.lang.String.valueOf(longExtra);
            } else {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.add(14, java.util.TimeZone.getDefault().getOffset(calendar.getTimeInMillis()));
                format = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", java.util.Locale.getDefault()).format(new java.util.Date(longExtra));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessTracker", "#tagOfProcessIntent: " + stringExtra2 + '@' + intExtra + ", proc=" + stringExtra + ", time=" + format);
        }
    }

    public static final android.content.Intent b(java.lang.String caller, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(caller, "caller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (f398720a) {
            int andIncrement = ((java.util.concurrent.atomic.AtomicInteger) f398721b.mo141623x754a37bb()).getAndIncrement();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcessTracker", "#taggingProcessIntent: " + caller + '@' + andIncrement);
            intent.putExtra("ams_pull_up_proc", bm5.f1.a());
            intent.putExtra("ams_pull_up_from", caller);
            intent.putExtra("ams_pull_up_time", java.lang.System.currentTimeMillis());
            intent.putExtra("ams_pull_up_id", andIncrement);
        }
        return intent;
    }
}
