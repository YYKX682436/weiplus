package d3;

/* loaded from: classes13.dex */
public abstract class r {
    public static int a(android.content.Context context, int i17, int i18) {
        android.util.TypedValue typedValue = new android.util.TypedValue();
        context.getTheme().resolveAttribute(i17, typedValue, true);
        return typedValue.resourceId != 0 ? i17 : i18;
    }

    public static boolean b(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i17, boolean z17) {
        return !i(xmlPullParser, str) ? z17 : typedArray.getBoolean(i17, z17);
    }

    public static d3.d c(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme, java.lang.String str, int i17, int i18) {
        d3.d dVar;
        if (i(xmlPullParser, str)) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            typedArray.getValue(i17, typedValue);
            int i19 = typedValue.type;
            if (i19 >= 28 && i19 <= 31) {
                return new d3.d(null, null, typedValue.data);
            }
            try {
                dVar = d3.d.a(typedArray.getResources(), typedArray.getResourceId(i17, 0), theme);
            } catch (java.lang.Exception unused) {
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        return new d3.d(null, null, i18);
    }

    public static float d(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i17, float f17) {
        return !i(xmlPullParser, str) ? f17 : typedArray.getFloat(i17, f17);
    }

    public static int e(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i17, int i18) {
        return !i(xmlPullParser, str) ? i18 : typedArray.getInt(i17, i18);
    }

    public static int f(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i17, int i18) {
        return !i(xmlPullParser, str) ? i18 : typedArray.getResourceId(i17, i18);
    }

    public static java.lang.String g(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i17) {
        if (i(xmlPullParser, str)) {
            return typedArray.getString(i17);
        }
        return null;
    }

    public static java.lang.String h(android.content.res.TypedArray typedArray, int i17, int i18) {
        java.lang.String string = typedArray.getString(i17);
        return string == null ? typedArray.getString(i18) : string;
    }

    public static boolean i(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static android.content.res.TypedArray j(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
