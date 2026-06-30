package ko0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ko0.c f391354a = new ko0.c();

    /* renamed from: b, reason: collision with root package name */
    public static java.util.LinkedList f391355b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f391356c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f391357d;

    static {
        ki.i.f389634c.c(new ko0.a());
    }

    public static final java.lang.String c(java.lang.String str, java.lang.String str2, boolean z17) {
        int L = r26.n0.L(str, str2, 0, false, 6, null);
        if (L == -1) {
            return str;
        }
        if (z17) {
            java.lang.String substring = str.substring(0, L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            return substring;
        }
        int length = L + str2.length();
        if (length >= str.length()) {
            return str;
        }
        java.lang.String substring2 = str.substring(length, str.length());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
        return substring2;
    }

    public static final java.lang.String d(java.util.List list, java.lang.String str) {
        if (str.length() == 0) {
            java.lang.String str2 = (java.lang.String) kz5.n0.Z(list);
            return str2 == null ? "" : str2;
        }
        int indexOf = list.indexOf(str);
        return (indexOf <= -1 || indexOf >= list.size() - 1) ? "" : (java.lang.String) list.get(indexOf + 1);
    }

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBackUpUtil", "fetchCdnIp serviceReject:" + f391357d);
        if (f391357d) {
            return;
        }
        f391356c = true;
        r45.wr1 wr1Var = new r45.wr1();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 8260;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetcdnip";
        lVar.f152197a = wr1Var;
        lVar.f152198b = new r45.xr1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        wi6.l().K(ko0.b.f391352a);
    }

    public final java.util.List b(java.lang.String str) {
        java.lang.String c17 = c(str, "?", true);
        if (!(c17.length() > 0)) {
            c17 = null;
        }
        if (c17 == null) {
            return null;
        }
        java.lang.String c18 = c(c17, "://", false);
        java.lang.String str2 = c18.length() > 0 ? c18 : null;
        if (str2 == null) {
            return null;
        }
        return r26.n0.f0(str2, new java.lang.String[]{"/"}, false, 0, 6, null);
    }

    public final void e(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBackUpUtil", "resetCdnIp ".concat(source));
        f391357d = false;
        java.util.LinkedList linkedList = f391355b;
        if (linkedList != null) {
            linkedList.clear();
        }
    }

    public final void f() {
        if (f391356c) {
            return;
        }
        java.util.LinkedList linkedList = f391355b;
        if (linkedList == null || linkedList.isEmpty()) {
            a();
        }
    }
}
