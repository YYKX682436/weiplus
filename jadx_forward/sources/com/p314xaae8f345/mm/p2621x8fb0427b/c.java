package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes12.dex */
public class c extends dm.d implements java.io.Serializable {
    public static final l75.e0 E = dm.d.m124863x3593deb(com.p314xaae8f345.mm.p2621x8fb0427b.c.class);
    public java.util.Map D = null;

    @Override // dm.d, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return E;
    }

    /* renamed from: isValid */
    public boolean m77959x7b953cf2() {
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        return i17 >= this.f66197x1bb3b54a && i17 <= this.f66190x14c61803;
    }

    public java.util.Map t0() {
        if (this.D == null) {
            java.lang.String str = this.f66195xde9f9b4;
            java.util.HashMap hashMap = new java.util.HashMap();
            org.w3c.dom.Element d17 = com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.b.d(str);
            if (d17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ABTestParser", "Raw XML string parsing failed, xml: %s", str);
            } else {
                org.w3c.dom.NodeList elementsByTagName = d17.getElementsByTagName("args");
                if (elementsByTagName.getLength() > 0) {
                    org.w3c.dom.NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                    for (int i17 = 0; i17 < childNodes.getLength(); i17++) {
                        org.w3c.dom.Node item = childNodes.item(i17);
                        if (item.getNodeType() == 1 && item.getNodeName().equals("arg")) {
                            org.w3c.dom.Element element = (org.w3c.dom.Element) item;
                            org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("key");
                            org.w3c.dom.NodeList elementsByTagName3 = element.getElementsByTagName("value");
                            if (elementsByTagName2.getLength() != 0 && elementsByTagName3.getLength() != 0) {
                                hashMap.put(elementsByTagName2.item(0).getTextContent(), elementsByTagName3.item(0).getTextContent());
                            }
                        }
                    }
                }
            }
            this.D = hashMap;
        }
        return this.D;
    }
}
