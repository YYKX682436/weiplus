package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b;

/* loaded from: classes11.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l f174167d = new com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.C12844xf7745c1a.f174086a.getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.res.XmlResourceParser xml = context.getResources().getXml(com.p314xaae8f345.mm.R.xml.f576360dc);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xml, "getXml(...)");
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xml.getName(), "usb-accessory")) {
                        java.lang.String attributeValue = xml.getAttributeValue(null, "manufacturer");
                        java.lang.String attributeValue2 = xml.getAttributeValue(null, "model");
                        java.lang.String attributeValue3 = xml.getAttributeValue(null, "version");
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append("manufacturer: ");
                        sb6.append(attributeValue == null ? "N/A" : attributeValue);
                        sb6.append(" model: ");
                        sb6.append(attributeValue2 == null ? "N/A" : attributeValue2);
                        sb6.append(" version: ");
                        if (attributeValue3 == null) {
                            attributeValue3 = "N/A";
                        }
                        sb6.append(attributeValue3);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MmAoaManager", sb6.toString());
                        arrayList.add(new jz5.l(attributeValue, attributeValue2));
                    }
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MmAoaManager", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
