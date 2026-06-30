package n36;

/* loaded from: classes16.dex */
public final class k implements java.io.Closeable, java.io.Flushable {
    public static final java.util.regex.Pattern A = java.util.regex.Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: d, reason: collision with root package name */
    public final s36.b f416368d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.File f416369e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.File f416370f;

    /* renamed from: g, reason: collision with root package name */
    public final java.io.File f416371g;

    /* renamed from: h, reason: collision with root package name */
    public final java.io.File f416372h;

    /* renamed from: i, reason: collision with root package name */
    public final int f416373i;

    /* renamed from: m, reason: collision with root package name */
    public final long f416374m;

    /* renamed from: n, reason: collision with root package name */
    public final int f416375n;

    /* renamed from: p, reason: collision with root package name */
    public x36.l f416377p;

    /* renamed from: r, reason: collision with root package name */
    public int f416379r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f416380s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f416381t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f416382u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f416383v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f416384w;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.concurrent.Executor f416386y;

    /* renamed from: o, reason: collision with root package name */
    public long f416376o = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedHashMap f416378q = new java.util.LinkedHashMap(0, 0.75f, true);

    /* renamed from: x, reason: collision with root package name */
    public long f416385x = 0;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f416387z = new n36.e(this);

    public k(s36.b bVar, java.io.File file, int i17, int i18, long j17, java.util.concurrent.Executor executor) {
        this.f416368d = bVar;
        this.f416369e = file;
        this.f416373i = i17;
        this.f416370f = new java.io.File(file, "journal");
        this.f416371g = new java.io.File(file, "journal.tmp");
        this.f416372h = new java.io.File(file, "journal.bkp");
        this.f416375n = i18;
        this.f416374m = j17;
        this.f416386y = executor;
    }

    public final synchronized void a() {
        try {
            synchronized (this) {
            }
        } catch (java.lang.Throwable th6) {
            throw th6;
        }
        if (this.f416382u) {
            throw new java.lang.IllegalStateException("cache is closed");
        }
    }

    public synchronized void b(n36.h hVar, boolean z17) {
        n36.i iVar = hVar.f416352a;
        if (iVar.f416361f != hVar) {
            throw new java.lang.IllegalStateException();
        }
        if (z17 && !iVar.f416360e) {
            for (int i17 = 0; i17 < this.f416375n; i17++) {
                if (!hVar.f416353b[i17]) {
                    hVar.a();
                    throw new java.lang.IllegalStateException("Newly created entry didn't create value for index " + i17);
                }
                s36.b bVar = this.f416368d;
                java.io.File file = iVar.f416359d[i17];
                ((s36.a) bVar).getClass();
                if (!file.exists()) {
                    hVar.a();
                    return;
                }
            }
        }
        for (int i18 = 0; i18 < this.f416375n; i18++) {
            java.io.File file2 = iVar.f416359d[i18];
            if (z17) {
                ((s36.a) this.f416368d).getClass();
                if (file2.exists()) {
                    java.io.File file3 = iVar.f416358c[i18];
                    ((s36.a) this.f416368d).c(file2, file3);
                    long j17 = iVar.f416357b[i18];
                    ((s36.a) this.f416368d).getClass();
                    long length = file3.length();
                    iVar.f416357b[i18] = length;
                    this.f416376o = (this.f416376o - j17) + length;
                }
            } else {
                ((s36.a) this.f416368d).a(file2);
            }
        }
        this.f416379r++;
        iVar.f416361f = null;
        if (iVar.f416360e || z17) {
            iVar.f416360e = true;
            x36.z zVar = (x36.z) this.f416377p;
            zVar.F0("CLEAN");
            zVar.e(32);
            ((x36.z) this.f416377p).F0(iVar.f416356a);
            x36.l lVar = this.f416377p;
            for (long j18 : iVar.f416357b) {
                x36.z zVar2 = (x36.z) lVar;
                zVar2.e(32);
                zVar2.G(j18);
            }
            ((x36.z) this.f416377p).e(10);
            if (z17) {
                long j19 = this.f416385x;
                this.f416385x = 1 + j19;
                iVar.f416362g = j19;
            }
        } else {
            this.f416378q.remove(iVar.f416356a);
            x36.z zVar3 = (x36.z) this.f416377p;
            zVar3.F0("REMOVE");
            zVar3.e(32);
            ((x36.z) this.f416377p).F0(iVar.f416356a);
            ((x36.z) this.f416377p).e(10);
        }
        ((x36.z) this.f416377p).flush();
        if (this.f416376o > this.f416374m || j()) {
            this.f416386y.execute(this.f416387z);
        }
    }

