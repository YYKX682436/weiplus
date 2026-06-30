package com.tencent.mm.model.newabtest;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static javax.xml.parsers.DocumentBuilder f70390a;

    public static com.tencent.mm.storage.c a(org.w3c.dom.Element element) {
        org.w3c.dom.Node namedItem;
        com.tencent.mm.storage.c cVar = new com.tencent.mm.storage.c();
        org.w3c.dom.NamedNodeMap attributes = element.getAttributes();
        if (attributes == null || (namedItem = attributes.getNamedItem("layerid")) == null) {
            return null;
        }
        cVar.field_layerId = namedItem.getNodeValue();
        org.w3c.dom.Node namedItem2 = attributes.getNamedItem(dm.i4.COL_ID);
        if (namedItem2 == null) {
            return null;
        }
        cVar.field_expId = namedItem2.getNodeValue();
        org.w3c.dom.Node namedItem3 = attributes.getNamedItem("business");
        if (namedItem3 == null) {
            cVar.field_business = "";
        } else {
            cVar.field_business = namedItem3.getNodeValue();
        }
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName("sequence");
        if (elementsByTagName.getLength() == 0) {
            return null;
        }
        cVar.field_sequence = com.tencent.mm.sdk.platformtools.t8.V(elementsByTagName.item(0).getTextContent(), 0L);
        org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("prioritylevel");
        if (elementsByTagName2.getLength() > 0) {
            cVar.field_prioritylevel = com.tencent.mm.sdk.platformtools.t8.P(elementsByTagName2.item(0).getTextContent(), 0);
        } else {
            cVar.field_prioritylevel = 0;
        }
        org.w3c.dom.NodeList elementsByTagName3 = element.getElementsByTagName("starttime");
        if (elementsByTagName3.getLength() > 0) {
            long V = com.tencent.mm.sdk.platformtools.t8.V(elementsByTagName3.item(0).getTextContent(), 0L);
            cVar.field_startTime = V;
            if (V == 0) {
                cVar.field_startTime = java.lang.System.currentTimeMillis() / 1000;
            }
        } else {
            cVar.field_startTime = java.lang.System.currentTimeMillis() / 1000;
        }
        org.w3c.dom.NodeList elementsByTagName4 = element.getElementsByTagName("endtime");
        if (elementsByTagName4.getLength() > 0) {
            long V2 = com.tencent.mm.sdk.platformtools.t8.V(elementsByTagName4.item(0).getTextContent(), 0L);
            cVar.field_endTime = V2;
            if (V2 == 0) {
                cVar.field_endTime = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            }
        } else {
            cVar.field_endTime = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        }
        org.w3c.dom.NodeList elementsByTagName5 = element.getElementsByTagName("noreport");
        if (elementsByTagName5.getLength() > 0) {
            cVar.field_needReport = com.tencent.mm.sdk.platformtools.t8.P(elementsByTagName5.item(0).getTextContent(), 0) == 0;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            javax.xml.transform.Transformer newTransformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.transform(new javax.xml.transform.dom.DOMSource(element), new javax.xml.transform.stream.StreamResult(stringWriter));
        } catch (javax.xml.transform.TransformerException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ABTestParser", e17, "nodeToString", new java.lang.Object[0]);
        }
        cVar.field_rawXML = stringWriter.toString();
        return cVar;
    }

    public static java.util.List b(org.w3c.dom.Element element, int i17) {
        org.w3c.dom.Node namedItem;
        long currentTimeMillis;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.w3c.dom.NamedNodeMap attributes = element.getAttributes();
        if (attributes == null || (namedItem = attributes.getNamedItem(dm.i4.COL_ID)) == null) {
            return null;
        }
        java.lang.String nodeValue = namedItem.getNodeValue();
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName("sequence");
        if (elementsByTagName.getLength() == 0) {
            return null;
        }
        long V = com.tencent.mm.sdk.platformtools.t8.V(elementsByTagName.item(0).getTextContent(), 0L);
        org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("starttime");
        if (elementsByTagName2.getLength() > 0) {
            currentTimeMillis = com.tencent.mm.sdk.platformtools.t8.V(elementsByTagName2.item(0).getTextContent(), 0L);
            if (currentTimeMillis == 0) {
                currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            }
        } else {
            currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        }
        org.w3c.dom.NodeList elementsByTagName3 = element.getElementsByTagName("endtime");
        int length = elementsByTagName3.getLength();
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        if (length > 0) {
            long V2 = com.tencent.mm.sdk.platformtools.t8.V(elementsByTagName3.item(0).getTextContent(), 0L);
            if (V2 != 0) {
                j17 = V2;
            }
        }
        org.w3c.dom.NodeList elementsByTagName4 = element.getElementsByTagName("noreport");
        short s17 = 1;
        boolean z17 = elementsByTagName4.getLength() > 0 && com.tencent.mm.sdk.platformtools.t8.P(elementsByTagName4.item(0).getTextContent(), 0) == 1;
        java.util.HashMap hashMap = new java.util.HashMap();
        org.w3c.dom.NodeList elementsByTagName5 = element.getElementsByTagName("args");
        if (elementsByTagName5.getLength() > 0) {
            org.w3c.dom.NodeList childNodes = elementsByTagName5.item(0).getChildNodes();
            int i18 = 0;
            while (i18 < childNodes.getLength()) {
                org.w3c.dom.Node item = childNodes.item(i18);
                if (item.getNodeType() == s17 && item.getNodeName().equals("arg")) {
                    org.w3c.dom.Element element2 = (org.w3c.dom.Element) item;
                    org.w3c.dom.NodeList elementsByTagName6 = element2.getElementsByTagName("key");
                    org.w3c.dom.NodeList elementsByTagName7 = element2.getElementsByTagName("value");
                    if (elementsByTagName6.getLength() != 0 && elementsByTagName7.getLength() != 0) {
                        hashMap.put(elementsByTagName6.item(0).getTextContent(), elementsByTagName7.item(0).getTextContent());
                    }
                }
                i18++;
                s17 = 1;
            }
        }
        for (java.lang.String str : hashMap.keySet()) {
            com.tencent.mm.storage.a aVar = new com.tencent.mm.storage.a();
            aVar.field_abtestkey = str;
            aVar.field_value = (java.lang.String) hashMap.get(str);
            aVar.field_expId = nodeValue;
            aVar.field_sequence = V;
            aVar.field_prioritylevel = i17;
            aVar.field_startTime = currentTimeMillis;
            aVar.field_endTime = j17;
            aVar.field_noReport = z17;
            linkedList.add(aVar);
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.model.newabtest.a c(java.lang.String r10) {
        /*
            com.tencent.mm.model.newabtest.a r0 = new com.tencent.mm.model.newabtest.a
            r0.<init>()
            org.w3c.dom.Element r1 = d(r10)
            java.lang.String r2 = "MicroMsg.ABTestParser"
            if (r1 != 0) goto L17
            java.lang.String r1 = "Msg parsing failed, msg: %s"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.tencent.mars.xlog.Log.e(r2, r1, r10)
            return r0
        L17:
            org.w3c.dom.NamedNodeMap r10 = r1.getAttributes()
            if (r10 != 0) goto L1f
            r10 = 0
            return r10
        L1f:
            java.lang.String r3 = "type"
            org.w3c.dom.Node r10 = r10.getNamedItem(r3)
            r3 = 0
            r4 = 1
            if (r10 == 0) goto L51
            java.lang.String r5 = "newabtestinfo"
            java.lang.String r10 = r10.getNodeValue()
            boolean r10 = r5.equals(r10)
            if (r10 == 0) goto L51
            java.lang.String r10 = "prioritylevel"
            org.w3c.dom.NodeList r10 = r1.getElementsByTagName(r10)
            int r5 = r10.getLength()
            if (r5 <= 0) goto L51
            org.w3c.dom.Node r10 = r10.item(r3)
            java.lang.String r10 = r10.getTextContent()
            int r10 = com.tencent.mm.sdk.platformtools.t8.P(r10, r4)
            goto L52
        L51:
            r10 = r4
        L52:
            org.w3c.dom.NodeList r1 = r1.getChildNodes()
            r5 = r3
        L57:
            int r6 = r1.getLength()
            if (r5 >= r6) goto Lb9
            org.w3c.dom.Node r6 = r1.item(r5)
            if (r6 != 0) goto L64
            goto Lb6
        L64:
            short r7 = r6.getNodeType()
            if (r7 != r4) goto L8e
            java.lang.String r7 = r6.getNodeName()
            java.lang.String r8 = "exp"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L8e
            r7 = r6
            org.w3c.dom.Element r7 = (org.w3c.dom.Element) r7     // Catch: java.lang.Exception -> L85
            com.tencent.mm.storage.c r7 = a(r7)     // Catch: java.lang.Exception -> L85
            java.util.List r8 = r0.f70387a     // Catch: java.lang.Exception -> L85
            java.util.LinkedList r8 = (java.util.LinkedList) r8     // Catch: java.lang.Exception -> L85
            r8.add(r7)     // Catch: java.lang.Exception -> L85
            goto L8e
        L85:
            r7 = move-exception
            java.lang.String r8 = "parseExp"
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.tencent.mars.xlog.Log.printErrStackTrace(r2, r7, r8, r9)
        L8e:
            short r7 = r6.getNodeType()
            if (r7 != r4) goto Lb6
            java.lang.String r7 = r6.getNodeName()
            java.lang.String r8 = "expinfo"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lb6
            org.w3c.dom.Element r6 = (org.w3c.dom.Element) r6     // Catch: java.lang.Exception -> Lae
            java.util.List r6 = b(r6, r10)     // Catch: java.lang.Exception -> Lae
            java.util.List r7 = r0.f70388b     // Catch: java.lang.Exception -> Lae
            java.util.LinkedList r7 = (java.util.LinkedList) r7     // Catch: java.lang.Exception -> Lae
            r7.addAll(r6)     // Catch: java.lang.Exception -> Lae
            goto Lb6
        Lae:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.tencent.mars.xlog.Log.e(r2, r6)
        Lb6:
            int r5 = r5 + 1
            goto L57
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.model.newabtest.b.c(java.lang.String):com.tencent.mm.model.newabtest.a");
    }

    public static org.w3c.dom.Element d(java.lang.String str) {
        try {
            org.xml.sax.InputSource inputSource = new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(str.getBytes()));
            javax.xml.parsers.DocumentBuilder documentBuilder = f70390a;
            if (documentBuilder == null) {
                documentBuilder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
                f70390a = documentBuilder;
            }
            org.w3c.dom.Document parse = documentBuilder.parse(inputSource);
            parse.normalize();
            return parse.getDocumentElement();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ABTestParser", e17.toString());
            return null;
        }
    }
}
