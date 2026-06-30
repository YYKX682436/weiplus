package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class c0 implements com.p314xaae8f345.mm.ui.p2690x38b72420.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288170a;

    public c0(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288170a = addressUIFragment;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.e8
    public void a(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment = this.f288170a;
        com.p314xaae8f345.mm.ui.p2690x38b72420.g8 g8Var = addressUIFragment.F;
        if (g8Var == null || addressUIFragment.f287851z == null) {
            return;
        }
        if (i17 <= 0) {
            g8Var.setVisibility(8);
            addressUIFragment.f287851z.c(true);
        } else {
            g8Var.setVisibility(0);
            addressUIFragment.f287851z.c(false);
        }
    }
}
