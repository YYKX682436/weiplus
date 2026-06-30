package t00;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt00/q1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserTicket;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserInfo;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class q1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712 userTicket = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userTicket, "userTicket");
        java.lang.String str = userTicket.f147170d;
        int i17 = 0;
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(str) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str)) {
            if (rVar != null) {
                int i18 = h20.e.f359798a;
                rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34("", "", 0, 1, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nek)));
                return;
            }
            return;
        }
        ((j00.u1) ((c00.i3) i95.n0.c(c00.i3.class))).Ri(str, userTicket.f147171e);
        i95.m c17 = i95.n0.c(c00.f4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        c00.e4 wi6 = ((b00.t2) ((c00.f4) c17)).wi(str, null);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str)) {
            int i19 = h20.e.f359798a;
            i17 = 1;
        } else {
            int i27 = h20.e.f359798a;
        }
        int wi7 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(str) ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str) : 1;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10531x377cba34(wi6.f118500a, wi6.f118501b, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(wi7), ""));
        }
    }
}
