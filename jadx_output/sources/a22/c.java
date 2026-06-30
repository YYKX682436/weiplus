package a22;

/* loaded from: classes12.dex */
public abstract class c {
    public static java.util.ArrayList a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiBackupXMLParser", "[backup emotion parser] parse xml faild. xml is null.");
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
                        ri0Var.f384888f = namedItem.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem2 = attributes.getNamedItem("cdnurl");
                    if (namedItem2 != null) {
                        ri0Var.f384887e = namedItem2.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem3 = attributes.getNamedItem("productid");
                    if (namedItem3 != null) {
                        ri0Var.f384892m = namedItem3.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem4 = attributes.getNamedItem("designerid");
                    if (namedItem4 != null) {
                        ri0Var.f384889g = namedItem4.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem5 = attributes.getNamedItem("aeskey");
                    if (namedItem5 != null) {
                        ri0Var.f384891i = namedItem5.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem6 = attributes.getNamedItem("encrypturl");
                    if (namedItem6 != null) {
                        ri0Var.f384890h = namedItem6.getNodeValue();
                    }
                    org.w3c.dom.Node namedItem7 = attributes.getNamedItem("activityid");
                    if (namedItem7 != null) {
                        ri0Var.f384895p = namedItem7.getNodeValue();
                    }
                    ri0Var.f384886d = lowerCase;
                    arrayList.add(ri0Var);
                }
                return arrayList;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiBackupXMLParser", "[parser] parseXML exception:%s", e17.toString());
        }
        return null;
    }
}
