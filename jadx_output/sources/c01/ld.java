package c01;

/* loaded from: classes12.dex */
public class ld implements com.tencent.mm.modelbase.i1 {
    @Override // com.tencent.mm.modelbase.t0
    public com.tencent.mm.modelbase.q0 b1(com.tencent.mm.modelbase.p0 p0Var) {
        org.w3c.dom.NamedNodeMap attributes;
        org.w3c.dom.Node namedItem;
        r45.j4 j4Var = p0Var.f70726a;
        if (j4Var == null || j4Var.f377561h == null) {
            com.tencent.mars.xlog.Log.f("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension failed, invalid cmdAM");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension start");
        try {
            org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(x51.j1.g(j4Var.f377561h).getBytes(com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding))));
            parse.normalize();
            org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("updatepackage");
            if (elementsByTagName != null && elementsByTagName.getLength() == 1) {
                org.w3c.dom.NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                int length = childNodes.getLength();
                for (int i17 = 0; i17 < length; i17++) {
                    org.w3c.dom.Node item = childNodes.item(i17);
                    if (item != null && item.getNodeName() != null && item.getNodeName().equals("pack") && (attributes = item.getAttributes()) != null && (namedItem = attributes.getNamedItem("type")) != null) {
                        gm0.j1.n().f273288b.g(new f21.g0(com.tencent.mm.sdk.platformtools.t8.P(namedItem.getNodeValue(), 0)));
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.UpdatePackageMsgExtension", "[oneliang]UpdatePackageMsgExtension end");
            return null;
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.UpdatePackageMsgExtension", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            return null;
        }
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
