package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class d0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n53 f229884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f229885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f0 f229886f;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.f0 f0Var, r45.n53 n53Var, int i17) {
        this.f229886f = f0Var;
        this.f229884d = n53Var;
        this.f229885e = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicorMsg.MallIndexBaseUIv2", "onFunctionItemClick: onClick");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.n53 n53Var = this.f229884d;
        sb6.append(n53Var.f462615d.f463529d);
        sb6.append("");
        bt4.c.b(sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.AbstractActivityC16475xe6d27f7f.V6(this.f229886f.f229911a, n53Var, this.f229885e);
    }
}
