package i5;

/* loaded from: classes13.dex */
public class d implements f5.c, b5.b {

    /* renamed from: p, reason: collision with root package name */
    public static final java.lang.String f369965p = a5.a0.e("SystemFgDispatcher");

    /* renamed from: d, reason: collision with root package name */
    public final b5.w f369966d;

    /* renamed from: e, reason: collision with root package name */
    public final m5.a f369967e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f369968f = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369969g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f369970h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f369971i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f369972m;

    /* renamed from: n, reason: collision with root package name */
    public final f5.d f369973n;

    /* renamed from: o, reason: collision with root package name */
    public i5.c f369974o;

    public d(android.content.Context context) {
        b5.w c17 = b5.w.c(context);
        this.f369966d = c17;
        m5.a aVar = c17.f99431d;
        this.f369967e = aVar;
        this.f369969g = null;
        this.f369970h = new java.util.LinkedHashMap();
        this.f369972m = new java.util.HashSet();
        this.f369971i = new java.util.HashMap();
        this.f369973n = new f5.d(context, aVar, this);
        c17.f99433f.a(this);
    }

    public static android.content.Intent b(android.content.Context context, java.lang.String str, a5.o oVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", oVar.f82950a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oVar.f82951b);
        intent.putExtra("KEY_NOTIFICATION", oVar.f82952c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static android.content.Intent c(android.content.Context context, java.lang.String str, a5.o oVar) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", oVar.f82950a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oVar.f82951b);
        intent.putExtra("KEY_NOTIFICATION", oVar.f82952c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // f5.c
    public void a(java.util.List list) {
        if (list.isEmpty()) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            a5.a0.c().a(f369965p, java.lang.String.format("Constraints unmet for WorkSpec %s", str), new java.lang.Throwable[0]);
            b5.w wVar = this.f369966d;
            ((m5.c) wVar.f99431d).a(new k5.n(wVar, str, true));
        }
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        java.util.Map.Entry entry;
        synchronized (this.f369968f) {
            j5.w wVar = (j5.w) ((java.util.HashMap) this.f369971i).remove(str);
            if (wVar != null ? ((java.util.HashSet) this.f369972m).remove(wVar) : false) {
                this.f369973n.b(this.f369972m);
            }
        }
        a5.o oVar = (a5.o) this.f369970h.remove(str);
        if (str.equals(this.f369969g) && this.f369970h.size() > 0) {
            java.util.Iterator it = ((java.util.LinkedHashMap) this.f369970h).entrySet().iterator();
            java.lang.Object next = it.next();
            while (true) {
                entry = (java.util.Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f369969g = (java.lang.String) entry.getKey();
            if (this.f369974o != null) {
                a5.o oVar2 = (a5.o) entry.getValue();
                i5.c cVar = this.f369974o;
                p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd63 = (p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63) cVar;
                serviceC1276xcff9fd63.f94025e.post(new i5.e(serviceC1276xcff9fd63, oVar2.f82950a, oVar2.f82952c, oVar2.f82951b));
                p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd632 = (p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63) this.f369974o;
                serviceC1276xcff9fd632.f94025e.post(new i5.g(serviceC1276xcff9fd632, oVar2.f82950a));
            }
        }
        i5.c cVar2 = this.f369974o;
        if (oVar == null || cVar2 == null) {
            return;
        }
        a5.a0.c().a(f369965p, java.lang.String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", java.lang.Integer.valueOf(oVar.f82950a), str, java.lang.Integer.valueOf(oVar.f82951b)), new java.lang.Throwable[0]);
        p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd633 = (p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63) cVar2;
        serviceC1276xcff9fd633.f94025e.post(new i5.g(serviceC1276xcff9fd633, oVar.f82950a));
    }

    public final void e(android.content.Intent intent) {
        int i17 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        java.lang.String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        android.app.Notification notification = (android.app.Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        a5.a0.c().a(f369965p, java.lang.String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", java.lang.Integer.valueOf(intExtra), stringExtra, java.lang.Integer.valueOf(intExtra2)), new java.lang.Throwable[0]);
        if (notification == null || this.f369974o == null) {
            return;
        }
        a5.o oVar = new a5.o(intExtra, notification, intExtra2);
        java.util.Map map = this.f369970h;
        map.put(stringExtra, oVar);
        if (android.text.TextUtils.isEmpty(this.f369969g)) {
            this.f369969g = stringExtra;
            p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd63 = (p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63) this.f369974o;
            serviceC1276xcff9fd63.f94025e.post(new i5.e(serviceC1276xcff9fd63, intExtra, notification, intExtra2));
            return;
        }
        p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd632 = (p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63) this.f369974o;
        serviceC1276xcff9fd632.f94025e.post(new i5.f(serviceC1276xcff9fd632, intExtra, notification));
        if (intExtra2 == 0 || android.os.Build.VERSION.SDK_INT < 29) {
            return;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i17 |= ((a5.o) ((java.util.Map.Entry) it.next()).getValue()).f82951b;
        }
        a5.o oVar2 = (a5.o) linkedHashMap.get(this.f369969g);
        if (oVar2 != null) {
            p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63 serviceC1276xcff9fd633 = (p012xc85e97e9.p125x37c711.p126x316220.p131x76486943.ServiceC1276xcff9fd63) this.f369974o;
            serviceC1276xcff9fd633.f94025e.post(new i5.e(serviceC1276xcff9fd633, oVar2.f82950a, oVar2.f82952c, i17));
        }
    }

    @Override // f5.c
    public void f(java.util.List list) {
    }
}
