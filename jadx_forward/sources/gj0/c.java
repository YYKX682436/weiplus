package gj0;

/* loaded from: classes11.dex */
public class c extends gj0.b {
    @Override // gj0.b
    public int b() {
        try {
            android.app.Application a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
            if (!new java.io.File(a17.getFilesDir(), ".newstoragealert").exists()) {
                return d();
            }
            if (!com.p314xaae8f345.mm.app.c6.f21432x4058ee7a.m43004x321e8933(a17)) {
                return 0;
            }
            if (!fp.r0.f346765a.e() && !lp.l.b(a17)) {
                return 0;
            }
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            try {
                new java.io.File(context.getFilesDir(), ".newstoragealert_threshold").delete();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.RepairerConfigGlobalStorage", e17, "delete file failed", new java.lang.Object[0]);
            }
            if (!e()) {
                d55.r0.a().f();
                return 2;
            }
            boolean z17 = l75.d1.f398478a;
            l75.d1.f398478a = true;
            l75.d1.f398481d = true;
            l75.d1.f398480c = true;
            return 0;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.app.p5.d("MicroMsg.NoSpaceFuse", th6, "[-] Fail to do fuse action.", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // gj0.b
    public java.lang.String c() {
        return "nospace";
    }

    public final int d() {
        try {
            android.app.Application a17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.i.a();
            if (!com.p314xaae8f345.mm.app.c6.f21432x4058ee7a.m43004x321e8933(a17)) {
                return 0;
            }
            if (!(fp.n0.f346748a.b() == fp.m0.f346744f) && !lp.l.b(a17)) {
                return 0;
            }
            if (e()) {
                android.content.Intent flags = new android.content.Intent(a17, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.DialogInterfaceOnClickListenerC21429x4c64514.class).setFlags(268435456);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(flags);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/fuse/NoSpaceFuse", "checkForFuseActionOld", "()I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                a17.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(a17, "com/tencent/mm/fuse/NoSpaceFuse", "checkForFuseActionOld", "()I", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
            d55.r0.a().f();
            return 2;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.app.p5.d("MicroMsg.NoSpaceFuse", th6, "[-] Fail to do fuse action.", new java.lang.Object[0]);
            return 0;
        }
    }

    public final boolean e() {
        java.lang.String readLine;
        try {
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader(new java.io.File("/proc/self/cgroup")));
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return false;
                    }
                    if (!readLine.contains("top-app")) {
                        if (readLine.contains("background")) {
                            break;
                        }
                    } else {
                        bufferedReader.close();
                        return true;
                    }
                } finally {
                }
            } while (!readLine.contains("restricted"));
            bufferedReader.close();
            return false;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.app.p5.d("MicroMsg.NoSpaceFuse", th6, "[-] Fail to read cgroup file.", new java.lang.Object[0]);
            return false;
        }
    }
}
