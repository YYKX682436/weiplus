package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1078x2c0e0b6f.p1079xce036727;

/* loaded from: classes.dex */
public final class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f161859d;

    public m(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f161859d = qVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        int i17 = bundle != null ? bundle.getInt("KEY_CODE", -1) : -1;
        if (bundle == null || (str = bundle.getString("KEY_PAGE_CONTENT_PATH")) == null) {
            str = "";
        }
        p3325xe03a0797.p3326xc267989b.q qVar = this.f161859d;
        if (i17 == 0) {
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(str));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("get page content failed"))));
        }
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void c(java.lang.Exception exc) {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        if (exc == null) {
            exc = new java.lang.Exception("invoke exception");
        }
        ((p3325xe03a0797.p3326xc267989b.r) this.f161859d).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(exc)));
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.s
    public void d() {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        ((p3325xe03a0797.p3326xc267989b.r) this.f161859d).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("bridge not found"))));
    }
}
