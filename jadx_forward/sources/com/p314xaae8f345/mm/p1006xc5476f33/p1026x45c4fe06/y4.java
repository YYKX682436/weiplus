package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class y4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af f173943d;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af) {
        this.f173943d = c11527x5889d9af;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11527x5889d9af c11527x5889d9af = this.f173943d;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 mo48805xd384d23c = c11527x5889d9af.mo48805xd384d23c();
            if (mo48805xd384d23c != null) {
                c11527x5889d9af.V(mo48805xd384d23c, true);
                c11527x5889d9af.W(mo48805xd384d23c);
                mo48805xd384d23c.i0();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandRuntimeContainer", e17, "doOnResume e=%s", e17);
            c11527x5889d9af.U(e17);
        }
    }
}
