package y91;

/* loaded from: classes15.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f541834a = android.util.Xml.newPullParser();

    public java.util.HashMap a(java.lang.String str) {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(str.getBytes());
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f541834a;
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            xmlPullParser.setInput(byteArrayInputStream, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
            xmlPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                java.lang.String name = xmlPullParser.getName();
                if (name == null) {
                    eventType = xmlPullParser.next();
                } else {
                    if (eventType == 2) {
                        aa1.a aVar = new aa1.a();
                        int attributeCount = xmlPullParser.getAttributeCount();
                        for (int i17 = 0; i17 < attributeCount; i17++) {
                            aVar.f84015b.b(xmlPullParser.getAttributeName(i17), xmlPullParser.getAttributeValue(i17));
                        }
                        int next = xmlPullParser.next();
                        if (next == 2) {
                            hashMap.put(name, aVar);
                            eventType = next;
                        } else if (next == 4) {
                            aVar.f84014a = xmlPullParser.getText().trim();
                            hashMap.put(name, aVar);
                        } else if (next == 3) {
                            hashMap.put(name, aVar);
                        }
                    }
                    eventType = xmlPullParser.next();
                }
            }
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
        }
        return hashMap;
    }

    public x91.c b(java.io.InputStream inputStream) {
        x91.c cVar;
        synchronized (y91.l0.class) {
            x91.c cVar2 = null;
            try {
                this.f541834a.setInput(inputStream, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                int eventType = this.f541834a.getEventType();
                cVar = new x91.c();
                x91.l lVar = null;
                while (eventType != 1) {
                    if (eventType == 2) {
                        java.lang.String name = this.f541834a.getName();
                        if ("major".equalsIgnoreCase(name)) {
                            java.lang.String nextText = this.f541834a.nextText();
                            if (!android.text.TextUtils.isEmpty(nextText)) {
                                cVar.f534169d = java.lang.Integer.parseInt(nextText);
                            }
                        } else if ("minor".equalsIgnoreCase(name)) {
                            java.lang.String nextText2 = this.f541834a.nextText();
                            if (!android.text.TextUtils.isEmpty(nextText2)) {
                                cVar.f534170e = java.lang.Integer.parseInt(nextText2);
                            }
                        } else if ("deviceType".equalsIgnoreCase(name)) {
                            cVar.f534171f = this.f541834a.nextText();
                        } else if ("friendlyName".equalsIgnoreCase(name)) {
                            cVar.f534172g = this.f541834a.nextText();
                        } else if ("UDN".equalsIgnoreCase(name)) {
                            cVar.f534174i = this.f541834a.nextText();
                        } else if ("manufacturer".equalsIgnoreCase(name)) {
                            cVar.f534173h = this.f541834a.nextText();
                        } else if ("service".equalsIgnoreCase(name)) {
                            lVar = new x91.l();
                        } else if ("serviceType".equalsIgnoreCase(name)) {
                            if (lVar != null) {
                                lVar.f534197a = this.f541834a.nextText();
                            }
                        } else if ("serviceId".equalsIgnoreCase(name)) {
                            if (lVar != null) {
                                lVar.f534198b = this.f541834a.nextText();
                            }
                        } else if ("controlURL".equalsIgnoreCase(name)) {
                            if (lVar != null) {
                                lVar.f534200d = this.f541834a.nextText();
                            }
                        } else if ("eventSubURL".equalsIgnoreCase(name)) {
                            if (lVar != null) {
                                lVar.f534201e = this.f541834a.nextText();
                            }
                        } else if ("SCPDURL".equalsIgnoreCase(name) && lVar != null) {
                            lVar.f534199c = this.f541834a.nextText();
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        try {
                            if ("service".equalsIgnoreCase(this.f541834a.getName()) && lVar != null) {
                                cVar.f534175j.add(lVar);
                                lVar = null;
                            }
                        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
                            cVar2 = cVar;
                            cVar = cVar2;
                            return cVar;
                        }
                    }
                    eventType = this.f541834a.next();
                }
            } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused2) {
            }
        }
        return cVar;
    }

    public aa1.b c(java.lang.String str) {
        aa1.b bVar = null;
        if (str == null) {
            return null;
        }
        if (str.startsWith("NOTIFY") || str.startsWith("HTTP")) {
            bVar = new aa1.b();
            java.lang.String[] split = str.split(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e);
            if (split.length > 0) {
                java.lang.String[] split2 = split[0].split(" ");
                if (split2[0].startsWith("HTTP")) {
                    bVar.b("VERSION", split2[0]);
                    bVar.b("RESPONSE_CODE", split2[1]);
                    bVar.b("RESPONSE_DESCRIPTION", split2[2]);
                } else {
                    bVar.b("METHOD", split2[0]);
                    bVar.b("PATH", split2[1]);
                    bVar.b("VERSION", split2[2]);
                }
            }
            for (int i17 = 1; i17 < split.length; i17++) {
                java.lang.String str2 = split[i17];
                int indexOf = str2.indexOf(":");
                bVar.b(str2.substring(0, indexOf).toUpperCase(), str2.substring(indexOf + 1, str2.length()).trim());
            }
        }
        return bVar;
    }
}
