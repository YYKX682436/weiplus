package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class o0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f295744d;

    public o0(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e) {
        this.f295744d = abstractActivityC22902xe37969e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f295744d;
        abstractActivityC22902xe37969e.m83093xa17dbc8d();
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(abstractActivityC22902xe37969e);
        abstractActivityC22902xe37969e.f39906x53855852 = 4;
        if (g17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBaseUI", "[onCreateDialog] onclick finish");
            abstractActivityC22902xe37969e.finish();
        } else {
            if (g17.v(abstractActivityC22902xe37969e, abstractActivityC22902xe37969e.m83105x7498fe14())) {
                return;
            }
            g17.f(abstractActivityC22902xe37969e, abstractActivityC22902xe37969e.m83105x7498fe14());
        }
    }
}
