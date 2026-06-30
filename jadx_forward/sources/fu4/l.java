package fu4;

/* loaded from: classes9.dex */
public class l implements d50.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f f348437a;

    public l(fu4.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f fVar) {
        this.f348437a = fVar;
    }

    @Override // d50.o
    public void a() {
        this.f348437a.a();
    }

    @Override // d50.o
    public void b(eu5.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.l.instance.f262904e = (zt5.s) aVar.f338360c;
        this.f348437a.mo11328x57429edc(aVar.f557138a, aVar.f557139b);
    }

    @Override // d50.o
    public void c(int i17, eu5.a aVar) {
        m05.i.f404103a.a("5", "3", java.lang.String.valueOf(aVar.f557138a), aVar.f557139b);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.b(3, aVar.f557138a, 1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.f fVar = this.f348437a;
        if (i17 == 1) {
            if (fVar != null) {
                fVar.mo11328x57429edc(1, "not match");
                return;
            }
            return;
        }
        int i18 = aVar.f557138a;
        if (i18 == 1021 || i18 == 1022) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintAuthManager", "too many trial");
            if (fVar != null) {
                fVar.mo11328x57429edc(3, "too many trial");
                return;
            }
            return;
        }
        if (i18 == 1020 || i18 == 1029) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterFingerprintAuthManager", "user cancelled");
            if (fVar != null) {
                fVar.mo11328x57429edc(4, "user cancelled");
                return;
            }
            return;
        }
        if (i18 == 1012) {
            if (fVar != null) {
                fVar.mo11328x57429edc(8, "no fingerprint enrolled in system");
            }
        } else if (fVar != null) {
            fVar.mo11328x57429edc(2, aVar.f557139b);
        }
    }
}
