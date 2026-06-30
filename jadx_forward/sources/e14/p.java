package e14;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public e14.s f327969a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f327970b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f327971c;

    /* renamed from: d, reason: collision with root package name */
    public final org.xmlpull.v1.XmlPullParser f327972d;

    /* renamed from: e, reason: collision with root package name */
    public int f327973e;

    public p(java.lang.String xml, e14.s sVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        this.f327969a = sVar;
        org.xmlpull.v1.XmlPullParser newPullParser = org.xmlpull.v1.XmlPullParserFactory.newInstance().newPullParser();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newPullParser, "newPullParser(...)");
        this.f327972d = newPullParser;
        newPullParser.setInput(new java.io.StringReader(xml));
    }

    public final void a() {
        e14.s sVar;
        e14.s sVar2 = this.f327969a;
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f327972d;
        if (sVar2 != null) {
            java.lang.String name = xmlPullParser.getName();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
            sVar = sVar2.mo126724xfd3879a2(name);
        } else {
            sVar = null;
        }
        this.f327969a = sVar;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i17 = 0; i17 < attributeCount; i17++) {
            e14.s sVar3 = this.f327969a;
            if (sVar3 != null) {
                java.lang.String attributeName = xmlPullParser.getAttributeName(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(attributeName, "getAttributeName(...)");
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i17);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(attributeValue, "getAttributeValue(...)");
                sVar3.mo126751xac249e70(attributeName, attributeValue);
            }
        }
    }

    public final void b() {
        java.lang.String text;
        e14.s sVar;
        org.xmlpull.v1.XmlPullParser xmlPullParser = this.f327972d;
        if (this.f327971c) {
            return;
        }
        try {
            this.f327971c = true;
            this.f327970b = false;
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (this.f327969a == null || this.f327970b) {
                    break;
                }
                eventType = xmlPullParser.next();
                if (eventType == 2) {
                    this.f327973e++;
                    a();
                } else if (eventType == 3) {
                    this.f327973e--;
                    e14.s sVar2 = this.f327969a;
                    this.f327969a = sVar2 != null ? sVar2.mo126726x2cbdf68() : null;
                    if (this.f327973e == 0) {
                        break;
                    }
                } else if (eventType == 4 && (text = xmlPullParser.getText()) != null && (sVar = this.f327969a) != null) {
                    sVar.mo126752xac2d09ac(text);
                }
            }
        } catch (java.lang.Exception unused) {
        } catch (java.lang.Throwable th6) {
            this.f327971c = false;
            throw th6;
        }
        this.f327971c = false;
    }
}
