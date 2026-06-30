package e73;

/* loaded from: classes12.dex */
public final class d {
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ballInfo) {
        long j17;
        long j18;
        long j19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ballInfo, "ballInfo");
        java.lang.String g17 = ballInfo.g("handoff#fullPath", "");
        java.lang.String g18 = ballInfo.g("handoff#fileType", "");
        java.lang.String g19 = ballInfo.g("handoff#title", "");
        java.lang.String g27 = ballInfo.g("handoff#md5", "");
        synchronized (ballInfo) {
            j17 = ballInfo.i("handoff#size") ? ballInfo.G.getLong("handoff#size", 0L) : 0L;
        }
        int f17 = ballInfo.f("handoff#source", 0);
        java.lang.String g28 = ballInfo.g("handoff#svrId", "");
        java.lang.String g29 = ballInfo.g("handoff#extId", "");
        java.lang.String g37 = ballInfo.g("handoff#cdnURL", "");
        java.lang.String g38 = ballInfo.g("handoff#aesKey", "");
        java.lang.String g39 = ballInfo.g("handoff#authKey", "");
        int f18 = ballInfo.f("handoff#fileStatus", 0);
        java.lang.String g47 = ballInfo.g("handoff#appId", "");
        int f19 = ballInfo.f("handoff#sdkVersion", 0);
        java.lang.String g48 = ballInfo.g("handoff#KmediaId", "");
        synchronized (ballInfo) {
            if (ballInfo.i("handoff#KUploadedSize")) {
                j18 = j17;
                j19 = ballInfo.G.getLong("handoff#KUploadedSize", 0L);
            } else {
                j18 = j17;
                j19 = 0;
            }
        }
        java.lang.String g49 = ballInfo.g("handoff#from", "");
        java.lang.String g57 = ballInfo.g("handoff#to", "");
        java.lang.String g58 = ballInfo.g("handoff#key", "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g27);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g28);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g29);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g37);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g38);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g39);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g47);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g48);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g49);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g57);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g58);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc(g17, g18, g19, g27, j18, f17, g28, g29, g37, g38, g39, f18, g47, f19, g48, j19, 2, g49, g57, g58);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc b(r45.gp0 r28, java.lang.String r29, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e73.d.b(r45.gp0, java.lang.String, com.tencent.mm.storage.f9, java.lang.String):com.tencent.mm.plugin.handoff.model.HandOffFile");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        if (c16601x7ed0e40c == null) {
            return null;
        }
        r45.lr4 v07 = c16601x7ed0e40c.v0();
        r45.qs0 qs0Var = new r45.qs0();
        qs0Var.mo11468x92b714fd(c16601x7ed0e40c.f66790x225a93cf);
        java.lang.String m75945x2fec8307 = qs0Var.m75945x2fec8307(1);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = m75945x2fec8307 == null ? "" : m75945x2fec8307;
        java.lang.String m75945x2fec83072 = qs0Var.m75945x2fec8307(2);
        java.lang.String str2 = m75945x2fec83072 == null ? "" : m75945x2fec83072;
        java.lang.String m75945x2fec83073 = v07.m75945x2fec8307(1);
        java.lang.String str3 = m75945x2fec83073 == null ? "" : m75945x2fec83073;
        java.lang.String m75945x2fec83074 = qs0Var.m75945x2fec8307(15);
        java.lang.String str4 = m75945x2fec83074 == null ? "" : m75945x2fec83074;
        long m75942xfb822ef2 = qs0Var.m75942xfb822ef2(29);
        int m75939xb282bd08 = qs0Var.m75939xb282bd08(16);
        java.lang.String m75945x2fec83075 = qs0Var.m75945x2fec8307(17);
        java.lang.String str5 = m75945x2fec83075 == null ? "" : m75945x2fec83075;
        java.lang.String m75945x2fec83076 = qs0Var.m75945x2fec8307(18);
        java.lang.String str6 = m75945x2fec83076 == null ? "" : m75945x2fec83076;
        java.lang.String m75945x2fec83077 = qs0Var.m75945x2fec8307(19);
        java.lang.String str7 = m75945x2fec83077 == null ? "" : m75945x2fec83077;
        java.lang.String m75945x2fec83078 = qs0Var.m75945x2fec8307(20);
        java.lang.String str8 = m75945x2fec83078 == null ? "" : m75945x2fec83078;
        java.lang.String m75945x2fec83079 = qs0Var.m75945x2fec8307(21);
        java.lang.String str9 = m75945x2fec83079 == null ? "" : m75945x2fec83079;
        int m75939xb282bd082 = qs0Var.m75939xb282bd08(22);
        java.lang.String m75945x2fec830710 = qs0Var.m75945x2fec8307(23);
        java.lang.String str10 = m75945x2fec830710 == null ? "" : m75945x2fec830710;
        int m75939xb282bd083 = qs0Var.m75939xb282bd08(24);
        java.lang.String m75945x2fec830711 = qs0Var.m75945x2fec8307(25);
        java.lang.String str11 = m75945x2fec830711 == null ? "" : m75945x2fec830711;
        long m75942xfb822ef22 = qs0Var.m75942xfb822ef2(26);
        java.lang.String m75945x2fec830712 = qs0Var.m75945x2fec8307(27);
        java.lang.String str12 = m75945x2fec830712 == null ? "" : m75945x2fec830712;
        java.lang.String m75945x2fec830713 = qs0Var.m75945x2fec8307(28);
        java.lang.String str13 = m75945x2fec830713 == null ? "" : m75945x2fec830713;
        java.lang.String str14 = c16601x7ed0e40c.f66791xc8a07680;
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16086xc05cbbfc(str, str2, str3, str4, m75942xfb822ef2, m75939xb282bd08, str5, str6, str7, str8, str9, m75939xb282bd082, str10, m75939xb282bd083, str11, m75942xfb822ef22, 2, str12, str13, str14 == null ? "" : str14);
    }
}
