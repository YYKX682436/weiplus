package androidx.preference;

/* loaded from: classes13.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Class[] f11854e = {android.content.Context.class, android.util.AttributeSet.class};

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f11855f = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f11856a;

    /* renamed from: c, reason: collision with root package name */
    public androidx.preference.c0 f11858c;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f11857b = new java.lang.Object[2];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f11859d = {androidx.preference.Preference.class.getPackage().getName() + ".", androidx.preference.SwitchPreference.class.getPackage().getName() + "."};

    public y(android.content.Context context, androidx.preference.c0 c0Var) {
        this.f11856a = context;
        this.f11858c = c0Var;
    }

    public final androidx.preference.Preference a(java.lang.String str, java.lang.String[] strArr, android.util.AttributeSet attributeSet) {
        java.lang.Class<?> loadClass;
        java.util.HashMap hashMap = f11855f;
        java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    java.lang.ClassLoader classLoader = this.f11856a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        loadClass = null;
                        java.lang.ClassNotFoundException e17 = null;
                        for (java.lang.String str2 : strArr) {
                            try {
                                loadClass = classLoader.loadClass(str2 + str);
                                break;
                            } catch (java.lang.ClassNotFoundException e18) {
                                e17 = e18;
                            }
                        }
                        if (loadClass == null) {
                            if (e17 != null) {
                                throw e17;
                            }
                            throw new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                        constructor = loadClass.getConstructor(f11854e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    loadClass = classLoader.loadClass(str);
                    constructor = loadClass.getConstructor(f11854e);
                    constructor.setAccessible(true);
                    hashMap.put(str, constructor);
                } catch (java.lang.ClassNotFoundException e19) {
                    throw e19;
                }
            } catch (java.lang.Exception e27) {
                android.view.InflateException inflateException = new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e27);
                throw inflateException;
            }
        }
        java.lang.Object[] objArr = this.f11857b;
        objArr[1] = attributeSet;
        return (androidx.preference.Preference) constructor.newInstance(objArr);
    }

    public final androidx.preference.Preference b(java.lang.String str, android.util.AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f11859d, attributeSet) : a(str, null, attributeSet);
        } catch (android.view.InflateException e17) {
            throw e17;
        } catch (java.lang.ClassNotFoundException e18) {
            android.view.InflateException inflateException = new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e18);
            throw inflateException;
        } catch (java.lang.Exception e19) {
            android.view.InflateException inflateException2 = new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e19);
            throw inflateException2;
        }
    }

    public androidx.preference.Preference c(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.preference.PreferenceGroup preferenceGroup) {
        int next;
        synchronized (this.f11857b) {
            android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
            this.f11857b[0] = this.f11856a;
            do {
                try {
                    try {
                        try {
                            next = xmlPullParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (org.xmlpull.v1.XmlPullParserException e17) {
                            android.view.InflateException inflateException = new android.view.InflateException(e17.getMessage());
                            inflateException.initCause(e17);
                            throw inflateException;
                        }
                    } catch (android.view.InflateException e18) {
                        throw e18;
                    }
                } catch (java.io.IOException e19) {
                    android.view.InflateException inflateException2 = new android.view.InflateException(xmlPullParser.getPositionDescription() + ": " + e19.getMessage());
                    inflateException2.initCause(e19);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next != 2) {
                throw new android.view.InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
            }
            androidx.preference.PreferenceGroup preferenceGroup2 = (androidx.preference.PreferenceGroup) b(xmlPullParser.getName(), asAttributeSet);
            if (preferenceGroup == null) {
                preferenceGroup2.r(this.f11858c);
                preferenceGroup = preferenceGroup2;
            }
            d(xmlPullParser, preferenceGroup, asAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(org.xmlpull.v1.XmlPullParser xmlPullParser, androidx.preference.Preference preference, android.util.AttributeSet attributeSet) {
        long j17;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                java.lang.String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f11759s = android.content.Intent.parseIntent(this.f11856a.getResources(), xmlPullParser, attributeSet);
                    } catch (java.io.IOException e17) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e17);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    android.content.res.Resources resources = this.f11856a.getResources();
                    if (preference.f11761u == null) {
                        preference.f11761u = new android.os.Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, preference.f11761u);
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                            }
                        }
                    } catch (java.io.IOException e18) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException2 = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e18);
                        throw xmlPullParserException2;
                    }
                } else {
                    androidx.preference.Preference b17 = b(name, attributeSet);
                    androidx.preference.PreferenceGroup preferenceGroup = (androidx.preference.PreferenceGroup) preference;
                    if (!((java.util.ArrayList) preferenceGroup.R).contains(b17)) {
                        if (b17.f11758r != null) {
                            androidx.preference.PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                androidx.preference.PreferenceGroup preferenceGroup3 = preferenceGroup2.N;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            preferenceGroup2.M(b17.f11758r);
                        }
                        int i17 = b17.f11753m;
                        if (i17 == Integer.MAX_VALUE) {
                            if (preferenceGroup.S) {
                                int i18 = preferenceGroup.T;
                                preferenceGroup.T = i18 + 1;
                                if (i18 != i17) {
                                    b17.f11753m = i18;
                                    androidx.preference.n nVar = b17.L;
                                    if (nVar != null) {
                                        androidx.preference.x xVar = (androidx.preference.x) nVar;
                                        java.lang.Runnable runnable = xVar.f11853n;
                                        android.os.Handler handler = xVar.f11851i;
                                        handler.removeCallbacks(runnable);
                                        handler.post(runnable);
                                    }
                                }
                            }
                            if (b17 instanceof androidx.preference.PreferenceGroup) {
                                ((androidx.preference.PreferenceGroup) b17).S = preferenceGroup.S;
                            }
                        }
                        int binarySearch = java.util.Collections.binarySearch(preferenceGroup.R, b17);
                        if (binarySearch < 0) {
                            binarySearch = (binarySearch * (-1)) - 1;
                        }
                        boolean J2 = preferenceGroup.J();
                        if (b17.B == J2) {
                            b17.B = !J2;
                            b17.o(b17.J());
                            b17.n();
                        }
                        synchronized (preferenceGroup) {
                            ((java.util.ArrayList) preferenceGroup.R).add(binarySearch, b17);
                        }
                        androidx.preference.c0 c0Var = preferenceGroup.f11748e;
                        java.lang.String str = b17.f11758r;
                        if (str == null || !preferenceGroup.W.containsKey(str)) {
                            synchronized (c0Var) {
                                j17 = c0Var.f11795b;
                                c0Var.f11795b = 1 + j17;
                            }
                        } else {
                            j17 = ((java.lang.Long) preferenceGroup.W.getOrDefault(str, null)).longValue();
                            preferenceGroup.W.remove(str);
                        }
                        b17.f11749f = j17;
                        b17.f11750g = true;
                        try {
                            b17.r(c0Var);
                            b17.f11750g = false;
                            b17.N = preferenceGroup;
                            if (preferenceGroup.U) {
                                b17.p();
                            }
                            androidx.preference.n nVar2 = preferenceGroup.L;
                            if (nVar2 != null) {
                                androidx.preference.x xVar2 = (androidx.preference.x) nVar2;
                                java.lang.Runnable runnable2 = xVar2.f11853n;
                                android.os.Handler handler2 = xVar2.f11851i;
                                handler2.removeCallbacks(runnable2);
                                handler2.post(runnable2);
                            }
                        } catch (java.lang.Throwable th6) {
                            b17.f11750g = false;
                            throw th6;
                        }
                    }
                    d(xmlPullParser, b17, attributeSet);
                }
            }
        }
    }
}
