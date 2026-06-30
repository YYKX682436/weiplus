package wx5;

/* loaded from: classes13.dex */
public class d extends android.content.BroadcastReceiver {
    public d(wx5.c cVar) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action = intent.getAction();
        if (!"com.tencent.xweb.remotedebug".equals(action)) {
            by5.c4.g("UpdateReceiver", "onReceive, action not match, action:" + action);
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("package_name");
        if (!org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.l().equals(stringExtra)) {
            by5.c4.g("UpdateReceiver", "onReceive, package name not match, packageName:" + stringExtra);
            return;
        }
        int intExtra = intent.getIntExtra("extra_action", 0);
        if (intExtra == 1) {
            by5.c4.f("UpdateReceiver", "onReceive, remote debug started");
            java.lang.String stringExtra2 = intent.getStringExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13301xac1d9648);
            synchronized (wx5.e.class) {
                java.util.Iterator it = ((java.util.ArrayList) wx5.e.f532123b).iterator();
                while (it.hasNext()) {
                    ((wx5.b) ((wx5.a) it.next())).getClass();
                    wx5.f.a(stringExtra2);
                }
            }
            return;
        }
        if (intExtra != 2) {
            by5.c4.f("UpdateReceiver", "onReceive, invalid action code:" + intExtra);
            return;
        }
        by5.c4.f("UpdateReceiver", "onReceive, remote debug stopped");
        synchronized (wx5.e.class) {
            java.util.Iterator it6 = ((java.util.ArrayList) wx5.e.f532123b).iterator();
            while (it6.hasNext()) {
                ((wx5.b) ((wx5.a) it6.next())).getClass();
                by5.c4.f("XWebRemoteDebugHandler", "stopRemoteDebug, process:" + org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.m156976xe5e58464());
                if (by5.a1.c()) {
                    by5.c4.f("XWebRemoteDebugHandler", "stopRemoteDebug, main process ignored");
                } else {
                    tx5.j.d(80032, new java.lang.Object[0]);
                }
            }
        }
    }
}
