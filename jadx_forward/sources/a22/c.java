package a22;

/* loaded from: classes12.dex */
public abstract class c {
    public static java.util.ArrayList a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiBackupXMLParser", "[backup emotion parser] parse xml faild. xml is null.");
            return null;
        }
        try {
            org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("EmojiMd5");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int length = elementsByTagName.getLength();
                for (int i17 = 0; i17 < length; i17++) {
                    org.w3c.dom.Node item = elementsByTagName.item(i17);
                    r45.ri0 ri0Var = new r45.ri0();
                    java.lang.String lowerCase = item.getTextContent().toLowerCase();
                    org.w3c.dom.NamedNodeMap attributes = item.getAttributes();
                    org.w3c.dom.Node namedItem = attributes.getNamedItem("thumburl");
                    if (namedItem != null) {
                        ri0Var.f466421f = namedItem.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem2 = attributes.getNamedItem("cdnurl");
                    if (namedItem2 != null) {
                        ri0Var.f466420e = namedItem2.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem3 = attributes.getNamedItem("productid");
                    if (namedItem3 != null) {
                        ri0Var.f466425m = namedItem3.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem4 = attributes.getNamedItem("designerid");
                    if (namedItem4 != null) {
                        ri0Var.f466422g = namedItem4.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem5 = attributes.getNamedItem("aeskey");
                    if (namedItem5 != null) {
                        ri0Var.f466424i = namedItem5.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem6 = attributes.getNamedItem("encrypturl");
                    if (namedItem6 != null) {
                        ri0Var.f466423h = namedItem6.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem7 = attributes.getNamedItem("activityid");
                    if (namedItem7 != null) {
                        ri0Var.f466428p = namedItem7.getNodeValue();
                    }
                    ri0Var.f466419d = lowerCase;
                    arrayList.add(ri0Var);
                }
                return arrayList;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiBackupXMLParser", "[parser] parseXML exception:%s", e17.toString());
        }
        return null;
    }
}
