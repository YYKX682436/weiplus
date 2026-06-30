package a22;

/* loaded from: classes12.dex */
public abstract class h {
    public static java.util.ArrayList a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiRecommendXMLParser", "[recommend emotion parser] parse xml faild. xml is null.");
            return null;
        }
        try {
            org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(str.getBytes())));
            parse.normalize();
            org.w3c.dom.NodeList elementsByTagName = parse.getDocumentElement().getElementsByTagName("Emotion");
            if (elementsByTagName != null && elementsByTagName.getLength() > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i17 = 0; i17 < elementsByTagName.getLength(); i17++) {
                    com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo = new com.tencent.mm.storage.emotion.EmojiGroupInfo();
                    org.w3c.dom.NodeList childNodes = elementsByTagName.item(i17).getChildNodes();
                    int length = childNodes.getLength();
                    for (int i18 = 0; i18 < length; i18++) {
                        org.w3c.dom.Node item = childNodes.item(i18);
                        if (item != null && item.getNodeName() != null && item.getNodeName().equals("ProductID")) {
                            emojiGroupInfo.field_productID = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("RecType")) {
                            emojiGroupInfo.field_recommandType = java.lang.Integer.valueOf(item.getTextContent()).intValue();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("RecWord")) {
                            emojiGroupInfo.field_recommandWord = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Name")) {
                            emojiGroupInfo.field_packName = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Panel")) {
                            emojiGroupInfo.field_packGrayIconUrl = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("Icon")) {
                            emojiGroupInfo.field_BigIconUrl = item.getTextContent();
                        } else if (item != null && item.getNodeName() != null && item.getNodeName().equals("ButtonType")) {
                            emojiGroupInfo.field_buttonType = java.lang.Integer.valueOf(item.getTextContent()).intValue();
                        }
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(emojiGroupInfo.field_productID)) {
                        emojiGroupInfo.field_recommand = 1;
                        emojiGroupInfo.field_lastUseTime = java.lang.System.currentTimeMillis();
                        emojiGroupInfo.field_sort = 0;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12068, 1, emojiGroupInfo.field_productID, java.lang.Integer.valueOf(emojiGroupInfo.field_recommandType));
                        arrayList.add(emojiGroupInfo);
                    }
                }
                return arrayList;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiRecommendXMLParser", "[parser] parseXML exception:%s", e17.toString());
        }
        return null;
    }
}
