package org.p3363xbe4143f1;

/* renamed from: org.libpag.PAGFont */
/* loaded from: classes13.dex */
public class C29692xfae789e5 {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f429298a = {"/system/fonts/NotoSansCJK-Regular.ttc", "/system/fonts/NotoSansSC-Regular.otf", "/system/fonts/DroidSansFallback.ttf"};

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.regex.Pattern f429299b = java.util.regex.Pattern.compile("^[ \\n\\r\\t]+|[ \\n\\r\\t]+$");

    /* renamed from: c, reason: collision with root package name */
    private static boolean f429300c = false;

    /* renamed from: fontFamily */
    public java.lang.String f75012xb7009c93;

    /* renamed from: fontStyle */
    public java.lang.String f75013xa38e7aa2;

    /* renamed from: org.libpag.PAGFont$b */
    /* loaded from: classes13.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f429301a;

        /* renamed from: b, reason: collision with root package name */
        java.lang.String f429302b;

        /* renamed from: c, reason: collision with root package name */
        int f429303c;

        /* renamed from: d, reason: collision with root package name */
        int f429304d;

        private b() {
            this.f429301a = "";
            this.f429302b = "";
            this.f429303c = 0;
            this.f429304d = 400;
        }
    }

    static {
        b56.a.a("pag");
    }

    public C29692xfae789e5() {
        this.f75012xb7009c93 = "";
        this.f75013xa38e7aa2 = "";
    }

    /* renamed from: RegisterFallbackFonts */
    private static void m154743x95c4563f() {
        if (f429300c) {
            return;
        }
        f429300c = true;
        int i17 = 0;
        org.p3363xbe4143f1.C29692xfae789e5.b[] bVarArr = new org.p3363xbe4143f1.C29692xfae789e5.b[0];
        try {
            bVarArr = new java.io.File("/system/etc/fonts.xml").exists() ? b() : a();
        } catch (java.lang.Exception unused) {
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        org.p3363xbe4143f1.C29692xfae789e5.b a17 = a(bVarArr, "zh-Hans");
        if (a17 != null) {
            a(a17, arrayList, arrayList2);
        }
        for (java.lang.String str : f429298a) {
            org.p3363xbe4143f1.C29692xfae789e5.b bVar = new org.p3363xbe4143f1.C29692xfae789e5.b();
            bVar.f429302b = str;
            a(bVar, arrayList, arrayList2);
        }
        for (org.p3363xbe4143f1.C29692xfae789e5.b bVar2 : bVarArr) {
            a(bVar2, arrayList, arrayList2);
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
        m154752xb0e5cfb(strArr, iArr);
    }

    /* renamed from: RegisterFont */
    public static native org.p3363xbe4143f1.C29692xfae789e5 m154746xa3faf9b2(android.content.res.AssetManager assetManager, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);

    /* renamed from: RegisterFont */
    public static org.p3363xbe4143f1.C29692xfae789e5 m154747xa3faf9b2(java.lang.String str) {
        return m154748xa3faf9b2(str, 0);
    }

    /* renamed from: RegisterFont */
    public static native org.p3363xbe4143f1.C29692xfae789e5 m154749xa3faf9b2(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3);

    /* renamed from: RegisterFontBytes */
    public static org.p3363xbe4143f1.C29692xfae789e5 m154750xe29215d9(byte[] bArr, int i17, int i18) {
        return m154751xe29215d9(bArr, i17, i18, "", "");
    }

    /* renamed from: RegisterFontBytes */
    private static native org.p3363xbe4143f1.C29692xfae789e5 m154751xe29215d9(byte[] bArr, int i17, int i18, java.lang.String str, java.lang.String str2);

    /* renamed from: SetFallbackFontPaths */
    private static native void m154752xb0e5cfb(java.lang.String[] strArr, int[] iArr);

    /* renamed from: UnregisterFont */
    private static native void m154753x152062cb(java.lang.String str, java.lang.String str2);

    /* renamed from: UnregisterFont */
    public static void m154754x152062cb(org.p3363xbe4143f1.C29692xfae789e5 c29692xfae789e5) {
        m154753x152062cb(c29692xfae789e5.f75012xb7009c93, c29692xfae789e5.f75013xa38e7aa2);
    }

    private static org.p3363xbe4143f1.C29692xfae789e5.b[] a(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    a(xmlPullParser, arrayList);
                } else {
                    d(xmlPullParser);
                }
            }
        }
        org.p3363xbe4143f1.C29692xfae789e5.b[] bVarArr = new org.p3363xbe4143f1.C29692xfae789e5.b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return bVarArr;
    }

    private static org.p3363xbe4143f1.C29692xfae789e5.b[] b() {
        org.p3363xbe4143f1.C29692xfae789e5.b[] bVarArr = new org.p3363xbe4143f1.C29692xfae789e5.b[0];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream("/system/etc/fonts.xml");
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                newPullParser.setInput(fileInputStream, null);
                newPullParser.nextTag();
                return a(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.IOException unused) {
            return bVarArr;
        }
    }

    private static org.p3363xbe4143f1.C29692xfae789e5.b c(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        org.p3363xbe4143f1.C29692xfae789e5.b bVar = new org.p3363xbe4143f1.C29692xfae789e5.b();
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, ya.b.f77479x42930b2);
        bVar.f429303c = attributeValue == null ? 0 : java.lang.Integer.parseInt(attributeValue);
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(null, "weight");
        bVar.f429304d = attributeValue2 == null ? 400 : java.lang.Integer.parseInt(attributeValue2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 4) {
                sb6.append(xmlPullParser.getText());
            }
            if (xmlPullParser.getEventType() == 2) {
                d(xmlPullParser);
            }
        }
        bVar.f429302b = "/system/fonts/" + f429299b.matcher(sb6).replaceAll("");
        return bVar;
    }

    private static void d(org.xmlpull.v1.XmlPullParser xmlPullParser) {
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
    public static org.p3363xbe4143f1.C29692xfae789e5 m154744xa3faf9b2(android.content.res.AssetManager assetManager, java.lang.String str) {
        return m154745xa3faf9b2(assetManager, str, 0);
    }

    /* renamed from: RegisterFont */
    public static org.p3363xbe4143f1.C29692xfae789e5 m154745xa3faf9b2(android.content.res.AssetManager assetManager, java.lang.String str, int i17) {
        return m154746xa3faf9b2(assetManager, str, i17, "", "");
    }

    public C29692xfae789e5(java.lang.String str, java.lang.String str2) {
        this.f75012xb7009c93 = str;
        this.f75013xa38e7aa2 = str2;
    }

    /* renamed from: RegisterFont */
    public static org.p3363xbe4143f1.C29692xfae789e5 m154748xa3faf9b2(java.lang.String str, int i17) {
        return m154749xa3faf9b2(str, i17, "", "");
    }

    private static org.p3363xbe4143f1.C29692xfae789e5.b[] b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        xmlPullParser.require(2, null, "familyset");
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("family")) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("fileset")) {
                                b(xmlPullParser, arrayList);
                            } else {
                                d(xmlPullParser);
                            }
                        }
                    }
                } else {
                    d(xmlPullParser);
                }
            }
        }
        org.p3363xbe4143f1.C29692xfae789e5.b[] bVarArr = new org.p3363xbe4143f1.C29692xfae789e5.b[arrayList.size()];
        arrayList.toArray(bVarArr);
        return bVarArr;
    }

    private static void a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.ArrayList arrayList) {
        org.p3363xbe4143f1.C29692xfae789e5.b bVar = null;
        xmlPullParser.getAttributeValue(null, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(null, "lang");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList2.add(c(xmlPullParser));
                } else {
                    d(xmlPullParser);
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
            org.p3363xbe4143f1.C29692xfae789e5.b bVar2 = (org.p3363xbe4143f1.C29692xfae789e5.b) it.next();
            if (bVar2.f429304d == 400) {
                bVar = bVar2;
                break;
            }
        }
        if (bVar == null) {
            bVar = (org.p3363xbe4143f1.C29692xfae789e5.b) arrayList2.get(0);
        }
        if (bVar.f429302b.isEmpty()) {
            return;
        }
        if (attributeValue == null) {
            attributeValue = "";
        }
        bVar.f429301a = attributeValue;
        arrayList.add(bVar);
    }

    private static void b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.ArrayList arrayList) {
        org.p3363xbe4143f1.C29692xfae789e5.b bVar;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("file")) {
                    arrayList2.add(c(xmlPullParser));
                } else {
                    d(xmlPullParser);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            } else {
                bVar = (org.p3363xbe4143f1.C29692xfae789e5.b) it.next();
                if (bVar.f429304d == 400) {
                    break;
                }
            }
        }
        if (bVar == null) {
            bVar = (org.p3363xbe4143f1.C29692xfae789e5.b) arrayList2.get(0);
        }
        if (bVar.f429302b.isEmpty()) {
            return;
        }
        arrayList.add(bVar);
    }

    private static org.p3363xbe4143f1.C29692xfae789e5.b[] a() {
        org.p3363xbe4143f1.C29692xfae789e5.b[] bVarArr = new org.p3363xbe4143f1.C29692xfae789e5.b[0];
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream("/system/etc/fallback_fonts.xml");
            try {
                org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                newPullParser.setInput(fileInputStream, null);
                newPullParser.nextTag();
                return b(newPullParser);
            } finally {
                fileInputStream.close();
            }
        } catch (java.io.IOException unused) {
            return bVarArr;
        }
    }

    private static org.p3363xbe4143f1.C29692xfae789e5.b a(org.p3363xbe4143f1.C29692xfae789e5.b[] bVarArr, java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase();
        for (org.p3363xbe4143f1.C29692xfae789e5.b bVar : bVarArr) {
            if (bVar.f429301a.toLowerCase().equals(lowerCase)) {
                return bVar;
            }
        }
        return null;
    }

    private static void a(org.p3363xbe4143f1.C29692xfae789e5.b bVar, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        if (!arrayList.contains(bVar.f429302b) && new java.io.File(bVar.f429302b).exists()) {
            arrayList.add(bVar.f429302b);
            arrayList2.add(java.lang.Integer.valueOf(bVar.f429303c));
        }
    }
}
