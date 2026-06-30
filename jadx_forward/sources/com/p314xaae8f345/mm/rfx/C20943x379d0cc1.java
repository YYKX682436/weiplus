package com.p314xaae8f345.mm.rfx;

/* renamed from: com.tencent.mm.rfx.RfxPagFont */
/* loaded from: classes13.dex */
public class C20943x379d0cc1 {

    /* renamed from: DefaultLanguage */
    private static final java.lang.String f39068xdb7db499 = "zh-Hans";

    /* renamed from: SystemFontConfigPath_JellyBean */
    private static final java.lang.String f39071xf88c134 = "/system/etc/fallback_fonts.xml";

    /* renamed from: SystemFontConfigPath_Lollipop */
    private static final java.lang.String f39072x445320c5 = "/system/etc/fonts.xml";

    /* renamed from: SystemFontPath */
    private static final java.lang.String f39073x7f052883 = "/system/fonts/";

    /* renamed from: fontFamily */
    public java.lang.String f39075xb7009c93;

    /* renamed from: fontStyle */
    public java.lang.String f39076xa38e7aa2;

    /* renamed from: FallbackFontFileNames */
    private static final java.lang.String[] f39070xc9d713bb = {"/system/fonts/NotoSansCJK-Regular.ttc", "/system/fonts/NotoSansSC-Regular.otf", "/system/fonts/DroidSansFallback.ttf"};

    /* renamed from: FILENAME_WHITESPACE_PATTERN */
    private static final java.util.regex.Pattern f39069xd07934e6 = java.util.regex.Pattern.compile("^[ \\n\\r\\t]+|[ \\n\\r\\t]+$");

    /* renamed from: systemFontLoaded */
    private static boolean f39074xfe8210c3 = false;

    static {
        tq5.k.a("xlabeffect");
    }

    public C20943x379d0cc1() {
        this.f39075xb7009c93 = "";
        this.f39076xa38e7aa2 = "";
    }

    /* renamed from: RegisterFallbackFonts */
    private static void m77415x95c4563f() {
        if (f39074xfe8210c3) {
            return;
        }
        f39074xfe8210c3 = true;
        int i17 = 0;
        com.p314xaae8f345.mm.rfx.c[] cVarArr = new com.p314xaae8f345.mm.rfx.c[0];
        try {
            cVarArr = new java.io.File(f39072x445320c5).exists() ? m77430x529375de() : m77429xc9530f3b();
        } catch (java.lang.Exception unused) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.rfx.c m77428xd0b09b74 = m77428xd0b09b74(cVarArr, f39068xdb7db499);
        if (m77428xd0b09b74 != null) {
            m77427xbb83c090(m77428xd0b09b74, arrayList, arrayList2);
        }
        for (java.lang.String str : f39070xc9d713bb) {
            com.p314xaae8f345.mm.rfx.c cVar = new com.p314xaae8f345.mm.rfx.c(null);
            cVar.f273755b = str;
            m77427xbb83c090(cVar, arrayList, arrayList2);
        }
        for (com.p314xaae8f345.mm.rfx.c cVar2 : cVarArr) {
            m77427xbb83c090(cVar2, arrayList, arrayList2);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        arrayList.toArray(strArr);
        int[] iArr = new int[arrayList2.size()];
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            iArr[i17] = ((java.lang.Integer) it.next()).intValue();
            i17++;
        }
        m77424xb0e5cfb(strArr, iArr);
    }

    /* renamed from: RegisterFont */
    public static native com.p314xaae8f345.mm.rfx.C20943x379d0cc1 m77418xa3faf9b2(android.content.res.AssetManager assetManager, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);

    /* renamed from: RegisterFont */
    public static com.p314xaae8f345.mm.rfx.C20943x379d0cc1 m77419xa3faf9b2(java.lang.String str) {
        return m77420xa3faf9b2(str, 0);
    }

