package b66;

/* loaded from: classes11.dex */
public class q extends com.tencent.unit_rc.BaseProxyObject implements b66.n {
    @Override // b66.n
    public long E() {
        return urgen.ur_2BA9.UR_C8FE.UR_C3AB(getCppPointer());
    }

    public void a(b66.t tVar) {
        urgen.ur_2BA9.UR_C8FE.UR_B318(getCppPointer(), tVar);
    }

    public java.lang.String d() {
        return urgen.ur_2BA9.UR_C8FE.UR_C89D(getCppPointer());
    }

    public b66.a e() {
        return (b66.a) urgen.ur_2BA9.UR_C8FE.UR_096B(getCppPointer());
    }

    public int f() {
        return urgen.ur_2BA9.UR_C8FE.UR_8716(getCppPointer());
    }

    public bw5.lp0 g() {
        byte[] UR_AA1E = urgen.ur_2BA9.UR_C8FE.UR_AA1E(getCppPointer());
        if (UR_AA1E != null) {
            return (bw5.lp0) b66.b0.b(UR_AA1E, new bw5.lp0());
        }
        return null;
    }

    @Override // b66.n
    public float h() {
        return urgen.ur_2BA9.UR_C8FE.UR_85BD(getCppPointer());
    }

    @Override // b66.n
    public int i() {
        return urgen.ur_2BA9.UR_C8FE.UR_0CED(getCppPointer());
    }

    public void j(b66.t tVar) {
        urgen.ur_2BA9.UR_C8FE.UR_655E(getCppPointer(), tVar);
    }

    @Override // b66.n
    public long k() {
        return urgen.ur_2BA9.UR_C8FE.UR_6033(getCppPointer());
    }

    @Override // b66.n
    public long m() {
        return urgen.ur_2BA9.UR_C8FE.UR_2FF2(getCppPointer());
    }

    public bw5.pq0 n() {
        int UR_6258 = urgen.ur_2BA9.UR_C8FE.UR_6258(getCppPointer());
        bw5.pq0 pq0Var = UR_6258 != 0 ? UR_6258 != 1 ? UR_6258 != 2 ? UR_6258 != 3 ? null : bw5.pq0.Paused : bw5.pq0.Loading : bw5.pq0.Playing : bw5.pq0.Idle;
        kotlin.jvm.internal.o.d(pq0Var);
        return pq0Var;
    }

    @Override // b66.n
    public long s() {
        return urgen.ur_2BA9.UR_C8FE.UR_16B3(getCppPointer());
    }

    public void stop() {
        urgen.ur_2BA9.UR_C8FE.UR_045B(getCppPointer());
    }
}
