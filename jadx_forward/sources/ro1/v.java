package ro1;

/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final ro1.v f479547a = new ro1.v();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f479548b = jz5.h.b(ro1.u.f479546d);

    public final java.util.List a() {
        java.util.Collection values = c().values();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
        java.util.List V0 = kz5.n0.V0(values);
        oo1.j jVar = oo1.j.f428678a;
        return V0;
    }

    public final java.util.List b() {
        java.io.File file;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.Object systemService = context.getSystemService("storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.storage.StorageManager");
        java.util.List<android.os.storage.StorageVolume> storageVolumes = ((android.os.storage.StorageManager) systemService).getStorageVolumes();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(storageVolumes, "getStorageVolumes(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (android.os.storage.StorageVolume storageVolume : storageVolumes) {
            po1.d dVar = null;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(storageVolume.getState(), "mounted")) {
                ro1.a aVar = ro1.a.f479507a;
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    file = storageVolume.getDirectory();
                } else {
                    java.lang.reflect.Field field = ro1.a.f479508b;
                    java.lang.Object obj = field != null ? field.get(storageVolume) : null;
                    file = obj instanceof java.io.File ? (java.io.File) obj : null;
                }
                java.lang.String absolutePath = file != null ? file.getAbsolutePath() : null;
                if (absolutePath == null) {
                    absolutePath = "";
                }
                java.lang.String str2 = absolutePath;
                storageVolume.isPrimary();
                if (!storageVolume.isPrimary() && storageVolume.isRemovable()) {
                    java.lang.String uuid = storageVolume.getUuid();
                    if (!(uuid == null || uuid.length() == 0)) {
                        po1.g gVar = po1.g.f438843h;
                        java.lang.String description = storageVolume.getDescription(context);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(description, "getDescription(...)");
                        java.lang.String uuid2 = storageVolume.getUuid();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(uuid2);
                        dVar = new po1.d("usb-default-device-id", gVar, description, "", str2, uuid2, "");
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "Skip volume that state is " + storageVolume.getState() + ", uuid=" + storageVolume.getUuid() + ", " + storageVolume.getDescription(context));
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        oo1.j jVar = oo1.j.f428678a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "getAllStorageVolumeFromSystem, result.size=" + arrayList.size());
        return arrayList;
    }

    public final java.util.concurrent.ConcurrentHashMap c() {
        return (java.util.concurrent.ConcurrentHashMap) ((jz5.n) f479548b).mo141623x754a37bb();
    }

    public final java.lang.String d(java.lang.String path, ro1.i fileOps) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileOps, "fileOps");
        jz5.l j17 = j(path, fileOps);
        return j17 != null ? (java.lang.String) j17.f384366d : r26.i0.n(path, "/", false) ? path.concat("ChatBackup") : path.concat("/ChatBackup");
    }

    public final po1.d e(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        oo1.j jVar = oo1.j.f428678a;
        return (po1.d) c().get(deviceId);
    }

    public final boolean f(po1.d device) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(device.f438828a, "usb-default-device-id");
    }

    public final void g(po1.d deviceInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
        if (c().putIfAbsent(deviceInfo.f438828a, deviceInfo) == null) {
            oo1.o.f428684a.b().D(deviceInfo.f438828a, deviceInfo.c());
        }
    }

    public final boolean h(po1.d device, ro1.i fileOps) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileOps, "fileOps");
        oo1.j jVar = oo1.j.f428678a;
        f(device);
        ro1.b bVar = ro1.c.f479509c;
        ro1.c c17 = bVar.c(device.f438832e, fileOps);
        if (c17 != null) {
            java.lang.String str = c17.f479510a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            device.f438828a = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UsbVolumeHelper", "Select a exist directory, device=" + device);
            return i(device);
        }
        java.lang.String str2 = device.f438828a;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        device.f438828a = uuid;
        boolean d17 = bVar.d(device, fileOps);
        if (!d17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            device.f438828a = str2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "write device=" + device + " to meta file, isSuccess=" + d17);
        return d17 && i(device);
    }

    public final boolean i(po1.d dVar) {
        if (!oo1.o.f428684a.b().D(dVar.f438828a, dVar.c())) {
            return false;
        }
        c().put(dVar.f438828a, dVar);
        return true;
    }

    public final jz5.l j(java.lang.String str, ro1.i iVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "try read deviceId from meta file, path=" + str);
        java.lang.String b17 = ro1.a.f479507a.b(str, "ChatBackup");
        ro1.b bVar = ro1.c.f479509c;
        ro1.c c17 = bVar.c(b17, iVar);
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "deviceId from meta file is " + c17 + ", baseDirWithDefaultDir=" + b17);
            return new jz5.l(b17, c17);
        }
        ro1.c c18 = bVar.c(str, iVar);
        if (c18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UsbVolumeHelper", "deviceId from meta file is " + c18 + ", backupBaseDirectory=" + str);
            return new jz5.l(str, c18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UsbVolumeHelper", "Fail to read deviceId from " + b17 + " and " + str);
        return null;
    }

    public final boolean k(po1.d device, ro1.i fileOps) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileOps, "fileOps");
        po1.d e17 = e(device.f438828a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.UsbVolumeHelper", "Device from mmkv is " + e17);
        boolean z17 = false;
        if (e17 == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e17.f438833f, device.f438833f) || !r26.i0.A(e17.f438832e, device.f438832e, false, 2, null)) {
            return false;
        }
        java.lang.String str = device.f438832e;
        device.d(e17.f438832e);
        if (ro1.c.f479509c.d(device, fileOps) && i(device)) {
            z17 = true;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UsbVolumeHelper", "Fail to regenerate meta file, device=" + device);
            device.d(str);
        }
        return z17;
    }
}
