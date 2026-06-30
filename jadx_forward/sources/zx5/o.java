package zx5;

/* loaded from: classes13.dex */
public class o extends zx5.p {

    /* renamed from: f, reason: collision with root package name */
    public static zx5.o f558787f;

    public static zx5.o b0() {
        if (f558787f == null) {
            f558787f = new zx5.o();
        }
        return f558787f;
    }

    @Override // zx5.p, by5.l0
    public boolean M() {
        return false;
    }

    @Override // zx5.p
    public by5.n0 a0(by5.i iVar) {
        by5.n0 n0Var = null;
        if (iVar == null) {
            return null;
        }
        boolean z17 = false;
        if (!com.p314xaae8f345.p3210x3857dc.b.m().h("enable_predown_core", "tools", false)) {
            by5.c4.a(this.f118062a, "onConfigDownLoaded, config version:" + iVar.f118013c + ", disable predown core");
            a();
            if (by5.c1.d(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.i())) {
                by5.s0.d(1749L, 85);
            }
            if ("armeabi-v7a".equalsIgnoreCase(by5.a.b())) {
                if (by5.u3.c("arm64-v8a").f118138a != -1) {
                    by5.u3.e(-1, null, "arm64-v8a");
                }
            } else if (by5.u3.c("armeabi-v7a").f118138a != -1) {
                by5.u3.e(-1, null, "armeabi-v7a");
            }
            return null;
        }
        java.lang.String g17 = com.p314xaae8f345.p3210x3857dc.b.m().g("pre_down_abi", "tools");
        by5.c4.a(this.f118062a, "onConfigDownLoaded, config version:" + iVar.f118013c + ", enable predown core:" + g17);
        if (!android.text.TextUtils.isEmpty(g17) && !g17.equalsIgnoreCase(by5.a.b())) {
            n0Var = new by5.q0().b(iVar, g17, this);
            if (n0Var != null) {
                by5.s0.e(577L, 240L, 1L);
            }
            y(n0Var);
        }
        if (n0Var != null) {
            by5.c4.a(this.f118062a, "onConfigDownLoaded, pre download version:" + n0Var.f118107m.f118070e);
            z17 = true;
        }
        by5.n0 Q = Q(n0Var);
        if (z17 && Q == n0Var) {
            if ("armeabi-v7a".equalsIgnoreCase(n0Var.f118107m.f118083r)) {
                by5.s0.e(577L, 236L, 1L);
            } else if ("arm64-v8a".equalsIgnoreCase(n0Var.f118107m.f118083r)) {
                by5.s0.e(577L, 237L, 1L);
            }
        }
        return Q;
    }

    @Override // zx5.p, by5.l0
    public java.lang.String r() {
        return "XWebCorePredown";
    }
}
