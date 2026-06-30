package xh4;

/* loaded from: classes.dex */
public final class t implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f536164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f536165b;

    public t(p3325xe03a0797.p3326xc267989b.q qVar, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f) {
        this.f536164a = qVar;
        this.f536165b = activityC21401x6ce6f73f;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f536164a;
        if (i17 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] Success");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(xh4.l.f536144d));
            return;
        }
        if (intent != null && intent.getBooleanExtra("IntentResult_GoVerifyPwd", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] GoVerifyPwd");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(xh4.l.f536145e));
            return;
        }
        if (!(intent != null && intent.getBooleanExtra("IntentResult_GoTeenModeGuardianInfoUI", false))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] Cancel");
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(xh4.l.f536147g));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TeenModeUtil", "[checkTeenPwd] GoTeenModeGuardianInfoUI");
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f536165b;
        android.content.Intent intent2 = new android.content.Intent(activityC21401x6ce6f73f, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18589x3dbac5d0.class);
        intent2.putExtras(intent);
        ((com.p314xaae8f345.mm.ui.bd) activityC21401x6ce6f73f.m78751x5dc77fb5(intent2)).f279410a = new xh4.s(activityC21401x6ce6f73f, qVar);
        p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(xh4.l.f536146f));
    }
}
