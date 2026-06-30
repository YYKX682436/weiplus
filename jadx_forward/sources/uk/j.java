package uk;

/* loaded from: classes12.dex */
public abstract class j {
    public static void a(java.util.Map map, java.lang.String str, java.lang.String str2, org.w3c.dom.Node node, int i17) {
        if (node.getNodeName().equals("#text")) {
            map.put(str, node.getNodeValue());
            map.put(str2, node.getNodeValue());
            return;
        }
        if (node.getNodeName().equals("#cdata-section")) {
            map.put(str, node.getNodeValue());
            map.put(str2, node.getNodeValue());
            return;
        }
        java.lang.String str3 = str + "." + node.getNodeName();
        java.lang.String str4 = str2 + "." + node.getNodeName();
        if (i17 > 0) {
            str3 = str3 + i17;
            map.put(str3, node.getNodeValue());
            str4 = str4 + "#" + i17;
            map.put(str4, node.getNodeValue());
        } else {
            map.put(str3, node.getNodeValue());
            map.put(str4, node.getNodeValue());
        }
        org.w3c.dom.NamedNodeMap attributes = node.getAttributes();
        if (attributes != null) {
            for (int i18 = 0; i18 < attributes.getLength(); i18++) {
                org.w3c.dom.Node item = attributes.item(i18);
                map.put(str3 + ".$" + item.getNodeName(), item.getNodeValue());
                map.put(str4 + ".$" + item.getNodeName(), item.getNodeValue());
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        org.w3c.dom.NodeList childNodes = node.getChildNodes();
        for (int i19 = 0; i19 < childNodes.getLength(); i19++) {
            org.w3c.dom.Node item2 = childNodes.item(i19);
            java.lang.Integer num = (java.lang.Integer) hashMap.get(item2.getNodeName());
            int intValue = num == null ? 0 : num.intValue();
            a(map, str3, str4, item2, intValue);
            hashMap.put(item2.getNodeName(), java.lang.Integer.valueOf(intValue + 1));
        }
    }
}
