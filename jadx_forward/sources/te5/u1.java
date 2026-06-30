package te5;

/* loaded from: classes12.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f500285a;

    /* renamed from: b, reason: collision with root package name */
    public final org.xmlpull.v1.XmlSerializer f500286b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.StringBuilder f500287c;

    public u1(java.lang.String str) {
        java.lang.ThreadLocal threadLocal = new java.lang.ThreadLocal();
        java.lang.ThreadLocal threadLocal2 = new java.lang.ThreadLocal();
        this.f500287c = new java.lang.StringBuilder();
        if (threadLocal.get() == null) {
            org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newPullParser);
            this.f500285a = newPullParser;
            threadLocal.set(newPullParser);
        }
        java.lang.Object obj = threadLocal.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        org.xmlpull.v1.XmlPullParser xmlPullParser = (org.xmlpull.v1.XmlPullParser) obj;
        xmlPullParser.setInput(new java.io.StringReader(str));
        this.f500285a = xmlPullParser;
        if (threadLocal2.get() == null) {
            org.xmlpull.v1.XmlSerializer newSerializer = org.xmlpull.v1.XmlPullParserFactory.newInstance().newSerializer();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(newSerializer);
            this.f500286b = newSerializer;
            threadLocal2.set(newSerializer);
        }
        java.lang.Object obj2 = threadLocal2.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        this.f500286b = (org.xmlpull.v1.XmlSerializer) obj2;
    }

    public final java.lang.String a(java.lang.String replaceKey, java.lang.String newValue) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replaceKey, "replaceKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newValue, "newValue");
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        org.xmlpull.v1.XmlSerializer xmlSerializer = this.f500286b;
        xmlSerializer.setOutput(stringWriter);
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f500285a;
        if (xmlPullParser.getEventType() == 0) {
            xmlSerializer.startDocument(xmlPullParser.getInputEncoding(), java.lang.Boolean.TRUE);
        }
        while (true) {
            int nextToken = xmlPullParser.nextToken();
            switch (nextToken) {
                case 0:
                    xmlSerializer.startDocument(xmlPullParser.getInputEncoding(), java.lang.Boolean.TRUE);
                    continue;
                case 1:
                    xmlSerializer.endDocument();
                    break;
                case 2:
                    java.lang.StringBuilder sb6 = this.f500287c;
                    sb6.append('.');
                    sb6.append(xmlPullParser.getName());
                    java.lang.String namespace = xmlPullParser.getNamespace();
                    if (namespace == null || namespace.length() == 0) {
                        namespace = null;
                    }
                    xmlSerializer.startTag(namespace, xmlPullParser.getName());
                    for (int i17 = 0; i17 < xmlPullParser.getAttributeCount(); i17++) {
                        java.lang.String attributeNamespace = xmlPullParser.getAttributeNamespace(i17);
                        if (attributeNamespace == null || attributeNamespace.length() == 0) {
                            attributeNamespace = null;
                        }
                        xmlSerializer.attribute(attributeNamespace, xmlPullParser.getAttributeName(i17), xmlPullParser.getAttributeValue(i17));
                    }
                    continue;
                    break;
                case 3:
                    java.lang.String namespace2 = xmlPullParser.getNamespace();
                    xmlSerializer.endTag(namespace2 == null || namespace2.length() == 0 ? null : namespace2, xmlPullParser.getName());
                    java.lang.StringBuilder sb7 = this.f500287c;
                    java.lang.StringBuilder delete = sb7.delete(sb7.lastIndexOf("."), this.f500287c.length());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(delete, "delete(...)");
                    this.f500287c = delete;
                    if (delete.length() == 0) {
                        break;
                    }
                    break;
                case 4:
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500287c.toString(), replaceKey)) {
                        xmlSerializer.text(newValue);
                    } else {
                        xmlSerializer.text(xmlPullParser.getText());
                        continue;
                    }
                case 5:
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500287c.toString(), replaceKey)) {
                        xmlSerializer.cdsect(newValue);
                    } else {
                        xmlSerializer.cdsect(xmlPullParser.getText());
                        continue;
                    }
                case 6:
                    xmlSerializer.entityRef(xmlPullParser.getName());
                    continue;
                case 7:
                    xmlSerializer.ignorableWhitespace(xmlPullParser.getText());
                    continue;
                case 8:
                    xmlSerializer.processingInstruction(xmlPullParser.getText());
                    continue;
                case 9:
                    xmlSerializer.comment(xmlPullParser.getText());
                    continue;
                case 10:
                    xmlSerializer.docdecl(xmlPullParser.getText());
                    continue;
                default:
                    throw new java.lang.IllegalStateException("Unknown token " + nextToken);
            }
        }
        xmlSerializer.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringWriter2, "toString(...)");
        return stringWriter2;
    }
}
