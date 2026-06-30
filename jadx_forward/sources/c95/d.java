package c95;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c95.d f121280a = new c95.d();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f121281b = jz5.h.b(c95.a.f121277d);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f121282c = kz5.c0.i(new android.util.Pair("MsgGroupInfo", up5.k.f511537b), new android.util.Pair("MsgGroupExtInfo", up5.j.f511529b));

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f121283d = jz5.h.b(c95.c.f121279d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f121284e = jz5.h.b(c95.b.f121278d);

    /* JADX WARN: Multi-variable type inference failed */
    public final up5.x a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            return (up5.x) c().m107127x946de4d9(up5.j.f511530c.eq(str));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgGroupDBProvider", "[getMsgGroupExtInfo] groupId=" + str + ", error: " + e17.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final up5.x b(long j17, java.lang.String str) {
        if (j17 != 0) {
            if (!(str == null || str.length() == 0)) {
                try {
                    return (up5.x) c().m107127x946de4d9(up5.j.f511532e.eq(j17).and(up5.j.f511531d.eq(str)));
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgGroupDBProvider", "[getMsgGroupExtInfo] msgId:" + j17 + ", talker:" + str + " , error: " + e17.getMessage());
                }
            }
        }
        return null;
    }

    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae c() {
        return (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) f121284e).mo141623x754a37bb();
    }

    public final java.util.List d(java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        try {
            java.util.List<T> m107095xde3eb429 = c().m107095xde3eb429(up5.j.f511531d.eq(talker).and(up5.j.f511535h.eq(0)), up5.j.f511533f.m108070x651874e(com.p314xaae8f345.p3121x37984a.p3131x37b015.EnumC27016x48e972e.Desc));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m107095xde3eb429, "getAllObjects(...)");
            return m107095xde3eb429;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgGroupDBProvider", "[getMsgGroupInfosByTalker] talker=" + talker + ", error: " + e17.getMessage());
            return kz5.p0.f395529d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[Catch: Exception -> 0x0041, TryCatch #0 {Exception -> 0x0041, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:16:0x0029, B:20:0x0031), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(up5.x r6) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.MsgGroupDBProvider"
            java.lang.String r1 = "[insertOrUpdate] invalid ext info: "
            java.lang.String r2 = "info"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r2)
            java.lang.String r2 = r6.f511648a     // Catch: java.lang.Exception -> L41
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            int r2 = r2.length()     // Catch: java.lang.Exception -> L41
            if (r2 != 0) goto L16
            goto L18
        L16:
            r2 = r3
            goto L19
        L18:
            r2 = r4
        L19:
            if (r2 != 0) goto L31
            java.lang.String r2 = r6.f511649b     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L25
            int r2 = r2.length()     // Catch: java.lang.Exception -> L41
            if (r2 != 0) goto L26
        L25:
            r3 = r4
        L26:
            if (r3 == 0) goto L29
            goto L31
        L29:
            com.tencent.wcdb.core.Table r1 = r5.c()     // Catch: java.lang.Exception -> L41
            r1.m107158x7beb81f7(r6)     // Catch: java.lang.Exception -> L41
            goto L57
        L31:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
            r2.<init>(r1)     // Catch: java.lang.Exception -> L41
            r2.append(r6)     // Catch: java.lang.Exception -> L41
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L41
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r6)     // Catch: java.lang.Exception -> L41
            return
        L41:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[insertOrUpdate] ext error: "
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r6)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c95.d.e(up5.x):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[Catch: Exception -> 0x0047, TryCatch #0 {Exception -> 0x0047, blocks: (B:3:0x0009, B:5:0x000f, B:10:0x001b, B:12:0x001f, B:16:0x0029, B:20:0x0037), top: B:2:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(up5.y r6) {
        /*
            r5 = this;
            java.lang.String r0 = "MicroMsg.MsgGroupDBProvider"
            java.lang.String r1 = "[insertOrUpdate] invalid info: "
            java.lang.String r2 = "info"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r2)
            java.lang.String r2 = r6.f511654a     // Catch: java.lang.Exception -> L47
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L18
            int r2 = r2.length()     // Catch: java.lang.Exception -> L47
            if (r2 != 0) goto L16
            goto L18
        L16:
            r2 = r3
            goto L19
        L18:
            r2 = r4
        L19:
            if (r2 != 0) goto L37
            java.lang.String r2 = r6.f511655b     // Catch: java.lang.Exception -> L47
            if (r2 == 0) goto L25
            int r2 = r2.length()     // Catch: java.lang.Exception -> L47
            if (r2 != 0) goto L26
        L25:
            r3 = r4
        L26:
            if (r3 == 0) goto L29
            goto L37
        L29:
            jz5.g r1 = c95.d.f121283d     // Catch: java.lang.Exception -> L47
            jz5.n r1 = (jz5.n) r1     // Catch: java.lang.Exception -> L47
            java.lang.Object r1 = r1.mo141623x754a37bb()     // Catch: java.lang.Exception -> L47
            com.tencent.wcdb.core.Table r1 = (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) r1     // Catch: java.lang.Exception -> L47
            r1.m107158x7beb81f7(r6)     // Catch: java.lang.Exception -> L47
            goto L5d
        L37:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L47
            r2.<init>(r1)     // Catch: java.lang.Exception -> L47
            r2.append(r6)     // Catch: java.lang.Exception -> L47
            java.lang.String r6 = r2.toString()     // Catch: java.lang.Exception -> L47
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r6)     // Catch: java.lang.Exception -> L47
            return
        L47:
            r6 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[insertOrUpdate] error: "
            r1.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r6)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c95.d.f(up5.y):void");
    }
}
