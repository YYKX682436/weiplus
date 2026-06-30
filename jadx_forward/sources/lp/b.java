package lp;

/* loaded from: classes5.dex */
public class b implements q25.a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f401755a = 0;

    static {
        q25.b.b(new lp.b(), "//chatroom");
    }

    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, final java.lang.String str) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        if (!str2.equals("info")) {
            if (str2.equals("nickname") && com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str);
                W0.W0(0);
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().mo11260x413cb2b4(W0);
                com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a g17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).g(str, 0);
                g17.f273779b = new o65.c() { // from class: lp.b$$a
                    @Override // o65.c
                    /* renamed from: b */
                    public final void a(int i17, int i18, java.lang.String str3, o65.c cVar) {
                        java.lang.String str4 = str;
                        if (i17 != 0 || i18 != 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Command.ChatRoom", "getChatroomMemberDetail %s errorType %s errorCoe", str4, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                            return;
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Command.ChatRoom", "getChatroomMemberDetail success %s", str4);
                        ((ku5.t0) ku5.t0.f394148d).B(new lp.RunnableC29109x2d1841());
                    }
                };
                g17.b();
            }
            return true;
        }
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str)) {
            com.p314xaae8f345.mm.p2590x523fc97f.p2591x633fb29.p2592xbeeb310a.a m17 = ((fd0.e) ((gd0.e) i95.n0.c(gd0.e.class))).wi(str).m(str);
            m17.f273779b = new o65.c() { // from class: lp.b$$b
                @Override // o65.c
                /* renamed from: b */
                public final void a(int i17, int i18, java.lang.String str3, o65.c cVar) {
                    java.lang.String str4 = str;
                    if (i17 != 0 || i18 != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Command.ChatRoom", "getchatRoomInfoDetail %s errorType %s errorCoe", str4, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Command.ChatRoom", "getchatRoomInfoDetail success %s", str4);
                    ((ku5.t0) ku5.t0.f394148d).B(new lp.RunnableC29110x2d1842());
                }
            };
            m17.b();
        }
        return true;
    }
}
