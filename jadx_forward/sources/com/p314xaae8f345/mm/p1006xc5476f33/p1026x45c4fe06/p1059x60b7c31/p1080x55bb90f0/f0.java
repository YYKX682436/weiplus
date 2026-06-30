package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes.dex */
public final class f0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.g0 f161925a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f161926b;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.g0 g0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f161925a = g0Var;
        this.f161926b = qVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiNotifyGroupMembers", "requestCode:" + i17 + " resultCode: " + i18);
        if (i17 != this.f161925a.f161927g) {
            return false;
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f161926b;
        if (i18 == -1) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s(java.lang.Boolean.TRUE, null);
            return true;
        }
        if (i18 != 0) {
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(jc1.f.f380446b);
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar)));
        return true;
    }
}
