package jf5;

/* loaded from: classes11.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public jf5.n0 f381031a;

    /* renamed from: b, reason: collision with root package name */
    public jf5.n0 f381032b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f381033c = kz5.p0.f395529d;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381034d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f381035e;

    public static java.lang.String b(jf5.q0 q0Var, yz5.l lVar, int i17, java.lang.Object obj) {
        java.lang.String str;
        if ((i17 & 1) != 0) {
            lVar = null;
        }
        jf5.t0 e17 = q0Var.e();
        if (e17 == null) {
            return "";
        }
        java.lang.String str2 = q0Var.f381034d;
        if (str2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectionManager", "getSelectedText failed: rawMarkdown is null");
            return "";
        }
        int b17 = jf5.k0.b(str2, e17.f381043a);
        int b18 = jf5.k0.b(str2, e17.f381044b);
        if (b17 >= 0 && b17 <= str2.length() && b18 <= str2.length() && b18 >= b17) {
            java.lang.String substring = str2.substring(b17, b18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            return (lVar == null || (str = (java.lang.String) lVar.mo146xb9724478(substring)) == null) ? substring : str;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SelectionManager", "getSelectedText failed: invalid char range charStart=" + b17 + ", charEnd=" + b18 + ", markdownLen=" + str2.length());
        return "";
    }

    public final void a() {
        jf5.n0 n0Var;
        jf5.n0 n0Var2 = this.f381031a;
        if (n0Var2 == null || (n0Var = this.f381032b) == null) {
            return;
        }
        int indexOf = this.f381033c.indexOf(n0Var2.f381017a);
        int indexOf2 = this.f381033c.indexOf(n0Var.f381017a);
        if (indexOf < 0 || indexOf2 < 0) {
            return;
        }
        if (indexOf > indexOf2 || (indexOf == indexOf2 && n0Var2.f381018b > n0Var.f381018b)) {
            this.f381031a = n0Var;
            this.f381032b = n0Var2;
        }
    }

    public final e06.k c(jf5.f0 content) {
        jf5.n0 n0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        jf5.n0 n0Var2 = this.f381031a;
        if (n0Var2 == null || (n0Var = this.f381032b) == null) {
            return null;
        }
        int indexOf = this.f381033c.indexOf(n0Var2.f381017a);
        int indexOf2 = this.f381033c.indexOf(n0Var.f381017a);
        int indexOf3 = this.f381033c.indexOf(content);
        if (indexOf < 0 || indexOf2 < 0) {
            return null;
        }
        if (!(indexOf <= indexOf3 && indexOf3 <= indexOf2)) {
            return null;
        }
        int i17 = indexOf3 == indexOf ? n0Var2.f381018b : 0;
        int length = indexOf3 == indexOf2 ? n0Var.f381018b : ((jf5.j0) content).c().length();
        if (length > i17) {
            return e06.p.m(i17, length);
        }
        return null;
    }

    public final boolean d() {
        jf5.n0 n0Var;
        jf5.n0 n0Var2 = this.f381031a;
        return n0Var2 != null && (n0Var = this.f381032b) != null && this.f381033c.contains(n0Var2.f381017a) && this.f381033c.contains(n0Var.f381017a);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jf5.t0 e() {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jf5.q0.e():jf5.t0");
    }

    public final void f(jf5.f0 content, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        jf5.j0 j0Var = (jf5.j0) content;
        this.f381031a = new jf5.n0(content, e06.p.f(i17, 0, j0Var.c().length()));
        this.f381032b = new jf5.n0(content, e06.p.f(i18, 0, j0Var.c().length()));
        a();
        yz5.a aVar = this.f381035e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public final void g(jf5.f0 content, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f381032b = new jf5.n0(content, e06.p.f(i17, 0, ((jf5.j0) content).c().length()));
        a();
        yz5.a aVar = this.f381035e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    public final void h(jf5.f0 content, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        this.f381031a = new jf5.n0(content, e06.p.f(i17, 0, ((jf5.j0) content).c().length()));
        a();
        yz5.a aVar = this.f381035e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
