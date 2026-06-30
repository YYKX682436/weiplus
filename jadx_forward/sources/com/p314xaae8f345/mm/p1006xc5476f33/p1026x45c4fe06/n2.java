package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class n2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f167553a;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2) {
        this.f167553a = c11510xdd90c2f2;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.u0
    public void R() {
        if (this.f167553a.C.getAndSet(false)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f167553a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime", "onServiceReconnected: %s", c11510xdd90c2f2.f156336n);
            if (!c11510xdd90c2f2.J0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandRuntime", "Main Process Restarted, start prepare again");
                c11510xdd90c2f2.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.i2(c11510xdd90c2f2));
                return;
            }
            c11510xdd90c2f2.t1();
            java.lang.String str = c11510xdd90c2f2.f156336n;
            java.util.Iterator it = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.f173899a;
            if (android.text.TextUtils.isEmpty(str)) {
                return;
            }
            java.util.Iterator c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.c(str);
            while (c17.hasNext()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0) c17.next()).f();
            }
        }
    }
}
