package it3;

/* loaded from: classes10.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376091d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2) {
        this.f376091d = activityC16983x775783e2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h
    public void d(boolean z17, float f17, float f18) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h
    public void j(boolean z17, float f17, float f18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "attachThumbSeekBar onDown left:" + z17 + " start:" + f17 + " end:" + f18);
        it3.a aVar = this.f376091d.f237151m;
        if (aVar != null) {
            aVar.q();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h
    public void p(boolean z17, float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376091d;
        it3.a aVar = activityC16983x775783e2.f237151m;
        if (aVar != null) {
            long m66739x37a7fa50 = aVar.m66739x37a7fa50();
            it3.a aVar2 = activityC16983x775783e2.f237151m;
            if (aVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1869x8625f081.p1870xc53e9ae1.p1871x373aa5.C16524xfd73a13c.r(aVar2, null, 0L, 3, null);
            }
            activityC16983x775783e2.f237154p = java.lang.Math.round(r0 * f17);
            long round = java.lang.Math.round(((float) m66739x37a7fa50) * f18);
            activityC16983x775783e2.f237155q = round;
            it3.a aVar3 = activityC16983x775783e2.f237151m;
            if (aVar3 != null) {
                aVar3.u(activityC16983x775783e2.f237154p, round);
            }
            it3.a aVar4 = activityC16983x775783e2.f237151m;
            if (aVar4 != null) {
                aVar4.m66744x2a55bdd7().mo162429xc9fc1b13(activityC16983x775783e2.f237154p);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "attachThumbSeekBar onUp start:" + f17 + " end:" + f18 + " loopStart:" + activityC16983x775783e2.f237154p + " loopEnd:" + activityC16983x775783e2.f237155q);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.h
    public void u(float f17, float f18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376091d;
        it3.a aVar = activityC16983x775783e2.f237151m;
        if (aVar != null) {
            float m66739x37a7fa50 = (float) aVar.m66739x37a7fa50();
            activityC16983x775783e2.f237154p = java.lang.Math.round(m66739x37a7fa50 * f17);
            long round = java.lang.Math.round(m66739x37a7fa50 * f18);
            activityC16983x775783e2.f237155q = round;
            it3.a aVar2 = activityC16983x775783e2.f237151m;
            if (aVar2 != null) {
                aVar2.u(activityC16983x775783e2.f237154p, round);
            }
            it3.a aVar3 = activityC16983x775783e2.f237151m;
            if (aVar3 != null) {
                aVar3.m66744x2a55bdd7().mo162429xc9fc1b13(activityC16983x775783e2.f237154p);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "attachThumbSeekBar onRecyclerChanged start:" + f17 + " end:" + f18 + " loopStart:" + activityC16983x775783e2.f237154p + " loopEnd:" + activityC16983x775783e2.f237155q);
        }
    }
}
