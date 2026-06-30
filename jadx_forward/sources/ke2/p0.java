package ke2;

/* loaded from: classes3.dex */
public final class p0 {
    public p0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final r45.ch1 a(dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(3, java.lang.Long.valueOf(msg.m()));
        ch1Var.set(1, 20008);
        ch1Var.set(2, zl2.q4.f555466a.m());
        return ch1Var;
    }

    public final r45.ch1 b(gk2.e liveData, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        r45.ch1 ch1Var = new r45.ch1();
        r45.ei1 ei1Var = new r45.ei1();
        ei1Var.set(0, emojiInfo.mo42933xb5885648());
        if (z17) {
            ei1Var.set(1, ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.t2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.n6.class))).Ai(emojiInfo));
        }
        ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(ei1Var.mo14344x5f01b1f6()));
        ch1Var.set(1, 20124);
        ch1Var.set(2, c01.z1.r() + java.lang.System.currentTimeMillis());
        r45.xn1 xn1Var = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f555483a;
        xn1Var.set(0, r4Var.m0(liveData));
        xn1Var.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f410345h);
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        return ch1Var;
    }

    public final r45.ch1 c(gk2.e liveData, r45.xn1 atUser, long j17, int i17, java.lang.String replyContent, java.lang.String str, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(atUser, "atUser");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replyContent, "replyContent");
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(0, atUser);
        r45.xn1 xn1Var = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f555483a;
        xn1Var.set(0, r4Var.m0(liveData));
        xn1Var.set(11, ((mm2.c1) liveData.a(mm2.c1.class)).f410345h);
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        r45.xj1 xj1Var = new r45.xj1();
        xj1Var.set(0, replyContent);
        r45.up2 up2Var = new r45.up2();
        up2Var.set(0, str);
        xj1Var.set(1, up2Var);
        xj1Var.set(8, java.lang.Integer.valueOf(i17));
        ch1Var.set(4, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(xj1Var.mo14344x5f01b1f6()));
        ch1Var.set(1, 20002);
        ch1Var.set(10, java.lang.Integer.valueOf(i18));
        ch1Var.set(9, java.lang.Integer.valueOf(i18 > 0 ? 1 : 0));
        ch1Var.set(2, zl2.q4.f555466a.m());
        ch1Var.set(3, java.lang.Long.valueOf(j17));
        return ch1Var;
    }
}
