package s7;

/* loaded from: classes12.dex */
public class q3 implements org.xml.sax.Attributes {

    /* renamed from: a, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f485317a;

    public q3(s7.r3 r3Var, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        this.f485317a = xmlPullParser;
    }

    @Override // org.xml.sax.Attributes
    public int getIndex(java.lang.String str) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public int getLength() {
        return this.f485317a.getAttributeCount();
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getLocalName(int i17) {
        return this.f485317a.getAttributeName(i17);
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getQName(int i17) {
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f485317a;
        java.lang.String attributeName = xmlPullParser.getAttributeName(i17);
        if (xmlPullParser.getAttributePrefix(i17) == null) {
            return attributeName;
        }
        return xmlPullParser.getAttributePrefix(i17) + ':' + attributeName;
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getType(int i17) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getURI(int i17) {
        return this.f485317a.getAttributeNamespace(i17);
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getValue(java.lang.String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public int getIndex(java.lang.String str, java.lang.String str2) {
        return -1;
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getType(java.lang.String str) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getValue(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getType(java.lang.String str, java.lang.String str2) {
        return null;
    }

    @Override // org.xml.sax.Attributes
    public java.lang.String getValue(int i17) {
        return this.f485317a.getAttributeValue(i17);
    }
}
