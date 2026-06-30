package gr;

/* loaded from: classes15.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String filePath, gr.b xmlContent) {
        java.io.InputStream E;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xmlContent, "xmlContent");
        java.io.InputStream inputStream = null;
        try {
            try {
                E = com.p314xaae8f345.mm.vfs.w6.E(filePath);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newPullParser, "newPullParser(...)");
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(E, null);
            newPullParser.nextTag();
            xmlContent.a(newPullParser);
            if (E != null) {
                E.close();
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = E;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BaseXmlContent", e, "safeParse error", new java.lang.Object[0]);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = E;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }
}
