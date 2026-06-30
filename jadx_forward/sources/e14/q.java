package e14;

/* loaded from: classes10.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f327974a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.StringBuilder f327975b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f327976c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f327977d;

    public q(java.lang.String str) {
        java.lang.ThreadLocal threadLocal = e14.r.f327978a;
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) threadLocal.get();
        this.f327974a = xmlPullParser;
        if (xmlPullParser == null) {
            org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            this.f327974a = newPullParser;
            threadLocal.set(newPullParser);
        }
        this.f327974a.setInput(new java.io.StringReader(str));
        this.f327977d = new java.util.HashMap();
        this.f327976c = new java.util.HashMap();
    }

    public java.util.Map a() {
        java.util.Map map;
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f327974a;
        int eventType = xmlPullParser.getEventType();
        while (true) {
            map = this.f327976c;
            if (eventType == 1) {
                break;
            }
            eventType = xmlPullParser.next();
            if (eventType == 2) {
                java.lang.StringBuilder sb6 = this.f327975b;
                sb6.append('.');
                sb6.append(xmlPullParser.getName());
                java.lang.String sb7 = this.f327975b.toString();
                int hashCode = sb7.hashCode();
                java.util.HashMap hashMap = (java.util.HashMap) this.f327977d;
                java.lang.Integer num = (java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(hashCode));
                if (num != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(num.intValue() + 1);
                    this.f327975b.append(valueOf);
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
                    ((java.util.HashMap) map).put(this.f327975b.toString(), text);
                }
            } else if (eventType == 3) {
                java.lang.StringBuilder sb8 = this.f327975b;
                java.lang.StringBuilder delete = sb8.delete(sb8.lastIndexOf("."), this.f327975b.length());
                this.f327975b = delete;
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
