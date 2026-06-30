package m71;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m71.g f406020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.v0 f406021e;

    public d(m71.g gVar, com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var) {
        this.f406020d = gVar;
        this.f406021e = v0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        m71.g gVar = this.f406020d;
        sb6.append(gVar.m158354x19263085().getLocalClassName());
        sb6.append(" startLauncher");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AccountManualAuthUIC", sb6.toString());
        android.content.Intent b17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.b(gVar.m80379x76847179());
        b17.addFlags(67108864);
        com.p314xaae8f345.mm.p957x53236a1b.v0 v0Var = this.f406021e;
        b17.putExtra("kstyle_show_bind_mobile_afterauth", v0Var.O());
        b17.putExtra("kstyle_bind_recommend_show", v0Var.P());
        b17.putExtra("kstyle_bind_wording", v0Var.Q());
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = gVar.m158354x19263085();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b17);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m158354x19263085, arrayList.toArray(), "com/tencent/mm/plugin/account/uic/AccountManualAuthUIC", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        m158354x19263085.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(m158354x19263085, "com/tencent/mm/plugin/account/uic/AccountManualAuthUIC", "startLauncher", "(Lcom/tencent/mm/modelsimple/NetSceneManualAuth;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        gVar.m158354x19263085().finish();
    }
}
