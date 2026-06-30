package t00;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt00/o1;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCUserTicket;", "Lcom/tencent/mm/feature/ecs/jsapi/SelectContactEcsActionHandler$IPCSingleUserInfo;", "<init>", "()V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes9.dex */
public final class o1 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        c00.h3 h3Var;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712 c10532x5db47712 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10532x5db47712) obj;
        java.lang.String userName = c10532x5db47712 != null ? c10532x5db47712.f147170d : null;
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(userName)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactEcsActionHandler", "IPCGetExclusiveSelectedUserInfo, select contact is open im");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c("", "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nel)));
                return;
            }
            return;
        }
        boolean z17 = false;
        if ((userName == null || userName.length() == 0) || !com.p314xaae8f345.mm.p2621x8fb0427b.z3.O4(userName)) {
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c("", "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nek)));
                return;
            }
            return;
        }
        java.lang.String Di = ((j00.u1) ((c00.i3) i95.n0.c(c00.i3.class))).Di(c10532x5db47712.f147171e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(Di)) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(Di);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m17);
            if (!m17.isEmpty()) {
                java.util.Iterator it = m17.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((java.lang.String) it.next()).equals(userName)) {
                        z17 = true;
                        break;
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsUtil", "isInChatRoomList, chatroom:" + Di + " is not group");
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectContactEcsActionHandler", "IPCGetExclusiveSelectedUserInf, select contact is not in group");
            if (rVar != null) {
                rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c("", "", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nej)));
                return;
            }
            return;
        }
        j00.u1 u1Var = (j00.u1) ((c00.i3) i95.n0.c(c00.i3.class));
        u1Var.wi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateSendGiftSessionRecipientUsername passedTicket:");
        java.lang.String str = c10532x5db47712.f147171e;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsGiftSendSessionMgr", sb6.toString());
        if (u1Var.Ai(str) && (h3Var = (c00.h3) u1Var.Ni().get(str)) != null) {
            h3Var.f118515a = userName;
        }
        c00.e4 wi6 = ((b00.t2) ((c00.f4) i95.n0.c(c00.f4.class))).wi(userName, Di);
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p725x60b7c31.C10530x4ae8da5c(wi6.f118500a, wi6.f118501b, ""));
        }
    }
}
