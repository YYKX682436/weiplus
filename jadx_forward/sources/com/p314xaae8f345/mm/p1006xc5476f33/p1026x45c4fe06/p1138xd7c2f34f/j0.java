package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f166212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12329x5651dcf f166213e;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12329x5651dcf c12329x5651dcf) {
        this.f166212d = o6Var;
        this.f166213e = c12329x5651dcf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f166212d.C0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12329x5651dcf c12329x5651dcf = this.f166213e;
        ne1.j state = c12329x5651dcf.f165893g;
        java.lang.String pluginAppId = c12329x5651dcf.f165894h;
        int i17 = c12329x5651dcf.f165895i;
        java.lang.String str = c12329x5651dcf.f165896m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAppId, "pluginAppId");
        if (C0 == null) {
            return;
        }
        ne1.g gVar = new ne1.g();
        gVar.s("pluginAppid", pluginAppId);
        gVar.s("state", state.f418058d);
        gVar.s("appVersion", java.lang.Integer.valueOf(i17));
        gVar.s("customVersion", str);
        gVar.u(C0);
        gVar.m();
    }
}
