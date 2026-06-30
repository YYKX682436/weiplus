package by5;

/* loaded from: classes13.dex */
public abstract class p {
    public static java.lang.String a(java.io.File file, int i17, java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        try {
            byte[] bArr = new byte[i17];
            fileInputStream = new java.io.FileInputStream(file);
            try {
                int read = fileInputStream.read(bArr, 0, i17);
                if (read != i17) {
                    return null;
                }
                java.lang.String str2 = new java.lang.String(bArr, 0, read);
                int indexOf = str2.indexOf(str);
                if (indexOf < 0) {
                    return null;
                }
                byte[] digest = java.security.MessageDigest.getInstance("MD5").digest(str2.substring(indexOf).getBytes());
                if (digest != null && digest.length != 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(digest.length);
                    for (byte b17 : digest) {
                        java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
                        if (hexString.length() == 1) {
                            sb6.append(0);
                        }
                        sb6.append(hexString);
                    }
                    return sb6.toString().toUpperCase();
                }
                return null;
            } catch (java.lang.Throwable th6) {
                th = th6;
                try {
                    by5.c4.c("ConfigParser", "getConfigCheckValue error:" + th);
                    return null;
                } finally {
                    by5.u.l(fileInputStream);
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            fileInputStream = null;
        }
    }

    public static by5.k[] b(org.w3c.dom.Element element) {
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName("Patch");
        if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
            return null;
        }
        by5.k[] kVarArr = new by5.k[elementsByTagName.getLength()];
        for (int i17 = 0; i17 < elementsByTagName.getLength(); i17++) {
            by5.k kVar = new by5.k();
            org.w3c.dom.Element element2 = (org.w3c.dom.Element) elementsByTagName.item(i17);
            kVar.f118049b = element2.getAttribute("url");
            kVar.f118048a = k(element2, "targetVersion");
            kVar.f118050c = element2.getAttribute("md5");
            kVar.f118051d = h(element2, "useCellular");
            kVar.f118052e = h(element2, "useCdn");
            if (!element2.hasAttribute("patchType")) {
                kVar.f118053f = 1;
            } else if (element2.getAttribute("patchType").equals("1")) {
                kVar.f118053f = 1;
            } else {
                if (!element2.getAttribute("patchType").equals("2")) {
                    by5.c4.c("ConfigParser", "getPatches, error, unknown patchType");
                    return null;
                }
                kVar.f118053f = 2;
            }
            kVarArr[i17] = kVar;
        }
        return kVarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static by5.i c(java.lang.String str) {
        java.io.FileInputStream fileInputStream;
        java.io.FileInputStream fileInputStream2;
        java.io.FileInputStream fileInputStream3;
        java.io.FileInputStream fileInputStream4;
        java.io.FileInputStream fileInputStream5;
        java.io.FileInputStream fileInputStream6;
        by5.i iVar;
        org.w3c.dom.Element documentElement;
        java.io.FileInputStream fileInputStream7 = null;
        if (str == null) {
            by5.c4.a("ConfigParser", "parse config failed, path is empty");
            return null;
        }
        java.io.File file = new java.io.File(str);
        if (!file.exists()) {
            by5.c4.a("ConfigParser", "parse config failed, file not exist");
            return null;
        }
        java.lang.String a17 = a(file, (int) file.length(), "<Versions>");
        by5.c4.f("ConfigParser", "parse base config, file:" + file.getAbsolutePath());
        javax.xml.parsers.DocumentBuilderFactory newInstance = javax.xml.parsers.DocumentBuilderFactory.newInstance();
        try {
            try {
                fileInputStream4 = new java.io.FileInputStream(file);
                try {
                    try {
                        iVar = new by5.i();
                        try {
                            documentElement = newInstance.newDocumentBuilder().parse(fileInputStream4).getDocumentElement();
                        } catch (java.io.IOException e17) {
                            e = e17;
                            fileInputStream7 = iVar;
                            fileInputStream3 = fileInputStream7;
                            fileInputStream7 = fileInputStream4;
                            by5.c4.a("ConfigParser", "parse config failed, IOException:" + e);
                            fileInputStream5 = fileInputStream3;
                            by5.u.l(fileInputStream7);
                            fileInputStream6 = fileInputStream5;
                            return fileInputStream6;
                        } catch (javax.xml.parsers.ParserConfigurationException e18) {
                            e = e18;
                            fileInputStream7 = iVar;
                            fileInputStream2 = fileInputStream7;
                            fileInputStream7 = fileInputStream4;
                            by5.c4.a("ConfigParser", "parse config failed, ParserConfigurationException:" + e);
                            fileInputStream5 = fileInputStream2;
                            by5.u.l(fileInputStream7);
                            fileInputStream6 = fileInputStream5;
                            return fileInputStream6;
                        } catch (org.xml.sax.SAXException e19) {
                            e = e19;
                            fileInputStream7 = iVar;
                            fileInputStream = fileInputStream7;
                            fileInputStream7 = fileInputStream4;
                            by5.c4.a("ConfigParser", "parse config failed, SAXException:" + e);
                            fileInputStream5 = fileInputStream;
                            by5.u.l(fileInputStream7);
                            fileInputStream6 = fileInputStream5;
                            return fileInputStream6;
                        }
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        by5.u.l(fileInputStream4);
                        throw th;
                    }
                } catch (java.io.IOException e27) {
                    e = e27;
                } catch (javax.xml.parsers.ParserConfigurationException e28) {
                    e = e28;
                } catch (org.xml.sax.SAXException e29) {
                    e = e29;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                fileInputStream4 = null;
            }
        } catch (java.io.IOException e37) {
            e = e37;
            fileInputStream3 = null;
        } catch (javax.xml.parsers.ParserConfigurationException e38) {
            e = e38;
            fileInputStream2 = null;
        } catch (org.xml.sax.SAXException e39) {
            e = e39;
            fileInputStream = null;
        }
        if (documentElement == null) {
            by5.c4.a("ConfigParser", "parse config failed, xml is corrupted");
        } else {
            iVar.f118011a = documentElement.getAttribute("checkvalue");
            iVar.f118012b = documentElement.getAttribute("signature");
            java.lang.String str2 = iVar.f118011a;
            if (str2 != null && str2.equalsIgnoreCase(a17)) {
                if (by5.s.a(iVar.f118011a, iVar.f118012b, "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAElTrKAIIFSlvo+nwaPfs/mOUwWxBMLvtZ\nLJzLBPmZsBp5JhCEf91FTaJTAnxQN77mxuzil4rN7YLV5S2h3nNOlKKfEnf4lpc4\nzsCGoyHQX0gGYYTAHPmL+qUv6MO4YMAn")) {
                    iVar.f118013c = documentElement.getAttribute("configVer");
                    iVar.f118015e = d(documentElement);
                    g(iVar, documentElement);
                    by5.u.l(fileInputStream4);
                    fileInputStream6 = iVar;
                    return fileInputStream6;
                }
                by5.s0.d(95L, 1);
                by5.c4.a("ConfigParser", "parse config failed, signature not match");
            }
            by5.s0.d(34L, 1);
            by5.c4.a("ConfigParser", "parse config failed, checkValue not match");
        }
        by5.u.l(fileInputStream4);
        return null;
    }

    public static by5.h[] d(org.w3c.dom.Element element) {
        if (element == null) {
            return null;
        }
        try {
            org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName("command");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("parseCommandList, size:");
            sb6.append(elementsByTagName != null ? elementsByTagName.getLength() : 0);
            by5.c4.b("ConfigParser", sb6.toString());
            if (elementsByTagName != null && elementsByTagName.getLength() != 0) {
                by5.h[] hVarArr = new by5.h[elementsByTagName.getLength()];
                for (int i17 = 0; i17 < elementsByTagName.getLength(); i17++) {
                    by5.h hVar = new by5.h();
                    org.w3c.dom.Element element2 = (org.w3c.dom.Element) elementsByTagName.item(i17);
                    hVar.f118005b = element2.getAttribute("optype");
                    hVar.f118006c = element2.getAttribute("opvalue");
                    hVar.f118007d = element2.getAttribute("module");
                    e(hVar.f118004a, element2);
                    hVarArr[i17] = hVar;
                }
                return hVarArr;
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d("ConfigParser", "parseCommandList error", th6);
        }
        return null;
    }

    public static void e(by5.j jVar, org.w3c.dom.Element element) {
        jVar.f118024c = k(element, "apkMin");
        jVar.f118025d = k(element, "apkMax");
        jVar.f118026e = k(element, "usingApkMin");
        jVar.f118027f = k(element, "usingApkMax");
        jVar.f118028g = k(element, "preDownApkMin");
        jVar.f118029h = k(element, "preDownApkMax");
        jVar.f118022a = k(element, "sdkMin");
        jVar.f118023b = k(element, "sdkMax");
        jVar.f118030i = k(element, "apiMin");
        jVar.f118031j = k(element, "apiMax");
        jVar.f118032k = k(element, "targetApiMin");
        jVar.f118033l = k(element, "targetApiMax");
        jVar.f118034m = element.getAttribute("forbidDeviceRegex");
        jVar.f118035n = element.getAttribute("whiteDeviceRegex");
        jVar.f118045x = element.getAttribute("forbidAppRegex");
        jVar.f118046y = element.getAttribute("whiteAppRegex");
        jVar.f118036o = k(element, "grayMin");
        jVar.f118037p = k(element, "grayMax");
        jVar.f118038q = k(element, "dayGrayMin");
        jVar.f118039r = k(element, "dayGrayMax");
        jVar.f118040s = k(element, "chromeMin");
        jVar.f118041t = k(element, "chromeMax");
        jVar.f118042u = k(element, "usertype");
        jVar.f118047z = k(element, "x5sdkmin");
        jVar.A = k(element, "x5sdkmax");
        jVar.B = k(element, "x5coremin");
        jVar.C = k(element, "x5coremax");
        jVar.f118043v = i(element, "hoursStart", -1.0d);
        jVar.f118044w = i(element, "hoursEnd", -1.0d);
        jVar.E = element.getAttribute("runtimeAbis");
        jVar.G = element.getAttribute("blackRuntimeAbis");
        jVar.D = element.getAttribute("deviceAbis");
        jVar.F = element.getAttribute("blackDeviceAbis");
        jVar.H = l(element, "appClientVerMin");
        jVar.I = l(element, "appClientVerMax");
        jVar.f118021J = element.getAttribute("appInfoWhiteList");
        jVar.K = element.getAttribute("appInfoBlackList");
    }

    public static void f(by5.l lVar, org.w3c.dom.Element element) {
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName("PluginInfo");
        if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
            return;
        }
        lVar.f118059d = new by5.m[elementsByTagName.getLength()];
        for (int i17 = 0; i17 < elementsByTagName.getLength(); i17++) {
            org.w3c.dom.Element element2 = (org.w3c.dom.Element) elementsByTagName.item(i17);
            by5.m mVar = new by5.m();
            mVar.f118065x = element2.getAttribute(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
            mVar.f117981a = k(element2, "version");
            mVar.f117984d = element2.getAttribute("fullurl");
            mVar.f117992l = element2.getAttribute("md5");
            mVar.f117994n = h(element2, "useCellular");
            mVar.f117996p = h(element2, "lowPriority");
            mVar.f117995o = h(element2, "useCdn");
            mVar.f117991k = k(element2, "period");
            mVar.f117982b = k(element2, "versionId");
            mVar.f117988h = element2.getAttribute("updateSchedule");
            mVar.f117989i = element2.getAttribute("releaseDate");
            mVar.f117997q = element2.getAttribute("UPDATE_SPEED_CONFIG");
            mVar.f117998r = element2.getAttribute("UPDATE_FORWARD_SPEED_CONFIG");
            mVar.f117999s = element2.getAttribute("UPDATE_SCHEDULE_TIME_RANGE_BIND");
            mVar.f117986f = j(element2, "updateStartTime", -1.0f);
            mVar.f117987g = j(element2, "updateEndTime", -1.0f);
            e(mVar.f117983c, element2);
            mVar.f117990j = b(element2);
            lVar.f118059d[i17] = mVar;
        }
    }

    public static void g(by5.i iVar, org.w3c.dom.Element element) {
        org.w3c.dom.NodeList elementsByTagName;
        org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("VersionInfo");
        if (elementsByTagName2 == null || elementsByTagName2.getLength() == 0) {
            return;
        }
        iVar.f118014d = new by5.n[elementsByTagName2.getLength()];
        for (int i17 = 0; i17 < elementsByTagName2.getLength(); i17++) {
            by5.n nVar = new by5.n();
            org.w3c.dom.Element element2 = (org.w3c.dom.Element) elementsByTagName2.item(i17);
            nVar.f117984d = element2.getAttribute("fullurl");
            nVar.f117985e = element2.getAttribute("fullSevenZipUrl");
            nVar.f117992l = element2.getAttribute("md5");
            nVar.f117993m = element2.getAttribute("sevenZipMd5");
            e(nVar.f117983c, element2);
            nVar.f117991k = k(element2, "period");
            nVar.f117981a = k(element2, "version");
            nVar.f117994n = h(element2, "useCellular");
            nVar.f117996p = h(element2, "lowPriority");
            nVar.f117995o = h(element2, "useCdn");
            nVar.f117982b = k(element2, "versionId");
            nVar.f117988h = element2.getAttribute("updateSchedule");
            nVar.f117989i = element2.getAttribute("releaseDate");
            element2.getAttribute("updateHourSpeed");
            nVar.f117997q = element2.getAttribute("UPDATE_SPEED_CONFIG");
            nVar.f117998r = element2.getAttribute("UPDATE_FORWARD_SPEED_CONFIG");
            nVar.f117999s = element2.getAttribute("UPDATE_SCHEDULE_TIME_RANGE_BIND");
            nVar.f117986f = j(element2, "updateStartTime", -1.0f);
            nVar.f117987g = j(element2, "updateEndTime", -1.0f);
            nVar.f118000t = h(element2, "forbidDownloadWhenNoUin");
            boolean h17 = h(element2, "useBootsFlowControl");
            nVar.f118001u = h17;
            if (h17) {
                nVar.f118002v = element2.getAttribute("bootsFlowControlKey");
                nVar.f118003w = element2.getAttribute("bootsFlowControlKeyExpirationDate");
            }
            java.lang.String attribute = element2.getAttribute("tryUseSharedCore");
            if (attribute != null && !attribute.isEmpty()) {
                nVar.f118093y = java.lang.Boolean.parseBoolean(attribute);
            }
            nVar.f118094z = h(element2, "supportPredown");
            by5.o oVar = nVar.f118092x;
            if (oVar != null && (elementsByTagName = element2.getElementsByTagName("Description")) != null && elementsByTagName.getLength() != 0) {
                oVar.f118108a = ((org.w3c.dom.Element) elementsByTagName.item(0)).getAttribute("versionStr");
            }
            nVar.f117990j = b(element2);
            iVar.f118014d[i17] = nVar;
        }
    }

    public static boolean h(org.w3c.dom.Element element, java.lang.String str) {
        java.lang.String attribute;
        if (element != null && (attribute = element.getAttribute(str)) != null && !attribute.isEmpty()) {
            try {
                return java.lang.Boolean.parseBoolean(attribute);
            } catch (java.lang.Throwable th6) {
                by5.c4.d("ConfigParser", "safeGetBoolean error", th6);
            }
        }
        return false;
    }

    public static double i(org.w3c.dom.Element element, java.lang.String str, double d17) {
        java.lang.String attribute;
        if (element != null && (attribute = element.getAttribute(str)) != null && !attribute.isEmpty()) {
            try {
                return java.lang.Double.parseDouble(attribute);
            } catch (java.lang.Throwable th6) {
                by5.c4.d("ConfigParser", "safeGetDouble error", th6);
            }
        }
        return d17;
    }

    public static float j(org.w3c.dom.Element element, java.lang.String str, float f17) {
        java.lang.String attribute;
        if (element != null && (attribute = element.getAttribute(str)) != null && !attribute.isEmpty()) {
            try {
                return java.lang.Float.parseFloat(attribute);
            } catch (java.lang.Throwable th6) {
                by5.c4.d("ConfigParser", "safeGetFloat error", th6);
            }
        }
        return f17;
    }

    public static int k(org.w3c.dom.Element element, java.lang.String str) {
        java.lang.String attribute;
        if (element != null && (attribute = element.getAttribute(str)) != null && !attribute.isEmpty()) {
            try {
                return java.lang.Integer.parseInt(attribute);
            } catch (java.lang.Throwable th6) {
                by5.c4.d("ConfigParser", "safeGetInt error", th6);
            }
        }
        return 0;
    }

    public static int l(org.w3c.dom.Element element, java.lang.String str) {
        java.lang.String attribute;
        if (element != null && (attribute = element.getAttribute(str)) != null && !attribute.isEmpty()) {
            if (attribute.contains("0x")) {
                attribute = attribute.trim().substring(2);
            }
            try {
                return java.lang.Integer.parseInt(attribute, 16);
            } catch (java.lang.Throwable th6) {
                by5.c4.d("ConfigParser", "safeGetIntFromHex error", th6);
            }
        }
        return 0;
    }
}