    public synchronized n36.h c(java.lang.String str, long j17) {
        i();
        a();
        z(str);
        n36.i iVar = (n36.i) this.f416378q.get(str);
        if (j17 != -1 && (iVar == null || iVar.f416362g != j17)) {
            return null;
        }
        if (iVar != null && iVar.f416361f != null) {
            return null;
        }
        if (!this.f416383v && !this.f416384w) {
            this.f416377p.F0("DIRTY").e(32).F0(str).e(10);
            this.f416377p.flush();
            if (this.f416380s) {
                return null;
            }
            if (iVar == null) {
                iVar = new n36.i(this, str);
                this.f416378q.put(str, iVar);
            }
            n36.h hVar = new n36.h(this, iVar);
            iVar.f416361f = hVar;
            return hVar;
        }
        this.f416386y.execute(this.f416387z);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.f416381t && !this.f416382u) {
            for (n36.i iVar : (n36.i[]) this.f416378q.values().toArray(new n36.i[this.f416378q.size()])) {
                n36.h hVar = iVar.f416361f;
                if (hVar != null) {
                    hVar.a();
                }
            }
            x();
            this.f416377p.close();
            this.f416377p = null;
            this.f416382u = true;
            return;
        }
        this.f416382u = true;
    }

    public synchronized n36.j f(java.lang.String str) {
        i();
        a();
        z(str);
        n36.i iVar = (n36.i) this.f416378q.get(str);
        if (iVar != null && iVar.f416360e) {
            n36.j a17 = iVar.a();
            if (a17 == null) {
                return null;
            }
            this.f416379r++;
            this.f416377p.F0("READ").e(32).F0(str).e(10);
            if (j()) {
                this.f416386y.execute(this.f416387z);
            }
            return a17;
        }
        return null;
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f416381t) {
            a();
            x();
            this.f416377p.flush();
        }
    }

    public synchronized void i() {
        if (this.f416381t) {
            return;
        }
        s36.b bVar = this.f416368d;
        java.io.File file = this.f416372h;
        ((s36.a) bVar).getClass();
        if (file.exists()) {
            s36.b bVar2 = this.f416368d;
            java.io.File file2 = this.f416370f;
            ((s36.a) bVar2).getClass();
            if (file2.exists()) {
                ((s36.a) this.f416368d).a(this.f416372h);
            } else {
                ((s36.a) this.f416368d).c(this.f416372h, this.f416370f);
            }
        }
        s36.b bVar3 = this.f416368d;
        java.io.File file3 = this.f416370f;
        ((s36.a) bVar3).getClass();
        if (file3.exists()) {
            try {
                p();
                l();
                this.f416381t = true;
                return;
            } catch (java.io.IOException e17) {
                t36.k.f496994a.l(5, "DiskLruCache " + this.f416369e + " is corrupt: " + e17.getMessage() + ", removing", e17);
                try {
                    close();
                    ((s36.a) this.f416368d).b(this.f416369e);
                    this.f416382u = false;
                } catch (java.lang.Throwable th6) {
                    this.f416382u = false;
                    throw th6;
                }
            }
        }
        v();
        this.f416381t = true;
    }

    public boolean j() {
        int i17 = this.f416379r;
        return i17 >= 2000 && i17 >= this.f416378q.size();
    }

    public final x36.l k() {
        x36.x xVar;
        java.io.File appendingSink = this.f416370f;
        ((s36.a) this.f416368d).getClass();
        try {
            java.util.logging.Logger logger = x36.w.f533247a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appendingSink, "$this$appendingSink");
            xVar = new x36.x(new java.io.FileOutputStream(appendingSink, true), new x36.j0());
        } catch (java.io.FileNotFoundException unused) {
            appendingSink.getParentFile().mkdirs();
            java.util.logging.Logger logger2 = x36.w.f533247a;
            xVar = new x36.x(new java.io.FileOutputStream(appendingSink, true), new x36.j0());
        }
        return x36.v.a(new n36.f(this, xVar));
    }

    public final void l() {
        java.io.File file = this.f416371g;
        s36.b bVar = this.f416368d;
        ((s36.a) bVar).a(file);
        java.util.Iterator it = this.f416378q.values().iterator();
        while (it.hasNext()) {
            n36.i iVar = (n36.i) it.next();
            n36.h hVar = iVar.f416361f;
            int i17 = this.f416375n;
            int i18 = 0;
            if (hVar == null) {
                while (i18 < i17) {
                    this.f416376o += iVar.f416357b[i18];
                    i18++;
                }
            } else {
                iVar.f416361f = null;
                while (i18 < i17) {
                    ((s36.a) bVar).a(iVar.f416358c[i18]);
                    ((s36.a) bVar).a(iVar.f416359d[i18]);
                    i18++;
                }
                it.remove();
            }
        }
    }

    public final void p() {
        java.io.File file = this.f416370f;
        ((s36.a) this.f416368d).getClass();
        x36.m b17 = x36.v.b(x36.v.e(file));
        try {
            x36.b0 b0Var = (x36.b0) b17;
            java.lang.String L0 = b0Var.L0();
            java.lang.String L02 = b0Var.L0();
            java.lang.String L03 = b0Var.L0();
            java.lang.String L04 = b0Var.L0();
            java.lang.String L05 = b0Var.L0();
            if (!"libcore.io.DiskLruCache".equals(L0) || !"1".equals(L02) || !java.lang.Integer.toString(this.f416373i).equals(L03) || !java.lang.Integer.toString(this.f416375n).equals(L04) || !"".equals(L05)) {
                throw new java.io.IOException("unexpected journal header: [" + L0 + ", " + L02 + ", " + L04 + ", " + L05 + "]");
            }
            int i17 = 0;
            while (true) {
                try {
                    q(b0Var.L0());
                    i17++;
                } catch (java.io.EOFException unused) {
                    this.f416379r = i17 - this.f416378q.size();
                    if (b0Var.o1()) {
                        this.f416377p = k();
                    } else {
                        v();
                    }
                    m36.e.c(b17);
                    return;
                }
            }
        } catch (java.lang.Throwable th6) {
            m36.e.c(b17);
            throw th6;
        }
    }

    public final void q(java.lang.String str) {
        java.lang.String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new java.io.IOException("unexpected journal line: ".concat(str));
        }
        int i17 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i17);
        java.util.LinkedHashMap linkedHashMap = this.f416378q;
        if (indexOf2 == -1) {
            substring = str.substring(i17);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i17, indexOf2);
        }
        n36.i iVar = (n36.i) linkedHashMap.get(substring);
        if (iVar == null) {
            iVar = new n36.i(this, substring);
            linkedHashMap.put(substring, iVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                iVar.f416361f = new n36.h(this, iVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new java.io.IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        java.lang.String[] split = str.substring(indexOf2 + 1).split(" ");
        iVar.f416360e = true;
        iVar.f416361f = null;
        if (split.length != iVar.f416363h.f416375n) {
            throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
        }
        for (int i18 = 0; i18 < split.length; i18++) {
            try {
                iVar.f416357b[i18] = java.lang.Long.parseLong(split[i18]);
            } catch (java.lang.NumberFormatException unused) {
                throw new java.io.IOException("unexpected journal line: " + java.util.Arrays.toString(split));
            }
        }
    }

    public synchronized void v() {
        x36.x xVar;
        x36.l lVar = this.f416377p;
        if (lVar != null) {
            ((x36.z) lVar).close();
        }
        s36.b bVar = this.f416368d;
        java.io.File sink = this.f416371g;
        ((s36.a) bVar).getClass();
        try {
            java.util.logging.Logger logger = x36.w.f533247a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sink, "$this$sink");
            xVar = new x36.x(new java.io.FileOutputStream(sink, false), new x36.j0());
        } catch (java.io.FileNotFoundException unused) {
            sink.getParentFile().mkdirs();
            java.util.logging.Logger logger2 = x36.w.f533247a;
            xVar = new x36.x(new java.io.FileOutputStream(sink, false), new x36.j0());
        }
        x36.l a17 = x36.v.a(xVar);
        try {
            x36.z zVar = (x36.z) a17;
            zVar.F0("libcore.io.DiskLruCache");
            zVar.e(10);
            x36.z zVar2 = (x36.z) a17;
            zVar2.F0("1");
            zVar2.e(10);
            zVar2.G(this.f416373i);
            zVar2.e(10);
            zVar2.G(this.f416375n);
            zVar2.e(10);
            zVar2.e(10);
            for (n36.i iVar : this.f416378q.values()) {
                if (iVar.f416361f != null) {
                    zVar2.F0("DIRTY");
                    zVar2.e(32);
                    zVar2.F0(iVar.f416356a);
                    zVar2.e(10);
                } else {
                    zVar2.F0("CLEAN");
                    zVar2.e(32);
                    zVar2.F0(iVar.f416356a);
                    for (long j17 : iVar.f416357b) {
                        x36.z zVar3 = (x36.z) a17;
                        zVar3.e(32);
                        zVar3.G(j17);
                    }
                    zVar2.e(10);
                }
            }
            zVar2.close();
            s36.b bVar2 = this.f416368d;
            java.io.File file = this.f416370f;
            ((s36.a) bVar2).getClass();
            if (file.exists()) {
                ((s36.a) this.f416368d).c(this.f416370f, this.f416372h);
            }
            ((s36.a) this.f416368d).c(this.f416371g, this.f416370f);
            ((s36.a) this.f416368d).a(this.f416372h);
            this.f416377p = k();
            this.f416380s = false;
            this.f416384w = false;
        } catch (java.lang.Throwable th6) {
            ((x36.z) a17).close();
            throw th6;
        }
    }

    public boolean w(n36.i iVar) {
        n36.h hVar = iVar.f416361f;
        if (hVar != null) {
            hVar.c();
        }
        for (int i17 = 0; i17 < this.f416375n; i17++) {
            ((s36.a) this.f416368d).a(iVar.f416358c[i17]);
            long j17 = this.f416376o;
            long[] jArr = iVar.f416357b;
            this.f416376o = j17 - jArr[i17];
            jArr[i17] = 0;
        }
        this.f416379r++;
        x36.l e17 = this.f416377p.F0("REMOVE").e(32);
        java.lang.String str = iVar.f416356a;
        e17.F0(str).e(10);
        this.f416378q.remove(str);
        if (j()) {
            this.f416386y.execute(this.f416387z);
        }
        return true;
    }

    public void x() {
        while (this.f416376o > this.f416374m) {
            w((n36.i) this.f416378q.values().iterator().next());
        }
        this.f416383v = false;
    }

    public final void z(java.lang.String str) {
        if (A.matcher(str).matches()) {
            return;
        }
        throw new java.lang.IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }
}
