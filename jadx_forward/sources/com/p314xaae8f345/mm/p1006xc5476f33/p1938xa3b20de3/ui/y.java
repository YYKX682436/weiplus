package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class y extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f234296d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e, android.view.View view) {
        super(false);
        this.f234296d = view;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("wallet_lock_jsapi_scene", 2);
        if (com.p314xaae8f345.mm.p2802xd031a825.b.a().e()) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24826x2446a031(2, null);
        } else {
            j45.l.j(this.f234296d.getContext(), "wallet", ".pwd.ui.WalletSecuritySettingUI", intent, null);
        }
    }
}
