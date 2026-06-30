package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

/* renamed from: com.tencent.mm.plugin.profile.ui.CommonChatroomInfoUI */
/* loaded from: classes11.dex */
public class ActivityC16839xcb4450c0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 {
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 C;
    public hr3.u0 D;
    public hr3.w0 E;

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.a5 Z6() {
        if (this.D == null) {
            this.D = new hr3.u0(this, this.A, this.C);
        }
        return this.D;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public com.p314xaae8f345.mm.ui.p2690x38b72420.o4 a7() {
        if (this.E == null) {
            this.E = new hr3.w0(this, this.A, this.C);
        }
        return this.E;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public java.lang.String g7() {
        int i17 = this.C.I;
        return i17 == 1 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcy) : i17 == 2 ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.bcx) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572491bd2);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0 c0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c0) this.f287979d.getAdapter().getItem(i17);
        if (c0Var != null) {
            if ((com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(c0Var.B.d1()) || com.p314xaae8f345.mm.p2621x8fb0427b.z3.n4(c0Var.B.d1())) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.GlobalWeCom.k(view.getContext(), null)) {
                return;
            }
            j45.l.u(this, ".ui.chatting.ChattingUI", new android.content.Intent().putExtra("Chat_User", c0Var.B.d1()).putExtra("finish_direct", true), null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        hr3.u0 u0Var = this.D;
        u0Var.getClass();
        p13.u uVar = new p13.u();
        uVar.f432674c = u0Var.f365570n.d1();
        uVar.f432684m = u0Var;
        uVar.f432685n = u0Var.f365571o;
        uVar.f432673b = 6;
        uVar.f432683l = new hr3.t0(null);
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public void j7() {
        super.j7();
        this.C = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(getIntent().getStringExtra("Select_Talker_Name"), true);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean l7() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47
    public boolean m7() {
        return false;
    }
}
