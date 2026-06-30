package yv1;

/* loaded from: classes12.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw1.f f547545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.i0 f547546e;

    public d0(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, bw1.f fVar, yv1.i0 i0Var) {
        this.f547545d = fVar;
        this.f547546e = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yv1.i0 i0Var = this.f547546e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        bw1.f fVar = this.f547545d;
        try {
            tg3.b.f500714a.b("msg_c2c_path_clean_for_manual_scan");
        } finally {
            fVar.a(f0Var);
            yv1.i0.e(i0Var, true, false, 2, null);
        }
    }
}
