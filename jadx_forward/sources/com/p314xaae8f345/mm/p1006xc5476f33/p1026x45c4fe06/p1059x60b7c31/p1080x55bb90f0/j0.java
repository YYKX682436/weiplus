package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes.dex */
public final class j0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.n0 f161934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f161935b;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.n0 n0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f161934a = n0Var;
        this.f161935b = qVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiOpenChatTool", "requestCode:" + i17 + " resultCode: " + i18);
        if (i17 != this.f161934a.f161954g) {
            return false;
        }
        jc1.d dVar = jc1.f.f380448d;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f161935b;
        if (i18 != -1) {
            if (i18 == 0 || i18 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(jc1.f.f380446b);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar)));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar2)));
            }
        } else {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiOpenChatTool", "data is null, error");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar3)));
                return true;
            }
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (stringExtra == null || stringExtra.length() == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar4)));
                return true;
            }
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s(nm5.j.c(stringExtra, java.lang.Integer.valueOf(intent.getIntExtra("KSelectUserChatType", 0))), null);
        }
        return true;
    }
}
