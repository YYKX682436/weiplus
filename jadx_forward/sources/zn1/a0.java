package zn1;

/* loaded from: classes11.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final zn1.a0 f555953d = new zn1.a0();

    public a0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zn1.i0 i0Var = zn1.i0.f555980a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            zn1.c0 c0Var = zn1.c0.f555957d;
            android.content.res.XmlResourceParser xml = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getXml(com.p314xaae8f345.mm.R.xml.f576401di);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xml, "getXml(...)");
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xml.getName(), "usb-device")) {
                    zn1.z zVar = new zn1.z((java.lang.Integer) c0Var.mo149xb9724478(xml, "vendor-id"), (java.lang.Integer) c0Var.mo149xb9724478(xml, "product-id"), (java.lang.Integer) c0Var.mo149xb9724478(xml, "class"), (java.lang.Integer) c0Var.mo149xb9724478(xml, "subclass"), (java.lang.Integer) c0Var.mo149xb9724478(xml, "protocol"));
                    arrayList.add(zVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UsbDeviceManager", "Add device=" + zVar + " to usb device filter");
                }
                xml.next();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("UsbDeviceManager", "Fail to load usb device filter, exception=" + e17);
        }
        return arrayList;
    }
}
