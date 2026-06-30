package fo1;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final fo1.p f346423a = new fo1.p();

    public final boolean a(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, po1.d device, fo1.o requestCallback) {
        int i17;
        boolean a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestCallback, "requestCallback");
        po1.g gVar = device.f438829b;
        po1.g gVar2 = po1.g.f438843h;
        if (gVar == gVar2) {
            if (device.f438829b != gVar2) {
                a17 = true;
            } else {
                po1.d e17 = ro1.v.f479547a.e(device.f438828a);
                a17 = ((e17 == null || so1.b.f491759a.h(e17)) ? so1.g.f491771a : to1.g.f502444a).a(activity, device);
            }
            if (a17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamPermissionHelper", "[checkOrRequestPermission] permission granted. device=" + device);
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamPermissionHelper", "[checkOrRequestPermission] permission denied, need reauthorize again. device=" + device);
            b(activity, device, requestCallback);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamPermissionHelper", "Not usb disk device, try check AOA usb accessory.");
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a c12844xf7745c1a = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a;
        jz5.l a18 = c12844xf7745c1a.a();
        android.hardware.usb.UsbAccessory usbAccessory = (android.hardware.usb.UsbAccessory) a18.f384366d;
        boolean booleanValue = ((java.lang.Boolean) a18.f384367e).booleanValue();
        if (usbAccessory == null) {
            return true;
        }
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", "openAccessory: " + usbAccessory);
            c12844xf7745c1a.c(usbAccessory);
        } else {
            android.util.SparseIntArray sparseIntArray = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174089d;
            synchronized (sparseIntArray) {
                i17 = sparseIntArray.get(usbAccessory.hashCode());
            }
            if (i17 <= 2) {
                c12844xf7745c1a.e(usbAccessory);
                return false;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamPermissionHelper", "Asked %s more than %s times. Just return true to pass(maybe WiFi is available).", usbAccessory, java.lang.Integer.valueOf(i17));
        }
        return true;
    }

    public final void b(com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity, po1.d device, fo1.o requestCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(device, "device");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestCallback, "requestCallback");
        if (device.f438829b != po1.g.f438843h) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SAFUDiskDevice", "Try to request saf permission, device=" + device);
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12864xc0eb7555.class);
        intent.putExtra("deviceInfo", device.c());
        ((com.p314xaae8f345.mm.ui.bd) activity.m78751x5dc77fb5(intent)).f279410a = new to1.f(requestCallback);
    }
}
