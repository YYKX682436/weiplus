package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes16.dex */
public final class q1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j f237840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f237841b;

    public q1(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j jVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f237840a = jVar;
        this.f237841b = y1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h2
    /* renamed from: onDismiss */
    public final void mo51018xb349b3ab() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j jVar = this.f237840a;
        if (jVar.f237795b != this.f237841b) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicClipDialog", "onDialogDismissed");
        if (jVar.f237805l) {
            yz5.l lVar = jVar.f237802i;
            if (lVar != null) {
                lVar.mo146xb9724478(null);
            }
            jVar.f237805l = false;
        }
        jVar.f237795b = null;
        jVar.f237799f = null;
        jVar.f237800g = null;
        jVar.f237801h = null;
    }
}
