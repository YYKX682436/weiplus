package zn1;

/* loaded from: classes11.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zn1.n f555988d = new zn1.n();

    public n() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zn1.p pVar = zn1.p.f555997a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            android.content.res.XmlResourceParser xml = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getXml(com.p314xaae8f345.mm.R.xml.f576360dc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xml, "getXml(...)");
            while (xml.next() != 1) {
                if (xml.getEventType() == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xml.getName(), "usb-accessory")) {
                    zn1.g gVar = new zn1.g(xml.getAttributeValue(null, "manufacturer"), xml.getAttributeValue(null, "model"));
                    arrayList.add(gVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbAccessoryManager", "Add device=" + gVar + " to accessory device filter");
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UsbAccessoryManager", "Fail to parse accessory filter, exception=" + e17);
        }
        return arrayList;
    }
}
