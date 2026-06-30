package ou0;

/* loaded from: classes5.dex */
public abstract class d0 {
    public static final java.util.Map a(com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c11120x15dce88d, "<this>");
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("FPS", java.lang.String.valueOf(c11120x15dce88d.f152726f));
        lVarArr[1] = new jz5.l("Width", java.lang.String.valueOf(c11120x15dce88d.f152724d));
        lVarArr[2] = new jz5.l("Height", java.lang.String.valueOf(c11120x15dce88d.f152725e));
        lVarArr[3] = new jz5.l("VideoBitrate", java.lang.String.valueOf(c11120x15dce88d.f152727g));
        lVarArr[4] = new jz5.l("AudioBitrate", java.lang.String.valueOf(c11120x15dce88d.f152731n));
        int i18 = c11120x15dce88d.f152730m;
        if (i18 <= 0) {
            i17 = 90;
        } else {
            int i19 = c11120x15dce88d.f152726f;
            if (i19 <= 0) {
                i19 = 30;
            }
            i17 = i18 * i19;
        }
        lVarArr[5] = new jz5.l("GOP", java.lang.String.valueOf(i17));
        lVarArr[6] = new jz5.l("CodecID", c11120x15dce88d.A == 1 ? "HEVC" : "H264");
        lVarArr[7] = new jz5.l("Duration", java.lang.String.valueOf(c11120x15dce88d.f152728h));
        return p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(kz5.c1.k(lVarArr));
    }

    public static final com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624, long j17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c16993xacc19624, "<this>");
        m40.k0 k0Var = (m40.k0) i95.n0.c(m40.k0.class);
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = c16993xacc19624.f237209n;
        if (c11120x15dce88d == null) {
            if (z17) {
                ((c61.p7) k0Var).getClass();
                c11120x15dce88d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K2();
            } else {
                ((c61.p7) k0Var).getClass();
                c11120x15dce88d = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L2();
            }
        }
        com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d2 = new com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d(c11120x15dce88d);
        c11120x15dce88d2.f152728h = (int) (j17 / 1000);
        m40.k0 k0Var2 = (m40.k0) i95.n0.c(m40.k0.class);
        float ij6 = (float) ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).ij();
        k0Var2.getClass();
        c11120x15dce88d2.C = (int) ((ij6 / (1048576 * 1.0f)) * 0.38f);
        return c11120x15dce88d2;
    }
}
