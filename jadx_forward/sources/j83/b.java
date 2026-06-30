package j83;

/* loaded from: classes14.dex */
public final class b extends xm1.i {

    /* renamed from: k, reason: collision with root package name */
    public j83.a f379693k;

    /* renamed from: l, reason: collision with root package name */
    public final l83.c f379694l;

    /* renamed from: m, reason: collision with root package name */
    public final l83.h f379695m;

    /* renamed from: n, reason: collision with root package name */
    public final fp.e f379696n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f379697o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f379698p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f379699q;

    public b() {
        fp.e eVar = new fp.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f379696n = eVar;
        i();
        eVar.b();
        this.f379694l = new l83.c(this);
        this.f379695m = new l83.h();
        ym1.f.f544667h.h(this, "ipcall");
    }

    @Override // xm1.h, cv.y0
    public void a(boolean z17) {
        l83.c cVar = this.f379694l;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAudioPlayer", "setSpeakerPhoneOn, old isSpeakerPhoneOn: %b, new isSpeakerPhoneOn: %b", java.lang.Boolean.valueOf(cVar.f398626d), java.lang.Boolean.valueOf(z17));
            cVar.f398627e.A(z17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.C18912x54425f62 c18912x54425f62 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406250a;
            int C = z17 ? c18912x54425f62.C(401) : c18912x54425f62.C(402);
            if (C < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallEngineManager", "setSpeakerPhoneOn, failed, ret: %d", java.lang.Integer.valueOf(C));
            }
            if (z17 != cVar.f398626d) {
                cVar.f398626d = z17;
                com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = cVar.f398623a;
                if (eVar != null && eVar.f257971a) {
                    eVar.j(z17);
                }
            }
        }
        this.f379697o = n();
    }

    @Override // xm1.h
    public void o(int i17) {
        j83.a aVar;
        j83.a aVar2;
        j83.a aVar3;
        j83.a aVar4;
        super.o(i17);
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 7:
                if (m(3) || (aVar = this.f379693k) == null) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) aVar).d(false);
                return;
            case 2:
                if (!ym1.f.f544667h.i() || (aVar2 = this.f379693k) == null || aVar2 == null) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) aVar2).d(true);
                return;
            case 4:
            case 5:
            default:
                return;
            case 8:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAudioManager", "onHeadsetPlug connected");
                if (m(4) || (aVar3 = this.f379693k) == null) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) aVar3).e(true);
                return;
            case 9:
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallAudioManager", "onHeadsetPlug disconnect");
                if (m(4) || (aVar4 = this.f379693k) == null) {
                    return;
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.l6) aVar4).e(false);
                return;
        }
    }
}
