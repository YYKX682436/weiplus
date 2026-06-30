package o95;

/* loaded from: classes13.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final o95.e f425273d = new o95.e();

    public e() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            if (fp.h.a(31)) {
                android.telephony.TelephonyManager telephonyManager = o95.k.f425277e;
                if (telephonyManager != null) {
                    o95.k.f425276d.getClass();
                    o95.g gVar = (o95.g) ((jz5.n) o95.k.f425286q).mo141623x754a37bb();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(256);
                    arrayList.add(gVar);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(telephonyManager, arrayList.toArray(), "com/tencent/mm/telephony/feature/TelephonyFeatureService$1", "invoke", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                    telephonyManager.listen((android.telephony.PhoneStateListener) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue());
                    yj0.a.f(telephonyManager, "com/tencent/mm/telephony/feature/TelephonyFeatureService$1", "invoke", "()V", "android/telephony/TelephonyManager_EXEC_", "listen", "(Landroid/telephony/PhoneStateListener;I)V");
                }
            } else {
                android.telephony.TelephonyManager telephonyManager2 = o95.k.f425277e;
                if (telephonyManager2 != null) {
                    java.util.concurrent.Executor a17 = qo.q.f446854a.a("MicroMsg.TelephonyFeatureService.telephony", null);
                    o95.k.f425276d.getClass();
                    telephonyManager2.registerTelephonyCallback(a17, (o95.f) ((jz5.n) o95.k.f425287r).mo141623x754a37bb());
                }
                java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
                java.util.concurrent.Executor a18 = qo.q.f446854a.a("MicroMsg.TelephonyFeatureService.audio", null);
                o95.k.f425276d.getClass();
                ((android.media.AudioManager) systemService).addOnModeChangedListener(a18, (o95.f) ((jz5.n) o95.k.f425287r).mo141623x754a37bb());
            }
        } catch (java.lang.SecurityException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TelephonyFeatureService", "listen telephony failed cause %s", e17.getCause());
        }
        return jz5.f0.f384359a;
    }
}
