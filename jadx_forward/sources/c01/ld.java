package c01;

/* loaded from: classes12.dex */
public class ld implements com.p314xaae8f345.mm.p944x882e457a.i1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public com.p314xaae8f345.mm.p944x882e457a.q0 b1(com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        org.w3c.dom.NamedNodeMap attributes;
        org.w3c.dom.Node namedItem;
        r45.j4 j4Var = p0Var.f152259a;
        if (j4Var == null || j4Var.f459094h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension failed, invalid cmdAM");
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension start");
        try {
            org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(x51.j1.g(j4Var.f459094h).getBytes(com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6))));
            parse.normalize();
            org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("updatepackage");
            if (elementsByTagName != null && elementsByTagName.getLength() == 1) {
                org.w3c.dom.NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                int length = childNodes.getLength();
                for (int i17 = 0; i17 < length; i17++) {
                    org.w3c.dom.Node item = childNodes.item(i17);
                    if (item != null && item.getNodeName() != null && item.getNodeName().equals("pack") && (attributes = item.getAttributes()) != null && (namedItem = attributes.getNamedItem("type")) != null) {
                        gm0.j1.n().f354821b.g(new f21.g0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(namedItem.getNodeValue(), 0)));
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension end");
            return null;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.UpdatePackageMsgExtension", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.t0
    public void x5(com.p314xaae8f345.mm.p944x882e457a.r0 r0Var) {
    }
}
