package r6;

/* loaded from: classes13.dex */
public final class f implements java.io.Closeable {

    /* renamed from: d, reason: collision with root package name */
    public final java.io.File f474290d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.File f474291e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.File f474292f;

    /* renamed from: g, reason: collision with root package name */
    public final java.io.File f474293g;

    /* renamed from: h, reason: collision with root package name */
    public final int f474294h;

    /* renamed from: i, reason: collision with root package name */
    public final long f474295i;

    /* renamed from: m, reason: collision with root package name */
    public final int f474296m;

    /* renamed from: o, reason: collision with root package name */
    public java.io.Writer f474298o;

    /* renamed from: q, reason: collision with root package name */
    public int f474300q;

    /* renamed from: n, reason: collision with root package name */
    public long f474297n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedHashMap f474299p = new java.util.LinkedHashMap(0, 0.75f, true);

    /* renamed from: r, reason: collision with root package name */
    public long f474301r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f474302s = new java.util.concurrent.ThreadPoolExecutor(0, 1, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue(), new r6.b(null));

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.Callable f474303t = new r6.a(this);

    public f(java.io.File file, int i17, int i18, long j17) {
        this.f474290d = file;
        this.f474294h = i17;
        this.f474291e = new java.io.File(file, "journal");
        this.f474292f = new java.io.File(file, "journal.tmp");
        this.f474293g = new java.io.File(file, "journal.bkp");
        this.f474296m = i18;
        this.f474295i = j17;
    }

