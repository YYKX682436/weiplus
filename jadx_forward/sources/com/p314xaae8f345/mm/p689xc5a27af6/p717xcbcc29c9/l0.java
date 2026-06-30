package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 f147031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j f147032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.b1 b1Var, com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j jVar) {
        super(0);
        this.f147031d = b1Var;
        this.f147032e = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar = this.f147031d.f146889s;
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.j jVar = this.f147032e;
        if (fVar != null) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 message = jVar.f147000a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            if (context == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatRecordsTtsFloatBallHelper", "updateMessageInfo failed, context is null msgId=" + message.m124847x74d37ac6());
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = fVar.f146941e;
                if (c12886x91aa2b6d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatRecordsTtsFloatBallHelper", "updateMessageInfo failed, ballInfo is null msgId=" + message.m124847x74d37ac6());
                } else {
                    fVar.f146942f = message.m124847x74d37ac6();
                    fVar.f146943g = message.Q0();
                    fVar.f146944h = fVar.a(context, message);
                    c12886x91aa2b6d.f174596x = fVar.b(context);
                    fVar.c().V(c12886x91aa2b6d);
                }
            }
        }
        java.lang.String Q0 = jVar.f147000a.Q0();
        if (Q0 != null) {
            com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.r1.c(false, new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.n0(Q0, jVar.f147000a.m124847x74d37ac6()));
        }
        return jz5.f0.f384359a;
    }
}
