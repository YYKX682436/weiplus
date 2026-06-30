package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s f148994d;

    public p(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s sVar) {
        this.f148994d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ph.u e17;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c cVar;
        android.os.Handler handler;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120 c4679x33de8120 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4679x33de8120.f19966x4fbc8495;
        if (!c4679x33de8120.mo40975xf7b3660d() || (e17 = gi.d.e()) == null || (cVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c) e17.f435829h.i(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.c.class)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s sVar = this.f148994d;
        boolean z17 = true;
        boolean z18 = !e17.f435829h.f444868d.f444830p;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc k17 = cVar.k(z18);
        synchronized (sVar.f149010d) {
            jz5.l lVar = sVar.f149011e;
            if (lVar != null) {
                long longValue = currentTimeMillis - ((java.lang.Number) lVar.f384366d).longValue();
                jz5.l lVar2 = sVar.f149011e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(lVar2);
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) k17.c((com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) lVar2.f384367e).f477019c;
                if (!c4635xec0343cc.f476897b) {
                    throw new java.lang.IllegalStateException("figureCpuLoad must be called on delta snapshot");
                }
                float longValue2 = (((float) (((java.lang.Long) c4635xec0343cc.f134094g.f477085a).longValue() * 10)) * 100.0f) / ((float) longValue);
                java.lang.Integer num = wh.m.f527363a;
                int b17 = a06.d.b(new java.math.BigDecimal(java.lang.String.valueOf(longValue2)).setScale(2, java.math.RoundingMode.HALF_EVEN).floatValue());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AdpfFeatureService", "on collect fg cpuLoad: " + b17 + "%, durationMs=" + longValue + "ms");
                if (b17 >= 0 && b17 < 10001) {
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState iMutableAdpfState = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) ((jz5.n) sVar.f149008b).mo141623x754a37bb();
                    iMutableAdpfState.mo45066xcc3ebb54(b17 > 150, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.n(b17));
                    if (iMutableAdpfState.mo40960xab2f7f06()) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b2) ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0.f149016e).mo141623x754a37bb()).a(u04.d.f505010c, 1800000L);
                    }
                    com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState iMutableAdpfState2 = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState) ((jz5.n) sVar.f149009c).mo141623x754a37bb();
                    if (b17 <= 200) {
                        z17 = false;
                    }
                    iMutableAdpfState2.mo45066xcc3ebb54(z17, new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.o(b17));
                    if (iMutableAdpfState2.mo40960xab2f7f06()) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b2) ((jz5.n) com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.s0.f149017f).mo141623x754a37bb()).a(u04.d.f505010c, 1800000L);
                    }
                }
            }
            sVar.f149011e = new jz5.l(java.lang.Long.valueOf(currentTimeMillis), k17);
        }
        if (!c4679x33de8120.mo40975xf7b3660d() || (handler = sVar.f149012f) == null) {
            return;
        }
        handler.postDelayed(this, 60000L);
    }
}
