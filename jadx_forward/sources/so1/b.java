package so1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final so1.b f491759a = new so1.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f491760b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f491761c = {"/storage/"};

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f491762d = "/" + android.os.Environment.DIRECTORY_DOCUMENTS + "/ChatBackup";

    public final boolean a(java.lang.String uuid) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uuid, "uuid");
        int ordinal = g().ordinal();
        if (ordinal == 0) {
            ro1.t tVar = ro1.t.f479541d;
            java.util.List list = ro1.t.f479545h;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) it.next()).f438833f, uuid)) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        ro1.t tVar2 = ro1.t.f479541d;
        java.util.Iterator it6 = ro1.t.f479545h.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            }
            obj = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) obj).f438833f, uuid)) {
                break;
            }
        }
        po1.d dVar = (po1.d) obj;
        if (dVar != null) {
            return b(uuid, dVar.f438832e);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RoamBackup.DirectDiskAccessor", "Fail to find volume that uuid is ".concat(uuid));
        return false;
    }

    public final synchronized boolean b(java.lang.String str, java.lang.String str2) {
        boolean z17;
        boolean c17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.DirectDiskAccessor", "[checkAccessory] uuid=" + str + ", api-level=" + android.os.Build.VERSION.SDK_INT);
        z17 = true;
        if (str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.DirectDiskAccessor", "Fail to get directory, do default attempts");
            java.lang.String str3 = f491761c[0];
            so1.b bVar = f491759a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str3);
            sb6.append(str);
            c17 = bVar.c(sb6.toString());
        } else {
            c17 = c(str2);
        }
        if (c17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
            synchronized (f491760b) {
                L.D("roam_direct_access_ability", "SUPPORTED");
                L.remove("roam_direct_access_fail_count");
            }
        } else {
            f();
            z17 = false;
        }
        return z17;
    }

    public final boolean c(java.lang.String str) {
        try {
            java.io.File file = new java.io.File(str, android.os.Environment.DIRECTORY_DOCUMENTS);
            if (!file.exists() && !file.mkdirs()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.DirectDiskAccessor", "[checkAccessImpl] Path=" + file + " is not exist and can't create.");
                return false;
            }
            if (file.canRead() && file.canWrite()) {
                java.io.File file2 = new java.io.File(file, ".rwTestTmpFile_" + java.lang.System.currentTimeMillis());
                file2.deleteOnExit();
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                byte[] bytes = "read write permission test.".getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
                file2.delete();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.DirectDiskAccessor", "[checkAccessImpl] Path=" + file + " is ok");
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.DirectDiskAccessor", "[checkAccessImpl] Permission Denied, path=" + file + '.');
            return false;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RoamBackup.DirectDiskAccessor", "[checkAccessImpl] error: " + e17);
            return false;
        } catch (java.lang.SecurityException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RoamBackup.DirectDiskAccessor", "[checkAccessImpl] error: " + e18);
            return false;
        }
    }

    public final java.util.List d() {
        int ordinal = g().ordinal();
        if (ordinal == 0) {
            java.util.List b17 = ro1.v.f479547a.b();
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
            java.util.Iterator it = b17.iterator();
            while (it.hasNext()) {
                arrayList.add(po1.d.a((po1.d) it.next(), null, null, null, null, f491762d, null, "Direct_Access_Mark", 47, null));
            }
            return arrayList;
        }
        if (ordinal == 1) {
            return kz5.p0.f395529d;
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        java.util.List<po1.d> b18 = ro1.v.f479547a.b();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (po1.d dVar : b18) {
            if (java.lang.Thread.interrupted()) {
                throw new java.lang.InterruptedException("May stopped by user.");
            }
            po1.d a17 = f491759a.b(dVar.f438833f, dVar.f438832e) ? po1.d.a(dVar, null, null, null, null, f491762d, null, "Direct_Access_Mark", 47, null) : null;
            if (a17 != null) {
                arrayList2.add(a17);
            }
        }
        return arrayList2;
    }

    public final java.lang.String e(java.lang.String uuid) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uuid, "uuid");
        ro1.t tVar = ro1.t.f479541d;
        java.util.Iterator it = ro1.t.f479545h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((po1.d) obj).f438833f, uuid)) {
                break;
            }
        }
        po1.d dVar = (po1.d) obj;
        if (dVar != null) {
            return dVar.f438832e;
        }
        return null;
    }

    public final void f() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 L = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();
        synchronized (f491760b) {
            int o17 = L.o("roam_direct_access_fail_count", 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[incrementFailCount] from ");
            sb6.append(o17);
            sb6.append(" to ");
            int i17 = o17 + 1;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.DirectDiskAccessor", sb6.toString());
            L.A("roam_direct_access_fail_count", i17);
            if (i17 >= 16) {
                L.D("roam_direct_access_ability", "UNSUPPORTED");
                L.remove("roam_direct_access_fail_count");
            }
        }
    }

    public final so1.a g() {
        java.lang.String u17;
        synchronized (f491760b) {
            u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().u("roam_direct_access_ability", "UNKNOWN");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RoamBackup.DirectDiskAccessor", "isCurrentPhoneSupportedDirectAccess = " + u17);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u17, "SUPPORTED") ? so1.a.f491755d : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(u17, "UNSUPPORTED") ? so1.a.f491756e : so1.a.f491757f;
    }

    public final boolean h(po1.d deviceInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(deviceInfo.f438834g, "Direct_Access_Mark");
    }
}
