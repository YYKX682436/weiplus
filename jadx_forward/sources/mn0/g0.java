package mn0;

/* loaded from: classes5.dex */
public final class g0 {
    public g0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = mn0.i0.L;
        boolean z17 = false;
        if (r2Var != null && r2Var.a()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        mn0.i0.L = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new mn0.f0(null), 2, null);
    }

    public final void b(java.lang.String source, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTXPlayerTicker", "setOutsideTouchUpTimestamp: source=" + source + ", timestamp=" + j17);
        mn0.i0.I = j17;
    }
}
