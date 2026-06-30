package fo0;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final fo0.o f346366a = new fo0.o();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f346367b;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo0.o.a(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void b() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveMiniNotificationHelper", "unBindForegroundServiceIfNeed, isBindForegroundService:" + f346367b);
        if (fp.h.c(26) && f346367b) {
            try {
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p832x332457.ServiceC10842xd12fe846.class);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.stopService(intent);
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiveMiniNotificationHelper", e17, "unBind foreground service error: %s", e17.getMessage());
                z17 = false;
            }
            if (z17) {
                f346367b = false;
            }
        }
    }
}
