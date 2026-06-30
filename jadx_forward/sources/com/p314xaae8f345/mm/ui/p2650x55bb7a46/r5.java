package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public abstract class r5 {

    /* renamed from: a, reason: collision with root package name */
    public static int f284173a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5 f284174b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.q5();

    public static void a(android.content.Context context, java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba c6231x4f3054ba = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6231x4f3054ba();
        am.y00 y00Var = c6231x4f3054ba.f136478g;
        y00Var.f89948b = 5;
        y00Var.f89951e = str;
        y00Var.f89950d = context;
        y00Var.f89952f = i17;
        c6231x4f3054ba.e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11033, 4, 1, 0);
    }

    public static boolean b() {
        if (f284173a == -1) {
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_chatting_hover_enable, 0);
            f284173a = Ni;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAvatarOnHoverHelper", "isEnable:%s", java.lang.Integer.valueOf(Ni));
        }
        return f284173a == 1;
    }
}
