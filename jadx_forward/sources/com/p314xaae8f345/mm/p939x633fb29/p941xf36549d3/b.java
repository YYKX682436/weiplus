package com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static javax.xml.parsers.DocumentBuilder f151923a;

    public static com.p314xaae8f345.mm.p2621x8fb0427b.c a(org.w3c.dom.Element element) {
        org.w3c.dom.Node namedItem;
        com.p314xaae8f345.mm.p2621x8fb0427b.c cVar = new com.p314xaae8f345.mm.p2621x8fb0427b.c();
        org.w3c.dom.NamedNodeMap attributes = element.getAttributes();
        if (attributes == null || (namedItem = attributes.getNamedItem("layerid")) == null) {
            return null;
        }
        cVar.f66192x72127c07 = namedItem.getNodeValue();
        org.w3c.dom.Node namedItem2 = attributes.getNamedItem(dm.i4.f66865x76d1ec5a);
        if (namedItem2 == null) {
            return null;
        }
        cVar.f66191x29106093 = namedItem2.getNodeValue();
        org.w3c.dom.Node namedItem3 = attributes.getNamedItem("business");
        if (namedItem3 == null) {
            cVar.f66189xd967c965 = "";
        } else {
            cVar.f66189xd967c965 = namedItem3.getNodeValue();
        }
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName("sequence");
        if (elementsByTagName.getLength() == 0) {
            return null;
        }
        cVar.f66196x6e338166 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(elementsByTagName.item(0).getTextContent(), 0L);
        org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("prioritylevel");
        if (elementsByTagName2.getLength() > 0) {
            cVar.f66194xac21bddb = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(elementsByTagName2.item(0).getTextContent(), 0);
        } else {
            cVar.f66194xac21bddb = 0;
        }
        org.w3c.dom.NodeList elementsByTagName3 = element.getElementsByTagName("starttime");
        if (elementsByTagName3.getLength() > 0) {
            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(elementsByTagName3.item(0).getTextContent(), 0L);
            cVar.f66197x1bb3b54a = V;
            if (V == 0) {
                cVar.f66197x1bb3b54a = java.lang.System.currentTimeMillis() / 1000;
            }
        } else {
            cVar.f66197x1bb3b54a = java.lang.System.currentTimeMillis() / 1000;
        }
        org.w3c.dom.NodeList elementsByTagName4 = element.getElementsByTagName("endtime");
        if (elementsByTagName4.getLength() > 0) {
            long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(elementsByTagName4.item(0).getTextContent(), 0L);
            cVar.f66190x14c61803 = V2;
            if (V2 == 0) {
                cVar.f66190x14c61803 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
            }
        } else {
            cVar.f66190x14c61803 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        org.w3c.dom.NodeList elementsByTagName5 = element.getElementsByTagName("noreport");
        if (elementsByTagName5.getLength() > 0) {
            cVar.f66193x672cb5cf = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(elementsByTagName5.item(0).getTextContent(), 0) == 0;
        }
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            javax.xml.transform.Transformer newTransformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.transform(new javax.xml.transform.dom.DOMSource(element), new javax.xml.transform.stream.StreamResult(stringWriter));
        } catch (javax.xml.transform.TransformerException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ABTestParser", e17, "nodeToString", new java.lang.Object[0]);
        }
        cVar.f66195xde9f9b4 = stringWriter.toString();
        return cVar;
    }

    public static java.util.List b(org.w3c.dom.Element element, int i17) {
        org.w3c.dom.Node namedItem;
        long currentTimeMillis;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        org.w3c.dom.NamedNodeMap attributes = element.getAttributes();
        if (attributes == null || (namedItem = attributes.getNamedItem(dm.i4.f66865x76d1ec5a)) == null) {
            return null;
        }
        java.lang.String nodeValue = namedItem.getNodeValue();
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName("sequence");
        if (elementsByTagName.getLength() == 0) {
            return null;
        }
        long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(elementsByTagName.item(0).getTextContent(), 0L);
        org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("starttime");
        if (elementsByTagName2.getLength() > 0) {
            currentTimeMillis = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(elementsByTagName2.item(0).getTextContent(), 0L);
            if (currentTimeMillis == 0) {
                currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            }
        } else {
            currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        }
        org.w3c.dom.NodeList elementsByTagName3 = element.getElementsByTagName("endtime");
        int length = elementsByTagName3.getLength();
        long j17 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        if (length > 0) {
            long V2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(elementsByTagName3.item(0).getTextContent(), 0L);
            if (V2 != 0) {
                j17 = V2;
            }
        }
        org.w3c.dom.NodeList elementsByTagName4 = element.getElementsByTagName("noreport");
        short s17 = 1;
        boolean z17 = elementsByTagName4.getLength() > 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(elementsByTagName4.item(0).getTextContent(), 0) == 1;
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
            com.p314xaae8f345.mm.p2621x8fb0427b.a aVar = new com.p314xaae8f345.mm.p2621x8fb0427b.a();
            aVar.f66021x37f6a047 = str;
            aVar.f66028x29f571ec = (java.lang.String) hashMap.get(str);
            aVar.f66023x29106093 = nodeValue;
            aVar.f66026x6e338166 = V;
            aVar.f66025xac21bddb = i17;
            aVar.f66027x1bb3b54a = currentTimeMillis;
            aVar.f66022x14c61803 = j17;
            aVar.f66024x420943fa = z17;
            linkedList.add(aVar);
        }
        return linkedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.a c(java.lang.String r10) {
        /*
            com.tencent.mm.model.newabtest.a r0 = new com.tencent.mm.model.newabtest.a
            r0.<init>()
            org.w3c.dom.Element r1 = d(r10)
            java.lang.String r2 = "MicroMsg.ABTestParser"
            if (r1 != 0) goto L17
            java.lang.String r1 = "Msg parsing failed, msg: %s"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r1, r10)
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
            int r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(r10, r4)
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
            java.util.List r8 = r0.f151920a     // Catch: java.lang.Exception -> L85
            java.util.LinkedList r8 = (java.util.LinkedList) r8     // Catch: java.lang.Exception -> L85
            r8.add(r7)     // Catch: java.lang.Exception -> L85
            goto L8e
        L85:
            r7 = move-exception
            java.lang.String r8 = "parseExp"
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r7, r8, r9)
        L8e:
            short r7 = r6.getNodeType()
            if (r7 != r4) goto Lb6
            java.lang.String r7 = r6.getNodeName()
            java.lang.String r8 = "expinfo"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lb6
            org.w3c.dom.Element r6 = (org.w3c.dom.Element) r6     // Catch: java.lang.Exception -> Lae
            java.util.List r6 = b(r6, r10)     // Catch: java.lang.Exception -> Lae
            java.util.List r7 = r0.f151921b     // Catch: java.lang.Exception -> Lae
            java.util.LinkedList r7 = (java.util.LinkedList) r7     // Catch: java.lang.Exception -> Lae
            r7.addAll(r6)     // Catch: java.lang.Exception -> Lae
            goto Lb6
        Lae:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r6)
        Lb6:
            int r5 = r5 + 1
            goto L57
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p939x633fb29.p941xf36549d3.b.c(java.lang.String):com.tencent.mm.model.newabtest.a");
    }

    public static org.w3c.dom.Element d(java.lang.String str) {
        try {
            org.xml.sax.InputSource inputSource = new org.xml.sax.InputSource(new java.io.ByteArrayInputStream(str.getBytes()));
            javax.xml.parsers.DocumentBuilder documentBuilder = f151923a;
            if (documentBuilder == null) {
                documentBuilder = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder();
                f151923a = documentBuilder;
            }
            org.w3c.dom.Document parse = documentBuilder.parse(inputSource);
            parse.normalize();
            return parse.getDocumentElement();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ABTestParser", e17.toString());
            return null;
        }
    }
}
