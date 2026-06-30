package a84;

/* loaded from: classes4.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a84.e1 f83809a = new a84.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f83810b = new java.lang.ThreadLocal();

    public static final boolean a(a84.z0 z0Var, java.lang.String str) {
        a84.z0 z0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("deleteNodeByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (z0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteNodeByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return false;
        }
        jz5.l e17 = f83809a.e(z0Var, str);
        java.util.List list = null;
        java.lang.Object obj = e17 != null ? e17.f384367e : null;
        if (e17 != null && (z0Var2 = (a84.z0) e17.f384366d) != null) {
            list = z0Var2.c();
        }
        if (obj == null || list == null || !(obj instanceof a84.z0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AD.XMLUtil", "remove failed");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteNodeByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return false;
        }
        boolean remove = list.remove(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("deleteNodeByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        return remove;
    }

    public static final a84.z0 b(a84.z0 z0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findAdXml", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (z0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAdXml", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findOneTagWithRoot$default", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findOneTagWithRoot", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        try {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z0Var.b(), dm.n.f67493x36901555)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findOneTagWithRoot", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            } else {
                z0Var = f83809a.d(z0Var, dm.n.f67493x36901555, 0, 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findOneTagWithRoot", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AD.XMLUtil", th6, "findOneTag() called with: findTagName = adxml", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findOneTagWithRoot", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            z0Var = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findOneTagWithRoot$default", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findAdXml", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        return z0Var;
    }

    public static final a84.z0 c(a84.z0 z0Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (z0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        if (str == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        jz5.l e17 = f83809a.e(z0Var, str);
        java.lang.Object obj = e17 != null ? e17.f384367e : null;
        a84.z0 z0Var2 = obj instanceof a84.z0 ? (a84.z0) obj : null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findByPath", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        return z0Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a84.z0 f(java.lang.String r9) {
        /*
            java.lang.String r0 = "readXmlNode"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.utils.XMLUtil"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "readXmlNodeInternal"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            r3 = 0
            r4 = 0
            if (r9 != 0) goto L18
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        L15:
            r5 = r3
            goto L89
        L18:
            kotlin.jvm.internal.h0 r5 = new kotlin.jvm.internal.h0     // Catch: java.lang.Throwable -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.ThreadLocal r6 = a84.e1.f83810b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r7 = r6.get()     // Catch: java.lang.Throwable -> L7a
            r5.f391656d = r7     // Catch: java.lang.Throwable -> L7a
            if (r7 != 0) goto L34
            org.xmlpull.v1.XmlPullParserFactory r7 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch: java.lang.Throwable -> L7a
            org.xmlpull.v1.XmlPullParser r7 = r7.newPullParser()     // Catch: java.lang.Throwable -> L7a
            r5.f391656d = r7     // Catch: java.lang.Throwable -> L7a
            r6.set(r7)     // Catch: java.lang.Throwable -> L7a
        L34:
            java.lang.Object r6 = r5.f391656d     // Catch: java.lang.Throwable -> L7a
            r7 = r6
            org.xmlpull.v1.XmlPullParser r7 = (org.xmlpull.v1.XmlPullParser) r7     // Catch: java.lang.Throwable -> L7a
            if (r7 != 0) goto L3f
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)     // Catch: java.lang.Throwable -> L7a
            goto L15
        L3f:
            org.xmlpull.v1.XmlPullParser r6 = (org.xmlpull.v1.XmlPullParser) r6     // Catch: java.lang.Throwable -> L7a
            java.io.StringReader r7 = new java.io.StringReader     // Catch: java.lang.Throwable -> L7a
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L7a
            r6.setInput(r7)     // Catch: java.lang.Throwable -> L7a
            kotlin.jvm.internal.f0 r6 = new kotlin.jvm.internal.f0     // Catch: java.lang.Throwable -> L7a
            r6.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r7 = r5.f391656d     // Catch: java.lang.Throwable -> L7a
            org.xmlpull.v1.XmlPullParser r7 = (org.xmlpull.v1.XmlPullParser) r7     // Catch: java.lang.Throwable -> L7a
            int r7 = r7.getEventType()     // Catch: java.lang.Throwable -> L7a
            r6.f391649d = r7     // Catch: java.lang.Throwable -> L7a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7a
            r7.<init>()     // Catch: java.lang.Throwable -> L7a
            g(r6, r5, r7)     // Catch: java.lang.Throwable -> L7a
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L7a
            if (r5 <= 0) goto L76
            java.lang.Object r5 = r7.get(r4)     // Catch: java.lang.Throwable -> L7a
            boolean r6 = r5 instanceof a84.z0     // Catch: java.lang.Throwable -> L7a
            if (r6 == 0) goto L71
            a84.z0 r5 = (a84.z0) r5     // Catch: java.lang.Throwable -> L7a
            goto L72
        L71:
            r5 = r3
        L72:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)     // Catch: java.lang.Throwable -> L7a
            goto L89
        L76:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)     // Catch: java.lang.Throwable -> L7a
            goto L15
        L7a:
            r5 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = "AD.XMLUtil"
            java.lang.String r8 = "readXmlNode() called"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r7, r5, r8, r6)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L15
        L89:
            r2 = 1967(0x7af, float:2.756E-42)
            if (r5 != 0) goto Lb4
            com.tencent.mm.plugin.report.service.g0 r6 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r7 = 6
            r6.A(r2, r7)
            if (r9 == 0) goto L9d
            java.lang.String r2 = ","
            java.lang.String r3 = ";"
            java.lang.String r3 = r26.i0.t(r9, r2, r3, r4)
        L9d:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = ""
            r9.<init>(r2)
            r9.append(r3)
            java.lang.String r9 = r9.toString()
            java.lang.String r2 = "report_xml_node_utils_error"
            java.lang.String r3 = "0"
            ca4.e0.b(r2, r3, r4, r4, r9)
            goto Lba
        Lb4:
            com.tencent.mm.plugin.report.service.g0 r9 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r3 = 7
            r9.A(r2, r3)
        Lba:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.e1.f(java.lang.String):a84.z0");
    }

    public static final void g(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.util.List list) {
        java.util.LinkedHashMap linkedHashMap;
        java.lang.Object obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("readXmlNodeInternal$readNode", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        while (f0Var.f391649d != 1) {
            int next = ((org.xmlpull.v1.XmlPullParser) h0Var.f391656d).next();
            f0Var.f391649d = next;
            if (next != 2) {
                if (next == 3) {
                    java.lang.String name = ((org.xmlpull.v1.XmlPullParser) h0Var.f391656d).getName();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                    obj = new a84.a1(name);
                } else if (next != 4) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AD.XMLUtil", "readNode unknown type = " + f0Var.f391649d);
                    obj = null;
                } else {
                    java.lang.String text = ((org.xmlpull.v1.XmlPullParser) h0Var.f391656d).getText();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
                    obj = new a84.b1(text);
                }
                linkedHashMap = linkedHashMap2;
            } else {
                java.lang.Integer num = (java.lang.Integer) linkedHashMap2.get(((org.xmlpull.v1.XmlPullParser) h0Var.f391656d).getName());
                int intValue = num != null ? num.intValue() + 1 : 1;
                java.lang.String name2 = ((org.xmlpull.v1.XmlPullParser) h0Var.f391656d).getName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "getName(...)");
                linkedHashMap2.put(name2, java.lang.Integer.valueOf(intValue));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i17 = intValue - 1;
                java.lang.String str = "";
                java.lang.String valueOf = i17 == 0 ? "" : java.lang.String.valueOf(i17);
                java.lang.String name3 = ((org.xmlpull.v1.XmlPullParser) h0Var.f391656d).getName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name3, "getName(...)");
                java.lang.Object element = h0Var.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(element, "element");
                org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) element;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                int attributeCount = xmlPullParser.getAttributeCount();
                int i18 = 0;
                while (i18 < attributeCount) {
                    java.lang.String attributeName = xmlPullParser.getAttributeName(i18);
                    java.util.LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    java.lang.String str2 = attributeName == null ? str : attributeName;
                    java.lang.String attributeValue = xmlPullParser.getAttributeValue(i18);
                    java.lang.String str3 = str;
                    if (attributeValue != null) {
                        str = attributeValue;
                    }
                    arrayList2.add(new jz5.l(str2, str));
                    i18++;
                    linkedHashMap2 = linkedHashMap3;
                    str = str3;
                }
                linkedHashMap = linkedHashMap2;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                a84.z0 z0Var = new a84.z0(name3, arrayList2, arrayList, ((org.xmlpull.v1.XmlPullParser) h0Var.f391656d).getName() + valueOf);
                g(f0Var, h0Var, arrayList);
                obj = z0Var;
            }
            if (obj != null) {
                list.add(obj);
                if (obj instanceof a84.a1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readXmlNodeInternal$readNode", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                    return;
                }
            }
            linkedHashMap2 = linkedHashMap;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("readXmlNodeInternal$readNode", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
    }

    public static final java.lang.String h(a84.z0 z0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("serialize", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (z0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("serialize", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            org.xmlpull.v1.XmlSerializer newSerializer = org.xmlpull.v1.XmlPullParserFactory.newInstance().newSerializer();
            newSerializer.setOutput(stringWriter);
            f83809a.i(z0Var, new a84.d1(newSerializer));
            newSerializer.endDocument();
            stringWriter.flush();
            stringWriter.close();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AD.XMLUtil", "cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            java.lang.String str = "" + ((java.lang.Object) stringWriter.getBuffer());
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("serialize", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return str;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AD.XMLUtil", th6, "serialize() called", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("serialize", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
    }

    public final a84.z0 d(a84.z0 z0Var, java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        if (i17 > 0 && i18 > i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        java.util.List<a84.c1> c17 = z0Var.c();
        if (c17 != null) {
            for (a84.c1 c1Var : c17) {
                if (c1Var instanceof a84.z0) {
                    a84.z0 z0Var2 = (a84.z0) c1Var;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z0Var2.b(), str)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                        return z0Var2;
                    }
                    a84.z0 d17 = f83809a.d(z0Var2, str, i17, i18 + 1);
                    if (d17 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                        return d17;
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagInternal", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [jz5.l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [a84.c1] */
    public final jz5.l e(a84.z0 z0Var, java.lang.String str) {
        a84.z0 z0Var2;
        boolean z17;
        java.util.List<??> c17;
        a84.z0 z0Var3 = z0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        jz5.l lVar = null;
        a84.z0 z0Var4 = null;
        if (z0Var3 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
            return null;
        }
        int i17 = 0;
        try {
            if (str == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                return null;
            }
            boolean z18 = true;
            java.util.List f07 = r26.n0.f0(str, new java.lang.String[]{"."}, false, 0, 6, null);
            try {
                if (f07.isEmpty()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                    return null;
                }
                java.util.List subList = f07.subList(1, f07.size());
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(subList.get(0), z0Var.b())) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                    return null;
                }
                if (subList.size() == 1) {
                    jz5.l lVar2 = new jz5.l(null, z0Var3);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                    return lVar2;
                }
                a84.z0 z0Var5 = z0Var3;
                a84.z0 z0Var6 = z0Var5;
                int i18 = 0;
                for (java.lang.Object obj : subList) {
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.lang.String str2 = (java.lang.String) obj;
                    if (i18 == 0) {
                        z17 = z18;
                    } else {
                        if (z0Var6 == null || (c17 = z0Var6.c()) == null) {
                            z0Var2 = null;
                        } else {
                            z0Var2 = z0Var4;
                            for (?? r47 : c17) {
                                if (r47 instanceof a84.z0) {
                                    a84.z0 z0Var7 = (a84.z0) r47;
                                    z0Var7.getClass();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAliasName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAliasName", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(z0Var7.f83916d, str2)) {
                                        z0Var2 = r47;
                                    }
                                }
                            }
                        }
                        if (z0Var2 == null && z0Var6 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAttributeList", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil$XmlNode$TagBegin");
                            java.util.List<??> list = z0Var6.f83914b;
                            if (list != null) {
                                for (?? r48 : list) {
                                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b('$' + ((java.lang.String) r48.f384366d), str2)) {
                                        z0Var2 = r48;
                                    }
                                }
                            }
                        }
                        if (z0Var2 == null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                            return null;
                        }
                        z17 = true;
                        if (i18 == subList.size() - 1) {
                            z0Var3 = z0Var6;
                            z0Var5 = z0Var2;
                        }
                        if (z0Var2 instanceof a84.z0) {
                            z0Var6 = z0Var2 instanceof a84.z0 ? z0Var2 : null;
                        }
                    }
                    z18 = z17;
                    i18 = i19;
                    z0Var4 = null;
                }
                jz5.l lVar3 = new jz5.l(z0Var3, z0Var5);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                return lVar3;
            } catch (java.lang.Throwable th6) {
                th = th6;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("AD.XMLUtil", th, "findByPathWithParent error !", new java.lang.Object[i17]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("findTagOrAttrByPathWithParent", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
                return lVar;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            lVar = null;
            i17 = 0;
        }
    }

    public final void i(a84.c1 c1Var, yz5.l f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("traverse", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f17, "f");
        f17.mo146xb9724478(c1Var);
        if (c1Var instanceof a84.z0) {
            java.util.Iterator it = ((a84.z0) c1Var).c().iterator();
            while (it.hasNext()) {
                f83809a.i((a84.c1) it.next(), f17);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("traverse", "com.tencent.mm.plugin.sns.ad.utils.XMLUtil");
    }
}
