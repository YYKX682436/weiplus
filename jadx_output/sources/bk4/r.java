package bk4;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final bk4.r f21544a = new bk4.r();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f21545b;

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f21546c;

    /* renamed from: d, reason: collision with root package name */
    public static pj4.v f21547d;

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f21548e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f21549f;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String a17 = en1.a.a();
        kotlin.jvm.internal.o.f(a17, "username(...)");
        byte[] bytes = a17.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        sb6.append(kk.k.g(bytes));
        sb6.append("RecentStatusInfoStorage");
        f21545b = sb6.toString();
        f21546c = jz5.h.b(bk4.q.f21537d);
        f21548e = jz5.h.b(bk4.p.f21527d);
        f21549f = jz5.h.b(bk4.o.f21520d);
    }

    public final boolean a(ej4.k recentStatusInfo) {
        kotlin.jvm.internal.o.g(recentStatusInfo, "recentStatusInfo");
        pj4.v b17 = b();
        java.util.LinkedList info_list = b17.f355307d;
        kotlin.jvm.internal.o.f(info_list, "info_list");
        java.util.Iterator it = info_list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            java.lang.String str = recentStatusInfo.f253369d;
            if (!hasNext) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.RecentStatusInfoStorage", "deleteShareInfo: " + str + " is fail");
                return false;
            }
            pj4.u uVar = (pj4.u) it.next();
            if (kotlin.jvm.internal.o.b(uVar.f355300d, str)) {
                if (kotlin.jvm.internal.o.b(recentStatusInfo.f253370e, uVar.f355302f)) {
                    info_list.remove(uVar);
                    java.lang.Object value = ((jz5.n) f21546c).getValue();
                    kotlin.jvm.internal.o.f(value, "getValue(...)");
                    ((com.tencent.mm.sdk.platformtools.o4) value).H("MMKV_KEY_RECENT_STATUS_INFO_LIST", b17.toByteArray());
                    f21547d = b17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.RecentStatusInfoStorage", "deleteShareInfo: " + str + ' ');
                    return true;
                }
            }
        }
    }

    public final pj4.v b() {
        pj4.v vVar = f21547d;
        if (vVar != null) {
            return vVar;
        }
        pj4.v vVar2 = new pj4.v();
        java.lang.Object value = ((jz5.n) f21546c).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        byte[] j17 = ((com.tencent.mm.sdk.platformtools.o4) value).j("MMKV_KEY_RECENT_STATUS_INFO_LIST");
        if (j17 != null) {
            vVar2.parseFrom(j17);
        }
        f21547d = vVar2;
        return vVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (r3 == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c() {
        /*
            r8 = this;
            pj4.v r0 = r8.b()
            java.util.LinkedList r0 = r0.f355307d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r2 = "iterator(...)"
            kotlin.jvm.internal.o.f(r0, r2)
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9e
            int r2 = r1.size()
            r3 = 6
            if (r2 >= r3) goto L9e
            java.lang.Object r2 = r0.next()
            pj4.u r2 = (pj4.u) r2
            kotlin.jvm.internal.o.d(r2)
            bk4.f r3 = bk4.i.a()
            java.lang.String r4 = r2.f355300d
            pj4.o1 r3 = r3.j(r4)
            long r4 = r2.f355301e
            long r6 = c01.id.c()
            long r6 = r6 - r4
            r4 = 1209600000(0x48190800, double:5.97621805E-315)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 >= 0) goto L47
            r4 = r5
            goto L48
        L47:
            r4 = r6
        L48:
            if (r4 == 0) goto L87
            jz5.g r4 = bk4.r.f21548e
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.getValue()
            pj4.p1 r4 = (pj4.p1) r4
            java.lang.String r7 = r2.f355300d
            boolean r4 = bk4.g0.i(r4, r7)
            if (r4 != 0) goto L6e
            jz5.g r4 = bk4.r.f21549f
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.getValue()
            pj4.p1 r4 = (pj4.p1) r4
            java.lang.String r7 = r2.f355300d
            boolean r4 = bk4.g0.i(r4, r7)
            if (r4 == 0) goto L87
        L6e:
            if (r3 == 0) goto L83
            pj4.g0 r3 = bk4.g0.e(r3, r5)
            if (r3 == 0) goto L79
            java.lang.String r3 = r3.f355052m
            goto L7a
        L79:
            r3 = 0
        L7a:
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            r3 = r3 ^ r5
            if (r3 != r5) goto L83
            r3 = r5
            goto L84
        L83:
            r3 = r6
        L84:
            if (r3 == 0) goto L87
            goto L88
        L87:
            r5 = r6
        L88:
            if (r5 == 0) goto L15
            ej4.k r3 = new ej4.k
            java.lang.String r4 = r2.f355300d
            java.lang.String r5 = "iconId"
            kotlin.jvm.internal.o.f(r4, r5)
            java.lang.String r2 = r2.f355302f
            r3.<init>(r4, r2)
            r1.add(r3)
            goto L15
        L9e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[queryLimit] userNameList size="
            r0.<init>(r2)
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.TextStatus.RecentStatusInfoStorage"
            com.tencent.mars.xlog.Log.i(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "[query] list size="
            r0.<init>(r3)
            int r3 = r1.size()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bk4.r.c():java.util.List");
    }
}
