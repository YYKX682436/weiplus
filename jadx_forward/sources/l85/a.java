package l85;

/* loaded from: classes12.dex */
public class a extends l85.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 f398653d;

    public a(com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831) {
        this.f398653d = serviceC21023x76ade831;
    }

    @Override // l85.n0
    public void nb(final android.content.Intent intent) {
        com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831 = this.f398653d;
        if (intent != null) {
            com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.a(serviceC21023x76ade831, java.lang.Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new java.lang.Runnable() { // from class: l85.a$$c
                @Override // java.lang.Runnable
                public final void run() {
                    l85.a aVar = l85.a.this;
                    aVar.getClass();
                    java.lang.ClassLoader classLoader = com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.class.getClassLoader();
                    android.content.Intent intent2 = intent;
                    intent2.setExtrasClassLoader(classLoader);
                    java.lang.String stringExtra = intent2.getStringExtra("class_name");
                    com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 abstractC21025xb0cc40f5 = (com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5) com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.f274731g.get(stringExtra);
                    if (abstractC21025xb0cc40f5 != null) {
                        abstractC21025xb0cc40f5.a(intent2, "unbind");
                        l85.l1.a(54L, 1L, false);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar.f398653d.c(), "unbindService() class_name = %s", stringExtra);
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade831.c(), "unbindService() intent == null");
        }
        l85.l1.a(53L, 1L, false);
    }

    @Override // l85.n0
    public void og(final android.content.Intent intent, final l85.j0 j0Var) {
        com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831 = this.f398653d;
        if (intent != null) {
            com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.a(serviceC21023x76ade831, java.lang.Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new java.lang.Runnable() { // from class: l85.a$$d
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade8312 = l85.a.this.f398653d;
                    java.lang.ClassLoader classLoader = com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.class.getClassLoader();
                    android.content.Intent intent2 = intent;
                    intent2.setExtrasClassLoader(classLoader);
                    java.lang.String stringExtra = intent2.getStringExtra("class_name");
                    try {
                        android.os.IBinder a17 = com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.b(serviceC21023x76ade8312, stringExtra).a(intent2, "bind");
                        l85.j0 j0Var2 = j0Var;
                        if (j0Var2 != null) {
                            try {
                                j0Var2.bd(a17);
                            } catch (android.os.RemoteException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade8312.c(), "bindService() immserviceConnectionStubAIDL RemoteException: %s", e17.getMessage());
                            }
                        }
                        l85.l1.a(39L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade8312.c(), "bindService() class_name = %s", stringExtra);
                    } catch (java.lang.Exception e18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade8312.c(), "bindService()  Class.forName(%s) Exception: %s", stringExtra, e18.getMessage());
                    }
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade831.c(), "bindService() intent == null");
        }
        l85.l1.a(38L, 1L, false);
    }

    @Override // l85.n0
    /* renamed from: startService */
    public void mo145315x6e4047f3(final android.content.Intent intent) {
        com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831 = this.f398653d;
        if (intent != null) {
            com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.a(serviceC21023x76ade831, java.lang.Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new java.lang.Runnable() { // from class: l85.a$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade8312 = l85.a.this.f398653d;
                    java.lang.ClassLoader classLoader = com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.class.getClassLoader();
                    android.content.Intent intent2 = intent;
                    intent2.setExtrasClassLoader(classLoader);
                    java.lang.String stringExtra = intent2.getStringExtra("class_name");
                    try {
                        com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.b(serviceC21023x76ade8312, stringExtra).a(intent2, "start");
                        l85.l1.a(8L, 1L, false);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade8312.c(), "startService() class_name = %s", stringExtra);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade8312.c(), "startService()  Class.forName(%s) Exception: %s", stringExtra, e17.getMessage());
                    }
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade831.c(), "startService() intent == null");
        }
        l85.l1.a(7L, 1L, false);
    }

    @Override // l85.n0
    /* renamed from: stopService */
    public void mo145316x29afb053(final android.content.Intent intent) {
        com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831 serviceC21023x76ade831 = this.f398653d;
        if (intent != null) {
            com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.a(serviceC21023x76ade831, java.lang.Boolean.valueOf(intent.getBooleanExtra("isTreadPool", false)), new java.lang.Runnable() { // from class: l85.a$$b
                @Override // java.lang.Runnable
                public final void run() {
                    l85.a aVar = l85.a.this;
                    aVar.getClass();
                    java.lang.ClassLoader classLoader = com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.class.getClassLoader();
                    android.content.Intent intent2 = intent;
                    intent2.setExtrasClassLoader(classLoader);
                    java.lang.String stringExtra = intent2.getStringExtra("class_name");
                    com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 abstractC21025xb0cc40f5 = (com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5) com.p314xaae8f345.mm.p2613x7643c6b5.ServiceC21023x76ade831.f274731g.get(stringExtra);
                    if (abstractC21025xb0cc40f5 != null) {
                        abstractC21025xb0cc40f5.a(intent2, "stop");
                        l85.l1.a(24L, 1L, false);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar.f398653d.c(), "stopService() class_name = %s", stringExtra);
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC21023x76ade831.c(), "stopService() intent == null");
        }
        l85.l1.a(23L, 1L, false);
    }
}
