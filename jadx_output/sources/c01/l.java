package c01;

/* loaded from: classes9.dex */
public abstract class l implements com.tencent.mm.modelbase.t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final c01.o f37292d = new c01.o();

    public com.tencent.mm.storage.f9 b(com.tencent.mm.modelbase.p0 p0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        r45.j4 j4Var = p0Var.f70726a;
        java.lang.String str4 = str3.equals(str) ? str2 : str;
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str4, j4Var.f377568r);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseMsgExtension", "summerbadcr dkmsgid prepareMsgInfo svrid:%d localid:%d  from:%s to:%s talker:%s", java.lang.Long.valueOf(j4Var.f377568r), java.lang.Long.valueOf(o27.getMsgId()), str, str2, str4);
        if (o27.getMsgId() != 0 && o27.getCreateTime() + 604800000 < c01.w9.m(str4, j4Var.f377565o)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.BaseMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", java.lang.Long.valueOf(j4Var.f377568r), java.lang.Long.valueOf(o27.getMsgId()));
            c01.w9.f(o27.getMsgId(), o27.Q0());
            o27.setMsgId(0L);
        }
        if (o27.getMsgId() == 0) {
            o27 = new com.tencent.mm.storage.f9();
            o27.u1(str4);
            o27.o1(j4Var.f377568r);
            o27.setType(j4Var.f377560g);
            java.lang.String g17 = x51.j1.g(j4Var.f377561h);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (g17 == null) {
                g17 = "";
            }
            java.lang.String o17 = com.tencent.mm.sdk.platformtools.t8.o(g17);
            o27.d1(o17);
            o27.e1(k(str4, j4Var, o17));
        }
        return o27;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024f  */
    @Override // com.tencent.mm.modelbase.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 b1(final com.tencent.mm.modelbase.p0 r29) {
        /*
            Method dump skipped, instructions count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.l.b1(com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }

    @Override // com.tencent.mm.modelbase.t0
    public void x5(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
