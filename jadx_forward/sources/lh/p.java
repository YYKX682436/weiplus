package lh;

/* loaded from: classes12.dex */
public final class p implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gi.w0 f400155a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lh.q f400156b;

    public p(gi.w0 w0Var, lh.q qVar) {
        this.f400155a = w0Var;
        this.f400156b = qVar;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        qh.b bVar;
        if (((qh.b) obj).f444854n >= 300000) {
            gi.w0 w0Var = this.f400155a;
            float s17 = w0Var.s();
            lh.q qVar = this.f400156b;
            if (s17 >= qVar.f400159f) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#alert ");
                lh.t tVar = qVar.f400157d;
                sb6.append(tVar.f400167a);
                sb6.append(": loop=");
                sb6.append(tVar.f400170d);
                sb6.append(", minute=");
                int i17 = qVar.f400158e;
                sb6.append(i17);
                sb6.append(", cpuLoad=");
                sb6.append(w0Var.s());
                sb6.append(", threshold=");
                float f17 = qVar.f400159f;
                sb6.append(f17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.battery.CpuAlertInspector", sb6.toString());
                int i18 = tVar.f400170d;
                android.os.Bundle bundle = w0Var.f476860i;
                bundle.putInt("cpu-alert-loop", i18);
                bundle.putInt("cpu-alert-postMin", i17);
                bundle.putFloat("cpu-alert-threshold", f17);
                bundle.putInt("cpu-alert-everFg", lh.t.f400163e ? 1 : 0);
                java.util.List list = ri.p.f477492a;
                java.lang.String str = w0Var.f476870s;
                if ((str.equals("canary") || str.equals("biz")) && (bVar = w0Var.f476863l) != null) {
                    w0Var.p(new ri.C30074x33757b(w0Var, bVar, str));
                }
                int i19 = tVar.f400170d + 1;
                tVar.a();
                tVar.c(i19);
            }
        }
    }
}
