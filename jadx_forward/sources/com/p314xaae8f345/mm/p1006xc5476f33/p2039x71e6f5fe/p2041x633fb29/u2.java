package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes15.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2 f240607a = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2();

    public void a(java.lang.String str) {
        java.lang.String text;
        org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        org.xmlpull.v1.XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(new java.io.StringReader(str));
        int eventType = newPullParser.getEventType();
        java.lang.String str2 = "";
        while (true) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2 t2Var = this.f240607a;
            if (eventType == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2.f240582v = t2Var;
                return;
            }
            if (eventType == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.t2.f240582v = t2Var;
            } else if (eventType == 2) {
                java.lang.String name = newPullParser.getName();
                if (name.equals(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d)) {
                    t2Var.f240583a = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.r2(newPullParser.getAttributeValue(null, "firstName"), newPullParser.getAttributeValue(null, "middleName"), newPullParser.getAttributeValue(null, "lastName"));
                } else if (name.equals("address")) {
                    t2Var.f240588f = b(newPullParser);
                } else if (name.equals("deliveryAddress")) {
                    t2Var.f240589g = b(newPullParser);
                } else if (name.equals("homeAddress")) {
                    t2Var.f240590h = b(newPullParser);
                } else if (name.equals("workAddress")) {
                    t2Var.f240591i = b(newPullParser);
                } else if (name.equals("photo")) {
                    c(newPullParser);
                    t2Var.getClass();
                } else if (name.equals("logo")) {
                    t2Var.f240586d = c(newPullParser);
                } else if (name.equals("sound")) {
                    c(newPullParser);
                    t2Var.getClass();
                }
                str2 = name;
            } else if (eventType == 4 && (text = newPullParser.getText()) != null && text.trim().length() > 0) {
                java.lang.String trim = text.trim();
                if (str2.equals("nickName")) {
                    t2Var.f240584b = trim;
                } else if (str2.equals("photoUrl")) {
                    t2Var.f240585c = trim;
                } else if (str2.equals("birthday")) {
                    t2Var.f240587e = trim;
                } else if (str2.equals("mobilePhoneNumber")) {
                    if (t2Var.f240592j == null) {
                        t2Var.f240592j = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f240592j).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f240592j).add(trim);
                    }
                } else if (str2.equals("homePhoneNumber")) {
                    if (t2Var.f240593k == null) {
                        t2Var.f240593k = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f240593k).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f240593k).add(trim);
                    }
                } else if (str2.equals("workPhoneNumber")) {
                    if (t2Var.f240594l == null) {
                        t2Var.f240594l = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f240594l).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f240594l).add(trim);
                    }
                } else if (str2.equals("telAVPhoneNumber")) {
                    if (t2Var.f240595m == null) {
                        t2Var.f240595m = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f240595m).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f240595m).add(trim);
                    }
                } else if (str2.equals("phoneNumber")) {
                    if (t2Var.f240596n == null) {
                        t2Var.f240596n = new java.util.ArrayList();
                    }
                    if (trim != null && !((java.util.ArrayList) t2Var.f240596n).contains(trim)) {
                        ((java.util.ArrayList) t2Var.f240596n).add(trim);
                    }
                } else if (str2.equals(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5852x3f0537c)) {
                    t2Var.f240597o = trim;
                } else if (str2.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
                    t2Var.f240598p = trim;
                } else if (str2.equals("role")) {
                    t2Var.f240599q = trim;
                } else if (str2.equals("agent")) {
                    t2Var.f240600r = trim;
                } else if (str2.equals("note")) {
                    t2Var.f240601s = trim;
                } else if (str2.equals("url")) {
                    t2Var.f240602t = trim;
                } else if (str2.equals("organization")) {
                    t2Var.f240603u = trim;
                }
            }
            eventType = newPullParser.next();
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2 b(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.q2(xmlPullParser.getAttributeValue(null, "postOfficeBox"), xmlPullParser.getAttributeValue(null, "extendedAddress"), xmlPullParser.getAttributeValue(null, "street"), xmlPullParser.getAttributeValue(null, com.p314xaae8f345.map.p490x3f94e06.p491x35c0ce.p493x21ffc6bd.C4228xde5cfc7f.f16279xc3c8dbad), xmlPullParser.getAttributeValue(null, "region"), xmlPullParser.getAttributeValue(null, "postalCode"), xmlPullParser.getAttributeValue(null, "country"));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s2 c(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.s2(xmlPullParser.getAttributeValue(null, "type"), xmlPullParser.getAttributeValue(null, "buffer"));
    }
}
