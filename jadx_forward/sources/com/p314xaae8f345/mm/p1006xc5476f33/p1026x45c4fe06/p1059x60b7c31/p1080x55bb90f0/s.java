package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

/* loaded from: classes7.dex */
public final class s implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t f161982d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar) {
        this.f161982d = tVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        cl0.e eVar;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) obj;
        java.lang.String value = c10756x2a5d7b2d.f149939d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        if (value.length() > 0) {
            try {
                eVar = new cl0.e(c10756x2a5d7b2d.f149939d);
            } catch (cl0.f unused) {
                eVar = null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = this.f161982d;
            if (eVar == null || eVar.mo15056xbe0e3ae6() == 0) {
                tVar.b();
                return;
            }
            int mo15056xbe0e3ae6 = eVar.mo15056xbe0e3ae6();
            for (int i17 = 0; i17 < mo15056xbe0e3ae6; i17++) {
                java.lang.String mo15065x48bce8a4 = eVar.mo15065x48bce8a4(i17);
                if (mo15065x48bce8a4 != null) {
                    if (mo15065x48bce8a4.length() > 0) {
                        arrayList.add(new j91.a(mo15065x48bce8a4, null, null, 0, 14, null));
                    }
                }
            }
            tVar.m(arrayList);
            tVar.k(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.r(tVar));
        }
    }
}
