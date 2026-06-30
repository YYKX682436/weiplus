package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class g3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 f255428d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var) {
        super(1);
        this.f255428d = q3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kk4.b player;
        kk4.b player2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3 q3Var = this.f255428d;
        q3Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onUserToggleMute: newMuted=");
        sb6.append(booleanValue);
        sb6.append(", hasVideo=");
        sb6.append(q3Var.M != null);
        sb6.append(", isLivePhoto=");
        mj4.h hVar = q3Var.A;
        sb6.append(hVar != null ? java.lang.Boolean.valueOf(((mj4.k) hVar).x()) : null);
        sb6.append(", thirdBack=");
        al5.a0 a0Var = q3Var.B1;
        sb6.append(a0Var != null ? a0Var.getClass().getSimpleName() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q3Var.f255723e, sb6.toString());
        q3Var.Z = !booleanValue;
        if (booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc78 = q3Var.M;
            if (c18690x34c5bc78 != null && (player2 = c18690x34c5bc78.getPlayer()) != null) {
                ((kk4.v) player2).C(true);
            }
            q3Var.G();
        } else {
            q3Var.J();
            mj4.h hVar2 = q3Var.A;
            if (hVar2 != null && ((mj4.k) hVar2).x()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18690x34c5bc78 c18690x34c5bc782 = q3Var.M;
                com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.nd ndVar = q3Var.f255733p0;
                ndVar.getClass();
                if (c18690x34c5bc782 != null && (player = c18690x34c5bc782.getPlayer()) != null) {
                    ndVar.f255663b = false;
                    kk4.v vVar = (kk4.v) player;
                    vVar.A(false);
                    android.widget.FrameLayout frameLayout = q3Var.B;
                    if (frameLayout != null) {
                        frameLayout.setAlpha(0.0f);
                    }
                    kk4.b.f(player, 0, false, null, 6, null);
                    vVar.O();
                }
            }
        }
        al5.a0 a0Var2 = q3Var.B1;
        if (a0Var2 != null) {
            a0Var2.a(booleanValue);
        }
        return jz5.f0.f384359a;
    }
}
