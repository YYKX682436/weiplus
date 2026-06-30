package df2;

/* loaded from: classes3.dex */
public final class p4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f312568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ df2.r4 f312569c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.tm1 f312570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312571e;

    public p4(int i17, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, df2.r4 r4Var, r45.tm1 tm1Var, java.lang.String str) {
        this.f312567a = i17;
        this.f312568b = c0Var;
        this.f312569c = r4Var;
        this.f312570d = tm1Var;
        this.f312571e = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f312568b;
            r45.tm1 tm1Var = this.f312570d;
            df2.r4 r4Var = this.f312569c;
            int i17 = this.f312567a;
            if (i17 == 1) {
                c0Var.f391645d = true;
                r4Var.l7(new df2.d9(tm1Var.m75945x2fec8307(3), null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nkl), null, com.p314xaae8f345.mm.R.C30861xcebc809e.d2u, com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nko));
                if (tm1Var.m75939xb282bd08(2) > 0) {
                    r4Var.n7(tm1Var.m75939xb282bd08(2), "on subscribe");
                } else {
                    r4Var.n7(5000L, "on subscribe");
                }
                r4Var.o7(2);
            } else if (i17 == 2) {
                c0Var.f391645d = false;
                r4Var.l7(new df2.d9(tm1Var.m75945x2fec8307(3), null, this.f312571e, null, 0, 0, 48, null));
                android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.h(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8));
                java.lang.Long valueOf = java.lang.Long.valueOf(tm1Var.m75939xb282bd08(1));
                if (!(valueOf.longValue() > 0)) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    r4Var.n7(valueOf.longValue(), "on unsubscribe");
                }
                r4Var.o7(4);
            }
        }
        return jz5.f0.f384359a;
    }
}
