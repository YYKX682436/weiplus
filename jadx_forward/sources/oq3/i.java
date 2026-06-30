package oq3;

/* loaded from: classes12.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(int i17, int i18, int i19, int i27) {
        int b17 = b(i19, i27);
        if (i18 == 0) {
            return 0;
        }
        if (b17 != 1 && b17 != 2 && b17 != 3) {
            i18 = 0;
        }
        return i18;
    }

    public final int b(int i17, int i18) {
        if (i17 == 1) {
            if (i18 == 0) {
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19962xd5a8a8f4());
            }
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19956x97df8387());
        }
        if (i17 == 2) {
            if (i18 == 0) {
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19961x1895c8e1());
            }
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19955x28804ab4());
        }
        if (i17 == 3) {
            if (i18 == 0) {
                return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19963x9c0868c2());
            }
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19957xbb126fcf());
        }
        if (i17 != 4) {
            return 0;
        }
        if (i18 == 0) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19960xa1e87c55());
        }
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19954xab2adfa8());
    }

    public final int c(int i17, java.lang.String str) {
        if (str == null) {
            str = "";
        }
        return b(i17, d(str));
    }

    public final int d(java.lang.String msgInfoTalker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfoTalker, "msgInfoTalker");
        return r26.i0.n(msgInfoTalker, "@chatroom", false) ? 1 : 0;
    }

    public final oq3.h e(java.lang.String str) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null);
        oq3.h hVar = new oq3.h();
        if (d17 == null || !d17.containsKey(".msgsource.appmsg_pd.$cdnattachurl_pd_pri")) {
            if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19960xa1e87c55()) == 4) {
                hVar.f428920c = 1;
            }
            return hVar;
        }
        hVar.f428918a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msgsource.appmsg_pd.$cdnattachurl_size"), 0L);
        hVar.f428919b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.appmsg_pd.$cdnattachurl_pd_pri"), 0);
        hVar.f428920c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.appmsg_pd.$cdnattachurl_pd"), 0);
        if (bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19960xa1e87c55()) == 4) {
            hVar.f428920c = 1;
        }
        return hVar;
    }

    public final oq3.j f(java.lang.String str) {
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "msgsource", null);
        oq3.j jVar = new oq3.j();
        if (d17 == null || !d17.containsKey(".msgsource.imgmsg_pd.$cdnmidimgurl_pd_pri")) {
            bm5.o1 o1Var = bm5.o1.f104252a;
            if (o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19962xd5a8a8f4()) == 4) {
                jVar.f428923c = 1;
            }
            if (o1Var.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19961x1895c8e1()) == 4) {
                jVar.f428926f = 1;
            }
            return jVar;
        }
        jVar.f428921a = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnmidimgurl_size"), 0L);
        jVar.f428922b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnmidimgurl_pd_pri"), 0);
        jVar.f428923c = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnmidimgurl_pd"), 0);
        jVar.f428924d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnbigimgurl_size"), 0L);
        jVar.f428925e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnbigimgurl_pd_pri"), 0);
        jVar.f428926f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) d17.get(".msgsource.imgmsg_pd.$cdnbigimgurl_pd"), 0);
        bm5.o1 o1Var2 = bm5.o1.f104252a;
        if (o1Var2.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19962xd5a8a8f4()) == 4) {
            jVar.f428923c = 1;
        }
        if (o1Var2.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2515x86dd3575.C19961x1895c8e1()) == 4) {
            jVar.f428926f = 1;
        }
        return jVar;
    }
}