    public static void a(r6.f fVar, r6.c cVar, boolean z17) {
        synchronized (fVar) {
            r6.d dVar = cVar.f474277a;
            if (dVar.f474286f != cVar) {
                throw new java.lang.IllegalStateException();
            }
            if (z17 && !dVar.f474285e) {
                for (int i17 = 0; i17 < fVar.f474296m; i17++) {
                    if (!cVar.f474278b[i17]) {
                        cVar.a();
                        throw new java.lang.IllegalStateException("Newly created entry didn't create value for index " + i17);
                    }
                    if (!dVar.f474284d[i17].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i18 = 0; i18 < fVar.f474296m; i18++) {
                java.io.File file = dVar.f474284d[i18];
                if (!z17) {
                    c(file);
                } else if (file.exists()) {
                    java.io.File file2 = dVar.f474283c[i18];
                    file.renameTo(file2);
                    long j17 = dVar.f474282b[i18];
                    long length = file2.length();
                    dVar.f474282b[i18] = length;
                    fVar.f474297n = (fVar.f474297n - j17) + length;
                }
            }
            fVar.f474300q++;
            dVar.f474286f = null;
            if (dVar.f474285e || z17) {
                dVar.f474285e = true;
                fVar.f474298o.append((java.lang.CharSequence) "CLEAN");
                fVar.f474298o.append(' ');
                fVar.f474298o.append((java.lang.CharSequence) dVar.f474281a);
                fVar.f474298o.append((java.lang.CharSequence) dVar.a());
                fVar.f474298o.append('\n');
                if (z17) {
                    long j18 = fVar.f474301r;
                    fVar.f474301r = 1 + j18;
                    dVar.f474287g = j18;
                }
            } else {
                fVar.f474299p.remove(dVar.f474281a);
                fVar.f474298o.append((java.lang.CharSequence) "REMOVE");
                fVar.f474298o.append(' ');
                fVar.f474298o.append((java.lang.CharSequence) dVar.f474281a);
                fVar.f474298o.append('\n');
            }
            i(fVar.f474298o);
            if (fVar.f474297n > fVar.f474295i || fVar.k()) {
                fVar.f474302s.submit(fVar.f474303t);
            }
        }
    }

    public static void b(java.io.Writer writer) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void c(java.io.File file) {
        if (file.exists() && !file.delete()) {
            throw new java.io.IOException();
        }
    }

    public static void i(java.io.Writer writer) {
        if (android.os.Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        android.os.StrictMode.ThreadPolicy threadPolicy = android.os.StrictMode.getThreadPolicy();
        android.os.StrictMode.setThreadPolicy(new android.os.StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            android.os.StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static r6.f l(java.io.File file, int i17, int i18, long j17) {
        if (j17 <= 0) {
            throw new java.lang.IllegalArgumentException("maxSize <= 0");
        }
        if (i18 <= 0) {
            throw new java.lang.IllegalArgumentException("valueCount <= 0");
        }
        java.io.File file2 = new java.io.File(file, "journal.bkp");
        if (file2.exists()) {
            java.io.File file3 = new java.io.File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                x(file2, file3, false);
            }
        }
        r6.f fVar = new r6.f(file, i17, i18, j17);
        if (fVar.f474291e.exists()) {
            try {
                fVar.q();
                fVar.p();
                return fVar;
            } catch (java.io.IOException e17) {
                java.lang.System.out.println("DiskLruCache " + file + " is corrupt: " + e17.getMessage() + ", removing");
                fVar.close();
                r6.i.a(fVar.f474290d);
            }
        }
        file.mkdirs();
        r6.f fVar2 = new r6.f(file, i17, i18, j17);
        fVar2.w();
        return fVar2;
    }

    public static void x(java.io.File file, java.io.File file2, boolean z17) {
        if (z17) {
            c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new java.io.IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f474298o == null) {
            return;
        }
        java.util.Iterator it = new java.util.ArrayList(this.f474299p.values()).iterator();
        while (it.hasNext()) {
            r6.c cVar = ((r6.d) it.next()).f474286f;
            if (cVar != null) {
                cVar.a();
            }
        }
        z();
        b(this.f474298o);
        this.f474298o = null;
    }

    public r6.c f(java.lang.String str) {
        synchronized (this) {
            if (this.f474298o == null) {
                throw new java.lang.IllegalStateException("cache is closed");
            }
            r6.d dVar = (r6.d) this.f474299p.get(str);
            if (dVar == null) {
                dVar = new r6.d(this, str, null);
                this.f474299p.put(str, dVar);
            } else if (dVar.f474286f != null) {
                return null;
            }
            r6.c cVar = new r6.c(this, dVar, null);
            dVar.f474286f = cVar;
            this.f474298o.append((java.lang.CharSequence) "DIRTY");
            this.f474298o.append(' ');
            this.f474298o.append((java.lang.CharSequence) str);
            this.f474298o.append('\n');
            i(this.f474298o);
            return cVar;
        }
    }

    public synchronized r6.e j(java.lang.String str) {
        if (this.f474298o == null) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
        r6.d dVar = (r6.d) this.f474299p.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f474285e) {
            return null;
        }
        for (java.io.File file : dVar.f474283c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f474300q++;
        this.f474298o.append((java.lang.CharSequence) "READ");
        this.f474298o.append(' ');
        this.f474298o.append((java.lang.CharSequence) str);
        this.f474298o.append('\n');
        if (k()) {
            this.f474302s.submit(this.f474303t);
        }
        return new r6.e(this, str, dVar.f474287g, dVar.f474283c, dVar.f474282b, null);
    }

    public final boolean k() {
        int i17 = this.f474300q;
        return i17 >= 2000 && i17 >= this.f474299p.size();
    }

    public final void p() {
        c(this.f474292f);
        java.util.Iterator it = this.f474299p.values().iterator();
        while (it.hasNext()) {
            r6.d dVar = (r6.d) it.next();
            r6.c cVar = dVar.f474286f;
            int i17 = this.f474296m;
            int i18 = 0;
            if (cVar == null) {
                while (i18 < i17) {
                    this.f474297n += dVar.f474282b[i18];
                    i18++;
                }
            } else {
                dVar.f474286f = null;
                while (i18 < i17) {
                    c(dVar.f474283c[i18]);
                    c(dVar.f474284d[i18]);
                    i18++;
                }
                it.remove();
            }
        }
    }

    public final void q() {
        java.io.File file = this.f474291e;
        r6.h hVar = new r6.h(new java.io.FileInputStream(file), r6.i.f474310a);
        try {
            java.lang.String a17 = hVar.a();
            java.lang.String a18 = hVar.a();
            java.lang.String a19 = hVar.a();
            java.lang.String a27 = hVar.a();
            java.lang.String a28 = hVar.a();
            if (!"libcore.io.DiskLruCache".equals(a17) || !"1".equals(a18) || !java.lang.Integer.toString(this.f474294h).equals(a19) || !java.lang.Integer.toString(this.f474296m).equals(a27) || !"".equals(a28)) {
                throw new java.io.IOException("unexpected journal header: [" + a17 + ", " + a18 + ", " + a27 + ", " + a28 + "]");
            }
            int i17 = 0;
            while (true) {
                try {
                    v(hVar.a());
                    i17++;
                } catch (java.io.EOFException unused) {
                    this.f474300q = i17 - this.f474299p.size();
                    if (hVar.f474309h == -1) {
                        w();
                    } else {
                        this.f474298o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(file, true), r6.i.f474310a));
                    }
                    try {
                        hVar.close();
                        return;
                    } catch (java.lang.RuntimeException e17) {
                        throw e17;
                    } catch (java.lang.Exception unused2) {
                        return;
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            try {
                hVar.close();
            } catch (java.lang.RuntimeException e18) {
                throw e18;
            } catch (java.lang.Exception unused3) {
            }
            throw th6;
        }
    }

    public final void v(java.lang.String str) {
        java.lang.String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new java.io.IOException("unexpected journal line: ".concat(str));
        }
        int i17 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i17);
        java.util.LinkedHashMap linkedHashMap = this.f474299p;
        if (indexOf2 == -1) {
            substring = str.substring(i17);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i17, indexOf2);
        }
        r6.d dVar = (r6.d) linkedHashMap.get(substring);
        if (dVar == null) {
            dVar = new r6.d(this, substring, null);
            linkedHashMap.put(substring, dVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f474286f = new r6.c(this, dVar, null);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new java.io.IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        java.lang.String[] split = str.substring(indexOf2 + 1).split(" ");
        dVar.f474285e = true;
        dVar.f474286f = null;
        if (split.length != dVar.f474288h.f474296m) {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
        }
        for (int i18 = 0; i18 < split.length; i18++) {
            try {
                dVar.f474282b[i18] = java.lang.Long.parseLong(split[i18]);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
            }
        }
    }

    public final synchronized void w() {
        java.io.Writer writer = this.f474298o;
        if (writer != null) {
            b(writer);
        }
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.f474292f), r6.i.f474310a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.f474294h));
            bufferedWriter.write("\n");
            bufferedWriter.write(java.lang.Integer.toString(this.f474296m));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (r6.d dVar : this.f474299p.values()) {
                if (dVar.f474286f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f474281a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f474281a + dVar.a() + '\n');
                }
            }
            b(bufferedWriter);
            if (this.f474291e.exists()) {
                x(this.f474291e, this.f474293g, true);
            }
            x(this.f474292f, this.f474291e, false);
            this.f474293g.delete();
            this.f474298o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(this.f474291e, true), r6.i.f474310a));
        } catch (java.lang.Throwable th6) {
            b(bufferedWriter);
            throw th6;
        }
    }

    public final void z() {
        while (this.f474297n > this.f474295i) {
            java.lang.String str = (java.lang.String) ((java.util.Map.Entry) this.f474299p.entrySet().iterator().next()).getKey();
            synchronized (this) {
                if (this.f474298o == null) {
                    throw new java.lang.IllegalStateException("cache is closed");
                }
                r6.d dVar = (r6.d) this.f474299p.get(str);
                if (dVar != null && dVar.f474286f == null) {
                    for (int i17 = 0; i17 < this.f474296m; i17++) {
                        java.io.File file = dVar.f474283c[i17];
                        if (file.exists() && !file.delete()) {
                            throw new java.io.IOException("failed to delete " + file);
                        }
                        long j17 = this.f474297n;
                        long[] jArr = dVar.f474282b;
                        this.f474297n = j17 - jArr[i17];
                        jArr[i17] = 0;
                    }
                    this.f474300q++;
                    this.f474298o.append((java.lang.CharSequence) "REMOVE");
                    this.f474298o.append(' ');
                    this.f474298o.append((java.lang.CharSequence) str);
                    this.f474298o.append('\n');
                    this.f474299p.remove(str);
                    if (k()) {
                        this.f474302s.submit(this.f474303t);
                    }
                }
            }
        }
    }
}
