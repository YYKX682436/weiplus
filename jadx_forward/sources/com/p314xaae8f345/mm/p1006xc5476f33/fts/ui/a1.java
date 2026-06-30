package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class a1 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 f219545d;

    public a1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        this.f219545d = abstractActivityC15595x3a75f78;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219545d;
        z21.e eVar = abstractActivityC15595x3a75f78.S;
        if (eVar == null) {
            return true;
        }
        int mo48281x67ad3875 = eVar.mo48281x67ad3875();
        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = abstractActivityC15595x3a75f78.f219455o;
        if (c21330xc127fb4d != null && c21330xc127fb4d.getVisibility() == 0) {
            abstractActivityC15595x3a75f78.f219455o.i(mo48281x67ad3875);
        }
        return true;
    }
}
