package sc;

/* loaded from: classes12.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f487159a = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(sc.h.class, "pathList", "getPathList(Ljava/lang/ClassLoader;)Ljava/lang/Object;", 1)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(sc.h.class, "nativeLibraryDirectories", "getNativeLibraryDirectories(Ljava/lang/Object;)Ljava/util/List;", 1)), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(sc.h.class, "systemNativeLibraryDirectories", "getSystemNativeLibraryDirectories(Ljava/lang/Object;)Ljava/util/List;", 1))};

    /* renamed from: b, reason: collision with root package name */
    public static final sc.j f487160b = new sc.j(dalvik.system.BaseDexClassLoader.class, "pathList");

    /* renamed from: c, reason: collision with root package name */
    public static final sc.j f487161c = new sc.j("dalvik.system.DexPathList", "nativeLibraryDirectories");

    /* renamed from: d, reason: collision with root package name */
    public static final sc.j f487162d = new sc.j("dalvik.system.DexPathList", "systemNativeLibraryDirectories");

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008c, code lost:
    
        if (r6 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (r2 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jz5.l a(android.app.Application r6) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.ClassLoader r6 = r6.getClassLoader()
            java.lang.String r0 = "getClassLoader(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r0)
            f06.v[] r0 = sc.h.f487159a
            r1 = 0
            r2 = r0[r1]
            sc.j r3 = sc.h.f487160b
            java.lang.Object r6 = r3.a(r6, r2)
            r2 = 1
            r2 = r0[r2]
            sc.j r3 = sc.h.f487161c
            java.lang.Object r2 = r3.a(r6, r2)
            java.util.List r2 = (java.util.List) r2
            r3 = 10
            if (r2 == 0) goto L54
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = kz5.d0.q(r2, r3)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L49
            java.lang.Object r5 = r2.next()
            java.io.File r5 = (java.io.File) r5
            java.lang.String r5 = r5.getAbsolutePath()
            r4.add(r5)
            goto L35
        L49:
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r2 = r4.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            if (r2 == 0) goto L54
            goto L56
        L54:
            java.lang.String[] r2 = new java.lang.String[r1]
        L56:
            r4 = 2
            r0 = r0[r4]
            sc.j r4 = sc.h.f487162d
            java.lang.Object r6 = r4.a(r6, r0)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L8f
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = kz5.d0.q(r6, r3)
            r0.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L70:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r6.next()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r3 = r3.getAbsolutePath()
            r0.add(r3)
            goto L70
        L84:
            java.lang.String[] r6 = new java.lang.String[r1]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            if (r6 == 0) goto L8f
            goto L91
        L8f:
            java.lang.String[] r6 = new java.lang.String[r1]
        L91:
            jz5.l r0 = new jz5.l
            r0.<init>(r2, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.h.a(android.app.Application):jz5.l");
    }
}
