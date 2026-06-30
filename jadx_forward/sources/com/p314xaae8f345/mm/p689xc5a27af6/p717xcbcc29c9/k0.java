package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f f147018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f147019e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        super(0);
        this.f147018d = fVar;
        this.f147019e = f9Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.f fVar = this.f147018d;
        fVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 message = this.f147019e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatRecordsTtsFloatBallHelper", "init failed, context is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatRecordsTtsFloatBallHelper", "init msgId=" + message.m124847x74d37ac6() + " talker=" + message.Q0());
            fVar.f146942f = message.m124847x74d37ac6();
            fVar.f146943g = message.Q0();
            fVar.f146944h = fVar.a(context, message);
            java.lang.String b17 = fVar.b(context);
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d(70, "chat_records_tts#" + message.m124847x74d37ac6(), null);
            c12886x91aa2b6d.f174594v = context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cza);
            c12886x91aa2b6d.f174595w = context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cza);
            c12886x91aa2b6d.f174596x = b17;
            c12886x91aa2b6d.f174581f = 3;
            c12886x91aa2b6d.H = 2048;
            c12886x91aa2b6d.I = true;
            c12886x91aa2b6d.f174578J = false;
            c12886x91aa2b6d.F = true;
            c12886x91aa2b6d.N = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d.BallButtonInfo ballButtonInfo = c12886x91aa2b6d.f174587o;
            ballButtonInfo.f174603e = false;
            ballButtonInfo.f174604f = false;
            ballButtonInfo.f174606h = true;
            ballButtonInfo.f174607i = true;
            fVar.f146941e = c12886x91aa2b6d;
            fVar.c().f(fVar.f146941e, fVar.f146946j);
            fVar.c().a0(70, fVar.f146947k);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d2 = fVar.f146941e;
        if (c12886x91aa2b6d2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatRecordsTtsFloatBallHelper", "show failed, ballInfo is null");
        } else {
            fVar.c().u(c12886x91aa2b6d2);
        }
        return jz5.f0.f384359a;
    }
}
