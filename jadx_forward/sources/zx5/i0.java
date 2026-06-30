package zx5;

/* loaded from: classes13.dex */
public class i0 implements zx5.m0 {
    public static void a() {
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateCancelled");
        d("finished", -2, 0);
        yu5.c.b(new zx5.f0());
    }

    public static void b() {
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateCompleted");
        d("finished", 0, 0);
        yu5.c.b(new zx5.h0());
    }

    public static void c(int i17) {
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateFailed, errorCode:" + i17);
        d("finished", -1, i17);
        yu5.c.b(new zx5.e0(i17));
    }

    public static void d(java.lang.String str, int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.xweb.update");
        intent.putExtra("stage", str);
        intent.putExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648, i17);
        intent.putExtra(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61547x802b75e4, i18);
        intent.putExtra("package_name", org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l());
        intent.setPackage(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l());
        android.content.Context context = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c;
        if (context != null) {
            context.sendBroadcast(intent);
            return;
        }
        by5.c4.c("XWebRuntimeUpdater", "Send broadcast failed. stage: " + str + " stage code: " + i17 + " error code: " + i18);
    }

    public void e(android.content.Context context, java.util.HashMap hashMap) {
        synchronized (this) {
            by5.s0.o();
            java.lang.String str = hashMap != null ? (java.lang.String) hashMap.get("UpdaterCheckType") : null;
            by5.c4.f("XWebRuntimeUpdater", "startCheck, check type:" + str);
            if ("5".equals(str)) {
                by5.c4.f("XWebRuntimeUpdater", "startCheck, check config update only");
                new zx5.b0().e(hashMap);
            } else if ("4".equals(str)) {
                zx5.k kVar = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
                by5.c4.f("XWebRuntimeUpdater", "startCheck, check embed install only");
                new zx5.x().e(true);
            } else {
                zx5.k kVar2 = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429501a;
                new zx5.x().e(false);
                new zx5.b0().e(hashMap);
                yu5.c.a(new by5.b1(context));
                by5.c1.f117955a = true;
            }
        }
    }
}
