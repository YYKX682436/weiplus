package oq5;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final oq5.g f428946a = new oq5.g();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(java.util.List lines) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lines, "lines");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = lines.iterator();
        while (true) {
            java.lang.String str = null;
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.String log = (java.lang.String) next;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(log, "log");
            int L = r26.n0.L(log, java.lang.String.valueOf(android.os.Process.myPid()), 0, false, 6, null);
            if (L >= 0) {
                java.lang.String pattern = "^" + android.os.Process.myPid() + " \\d+ [A-Z] (MicroMsg\\.\\w+)";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pattern, "pattern");
                java.util.regex.Pattern compile = java.util.regex.Pattern.compile(pattern);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                java.lang.String substring = log.substring(L);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                java.util.regex.Matcher matcher = compile.matcher(substring);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
                r26.m a17 = r26.u.a(matcher, 0, substring);
                if (a17 != null && (!((r26.q) a17).a().isEmpty())) {
                    z17 = true;
                }
                if (z17) {
                    str = (java.lang.String) kz5.n0.i0(((r26.q) a17).a());
                }
            }
            java.lang.Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new java.util.ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((java.util.List) obj).add(next);
        }
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            if (entry.getKey() != null) {
                java.lang.Object key = entry.getKey();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(key);
                if ((((java.lang.CharSequence) key).length() > 0) && (!((java.util.Collection) entry.getValue()).isEmpty())) {
                    java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                    int size = ((java.util.List) entry.getValue()).size();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LogcatInspector", "LogcatLeaking: " + size);
                    linkedHashMap2.put("size", java.lang.Integer.valueOf(size));
                    java.util.List<java.lang.String> K0 = kz5.n0.K0((java.lang.Iterable) entry.getValue(), 5);
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(K0, 10));
                    for (java.lang.String str2 : K0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LogcatInspector", "LogcatLeaking: " + str2);
                        arrayList.add(r26.p0.E0(str2, 200));
                    }
                    linkedHashMap2.put("logs", arrayList);
                    if (mm.o.a()) {
                        ap.a.a(1, "errLog", null, linkedHashMap2, "logcat", entry.getKey(), java.lang.String.valueOf(size));
                    }
                }
            }
        }
    }
}