    /* renamed from: RegisterFont */
    public static native com.p314xaae8f345.mm.rfx.C20943x379d0cc1 m77421xa3faf9b2(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);

    /* renamed from: RegisterFontBytes */
    public static com.p314xaae8f345.mm.rfx.C20943x379d0cc1 m77422xe29215d9(byte[] bArr, int i17, int i18) {
        return m77423xe29215d9(bArr, i17, i18, "", "");
    }

    /* renamed from: RegisterFontBytes */
    private static native com.p314xaae8f345.mm.rfx.C20943x379d0cc1 m77423xe29215d9(byte[] bArr, int i17, int i18, java.lang.String str, java.lang.String str2);

    /* renamed from: SetFallbackFontPaths */
    private static native void m77424xb0e5cfb(java.lang.String[] strArr, int[] iArr);

    /* renamed from: UnregisterFont */
    public static void m77425x152062cb(com.p314xaae8f345.mm.rfx.C20943x379d0cc1 c20943x379d0cc1) {
        m77426x152062cb(c20943x379d0cc1.f39075xb7009c93, c20943x379d0cc1.f39076xa38e7aa2);
    }

    /* renamed from: UnregisterFont */
    private static native void m77426x152062cb(java.lang.String str, java.lang.String str2);

    /* renamed from: addFont */
    private static void m77427xbb83c090(com.p314xaae8f345.mm.rfx.c cVar, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.Integer> arrayList2) {
        if (!arrayList.contains(cVar.f273755b) && new java.io.File(cVar.f273755b).exists()) {
            arrayList.add(cVar.f273755b);
            arrayList2.add(java.lang.Integer.valueOf(cVar.f273756c));
        }
    }

    /* renamed from: getFontByLanguage */
    private static com.p314xaae8f345.mm.rfx.c m77428xd0b09b74(com.p314xaae8f345.mm.rfx.c[] cVarArr, java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase();
        for (com.p314xaae8f345.mm.rfx.c cVar : cVarArr) {
            if (cVar.f273754a.toLowerCase().equals(lowerCase)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: parseJellyBean */
    private static com.p314xaae8f345.mm.rfx.c[] m77429xc9530f3b() {
        com.p314xaae8f345.mm.rfx.c[] cVarArr = new com.p314xaae8f345.mm.rfx.c[0];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(f39071xf88c134);
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                newPullParser.setInput(fileInputStream, null);
                newPullParser.nextTag();
                return m77432x4ccdb4d6(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.IOException unused) {
            return cVarArr;
        }
    }

    /* renamed from: parseLollipop */
    private static com.p314xaae8f345.mm.rfx.c[] m77430x529375de() {
        com.p314xaae8f345.mm.rfx.c[] cVarArr = new com.p314xaae8f345.mm.rfx.c[0];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(f39072x445320c5);
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                newPullParser.setInput(fileInputStream, null);
                newPullParser.nextTag();
                return m77431xd8aeaab8(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.IOException unused) {
            return cVarArr;
        }
    }

    /* renamed from: readFamilies */
    private static com.p314xaae8f345.mm.rfx.c[] m77431xd8aeaab8(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    m77433xcaf2989a(xmlPullParser, arrayList);
                } else {
                    m77436x35e57f(xmlPullParser);
                }
            }
        }
        com.p314xaae8f345.mm.rfx.c[] cVarArr = new com.p314xaae8f345.mm.rfx.c[arrayList.size()];
        arrayList.toArray(cVarArr);
        return cVarArr;
    }

