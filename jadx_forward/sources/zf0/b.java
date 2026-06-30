package zf0;

/* loaded from: classes12.dex */
public final class b {
    public b(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.String a(java.lang.String str, bm5.f0 resType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        if (str == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(bytes);
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        return new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0(gm0.j1.b().j() + "_VideoFeatureService"), "send_" + resType.name() + '_' + b17).o();
    }

    public final java.lang.String b(y15.d videoMsg, bm5.f0 resType) {
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoMsg, "videoMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resType, "resType");
        if (resType == bm5.f0.f104104s) {
            y15.c n17 = videoMsg.n();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.m75945x2fec8307(n17.f540455d + 5))) {
                y15.c n18 = videoMsg.n();
                m75945x2fec8307 = n18.m75945x2fec8307(n18.f540455d + 1);
            } else {
                y15.c n19 = videoMsg.n();
                m75945x2fec8307 = n19.m75945x2fec8307(n19.f540455d + 5);
            }
        } else {
            y15.c n27 = videoMsg.n();
            m75945x2fec8307 = n27.m75945x2fec8307(n27.f540455d + 23);
        }
        return a(m75945x2fec8307, resType);
    }

    public final boolean c(int i17) {
        switch (i17) {
            case -520023:
            case -520019:
            case -520008:
            case -520002:
            case -510001:
                return false;
            default:
                return true;
        }
    }
}
