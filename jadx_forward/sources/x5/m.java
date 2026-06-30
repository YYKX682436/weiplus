package x5;

/* loaded from: classes14.dex */
public final class m implements x5.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f533490a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.h f533491b;

    public m(android.content.Context context, v5.h drawableDecoder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawableDecoder, "drawableDecoder");
        this.f533490a = context;
        this.f533491b = drawableDecoder;
    }

    @Override // x5.g
    public boolean a(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(data.getScheme(), "android.resource");
    }

    @Override // x5.g
    public java.lang.Object b(s5.a aVar, java.lang.Object obj, p135x2eae8f.p138x35e001.AbstractC1421x275421 abstractC1421x275421, v5.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        android.graphics.drawable.Drawable drawable;
        android.net.Uri uri = (android.net.Uri) obj;
        java.lang.String authority = uri.getAuthority();
        boolean z17 = true;
        if (authority == null || !(!r26.n0.N(authority))) {
            authority = null;
        }
        if (authority == null) {
            throw new java.lang.IllegalStateException(p3321xbce91901.jvm.p3324x21ffc6bd.o.m("Invalid android.resource URI: ", uri));
        }
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pathSegments, "data.pathSegments");
        java.lang.String str = (java.lang.String) kz5.n0.k0(pathSegments);
        java.lang.Integer h17 = str != null ? r26.h0.h(str) : null;
        if (h17 == null) {
            throw new java.lang.IllegalStateException(p3321xbce91901.jvm.p3324x21ffc6bd.o.m("Invalid android.resource URI: ", uri));
        }
        int intValue = h17.intValue();
        android.content.Context context = kVar.f514822a;
        android.content.res.Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(authority);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resourcesForApplication, "context.packageManager.g…rApplication(packageName)");
        android.util.TypedValue typedValue = new android.util.TypedValue();
        resourcesForApplication.getValue(intValue, typedValue, true);
        java.lang.CharSequence path = typedValue.string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
        java.lang.String obj2 = path.subSequence(r26.n0.O(path, '/', 0, false, 6, null), path.length()).toString();
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(singleton, "getSingleton()");
        java.lang.String a17 = h6.d.a(singleton, obj2);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, "text/xml");
        v5.d dVar = v5.d.DISK;
        if (!b17) {
            java.io.InputStream openRawResource = resourcesForApplication.openRawResource(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(openRawResource, "resources.openRawResource(resId)");
            return new x5.n(x36.v.b(x36.v.f(openRawResource)), a17, dVar);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(authority, context.getPackageName())) {
            drawable = h6.c.a(context, intValue);
        } else {
            android.content.res.XmlResourceParser xml = resourcesForApplication.getXml(intValue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xml, "resources.getXml(resId)");
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found.");
            }
            android.content.res.Resources.Theme theme = context.getTheme();
            java.lang.ThreadLocal threadLocal = d3.q.f307641a;
            android.graphics.drawable.Drawable a18 = d3.l.a(resourcesForApplication, intValue, theme);
            if (a18 == null) {
                throw new java.lang.IllegalStateException(p3321xbce91901.jvm.p3324x21ffc6bd.o.m("Invalid resource ID: ", java.lang.Integer.valueOf(intValue)).toString());
            }
            drawable = a18;
        }
        if (!(drawable instanceof v4.d) && !(drawable instanceof android.graphics.drawable.VectorDrawable)) {
            z17 = false;
        }
        if (z17) {
            android.graphics.Bitmap a19 = this.f533491b.a(drawable, kVar.f514823b, abstractC1421x275421, kVar.f514825d, kVar.f514826e);
            android.content.res.Resources resources = context.getResources();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resources, "context.resources");
            drawable = new android.graphics.drawable.BitmapDrawable(resources, a19);
        }
        return new x5.e(drawable, z17, dVar);
    }

    @Override // x5.g
    public java.lang.String c(java.lang.Object obj) {
        android.net.Uri data = (android.net.Uri) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(data);
        sb6.append('-');
        android.content.res.Configuration configuration = this.f533490a.getResources().getConfiguration();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(configuration, "context.resources.configuration");
        l36.i0 i0Var = h6.d.f360649a;
        sb6.append(configuration.uiMode & 48);
        return sb6.toString();
    }
}
