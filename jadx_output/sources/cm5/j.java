package cm5;

/* loaded from: classes9.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f43439a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void a(l75.k0 k0Var) {
        androidx.lifecycle.c1 a17;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(gm0.j1.u().h() + "NotifyMessageRecordABTest");
        long q17 = M.q("key_last_check_time", 0L);
        if (!f43439a.getAndSet(true) || currentTimeMillis - q17 >= 60000) {
            M.B("key_last_check_time", currentTimeMillis);
            boolean a18 = te5.s1.f418747a.a();
            if (a18 == M.i("key_last_ab_test_on", false)) {
                return;
            }
            com.tencent.mars.xlog.Log.i("NotifyMessageRecordDbHelper", "checkWhenNeed isABTestOn " + a18);
            try {
                if (a18) {
                    if (d(k0Var)) {
                        com.tencent.mars.xlog.Log.i("NotifyMessageRecordDbHelper", "checkWhenNeed isDbSuccess ");
                        M.G("key_last_ab_test_on", a18);
                        return;
                    }
                    return;
                }
                synchronized (jm0.k.f300270i) {
                    gm0.j1.b().c();
                    if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.na.class)) {
                        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                    a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.na.class);
                }
                ((com.tencent.mm.storage.ma) ((com.tencent.mm.storage.na) a17).P6(com.tencent.mm.storage.ma.class)).X6();
                b(k0Var);
                com.tencent.mars.xlog.Log.i("NotifyMessageRecordDbHelper", "checkWhenNeed isDbSuccess ");
                M.G("key_last_ab_test_on", a18);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("NotifyMessageRecordDbHelper", "syncHistory or recoverData fail", e17);
            }
        }
    }

    public static void b(l75.k0 k0Var) {
        p75.n0 n0Var = dm.m8.f238509i;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("talker", "notifymessage");
        contentValues.put("is_special_talker", (java.lang.Integer) 0);
        p75.m0 i17 = dm.m8.f238514q.i(1);
        p75.h1 j17 = dm.m8.f238509i.j(contentValues);
        j17.b(i17);
        j17.a().f(k0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(st0.g gVar, com.tencent.mm.storage.f9 f9Var) {
        int i17;
        gVar.field_is_special_talker = 0;
        if (f9Var == null) {
            return;
        }
        java.util.List list = cm5.k.f43440a;
        if (f9Var.getType() == 318767153) {
            i17 = cm5.k.d(cm5.k.c(f9Var), f9Var.getType());
        } else {
            i17 = ((java.util.ArrayList) cm5.k.f43440a).contains(java.lang.Integer.valueOf(f9Var.getType()));
        }
        gVar.field_is_special_talker = i17;
    }

    public static boolean d(l75.k0 k0Var) {
        p75.n0 n0Var = dm.m8.f238509i;
        p75.n0 singleTable = dm.c8.f236162y0;
        n0Var.getClass();
        kotlin.jvm.internal.o.g(singleTable, "singleTable");
        p75.z zVar = new p75.z(n0Var.f352676a, singleTable.f352676a, p75.q.f352688d);
        p75.d dVar = dm.m8.f238510m;
        p75.d value = dm.c8.f236159l1;
        dVar.getClass();
        kotlin.jvm.internal.o.g(value, "value");
        zVar.f352707d = new p75.q0(dVar.z(), value.z());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(dVar);
        arrayList.add(dm.m8.f238512o);
        p75.d dVar2 = dm.m8.f238511n;
        arrayList.add(dVar2);
        arrayList.add(dm.m8.f238513p);
        p75.d dVar3 = dm.m8.f238514q;
        arrayList.add(dVar3);
        p75.d dVar4 = dm.c8.f236160p1;
        arrayList.add(dVar4);
        arrayList.add(dm.c8.B1);
        p75.i0 g17 = zVar.g(arrayList);
        p75.y yVar = (p75.y) dVar3.i(0).d(new p75.a1(dVar3.z()));
        yVar.f(dVar4.k(cm5.k.f43440a));
        yVar.f(dVar2.j("notifymessage"));
        g17.f352657d = yVar;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) g17.a().k(k0Var, cm5.i.class);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        int size = arrayList2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                break;
            }
            cm5.i iVar = (cm5.i) arrayList2.get(i17);
            if (iVar != null) {
                java.lang.String str = iVar.f43437e == 721420337 ? "offline_scan_result" : "";
                if (android.text.TextUtils.isEmpty(str)) {
                    str = cm5.k.a(iVar.f43437e, android.text.TextUtils.isEmpty(iVar.f43436d) ? null : com.tencent.mm.sdk.platformtools.aa.d(iVar.f43436d, "msg", null), true);
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    st0.g gVar = iVar.f43438f;
                    gVar.field_talker = str;
                    gVar.field_is_special_talker = 1;
                    arrayList3.add(gVar);
                }
            }
            i17++;
        }
        int size2 = arrayList3.size();
        boolean z17 = false;
        for (int i18 = 0; i18 < size2; i18++) {
            if (new m75.e((dm.m8) arrayList3.get(i18), null, null, "MicroMsg.SDK.BaseNotifyMessageRecord").a(k0Var) < 1) {
                z17 = true;
            }
        }
        return !z17;
    }
}
