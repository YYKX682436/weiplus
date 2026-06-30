package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class i3 {
    public static void a(android.content.Context context, java.util.Set set, ot0.f3 f3Var) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, context is null");
            return;
        }
        if (set == null || set.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingEditModeDelMsg", "do delete msg fail, select ids is empty");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5.f280226t.a(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.h3(set, db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bot), true, false, null), f3Var));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10811, 4, java.lang.Integer.valueOf(set.size()));
    }
}
