package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes10.dex */
public class z9 {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f274672a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.StringBuilder f274673b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f274674c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f274675d;

    public z9(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.ThreadLocal threadLocal = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.f273998b;
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) threadLocal.get();
        this.f274672a = xmlPullParser;
        if (xmlPullParser == null) {
            org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            this.f274672a = newPullParser;
            threadLocal.set(newPullParser);
        }
        this.f274672a.setInput(new java.io.StringReader(str));
        this.f274675d = new java.util.HashMap();
        this.f274674c = new java.util.HashMap();
    }

    public java.util.Map a() {
        java.util.Map map;
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f274672a;
        int eventType = xmlPullParser.getEventType();
        while (true) {
            map = this.f274674c;
            if (eventType == 1) {
                break;
            }
            eventType = xmlPullParser.next();
            if (eventType == 2) {
                java.lang.StringBuilder sb6 = this.f274673b;
                sb6.append('.');
                sb6.append(xmlPullParser.getName());
                java.lang.String sb7 = this.f274673b.toString();
                int hashCode = sb7.hashCode();
                java.util.HashMap hashMap = (java.util.HashMap) this.f274675d;
                java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(hashCode));
                if (num != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(num.intValue() + 1);
                    this.f274673b.append(valueOf);
                    hashMap.put(java.lang.Integer.valueOf(hashCode), valueOf);
                    sb7 = sb7 + valueOf;
                } else {
                    hashMap.put(java.lang.Integer.valueOf(hashCode), 0);
                }
                java.util.HashMap hashMap2 = (java.util.HashMap) map;
                hashMap2.put(sb7, "");
                for (int i17 = 0; i17 < xmlPullParser.getAttributeCount(); i17++) {
                    hashMap2.put(sb7 + ".$" + xmlPullParser.getAttributeName(i17), xmlPullParser.getAttributeValue(i17));
                }
            } else if (eventType == 4) {
                java.lang.String text = xmlPullParser.getText();
                if (text != null) {
                    ((java.util.HashMap) map).put(this.f274673b.toString(), text);
                }
            } else if (eventType == 3) {
                java.lang.StringBuilder sb8 = this.f274673b;
                java.lang.StringBuilder delete = sb8.delete(sb8.lastIndexOf("."), this.f274673b.length());
                this.f274673b = delete;
                if (delete.length() == 0) {
                    break;
                }
            } else {
                continue;
            }
        }
        return map;
    }
}
