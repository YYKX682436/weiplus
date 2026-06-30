package h13;

/* loaded from: classes8.dex */
public final class a0 implements xg3.e0 {
    public void b(int i17, r45.g25 g25Var, xg3.q0 option) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        h13.l0 l0Var = (h13.l0) i95.n0.c(h13.l0.class);
        l0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "[onOpLogResult] ret:%s %s", java.lang.Integer.valueOf(i17), option);
        if (option.b() != 213) {
            if (option.b() == 214) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = option.f535964j;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.DelForcePush");
                r45.fc0 fc0Var = (r45.fc0) fVar;
                int i18 = fc0Var.f455728e;
                if (i17 == 0) {
                    ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).wi(fc0Var.f455727d, i18, c01.id.c() / 1000);
                    j13.a aVar = j13.a.f378710d;
                    java.lang.String ForcePushId = fc0Var.f455727d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ForcePushId, "ForcePushId");
                    z17 = aVar.d(ForcePushId);
                } else {
                    z17 = false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "[onOpLogResult] DelForcePush id:%s ret:%s isDeleteLocal:%s", fc0Var.f455727d, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = option.f535964j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddForcePush");
        r45.i4 i4Var = (r45.i4) fVar2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ForceNotifyService", "[onOpLogResult] AddForcePush ForcePushId:%s", i4Var.f458249d);
        if (i17 != 0 || l0Var.f359674d) {
            j13.a aVar2 = j13.a.f378710d;
            java.lang.String ForcePushId2 = i4Var.f458249d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ForcePushId2, "ForcePushId");
            aVar2.J0(ForcePushId2, -1);
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).wi(i4Var.f458249d, 6, c01.id.c() / 1000);
            return;
        }
        j13.a aVar3 = j13.a.f378710d;
        java.lang.String ForcePushId3 = i4Var.f458249d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ForcePushId3, "ForcePushId");
        aVar3.J0(ForcePushId3, 1);
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).wi(i4Var.f458249d, 1, c01.id.c() / 1000);
    }
}
