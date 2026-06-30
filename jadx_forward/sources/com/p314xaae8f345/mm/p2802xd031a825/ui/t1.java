package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class t1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e f295767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f295768e;

    public t1(com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e, java.lang.String str) {
        this.f295767d = abstractActivityC22902xe37969e;
        this.f295768e = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e abstractActivityC22902xe37969e = this.f295767d;
        com.p314xaae8f345.mm.p2802xd031a825.ui.v1.a(abstractActivityC22902xe37969e);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f295768e);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.T(abstractActivityC22902xe37969e.mo55332x76847179(), intent);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(3, 1);
    }
}
