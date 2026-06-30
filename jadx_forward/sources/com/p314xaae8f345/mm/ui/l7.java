package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class l7 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.l1 f290602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.m7 f290603e;

    public l7(com.p314xaae8f345.mm.ui.m7 m7Var, com.p314xaae8f345.mm.p957x53236a1b.l1 l1Var) {
        this.f290603e = m7Var;
        this.f290602d = l1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p944x882e457a.r1 e17 = c01.d9.e();
        com.p314xaae8f345.mm.ui.m7 m7Var = this.f290603e;
        e17.q(384, m7Var.f290632d.f290991i);
        m7Var.f290632d.f290991i = null;
        c01.d9.e().d(this.f290602d);
    }
}
