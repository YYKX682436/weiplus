package com.p314xaae8f345.mm.p957x53236a1b;

/* loaded from: classes12.dex */
public class f {
    public com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e a(java.lang.String str) {
        java.lang.String text;
        java.lang.String str2 = "";
        com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e c11133xdc5bf27e = new com.p314xaae8f345.mm.p957x53236a1b.C11133xdc5bf27e("", "");
        org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        org.xmlpull.v1.XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(new java.io.StringReader(str));
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2) {
                str2 = newPullParser.getName();
            } else if (eventType == 4 && (text = newPullParser.getText()) != null && text.trim().length() > 0) {
                java.lang.String trim = text.trim();
                if (str2.equalsIgnoreCase(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
                    c11133xdc5bf27e.f152809d = trim;
                } else if (str2.equalsIgnoreCase(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24)) {
                    c11133xdc5bf27e.f152810e = trim;
                } else if (str2.equalsIgnoreCase("type")) {
                    try {
                        c11133xdc5bf27e.f152811f = java.lang.Integer.valueOf(trim);
                    } catch (java.lang.Exception unused) {
                        c11133xdc5bf27e.f152811f = 0;
                    }
                }
            }
        }
        return c11133xdc5bf27e;
    }
}
