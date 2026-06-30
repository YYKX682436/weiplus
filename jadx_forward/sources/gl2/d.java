package gl2;

/* loaded from: classes3.dex */
public final class d implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl2.e f354337a;

    public d(gl2.e eVar) {
        this.f354337a = eVar;
    }

    @Override // hn0.i
    /* renamed from: callback */
    public void mo57125xf5bc2045(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var;
        gl2.e eVar = this.f354337a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f354342k, "preload, notify first frame from preload");
        if (i17 == 2001) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d;
            if (p1Var2 == null) {
                return;
            }
            p1Var2.f206766d = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (i17 == 2008) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p1 p1Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d;
            if (p1Var3 == null) {
                return;
            }
            p1Var3.f206767e = android.os.SystemClock.elapsedRealtime();
            return;
        }
        if (i17 == 2003) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r5.f206868a.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206788a.d(eVar.f354338g, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(eVar.f354342k, "TXLivePlayer:receive first frame");
        } else if (i17 == 2004 && (p1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.q1.f206791d) != null) {
            p1Var.f206768f = android.os.SystemClock.elapsedRealtime();
        }
    }
}
