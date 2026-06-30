package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes.dex */
public final class p0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.r0 f161966a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f161967b;

    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.r0 r0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f161966a = r0Var;
        this.f161967b = qVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiOpenChatToolAllPage", "requestCode:" + i17 + " resultCode: " + i18);
        if (i17 != this.f161966a.f161981g) {
            return false;
        }
        jc1.d dVar = jc1.f.f380448d;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f161967b;
        if (i18 == -1) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiOpenChatToolAllPage", "data is null, error");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar)));
                return true;
            }
            r45.ha5 ha5Var = new r45.ha5();
            byte[] byteArrayExtra = intent.getByteArrayExtra("KSelectUserList");
            if (byteArrayExtra != null) {
                try {
                    ha5Var.mo11468x92b714fd(byteArrayExtra);
                } catch (java.lang.Throwable unused) {
                }
            }
            java.util.LinkedList<r45.ga5> linkedList = ha5Var.f457514d;
            if (linkedList == null || linkedList.isEmpty()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar2)));
                return true;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList);
            for (r45.ga5 ga5Var : linkedList) {
                java.lang.String str = ga5Var.f456574d;
                if (!(str == null || str.length() == 0)) {
                    java.lang.String str2 = ga5Var.f456574d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    arrayList.add(new j91.a(str2, null, null, 0, 14, null));
                }
            }
            ((p3325xe03a0797.p3326xc267989b.r) qVar).s(arrayList, null);
        } else if (i18 == 0 || i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(jc1.f.f380446b);
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar3)));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
            p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar4)));
        }
        return true;
    }
}
