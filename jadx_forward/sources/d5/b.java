package d5;

/* loaded from: classes13.dex */
public class b implements b5.b {

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f308003g = a5.a0.e("CommandHandler");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f308004d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f308005e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f308006f = new java.lang.Object();

    public b(android.content.Context context) {
        this.f308004d = context;
    }

    public static android.content.Intent a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.ServiceC1273x1138b13.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static android.content.Intent b(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.ServiceC1273x1138b13.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public void c(android.content.Intent intent, int i17, d5.k kVar) {
        java.lang.String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            a5.a0.c().a(f308003g, java.lang.String.format("Handling constraints changed %s", intent), new java.lang.Throwable[0]);
            d5.e eVar = new d5.e(this.f308004d, i17, kVar);
            java.util.List e17 = ((j5.g0) kVar.f308035h.f99430c.n()).e();
            java.lang.String str = d5.c.f308007a;
            java.util.ArrayList arrayList = (java.util.ArrayList) e17;
            java.util.Iterator it = arrayList.iterator();
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z27 = false;
            while (it.hasNext()) {
                a5.f fVar = ((j5.w) it.next()).f379306j;
                z17 |= fVar.f82921d;
                z18 |= fVar.f82919b;
                z19 |= fVar.f82922e;
                z27 |= fVar.f82918a != a5.b0.NOT_REQUIRED;
                if (z17 && z18 && z19 && z27) {
                    break;
                }
            }
            java.lang.String str2 = p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1271x3c2a7ea9.f94015a;
            android.content.Intent intent2 = new android.content.Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            android.content.Context context = eVar.f308012a;
            intent2.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1271x3c2a7ea9.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z17).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z18).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z19).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z27);
            context.sendBroadcast(intent2);
            f5.d dVar = eVar.f308014c;
            dVar.b(e17);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                j5.w wVar = (j5.w) it6.next();
                java.lang.String str3 = wVar.f379297a;
                if (currentTimeMillis >= wVar.a() && (!wVar.b() || dVar.a(str3))) {
                    arrayList2.add(wVar);
                }
            }
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                java.lang.String str4 = ((j5.w) it7.next()).f379297a;
                android.content.Intent a17 = a(context, str4);
                a5.a0.c().a(d5.e.f308011d, java.lang.String.format("Creating a delay_met command for workSpec with id (%s)", str4), new java.lang.Throwable[0]);
                kVar.e(new d5.h(kVar, a17, eVar.f308013b));
            }
            dVar.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            a5.a0.c().a(f308003g, java.lang.String.format("Handling reschedule %s, %s", intent, java.lang.Integer.valueOf(i17)), new java.lang.Throwable[0]);
            kVar.f308035h.f();
            return;
        }
        android.os.Bundle extras = intent.getExtras();
        if (!((extras == null || extras.isEmpty() || extras.get(new java.lang.String[]{"KEY_WORKSPEC_ID"}[0]) == null) ? false : true)) {
            a5.a0.c().b(f308003g, java.lang.String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new java.lang.Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            java.lang.String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            java.lang.String str5 = f308003g;
            a5.a0.c().a(str5, java.lang.String.format("Handling schedule work for %s", string), new java.lang.Throwable[0]);
            p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = kVar.f308035h.f99430c;
            abstractC1265x5c5aefcc.c();
            try {
                j5.w i18 = ((j5.g0) abstractC1265x5c5aefcc.n()).i(string);
                if (i18 == null) {
                    a5.a0.c().f(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new java.lang.Throwable[0]);
                } else if (i18.f379298b.h()) {
                    a5.a0.c().f(str5, "Skipping scheduling " + string + "because it is finished.", new java.lang.Throwable[0]);
                } else {
                    long a18 = i18.a();
                    boolean b17 = i18.b();
                    android.content.Context context2 = this.f308004d;
                    b5.w wVar2 = kVar.f308035h;
                    if (b17) {
                        a5.a0.c().a(str5, java.lang.String.format("Opportunistically setting an alarm for %s at %s", string, java.lang.Long.valueOf(a18)), new java.lang.Throwable[0]);
                        d5.a.b(context2, wVar2, string, a18);
                        android.content.Intent intent3 = new android.content.Intent(context2, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.ServiceC1273x1138b13.class);
                        intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                        kVar.e(new d5.h(kVar, intent3, i17));
                    } else {
                        a5.a0.c().a(str5, java.lang.String.format("Setting up Alarms for %s at %s", string, java.lang.Long.valueOf(a18)), new java.lang.Throwable[0]);
                        d5.a.b(context2, wVar2, string, a18);
                    }
                    abstractC1265x5c5aefcc.h();
                }
                return;
            } finally {
                abstractC1265x5c5aefcc.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            android.os.Bundle extras2 = intent.getExtras();
            synchronized (this.f308006f) {
                java.lang.String string2 = extras2.getString("KEY_WORKSPEC_ID");
                a5.a0 c17 = a5.a0.c();
                java.lang.String str6 = f308003g;
                c17.a(str6, java.lang.String.format("Handing delay met for %s", string2), new java.lang.Throwable[0]);
                if (((java.util.HashMap) this.f308005e).containsKey(string2)) {
                    a5.a0.c().a(str6, java.lang.String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new java.lang.Throwable[0]);
                } else {
                    d5.f fVar2 = new d5.f(this.f308004d, i17, string2, kVar);
                    ((java.util.HashMap) this.f308005e).put(string2, fVar2);
                    fVar2.c();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                a5.a0.c().f(f308003g, java.lang.String.format("Ignoring intent %s", intent), new java.lang.Throwable[0]);
                return;
            }
            android.os.Bundle extras3 = intent.getExtras();
            java.lang.String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z28 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            a5.a0.c().a(f308003g, java.lang.String.format("Handling onExecutionCompleted %s, %s", intent, java.lang.Integer.valueOf(i17)), new java.lang.Throwable[0]);
            d(string3, z28);
            return;
        }
        java.lang.String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        a5.a0.c().a(f308003g, java.lang.String.format("Handing stopWork work for %s", string4), new java.lang.Throwable[0]);
        kVar.f308035h.h(string4);
        java.lang.String str7 = d5.a.f308002a;
        j5.m mVar = (j5.m) kVar.f308035h.f99430c.k();
        j5.i a19 = mVar.a(string4);
        if (a19 != null) {
            d5.a.a(this.f308004d, string4, a19.f379281b);
            a5.a0.c().a(d5.a.f308002a, java.lang.String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new java.lang.Throwable[0]);
            mVar.b(string4);
        }
        kVar.d(string4, false);
    }

    @Override // b5.b
    public void d(java.lang.String str, boolean z17) {
        synchronized (this.f308006f) {
            b5.b bVar = (b5.b) ((java.util.HashMap) this.f308005e).remove(str);
            if (bVar != null) {
                bVar.d(str, z17);
            }
        }
    }
}
