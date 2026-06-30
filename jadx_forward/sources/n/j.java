package n;

/* loaded from: classes15.dex */
public class j extends android.view.MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Class[] f414941e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Class[] f414942f;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f414943a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f414944b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f414945c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414946d;

    static {
        java.lang.Class[] clsArr = {android.content.Context.class};
        f414941e = clsArr;
        f414942f = clsArr;
    }

    public j(android.content.Context context) {
        super(context);
        this.f414945c = context;
        java.lang.Object[] objArr = {context};
        this.f414943a = objArr;
        this.f414944b = objArr;
    }

    public final java.lang.Object a(java.lang.Object obj) {
        return (!(obj instanceof android.app.Activity) && (obj instanceof android.content.ContextWrapper)) ? a(((android.content.ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.view.Menu menu) {
        int i17;
        android.content.res.ColorStateList colorStateList;
        java.lang.Object obj;
        n.i iVar = new n.i(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i17 = 2;
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new java.lang.RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z17 = false;
        boolean z18 = false;
        java.lang.String str = null;
        while (!z17) {
            if (eventType == 1) {
                throw new java.lang.RuntimeException("Unexpected end of document");
            }
            android.view.Menu menu2 = iVar.f414915a;
            z17 = z17;
            z17 = z17;
            if (eventType != i17) {
                if (eventType == 3) {
                    java.lang.String name2 = xmlPullParser.getName();
                    if (z18 && name2.equals(str)) {
                        z18 = false;
                        str = null;
                    } else if (name2.equals("group")) {
                        iVar.f414916b = 0;
                        iVar.f414917c = 0;
                        iVar.f414918d = 0;
                        iVar.f414919e = 0;
                        iVar.f414920f = true;
                        iVar.f414921g = true;
                        z17 = z17;
                    } else if (name2.equals("item")) {
                        z17 = z17;
                        if (!iVar.f414922h) {
                            n3.f fVar = iVar.f414940z;
                            if (fVar == null || !((o.v) fVar).f423357b.hasSubMenu()) {
                                iVar.f414922h = true;
                                iVar.a(menu2.add(iVar.f414916b, iVar.f414923i, iVar.f414924j, iVar.f414925k));
                                z17 = z17;
                            } else {
                                iVar.f414922h = true;
                                iVar.a(menu2.addSubMenu(iVar.f414916b, iVar.f414923i, iVar.f414924j, iVar.f414925k).getItem());
                                z17 = z17;
                            }
                        }
                    } else {
                        z17 = z17;
                        if (name2.equals("menu")) {
                            z17 = true;
                        }
                    }
                }
            } else if (!z18) {
                java.lang.String name3 = xmlPullParser.getName();
                boolean equals = name3.equals("group");
                n.j jVar = iVar.E;
                if (equals) {
                    android.content.res.TypedArray obtainStyledAttributes = jVar.f414945c.obtainStyledAttributes(attributeSet, j.a.f377722q);
                    iVar.f414916b = obtainStyledAttributes.getResourceId(1, 0);
                    iVar.f414917c = obtainStyledAttributes.getInt(3, 0);
                    iVar.f414918d = obtainStyledAttributes.getInt(4, 0);
                    iVar.f414919e = obtainStyledAttributes.getInt(5, 0);
                    iVar.f414920f = obtainStyledAttributes.getBoolean(2, true);
                    iVar.f414921g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    z17 = z17;
                } else if (name3.equals("item")) {
                    android.content.res.TypedArray obtainStyledAttributes2 = jVar.f414945c.obtainStyledAttributes(attributeSet, j.a.f377723r);
                    iVar.f414923i = obtainStyledAttributes2.getResourceId(2, 0);
                    iVar.f414924j = (obtainStyledAttributes2.getInt(5, iVar.f414917c) & (-65536)) | (obtainStyledAttributes2.getInt(6, iVar.f414918d) & 65535);
                    iVar.f414925k = obtainStyledAttributes2.getText(7);
                    iVar.f414926l = obtainStyledAttributes2.getText(8);
                    iVar.f414927m = obtainStyledAttributes2.getResourceId(0, 0);
                    java.lang.String string = obtainStyledAttributes2.getString(9);
                    iVar.f414928n = string == null ? (char) 0 : string.charAt(0);
                    iVar.f414929o = obtainStyledAttributes2.getInt(16, 4096);
                    java.lang.String string2 = obtainStyledAttributes2.getString(10);
                    iVar.f414930p = string2 == null ? (char) 0 : string2.charAt(0);
                    iVar.f414931q = obtainStyledAttributes2.getInt(20, 4096);
                    if (obtainStyledAttributes2.hasValue(11)) {
                        iVar.f414932r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                    } else {
                        iVar.f414932r = iVar.f414919e;
                    }
                    iVar.f414933s = obtainStyledAttributes2.getBoolean(3, false);
                    iVar.f414934t = obtainStyledAttributes2.getBoolean(4, iVar.f414920f);
                    iVar.f414935u = obtainStyledAttributes2.getBoolean(1, iVar.f414921g);
                    iVar.f414936v = obtainStyledAttributes2.getInt(21, -1);
                    iVar.f414939y = obtainStyledAttributes2.getString(12);
                    iVar.f414937w = obtainStyledAttributes2.getResourceId(13, 0);
                    iVar.f414938x = obtainStyledAttributes2.getString(15);
                    java.lang.String string3 = obtainStyledAttributes2.getString(14);
                    if ((string3 != null) && iVar.f414937w == 0 && iVar.f414938x == null) {
                        java.lang.Class<?>[] clsArr = f414942f;
                        java.lang.Object[] objArr = jVar.f414944b;
                        try {
                            java.lang.reflect.Constructor<?> constructor = jVar.f414945c.getClassLoader().loadClass(string3).getConstructor(clsArr);
                            constructor.setAccessible(true);
                            obj = constructor.newInstance(objArr);
                        } catch (java.lang.Exception unused) {
                            obj = null;
                        }
                        iVar.f414940z = (n3.f) obj;
                    } else {
                        iVar.f414940z = null;
                    }
                    iVar.A = obtainStyledAttributes2.getText(17);
                    iVar.B = obtainStyledAttributes2.getText(22);
                    if (obtainStyledAttributes2.hasValue(19)) {
                        iVar.D = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.y0.c(obtainStyledAttributes2.getInt(19, -1), iVar.D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        iVar.D = null;
                    }
                    if (obtainStyledAttributes2.hasValue(18)) {
                        iVar.C = obtainStyledAttributes2.getColorStateList(18);
                    } else {
                        iVar.C = colorStateList;
                    }
                    obtainStyledAttributes2.recycle();
                    iVar.f414922h = false;
                } else if (name3.equals("menu")) {
                    iVar.f414922h = true;
                    android.view.SubMenu addSubMenu = menu2.addSubMenu(iVar.f414916b, iVar.f414923i, iVar.f414924j, iVar.f414925k);
                    iVar.a(addSubMenu.getItem());
                    b(xmlPullParser, attributeSet, addSubMenu);
                } else {
                    str = name3;
                    z18 = true;
                }
            }
            eventType = xmlPullParser.next();
            i17 = 2;
            z17 = z17;
            z18 = z18;
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i17, android.view.Menu menu) {
        if (!(menu instanceof g3.a)) {
            super.inflate(i17, menu);
            return;
        }
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f414945c.getResources().getLayout(i17);
                    b(xmlResourceParser, android.util.Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (org.xmlpull.v1.XmlPullParserException e17) {
                    throw new android.view.InflateException("Error inflating menu XML", e17);
                }
            } catch (java.io.IOException e18) {
                throw new android.view.InflateException("Error inflating menu XML", e18);
            }
        } catch (java.lang.Throwable th6) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th6;
        }
    }
}
