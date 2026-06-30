package sk4;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk4.p f490513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sk4.c f490514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f490515f;

    public k(sk4.p pVar, sk4.c cVar, int i17) {
        this.f490513d = pVar;
        this.f490514e = cVar;
        this.f490515f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sk4.p pVar = this.f490513d;
        if (pVar.f490525g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AudioRecorderImpl", "already get final");
            return;
        }
        boolean z17 = ((double) this.f490515f) < ((double) pVar.f490533r) * 0.8d;
        sk4.c cVar = this.f490514e;
        cVar.f381966f = z17;
        cVar.mo105982x3f27f04a(2);
        pVar.f490525g = cVar.f381966f;
        yz5.l lVar = pVar.f490530o;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf((int) cVar.f381965e));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioRecorderImpl", "run: " + pVar.f490527i + ", pp: " + cVar.f381965e + ", final: " + cVar.f381966f + ", data: " + cVar.f490502g);
        if (!pVar.f490526h) {
            pVar.f490526h = true;
            jm4.q4.a(jm4.r4.f381954a, "RecordFirstBuffer", false, 0L, null, 14, null);
        }
        java.util.Iterator it = pVar.f490529n.iterator();
        while (it.hasNext()) {
            jm4.y0 y0Var = (jm4.y0) ((com.p314xaae8f345.p3118xeeebfacc.C26845xac206036) it.next()).m106052x32c52b();
            if (y0Var != null) {
                y0Var.oe(cVar);
            }
        }
    }
}
