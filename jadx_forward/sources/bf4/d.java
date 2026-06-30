package bf4;

/* loaded from: classes10.dex */
public final class d extends af4.a {

    /* renamed from: b, reason: collision with root package name */
    public static final bf4.d f101246b = new bf4.d();

    @Override // es0.c
    public java.lang.Object d() {
        return new bf4.c(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, 0, 0, 0, 0.0f, 32767, null);
    }

    @Override // es0.c
    public void e() {
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d m71384x4edea845;
        float L;
        bf4.c cVar = (bf4.c) b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
            m71384x4edea845 = d11.s.fj().rj();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.p2238x65fca6e.BinderC18467xdab0743d binderC18467xdab0743d = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.p2238x65fca6e.BinderC18467xdab0743d.f253393g;
            if (binderC18467xdab0743d == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("instance");
                throw null;
            }
            m71384x4edea845 = binderC18467xdab0743d.m71384x4edea845();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m71384x4edea845, "<set-?>");
        cVar.f101245p = m71384x4edea845;
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = ((bf4.c) b()).f101245p;
        ((bf4.c) b()).f101230a = c11120x15dce88d.f152724d;
        bf4.c cVar2 = (bf4.c) b();
        int i17 = c11120x15dce88d.f152724d;
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        cVar2.f101231b = (h17.y * i17) / h17.x;
        if (((bf4.c) b()).f101231b % 16 != 0) {
            bf4.c cVar3 = (bf4.c) b();
            r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
            int i18 = ((bf4.c) b()).f101231b;
            ((q90.i) lVar).getClass();
            cVar3.f101231b = ai3.d.a(i18);
        }
        if (((bf4.c) b()).f101230a % 16 != 0) {
            bf4.c cVar4 = (bf4.c) b();
            r90.l lVar2 = (r90.l) i95.n0.c(r90.l.class);
            int i19 = ((bf4.c) b()).f101230a;
            ((q90.i) lVar2).getClass();
            cVar4.f101230a = ai3.d.a(i19);
        }
        ((bf4.c) b()).f101245p.f152724d = ((bf4.c) b()).f101230a;
        ((bf4.c) b()).f101245p.f152725e = ((bf4.c) b()).f101231b;
        ((bf4.c) b()).f101232c = c11120x15dce88d.f152727g;
        ((bf4.c) b()).f101233d = c11120x15dce88d.f152731n;
        ((bf4.c) b()).f101234e = c11120x15dce88d.f152726f;
        ((bf4.c) b()).f101237h = c11120x15dce88d.f152730m;
        ((bf4.c) b()).f101236g = c11120x15dce88d.f152728h;
        ((bf4.c) b()).f101239j = c11120x15dce88d.f152735r;
        ((bf4.c) b()).f101238i = c11120x15dce88d.f152734q;
        ((bf4.c) b()).f101240k = c11120x15dce88d.f152736s;
        ((bf4.c) b()).f101241l = c11120x15dce88d.f152737t;
        ((bf4.c) b()).f101242m = c11120x15dce88d.f152732o;
        bf4.c cVar5 = (bf4.c) b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("StoryCheckSendVideoBitrateLimit"), 1.3f);
        } else {
            ((q90.k) ((r90.m) i95.n0.c(r90.m.class))).getClass();
            L = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1874x633fb29.BinderC16530x6b2d3ec8.m66802x9cf0d20b().mo66813xbfca20ab("StoryCheckSendVideoBitrateLimit"), 1.3f);
        }
        cVar5.f101244o = L;
        wo.g1 g1Var = wo.v1.f529363j;
        if (g1Var.f529220a != -1) {
            ((bf4.c) b()).f101243n = g1Var.f529220a;
        }
        if (z65.c.a()) {
            ((bf4.c) b()).f101243n = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_TOP_STORY_ENCODER_TYPE_INT, 2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryEncodeElementConfig", "loadConfigFromVideoParam: " + b());
    }
}
