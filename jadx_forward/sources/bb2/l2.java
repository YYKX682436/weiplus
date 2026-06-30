package bb2;

/* loaded from: classes10.dex */
public final class l2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 f100447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.f43 f100449f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27, java.lang.String str, r45.f43 f43Var) {
        super(1);
        this.f100447d = c13683xee96bb27;
        this.f100448e = str;
        this.f100449f = f43Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13683xee96bb27 c13683xee96bb27 = this.f100447d;
        bb2.w1 bulletManager = c13683xee96bb27.getBulletManager();
        java.lang.String content = this.f100448e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(content, "$content");
        boolean z17 = c13683xee96bb27.getBulletManager().f100579k;
        r45.f43 f43Var = this.f100449f;
        bb2.w1.k(bulletManager, content, z17, 6, f43Var.m75942xfb822ef2(0), 0L, longValue, false, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.content.Context context = c13683xee96bb27.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.i(d2Var, context, "bs_follow_button", "view_long_press", false, c13683xee96bb27.i(f43Var, java.lang.Long.valueOf(longValue)), 8, null);
        return jz5.f0.f384359a;
    }
}
