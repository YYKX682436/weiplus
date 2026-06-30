package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public final class u0 implements ev3.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 f237849d;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 b1Var) {
        this.f237849d = b1Var;
    }

    @Override // ev3.c
    public void J(int i17, java.lang.String musicKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 b1Var = this.f237849d;
        dv3.c cVar = b1Var.f237713u;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.w.f481950a);
        }
        dv3.c cVar2 = b1Var.f237713u;
        if (cVar2 == null) {
            return;
        }
        cVar2.S0("");
    }

    @Override // ev3.c
    public void L(int i17, java.lang.String musicKey, cw3.g mode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        dv3.c cVar = this.f237849d.f237713u;
        if (cVar != null) {
            cVar.V0(musicKey, new rv3.u(mode));
        }
    }

    @Override // ev3.c
    public void S(int i17, java.lang.String musicKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        dv3.c cVar = this.f237849d.f237713u;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.x.f481951a);
        }
    }

    @Override // ev3.c
    public void q(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info, boolean z17, rv3.v musicPlayStatus) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicPlayStatus, "musicPlayStatus");
        dv3.c cVar = this.f237849d.f237713u;
        if (cVar != null) {
            cVar.U0(info, z17);
        }
    }

    @Override // ev3.c
    public void y(int i17, java.lang.String musicKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicKey, "musicKey");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b1 b1Var = this.f237849d;
        dv3.c cVar = b1Var.f237713u;
        if (cVar != null) {
            cVar.V0(musicKey, rv3.y.f481952a);
        }
        dv3.c cVar2 = b1Var.f237713u;
        if (cVar2 != null) {
            cVar2.S0(musicKey);
        }
        b1Var.f237718z++;
    }
}
