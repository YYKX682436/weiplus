package eo1;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final eo1.e f337089a = new eo1.e();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f337090b = new java.util.ArrayList();

    public final synchronized void a(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CustomDiskInitErrorCache", "clearError: deviceId=".concat(deviceId));
        java.util.ArrayList arrayList = f337090b;
        eo1.d dVar = new eo1.d(deviceId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayList, "<this>");
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            int i19 = i17 + 1;
            java.lang.Object obj = arrayList.get(i17);
            if (((java.lang.Boolean) dVar.mo146xb9724478(obj)).booleanValue()) {
                i17 = i19;
            } else {
                arrayList.set(i18, obj);
                i17 = i19;
                i18++;
            }
        }
        arrayList.size();
        while (arrayList.size() > i18) {
            fp.l.b(arrayList);
        }
    }

    public final synchronized void b(java.lang.String deviceId, eo1.c errorType) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorType, "errorType");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("CustomDiskInitErrorCache", "markError: deviceId=" + deviceId + ", errorType=" + errorType);
        java.util.Iterator it = f337090b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((eo1.b) obj).f337080a, deviceId)) {
                    break;
                }
            }
        }
        eo1.b bVar = (eo1.b) obj;
        if (bVar != null) {
            bVar.f337081b = errorType;
        } else {
            f337090b.add(new eo1.b(deviceId, errorType));
        }
    }
}