    /* renamed from: readFamiliesJellyBean */
    private static com.p314xaae8f345.mm.rfx.c[] m77432x4ccdb4d6(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("fileset")) {
                                m77434xa0f76ef0(xmlPullParser, arrayList);
                            } else {
                                m77436x35e57f(xmlPullParser);
                            }
                        }
                    }
                } else {
                    m77436x35e57f(xmlPullParser);
                }
            }
        }
        com.p314xaae8f345.mm.rfx.c[] cVarArr = new com.p314xaae8f345.mm.rfx.c[arrayList.size()];
        arrayList.toArray(cVarArr);
        return cVarArr;
    }

    /* renamed from: readFamily */
    private static void m77433xcaf2989a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.ArrayList<com.p314xaae8f345.mm.rfx.c> arrayList) {
        com.p314xaae8f345.mm.rfx.c cVar = null;
        xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "lang");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList2.add(m77435xcc441f05(xmlPullParser));
                } else {
                    m77436x35e57f(xmlPullParser);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.rfx.c cVar2 = (com.p314xaae8f345.mm.rfx.c) it.next();
            if (cVar2.f273757d == 400) {
                cVar = cVar2;
                break;
            }
        }
        if (cVar == null) {
            cVar = (com.p314xaae8f345.mm.rfx.c) arrayList2.get(0);
        }
        if (cVar.f273755b.isEmpty()) {
            return;
        }
        if (attributeValue == null) {
            attributeValue = "";
        }
        cVar.f273754a = attributeValue;
        arrayList.add(cVar);
    }

    /* renamed from: readFileset */
    private static void m77434xa0f76ef0(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.ArrayList<com.p314xaae8f345.mm.rfx.c> arrayList) {
        com.p314xaae8f345.mm.rfx.c cVar;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("file")) {
                    arrayList2.add(m77435xcc441f05(xmlPullParser));
                } else {
                    m77436x35e57f(xmlPullParser);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                cVar = null;
                break;
            } else {
                cVar = (com.p314xaae8f345.mm.rfx.c) it.next();
                if (cVar.f273757d == 400) {
                    break;
                }
            }
        }
        if (cVar == null) {
            cVar = (com.p314xaae8f345.mm.rfx.c) arrayList2.get(0);
        }
        if (cVar.f273755b.isEmpty()) {
            return;
        }
        arrayList.add(cVar);
    }

    /* renamed from: readFont */
    private static com.p314xaae8f345.mm.rfx.c m77435xcc441f05(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        com.p314xaae8f345.mm.rfx.c cVar = new com.p314xaae8f345.mm.rfx.c(null);
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, ya.b.f77479x42930b2);
        cVar.f273756c = attributeValue == null ? 0 : java.lang.Integer.parseInt(attributeValue);
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "weight");
        cVar.f273757d = attributeValue2 == null ? 400 : java.lang.Integer.parseInt(attributeValue2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 4) {
                sb6.append(xmlPullParser.getText());
            }
            if (xmlPullParser.getEventType() == 2) {
                m77436x35e57f(xmlPullParser);
            }
        }
        cVar.f273755b = f39073x7f052883 + f39069xd07934e6.matcher(sb6).replaceAll("");
        return cVar;
    }

    /* renamed from: skip */
    private static void m77436x35e57f(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        int i17 = 1;
        while (i17 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i17++;
            } else if (next == 3) {
                i17--;
            }
        }
    }

    /* renamed from: RegisterFont */
    public static com.p314xaae8f345.mm.rfx.C20943x379d0cc1 m77416xa3faf9b2(android.content.res.AssetManager assetManager, java.lang.String str) {
        return m77417xa3faf9b2(assetManager, str, 0);
    }

    /* renamed from: RegisterFont */
    public static com.p314xaae8f345.mm.rfx.C20943x379d0cc1 m77417xa3faf9b2(android.content.res.AssetManager assetManager, java.lang.String str, int i17) {
        return m77418xa3faf9b2(assetManager, str, i17, "", "");
    }

    public C20943x379d0cc1(java.lang.String str, java.lang.String str2) {
        this.f39075xb7009c93 = str;
        this.f39076xa38e7aa2 = str2;
    }

    /* renamed from: RegisterFont */
    public static com.p314xaae8f345.mm.rfx.C20943x379d0cc1 m77420xa3faf9b2(java.lang.String str, int i17) {
        return m77421xa3faf9b2(str, i17, "", "");
    }
}
