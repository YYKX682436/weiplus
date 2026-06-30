package xi;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final xi.k f536194e = new xi.k();

    /* renamed from: a, reason: collision with root package name */
    public static final long f536190a = java.util.concurrent.TimeUnit.DAYS.toMillis(7);

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f536191b = jz5.h.b(xi.h.f536188d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f536192c = jz5.h.b(xi.g.f536187d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f536193d = jz5.h.b(xi.j.f536189d);

    public static final java.lang.String c(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        oj.j.c("Matrix.HprofFileManager", "file name = ".concat(name), new java.lang.Object[0]);
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile(".*-(MATRIX_REFKEY.*).hprof").matcher(name);
        if (!matcher.find()) {
            return null;
        }
        java.lang.String group = matcher.group(1);
        oj.j.c("Matrix.HprofFileManager", "key = " + group, new java.lang.Object[0]);
        return group;
    }

    public final java.lang.String a(java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append('-');
        sb6.append((java.lang.String) ((jz5.n) f536193d).mo141623x754a37bb());
        sb6.append('-');
        sb6.append(android.os.Process.myPid());
        sb6.append('-');
        java.text.SimpleDateFormat simpleDateFormat = (java.text.SimpleDateFormat) ((jz5.n) f536192c).mo141623x754a37bb();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(calendar, "Calendar.getInstance()");
        sb6.append(simpleDateFormat.format(calendar.getTime()));
        sb6.append('-');
        sb6.append(str2);
        sb6.append(".hprof");
        return sb6.toString();
    }

    public final java.io.File b() {
        return (java.io.File) ((jz5.n) f536191b).mo141623x754a37bb();
    }

    public final void d(java.io.File file, boolean z17) {
        java.io.File[] listFiles;
        java.io.File[] listFiles2;
        if (!file.exists() && (!file.mkdirs() || !file.canWrite())) {
            java.lang.String str = "fialed to create new hprof file since path: " + file.getAbsolutePath() + " is not writable";
            oj.j.b("Matrix.HprofFileManager", str, new java.lang.Object[0]);
            throw new java.io.FileNotFoundException(str);
        }
        if (file.isDirectory()) {
            if (file.isDirectory() && (listFiles2 = file.listFiles()) != null) {
                if (listFiles2.length > 1) {
                    kz5.v.A(listFiles2, new xi.i());
                }
                for (java.io.File it : listFiles2) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("==> list sorted: ");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "it");
                    sb6.append(it.getAbsolutePath());
                    sb6.append(", last mod = ");
                    sb6.append(it.lastModified());
                    oj.j.a("Matrix.HprofFileManager", sb6.toString(), new java.lang.Object[0]);
                }
                if (listFiles2.length >= 10) {
                    java.util.Iterator it6 = kz5.z.s0(listFiles2, (listFiles2.length - 10) + 1).iterator();
                    while (it6.hasNext()) {
                        ((java.io.File) it6.next()).delete();
                    }
                }
            }
            if (file.getFreeSpace() < 12884901888L && (listFiles = file.listFiles()) != null) {
                for (java.io.File file2 : listFiles) {
                    file2.delete();
                }
            }
            if (file.getFreeSpace() >= (z17 ? 1073741824L : 12884901888L)) {
                return;
            }
            throw new java.io.FileNotFoundException("free space(" + file.getFreeSpace() + ") less than 12884901888, skip dump hprof");
        }
    }

    public final java.io.File e(java.lang.String prefix, java.lang.String key, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        d(b(), z17);
        return new java.io.File(b(), a(prefix, key));
    }

    public final java.io.File f(java.lang.String prefix, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
        d(b(), z17);
        return new java.io.File(b(), a(prefix, ""));
    }
}
