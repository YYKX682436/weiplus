package lt3;

/* loaded from: classes10.dex */
public final class v {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f402811b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f402812c;

    /* renamed from: f, reason: collision with root package name */
    public static yz5.a f402815f;

    /* renamed from: a, reason: collision with root package name */
    public static final lt3.v f402810a = new lt3.v();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.ArrayList f402813d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final fp0.o f402814e = new fp0.o(new gp0.g(new gp0.b(5, Integer.MAX_VALUE), new gp0.h(1, 5), 1, "videoMixTask"));

    public static final void a(lt3.v vVar, int i17, java.lang.String taskId, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        vVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoMixHandler", "taskId:" + taskId + ", success:" + z17 + ", model:" + c16991x15ced046);
        if (z17) {
            lt3.n nVar = lt3.n.f402793a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
            lt3.h hVar = lt3.n.f402794b;
            lt3.g y07 = hVar.y0(taskId);
            if (y07 != null) {
                y07.f68210x10a0fed7 = 2;
                hVar.z0(taskId, y07);
            }
        } else {
            lt3.n nVar2 = lt3.n.f402793a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
            lt3.h hVar2 = lt3.n.f402794b;
            lt3.g y08 = hVar2.y0(taskId);
            if (y08 != null) {
                y08.f68210x10a0fed7 = 3;
                hVar2.z0(taskId, y08);
            }
        }
        if (c16991x15ced046 != null) {
            lt3.e.f402742a.a(i17, taskId, z17, c16991x15ced046);
            return;
        }
        lt3.e eVar = lt3.e.f402742a;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        eVar.a(i17, taskId, z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool, "", "", 0L, bool, new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255()));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r11 = this;
            lt3.n r0 = lt3.n.f402793a
            long r0 = java.lang.System.currentTimeMillis()
            lt3.h r2 = lt3.n.f402794b
            r2.getClass()
            java.lang.String r3 = lt3.h.f402775f
            java.lang.String r4 = "status"
            r5 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.String r7 = "timeStamp"
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            java.lang.String r9 = "expiredTime"
            java.lang.String r10 = "timeStamp"
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10}
            r1 = 8
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "select * from %s where %s not in (%d, %d) and %s > %d - %s order by %s asc limit 1"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            java.lang.String r1 = "format(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r1 = 0
            java.lang.String[] r3 = new java.lang.String[r1]
            android.database.Cursor r0 = r2.m145256x1d3f4980(r0, r3)
            r2 = 0
            if (r0 == 0) goto L63
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L5c
            if (r3 == 0) goto L58
            lt3.g r3 = new lt3.g     // Catch: java.lang.Throwable -> L5c
            r3.<init>()     // Catch: java.lang.Throwable -> L5c
            r3.mo9015xbf5d97fd(r0)     // Catch: java.lang.Throwable -> L5c
            vz5.b.a(r0, r2)
            goto L64
        L58:
            vz5.b.a(r0, r2)
            goto L63
        L5c:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L5e
        L5e:
            r2 = move-exception
            vz5.b.a(r0, r1)
            throw r2
        L63:
            r3 = r2
        L64:
            if (r3 == 0) goto L6c
            lt3.v r0 = lt3.v.f402810a
            r0.c(r3, r2)
            r1 = 1
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lt3.v.b():boolean");
    }

    public final boolean c(lt3.g gVar, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046) {
        if (gVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mix_background.VideoMixHandler", "start background mix, taskId:" + gVar.f68213x11522065 + ", reyTime:" + gVar.f68208x2277e5be);
            f402814e.b(new lt3.q(gVar, c16991x15ced046), new lt3.t());
        }
        return true;
    }
}
