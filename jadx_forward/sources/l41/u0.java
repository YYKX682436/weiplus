package l41;

/* loaded from: classes15.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397467d;

    public u0(l41.j1 j1Var) {
        this.f397467d = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j41.i0 i0Var = new j41.i0();
        l41.j1 j1Var = this.f397467d;
        i0Var.f379176d = j1Var.f397378d;
        i0Var.f379177e = j1Var.f397379e;
        i0Var.f379173a = 0;
        i0Var.f379174b = 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchConfirmInfo onFinish isValid: ");
        j41.u uVar = j1Var.f397378d;
        sb6.append(uVar != null ? java.lang.Boolean.valueOf(((k41.g0) uVar).f385529p1) : null);
        sb6.append(", cancelled: ");
        sb6.append(j1Var.f397385k);
        sb6.append(", confirmType: ");
        sb6.append(i0Var.f379177e);
        sb6.append(", confirmPageType: ");
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = j1Var.f397377c;
        sb6.append(c11207x71c7a1c1 != null ? java.lang.Integer.valueOf(c11207x71c7a1c1.f153809h) : null);
        sb6.append(", ");
        j41.u uVar2 = j1Var.f397378d;
        sb6.append(uVar2 != null ? ((k41.g0) uVar2).t0() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmController", sb6.toString());
        j41.u uVar3 = j1Var.f397378d;
        if (!(uVar3 != null && ((k41.g0) uVar3).f385529p1)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuConfirmController", "degraded getContact failed");
            j1Var.f397387m.a(3, -1, "degraded get contact failed");
            return;
        }
        l41.k0 k0Var = l41.j1.f397374t;
        java.lang.Long valueOf = java.lang.Long.valueOf(0);
        e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        int i17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var, c19767x257d7f, c19767x257d7f2) ? c19767x257d7f2.f38864x6ac9171 : 0;
        int k17 = j1Var.k();
        j41.u uVar4 = j1Var.f397378d;
        java.lang.String a17 = l41.k0.a(k0Var, valueOf, java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(uVar4 != null ? ((k41.g0) uVar4).f68600x1c5d3c28 : 0), java.lang.Integer.valueOf(i17), null, null, null, null, null, null, 1008, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmController", "EcsOpenImKfLoadResult report value=1 (degraded getContact success), extra=%s", a17);
        y02.v0 a18 = y02.x0.f540167d.a();
        if (a18 != null) {
            a18.p1(bw5.d5.EcsOpenImKfLoadResult, 1, a17);
        }
        l41.r0 r0Var = j1Var.f397387m;
        r0Var.getClass();
        l41.j1 j1Var2 = r0Var.f397445a;
        l41.e2.c(j1Var2.l(), j1Var2.m(), true, 0, "");
        if (j1Var2.f397376b == null || !j41.g0.a(j1Var2.f397379e)) {
            int j17 = j1Var2.j();
            int i18 = j1Var2.f397379e;
            android.app.Activity context = j1Var2.f397375a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            v41.s bVar = !j41.g0.a(i18) ? new v41.b(context) : j17 == 1 ? new v41.m(context) : j17 == 2 ? new v41.q(context) : new v41.q(context);
            j1Var2.f397376b = bVar;
            bVar.d(j1Var2);
        }
        if (j41.g0.a(j1Var2.f397379e)) {
            j1Var2.e();
            android.os.ResultReceiver l17 = j1Var2.l();
            j1Var2.m();
            if (l17 != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("result_key_action", 5);
                l17.send(0, bundle);
            }
        }
        v41.s sVar = j1Var2.f397376b;
        if (sVar != null) {
            sVar.c(j1Var2.f397379e, j1Var2.j(), i0Var);
        }
    }
}
