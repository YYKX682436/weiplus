package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class ge implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa f242608a;

    public ge(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa activityC17427x695175aa) {
        this.f242608a = activityC17427x695175aa;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect onRecError: " + i17 + ", " + i18);
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        wd0.l1 l1Var = (wd0.l1) i95.n0.c(wd0.l1.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17427x695175aa activityC17427x695175aa = this.f242608a;
        long j17 = activityC17427x695175aa.f241984u;
        ((u14.t) l1Var).getClass();
        int m68990xb92b7245 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17488x7dde8191.m68990xb92b7245(j17, bArr, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.km.f131633e, 16000, 1);
        if (m68990xb92b7245 == -100 || m68990xb92b7245 == -200) {
            return;
        }
        activityC17427x695175aa.f241983t.add(java.lang.Integer.valueOf(m68990xb92b7245));
        if (activityC17427x695175aa.f241983t.size() % 5 == 0) {
            double L = kz5.n0.L(activityC17427x695175aa.f241983t.subList(r14.size() - 3, activityC17427x695175aa.f241983t.size()));
            activityC17427x695175aa.getClass();
            double d17 = 1;
            double d18 = 2;
            int max = java.lang.Math.max((int) (java.lang.Math.max((java.lang.Math.tanh((L - (-20.0d)) / 8.0d) + d17) / d18, (((java.lang.Math.tanh((-10) / 8.0d) + d17) / d18) / 30) * (60 + L)) * 100), 1);
            com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = activityC17427x695175aa.f241973g;
            if (c21330xc127fb4d == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("newVoice2txtTxtReactWave");
                throw null;
            }
            c21330xc127fb4d.i(max);
        }
        if (activityC17427x695175aa.f241983t.size() == 25) {
            android.os.Message message = new android.os.Message();
            message.obj = java.lang.Boolean.valueOf(((float) ((int) kz5.n0.L(activityC17427x695175aa.f241983t))) < activityC17427x695175aa.f241981r);
            activityC17427x695175aa.f241988y.sendMessage(message);
            activityC17427x695175aa.f241983t.clear();
        }
    }
}
