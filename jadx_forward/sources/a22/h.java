package a22;

/* loaded from: classes12.dex */
public abstract class h {
    public static java.util.ArrayList a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] parse xml faild. xml is null.");
            return null;
        }
        try {
            org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("Emotion");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < elementsByTagName.getLength(); i17++) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247();
                    org.w3c.dom.NodeList childNodes = elementsByTagName.item(i17).getChildNodes();
                    int length = childNodes.getLength();
                    for (int i18 = 0; i18 < length; i18++) {
                        org.w3c.dom.Node item = childNodes.item(i18);
                        if (item != null && item.getNodeName() != null && item.getNodeName().equals("ProductID")) {
                            c21051xbc71d247.f68396x5bec8145 = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("RecType")) {
                            c21051xbc71d247.f68398x61a09e8d = java.lang.Integer.valueOf(item.getTextContent()).intValue();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("RecWord")) {
                            c21051xbc71d247.f68399x61a1d65d = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Name")) {
                            c21051xbc71d247.f68391x4a7ba5e9 = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Panel")) {
                            c21051xbc71d247.f68389xc8eaa935 = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Icon")) {
                            c21051xbc71d247.f68374x14a71d9b = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("ButtonType")) {
                            c21051xbc71d247.f68376xce8675f1 = java.lang.Integer.valueOf(item.getTextContent()).intValue();
                        }
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21051xbc71d247.f68396x5bec8145)) {
                        c21051xbc71d247.f68397xd5942cb3 = 1;
                        c21051xbc71d247.f68382xd33ad9b9 = java.lang.System.currentTimeMillis();
                        c21051xbc71d247.f68400x226199c3 = 0;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12068, 1, c21051xbc71d247.f68396x5bec8145, java.lang.Integer.valueOf(c21051xbc71d247.f68398x61a09e8d));
                        arrayList.add(c21051xbc71d247);
                    }
                }
                return arrayList;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiRecommendXMLParser", "[parser] parseXML exception:%s", e17.toString());
        }
        return null;
    }
}
