package ex5;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class[] f338797c = {android.content.Context.class, android.util.AttributeSet.class};

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f338798d = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f338799a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f338800b = new java.lang.Object[2];

    public h(android.content.Context context) {
        this.f338799a = context;
    }

    public final android.preference.Preference a(java.lang.String str, java.lang.String str2, android.util.AttributeSet attributeSet) {
        java.lang.String str3;
        java.lang.String positionDescription;
        java.util.HashMap hashMap = f338798d;
        java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) hashMap.get(str);
        if (constructor == null) {
            try {
                java.lang.ClassLoader classLoader = this.f338799a.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).getConstructor(f338797c);
                hashMap.put(str, constructor);
            } catch (java.lang.ClassNotFoundException e17) {
                throw e17;
            } catch (java.lang.NoSuchMethodException e18) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(attributeSet.getPositionDescription());
                sb6.append(": Error inflating class ");
                if (str2 != null) {
                    str = str2 + str;
                }
                sb6.append(str);
                android.view.InflateException inflateException = new android.view.InflateException(sb6.toString());
                inflateException.initCause(e18);
                throw inflateException;
            } catch (java.lang.Exception e19) {
                if (attributeSet == null) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("(null): Error inflating class ");
                    sb7.append(constructor);
                    positionDescription = sb7.toString() != null ? constructor.getClass().getName() : "(null)";
                } else {
                    positionDescription = attributeSet.getPositionDescription();
                }
                android.view.InflateException inflateException2 = new android.view.InflateException(positionDescription);
                inflateException2.initCause(e19);
                throw inflateException2;
            }
        }
        java.lang.Object[] objArr = this.f338800b;
        objArr[1] = attributeSet;
        return (android.preference.Preference) constructor.newInstance(objArr);
    }

    public final android.preference.Preference b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, android.util.AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, "android.preference.", attributeSet) : a(str, null, attributeSet);
        } catch (android.view.InflateException e17) {
            throw e17;
        } catch (java.lang.ClassNotFoundException e18) {
            android.view.InflateException inflateException = new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException.initCause(e18);
            throw inflateException;
        } catch (java.lang.Exception e19) {
            android.view.InflateException inflateException2 = new android.view.InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e19);
            throw inflateException2;
        }
    }

    public void c(org.xmlpull.v1.XmlPullParser xmlPullParser, ex5.b bVar, boolean z17) {
        synchronized (this.f338800b) {
            android.util.AttributeSet asAttributeSet = android.util.Xml.asAttributeSet(xmlPullParser);
            this.f338800b[0] = this.f338799a;
            try {
                int next = xmlPullParser.next();
                while (next != 2 && next != 1) {
                    next = xmlPullParser.next();
                }
                if (next != 2) {
                    throw new android.view.InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
                }
                b(xmlPullParser, xmlPullParser.getName(), asAttributeSet);
                d(xmlPullParser, bVar, asAttributeSet);
            } catch (android.view.InflateException e17) {
                throw e17;
            } catch (java.io.IOException e18) {
                android.view.InflateException inflateException = new android.view.InflateException(xmlPullParser.getPositionDescription() + ": " + e18.getMessage());
                inflateException.initCause(e18);
                throw inflateException;
            } catch (org.xmlpull.v1.XmlPullParserException e19) {
                android.view.InflateException inflateException2 = new android.view.InflateException(e19.getMessage());
                inflateException2.initCause(e19);
                throw inflateException2;
            }
        }
    }

    public final void d(org.xmlpull.v1.XmlPullParser xmlPullParser, ex5.b bVar, android.util.AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        int next = xmlPullParser.next();
        while (true) {
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next != 2) {
                next = xmlPullParser.next();
            } else {
                ex5.g gVar = (ex5.g) bVar;
                gVar.a(b(xmlPullParser, xmlPullParser.getName(), attributeSet), -1);
                if (!gVar.f338794q) {
                    gVar.notifyDataSetChanged();
                }
                next = xmlPullParser.next();
            }
        }
    }
}
