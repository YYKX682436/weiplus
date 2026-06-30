package p012xc85e97e9.p100xa8fcbcdb;

/* loaded from: classes13.dex */
public class y {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Class[] f93387e = {android.content.Context.class, android.util.AttributeSet.class};

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f93388f = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f93389a;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p100xa8fcbcdb.c0 f93391c;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f93390b = new java.lang.Object[2];

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String[] f93392d = {p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb.class.getPackage().getName() + ".", p012xc85e97e9.p100xa8fcbcdb.C1153x350a234f.class.getPackage().getName() + "."};

    public y(android.content.Context context, p012xc85e97e9.p100xa8fcbcdb.c0 c0Var) {
        this.f93389a = context;
        this.f93391c = c0Var;
    }

    public final p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb a(java.lang.String str, java.lang.String[] strArr, android.util.AttributeSet attributeSet) {
        java.lang.Class<?> loadClass;
        java.util.HashMap hashMap = f93388f;
        java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    java.lang.ClassLoader classLoader = this.f93389a.getClassLoader();
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
                        constructor = loadClass.getConstructor(f93387e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    loadClass = classLoader.loadClass(str);
                    constructor = loadClass.getConstructor(f93387e);
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
        java.lang.Object[] objArr = this.f93390b;
        objArr[1] = attributeSet;
        return (p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb) constructor.newInstance(objArr);
    }

    public final p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb b(java.lang.String str, android.util.AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.f93392d, attributeSet) : a(str, null, attributeSet);
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

    public p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c(org.xmlpull.v1.XmlPullParser xmlPullParser, p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed244) {
        int next;
        synchronized (this.f93390b) {
            android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
            this.f93390b[0] = this.f93389a;
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
            p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed2442 = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) b(xmlPullParser.getName(), asAttributeSet);
            if (abstractC1150xa1fed244 == null) {
                abstractC1150xa1fed2442.r(this.f93391c);
                abstractC1150xa1fed244 = abstractC1150xa1fed2442;
            }
            d(xmlPullParser, abstractC1150xa1fed244, asAttributeSet);
        }
        return abstractC1150xa1fed244;
    }

    public final void d(org.xmlpull.v1.XmlPullParser xmlPullParser, p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb c1146x1fce98fb, android.util.AttributeSet attributeSet) {
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
                        c1146x1fce98fb.f93292s = android.content.Intent.parseIntent(this.f93389a.getResources(), xmlPullParser, attributeSet);
                    } catch (java.io.IOException e17) {
                        org.xmlpull.v1.XmlPullParserException xmlPullParserException = new org.xmlpull.v1.XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e17);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    android.content.res.Resources resources = this.f93389a.getResources();
                    if (c1146x1fce98fb.f93294u == null) {
                        c1146x1fce98fb.f93294u = new android.os.Bundle();
                    }
                    resources.parseBundleExtra("extra", attributeSet, c1146x1fce98fb.f93294u);
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
                    p012xc85e97e9.p100xa8fcbcdb.C1146x1fce98fb b17 = b(name, attributeSet);
                    p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed244 = (p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) c1146x1fce98fb;
                    if (!((java.util.ArrayList) abstractC1150xa1fed244.R).contains(b17)) {
                        if (b17.f93291r != null) {
                            p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed2442 = abstractC1150xa1fed244;
                            while (true) {
                                p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244 abstractC1150xa1fed2443 = abstractC1150xa1fed2442.N;
                                if (abstractC1150xa1fed2443 == null) {
                                    break;
                                } else {
                                    abstractC1150xa1fed2442 = abstractC1150xa1fed2443;
                                }
                            }
                            abstractC1150xa1fed2442.M(b17.f93291r);
                        }
                        int i17 = b17.f93286m;
                        if (i17 == Integer.MAX_VALUE) {
                            if (abstractC1150xa1fed244.S) {
                                int i18 = abstractC1150xa1fed244.T;
                                abstractC1150xa1fed244.T = i18 + 1;
                                if (i18 != i17) {
                                    b17.f93286m = i18;
                                    p012xc85e97e9.p100xa8fcbcdb.n nVar = b17.L;
                                    if (nVar != null) {
                                        p012xc85e97e9.p100xa8fcbcdb.x xVar = (p012xc85e97e9.p100xa8fcbcdb.x) nVar;
                                        java.lang.Runnable runnable = xVar.f93386n;
                                        android.os.Handler handler = xVar.f93384i;
                                        handler.removeCallbacks(runnable);
                                        handler.post(runnable);
                                    }
                                }
                            }
                            if (b17 instanceof p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) {
                                ((p012xc85e97e9.p100xa8fcbcdb.AbstractC1150xa1fed244) b17).S = abstractC1150xa1fed244.S;
                            }
                        }
                        int binarySearch = java.util.Collections.binarySearch(abstractC1150xa1fed244.R, b17);
                        if (binarySearch < 0) {
                            binarySearch = (binarySearch * (-1)) - 1;
                        }
                        boolean J2 = abstractC1150xa1fed244.J();
                        if (b17.B == J2) {
                            b17.B = !J2;
                            b17.o(b17.J());
                            b17.n();
                        }
                        synchronized (abstractC1150xa1fed244) {
                            ((java.util.ArrayList) abstractC1150xa1fed244.R).add(binarySearch, b17);
                        }
                        p012xc85e97e9.p100xa8fcbcdb.c0 c0Var = abstractC1150xa1fed244.f93281e;
                        java.lang.String str = b17.f93291r;
                        if (str == null || !abstractC1150xa1fed244.W.m174748xc6607c0(str)) {
                            synchronized (c0Var) {
                                j17 = c0Var.f93328b;
                                c0Var.f93328b = 1 + j17;
                            }
                        } else {
                            j17 = ((java.lang.Long) abstractC1150xa1fed244.W.m174751x4aabfc28(str, null)).longValue();
                            abstractC1150xa1fed244.W.m174754xc84af884(str);
                        }
                        b17.f93282f = j17;
                        b17.f93283g = true;
                        try {
                            b17.r(c0Var);
                            b17.f93283g = false;
                            b17.N = abstractC1150xa1fed244;
                            if (abstractC1150xa1fed244.U) {
                                b17.p();
                            }
                            p012xc85e97e9.p100xa8fcbcdb.n nVar2 = abstractC1150xa1fed244.L;
                            if (nVar2 != null) {
                                p012xc85e97e9.p100xa8fcbcdb.x xVar2 = (p012xc85e97e9.p100xa8fcbcdb.x) nVar2;
                                java.lang.Runnable runnable2 = xVar2.f93386n;
                                android.os.Handler handler2 = xVar2.f93384i;
                                handler2.removeCallbacks(runnable2);
                                handler2.post(runnable2);
                            }
                        } catch (java.lang.Throwable th6) {
                            b17.f93283g = false;
                            throw th6;
                        }
                    }
                    d(xmlPullParser, b17, attributeSet);
                }
            }
        }
    }
}
