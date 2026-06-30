package o14;

/* loaded from: classes11.dex */
public class n implements xg3.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f423825a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa f423826b;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa activityC17362x6cf7dffa, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var) {
        this.f423826b = activityC17362x6cf7dffa;
        this.f423825a = u3Var;
    }

    @Override // xg3.t
    public void a(boolean z17, int i17, final int i18, java.lang.String str) {
        ku5.u0 u0Var = ku5.t0.f394148d;
        final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f423825a;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: o14.n$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = u3Var;
                o14.n nVar = o14.n.this;
                nVar.getClass();
                try {
                    u3Var2.dismiss();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FixToolsUI", e17, "fixAddFriendVerifyRecordRecover dismiss dialog err", new java.lang.Object[0]);
                }
                boolean z18 = i18 == 0;
                java.lang.String str2 = z18 ? "修复完成" : "修复失败";
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa activityC17362x6cf7dffa = nVar.f423826b;
                dp.a.m125854x26a183b(activityC17362x6cf7dffa, str2, 1).show();
                if (z18) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2053xe98282e6.ActivityC17362x6cf7dffa.f241597e = true;
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17362x6cf7dffa.f241598d).m("fix_tools_add_friend_verify_record", true);
                    ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC17362x6cf7dffa.f241598d).notifyDataSetChanged();
                }
            }
        });
    }
}
