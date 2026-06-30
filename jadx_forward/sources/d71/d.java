package d71;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f308410a = new java.util.LinkedHashMap();

    static {
        new d71.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[LOOP:4: B:92:0x00c0->B:109:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d71.d.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public final r26.m b(java.lang.String input, java.lang.String pattern) {
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
            java.util.regex.Matcher matcher = compile.matcher(input);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
            return r26.u.a(matcher, 0, input);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneNumberFormatLogic", "Error matching phone number: " + e17.getMessage());
            return null;
        }
    }

    public final void c(android.content.Context context) {
        int i17;
        org.w3c.dom.Node item;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            java.io.InputStream openRawResource = context.getResources().openRawResource(com.p314xaae8f345.mm.R.raw.f80842xa36b621d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(openRawResource, "openRawResource(...)");
            try {
                try {
                    org.w3c.dom.Document parse = javax.xml.parsers.DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(openRawResource);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(parse, "parse(...)");
                    parse.getDocumentElement().normalize();
                    item = parse.getElementsByTagName("config").item(0);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberFormatLogic", "Error loading config from raw: " + e17.getMessage());
                }
                if (item == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberFormatLogic", "Warning: No config node found in XML");
                    return;
                }
                org.w3c.dom.NodeList childNodes = item.getChildNodes();
                int length = childNodes.getLength();
                for (i17 = 0; i17 < length; i17++) {
                    org.w3c.dom.Node item2 = childNodes.item(i17);
                    if (item2.getNodeType() == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(item2.getNodeName(), "country")) {
                        d((org.w3c.dom.Element) item2);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PhoneNumberFormatLogic", "Loaded " + this.f308410a.size() + " country configurations");
            } finally {
                openRawResource.close();
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PhoneNumberFormatLogic", "Error loading config: " + e18.getMessage());
        }
    }

    public final void d(org.w3c.dom.Element element) {
        d71.b bVar;
        java.lang.String attribute = element.getAttribute("isocode");
        java.lang.String attribute2 = element.getAttribute("countrycode");
        java.lang.String attribute3 = element.getAttribute("minlen");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(attribute3, "getAttribute(...)");
        java.lang.Integer h17 = r26.h0.h(attribute3);
        int intValue = h17 != null ? h17.intValue() : 0;
        java.lang.String attribute4 = element.getAttribute("maxlen");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(attribute4, "getAttribute(...)");
        java.lang.Integer h18 = r26.h0.h(attribute4);
        int intValue2 = h18 != null ? h18.intValue() : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54557xe73e0b15);
        int length = elementsByTagName.getLength();
        boolean z17 = true;
        for (int i17 = 0; i17 < length; i17++) {
            org.w3c.dom.Node item = elementsByTagName.item(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(item, "null cannot be cast to non-null type org.w3c.dom.Element");
            org.w3c.dom.Element element2 = (org.w3c.dom.Element) item;
            d71.b bVar2 = new d71.b(null, null, null, 7, null);
            org.w3c.dom.NodeList elementsByTagName2 = element2.getElementsByTagName("leading");
            if (elementsByTagName2.getLength() > 0) {
                bVar = bVar2;
                bVar.f308407a = elementsByTagName2.item(0).getTextContent();
            } else {
                bVar = bVar2;
            }
            org.w3c.dom.NodeList elementsByTagName3 = element2.getElementsByTagName("pattern");
            if (elementsByTagName3.getLength() > 0) {
                bVar.f308408b = elementsByTagName3.item(0).getTextContent();
            }
            org.w3c.dom.NodeList elementsByTagName4 = element2.getElementsByTagName("formatregex");
            if (elementsByTagName4.getLength() > 0) {
                bVar.f308409c = elementsByTagName4.item(0).getTextContent();
            }
            if (bVar.f308407a == null) {
                z17 = false;
            }
            arrayList.add(bVar);
        }
        d71.a aVar = new d71.a(attribute2, attribute, arrayList, intValue, intValue2, z17);
        java.util.Map map = this.f308410a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(attribute);
        map.put(attribute, aVar);
    }
}
