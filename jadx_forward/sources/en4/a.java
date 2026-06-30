package en4;

/* loaded from: classes8.dex */
public final class a extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f336868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f336868d = true;
    }

    public final void T6() {
        j75.f Ai;
        if (this.f336868d) {
            return;
        }
        ((ra0.v) i95.n0.c(ra0.v.class)).getClass();
        if (((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).wi()) {
            int i17 = ra0.y.f475014g1;
            ra0.y Di = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
            if (Di != null && (Ai = ((en3.l0) Di).Ai()) != null) {
                Ai.B3(new sa0.d());
            }
        }
        this.f336868d = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        if (!wm4.u.q()) {
            this.f336868d = false;
        } else {
            final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
            new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p1006xc5476f33.p1385x5c6729a.C13408x4db453f8>(m158354x19263085) { // from class: com.tencent.mm.plugin.topstory.ui.uic.TopStoryClearRedDotUIC$onCreate$1
                {
                    this.f39173x3fe91575 = 1309741231;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p1006xc5476f33.p1385x5c6729a.C13408x4db453f8 c13408x4db453f8) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1385x5c6729a.C13408x4db453f8 event = c13408x4db453f8;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    en4.a.this.T6();
                    return false;
                }
            }.mo48813x58998cd();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        T6();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (wm4.u.q()) {
            this.f336868d = false;
        }
    }
}
