package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013;

/* renamed from: io.flutter.embedding.engine.loader.ApplicationInfoLoader */
/* loaded from: classes13.dex */
public final class C28613x855993b1 {

    /* renamed from: NETWORK_POLICY_METADATA_KEY */
    public static final java.lang.String f71064x36033f6b = "io.flutter.network-policy";

    /* renamed from: PUBLIC_AUTOMATICALLY_REGISTER_PLUGINS_METADATA_KEY */
    public static final java.lang.String f71066x47c29b18 = "io.flutter.automatically-register-plugins";

    /* renamed from: PUBLIC_AOT_SHARED_LIBRARY_NAME */
    public static final java.lang.String f71065xaf82d59a = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.class.getName().concat(".aot-shared-library-name");

    /* renamed from: PUBLIC_VM_SNAPSHOT_DATA_KEY */
    public static final java.lang.String f71069x937910d3 = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.class.getName().concat(".vm-snapshot-data");

    /* renamed from: PUBLIC_ISOLATE_SNAPSHOT_DATA_KEY */
    public static final java.lang.String f71068x9bc4c33b = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.class.getName().concat(".isolate-snapshot-data");

    /* renamed from: PUBLIC_FLUTTER_ASSETS_DIR_KEY */
    public static final java.lang.String f71067xc514fbea = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28615x75ebff2f.class.getName().concat(".flutter-assets-dir");

    /* renamed from: customAotSharedLibraryPath */
    public static java.lang.String f71070x79dcd186 = null;

    /* renamed from: getApplicationInfo */
    private static android.content.pm.ApplicationInfo m137911x9a0587e8(android.content.Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (android.content.pm.PackageManager.NameNotFoundException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    /* renamed from: getBoolean */
    private static boolean m137912x41a8a7f2(android.os.Bundle bundle, java.lang.String str, boolean z17) {
        return bundle == null ? z17 : bundle.getBoolean(str, z17);
    }

    /* renamed from: getNetworkPolicy */
    private static java.lang.String m137913x7f86cd4a(android.content.pm.ApplicationInfo applicationInfo, android.content.Context context) {
        int i17;
        android.os.Bundle bundle = applicationInfo.metaData;
        if (bundle == null || (i17 = bundle.getInt(f71064x36033f6b, 0)) <= 0) {
            return null;
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(i17);
            xml.next();
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    if (xml.getName().equals("domain-config")) {
                        m137917xf1189b79(xml, jSONArray, false);
                    }
                }
            }
            return jSONArray.toString();
        } catch (java.io.IOException | org.xmlpull.v1.XmlPullParserException unused) {
            return null;
        }
    }

    /* renamed from: getString */
    private static java.lang.String m137914x2fec8307(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str, null);
    }

    /* renamed from: load */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28614xf98e2682 m137915x32c4e6(android.content.Context context) {
        android.content.pm.ApplicationInfo m137911x9a0587e8 = m137911x9a0587e8(context);
        java.lang.String str = f71070x79dcd186;
        if (str == null) {
            str = m137914x2fec8307(m137911x9a0587e8.metaData, f71065xaf82d59a);
        }
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3290xbe953013.C28614xf98e2682(str, m137914x2fec8307(m137911x9a0587e8.metaData, f71069x937910d3), m137914x2fec8307(m137911x9a0587e8.metaData, f71068x9bc4c33b), m137914x2fec8307(m137911x9a0587e8.metaData, f71067xc514fbea), m137913x7f86cd4a(m137911x9a0587e8, context), m137911x9a0587e8.nativeLibraryDir, m137912x41a8a7f2(m137911x9a0587e8.metaData, f71066x47c29b18, true));
    }

    /* renamed from: parseDomain */
    private static void m137916xbdb0c957(android.content.res.XmlResourceParser xmlResourceParser, org.json.JSONArray jSONArray, boolean z17) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "includeSubdomains", false);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 4) {
            throw new java.lang.IllegalStateException("Expected text");
        }
        java.lang.String trim = xmlResourceParser.getText().trim();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(trim);
        jSONArray2.put(attributeBooleanValue);
        jSONArray2.put(z17);
        jSONArray.put(jSONArray2);
        xmlResourceParser.next();
        if (xmlResourceParser.getEventType() != 3) {
            throw new java.lang.IllegalStateException("Expected end of domain tag");
        }
    }

    /* renamed from: parseDomainConfig */
    private static void m137917xf1189b79(android.content.res.XmlResourceParser xmlResourceParser, org.json.JSONArray jSONArray, boolean z17) {
        boolean attributeBooleanValue = xmlResourceParser.getAttributeBooleanValue(null, "cleartextTrafficPermitted", z17);
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                if (xmlResourceParser.getName().equals("domain")) {
                    m137916xbdb0c957(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else if (xmlResourceParser.getName().equals("domain-config")) {
                    m137917xf1189b79(xmlResourceParser, jSONArray, attributeBooleanValue);
                } else {
                    m137918x7ffefd9b(xmlResourceParser);
                }
            } else if (next == 3) {
                return;
            }
        }
    }

    /* renamed from: skipTag */
    private static void m137918x7ffefd9b(android.content.res.XmlResourceParser xmlResourceParser) {
        java.lang.String name = xmlResourceParser.getName();
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlResourceParser.getName() == name) {
                return;
            } else {
                eventType = xmlResourceParser.next();
            }
        }
    }
}
