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
            kVar.f36516b = element2.getAttribute("url");
            kVar.f36515a = k(element2, "targetVersion");
            kVar.f36517c = element2.getAttribute("md5");
            kVar.f36518d = h(element2, "useCellular");
            kVar.f36519e = h(element2, "useCdn");
            if (!element2.hasAttribute("patchType")) {
                kVar.f36520f = 1;
            } else if (element2.getAttribute("patchType").equals("1")) {
                kVar.f36520f = 1;
            } else {
                if (!element2.getAttribute("patchType").equals("2")) {
                    by5.c4.c("ConfigParser", "getPatches, error, unknown patchType");
                    return null;
                }
                kVar.f36520f = 2;
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
            iVar.f36478a = documentElement.getAttribute("checkvalue");
            iVar.f36479b = documentElement.getAttribute("signature");
            java.lang.String str2 = iVar.f36478a;
            if (str2 != null && str2.equalsIgnoreCase(a17)) {
                if (by5.s.a(iVar.f36478a, iVar.f36479b, "MHYwEAYHKoZIzj0CAQYFK4EEACIDYgAElTrKAIIFSlvo+nwaPfs/mOUwWxBMLvtZ\nLJzLBPmZsBp5JhCEf91FTaJTAnxQN77mxuzil4rN7YLV5S2h3nNOlKKfEnf4lpc4\nzsCGoyHQX0gGYYTAHPmL+qUv6MO4YMAn")) {
                    iVar.f36480c = documentElement.getAttribute("configVer");
                    iVar.f36482e = d(documentElement);
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
                    hVar.f36472b = element2.getAttribute("optype");
                    hVar.f36473c = element2.getAttribute("opvalue");
                    hVar.f36474d = element2.getAttribute("module");
                    e(hVar.f36471a, element2);
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
        jVar.f36491c = k(element, "apkMin");
        jVar.f36492d = k(element, "apkMax");
        jVar.f36493e = k(element, "usingApkMin");
        jVar.f36494f = k(element, "usingApkMax");
        jVar.f36495g = k(element, "preDownApkMin");
        jVar.f36496h = k(element, "preDownApkMax");
        jVar.f36489a = k(element, "sdkMin");
        jVar.f36490b = k(element, "sdkMax");
        jVar.f36497i = k(element, "apiMin");
        jVar.f36498j = k(element, "apiMax");
        jVar.f36499k = k(element, "targetApiMin");
        jVar.f36500l = k(element, "targetApiMax");
        jVar.f36501m = element.getAttribute("forbidDeviceRegex");
        jVar.f36502n = element.getAttribute("whiteDeviceRegex");
        jVar.f36512x = element.getAttribute("forbidAppRegex");
        jVar.f36513y = element.getAttribute("whiteAppRegex");
        jVar.f36503o = k(element, "grayMin");
        jVar.f36504p = k(element, "grayMax");
        jVar.f36505q = k(element, "dayGrayMin");
        jVar.f36506r = k(element, "dayGrayMax");
        jVar.f36507s = k(element, "chromeMin");
        jVar.f36508t = k(element, "chromeMax");
        jVar.f36509u = k(element, "usertype");
        jVar.f36514z = k(element, "x5sdkmin");
        jVar.A = k(element, "x5sdkmax");
        jVar.B = k(element, "x5coremin");
        jVar.C = k(element, "x5coremax");
        jVar.f36510v = i(element, "hoursStart", -1.0d);
        jVar.f36511w = i(element, "hoursEnd", -1.0d);
        jVar.E = element.getAttribute("runtimeAbis");
        jVar.G = element.getAttribute("blackRuntimeAbis");
        jVar.D = element.getAttribute("deviceAbis");
        jVar.F = element.getAttribute("blackDeviceAbis");
        jVar.H = l(element, "appClientVerMin");
        jVar.I = l(element, "appClientVerMax");
        jVar.f36488J = element.getAttribute("appInfoWhiteList");
        jVar.K = element.getAttribute("appInfoBlackList");
    }

    public static void f(by5.l lVar, org.w3c.dom.Element element) {
        org.w3c.dom.NodeList elementsByTagName = element.getElementsByTagName("PluginInfo");
        if (elementsByTagName == null || elementsByTagName.getLength() == 0) {
            return;
        }
        lVar.f36526d = new by5.m[elementsByTagName.getLength()];
        for (int i17 = 0; i17 < elementsByTagName.getLength(); i17++) {
            org.w3c.dom.Element element2 = (org.w3c.dom.Element) elementsByTagName.item(i17);
            by5.m mVar = new by5.m();
            mVar.f36532x = element2.getAttribute(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            mVar.f36448a = k(element2, "version");
            mVar.f36451d = element2.getAttribute("fullurl");
            mVar.f36459l = element2.getAttribute("md5");
            mVar.f36461n = h(element2, "useCellular");
            mVar.f36463p = h(element2, "lowPriority");
            mVar.f36462o = h(element2, "useCdn");
            mVar.f36458k = k(element2, "period");
            mVar.f36449b = k(element2, "versionId");
            mVar.f36455h = element2.getAttribute("updateSchedule");
            mVar.f36456i = element2.getAttribute("releaseDate");
            mVar.f36464q = element2.getAttribute("UPDATE_SPEED_CONFIG");
            mVar.f36465r = element2.getAttribute("UPDATE_FORWARD_SPEED_CONFIG");
            mVar.f36466s = element2.getAttribute("UPDATE_SCHEDULE_TIME_RANGE_BIND");
            mVar.f36453f = j(element2, "updateStartTime", -1.0f);
            mVar.f36454g = j(element2, "updateEndTime", -1.0f);
            e(mVar.f36450c, element2);
            mVar.f36457j = b(element2);
            lVar.f36526d[i17] = mVar;
        }
    }

    public static void g(by5.i iVar, org.w3c.dom.Element element) {
        org.w3c.dom.NodeList elementsByTagName;
        org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("VersionInfo");
        if (elementsByTagName2 == null || elementsByTagName2.getLength() == 0) {
            return;
        }
        iVar.f36481d = new by5.n[elementsByTagName2.getLength()];
        for (int i17 = 0; i17 < elementsByTagName2.getLength(); i17++) {
            by5.n nVar = new by5.n();
            org.w3c.dom.Element element2 = (org.w3c.dom.Element) elementsByTagName2.item(i17);
            nVar.f36451d = element2.getAttribute("fullurl");
            nVar.f36452e = element2.getAttribute("fullSevenZipUrl");
            nVar.f36459l = element2.getAttribute("md5");
            nVar.f36460m = element2.getAttribute("sevenZipMd5");
            e(nVar.f36450c, element2);
            nVar.f36458k = k(element2, "period");
            nVar.f36448a = k(element2, "version");
            nVar.f36461n = h(element2, "useCellular");
            nVar.f36463p = h(element2, "lowPriority");
            nVar.f36462o = h(element2, "useCdn");
            nVar.f36449b = k(element2, "versionId");
            nVar.f36455h = element2.getAttribute("updateSchedule");
            nVar.f36456i = element2.getAttribute("releaseDate");
            element2.getAttribute("updateHourSpeed");
            nVar.f36464q = element2.getAttribute("UPDATE_SPEED_CONFIG");
            nVar.f36465r = element2.getAttribute("UPDATE_FORWARD_SPEED_CONFIG");
            nVar.f36466s = element2.getAttribute("UPDATE_SCHEDULE_TIME_RANGE_BIND");
            nVar.f36453f = j(element2, "updateStartTime", -1.0f);
            nVar.f36454g = j(element2, "updateEndTime", -1.0f);
            nVar.f36467t = h(element2, "forbidDownloadWhenNoUin");
            boolean h17 = h(element2, "useBootsFlowControl");
            nVar.f36468u = h17;
            if (h17) {
                nVar.f36469v = element2.getAttribute("bootsFlowControlKey");
                nVar.f36470w = element2.getAttribute("bootsFlowControlKeyExpirationDate");
            }
            java.lang.String attribute = element2.getAttribute("tryUseSharedCore");
            if (attribute != null && !attribute.isEmpty()) {
                nVar.f36560y = java.lang.Boolean.parseBoolean(attribute);
            }
            nVar.f36561z = h(element2, "supportPredown");
            by5.o oVar = nVar.f36559x;
            if (oVar != null && (elementsByTagName = element2.getElementsByTagName("Description")) != null && elementsByTagName.getLength() != 0) {
                oVar.f36575a = ((org.w3c.dom.Element) elementsByTagName.item(0)).getAttribute("versionStr");
            }
            nVar.f36457j = b(element2);
            iVar.f36481d[i17] = nVar;
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
