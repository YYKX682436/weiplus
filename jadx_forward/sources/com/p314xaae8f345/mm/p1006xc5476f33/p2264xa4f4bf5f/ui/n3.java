package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class n3 implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 f255646d;

    public n3(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var) {
        this.f255646d = q3Var;
    }

    @Override // f25.f
    public void c(boolean z17) {
        kk4.b player;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f255646d.M;
        if (c18690x34c5bc78 == null || (player = c18690x34c5bc78.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).C(true);
    }

    @Override // f25.f
    /* renamed from: onResume */
    public void mo44161x57429eec() {
        kk4.b player;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f255646d.M;
        if (c18690x34c5bc78 == null || (player = c18690x34c5bc78.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).C(false);
    }

    @Override // f25.f
    /* renamed from: onStop */
    public void mo44162xc39f8281() {
        kk4.b player;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = this.f255646d.M;
        if (c18690x34c5bc78 == null || (player = c18690x34c5bc78.getPlayer()) == null) {
            return;
        }
        ((kk4.v) player).C(true);
    }
}
