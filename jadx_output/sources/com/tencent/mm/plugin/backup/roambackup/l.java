package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes11.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.backup.roambackup.l f92634d = new com.tencent.mm.plugin.backup.roambackup.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.backup.roambackup.MmAoaManager.f92553a.getClass();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            android.content.res.XmlResourceParser xml = context.getResources().getXml(com.tencent.mm.R.xml.f494827dc);
            kotlin.jvm.internal.o.f(xml, "getXml(...)");
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (kotlin.jvm.internal.o.b(xml.getName(), "usb-accessory")) {
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
                        com.tencent.mars.xlog.Log.i("MicroMsg.MmAoaManager", sb6.toString());
                        arrayList.add(new jz5.l(attributeValue, attributeValue2));
                    }
                }
            }
            return arrayList;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MmAoaManager", th6, "", new java.lang.Object[0]);
            return null;
        }
    }
}
