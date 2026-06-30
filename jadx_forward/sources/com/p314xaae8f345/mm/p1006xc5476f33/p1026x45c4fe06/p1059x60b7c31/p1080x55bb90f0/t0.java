package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes.dex */
public final class t0 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.v0 f161995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f161996b;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.v0 v0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f161995a = v0Var;
        this.f161996b = qVar;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiSelectGroupMembers", "requestCode:" + i17 + " resultCode: " + i18);
        if (i17 != this.f161995a.f162007g) {
            return false;
        }
        jc1.d dVar = jc1.f.f380448d;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f161996b;
        if (i18 == -1) {
            if (intent == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiSelectGroupMembers", "data is null, error");
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar)));
                return true;
            }
            try {
                r45.ha5 ha5Var = new r45.ha5();
                byte[] byteArrayExtra = intent.getByteArrayExtra("KSelectUserList");
                if (byteArrayExtra != null) {
                    ha5Var.mo11468x92b714fd(byteArrayExtra);
                }
                org.json.JSONObject mo12245xcc313de3 = ha5Var.mo12245xcc313de3();
                org.json.JSONArray optJSONArray = mo12245xcc313de3.optJSONArray("dataList");
                if (optJSONArray == null) {
                    optJSONArray = new org.json.JSONArray();
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                int length = optJSONArray.length();
                for (int i19 = 0; i19 < length; i19++) {
                    linkedList.add(optJSONArray.getJSONObject(i19).getString("userName"));
                }
                ((p3325xe03a0797.p3326xc267989b.r) qVar).s(linkedList, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.JsApiSelectGroupMembers", "contactListJson: " + mo12245xcc313de3 + " userNameList:" + linkedList.size());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiSelectGroupMembers", "selectGroupMembers fail e:" + e17);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar2)));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Luggage.JsApiSelectGroupMembers", "selectGroupMembers fail e:" + th6);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar3 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
                p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar3)));
            }
        } else if (i18 == 0 || i18 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(jc1.f.f380446b);
            p3321xbce91901.C29043x91b2b43d.Companion companion4 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar4)));
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f fVar5 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.f(dVar);
            p3321xbce91901.C29043x91b2b43d.Companion companion5 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(fVar5)));
        }
        return true;
    }
}
