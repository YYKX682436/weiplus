package l41;

/* loaded from: classes15.dex */
public final class m0 implements j41.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397399a;

    public m0(l41.j1 j1Var) {
        this.f397399a = j1Var;
    }

    @Override // j41.x
    public void a(int i17, android.os.Bundle bundle) {
        l41.j1 j1Var = this.f397399a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmController", "createOpenImKfConversation success cancelled: %s", java.lang.Boolean.valueOf(j1Var.f397385k));
        j1Var.o();
        l41.k0 k0Var = l41.j1.f397374t;
        java.lang.Long valueOf = bundle != null ? java.lang.Long.valueOf(bundle.getInt("key_op_contact_result_time_cost")) : null;
        e42.d0 d0Var = e42.d0.clicfg_kf_open_kefu_confirm_opt_2_android;
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f();
        int i18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).mj(d0Var, c19767x257d7f, c19767x257d7f2) ? c19767x257d7f2.f38864x6ac9171 : 0;
        int k17 = j1Var.k();
        j41.u uVar = j1Var.f397378d;
        java.lang.String a17 = l41.k0.a(k0Var, valueOf, java.lang.Integer.valueOf(k17), java.lang.Integer.valueOf(uVar != null ? ((k41.g0) uVar).f68600x1c5d3c28 : 0), java.lang.Integer.valueOf(i18), null, null, null, null, null, null, 1008, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuConfirmController", "EcsOpenImKfLoadResult report value=2 (addKefuConversation success), extra=%s", a17);
        y02.v0 a18 = y02.x0.f540167d.a();
        if (a18 != null) {
            a18.p1(bw5.d5.EcsOpenImKfLoadResult, 2, a17);
        }
    }

    @Override // j41.x
    public void b(int i17, int i18, int i19, java.lang.String str, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuConfirmController", "createOpenImKfConversation failed errType: " + i18 + ", errCode: " + i19 + ", errMsg: " + str);
        this.f397399a.n();
    }
}
