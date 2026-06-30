package n9;

/* loaded from: classes15.dex */
public final class b extends i9.b {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.regex.Pattern f417268n = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.regex.Pattern f417269o = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.regex.Pattern f417270p = java.util.regex.Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.regex.Pattern f417271q = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    public static final n9.a f417272r = new n9.a(30.0f, 1, 1);

    /* renamed from: m, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParserFactory f417273m;

    public b() {
        super("TtmlDecoder");
        try {
            org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.f417273m = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e17) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e17);
        }
    }

    public static boolean h(java.lang.String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("smpte:image") || str.equals("smpte:data") || str.equals("smpte:information");
    }

    public static void i(java.lang.String str, n9.e eVar) {
        java.util.regex.Matcher matcher;
        java.lang.String[] split = str.split("\\s+");
        int length = split.length;
        java.util.regex.Pattern pattern = f417270p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new i9.f("Invalid number of entries for fontSize: " + split.length + ".");
            }
            matcher = pattern.matcher(split[1]);
        }
        if (!matcher.matches()) {
            throw new i9.f("Invalid expression for fontSize: '" + str + "'.");
        }
        java.lang.String group = matcher.group(3);
        group.getClass();
        char c17 = 65535;
        switch (group.hashCode()) {
            case 37:
                if (group.equals("%")) {
                    c17 = 0;
                    break;
                }
                break;
            case 3240:
                if (group.equals("em")) {
                    c17 = 1;
                    break;
                }
                break;
            case 3592:
                if (group.equals("px")) {
                    c17 = 2;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
                eVar.f417300j = 3;
                break;
            case 1:
                eVar.f417300j = 2;
                break;
            case 2:
                eVar.f417300j = 1;
                break;
            default:
                throw new i9.f("Invalid unit for fontSize: '" + group + "'.");
        }
        eVar.f417301k = java.lang.Float.valueOf(matcher.group(1)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long n(java.lang.String r13, n9.a r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.n(java.lang.String, n9.a):long");
    }

    @Override // i9.b
    public i9.d f(byte[] bArr, int i17, boolean z17) {
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = this.f417273m.newPullParser();
            java.util.Map hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("", new n9.d(null, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
            int i18 = 0;
            java.io.InputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr, 0, i17);
            n9.f fVar = null;
            newPullParser.setInput(byteArrayInputStream, null);
            java.util.LinkedList linkedList = new java.util.LinkedList();
            n9.a aVar = f417272r;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                n9.c cVar = (n9.c) linkedList.peekLast();
                if (i18 == 0) {
                    java.lang.String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            aVar = j(newPullParser);
                        }
                        if (!h(name)) {
                            newPullParser.getName();
                        } else if ("head".equals(name)) {
                            k(newPullParser, hashMap, hashMap2);
                        } else {
                            try {
                                n9.c l17 = l(newPullParser, cVar, hashMap2, aVar);
                                linkedList.addLast(l17);
                                if (cVar != null) {
                                    if (cVar.f417284k == null) {
                                        cVar.f417284k = new java.util.ArrayList();
                                    }
                                    ((java.util.ArrayList) cVar.f417284k).add(l17);
                                }
                            } catch (i9.f unused) {
                            }
                        }
                        i18++;
                    } else if (eventType == 4) {
                        n9.c a17 = n9.c.a(newPullParser.getText());
                        if (cVar.f417284k == null) {
                            cVar.f417284k = new java.util.ArrayList();
                        }
                        ((java.util.ArrayList) cVar.f417284k).add(a17);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            fVar = new n9.f((n9.c) linkedList.getLast(), hashMap, hashMap2);
                        }
                        linkedList.removeLast();
                    }
                } else {
                    if (eventType != 2) {
                        if (eventType == 3) {
                            i18--;
                        }
                    }
                    i18++;
                }
                newPullParser.next();
            }
            return fVar;
        } catch (java.io.IOException e17) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e17);
        } catch (org.xmlpull.v1.XmlPullParserException e18) {
            throw new i9.f("Unable to decode source", e18);
        }
    }

    public final n9.e g(n9.e eVar) {
        return eVar == null ? new n9.e() : eVar;
    }

    public final n9.a j(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        float f17;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : 30;
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (attributeValue2.split(" ").length != 2) {
                throw new i9.f("frameRateMultiplier doesn't have 2 parts");
            }
            f17 = java.lang.Integer.parseInt(r2[0]) / java.lang.Integer.parseInt(r2[1]);
        } else {
            f17 = 1.0f;
        }
        n9.a aVar = f417272r;
        int i17 = aVar.f417266b;
        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i17 = java.lang.Integer.parseInt(attributeValue3);
        }
        int i18 = aVar.f417267c;
        java.lang.String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i18 = java.lang.Integer.parseInt(attributeValue4);
        }
        return new n9.a(parseInt * f17, i17, i18);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map k(org.xmlpull.v1.XmlPullParser r12, java.util.Map r13, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.k(org.xmlpull.v1.XmlPullParser, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n9.c l(org.xmlpull.v1.XmlPullParser r23, n9.c r24, java.util.Map r25, n9.a r26) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.l(org.xmlpull.v1.XmlPullParser, n9.c, java.util.Map, n9.a):n9.c");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        if (r3.equals("linethrough") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        if (r3.equals("start") == false) goto L82;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n9.e m(org.xmlpull.v1.XmlPullParser r12, n9.e r13) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.b.m(org.xmlpull.v1.XmlPullParser, n9.e):n9.e");
    }
}
