package jr;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final jr.j f382838a;

    /* renamed from: b, reason: collision with root package name */
    public static int f382839b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static long f382840c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedList f382841d;

    static {
        jr.j jVar = new jr.j();
        f382838a = jVar;
        f382841d = new java.util.LinkedList();
        jVar.c();
    }

    public final void a(r45.af3 af3Var) {
        java.util.LinkedList linkedList = f382841d;
        linkedList.clear();
        java.util.LinkedList PersonalWords = af3Var.f451510d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PersonalWords, "PersonalWords");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(PersonalWords, 10));
        java.util.Iterator it = PersonalWords.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.ze3) it.next()).f473484d);
        }
        linkedList.addAll(arrayList);
        f382839b = af3Var.f451511e;
        f382840c = af3Var.f451512f;
    }

    public final void b() {
        java.util.LinkedList linkedList = f382841d;
        linkedList.clear();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        sb6.append(y12.j.c());
        sb6.append("/suggest_word/word2emoji.txt");
        java.lang.String sb7 = sb6.toString();
        if (com.p314xaae8f345.mm.vfs.w6.j(sb7)) {
            java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(sb7);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(M);
            linkedList.addAll(r26.n0.f0(M, new java.lang.String[]{"\n"}, false, 0, 6, null));
        }
        f382839b = 3;
        f382840c = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[Catch: all -> 0x0089, TryCatch #1 {, blocks: (B:4:0x0005, B:9:0x0038, B:10:0x004f, B:13:0x005b, B:19:0x004a, B:21:0x0024, B:24:0x0029), top: B:3:0x0005, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038 A[Catch: all -> 0x0089, TryCatch #1 {, blocks: (B:4:0x0005, B:9:0x0038, B:10:0x004f, B:13:0x005b, B:19:0x004a, B:21:0x0024, B:24:0x0029), top: B:3:0x0005, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r11 = this;
            java.lang.String r0 = "initWordList: personal:"
            java.util.LinkedList r1 = jr.j.f382841d
            monitor-enter(r1)
            java.lang.String r2 = "MicroMsg.EmojiSuggestCache"
            java.lang.String r3 = "initWordList: start"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r3)     // Catch: java.lang.Throwable -> L89
            com.tencent.mm.storage.n5 r2 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f()     // Catch: java.lang.Throwable -> L89
            z85.x r2 = r2.e()     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "cache_type_words_list"
            byte[] r2 = r2.y0(r3)     // Catch: java.lang.Throwable -> L89
            r45.af3 r3 = new r45.af3     // Catch: java.lang.Throwable -> L89
            r3.<init>()     // Catch: java.lang.Throwable -> L89
            r4 = 0
            if (r2 != 0) goto L24
        L22:
            r3 = r4
            goto L36
        L24:
            r3.mo11468x92b714fd(r2)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L89
            goto L36
        L28:
            r2 = move-exception
            java.lang.String r3 = "safeParser"
            java.lang.String r5 = ""
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L89
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r3, r5, r2)     // Catch: java.lang.Throwable -> L89
            goto L22
        L36:
            if (r3 == 0) goto L4a
            com.tencent.mm.plugin.report.service.g0 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE     // Catch: java.lang.Throwable -> L89
            r5 = 1418(0x58a, double:7.006E-321)
            r2 = 31
            long r7 = (long) r2     // Catch: java.lang.Throwable -> L89
            r9 = 1
            r4.C(r5, r7, r9)     // Catch: java.lang.Throwable -> L89
            jr.j r2 = jr.j.f382838a     // Catch: java.lang.Throwable -> L89
            r2.a(r3)     // Catch: java.lang.Throwable -> L89
            goto L4f
        L4a:
            jr.j r2 = jr.j.f382838a     // Catch: java.lang.Throwable -> L89
            r2.b()     // Catch: java.lang.Throwable -> L89
        L4f:
            java.lang.String r2 = "MicroMsg.EmojiSuggestCache"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L5a
            r0 = 1
            goto L5b
        L5a:
            r0 = 0
        L5b:
            r4.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = ", size:"
            r4.append(r0)     // Catch: java.lang.Throwable -> L89
            java.util.LinkedList r0 = jr.j.f382841d     // Catch: java.lang.Throwable -> L89
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L89
            r4.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = ", type:"
            r4.append(r0)     // Catch: java.lang.Throwable -> L89
            int r0 = jr.j.f382839b     // Catch: java.lang.Throwable -> L89
            r4.append(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = ", version:"
            r4.append(r0)     // Catch: java.lang.Throwable -> L89
            long r5 = jr.j.f382840c     // Catch: java.lang.Throwable -> L89
            r4.append(r5)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L89
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r1)
            return
        L89:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jr.j.c():void");
    }
}
