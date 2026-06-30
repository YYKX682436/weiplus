package dr0;

/* loaded from: classes12.dex */
public final class e0 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dr0.t0 f323952b;

    public e0(dr0.t0 t0Var) {
        this.f323952b = t0Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "deepBg=true");
        this.f323952b.i().m46745xb8356aff(this.f323952b.i().getAccDeepBgCount() + 1);
        if (this.f323952b.f324074a) {
            dr0.a3 a17 = dr0.a3.f323936d.a();
            a17.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                dr0.x0 x0Var = dr0.x0.f324104a;
                x0Var.c("RECYCLE_DEEP_BG", "check");
                if (dr0.j2.f323973b.a()) {
                    ((ku5.t0) ku5.t0.f394148d).g(new dr0.w2(a17));
                    return;
                }
                boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n();
                java.lang.String str = com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                java.lang.String str2 = !n17 ? "abort: not-main" : !a17.m() ? "abort: not-support" : !com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40965x320351f8() ? ih.d.c() ? "abort: fg" : com.p314xaae8f345.mm.app.w.INSTANCE.f135422n ? "abort: fg-legacy" : "abort skip: matrix-fg but legacy-bg" : com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a;
                if (a17.k()) {
                    dr0.p1 a18 = dr0.p1.f324022d.a();
                    android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    a18.getClass();
                    if (!com.p314xaae8f345.mm.p642xad8b531f.o.f(context)) {
                        str = "supported NO: ignoreBattOpt=false";
                    } else if (a17.g()) {
                        str = "supported YES: hasDebugger";
                    } else if (android.os.Build.VERSION.SDK_INT >= 30 && !a17.j()) {
                        str = "supported NO: forced splash logo";
                    } else if (!a17.l()) {
                        str = "supported NO: ban model";
                    }
                } else {
                    str = "supported NO: disabled";
                }
                x0Var.c("RECYCLE_DEEP_BG", "check-fail", "notSupported", str2, str);
            }
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.proc.AccMonitor", "deepBg=false");
        this.f323952b.f324074a = true;
    }
}
