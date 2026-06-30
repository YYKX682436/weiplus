package kp4;

/* loaded from: classes10.dex */
public final class w0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 f392686a;

    public w0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0) {
        this.f392686a = c18814xdf4aba0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1
    public void a(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0 = this.f392686a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0.a(c18814xdf4aba0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18814xdf4aba0.f257587d, "onMove: " + z17 + ", " + c18814xdf4aba0.f257596p + ", " + c18814xdf4aba0.f257597q);
        kp4.t0 callback = c18814xdf4aba0.getCallback();
        if (callback != null) {
            callback.a(c18814xdf4aba0.f257596p, c18814xdf4aba0.f257597q);
        }
        if (z17) {
            kp4.t0 callback2 = c18814xdf4aba0.getCallback();
            if (callback2 != null) {
                callback2.mo10994xc9fc1b13(c18814xdf4aba0.f257596p);
            }
            c18814xdf4aba0.m72661x3ae760af(c18814xdf4aba0.f257596p);
            return;
        }
        kp4.t0 callback3 = c18814xdf4aba0.getCallback();
        if (callback3 != null) {
            callback3.mo10994xc9fc1b13(c18814xdf4aba0.f257597q);
        }
        c18814xdf4aba0.m72661x3ae760af(c18814xdf4aba0.f257597q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1
    public void b(boolean z17) {
        kp4.t0 callback = this.f392686a.getCallback();
        if (callback != null) {
            callback.mo10993x65825f6();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.k1
    public void c(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0 c18814xdf4aba0 = this.f392686a;
        c18814xdf4aba0.m72658x7e29ec9(c18814xdf4aba0.getCutCnt() + 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18814xdf4aba0.a(c18814xdf4aba0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c18814xdf4aba0.f257587d, "onScrollStateChanged: " + c18814xdf4aba0.f257596p + ", " + c18814xdf4aba0.f257597q);
        kp4.t0 callback = c18814xdf4aba0.getCallback();
        if (callback != null) {
            callback.b(c18814xdf4aba0.f257596p, c18814xdf4aba0.f257597q);
        }
    }
}
